package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z1d1 implements g2d1 {
    public static final z1d1 a = new z1d1();
    public static final Parcelable.Creator<z1d1> CREATOR = new pxc1((byte) 9);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
