package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.apache.logging.log4j.Logger;
////import org.apache.logging.log4j.LogManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
@Controller
public class ResultController {
//    private static final Logger logger = LogManager.getLogger(ResultController.class);
private static Log logger = LogFactory.getLog(ResultController.class);
    @RequestMapping("/test03-1")
    @ResponseBody
    public String test031() {
        logger.info("Processing request to say hello");
        return "result";
    }
}
