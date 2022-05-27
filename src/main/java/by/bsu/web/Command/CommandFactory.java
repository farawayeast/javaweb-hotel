package by.bsu.web.Command;

public class CommandFactory {
    public Command create(String command){
        switch (command){
            case "login":
                return new LoginCommand();
            case "Logout":
                return new LoginCommand();
            case "roomList":
                return new RoomListCommand();
            case "addRoom":
                return new AddRoomCommand();
            case "addRoomMain":
                return new AddRoomMainCommand();
            case "deleteRoom":
                return new DeleteRoomMainCommand();
            default:
                throw new UnsupportedOperationException();

        }
    }
}
