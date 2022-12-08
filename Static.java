public class Static {
    int id;
    String name;
    static String college = "HNGU";

    Static(int i, String n){
        id = i;
        name = n;

    }
    void res(){
        System.out.println(id + " " + name + " " + college);
    }
    public static void main(String[] args) {
        
        Static s1 = new Static(1, "Ravi Vaghela");
        Static s2 = new Static(2, "Deipak Parmar");
        s1.res();
        s2.res();
    }
}
