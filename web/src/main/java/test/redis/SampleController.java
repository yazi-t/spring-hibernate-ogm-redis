package test.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import test.redis.model.Model;
import test.redis.model.Type;
import test.redis.model.Vehicle;

import java.util.Date;

/**
 * <p>This application demonstrates usage of hibernate OGM MongoDB provider
 * with spring MVC. Application consists of simple key-lookup based entity
 * search functionality. This demo uses standard JPA annotations and methods to
 * query data store.</p>
 *
 * <p>Sample controller which is handling all web page requests.</p>
 *
 * @author Yasitha Thilakaratne
 * Date: 04/29/2017
 *
 */
@Controller
public class SampleController extends ControllerBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    private VehicleService vehicleService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String all(ModelMap modelMap) {
        try {
            return "all";
        } catch (Exception e) {
            LOGGER.error("Unexpected error occurred ", e);
            return INTERNAL_ERROR;
        }
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String addPage(@ModelAttribute Vehicle vehicle, ModelMap modelMap) {
        try {
            modelMap.put("vehicle", vehicle);
            modelMap.put("types", Type.values());
            modelMap.put("models", Model.values());

            return "add";
        } catch (Exception e) {
            LOGGER.error("Unexpected error occurred ", e);
            System.out.println(e.toString());
            e.printStackTrace();
            return INTERNAL_ERROR;
        }
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(@ModelAttribute Vehicle vehicle) {
        try {
            vehicleService.save(vehicle);
            return "redirect:/";
        } catch (Exception e) {
            LOGGER.error("Unexpected error occurred ", e);
            return INTERNAL_ERROR;
        }
    }

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public String search(ModelMap modelMap, @RequestParam("key") String key) {
        try {
            Vehicle v = vehicleService.getById(key);
            modelMap.put("vehicle", v);
            return "search";
        } catch (Exception e) {
            LOGGER.error("Unexpected error occurred ", e);
            return INTERNAL_ERROR;
        }
    }
}
