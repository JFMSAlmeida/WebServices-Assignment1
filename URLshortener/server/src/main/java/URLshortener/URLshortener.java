package URLshortener;

import java.util.HashMap;
import java.util.Set;

public class URLshortener {
    private static URLshortener ourInstance = new URLshortener();

    public static URLshortener getInstance() {
        return ourInstance;
    }

    private HashMap<Integer,String> _mapper = new HashMap<Integer, String>();
    private int _counter = 0;
    private String _regexPattern = "(http:\\/\\/|https:\\/\\/)?(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.[a-z]{3}.?([a-z]+)?";

    private URLshortener() {
    }

    public int addUrl(String url){
        if(url.matches(_regexPattern) && !_mapper.containsValue(url)) {
            _mapper.put(_counter, url);
            return _counter++;
        }
        else
            return -1;
    }

    public int addId(int id){
        if(!_mapper.containsKey(id)) {
            _mapper.put(id, "");
            return 1;
        }
        else
            return -1;
    }

    public String getURLByID(int id){
        return _mapper.get(id) == null ? null : _mapper.get(id);
    }

    public int deleteId(int id){
        if(_mapper.remove(id) == null)
            return -1;
        else
            return 1;
    }

    public Set<Integer> getIDs(){
        return _mapper.keySet();
    }

    public void deleteAll(){
        _mapper.clear();
    }
}
