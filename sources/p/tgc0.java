package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tgc0 implements ugc0 {
    public static final tgc0 a = new tgc0();
    public static final Parcelable.Creator<tgc0> CREATOR = new v5c0((byte) 14);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
