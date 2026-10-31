package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v0p1 extends u9 {
    public static final Parcelable.Creator<v0p1> CREATOR = new hmo1((byte) 17);
    public final int a;
    public final List b;
    public final nro1 c;

    public v0p1(int i, ArrayList arrayList, nro1 nro1Var) {
        this.a = i;
        this.b = arrayList;
        this.c = nro1Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a);
        j541.J(parcel, 2, this.b);
        j541.E(parcel, 3, this.c, i);
        j541.M(iL, parcel);
    }
}
