package Lab3.task2;

import java.io.IOException;

public class Main {
    public static void main(final String[] args) {
        try(final Resource file = new Resource("resource")){
            System.out.println(file);
            file.read();
        }catch (IOException e){
            System.err.println("Can't read file");
        }
    }
}
