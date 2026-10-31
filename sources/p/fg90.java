package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fg90 implements v7c0 {
    public static final fg90 a = new fg90();
    public static final Parcelable.Creator<fg90> CREATOR = new xl80((byte) 27);

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
