package Fundamental;

public class StringObject {

    public static void main(String[] args) {
        String str = new String("Ravi");//create 2 objects 1.-> in heap and 2.->in SCP
        String str1 = new String("RaviGupta");//create 2 objects 1.-> in heap and 2.->in SCP

        String str2 = "Rani";//create one object in SCP

        String str3 = "Ravi";//this won't create any object as this will provide the reference of str from SCP.



    }
}
