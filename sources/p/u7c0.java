package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u7c0 implements vo1 {
    public static final u7c0 a = new u7c0();
    public static final Parcelable.Creator<u7c0> CREATOR = new v5c0((byte) 9);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof u7c0);
    }

    public final int hashCode() {
        return -595907817;
    }

    public final String toString() {
        return "LibrarySettingsDestination";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
