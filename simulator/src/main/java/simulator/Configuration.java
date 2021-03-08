package simulator;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class Configuration {
	public static final SecureRandom random = new SecureRandom();

	public static final String AGE_0_9 = "0-9";
	public static final String AGE_10_19 = "10-19";
	public static final String AGE_20_29 = "20-29";
	public static final String AGE_30_39 = "30-39";
	public static final String AGE_40_49 = "40-49";
	public static final String AGE_50_59 = "50-59";
	public static final String AGE_60_69 = "60-69";
	public static final String AGE_70_79 = "70-79";
	public static final String AGE_80_PLUS = "80+";

	protected static final Map<String, Float> deathProbabilityMap;
	protected static final Map<String, Float> hospitalizationProbabilityMap;
	protected static final Map<String, Integer> populationDistribution;

	public static final int INCUBATION_AVERAGE = 10;
	public static final int INCUBATION_VARIATION = 4;
	public static final int RECOVERY_AVERAGE = 10;
	public static final int RECOVERY_VARIATION = 8;

	public static final float ASYMPTOMATIC_PROBABILITY = 0.35f;
	public static final float NEGATIONIST_PROBABILITY = 0.10f;
	public static final float ISOLATION_PROBABILITY = 0.85f;
	public static final float DEATH_IF_NOT_IN_HOSPITAL_PROBABILITY = 0.5f;

	public static final int TOTAL_HOSPITAL_BEDS = 10000;

	public static final int SURFACE_AREA_SIDE = 500000;

	static {
		populationDistribution = new HashMap<>();
		populationDistribution.put(AGE_0_9, 5000000);
		populationDistribution.put(AGE_10_19, 7000000);
		populationDistribution.put(AGE_20_29, 5500000);
		populationDistribution.put(AGE_30_39, 7000000);
		populationDistribution.put(AGE_40_49, 8000000);
		populationDistribution.put(AGE_50_59, 8500000);
		populationDistribution.put(AGE_60_69, 8000000);
		populationDistribution.put(AGE_70_79, 7000000);
		populationDistribution.put(AGE_80_PLUS, 7000000);
		deathProbabilityMap = new HashMap<>();
		hospitalizationProbabilityMap = new HashMap<>();
		deathProbabilityMap.put(AGE_0_9, 0.0001f);
		deathProbabilityMap.put(AGE_10_19, 0.0020f);
		deathProbabilityMap.put(AGE_20_29, 0.0022f);
		deathProbabilityMap.put(AGE_30_39, 0.0031f);
		deathProbabilityMap.put(AGE_40_49, 0.0040f);
		deathProbabilityMap.put(AGE_50_59, 0.0130f);
		deathProbabilityMap.put(AGE_60_69, 0.0360f);
		deathProbabilityMap.put(AGE_70_79, 0.1200f);
		deathProbabilityMap.put(AGE_80_PLUS, 0.1800f);
		hospitalizationProbabilityMap.put(AGE_0_9, 0.0101f);
		hospitalizationProbabilityMap.put(AGE_10_19, 0.0120f);
		hospitalizationProbabilityMap.put(AGE_20_29, 0.0122f);
		hospitalizationProbabilityMap.put(AGE_30_39, 0.0131f);
		hospitalizationProbabilityMap.put(AGE_40_49, 0.0140f);
		hospitalizationProbabilityMap.put(AGE_50_59, 0.0130f);
		hospitalizationProbabilityMap.put(AGE_60_69, 0.0160f);
		hospitalizationProbabilityMap.put(AGE_70_79, 0.0200f);
		hospitalizationProbabilityMap.put(AGE_80_PLUS, 0.0500f);
	}

	private Configuration() {
	}
}
