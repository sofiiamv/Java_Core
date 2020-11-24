package ua.lviv.sofiia.hw8;

import java.util.Scanner;

public class Application {

	enum Seasons{
		WINTER, SPRING, SUMMER, FALL;
	}
	
	enum Months{
		JANUARY(31,Seasons.WINTER),FEBRUARY(28,Seasons.WINTER),MARCH(31,Seasons.SPRING),
		APRIL(30,Seasons.SPRING),MAY(31,Seasons.SPRING),JUNE(30,Seasons.SUMMER),
		JULY(31,Seasons.SUMMER),AUGUST(31,Seasons.SUMMER),SEPTEMBER(30,Seasons.FALL),
		OCTOBER(31,Seasons.FALL),NOVEMBER(30,Seasons.FALL),DECEMBER(31,Seasons.WINTER);
		
		int day;
		Seasons season;
		
		private Months(int day, Seasons season) {
			this.day=day;
			this.season=season;
		}
		
		public int getDay() {
			return day;
		}
		public Seasons getSeason() {
			return season;
		}
	}
	
	static void menu(){
		System.out.println("1-check whether your month exists");
		System.out.println("2-get all months in the same season");
		System.out.println("3-get all months with the same number of days");
		System.out.println("4-get all months with fewer days");
		System.out.println("5-get all months with more days");
		System.out.println("6-get the next season");
		System.out.println("7-get the previous season");
		System.out.println("8-get all months with an even number of days");
		System.out.println("9-get all months with an odd number of days");
		System.out.println("10-check whether your month has an even number of days");
	}
	
	public static void main(String[] args) {
		Months[] arrayMonths = Months.values();
		Seasons[] arraySeasons = Seasons.values();
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			switch (sc.next()) {

			case "1": {

				System.out.println("Enter your mounth:");
				sc = new Scanner(System.in);
				String monthSc = sc.next().toUpperCase();
				boolean flag = ifMonthExists(arrayMonths, monthSc);
				if (flag) {
					System.out.println("Your month exists");
				}
				if (!flag) {
					System.out.println("Your month doesn't exist");
				}
				break;
			}

			case "2": {

				System.out.println("Enter your mounth:");
				sc = new Scanner(System.in);
				String monthSc = sc.next().toUpperCase();
				boolean flag = ifMonthExists(arrayMonths, monthSc);
				if (flag) {
					Months month = Months.valueOf(monthSc);
					for (Months m : arrayMonths) {
						if (month.getSeason().equals(m.getSeason())) {
							System.out.println(m);
						}
					}
				}
				if (!flag) {
					System.out.println("Your month doesn't exist");
				}
				break;
			}

			case "3": {

				System.out.println("Enter your mounth:");
				sc = new Scanner(System.in);
				String monthSc = sc.next().toUpperCase();
				boolean flag = ifMonthExists(arrayMonths, monthSc);
				if (flag) {
					Months month = Months.valueOf(monthSc);
					for (Months m : arrayMonths) {
						if (month.getDay() == m.getDay()) {
							System.out.println(m);
						}
					}
				}
				if (!flag) {
					System.out.println("Your month doesn't exist");
				}
				break;
			}

			case "4": {

				System.out.println("Enter your mounth:");
				sc = new Scanner(System.in);
				String monthSc = sc.next().toUpperCase();
				boolean flag = ifMonthExists(arrayMonths, monthSc);
				if (flag) {
					Months month = Months.valueOf(monthSc);
					for (Months m : arrayMonths) {
						if (month.getDay() > m.getDay()) {
							System.out.println(m);
						}
					}
				}
				if (!flag) {
					System.out.println("Your month doesn't exist");
				}
				break;
			}

			case "5": {

				System.out.println("Enter your mounth:");
				sc = new Scanner(System.in);
				String monthSc = sc.next().toUpperCase();
				boolean flag = ifMonthExists(arrayMonths, monthSc);
				if (flag) {
					Months month = Months.valueOf(monthSc);
					for (Months m : arrayMonths) {
						if (month.getDay() < m.getDay()) {
							System.out.println(m);
						}
					}
				}
				if (!flag) {
					System.out.println("Your month doesn't exist");
				}
				break;
			}

			case "6": {

				System.out.println("Enter your mounth:");
				sc = new Scanner(System.in);
				String monthSc = sc.next().toUpperCase();
				boolean flag = ifMonthExists(arrayMonths, monthSc);
				if (flag) {
					Months month = Months.valueOf(monthSc);
					Seasons season = month.getSeason();
					int ordinal = season.ordinal();
					if (ordinal == arraySeasons.length - 1) {
						ordinal = 0;
						System.out.println(arraySeasons[ordinal]);
					} else {
						System.out.println(arraySeasons[ordinal + 1]);
					}
				}
				if (!flag) {
					System.out.println("Your month doesn't exist");
				}
				break;
			}

			case "7": {

				System.out.println("Enter your mounth:");
				sc = new Scanner(System.in);
				String monthSc = sc.next().toUpperCase();
				boolean flag = ifMonthExists(arrayMonths, monthSc);
				if (flag) {
					Months month = Months.valueOf(monthSc);
					Seasons season = month.getSeason();
					int ordinal = season.ordinal();
					if (ordinal == 0) {
						ordinal = arraySeasons.length - 1;
						System.out.println(arraySeasons[ordinal]);
					} else {
						System.out.println(arraySeasons[ordinal - 1]);
					}
				}
				if (!flag) {
					System.out.println("Your month doesn't exist");
				}
				break;
			}

			case "8": {

				for (Months m : arrayMonths) {
					if (m.getDay() % 2 == 0) {
						System.out.println(m);
					}
				}
				break;
			}

			case "9": {

				for (Months m : arrayMonths) {
					if (m.getDay() % 2 != 0) {
						System.out.println(m);
					}
				}
				break;
			}

			case "10": {

				System.out.println("Enter your mounth:");
				sc = new Scanner(System.in);
				String monthSc = sc.next().toUpperCase();
				boolean flag = ifMonthExists(arrayMonths, monthSc);
				if (flag) {
					Months month = Months.valueOf(monthSc);
					if (month.getDay() % 2 == 0) {
						System.out.println("Even");
					} else {
						System.out.println("Odd");
					}
				}
				if (!flag) {
					System.out.println("Your month doesn't exist");
				}
				break;
			}
			}
		}
	}

	private static boolean ifMonthExists(Months[] arrayMonths, String monthSc) {
		boolean flag = false;

		for (Months m : arrayMonths) {
			if (m.name().equals(monthSc)) {
				flag = true;
			}
		}
		return flag;
	}
}
