class main {
    public static void main(String[] args) {
        String a = "Shubham";
        String b = "Shubham";
        String c = new String("Shubham");

        System.out.println(a == c);
        System.out.println(a.charAt(0));                                                 // op : S

        float d = 12.23456f;
        System.out.printf("Floating value of is till 2 decimal is : %.2f",d);           // op : 12.23

        System.out.printf("Value of pie is : %.3f %n", Math.PI);                        //op : 3.142

        System.out.printf("hello my name is %s and I am %s", "Shubham", "Cool");// op : hello my name is Shubham and I am Cool

        System.out.println(("a" + 3));                                                          // op : a3

        System.out.println('a' + 3);                                                            // op : 100

    }
}