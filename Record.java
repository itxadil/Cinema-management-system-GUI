package application;
public class Record {
    int No_of_tickets_purcased, no_of_people;
    String movie_type, movie_name;

    public int getNo_of_tickets_purcased() {
        return No_of_tickets_purcased;
    }

    public void setNo_of_tickets_purcased(int no_of_tickets_purcased) {
        No_of_tickets_purcased = no_of_tickets_purcased;
    }

    public int getNo_of_people() {
        return no_of_people;
    }

    public void setNo_of_people(int no_of_people) {
        this.no_of_people = no_of_people;
    }

    public String getMovie_type() {
        return movie_type;
    }

    public void setMovie_type(String movie_type) {
        this.movie_type = movie_type;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }
}
