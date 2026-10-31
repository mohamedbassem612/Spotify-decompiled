package p;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class idp1 extends y9n1 {
    public idp1(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizer", (byte) 4);
    }

    public final gep1 g1(qfp0 qfp0Var, zcp1 zcp1Var) {
        Parcel parcelA1 = a1();
        int i = usn1.a;
        parcelA1.writeStrongBinder(qfp0Var);
        parcelA1.writeInt(1);
        zcp1Var.writeToParcel(parcelA1, 0);
        Parcel parcelB1 = b1(3, parcelA1);
        gep1 gep1VarCreateFromParcel = parcelB1.readInt() == 0 ? null : gep1.CREATOR.createFromParcel(parcelB1);
        parcelB1.recycle();
        return gep1VarCreateFromParcel;
    }

    public final void h1() {
        c1(1, a1());
    }

    public final void i1() {
        c1(2, a1());
    }
}
