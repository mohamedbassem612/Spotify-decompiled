package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jbx0 extends nbx0 {
    public static final jbx0 a = new jbx0();
    public static final Parcelable.Creator<jbx0> CREATOR = new wvw0((byte) 17);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jbx0);
    }

    public final int hashCode() {
        return 1556539323;
    }

    public final String toString() {
        return "PROFILE";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
