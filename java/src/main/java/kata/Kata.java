package kata;

import java.util.HashMap;

public class Kata {
    public int increment(int number) {
        return number + 1;
    }

    public String interpolate(String str, HashMap<String, String> map){


        String[] strSplit = str.split(" " );
        for(String s : strSplit){
            if(s.startsWith("$") && s.endsWith("$")){
                //Optional class perhaps use this.
                str = str.replace(s, map.get(s.replace("$", "")));
            }
        }
//        String strRemovedDollars = str.replace("$", "");
//
//
//
//        if(!map.isEmpty() && map.get(strRemovedDollars) != null){
//            return map.get(strRemovedDollars);
//        }

        return str;
    }
}
