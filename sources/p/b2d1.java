package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b2d1 implements g2d1, w6s {
    public static final b2d1 a = new b2d1();
    public static final Parcelable.Creator<b2d1> CREATOR = new pxc1((byte) 11);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
