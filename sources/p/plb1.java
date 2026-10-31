package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class plb1 extends znb1 {
    public static final plb1 a = new plb1();
    public static final Parcelable.Creator<plb1> CREATOR = new olb1((byte) 0);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof plb1);
    }

    public final int hashCode() {
        return 106134516;
    }

    public final String toString() {
        return "AppUpdateRequired";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
