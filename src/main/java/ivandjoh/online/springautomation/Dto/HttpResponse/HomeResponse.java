package ivandjoh.online.springautomation.Dto.HttpResponse;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonPropertyOrder({"status_code", "status", "messages"})
public class HomeResponse {

    @JsonProperty("status_code")
    private int statusCode;
    @JsonProperty("status")
    private String Status;
    @JsonProperty("messages")
    private String messages;
}
