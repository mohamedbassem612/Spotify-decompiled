package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class rmo0 extends vmo0 {
    public static final rmo0 INSTANCE = new rmo0();
    public static final Parcelable.Creator<rmo0> CREATOR = new b4o0((byte) 17);
    public static final /* synthetic */ znb0 b = dm5.S(2, fsm0.d1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final nma0 serializer() {
        return (nma0) b.getValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
