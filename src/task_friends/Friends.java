package task_friends;

import java.util.ArrayList;
import java.util.Collections;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();

        friends.add(0,"Rachel");
        friends.add(1,"Monica");
        friends.add(2,"Phoebe");
        friends.add(3,"Joey");
        friends.add(4,"Chandler");
        friends.add(5,"Ross");

        System.out.println(friends);

        Collections.sort(friends);

        System.out.println(friends);
    }
}
