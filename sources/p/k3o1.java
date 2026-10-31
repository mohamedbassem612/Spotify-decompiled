package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k3o1 extends u9 {
    public static final Parcelable.Creator<k3o1> CREATOR = new w2o1((byte) 2);
    public final byte[] a;

    public k3o1(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.v(parcel, 1, (byte[]) this.a.clone());
        j541.M(iL, parcel);
    }
}
