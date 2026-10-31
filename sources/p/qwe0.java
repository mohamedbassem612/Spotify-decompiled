package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qwe0 implements uwe0 {
    public static final qwe0 a = new qwe0();
    public static final Parcelable.Creator<qwe0> CREATOR = new lbe0((byte) 29);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
