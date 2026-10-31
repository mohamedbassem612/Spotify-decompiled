package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yf81 implements cg81 {
    public static final yf81 a = new yf81();
    public static final Parcelable.Creator<yf81> CREATOR = new ro71((byte) 9);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof yf81);
    }

    public final int hashCode() {
        return 634538770;
    }

    public final String toString() {
        return "Error";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
