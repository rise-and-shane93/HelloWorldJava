public class HelloWorld {
    public static void main(String[] args) {
        
        String street = "316 Chumleigh Rd.";
        String city = "Baltimore";
        String state = "MD";
        String zip5 = "21212";
        String mailingAddr = "100 Burke Ave.;Towson;MD;21204";

        mailingAddr = String.join(",",street,city,state,zip5);
        mailingAddr = mailingAddr.replace(",","/");
        System.out.println("Mailing Addres: " + mailingAddr);
        System.out.println("City/State/Zip: " + mailingAddr.substring(mailingAddr.indexOf("/") + 1).replace("/", ""));
    }
}