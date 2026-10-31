package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vmb1 extends znb1 {
    public static final vmb1 a = new vmb1();
    public static final Parcelable.Creator<vmb1> CREATOR = new olb1((byte) 10);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vmb1);
    }

    public final int hashCode() {
        return -903718454;
    }

    public final String toString() {
        return "NotAllowed";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
