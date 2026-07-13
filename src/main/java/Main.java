public class Main {

    public static void main(String[] args) {
          RWOnly obj = new RWOnly();
          //System.out.println(obj.name);
        //Error-> java: name has private access in RWOnly
        obj.setName("Bhumi");
        System.out.println(obj.getName());
    }
}
