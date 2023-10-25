public class Main {
    public static void main(String[] args) {
        // Create receiver objects
        Light livingRoomLight = new Light();
        Fan bedroomFan = new Fan();

        // Create command objects
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command bedroomFanOn = new FanOnCommand(bedroomFan);
        Command bedroomFanOff = new FanOffCommand(bedroomFan);

        // Create an invoker
        RemoteControl remote = new RemoteControl();

        // Set and invoke commands
        remote.setCommand(livingRoomLightOn);
        remote.pressButton();

        remote.setCommand(livingRoomLightOff);
        remote.pressButton();

        remote.setCommand(bedroomFanOn);
        remote.pressButton();

        remote.setCommand(bedroomFanOff);
        remote.pressButton();
    }
}
