package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r181 implements v7c0 {
    public static final r181 a = new r181();
    public static final Parcelable.Creator<r181> CREATOR = new ro71((byte) 2);

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
