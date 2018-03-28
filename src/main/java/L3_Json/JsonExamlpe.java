package L3_Json;


import com.alibaba.fastjson.JSON;

public class JsonExamlpe {
    public static void main(String[] args) {
        Cat3 cat = new Cat3("Murzic","Vasilevich",4);
        String json = JSON.toJSONString(cat);
        System.out.println(json);

      /*
      https://jsonformatter.curiousconcept.com/
      {"age":4,"name":"Murzic"}
       */
    }

}
