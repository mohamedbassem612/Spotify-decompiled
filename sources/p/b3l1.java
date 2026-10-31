package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b3l1 implements m371 {
    public static final b3l1 a = new b3l1();
    public static final Parcelable.Creator<b3l1> CREATOR = new ylk1((byte) 11);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
