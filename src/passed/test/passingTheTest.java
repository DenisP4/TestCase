package passed.test;

public class passingTheTest {
	public static void main(String[] arg) {

		// passing or failing test case
		int passedTestCase = 2;
		int failedTestCase = 0;

		if (passedTestCase > 10 && failedTestCase == 0) {

			System.out.println("execution passed");

		} else {
			System.out.println("too many Failed TestCases");
		}

		System.out.println("----------------");
		// age and qualification requirements to vote in US
		int minAge = 20;// if you give the value 15 ,not eligible to vote
		boolean isQualified = true;
		if (minAge >= 18 && isQualified) {
			System.out.println("you are eligible to vote");
		} else

		{
			System.out.println("You are not eligible to vote");
		}

		System.out.println("------------------------");
		// salary greater than 100000 and the bonus is true
		double salary = 125000;// if you put 90000 then its the second outcome
		boolean bonus = true;
		if (salary > 100000 && bonus) {// both true so prints this one

			System.out.println("That is great, you have a good salary and bonus");
		} else {
			System.out.println("Put more effort in SDET training ,and learn Java");
		}

	}
}
