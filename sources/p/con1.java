package p;

import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class con1 extends y9n1 implements ion1 {
    public final int g1() {
        Parcel parcelB1 = b1(17, a1());
        int i = parcelB1.readInt();
        parcelB1.recycle();
        return i;
    }

    public final vh70 h1() {
        Parcel parcelB1 = b1(1, a1());
        vh70 vh70VarB1 = qfp0.b1(parcelB1.readStrongBinder());
        parcelB1.recycle();
        return vh70VarB1;
    }

    public final boolean i1() {
        Parcel parcelB1 = b1(5, a1());
        int i = osn1.a;
        boolean z = parcelB1.readInt() != 0;
        parcelB1.recycle();
        return z;
    }

    public final boolean j1() {
        Parcel parcelB1 = b1(9, a1());
        int i = osn1.a;
        boolean z = parcelB1.readInt() != 0;
        parcelB1.recycle();
        return z;
    }

    public final int k1() {
        Parcel parcelB1 = b1(18, a1());
        int i = parcelB1.readInt();
        parcelB1.recycle();
        return i;
    }

    public final void l1() {
        Parcel parcelA1 = a1();
        parcelA1.writeInt(2151);
        c1(12, parcelA1);
    }

    public final void m1(int i) {
        Parcel parcelA1 = a1();
        parcelA1.writeInt(i);
        c1(13, parcelA1);
    }

    public final void n1() {
        Parcel parcelA1 = a1();
        parcelA1.writeInt(2153);
        c1(15, parcelA1);
    }
}
