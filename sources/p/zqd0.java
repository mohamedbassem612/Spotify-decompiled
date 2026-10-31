package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zqd0 extends grd0 {
    public static final zqd0 a = new zqd0();
    public static final Parcelable.Creator<zqd0> CREATOR = new qod0((byte) 1);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
