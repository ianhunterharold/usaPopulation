
public class PopulationGrowthOverNextFiveYearsUsa {

	public static void main(String[] args) {
		populationGrowthCalculated();
	}
		
		
	static void populationGrowthCalculated(){
		
		double currentSizeOfPop= 312032486.00;
		
		double numberOfBirthsPerYear = 4505142.86;
		
		double numberOfDeathsPerYear = 2425801.68;
		
		double numberOfImmigrantsPerYear = 700800.00;
		
		double totalUsaPopulationCount = 0;
		//every iteration is a year 
		// increment year count with console print 
		int yearCount = 2020;
		
		for (int i = yearCount; i< 2025; i++ ) {
			if (yearCount == 2025) {
				totalUsaPopulationCount = ((currentSizeOfPop + numberOfBirthsPerYear + numberOfImmigrantsPerYear) - numberOfDeathsPerYear);
				yearCount = yearCount + 1; 
			} else {
				totalUsaPopulationCount = ((totalUsaPopulationCount + numberOfBirthsPerYear + numberOfImmigrantsPerYear) - numberOfDeathsPerYear);
				yearCount = yearCount + 1; 
			}
			
			System.out.println(totalUsaPopulationCount+" population size ");
			System.out.println("Year: "+yearCount);
		}	
	}
}

