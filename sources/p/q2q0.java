package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q2q0 implements v7c0 {
    public static final q2q0 a = new q2q0();
    public static final Parcelable.Creator<q2q0> CREATOR = new qxp0((byte) 6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p.v7c0
    public final /* bridge */ /* synthetic */ Object getDefault() {
        return Boolean.FALSE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
