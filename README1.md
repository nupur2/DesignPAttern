# DesignPAttern

@Component
public class classFactory {

@Autowired
private List<interface> validationServices;

private Map<String, interface> map;

///////////////////////
it will store all contstant after constructore is created
@PostConstruct
void init() {
map =
validationServices.stream()
.collect(Collectors.
toMap(interface::getMethod1, Function.identity()));
}
///////////// this method will take value from map and based on that it will call servImpl
public interface getValidationService(class obj) {
return  map.get(obj.getValue1);
}
}

interface {
getMethod1
}
class implemts interface{

@Override
public String getMethod1() {
return Enum.value.getTypeValueString();
}

}
/////////////////////////////

class main{
interface obj = getValidationService(someValue);
}
