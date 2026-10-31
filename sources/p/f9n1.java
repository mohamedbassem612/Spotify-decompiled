package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f9n1 extends u9 {
    public static final Parcelable.Creator<f9n1> CREATOR = new e9n1((byte) 2);
    public final int a;
    public final u9n1 b;

    public f9n1(int i, u9n1 u9n1Var) {
        this.a = i;
        this.b = u9n1Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a);
        j541.E(parcel, 2, this.b, i);
        j541.M(iL, parcel);
    }
}
