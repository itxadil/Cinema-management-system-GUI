package application;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Show {
    int show_number,time,hall_number,duration,no_of_available_seats;
    String movie_name, status, date;

    boolean Request_show(int snumber){
        boolean flag=false;
        return flag;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getShow_number() {
        return show_number;
    }

    public void setShow_number(int show_number) {
        this.show_number = show_number;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getHall_number() {
        return hall_number;
    }

    public void setHall_number(int hall_number) {
        this.hall_number = hall_number;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getNo_of_available_seats() {
        return no_of_available_seats;
    }

    public void setNo_of_available_seats(int no_of_available_seats) {
        this.no_of_available_seats = no_of_available_seats;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    void showTiming(int date) throws IOException {
        int temp;
        String value;
        FileReader reader= new FileReader ("C:\\Users\\Administrator\\IdeaProjects\\SDA\\src\\com\\example\\sda\\Shows");
        BufferedReader br =new BufferedReader(reader);
        StringBuffer s= new StringBuffer();
        temp= reader.read();
        while(temp!= -1){
            if(temp== date){
                s.append(br);

            }
            temp= reader.read();

        }
        System.out.print(s);

    }
    boolean ChangeTiming(String name, int date, int time){
        boolean flag;
        return true;
    }
}
