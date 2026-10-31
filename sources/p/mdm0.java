package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mdm0 implements pdm0 {
    public static final mdm0 a = new mdm0();
    public static final Parcelable.Creator<mdm0> CREATOR = new w9k0((byte) 9);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mdm0);
    }

    public final int hashCode() {
        return -1777144180;
    }

    public final String toString() {
        return "NoBeatmatching";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
