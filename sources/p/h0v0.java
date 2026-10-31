package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h0v0 implements v7c0 {
    public static final h0v0 a = new h0v0();
    public static final Parcelable.Creator<h0v0> CREATOR = new g0v0((byte) 0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p.v7c0
    public final Object getDefault() {
        return w7x.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
