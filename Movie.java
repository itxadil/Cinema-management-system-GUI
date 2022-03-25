package application;
public class Movie {
    String name="";
    String genere="", release_date, production_house, leads;
    float positive_stats, negetive_stats;
    int duration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getProduction_house() {
        return production_house;
    }

    public void setProduction_house(String production_house) {
        this.production_house = production_house;
    }

    public String getLeads() {
        return leads;
    }

    public void setLeads(String leads) {
        this.leads = leads;
    }

    public float getPositive_stats() {
        return positive_stats;
    }

    public void setPositive_stats(float positive_stats) {
        this.positive_stats = positive_stats;
    }

    public float getNegetive_stats() {
        return negetive_stats;
    }

    public void setNegetive_stats(float negetive_stats) {
        this.negetive_stats = negetive_stats;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    void ShowStats(String name) {

    }
    void fetch_movie(String movie_name){
        
    }
}
