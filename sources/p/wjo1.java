package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wjo1 extends u9 {
    public static final Parcelable.Creator<wjo1> CREATOR = new sao1((byte) 23);
    public final byte[] a;

    public wjo1(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.v(parcel, 1, this.a);
        j541.M(iL, parcel);
    }
}
