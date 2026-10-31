package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class acc1 implements m371 {
    public static final acc1 a = new acc1();
    public static final Parcelable.Creator<acc1> CREATOR = new y7c1((byte) 4);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
