package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xj2 extends yj2 {
    public static final xj2 a = new xj2();
    public static final Parcelable.Creator<xj2> CREATOR = new ue2((byte) 15);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
