package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qvn1 extends u9 {
    public static final Parcelable.Creator<qvn1> CREATOR = new jrn1((byte) 16);
    public final int a;

    public qvn1(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.a);
        j541.M(iL, parcel);
    }
}
