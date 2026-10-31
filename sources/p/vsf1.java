package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vsf1 implements Parcelable {
    public static final Parcelable.Creator<vsf1> CREATOR = new r8f1((byte) 18);
    public final boolean N0;
    public final boolean O0;
    public final boolean P0;
    public final boolean Q0;
    public final ugo0 R0;
    public final ok51 S0;
    public final boolean T0;
    public final boolean U0;
    public final boolean V0;
    public final g371 W0;
    public final boolean X;
    public final boolean X0;
    public final String Y;
    public final boolean Y0;
    public final boolean Z;
    public final boolean Z0;
    public final String a;
    public final boolean a1;
    public final String b;
    public final boolean b1;
    public final boolean c;
    public final boolean c1;
    public final String d;
    public final boolean d1;
    public final boolean e;
    public final boolean e1;
    public final boolean f;
    public final boolean f1;
    public final boolean g;
    public final p860 g1;
    public final boolean h;
    public final boolean h1;
    public final boolean i;
    public final String i1;
    public final boolean j1;
    public final boolean k1;
    public final boolean l1;
    public final boolean t;

    public /* synthetic */ vsf1(String str, String str2, boolean z, String str3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str4, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, ugo0 ugo0Var, ok51 ok51Var, boolean z13, g371 g371Var, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, p860 p860Var, String str5, boolean z22, boolean z23, int i, int i2) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? false : z5, (i & 256) != 0 ? false : z6, false, (i & 1024) != 0 ? false : z7, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? false : z8, (i & 8192) != 0 ? false : z9, (i & 16384) != 0 ? false : z10, (32768 & i) != 0 ? false : z11, (65536 & i) != 0 ? false : z12, (131072 & i) != 0 ? null : ugo0Var, (262144 & i) != 0 ? null : ok51Var, false, (1048576 & i) != 0, (2097152 & i) != 0 ? false : z13, (4194304 & i) != 0 ? new g371() : g371Var, (8388608 & i) != 0 ? false : z14, (16777216 & i) != 0 ? false : z15, (33554432 & i) != 0 ? false : z16, (67108864 & i) != 0 ? false : z17, (134217728 & i) != 0 ? false : z18, (268435456 & i) != 0 ? false : z19, (536870912 & i) != 0 ? false : z20, false, (i & Integer.MIN_VALUE) != 0 ? false : z21, (i2 & 1) != 0 ? null : p860Var, (i2 & 2) == 0, (i2 & 4) != 0 ? null : str5, (i2 & 8) != 0 ? false : z22, (i2 & 16) == 0, (i2 & 32) != 0 ? false : z23);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsf1)) {
            return false;
        }
        vsf1 vsf1Var = (vsf1) obj;
        return u890.j(this.a, vsf1Var.a) && u890.j(this.b, vsf1Var.b) && this.c == vsf1Var.c && u890.j(this.d, vsf1Var.d) && this.e == vsf1Var.e && this.f == vsf1Var.f && this.g == vsf1Var.g && this.h == vsf1Var.h && this.i == vsf1Var.i && this.t == vsf1Var.t && this.X == vsf1Var.X && u890.j(this.Y, vsf1Var.Y) && this.Z == vsf1Var.Z && this.N0 == vsf1Var.N0 && this.O0 == vsf1Var.O0 && this.P0 == vsf1Var.P0 && this.Q0 == vsf1Var.Q0 && u890.j(this.R0, vsf1Var.R0) && u890.j(this.S0, vsf1Var.S0) && this.T0 == vsf1Var.T0 && this.U0 == vsf1Var.U0 && this.V0 == vsf1Var.V0 && u890.j(this.W0, vsf1Var.W0) && this.X0 == vsf1Var.X0 && this.Y0 == vsf1Var.Y0 && this.Z0 == vsf1Var.Z0 && this.a1 == vsf1Var.a1 && this.b1 == vsf1Var.b1 && this.c1 == vsf1Var.c1 && this.d1 == vsf1Var.d1 && this.e1 == vsf1Var.e1 && this.f1 == vsf1Var.f1 && u890.j(this.g1, vsf1Var.g1) && this.h1 == vsf1Var.h1 && u890.j(this.i1, vsf1Var.i1) && this.j1 == vsf1Var.j1 && this.k1 == vsf1Var.k1 && this.l1 == vsf1Var.l1;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int iG2 = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iG + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.t), 31, this.X);
        String str3 = this.Y;
        int iG3 = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iG2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.Z), 31, this.N0), 31, this.O0), 31, this.P0), 31, this.Q0);
        ugo0 ugo0Var = this.R0;
        int iHashCode2 = (iG3 + (ugo0Var == null ? 0 : ugo0Var.hashCode())) * 31;
        ok51 ok51Var = this.S0;
        int iG4 = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(f4i1.b(xcg1.g(xcg1.g(xcg1.g((iHashCode2 + (ok51Var == null ? 0 : ok51Var.hashCode())) * 31, 31, this.T0), 31, this.U0), 31, this.V0), 31, this.W0.a), 31, this.X0), 31, this.Y0), 31, this.Z0), 31, this.a1), 31, this.b1), 31, this.c1), 31, this.d1), 31, this.e1), 31, this.f1);
        p860 p860Var = this.g1;
        int iG5 = xcg1.g((iG4 + (p860Var == null ? 0 : p860Var.hashCode())) * 31, 31, this.h1);
        String str4 = this.i1;
        return Boolean.hashCode(this.l1) + xcg1.g(xcg1.g((iG5 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.j1), 31, this.k1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeString(this.Y);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeInt(this.N0 ? 1 : 0);
        parcel.writeInt(this.O0 ? 1 : 0);
        parcel.writeInt(this.P0 ? 1 : 0);
        parcel.writeInt(this.Q0 ? 1 : 0);
        parcel.writeParcelable(this.R0, i);
        parcel.writeParcelable(this.S0, i);
        parcel.writeInt(this.T0 ? 1 : 0);
        parcel.writeInt(this.U0 ? 1 : 0);
        parcel.writeInt(this.V0 ? 1 : 0);
        parcel.writeParcelable(this.W0, i);
        parcel.writeInt(this.X0 ? 1 : 0);
        parcel.writeInt(this.Y0 ? 1 : 0);
        parcel.writeInt(this.Z0 ? 1 : 0);
        parcel.writeInt(this.a1 ? 1 : 0);
        parcel.writeInt(this.b1 ? 1 : 0);
        parcel.writeInt(this.c1 ? 1 : 0);
        parcel.writeInt(this.d1 ? 1 : 0);
        parcel.writeInt(this.e1 ? 1 : 0);
        parcel.writeInt(this.f1 ? 1 : 0);
        parcel.writeParcelable(this.g1, i);
        parcel.writeInt(this.h1 ? 1 : 0);
        parcel.writeString(this.i1);
        parcel.writeInt(this.j1 ? 1 : 0);
        parcel.writeInt(this.k1 ? 1 : 0);
        parcel.writeInt(this.l1 ? 1 : 0);
    }

    public vsf1(String str, String str2, boolean z, String str3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str4, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, ugo0 ugo0Var, ok51 ok51Var, boolean z14, boolean z15, boolean z16, g371 g371Var, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, p860 p860Var, boolean z26, String str5, boolean z27, boolean z28, boolean z29) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.t = z7;
        this.X = z8;
        this.Y = str4;
        this.Z = z9;
        this.N0 = z10;
        this.O0 = z11;
        this.P0 = z12;
        this.Q0 = z13;
        this.R0 = ugo0Var;
        this.S0 = ok51Var;
        this.T0 = z14;
        this.U0 = z15;
        this.V0 = z16;
        this.W0 = g371Var;
        this.X0 = z17;
        this.Y0 = z18;
        this.Z0 = z19;
        this.a1 = z20;
        this.b1 = z21;
        this.c1 = z22;
        this.d1 = z23;
        this.e1 = z24;
        this.f1 = z25;
        this.g1 = p860Var;
        this.h1 = z26;
        this.i1 = str5;
        this.j1 = z27;
        this.k1 = z28;
        this.l1 = z29;
    }
}
