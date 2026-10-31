package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ay1 implements gy1 {
    public static final ay1 a = new ay1();
    public static final Parcelable.Creator<ay1> CREATOR = new ev1((byte) 2);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ay1);
    }

    public final int hashCode() {
        return -1349886379;
    }

    public final String toString() {
        return "Default";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
