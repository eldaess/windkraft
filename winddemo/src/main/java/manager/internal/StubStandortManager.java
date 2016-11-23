package manager.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.log4j.Logger;
import org.springframework.orm.ObjectRetrievalFailureException;

import standort.*;

/**
 * IMPORTANT!!!
 * Per best practices, this class shouldn't be in 'src/main/java' but rather in 'src/test/java'.
 * However, it is used by numerous Test classes inside multiple projects. Maven does not 
 * provide an easy way to access a class that is inside another project's 'src/test/java' folder.
 * 
 * Rather than using some complex Maven configuration, we decided it is acceptable to place this test 
 * class inside 'src/main/java'.
 *
 */
public class StubStandortManager implements StandortManager {

	public static final String INFO = "Stub";

	public static final int NUM_StandortS_IN_STUB = 1;

	private Map<Long, Standort> StandortsById = new HashMap<Long, Standort>();

	private AtomicLong nextEntityId = new AtomicLong(3);

	/*public StubStandortManager() {
		Standort Standort = new Standort("123456789", "Keith and Keri Donald");
		Standort.addBeneficiary("Annabelle", Percentage.valueOf("50%"));
		Standort.addBeneficiary("Corgan", Percentage.valueOf("50%"));
		Standort.setEntityId(0L);
		Standort.getBeneficiary("Annabelle").setEntityId(0L);
		Standort.getBeneficiary("Corgan").setEntityId(1L);
		StandortsById.put(0L, Standort);
		Logger.getLogger(StubStandortManager.class).info("Created StubStandortManager");
	}*/

	@Override
	public String getInfo() {
		return INFO;
	}

	@Override
	public List<Standort> getAllStandorts() {
		return new ArrayList<Standort>(StandortsById.values());
	}

	@Override
	public Standort getStandort(int id) {
		Standort Standort = StandortsById.get(id);
		if (Standort == null) {
			throw new ObjectRetrievalFailureException(Standort.class, id);
		}
		return Standort;
	}

	@Override
	public Standort save(Standort standort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Standort standort) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Standort getStandort(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public Standort save(Standort newStandort) {
		for (Beneficiary beneficiary : newStandort.getBeneficiaries()) {
			beneficiary.setEntityId(nextEntityId.getAndIncrement());
		}

		newStandort.setEntityId(nextEntityId.getAndIncrement());
		return newStandort;
	}*/

	/*@Override
	public void update(Standort Standort) {
		StandortsById.put(Standort.getEntityId(), Standort);
	}

	@Override
	public void updateBeneficiaryAllocationPercentages(Long StandortId, Map<String, Percentage> allocationPercentages) {
		Standort Standort = StandortsById.get(StandortId);
		for (Entry<String, Percentage> entry : allocationPercentages.entrySet()) {
			Standort.getBeneficiary(entry.getKey()).setAllocationPercentage(entry.getValue());
		}
	}

	@Override
	public void addBeneficiary(Long StandortId, String beneficiaryName) {
		StandortsById.get(StandortId).addBeneficiary(beneficiaryName, Percentage.zero());
	}

	@Override
	public void removeBeneficiary(Long StandortId, String beneficiaryName, Map<String, Percentage> allocationPercentages) {
		StandortsById.get(StandortId).removeBeneficiary(beneficiaryName);
		updateBeneficiaryAllocationPercentages(StandortId, allocationPercentages);
	}

	@Override
	public List<Standort> getAllStandorts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Standort getStandort(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
