package manager.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.transaction.annotation.Transactional;

import standort.*;
/**
 * An Standort manager that uses Hibernate to find Standorts.
 */
public class HibernateStandortManager implements StandortManager {

	public static final String INFO = "Hibernate";

	private SessionFactory sessionFactory;

	/**
	 * Creates a new Hibernate Standort manager.
	 * 
	 * @param sessionFactory
	 *            the Hibernate session factory
	 */
	@Autowired
	public HibernateStandortManager(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		Logger.getLogger(HibernateStandortManager.class).info(
				"Created HibernateStandortManager");
	}

	@Override
	public String getInfo() {
		return INFO;
	}

	/*@Override
	public List<Standort> getAllStandorts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Standort getStandort(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}*/

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
	public List<Standort> getAllStandorts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Standort getStandort(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Standort getStandort(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Standort> getAllStandorts() {
		List<Standort> l = getCurrentSession().createQuery("from Standort").list();
		
		// Use of "JOIN FETCH" produces duplicate Standorts, and DISTINCT does
		// not address this. So we have to filter it manually.
		List<Standort> result = new ArrayList<Standort>();

		for (Standort a : l) {
			if (!result.contains(a))
				result.add(a);
		}

		return result;		
	}
	*/
}

/**
 * Manages access to Standort information. Used as the service layer component in
 * the <tt>mvc</tt> and <tt>security</tt> projects.
 */
