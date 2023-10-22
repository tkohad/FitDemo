public class Testmain {


    public static void main(String[] args) {
        String st1=new String("jaya");
        String st2="jaya";
        String str3="jaya";

        System.out.println(st1==st2);
        System.out.println(st1.hashCode());
       // System.out.println(st3.hashCode());
        System.out.println(st1.equals(st2));
        
        Integer test=new Integer(10);
        Float floatValue=new Float(10.4);
        System.out.println(floatValue.intValue());
        int i=10;

        test.floatValue();

    }


}
