package wind.internal.standort;

import org.apache.log4j.Logger;
import org.hibernate.LockOptions;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import standort.*;

/**
 * An account manager that uses Hibernate to find accounts.
 */
public class HibernateStandortRepository implements StandortRepository {

	public static final String INFO = "Hibernate";

	private SessionFactory sessionFactory;

	/**
	 * Creates a new Hibernate account manager.
	 * 
	 * @param sessionFactory
	 *            the Hibernate session factory
	 */
	@Autowired
	public HibernateStandortRepository(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		Logger.getLogger(HibernateStandortRepository.class).info(
				"Created HibernateAccountManager");
	}

	@Override
	public String getInfo() {
		return INFO;
	}

	/*public Account findByCreditCard(String creditCardNumber) {
		// Find id account of account with this credit-card using a direct
		// SQL query on the unmapped T_ACCOUNT_CREDIT_CARD table.
		Integer accountId = (Integer) getCurrentSession()
				.createSQLQuery(
						"select ACCOUNT_ID from T_ACCOUNT_CREDIT_CARD where NUMBER = :ccn")
				.setParameter("ccn", creditCardNumber).uniqueResult();

		Standort standort = (Standort) getCurrentSession().load(Standort.class,
				accountId.longValue(), LockOptions.UPGRADE);

		// Force beneficiaries to load too - avoid Hibernate lazy loading error
		account.getBeneficiaries().size();

		return account;
	}*/

	/**
	 * Returns the session associated with the ongoing reward transaction.
	 * 
	 * @return the transactional session
	 */
	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}