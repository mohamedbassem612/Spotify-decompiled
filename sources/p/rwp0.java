package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rwp0 extends xwp0 {
    public static final rwp0 a = new rwp0();
    public static final Parcelable.Creator<rwp0> CREATOR = new ump0(24);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
