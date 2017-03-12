package inwoners;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class WebServiceTester {
    private Client client;
    private String REST_SERVICE_URL = "http://localhost:8080/InwonersFinal-1.0-SNAPSHOT/services/Wijk";
    private static final String SUCCESS_RESULT = "<result>success</result>";
    private static final String PASS = "pass";
    private static final String FAIL = "fail";

    private void init() {
        this.client = ClientBuilder.newClient();
    }

    public static void main(String[] args) {
        WebServiceTester tester = new WebServiceTester();
        //initialize the tester
        tester.init();
        //test get user Web Service Method
        tester.testGetWijk();
    }


    private void testGetWijk() {
        Wijk wijk = new WijkSoapBindingImpl();
        Result r = new Result(6470);
        Result x = client
                .target(REST_SERVICE_URL)
                .resolveTemplate("wijk", "Amsterdam Bijlmer Arena")
                .resolveTemplate("jaar", 2017)
                .request(MediaType.APPLICATION_XML)
                .get(Result.class);
        String result = FAIL;
        if (x != null && x.getNum() == r.getNum()) {
            result = PASS;
        }
        System.out.println("Test case name: testGetWijk, Result: " + result);
    }

    private class Result {
        private int num;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public Result(int num) {

            this.num = num;
        }
    }
}