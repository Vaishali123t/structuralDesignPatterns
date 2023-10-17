package AdapterPattern.DataFormatsToXML;

public class XMLToJSONAdapter implements IAnalyticsTool{

    JSONAnalyticsTool jsonAnalyticsTool; // has-a adaptee

    XMLToJSONAdapter(String xmlData){
        System.out.println("Converting the XML Data '" + xmlData + "' to JSON Data!");
        String newData = xmlData + " in json";
        jsonAnalyticsTool = new JSONAnalyticsTool();
        jsonAnalyticsTool.setJsonData(newData);
    }

    @Override
    public void analyzeData() {
        jsonAnalyticsTool.AnalyzeData();
    }
}
