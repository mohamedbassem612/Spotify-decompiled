package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sgm1 implements vgm1 {
    public static final sgm1 a = new sgm1();
    public static final Parcelable.Creator<sgm1> CREATOR = new lfm1((byte) 18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sgm1);
    }

    public final int hashCode() {
        return 1347079210;
    }

    public final String toString() {
        return "ShowCenterActionButton";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
