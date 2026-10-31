package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class d7j0 extends e7j0 {
    public static final d7j0 a = new d7j0();
    public static final Parcelable.Creator<d7j0> CREATOR = new rqi0((byte) 21);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d7j0);
    }

    public final int hashCode() {
        return -1812563787;
    }

    public final String toString() {
        return "Uninitialized";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
