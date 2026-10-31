package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class abe0 implements zbe0 {
    public static final abe0 a = new abe0();
    public static final Parcelable.Creator<abe0> CREATOR = new qod0((byte) 19);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
