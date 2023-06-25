import java.util.HashSet;
import Notebooks.Notebook;



public class App {
    public static void main(String[] args) throws Exception {
       Notebook asus = new Notebook("Asus", "FX", 15.6, "Linyx", 256, 16, 1);
       Notebook samsung=new Notebook("Samsung", "AS", 17.1, "Windows", 1024, 32, 2);
       

      

       HashSet<Notebook> noteSet = new HashSet<Notebook>();
       noteSet.add(asus);
       noteSet.add(samsung);

       System.out.println(asus);
       System.out.println(samsung);

       System.out.println(noteSet.equals(asus));
       System.out.println(noteSet.contains(samsung));
    }
}
