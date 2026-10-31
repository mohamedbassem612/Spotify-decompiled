package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ztb1 implements gub1 {
    public static final ztb1 a = new ztb1();
    public static final Parcelable.Creator<ztb1> CREATOR = new olb1((byte) 22);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
