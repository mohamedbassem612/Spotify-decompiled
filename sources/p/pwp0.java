package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pwp0 extends xwp0 {
    public static final pwp0 a = new pwp0();
    public static final Parcelable.Creator<pwp0> CREATOR = new ump0((byte) 23);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
