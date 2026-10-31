package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kf90 implements v7c0 {
    public static final kf90 a = new kf90();
    public static final Parcelable.Creator<kf90> CREATOR = new xl80((byte) 23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p.v7c0
    public final Object getDefault() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
