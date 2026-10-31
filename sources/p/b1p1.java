package p;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b1p1 extends y9n1 {
    public b1p1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", (byte) 2);
    }

    public final vh70 g1(qfp0 qfp0Var, String str, int i) {
        Parcel parcelA1 = a1();
        psn1.b(parcelA1, qfp0Var);
        parcelA1.writeString(str);
        parcelA1.writeInt(i);
        Parcel parcelX0 = X0(2, parcelA1);
        vh70 vh70VarB1 = qfp0.b1(parcelX0.readStrongBinder());
        parcelX0.recycle();
        return vh70VarB1;
    }

    public final int h1(qfp0 qfp0Var, String str, boolean z) {
        Parcel parcelA1 = a1();
        psn1.b(parcelA1, qfp0Var);
        parcelA1.writeString(str);
        parcelA1.writeInt(z ? 1 : 0);
        Parcel parcelX0 = X0(3, parcelA1);
        int i = parcelX0.readInt();
        parcelX0.recycle();
        return i;
    }

    public final vh70 i1(qfp0 qfp0Var, String str, int i) {
        Parcel parcelA1 = a1();
        psn1.b(parcelA1, qfp0Var);
        parcelA1.writeString(str);
        parcelA1.writeInt(i);
        Parcel parcelX0 = X0(4, parcelA1);
        vh70 vh70VarB1 = qfp0.b1(parcelX0.readStrongBinder());
        parcelX0.recycle();
        return vh70VarB1;
    }

    public final int j1(qfp0 qfp0Var, String str, boolean z) {
        Parcel parcelA1 = a1();
        psn1.b(parcelA1, qfp0Var);
        parcelA1.writeString(str);
        parcelA1.writeInt(z ? 1 : 0);
        Parcel parcelX0 = X0(5, parcelA1);
        int i = parcelX0.readInt();
        parcelX0.recycle();
        return i;
    }

    public final int k1() {
        Parcel parcelX0 = X0(6, a1());
        int i = parcelX0.readInt();
        parcelX0.recycle();
        return i;
    }

    public final vh70 l1(qfp0 qfp0Var, String str, boolean z, long j) {
        Parcel parcelA1 = a1();
        psn1.b(parcelA1, qfp0Var);
        parcelA1.writeString(str);
        parcelA1.writeInt(z ? 1 : 0);
        parcelA1.writeLong(j);
        Parcel parcelX0 = X0(7, parcelA1);
        vh70 vh70VarB1 = qfp0.b1(parcelX0.readStrongBinder());
        parcelX0.recycle();
        return vh70VarB1;
    }

    public final vh70 m1(qfp0 qfp0Var, String str, int i, qfp0 qfp0Var2) {
        Parcel parcelA1 = a1();
        psn1.b(parcelA1, qfp0Var);
        parcelA1.writeString(str);
        parcelA1.writeInt(i);
        psn1.b(parcelA1, qfp0Var2);
        Parcel parcelX0 = X0(8, parcelA1);
        vh70 vh70VarB1 = qfp0.b1(parcelX0.readStrongBinder());
        parcelX0.recycle();
        return vh70VarB1;
    }
}
