package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class crd0 extends grd0 {
    public static final crd0 a = new crd0();
    public static final Parcelable.Creator<crd0> CREATOR = new qod0((byte) 4);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
