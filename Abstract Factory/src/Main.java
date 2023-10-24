public class Main {
    public static void main(String[] args) {
        // Create a Light theme UI
        UIFactory lightFactory = new LightUIFactory();
        Button lightButton = lightFactory.createButton();
        Checkbox lightCheckbox = lightFactory.createCheckbox();

        lightButton.render();
        lightCheckbox.render();

        // Create a Dark theme UI
        UIFactory darkFactory = new DarkUIFactory();
        Button darkButton = darkFactory.createButton();
        Checkbox darkCheckbox = darkFactory.createCheckbox();

        darkButton.render();
        darkCheckbox.render();
    }
}
