package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fgm1 implements vgm1 {
    public static final fgm1 a = new fgm1();
    public static final Parcelable.Creator<fgm1> CREATOR = new lfm1((byte) 5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fgm1);
    }

    public final int hashCode() {
        return -1788936966;
    }

    public final String toString() {
        return "ContentReady";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
