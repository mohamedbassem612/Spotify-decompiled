package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dbe0 implements ybe0 {
    public static final dbe0 a = new dbe0();
    public static final Parcelable.Creator<dbe0> CREATOR = new qod0((byte) 21);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dbe0);
    }

    public final int hashCode() {
        return 1835910439;
    }

    public final String toString() {
        return "Loaded";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
