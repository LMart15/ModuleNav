package zhenya.common;

import android.os.Parcel;
import android.os.Parcelable;

public class ContinentModel implements Parcelable {

    private String image;
    private String title;
    private String description;

    public ContinentModel(String image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.image);
        dest.writeString(this.title);
        dest.writeString(this.description);
    }

    protected ContinentModel(Parcel in) {
        this.image = in.readString();
        this.title = in.readString();
        this.description = in.readString();
    }

    public static final Creator<ContinentModel> CREATOR = new Creator<ContinentModel>() {
        @Override
        public ContinentModel createFromParcel(Parcel source) {
            return new ContinentModel(source);
        }

        @Override
        public ContinentModel[] newArray(int size) {
            return new ContinentModel[size];
        }
    };
}
