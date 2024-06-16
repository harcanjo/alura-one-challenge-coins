import com.google.gson.annotations.SerializedName;

public record Currency(@SerializedName("conversion_rate") double conversionRate) {
}
