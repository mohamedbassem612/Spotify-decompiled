package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hrx extends hux {
    public static final hrx c = new hrx(new dsx(vyo1.w(), wyo1.h()), null);
    public static final byte d = 8;
    public static final Parcelable.Creator<hrx> CREATOR = new hbn1((byte) 18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hrx);
    }

    public final int hashCode() {
        return -47630225;
    }

    public final String toString() {
        return "Plus";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
