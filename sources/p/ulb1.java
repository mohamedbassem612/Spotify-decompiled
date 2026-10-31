package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ulb1 extends znb1 {
    public static final ulb1 a = new ulb1();
    public static final Parcelable.Creator<ulb1> CREATOR = new olb1((byte) 1);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ulb1);
    }

    public final int hashCode() {
        return -1653650522;
    }

    public final String toString() {
        return "GenericError";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
