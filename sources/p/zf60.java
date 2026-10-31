package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zf60 implements m371 {
    public static final zf60 a = new zf60();
    public static final Parcelable.Creator<zf60> CREATOR = new xk50((byte) 24);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
