package L7_Json;

import L7_Json.entity.Group;
import L7_Json.entity.User;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;

public class JsonExample {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList();
        users.add(new User("user1", User.Gender.female, 40));
        users.add(new User("user2", User.Gender.male, 10));
        users.add(new User("user3", User.Gender.male, 100));

        Group group = new Group ("team", "ky-ky",users);

        String json = JSON.toJSONString(group);
        System.out.println(json);
        /*
        https://jsoncompare.com/
         */
        Group groupClone =JSON.parseObject(json, Group.class);
        System.out.println(groupClone);
    }
}
