package p;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pio1 extends y9n1 implements npo1 {
    public final yeo1 g1(qfp0 qfp0Var, e1p1 e1p1Var) {
        yeo1 yeo1Var;
        Parcel parcelA1 = a1();
        int i = usn1.a;
        parcelA1.writeStrongBinder(qfp0Var);
        parcelA1.writeInt(1);
        e1p1Var.writeToParcel(parcelA1, 0);
        Parcel parcelB1 = b1(1, parcelA1);
        IBinder strongBinder = parcelB1.readStrongBinder();
        if (strongBinder == null) {
            yeo1Var = null;
        } else {
            Object objQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
            yeo1Var = objQueryLocalInterface instanceof yeo1 ? (yeo1) objQueryLocalInterface : new yeo1(strongBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer", (byte) 4);
        }
        parcelB1.recycle();
        return yeo1Var;
    }
}
