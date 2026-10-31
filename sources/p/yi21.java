package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yi21 implements Parcelable {
    public static final Parcelable.Creator<yi21> CREATOR = new g321((byte) 2);
    public final String a;
    public final String b;
    public final sqw0 c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final s7a g;
    public final String h;
    public final zr10 i;
    public final boolean t;

    public yi21(String str, String str2, sqw0 sqw0Var, String str3, boolean z, boolean z2, s7a s7aVar, String str4, zr10 zr10Var, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = sqw0Var;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = s7aVar;
        this.h = str4;
        this.i = zr10Var;
        this.t = z3;
    }

    public static yi21 a(yi21 yi21Var, sqw0 sqw0Var, String str, boolean z, boolean z2, s7a s7aVar, zr10 zr10Var, boolean z3, int i) {
        String str2 = yi21Var.a;
        String str3 = yi21Var.b;
        if ((i & 4) != 0) {
            sqw0Var = yi21Var.c;
        }
        sqw0 sqw0Var2 = sqw0Var;
        if ((i & 8) != 0) {
            str = yi21Var.d;
        }
        String str4 = str;
        if ((i & 16) != 0) {
            z = yi21Var.e;
        }
        return new yi21(str2, str3, sqw0Var2, str4, z, (i & 32) != 0 ? yi21Var.f : z2, (i & 64) != 0 ? yi21Var.g : s7aVar, yi21Var.h, (i & 256) != 0 ? yi21Var.i : zr10Var, (i & 512) != 0 ? yi21Var.t : z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi21)) {
            return false;
        }
        yi21 yi21Var = (yi21) obj;
        return u890.j(this.a, yi21Var.a) && u890.j(this.b, yi21Var.b) && u890.j(this.c, yi21Var.c) && u890.j(this.d, yi21Var.d) && this.e == yi21Var.e && this.f == yi21Var.f && u890.j(this.g, yi21Var.g) && u890.j(this.h, yi21Var.h) && u890.j(this.i, yi21Var.i) && this.t == yi21Var.t;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.t) + ((this.i.hashCode() + cy30.d((this.g.hashCode() + xcg1.g(xcg1.g(cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeParcelable(this.g, i);
        parcel.writeString(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeInt(this.t ? 1 : 0);
    }
}
