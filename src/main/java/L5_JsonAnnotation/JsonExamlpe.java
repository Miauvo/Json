package L5_JsonAnnotation;

import com.alibaba.fastjson.JSON;

public class JsonExamlpe {

    static String serializeObject(Cat5 cat){
        String json = JSON.toJSONString(cat);
        System.out.println(json);
        return json;
    }

    static Cat5 deserializeObject(String json){
    Cat5 cat =   JSON.parseObject(json, Cat5.class);
     return cat;
    }

    public static void main(String[] args) {

       String json = serializeObject(
               new Cat5("Murzic",
                       "Vasilevich",
                       4));

       Cat5 cat = deserializeObject(json);
       System.out.println(""+cat);

       /*
       http://www.baeldung.com/jackson-annotations
        */


    }

}
