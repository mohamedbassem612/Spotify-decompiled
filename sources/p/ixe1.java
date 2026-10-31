package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class ixe1 extends mxe1 {
    public static final ixe1 INSTANCE = new ixe1();
    public static final Parcelable.Creator<ixe1> CREATOR = new lse1((byte) 13);
    public static final /* synthetic */ znb0 b = dm5.S(2, orc1.Y0);

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
