package L8_Json_test;

import L8_Json_test.entity.Cat8;
import L8_Json_test.entity.Group;
import L8_Json_test.entity.Node;
import L8_Json_test.entity.User;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.ArrayList;

public class JsonExample {
    public static void main(String[] args) {
        ArrayList<Node<User>> nodes = new ArrayList();
        nodes.add(new Node<User>(
                new User("user1", User.Gender.female, 40),
                         "text"));
        nodes.add(new Node<User>(
                new User("user2", User.Gender.male, 10),
                        "text2"));
        nodes.add(new Node<User>(
                new User("user3", User.Gender.male, 100),
                "text3"));

      //  Group group = new Group("team", "ky-ky", nodes);

        String json = JSON.toJSONString(nodes);
        System.out.println(json);
        /*
        https://jsoncompare.com/
         */
        Group groupClone =JSON.parseObject(json, Group.class);
        System.out.println(groupClone);
        System.out.println("---------------------");
        ArrayList<Node<Cat8>> nodes2 = new ArrayList();
        nodes2.add(new Node<Cat8>(
                new Cat8("barsik","ivanovich",12),
                "good cat"));
        nodes2.add(new Node<Cat8>(
                new Cat8("murzik","ivanovich",12),
                "good cat"));
        nodes2.add(new Node<Cat8>(
                new Cat8("trumzik","ivanovich",12),
                "good cat"));

        String json2 = JSON.toJSONString(nodes2);
        System.out.println(json2);
        /*
        https://jsoncompare.com/
         */
        TypeReference<ArrayList<Node>> typeRef = new TypeReference<ArrayList<Node>>() {};
        ArrayList<Node> modelList = JSON.parseObject(json2, typeRef);
    }
}
