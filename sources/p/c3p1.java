package p;

import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c3p1 extends y9n1 {
    public final vh70 g1(qfp0 qfp0Var, String str, int i, qfp0 qfp0Var2) {
        Parcel parcelA1 = a1();
        psn1.b(parcelA1, qfp0Var);
        parcelA1.writeString(str);
        parcelA1.writeInt(i);
        psn1.b(parcelA1, qfp0Var2);
        Parcel parcelX0 = X0(2, parcelA1);
        vh70 vh70VarB1 = qfp0.b1(parcelX0.readStrongBinder());
        parcelX0.recycle();
        return vh70VarB1;
    }

    public final vh70 h1(qfp0 qfp0Var, String str, int i, qfp0 qfp0Var2) {
        Parcel parcelA1 = a1();
        psn1.b(parcelA1, qfp0Var);
        parcelA1.writeString(str);
        parcelA1.writeInt(i);
        psn1.b(parcelA1, qfp0Var2);
        Parcel parcelX0 = X0(3, parcelA1);
        vh70 vh70VarB1 = qfp0.b1(parcelX0.readStrongBinder());
        parcelX0.recycle();
        return vh70VarB1;
    }
}
