package formatterFactory;

import factoryOfConverter.formatCreator;
import factoryOfConverterImp.CSVConverterFormatter;
import factoryOfConverterImp.JsonConverterFormatter;
import factoryOfConverterImp.XmlConverterFormatter;

/**
 * Created by sindhud on 26/11/17.
 */
public class FormatterFactory {

    public formatCreator getFormatter(String whichType){
        if(whichType == null)
            return null;
        if(whichType.equalsIgnoreCase("JSON")){
            return new JsonConverterFormatter();

        } else if(whichType.equalsIgnoreCase("XML")){
            return new XmlConverterFormatter();

        } else if(whichType.equalsIgnoreCase("CSV")){
            return new CSVConverterFormatter();
        }

        return null;
    }
}
