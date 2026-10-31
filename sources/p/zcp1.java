package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zcp1 extends u9 {
    public static final Parcelable.Creator<zcp1> CREATOR = new hmo1(25);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public zcp1(int i, int i2, int i3, int i4, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.b);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.c);
        j541.K(parcel, 4, 4);
        parcel.writeInt(this.d);
        j541.K(parcel, 5, 8);
        parcel.writeLong(this.e);
        j541.M(iL, parcel);
    }
}
