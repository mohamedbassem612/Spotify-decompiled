package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uoj0 extends u9 {
    public static final Parcelable.Creator<uoj0> CREATOR = new e9n1(4);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public uoj0(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
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
        j541.K(parcel, 4, 8);
        parcel.writeLong(this.d);
        j541.K(parcel, 5, 8);
        parcel.writeLong(this.e);
        j541.F(parcel, 6, this.f);
        j541.F(parcel, 7, this.g);
        j541.K(parcel, 8, 4);
        parcel.writeInt(this.h);
        j541.K(parcel, 9, 4);
        parcel.writeInt(this.i);
        j541.M(iL, parcel);
    }
}
