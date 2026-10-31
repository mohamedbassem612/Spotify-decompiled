package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lfk1 implements mfk1 {
    public static final lfk1 a = new lfk1();
    public static final Parcelable.Creator<lfk1> CREATOR = new nhj1((byte) 23);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lfk1);
    }

    public final int hashCode() {
        return 1227092461;
    }

    public final String toString() {
        return "Retry";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
