import java.util.HashMap;
import java.util.Map;


public class tdd {

	Map<String, String> map = new HashMap<String, String>();;
	
	
	public void puto(String clave, String 	valor){
		map.put(clave,valor);
		
		
	}
	public String geto(String clave){
		if (!map.containsKey(clave)){
			throw new NegativeKey("No existe la clave introducida ");
		}else{
			return map.get(clave);
		}
		
	}
	
	public String getOrelse(String clave, String valorpordefecto){
		if(map.containsKey(clave)){
			return map.get(clave);
		}else{
			return valorpordefecto;
		}
	}
	
	public boolean containsKey(String clave){
		if(map.containsKey(clave)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean remove(String clave){
		if(map.containsKey(clave)){
			map.remove(clave);
			
			return true;
		}else{
			return false;
		}
	}
	
	
	
}
