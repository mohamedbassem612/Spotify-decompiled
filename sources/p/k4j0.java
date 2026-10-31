package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class k4j0 implements q4j0 {
    public static final k4j0 a = new k4j0();
    public static final Parcelable.Creator<k4j0> CREATOR = new rqi0((byte) 13);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof k4j0);
    }

    public final int hashCode() {
        return 1069496567;
    }

    public final String toString() {
        return "Banner";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
