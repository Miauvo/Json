package L4_JsonDecode;

import com.alibaba.fastjson.JSON;


public class JsonExamlpe {

    static String serializeObject(Cat4 cat){
        String json = JSON.toJSONString(cat);
        System.out.println(json);
        return json;
    }

    static Cat4 deserializeObject(String json){
     Cat4 cat =   JSON.parseObject(json, Cat4.class);
     return cat;
    }

    public static void main(String[] args) {

       String json = serializeObject(
               new Cat4("Murzic",
                       "Vasilevich",
                       4));

       Cat4 cat = deserializeObject(json);
       System.out.println("/n"+cat);
    }

}
