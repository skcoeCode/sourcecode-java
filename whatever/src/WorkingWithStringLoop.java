
public class WorkingWithStringLoop {

    public static void main(String[] args) {
        //exampleSubstring1();
        exampleSubstring2();

    }

    private static void exampleSubstring1() {
        String name = "Skcoe123456(2018)";
        String name1=name;
        for (int i = 0; i < name1.length(); i++) {
            //System.out.println(name.substring(i, i+1));
            name=name1.substring(i, name1.length());
            System.out.println(name.substring(0, 1));
        }
    }
    private static void exampleSubstring2() {
        String name = "Skcoe123456(2018)";
        while ( name.length() > 0) {
            System.out.println(name.substring(0, 1));
            name=name.substring(1);
        }
    }

}
