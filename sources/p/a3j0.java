package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a3j0 implements c3j0 {
    public static final a3j0 a = new a3j0();
    public static final Parcelable.Creator<a3j0> CREATOR = new rqi0((byte) 10);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a3j0);
    }

    public final int hashCode() {
        return -1869574649;
    }

    public final String toString() {
        return "Unknown";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
