package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fmg1 extends jmg1 {
    public static final fmg1 a = new fmg1();
    public static final Parcelable.Creator<fmg1> CREATOR = new h3g1((byte) 13);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
