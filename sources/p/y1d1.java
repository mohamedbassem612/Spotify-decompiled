package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y1d1 implements g2d1, tf11, nj01 {
    public static final y1d1 a = new y1d1();
    public static final Parcelable.Creator<y1d1> CREATOR = new pxc1((byte) 8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
