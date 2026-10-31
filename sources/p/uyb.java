package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uyb extends azb {
    public static final uyb a = new uyb();
    public static final Parcelable.Creator<uyb> CREATOR = new mra((byte) 26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof uyb);
    }

    public final int hashCode() {
        return 1024699695;
    }

    public final String toString() {
        return "Fx";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
