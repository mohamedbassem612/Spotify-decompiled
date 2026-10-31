package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k8w0 extends m8w0 {
    public static final k8w0 a = new k8w0();
    public static final Parcelable.Creator<k8w0> CREATOR = new w7w0((byte) 3);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
