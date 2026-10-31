package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vxh extends xxh {
    public static final vxh a = new vxh();
    public static final Parcelable.Creator<vxh> CREATOR = new v6h((byte) 9);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
