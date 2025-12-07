public class Dog {

    private String name;
    private int age;
    private Breed breed;
    private AdoptionStatus status;

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.status = AdoptionStatus.AVAILABLE;
    }


    public void adopt() {
        if (status == AdoptionStatus.AVAILABLE) {
            status = AdoptionStatus.PENDING;
            System.out.println(name + " is now pending adoption!");
        } else {
            System.out.println(name + " cannot be adopted. Current status: " + status);
        }
    }


    public void finalizeAdoption() {
        if (status == AdoptionStatus.PENDING) {
            status = AdoptionStatus.ADOPTED;
            System.out.println(name + " has been adopted!");
        } else {
            System.out.println(name + " cannot finalize adoption. Current status: " + status);
        }
    }


    @Override
    public String toString() {
        return name + " (" + breed + ", age " + age + ") - " + status;
    }

    public AdoptionStatus getStatus() {
        return status;
    }


}
