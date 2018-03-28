package L2_json;

import com.alibaba.fastjson.JSON;

public class JsonExamlpe {
    public static void main(String[] args) {
        Cat2 cat = new Cat2("Murzic",4);
        String json = JSON.toJSONString(cat);
        System.out.println( json);
    }
    //com.alibaba.fastjson.JSON;
}
