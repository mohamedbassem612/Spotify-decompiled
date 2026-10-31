package p;

import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tpn1 extends y9n1 {
    public final ion1 g1(String str, String str2, cjn1 cjn1Var) {
        Parcel parcelA1 = a1();
        parcelA1.writeString(str);
        parcelA1.writeString(str2);
        osn1.c(parcelA1, cjn1Var);
        Parcel parcelB1 = b1(2, parcelA1);
        ion1 ion1VarB1 = fon1.b1(parcelB1.readStrongBinder());
        parcelB1.recycle();
        return ion1VarB1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zhn1 h1(p3e p3eVar, vh70 vh70Var, wbp1 wbp1Var) {
        Parcel parcelA1 = a1();
        osn1.b(parcelA1, p3eVar);
        osn1.c(parcelA1, vh70Var);
        osn1.c(parcelA1, wbp1Var);
        Parcel parcelB1 = b1(3, parcelA1);
        zhn1 zhn1VarB1 = bhn1.b1(parcelB1.readStrongBinder());
        parcelB1.recycle();
        return zhn1VarB1;
    }

    public final jnn1 i1(qfp0 qfp0Var, vh70 vh70Var, vh70 vh70Var2) {
        Parcel parcelA1 = a1();
        osn1.c(parcelA1, qfp0Var);
        osn1.c(parcelA1, vh70Var);
        osn1.c(parcelA1, vh70Var2);
        Parcel parcelB1 = b1(5, parcelA1);
        jnn1 jnn1VarB1 = lmn1.b1(parcelB1.readStrongBinder());
        parcelB1.recycle();
        return jnn1VarB1;
    }

    public final obo1 j1(qfp0 qfp0Var, cjn1 cjn1Var, int i, int i2) {
        Parcel parcelA1 = a1();
        osn1.c(parcelA1, qfp0Var);
        osn1.c(parcelA1, cjn1Var);
        parcelA1.writeInt(i);
        parcelA1.writeInt(i2);
        parcelA1.writeInt(0);
        parcelA1.writeLong(2097152L);
        parcelA1.writeInt(5);
        parcelA1.writeInt(333);
        parcelA1.writeInt(10000);
        Parcel parcelB1 = b1(6, parcelA1);
        obo1 obo1VarB1 = f7o1.b1(parcelB1.readStrongBinder());
        parcelB1.recycle();
        return obo1VarB1;
    }

    public final obo1 k1(qfp0 qfp0Var, qfp0 qfp0Var2, cjn1 cjn1Var, int i, int i2) {
        Parcel parcelA1 = a1();
        osn1.c(parcelA1, qfp0Var);
        osn1.c(parcelA1, qfp0Var2);
        osn1.c(parcelA1, cjn1Var);
        parcelA1.writeInt(i);
        parcelA1.writeInt(i2);
        parcelA1.writeInt(0);
        parcelA1.writeLong(2097152L);
        parcelA1.writeInt(5);
        parcelA1.writeInt(333);
        parcelA1.writeInt(10000);
        Parcel parcelB1 = b1(7, parcelA1);
        obo1 obo1VarB1 = f7o1.b1(parcelB1.readStrongBinder());
        parcelB1.recycle();
        return obo1VarB1;
    }
}
