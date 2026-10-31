package p;

import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cdo1 extends y9n1 {
    public final void g1(byte[] bArr, boolean z) {
        Parcel parcelA1 = a1();
        int i = zsn1.a;
        parcelA1.writeInt(z ? 1 : 0);
        parcelA1.writeByteArray(bArr);
        try {
            this.l.transact(1, parcelA1, null, 1);
        } finally {
            parcelA1.recycle();
        }
    }
}
