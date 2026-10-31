package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e2d1 implements g2d1, tf11, Parcelable, nj01 {
    public static final e2d1 a = new e2d1();
    public static final Parcelable.Creator<e2d1> CREATOR = new pxc1((byte) 14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
