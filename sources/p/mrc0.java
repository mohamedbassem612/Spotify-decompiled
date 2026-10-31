package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mrc0 implements orc0 {
    public static final mrc0 a = new mrc0();
    public static final Parcelable.Creator<mrc0> CREATOR = new rqc0((byte) 20);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
