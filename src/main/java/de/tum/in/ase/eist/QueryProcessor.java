package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Mykhailo Riabets";
        } else if (query.contains("number")){
            String tmp = query.replaceAll("%20", "");
            tmp = query.replaceAll(" ", "");
            String formatted[] = tmp.split(":");
            String numbers[] = formatted[2].split(",");
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < numbers.length; i++) {
                int num = Integer.parseInt(numbers[i]);
                max = max < num ? num : max;
            }
            return Integer.toString(max);
        } else if (query.contains("plus")){
            return "";
        } else{
            return "";
        }
    }
}
