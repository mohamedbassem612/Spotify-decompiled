package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a2d1 implements g2d1, tf11, Parcelable, nj01 {
    public static final a2d1 a = new a2d1();
    public static final Parcelable.Creator<a2d1> CREATOR = new pxc1((byte) 10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
