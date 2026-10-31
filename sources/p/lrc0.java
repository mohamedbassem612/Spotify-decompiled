package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lrc0 implements orc0 {
    public static final lrc0 a = new lrc0();
    public static final Parcelable.Creator<lrc0> CREATOR = new rqc0((byte) 19);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
