package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yo41 implements zo41 {
    public static final yo41 a = new yo41();
    public static final Parcelable.Creator<yo41> CREATOR = new uo41((byte) 3);

    public final String S() {
        return "Unavailable";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
