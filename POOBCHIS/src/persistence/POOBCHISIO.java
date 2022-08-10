package persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import domain.*;
public class POOBCHISIO {
    public static void save( File file, Board a) throws POOBCHISException {
        try{
            ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream( file ) );
            out.writeObject(a);
            out.close();

        }
        catch( Exception e){
            throw new POOBCHISException("Ocurrio un error a save "+file.getName());
        }
    }
    public static void saveO1( File file, Board a) throws POOBCHISException {
        if ( file.getName().endsWith(".dat")){
            save(file,a);
        }
        else{
            throw new POOBCHISException(POOBCHISException.EXTENSION_ARCHIVO_NO_VALIDO);
        }
    }

    public static Board abrir( File file ) throws POOBCHISException {
            try{
                ObjectInputStream in = new ObjectInputStream( new FileInputStream(file));
                Board a = (Board)in.readObject();
                in.close();
                return a;

    }catch( Exception e){
        System.out.println(e);
        throw new POOBCHISException("Ocurrio un error al Abrir "+file.getName());
        }
    }


    public static Board abrirO1( File file ) throws POOBCHISException {
        if ( file.getName().endsWith(".dat")){
            return abrir( file );
        }
        else{
            throw new POOBCHISException(POOBCHISException.EXTENSION_ARCHIVO_NO_VALIDO);
        }
    }
}
