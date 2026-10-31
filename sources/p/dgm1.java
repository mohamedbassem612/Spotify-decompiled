package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dgm1 implements m371 {
    public static final dgm1 a = new dgm1();
    public static final Parcelable.Creator<dgm1> CREATOR = new lfm1((byte) 3);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
