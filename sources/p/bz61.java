package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bz61 extends ez61 {
    public static final bz61 d = new bz61(2.0f, 1.0f);
    public static final Parcelable.Creator<bz61> CREATOR = new hs61((byte) 14);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
