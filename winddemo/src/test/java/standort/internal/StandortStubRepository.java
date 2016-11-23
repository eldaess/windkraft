package standort.internal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.orm.ObjectRetrievalFailureException;

import standort.Standort; import standort.StandortRepository;


public class StandortStubRepository implements StandortRepository {

	public StandortStubRepository() {
		Standort standort1 = new Standort();
		
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
