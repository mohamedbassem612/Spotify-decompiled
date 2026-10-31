package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wao1 extends u9 {
    public static final Parcelable.Creator<wao1> CREATOR = new sao1((byte) 2);
    public final int a;
    public final zio1 b;

    public wao1(int i, zio1 zio1Var) {
        this.a = i;
        this.b = zio1Var;
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
