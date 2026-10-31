package p;

import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wbp1 extends mh70 {
    public final /* synthetic */ b4e l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbp1(b4e b4eVar) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", (byte) 3);
        this.l = b4eVar;
    }

    public final boolean Y0(int i, Parcel parcel, Parcel parcel2) {
        b4e b4eVar = this.l;
        if (i == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            osn1.d(parcel);
            arn1 arn1Var = b4eVar.i;
            if (arn1Var != null && arn1Var.k()) {
                b4eVar.i.u(string, string2).b(new csj1(this, (byte) 15));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            String string3 = parcel.readString();
            ckb0 ckb0Var = (ckb0) osn1.a(parcel, ckb0.CREATOR);
            osn1.d(parcel);
            arn1 arn1Var2 = b4eVar.i;
            if (arn1Var2 != null && arn1Var2.k()) {
                b4eVar.i.q(string3, ckb0Var).b(new qeh1(this, (byte) 20));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 3) {
            String string4 = parcel.readString();
            osn1.d(parcel);
            arn1 arn1Var3 = b4eVar.i;
            if (arn1Var3 != null && arn1Var3.k()) {
                b4eVar.i.r(string4);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 4) {
            if (i != 5) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
            return true;
        }
        int i2 = parcel.readInt();
        osn1.d(parcel);
        b4eVar.h.b(i2);
        arn1 arn1Var4 = b4eVar.i;
        if (arn1Var4 != null) {
            arn1Var4.o();
            b4eVar.i = null;
        }
        b4eVar.k = null;
        e321 e321Var = b4eVar.j;
        if (e321Var != null) {
            e321Var.n((arn1) null);
            b4eVar.j = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
