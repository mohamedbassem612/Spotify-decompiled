package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dlo1 extends u9 {
    public static final Parcelable.Creator<dlo1> CREATOR = new agm0((byte) 24);
    public final int a;
    public final int b;
    public final byte[] c;

    public dlo1(int i, byte[] bArr, int i2) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.b);
        j541.v(parcel, 3, this.c);
        j541.M(iL, parcel);
    }
}
