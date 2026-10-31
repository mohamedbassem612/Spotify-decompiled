package p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kdp1 extends y9n1 implements odp1 {
    public final idp1 g1(qfp0 qfp0Var) {
        idp1 idp1Var;
        Parcel parcelA1 = a1();
        int i = usn1.a;
        parcelA1.writeStrongBinder(qfp0Var);
        Parcel parcelB1 = b1(1, parcelA1);
        IBinder strongBinder = parcelB1.readStrongBinder();
        if (strongBinder == null) {
            idp1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            idp1Var = iInterfaceQueryLocalInterface instanceof idp1 ? (idp1) iInterfaceQueryLocalInterface : new idp1(strongBinder);
        }
        parcelB1.recycle();
        return idp1Var;
    }

    public final idp1 h1(qfp0 qfp0Var, kep1 kep1Var) {
        idp1 idp1Var;
        Parcel parcelA1 = a1();
        int i = usn1.a;
        parcelA1.writeStrongBinder(qfp0Var);
        parcelA1.writeInt(1);
        kep1Var.writeToParcel(parcelA1, 0);
        Parcel parcelB1 = b1(2, parcelA1);
        IBinder strongBinder = parcelB1.readStrongBinder();
        if (strongBinder == null) {
            idp1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            idp1Var = iInterfaceQueryLocalInterface instanceof idp1 ? (idp1) iInterfaceQueryLocalInterface : new idp1(strongBinder);
        }
        parcelB1.recycle();
        return idp1Var;
    }
}
