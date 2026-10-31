package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class m150 implements x150 {
    public static final m150 INSTANCE = new m150();
    public static final Parcelable.Creator<m150> CREATOR = new fd40((byte) 16);
    public static final /* synthetic */ znb0 a = dm5.S(2, h050.c);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final nma0 serializer() {
        return (nma0) a.getValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
