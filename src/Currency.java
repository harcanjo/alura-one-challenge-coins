import com.google.gson.annotations.SerializedName;

public record Currency(@SerializedName("conversion_rate") double conversionRate, @SerializedName("time_last_update_utc") String lastUpdate) {
}
