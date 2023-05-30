package carehalcare.carehalcare.Feature_write.Walk;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Walk_ResponseDTO {
    @SerializedName("id")
    Long id;
    @SerializedName("userId")
    String userId;
    @SerializedName("puserId")
    String puserId;
    @SerializedName("images")
    List<Walk_Image> images;
    @SerializedName("createdDateTime")
    String createdDateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPuserId() {
        return puserId;
    }

    public void setPuserId(String puserId) {
        this.puserId = puserId;
    }

    public List<Walk_Image> getImages() {
        return images;
    }

    public void setImages(List<Walk_Image> images) {
        this.images = images;
    }

    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }
}
