package AdapterPattern.DataFormatsToXML;

public class Client {

    public static void main(String[] args) {
        String xmlData = "Sample Data";
        JSONAnalyticsTool tool1 = new JSONAnalyticsTool();
        tool1.setJsonData(xmlData);
        tool1.AnalyzeData();

        System.out.println("----------------------------------------------");

        IAnalyticsTool tool2 = new XMLToJSONAdapter(xmlData);
        tool2.analyzeData();
    }
}
