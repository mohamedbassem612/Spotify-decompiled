package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z4c0 extends d6c0 {
    public static final z4c0 b = new z4c0(true);
    public static final Parcelable.Creator<z4c0> CREATOR = new cwb0((byte) 8);

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "AllBySpotify";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
