import framework.MapKihonBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapKihon extends MapKihonBase {

    @Override
    protected Map<String, String> createMapOfStringToString() {

        return new HashMap<String, String>();
    }

    @Override
    protected void addKeyAndValueToMap(Map<String, String> inputMap, String key, String value) {
        inputMap.put(key, value);
    }

    @Override
    protected String getTheValueAtThisKey(Map<String, String> inputMap, String key) {
       return inputMap.get(key);
    }

    @Override
    protected boolean doesMapContainKey(Map<String, String> inputMap, String input) {
       return inputMap.containsKey(input);
    }

    @Override
    protected void removeKeyFromMap(Map<String, String> inputMap, String key) {
        inputMap.remove(key);
    }

    @Override
    protected int countUniqueWordsInList(List<String> words) {
        //var map = new HashMap<String, String>();
        //for(var word:inputwords){
           // map.put(word,word)
        //return map.keySet().size();=> duplicated word will overwrite the original one
        //}
       return (int) words.stream().distinct().count();
    }

}
