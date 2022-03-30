import java.util.HashMap;

public class Map {

    public static void main(String[] args) {

        java.util.Map<String, String> emailList = new HashMap<>();
        emailList.put("Edu","edu_vieira@hotmail.com");
        emailList.put("Josh","josh.Rad@gmail.com");
        emailList.put("Mary", "m_poppins82@yahoo.ca");
        System.out.println(emailList);
        System.out.println(emailList.size() + " people on your list");
        System.out.println(emailList.get("Edu"));

        String removed = emailList.remove("Josh");
        System.out.println("");
        System.out.println(emailList);
        System.out.println(removed + " is no longer welcome.");

        System.out.println("");

        if (emailList.containsKey("Mary")){
            System.out.println(emailList.get("Mary") + " is on the list");
        }
        System.out.println("");
        emailList.clear();

        if (emailList.isEmpty()){
            System.out.println("Party is over");
        }
    }
}
