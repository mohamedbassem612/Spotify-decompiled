package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j8w0 extends m8w0 {
    public static final j8w0 a = new j8w0();
    public static final Parcelable.Creator<j8w0> CREATOR = new w7w0((byte) 2);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
