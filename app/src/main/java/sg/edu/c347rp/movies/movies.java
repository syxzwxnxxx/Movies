package sg.edu.c347rp.movies;

import java.util.Calendar;

/**
 * Created by 15017466 on 24/7/2017.
 */

public class movies {
    String title;
    String detail;
    String year;
    String date;
    String place;


    public movies(String title, String detail, String year, String date, String place) {
        this.title = title;
        this.detail = detail;
        this.year = year;
        this.date = date;
        this.place = place;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }
}
