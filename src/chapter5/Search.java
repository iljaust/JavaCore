package chapter5;

public class Search {
    public static void main(String[] args) {
        int[] nums = {6, 8, 2, 5, 7, 12, 56, 19};
        int val = 5;
        boolean found = false;

        for(int x : nums){
            if(x == val){
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Знaчeниe найдено!");
    }
}
