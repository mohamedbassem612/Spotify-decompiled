package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cz61 extends ez61 {
    public static final cz61 d = new cz61(3.0f, 4.0f);
    public static final Parcelable.Creator<cz61> CREATOR = new hs61((byte) 15);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
