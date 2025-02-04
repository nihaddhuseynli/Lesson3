public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("dog", "Sirxan", 5, 75, new String[]{"eat", "drink", "sleep"});
        Human mother = new Human("Gulmemmed", "Haqverdiyeva", 1990);
        Human father = new Human("Aftandil", "Haqverdiyev", 1990);
        Human child = new Human("Ramiz", "Haqverdiyev", 2005, 90, pet, mother, father, null);

        System.out.println(child);
        child.greetPet();
        child.describePet();
        pet.eat();
        pet.respond();
        pet.foul();
    }
}