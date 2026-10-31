package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kep1 extends u9 {
    public static final Parcelable.Creator<kep1> CREATOR = new hep1(1);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;
    public final String f;
    public final boolean g;

    public kep1(int i, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
        this.e = i;
        this.d = z;
        this.g = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 1, this.a);
        j541.F(parcel, 2, this.b);
        j541.F(parcel, 3, this.c);
        j541.K(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j541.K(parcel, 5, 4);
        parcel.writeInt(this.e);
        j541.F(parcel, 6, this.f);
        j541.K(parcel, 7, 4);
        parcel.writeInt(this.g ? 1 : 0);
        j541.M(iL, parcel);
    }
}
