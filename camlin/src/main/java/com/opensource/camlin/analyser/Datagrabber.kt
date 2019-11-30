package com.opensource.camlin.analyser



class Datagrabber{

    fun getPlatformTrandData() : String{
        val url = "[\n" +
                "  {\n" +
                "    \"chart\": \"//chart.googleapis.com/chart?chf=bg%2Cs%2C00000000&chd=t%3A0.3%2C0.3%2C3.2%2C6.9%2C14.5%2C16.9%2C19.2%2C28.3%2C10.4&chco=c4df9b%2C6fad0c&chl=Gingerbread%7CIce%20Cream%20Sandwich%7CJelly%20Bean%7CKitKat%7CLollipop%7CMarshmallow%7CNougat%7COreo%7CPie&cht=p&chs=500x250\",\n" +
                "    \"data\": [\n" +
                "      {\n" +
                "        \"api\": 10,\n" +
                "        \"name\": \"Gingerbread\",\n" +
                "        \"perc\": \"0.3\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"api\": 15,\n" +
                "        \"name\": \"Ice Cream Sandwich\",\n" +
                "        \"perc\": \"0.3\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"api\": 16,\n" +
                "        \"name\": \"Jelly Bean\",\n" +
                "        \"perc\": \"1.2\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"api\": 17,\n" +
                "        \"name\": \"Jelly Bean\",\n" +
                "        \"perc\": \"1.5\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"api\": 18,\n" +
                "        \"name\": \"Jelly Bean\",\n" +
                "        \"perc\": \"0.5\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"api\": 19,\n" +
                "        \"name\": \"KitKat\",\n" +
                "        \"perc\": \"6.9\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"api\": 21,\n" +
                "        \"name\": \"Lollipop\",\n" +
                "        \"perc\": \"3.0\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"api\": 22,\n" +
                "        \"name\": \"Lollipop\",\n" +
                "        \"perc\": \"11.5\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"api\": 23,\n" +
                "        \"name\": \"Marshmallow\",\n" +
                "        \"perc\": \"16.9\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"api\": 24,\n" +
                "        \"name\": \"Nougat\",\n" +
                "        \"perc\": \"11.4\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"api\": 25,\n" +
                "        \"name\": \"Nougat\",\n" +
                "        \"perc\": \"7.8\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"api\": 26,\n" +
                "        \"name\": \"Oreo\",\n" +
                "        \"perc\": \"12.9\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"api\": 27,\n" +
                "        \"name\": \"Oreo\",\n" +
                "        \"perc\": \"15.4\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"api\": 28,\n" +
                "        \"name\": \"Pie\",\n" +
                "        \"perc\": \"10.4\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "]"

        return url
    }

}