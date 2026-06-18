class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class InvalidAgeProtector {

    static void checkEligibility(int age)
            throws InvalidAgeException {

        if(age < 18) {
            throw new InvalidAgeException(
                    "Age must be at least 18");
        }
    }

    public static void main(String[] args) {

        try {

            checkEligibility(16);

        } catch(InvalidAgeException e) {

            System.out.println(e.getMessage());

        }
    }
}