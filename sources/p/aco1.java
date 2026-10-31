package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aco1 extends u9 {
    public static final Parcelable.Creator<aco1> CREATOR = new sao1((byte) 8);
    public final int a;
    public final int b;
    public final byte[] c;

    public aco1(int i, byte[] bArr, int i2) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j541.j(parcel);
        j541.z(parcel, 1, this.a);
        j541.z(parcel, 2, this.b);
        j541.v(parcel, 3, this.c);
        j541.n(iJ, parcel);
    }
}
