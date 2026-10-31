package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rf90 implements v7c0 {
    public static final rf90 a = new rf90();
    public static final Parcelable.Creator<rf90> CREATOR = new xl80((byte) 25);

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
