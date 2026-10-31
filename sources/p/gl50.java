package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gl50 implements hl50 {
    public static final gl50 a = new gl50();
    public static final Parcelable.Creator<gl50> CREATOR = new xk50((byte) 2);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gl50);
    }

    public final int hashCode() {
        return -516183189;
    }

    public final String toString() {
        return "Playing";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
