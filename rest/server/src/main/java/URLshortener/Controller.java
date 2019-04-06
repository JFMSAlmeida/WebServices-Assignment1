package URLshortener;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<Set<Integer>> get() {
        return new ResponseEntity<>(URLshortener.getInstance().getIDs(), HttpStatus.OK); //status response code = 200
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public ResponseEntity<?> delete() {
        URLshortener.getInstance().deleteAll();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT); //status response code = 204
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<String>  post(@RequestParam(value="url") String url) {
        int id = URLshortener.getInstance().addUrl(url);
        if(id != -1) {
            String idToString = Integer.toString(id);
            return new ResponseEntity<>(idToString, HttpStatus.OK); //status response code = 200
        }
        else
            return new ResponseEntity<>("error", HttpStatus.BAD_REQUEST); //status response code = 400
    }

    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public ResponseEntity<String> getUrl(@RequestParam(value="id") Integer id) {
        String url = URLshortener.getInstance().getURLByID(id);
        if(url != null)
            return new ResponseEntity<>(url, HttpStatus.MOVED_PERMANENTLY); //status response code = 301
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); //status response code = 404
    }

    @RequestMapping(value = "/id", method = RequestMethod.PUT)
    public ResponseEntity<?> putId(@RequestParam(value="id") Integer id) {
        int flag = URLshortener.getInstance().addId(id);
        if(flag != -1)
            return new ResponseEntity<>(HttpStatus.OK); //status response code = 301
        else
            return new ResponseEntity<>("error", HttpStatus.BAD_REQUEST); //status response code = 400
        //404 NOT FOUND in a PUT request???
    }

    @RequestMapping(value = "/id", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteId(@RequestParam(value="id") Integer id) {
        int flag = URLshortener.getInstance().deleteId(id);
        if(flag != -1)
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); //status response code = 204
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); //status response code = 404
    }
}