public class Ch_string_ps1 {
    public static void main(String[] args) {
//        Problem1 -> use toLowerCase method
        String name = "kunal Lohaniya";
        name = name.toLowerCase();
        System.out.println("TLC: "+name);

//        Problem 2 -> use replace method
        String text = "kunal lohaniya";
        text = text.replace("lohaniya","Prajapati");
        System.out.println("replace name in sentence : "+ text);

//      Problem 3 -> replace <|name|> with any name
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("name","rajesh");
        System.out.println("replaced name: "+letter);

//        Problem 4 -> checking double, triple space
        String myString = "This string   contains double and triple spaces";
        System.out.println(+myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

//        problem 5 -> Escape Sequence Character
        String myBio = "Kunal,\nCurrently Working as a Software Developer.\nThank You";
        System.out.println("ESC: "+myBio);

//        Problem 6 -> string concatination - using concat() method
        String name_ = "Shree";
        name_ = name_.concat(" Ram");
        System.out.println("String Concat: "+name_);

//        using "+" operator
        String s1 = "Rahul";
        String s2 = "jain";
        String result = s1+" "+s2;
        System.out.println("Using + Operator: "+result);

//        using StringBuffer (threat safe)
        StringBuffer sbf = new StringBuffer();
        sbf.append(s1);
        sbf.append(" ");
        sbf.append(s2);
        String result2 = sbf.toString();
        System.out.println("String Buffer: "+ result2);

//        using stringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.append(" ");
        sb.append(s2);
        String result3 = sb.toString();
        System.out.println("String builder: " + result3);
    }
}
