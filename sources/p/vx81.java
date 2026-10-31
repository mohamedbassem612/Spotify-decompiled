package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vx81 implements xx81 {
    public static final vx81 a = new vx81();
    public static final Parcelable.Creator<vx81> CREATOR = new ro71((byte) 28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vx81);
    }

    public final int hashCode() {
        return -115512910;
    }

    public final String toString() {
        return "Available";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
