package oh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import oh.test.model.TestDAO;
import oh.test.model.TestDTO;

@Controller
public class TestController {
	
	@Autowired
	TestDAO testDao;
	
	@RequestMapping("/test.do")
	public String test() {
		return "test/test";
	}
	//test
	@RequestMapping("test2.do")
	public String test2(){
		return "test/test2";
	}
	
	@RequestMapping("/empAdd.do")
	public ModelAndView empInsert(TestDTO dto) {
		
		int result = testDao.add(dto);
		String msg = result>0? "등록 성공!":"등록 실패!";
		
		ModelAndView mav = new ModelAndView("test/testMsg", "msg", msg);
		return mav;
	}
}
