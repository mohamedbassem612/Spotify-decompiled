package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eg90 implements v7c0 {
    public static final eg90 a = new eg90();
    public static final Parcelable.Creator<eg90> CREATOR = new xl80((byte) 26);

    public final int describeContents() {
        return 0;
    }

    public final Object getDefault() {
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
