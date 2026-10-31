package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hbx0 extends nbx0 {
    public static final hbx0 a = new hbx0();
    public static final Parcelable.Creator<hbx0> CREATOR = new wvw0((byte) 15);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hbx0);
    }

    public final int hashCode() {
        return 500212368;
    }

    public final String toString() {
        return "INVITED_FRIEND";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
