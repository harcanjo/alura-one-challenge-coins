import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateConversionBR {

    public String convertDateFromApi(String apiDateString) {

        SimpleDateFormat inputFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
        inputFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        // Formato para exibir a data no formato brasileiro
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        outputFormat.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo")); // Fuso horário de São Paulo

        try {
            Date date = inputFormat.parse(apiDateString);
            String formattedDate = outputFormat.format(date);
            return formattedDate;

        } catch (ParseException e) {
            System.err.println("Erro ao fazer parse da data: " + e.getMessage());
            return null;
        }
    }
}
