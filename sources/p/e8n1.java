package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e8n1 extends u9 {
    public static final Parcelable.Creator<e8n1> CREATOR = new ynm1((byte) 25);
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final boolean e;

    public e8n1(int i, String str, long j, int i2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a);
        j541.F(parcel, 2, this.b);
        j541.K(parcel, 3, 8);
        parcel.writeLong(this.c);
        j541.K(parcel, 4, 4);
        parcel.writeInt(this.d);
        j541.K(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        j541.M(iL, parcel);
    }
}
