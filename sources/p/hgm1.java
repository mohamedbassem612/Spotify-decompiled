package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hgm1 implements vgm1 {
    public static final hgm1 a = new hgm1();
    public static final Parcelable.Creator<hgm1> CREATOR = new lfm1((byte) 7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hgm1);
    }

    public final int hashCode() {
        return 724936495;
    }

    public final String toString() {
        return "HideCenterActionButton";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
