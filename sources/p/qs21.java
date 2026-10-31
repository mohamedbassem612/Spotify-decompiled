package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qs21 extends rs21 {
    public static final qs21 a = new qs21();
    public static final Parcelable.Creator<qs21> CREATOR = new g321((byte) 21);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
