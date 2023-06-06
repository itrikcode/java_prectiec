import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class CustomClassLoader extends ClassLoader {
    private final Path classPath;
    public CustomClassLoader(Path classPath){
        this.classPath=classPath;
    }
   
    public Class<?> loadClass(String name)throws ClassNotFoundException{
       try {
        byte[] classBytes= loadClassBytes(name);
        return defineClass(name, classBytes,0,classBytes.length);
    } catch (IOException e) {
        e.printStackTrace();
    }
    return null;
    }
    

    private byte[] loadClassBytes(String name) throws IOException{
       String finalName = name.replace('.','/')+".class";
     Path filePath=   classPath.resolve(finalName);
     return Files.readAllBytes(filePath);
    }
}

public class TestT1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Path classPath = Path.of("F:/java_prectiec/");
CustomClassLoader customClassLoader = new CustomClassLoader(classPath);
Class<?> myClass = customClassLoader.loadClass("test");
//System.out.println("Test "+myClass.getName());
        
    }
}
