
package SaudeMaisOuMenos;
/**
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class FileHelper {
    public static void salvar(Object obj, String filepath) {
        try {
            FileOutputStream  fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(obj);
            System.out.println("Objeto salvo com sucesso!");
            objectOut.close(); 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    } 
    
    public static Object recuperar(String filepath) {
        try { 
            File f = new File(filepath);
            if(f.exists()){
                FileInputStream fileIn = new FileInputStream(f);
                ObjectInputStream objectIn = new ObjectInputStream(fileIn); 
                Object obj = objectIn.readObject(); 
                System.out.println("Objeto lido com sucesso!");
                objectIn.close();
                System.out.println(obj);
                return obj;
            }else{
                return null;
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }    
}
*/