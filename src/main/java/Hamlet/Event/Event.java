package Hamlet.Event;


import Hamlet.Template.EventType;
import lombok.Data;

@Data
public class Event {
    private int id; //id in the graphlet
    private int sec;
    public final String string;
    public final EventType eventType;

    /**
     * take a line of record，convert it to a Hamlet.Event
     * @param line line of record
     */
    public Event(String line, EventType et){
        this.eventType = et;
        String[] record = line.split(",");
        this.sec = Integer.parseInt(record[0]);
        this.string = record[1];
    }

}
