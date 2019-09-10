package json.parser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import databases.ConnectToSqlDB;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CnnAPI {
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api

      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=YOUR_API_KEY

      MY_API_KEY=0d9e35dfa3c140aab8bf9cdd70df957f

      After getting Json Format of the news, You can go to json validator link: https://jsonlint.com/ to see
      how it can be parsed.

      "articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Who is affected by a shutdown? - CNN Video",
		"description": "CNN's Tom Foreman breaks down who is affected by a federal government partial shutdown.",
		"url": "http://us.cnn.com/videos/politics/2018/12/22/federal-partial-shutdown-by-the-numbers-foreman-ctn-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181202171029-government-shutdown-capitol-file-super-tease.jpg",
		"publishedAt": "2018-12-23T01:09:50.8583193Z",
		"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
	   },{}]

	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

	   You can follow How we implemented in Employee and JsonReaderUtil task.

	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.

     */

    public static void main(String[] args) throws Exception {


        List<String> listOfid = new ArrayList();
        List<String> listOfname = new ArrayList();
        List<String> listOfa = new ArrayList();
        List<String> listOft = new ArrayList();
        List<String> listOfdes = new ArrayList();
        List<String> listOfurl = new ArrayList();
        List<String> listOfurlm = new ArrayList();
        List<String> listOfpub = new ArrayList();
        List<String> listOfcon = new ArrayList();
        Map<String, List<String>> map = new HashMap<>();


        try {
            URL sUrl = new URL("https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=5133d895398a4f0fb198b80c9762d89b");
            URLConnection request = sUrl.openConnection();
            request.connect();

            JsonParser jsonParser = new JsonParser();
            JsonElement root = jsonParser.parse(new InputStreamReader((InputStream) request.getContent()));

            JsonObject jsonObject = new JsonObject();
            jsonObject.add("articles", root);

            JsonArray jsonArray = new JsonArray();
            jsonArray.add(root.getAsJsonObject().get("articles"));


            for (int k = 0; k < jsonArray.get(0).getAsJsonArray().size(); k++) {


                JsonObject jsonobject = jsonArray.get(0).getAsJsonArray().get(k).getAsJsonObject();


                String id = jsonobject.get("source").getAsJsonObject().get("id").toString();
                System.out.print(id);
                listOfid.add(id);

                String name = jsonobject.get("source").getAsJsonObject().get("name").toString();
                System.out.print(name);
                listOfname.add(name);

                String a = jsonobject.get("author").toString();
                System.out.print(a);
                listOfa.add(a);
                String t = jsonobject.get("title").toString();
                System.out.print(t);
                listOft.add(t);
                String des = jsonobject.get("description").toString();
                System.out.print(des);
                listOfdes.add(des);
                String url = jsonobject.get("url").toString();
                System.out.print(url);
                listOfurl.add(url);
                String urlm = jsonobject.get("urlToImage").toString();
                System.out.print(urlm);
                listOfurlm.add(urlm);
                String pub = jsonobject.get("publishedAt").toString();
                System.out.print(pub);
                listOfpub.add(pub);
                String con = jsonobject.get("content").toString();
                System.out.print(con);
                listOfcon.add(con);
                System.out.println();
                map.put("all_id", listOfid);
                map.put("all_name", listOfname);
                map.put("all_author", listOfa);
                map.put("all_title", listOft);
                map.put("all_description", listOfdes);
                map.put("all_url", listOfurl);
                map.put("all_urlImage", listOfurlm);
                map.put("all_publication", listOfpub);
                map.put("all_content", listOfcon);


            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Map.Entry e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        List lst1 = listOfid;
        List lst2 = listOfname;
        List lst3 = listOfa;
        List lst4 = listOft;
        List lst5 = listOfdes;
        List lst6 = listOfurl;
        List lst7 = listOfurlm;
        List lst8 = listOfpub;
        List lst9 = listOfcon;


    }
}
