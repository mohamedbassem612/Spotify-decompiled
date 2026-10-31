package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g9o1 extends u9 {
    public static final Parcelable.Creator<g9o1> CREATOR = new w2o1((byte) 24);
    public final int a;
    public final k3o1 b;

    public g9o1(int i, k3o1 k3o1Var) {
        this.a = i;
        this.b = k3o1Var;
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
