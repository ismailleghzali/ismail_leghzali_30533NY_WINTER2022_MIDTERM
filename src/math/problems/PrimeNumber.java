package math.problems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumber {

	private static final int MAX = 1000000;

	public static void main(String[] args) {
		// create a list to store the prime numbers
		List<Integer> primeNumbers = new ArrayList<>();

		// create a boolean array to mark the numbers from 2 to 1 million as prime or non-prime
		boolean[] isPrime = new boolean[MAX + 1];
		Arrays.fill(isPrime, true);

		// mark 0 and 1 as non-prime
		isPrime[0] = false;
		isPrime[1] = false;

		// use the Sieve of Eratosthenes algorithm to find all prime numbers
		for (int i = 2; i <= MAX; i++) {
			if (isPrime[i]) {
				// add the number to the list of prime numbers
				primeNumbers.add(i);

				// mark all multiples of i as non-prime
				for (int j = i * 2; j <= MAX; j += i) {
					isPrime[j] = false;
				}
			}
		}

		// print out the number of prime numbers found
		System.out.println("Number of prime numbers from 2 to 1 million: " + primeNumbers.size());

		// connect to the database
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bhd", "username", "password")) {

			// create a Prepared Statement to insert the prime numbers into the database
			String sql = "INSERT INTO prime_numbers (number) VALUES (?)";
			PreparedStatement stmt = conn.prepareStatement(sql);

			// loop through the list of prime numbers and insert them into the database
			for (int number : primeNumbers) {
				stmt.setInt(1, number);
				stmt.executeUpdate();
			}

			// retrieve the data from the database
			sql = "SELECT * FROM prime_numbers";
			stmt = conn.prepareStatement(sql);
			try (ResultSet rs = stmt.executeQuery()) {
				// loop through the result set and print out the numbers
				while (rs.next()) {
					System.out.println(rs.getInt("number"));
				}
			}
		} catch (SQLException e) {

		}
	}
}