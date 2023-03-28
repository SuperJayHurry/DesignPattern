package Jay.Singleton;

public class TicketMakerManager {
    private static TicketMaker ticketMaker = new TicketMaker();
    public static TicketMaker getInstance(){
        return ticketMaker;
    }
}
