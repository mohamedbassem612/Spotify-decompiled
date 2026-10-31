package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nbe0 implements ybe0 {
    public static final nbe0 a = new nbe0();
    public static final Parcelable.Creator<nbe0> CREATOR = new qod0((byte) 27);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nbe0);
    }

    public final int hashCode() {
        return 1078653018;
    }

    public final String toString() {
        return "Loading";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
