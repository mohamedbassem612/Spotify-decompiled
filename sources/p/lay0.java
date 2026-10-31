package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lay0 implements oay0 {
    public static final lay0 a = new lay0();
    public static final Parcelable.Creator<lay0> CREATOR = new zzx0((byte) 7);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lay0);
    }

    public final int hashCode() {
        return 404709693;
    }

    public final String toString() {
        return "Error";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
