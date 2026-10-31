package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wcu0 implements ycu0 {
    public static final wcu0 a = new wcu0();
    public static final Parcelable.Creator<wcu0> CREATOR = new brt0((byte) 14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wcu0);
    }

    public final int hashCode() {
        return -1025096192;
    }

    public final String toString() {
        return "Stopped";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
