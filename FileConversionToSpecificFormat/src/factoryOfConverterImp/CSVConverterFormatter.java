package factoryOfConverterImp;

import factoryOfConverter.formatCreator;

import java.util.List;

/**
 * Created by sindhud on 26/11/17.
 */
public class CSVConverterFormatter implements formatCreator {
    @Override
    public void convertToGivenFormat(List<String> input) {
        System.out.println("inside CSV");
    }
}
