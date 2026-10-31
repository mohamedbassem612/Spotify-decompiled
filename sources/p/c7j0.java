package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c7j0 extends e7j0 {
    public static final c7j0 a = new c7j0();
    public static final Parcelable.Creator<c7j0> CREATOR = new rqi0((byte) 20);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c7j0);
    }

    public final int hashCode() {
        return -1799576032;
    }

    public final String toString() {
        return "NoMessage";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
