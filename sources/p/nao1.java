package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nao1 extends u9 {
    public static final Parcelable.Creator<nao1> CREATOR = new sao1((byte) 0);
    public final int a;
    public final List b;
    public final List c;

    public nao1(ArrayList arrayList, ArrayList arrayList2, int i) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a);
        j541.H(parcel, 2, this.b);
        j541.H(parcel, 3, this.c);
        j541.M(iL, parcel);
    }
}
