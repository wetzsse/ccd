import java.net.URL;
import java.net.URLClassLoader;

public class MyClass {
    public static void main(String[] args) throws Exception {
        URL url = MyClass.class.getResource(".");
        ClassLoader parent = System.class.getClassLoader();
        try (URLClassLoader newLoader =
                     new URLClassLoader(new URL[]{url}, parent)) {
            Class<?> anotherMyClass = newLoader.loadClass("MyClass");
            Object o = anotherMyClass.getConstructor().newInstance();
            System.out.println("Class: " + o.getClass());
            System.out.println("Loader: " + o.getClass().getClassLoader());
            System.out.println("Instance of: " + (o instanceof MyClass));
            MyClass cls = (MyClass) o;
        }
    }
}
