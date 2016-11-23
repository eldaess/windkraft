package standort;

import java.util.List;
import java.util.Map;



	/**
	 * Manages access to Standort information. Used as the service layer component in
	 * the <tt>mvc</tt> and <tt>security</tt> projects.
	 */
	public interface StandortManager {

		/**
		 * Indicates implementation being used. Actual implementation is hidden
		 * behind a proxy, so this makes it easy to determine.
		 * 
		 * @return Implementation information.
		 */
		public String getInfo();

		/**
		 * Get all Standorts in the system
		 * 
		 * @return all Standorts
		 */
		public List<Standort> getAllStandorts();

		/**
		 * Find an Standort by its number.
		 * 
		 * @param id
		 *            the Standort id
		 * @return the Standort
		 */
		public Standort getStandort(int id);

		/**
		 * Takes a transient Standort and persists it.
		 * 
		 * @param Standort
		 *            The Standort to save
		 * @return The persistent Standort - this may or may not be the same object
		 *         as the method argument.
		 */
		public Standort save(Standort standort);

		/**
		 * Takes a changed Standort and persists any changes made to it.
		 * 
		 * @param Standort
		 *            The Standort with changes
		 */
		public void update(Standort standort);

		Standort getStandort(Integer id);

		

		/**
		 * Updates the allocation percentages for the entire collection of
		 * beneficiaries in an Standort
		 * 
		 * @param StandortId
		 *            the Standort id
		 * @param allocationPercentages
		 *            A map of beneficiary names and allocation percentages, keyed
		 *            by beneficiary name
		 */
		//public void updateBeneficiaryAllocationPercentages(Long StandortId,
			//	Map<String, Percentage> allocationPercentages);

		/**
		 * Adds a beneficiary to an Standort. The new beneficiary will have a 0
		 * allocation percentage.
		 * 
		 * @param StandortId
		 *            the Standort id
		 * @param beneficiaryName
		 *            the name of the beneficiary to remove
		 */
		//public void addBeneficiary(Long StandortId, String beneficiaryName);

		/**
		 * Removes a beneficiary from an Standort.
		 * 
		 * @param StandortId
		 *            the Standort id
		 * @param beneficiaryName
		 *            the name of the beneficiary to remove
		 * @param allocationPercentages
		 *            new allocation percentages, keyed by beneficiary name
		 */
		//public void removeBeneficiary(Long StandortId, String beneficiaryName,
			//	Map<String, Percentage> allocationPercentages);
	
	
}
