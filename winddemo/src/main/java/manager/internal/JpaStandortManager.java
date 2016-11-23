package manager.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.transaction.annotation.Transactional;

import standort.*;

/**
 * An Standort manager that uses Hibernate to find Standorts.
 */
public class JpaStandortManager implements StandortManager {

	public static final String INFO = "JPA";

	private EntityManager entityManager;

	public JpaStandortManager() {
		Logger.getLogger(JpaStandortManager.class).info(
				"Created JpaStandortManager");
	}

	/**
	 * Creates a new JPA Standort manager.
	 * 
	 * @param entityManager
	 *            the JPA entity manager
	 */
	public JpaStandortManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public String getInfo() {
		return INFO;
	}

	/*@Override
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Standort> getAllStandorts() {
		List<Standort> l = entityManager.createQuery(
				"select a from Standort a LEFT JOIN FETCH a.beneficiaries")
				.getResultList();

		// Use of "JOIN FETCH" produces duplicate Standorts, and DISTINCT does
		// not address this. So we have to filter it manually.
		List<Standort> result = new ArrayList<Standort>();

		for (Standort a : l) {
			if (!result.contains(a))
				result.add(a);
		}

		return result;
	}*/

	/*@Override
	@Transactional(readOnly = true)
	public Standort getStandort(int id) {
		Standort Standort = (Standort) entityManager.find(Standort.class, id);

		if (Standort == null)
			throw new ObjectRetrievalFailureException(Standort.class, id);

		// Force beneficiaries to load too - avoid Hibernate lazy loading error
		Standort.getBeneficiaries().size();

		return Standort;
	}*/

	@Override
	@Transactional
	public Standort save(Standort Standort) {
		entityManager.persist(Standort);
		return Standort;
	}

	@Override
	@Transactional
	public void update(Standort Standort) {
		entityManager.merge(Standort);
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
	}

	

	@Override
	public Standort getStandort(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	@Transactional
	public void updateBeneficiaryAllocationPercentages(Long StandortId,
			Map<String, Percentage> allocationPercentages) {
		Standort Standort = getStandort(StandortId);
		for (Entry<String, Percentage> entry : allocationPercentages.entrySet()) {
			Standort.getBeneficiary(entry.getKey()).setAllocationPercentage(
					entry.getValue());
		}
	}*/

	/*@Override
	@Transactional
	public void addBeneficiary(Long StandortId, String beneficiaryName) {
		getStandort(StandortId)
				.addBeneficiary(beneficiaryName, Percentage.zero());
	}*/

	/*@Override
	@Transactional
	public void removeBeneficiary(Long StandortId, String beneficiaryName,
			Map<String, Percentage> allocationPercentages) {
		getStandort(StandortId).removeBeneficiary(beneficiaryName);

		if (allocationPercentages != null)
			updateBeneficiaryAllocationPercentages(StandortId,
					allocationPercentages);
	}*/

}
