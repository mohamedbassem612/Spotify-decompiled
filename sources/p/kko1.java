package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kko1 extends u9 {
    public static final Parcelable.Creator<kko1> CREATOR = new agm0((byte) 23);
    public final int a;
    public final s2o1 b;

    public kko1(int i, s2o1 s2o1Var) {
        this.a = i;
        this.b = s2o1Var;
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
