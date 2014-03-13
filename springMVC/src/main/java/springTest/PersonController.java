package springTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import springTest.models.Person;

import java.util.ArrayList;
import java.util.List;

/**Person MVC Controller
 * Created by harsh on 3/3/14.
 */
@Controller
@RequestMapping("/person/")
public class PersonController {
    private static final Logger logger = LoggerFactory
            .getLogger(HomeController.class);

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ModelAndView home(Model model) {
        logger.info("Welcome home!");
        ModelAndView view = new ModelAndView();
        model.addAttribute("controllerMessage",
                "This is the message from the Person Controller!");
        view.setViewName("person");
        List<String> checkList= new ArrayList<String>();
        checkList.add("Course One");
        checkList.add("Course Two");
        checkList.add("Course Three");
        model.addAttribute("checkListValues",checkList);
        Person person = new Person("harsh","khurana",1,2);
        view.addObject(person);

        //view.addObject(model);
        return view;
    }

}
