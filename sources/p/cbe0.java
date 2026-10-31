package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cbe0 implements zbe0 {
    public static final cbe0 a = new cbe0();
    public static final Parcelable.Creator<cbe0> CREATOR = new qod0((byte) 20);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
