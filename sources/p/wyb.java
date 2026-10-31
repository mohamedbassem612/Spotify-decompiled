package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wyb extends azb {
    public static final wyb a = new wyb();
    public static final Parcelable.Creator<wyb> CREATOR = new mra((byte) 28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wyb);
    }

    public final int hashCode() {
        return -1312903039;
    }

    public final String toString() {
        return "Looping";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
