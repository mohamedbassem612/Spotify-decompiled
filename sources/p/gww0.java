package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gww0 implements v7c0 {
    public static final gww0 a = new gww0();
    public static final x0x0 b = new x0x0("", "", "", true);
    public static final Parcelable.Creator<gww0> CREATOR = new wvw0((byte) 1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p.v7c0
    public final Object getDefault() {
        return b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
