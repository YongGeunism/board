package board.web.control.json;

import java.util.HashMap;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("json.boardControl")
@RequestMapping("/json/board")


public class BoardControl {
  static final int PAGE_DEFAULT_SIZE = 3;
  
  @Autowired ServletContext servletContext;

  @RequestMapping("/delete")
  public Object delete(Integer reservationNo ) throws Exception {
    
    HashMap<String,Object> resultMap = new HashMap<>();
    resultMap.put("status", "success");
    
    return resultMap;
  }
  
  @RequestMapping("/update")
  public Object update(Integer reservationNo ) throws Exception {
    
    HashMap<String,Object> resultMap = new HashMap<>();
    resultMap.put("status", "success");
    
    return resultMap;
  }
  
  @RequestMapping(value="/list", method=RequestMethod.POST )
  public Object list(
      @RequestParam(defaultValue="1") int pageNo,
     @RequestParam(defaultValue="3") int pageSize ,String uId, String type, String businessNo, String date) throws Exception {
    if (pageSize <= 0) pageSize = PAGE_DEFAULT_SIZE;

    
    if (pageNo <= 0) pageNo = 1;
    if (pageNo > maxPageNo) pageNo = maxPageNo;
    
    HashMap<String,Object> resultMap = new HashMap<>();
    
    resultMap.put("status", "success");
    resultMap.put("currPageNo", pageNo);
    
    
    
    return resultMap;
  }
  
  @RequestMapping("/view")
  public Object view(Integer reservationNo) throws Exception {
   
   HashMap<String,Object> resultMap = new HashMap<>();
    resultMap.put("status", "success");
    
   return resultMap;
  }
  
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Object addReserv(Board board) {

		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("status", "success");
		return resultMap;
	}
}











