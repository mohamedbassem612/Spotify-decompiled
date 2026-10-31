package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ay81 implements by81 {
    public static final ay81 a = new ay81();
    public static final Parcelable.Creator<ay81> CREATOR = new yx81((byte) 1);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ay81);
    }

    public final int hashCode() {
        return 1603082595;
    }

    public final String toString() {
        return "Loading";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
