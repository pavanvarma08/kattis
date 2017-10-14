package kattis;

import java.util.Scanner;

public class toil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String as = sc.nextLine();

		if (as.length() < 2) {
		} else {
			int upPolicy = 0;
			int downPolicy = 0;
			int anyPolicy = 0;
			int i = 1;

			while (i < as.length()) {
				char desiredPosition = as.charAt(i);
				char previousPosition = as.charAt(i - 1);

				if (!(desiredPosition == previousPosition))
					anyPolicy += 1;

				char[] values = { 'U', 'D' };

				for (int j = 0; j < values.length; j++) {
					char requiredPosition = values[j];

					if (i > 1)
						previousPosition = values[j];

					if (requiredPosition == 'U') {
						if (!(desiredPosition == previousPosition))
							upPolicy += 1;
						if (!(desiredPosition == requiredPosition))
							upPolicy += 1;

					}
					if (requiredPosition == 'D') {
						if (!(desiredPosition == previousPosition))
							downPolicy += 1;
						if (!(desiredPosition == requiredPosition))
							downPolicy += 1;
					}
				} // for
				i++;
			} // while
			System.out.println(upPolicy + "\n" + downPolicy + "\n" + anyPolicy);
		} // else
	}// main
}
