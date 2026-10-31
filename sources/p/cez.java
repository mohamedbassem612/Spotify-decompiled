package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cez extends fez {
    public static final cez a = new cez();
    public static final Parcelable.Creator<cez> CREATOR = new jhy((byte) 29);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cez);
    }

    public final int hashCode() {
        return -920997582;
    }

    public final String toString() {
        return "Custom";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
