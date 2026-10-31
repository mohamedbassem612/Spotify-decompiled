package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d5o1 extends u9 {
    public static final Parcelable.Creator<d5o1> CREATOR = new w2o1((byte) 7);
    public final int a;
    public final okn1 b;

    public d5o1(int i, okn1 okn1Var) {
        this.a = i;
        this.b = okn1Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.a);
        j541.E(parcel, 3, this.b, i);
        j541.M(iL, parcel);
    }
}
