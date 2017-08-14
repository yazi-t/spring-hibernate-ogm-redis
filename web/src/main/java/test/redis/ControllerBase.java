package test.redis;

/**
 * <p>This application demonstrates usage of hibernate OGM MongoDB provider
 * with spring MVC. Application consists of simple key-lookup based entity
 * search functionality. This demo uses standard JPA annotations and methods to
 * query data store.</p>
 *
 * <p>This class implements all common features to be shared with controller
 * classes. All controllers need to be inherited from this class.</p>
 *
 * @author Yasitha Thilakaratne
 * Date: 04/29/2017
 *
 */
public abstract class ControllerBase {

    protected static final String INTERNAL_ERROR = "INTERNAL_SERVER_ERROR";
}
