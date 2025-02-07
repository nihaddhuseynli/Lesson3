public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("dog", "Sirxan", 5, 75, new String[]{"eat", "drink", "sleep"});
        Human mother = new Human("Gulmemmed", "Kisiyev", 1990);
        Human father = new Human("Aftandil", "Kisiyeva", 1990);
        Human child = new Human("Ramiz", "Kisiyev", 2005, 90, pet, mother, father, null);

        System.out.println(child);
        child.greetPet();
        child.describePet();
        pet.eat();
        pet.respond();
        pet.foul();
        System.out.println(child.feedPet(false));
    }
}