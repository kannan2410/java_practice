package string_problems;

import java.util.HashMap;

public class reformatedate {

    public static String formateDate(String date){
        String[] part = date.split(" ");
        String day = part[0];
        String month = part[1];
        String year = part[2];
        HashMap<String,String> map = new HashMap<>();
        map.put("Jan", "01");
        map.put("Feb","02");
        map.put("Mar","03");
        map.put("Apr","04");
        map.put("May","05");
        map.put("Jun","06");
        map.put("Jul","07");
        map.put("Aug","08");
        map.put("Sep","09");
        map.put("Oct","10");
        map.put("Nov","11");
        map.put("Dec","12");
        day = day.substring(0,day.length()-2);
        if(day.length()==1){
            day = "0" + day;
        }
        return year + "-" + map.get(month) + "-"+ day;
        
    }
    public static void main(String[] args){
        String date = "20th Oct 2052";
        System.out.println(formateDate(date));
        
    }
}
