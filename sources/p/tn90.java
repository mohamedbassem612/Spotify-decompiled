package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tn90 extends un90 {
    public static final tn90 a = new tn90();
    public static final Parcelable.Creator<tn90> CREATOR = new qg90((byte) 21);

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Unknown";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
