package PageFactory_FluentAPI_homework.PageFactory_and_Fluent_API.data;

public class MovieData {
    private static String movieTitle;
    private static String cinemaTitle;
    private static String dateTime;

    public static String getMovieTitle() {
        return movieTitle;
    }

    public static void setMovieTitle(String movieTitle) {
        MovieData.movieTitle = movieTitle;
    }

    public static String getCinemaTitle() {
        return cinemaTitle;
    }

    public static void setCinemaTitle(String cinemaTitle) {
        MovieData.cinemaTitle = cinemaTitle;
    }

    public static String getDateTime() {
        return dateTime;
    }

    public static void setDateTime(String dateTime) {
        MovieData.dateTime = dateTime;
    }
}
