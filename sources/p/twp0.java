package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class twp0 extends xwp0 {
    public static final twp0 a = new twp0();
    public static final Parcelable.Creator<twp0> CREATOR = new ump0((byte) 25);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
