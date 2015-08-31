public class CalendarPrinter
{
    public static void main(String[] args) {
        int x = 1;
        String n = "";
        while (x<31){
            if (x==5||x==6||x==12||x==13||x==19||x==20||x==26||x==27){
                n= "- Weekend";
            };
            if(x==7){
                n = (" - No School (Labor Day)");
            };
            if(x==25){
                n= (" -No School End of Marking Period");
            };
        System.out.println("September " + x + n);
        n="";
        x++;
        }
    }
}