package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fco1 extends u9 {
    public static final Parcelable.Creator<fco1> CREATOR = new sao1(9);
    public final int a;
    public final boolean b;
    public final ArrayList c;
    public final int d;
    public final String e;
    public final boolean f;

    public fco1(int i, boolean z, ArrayList arrayList, int i2, String str, boolean z2) {
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        this.a = i;
        this.b = z;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.d = i2;
        this.e = str;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.a);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        j541.H(parcel, 4, this.c);
        j541.K(parcel, 5, 4);
        parcel.writeInt(this.d);
        j541.F(parcel, 6, this.e);
        j541.K(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        j541.M(iL, parcel);
    }
}
