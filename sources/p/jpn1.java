package p;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jpn1 extends y9n1 {
    public jpn1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", (byte) 1);
    }

    public final vh70 g1() {
        Parcel parcelB1 = b1(2, a1());
        vh70 vh70VarB1 = qfp0.b1(parcelB1.readStrongBinder());
        parcelB1.recycle();
        return vh70VarB1;
    }
}
