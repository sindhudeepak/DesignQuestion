package factoryOfConverterImp;


import factoryOfConverter.formatCreator;

import javax.json.JsonObject;
import java.util.List;

/**
 * Created by sindhud on 26/11/17.
 */
public class JsonConverterFormatter implements formatCreator {

    @Override
    public void convertToGivenFormat(List<String> input) {
        System.out.println("inside JSON");

        //JsonObject responseDetailsJson = new JsonObject;

//        JSONObject responseDetailsJson = new JSONObject();
//        JSONArray jsonArray = new JSONArray();
//
//        List<Product> cartList = new Vector<Product>(cartMap.keySet().size());
//        for(Product p : cartMap.keySet()) {
//            cartList.add(p);
//            JSONObject formDetailsJson = new JSONObject();
//            formDetailsJson.put("id", "1");
//            formDetailsJson.put("name", "name1");
//            jsonArray.add(formDetailsJson);
//        }
//        responseDetailsJson.put("forms", jsonArray);//Here you can see the data in json format

    }
}
