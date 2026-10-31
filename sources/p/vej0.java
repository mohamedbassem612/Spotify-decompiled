package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vej0 implements m371 {
    public static final vej0 a = new vej0();
    public static final Parcelable.Creator<vej0> CREATOR = new rqi0((byte) 27);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
