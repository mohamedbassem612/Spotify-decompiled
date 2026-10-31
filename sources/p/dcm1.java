package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dcm1 implements m371 {
    public static final dcm1 a = new dcm1();
    public static final Parcelable.Creator<dcm1> CREATOR = new w8m1(25);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
