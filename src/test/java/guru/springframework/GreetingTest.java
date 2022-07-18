package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("BeforeAll - I am called Once!!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each....");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        // print object memory address just to verify a new object in created for each test
        System.out.println(greeting);
        System.out.println(greeting.helloWorld());

    }

    @Test
    void helloWorld1() {
        // print object memory address just to verify a new object in created for each test
        System.out.println(greeting);
        System.out.println(greeting.helloWorld("Dhruv"));
    }

    @Test
    void helloWorld2() {
        // print object memory address just to verify a new object in created for each test
        System.out.println(greeting);
        System.out.println(greeting.helloWorld("Sam"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each .........");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("AfterAll - I am called Once!!!");
    }


}