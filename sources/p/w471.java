package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w471 extends o571 {
    public static final w471 d = new w471(4, "instagram-stories");
    public static final Parcelable.Creator<w471> CREATOR = new o471((byte) 7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof w471);
    }

    public final int hashCode() {
        return 184130971;
    }

    public final String toString() {
        return "InstagramStories";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
