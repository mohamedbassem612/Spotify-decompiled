package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w1d1 implements g2d1, Parcelable {
    public static final w1d1 a = new w1d1();
    public static final Parcelable.Creator<w1d1> CREATOR = new pxc1((byte) 6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
