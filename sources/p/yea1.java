package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yea1 implements m371 {
    public static final yea1 a = new yea1();
    public static final Parcelable.Creator<yea1> CREATOR = new yx81((byte) 20);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
