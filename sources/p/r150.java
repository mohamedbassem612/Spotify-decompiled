package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class r150 implements x150 {
    public static final r150 INSTANCE = new r150();
    public static final Parcelable.Creator<r150> CREATOR = new fd40((byte) 18);
    public static final /* synthetic */ znb0 a = dm5.S(2, h050.d);

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
