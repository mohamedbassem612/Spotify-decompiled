package p;

import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rgn1 extends y9n1 implements zhn1 {
    public final void g1(yz5 yz5Var, String str, String str2, boolean z) {
        Parcel parcelA1 = a1();
        osn1.b(parcelA1, yz5Var);
        parcelA1.writeString(str);
        parcelA1.writeString(str2);
        parcelA1.writeInt(z ? 1 : 0);
        c1(4, parcelA1);
    }

    public final void h1(int i) {
        Parcel parcelA1 = a1();
        parcelA1.writeInt(i);
        c1(5, parcelA1);
    }
}
