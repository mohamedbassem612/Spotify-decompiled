package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class m3x0 implements Parcelable {
    public static final Parcelable.Creator<m3x0> CREATOR = new wvw0((byte) 6);
    public final String N0;
    public final int O0;
    public final boolean P0;
    public final String Q0;
    public final String R0;
    public final String S0;
    public final boolean T0;
    public final String U0;
    public final String V0;
    public final boolean W0;
    public final q730 X;
    public final l3x0 X0;
    public final boolean Y;
    public final boolean Y0;
    public final boolean Z;
    public final boolean Z0;
    public final String a;
    public final boolean a1;
    public final String b;
    public final boolean b1;
    public final String c;
    public final boolean c1;
    public final String d;
    public final Boolean d1;
    public final boolean e;
    public final String e1;
    public final boolean f;
    public final boolean f1;
    public final boolean g;
    public final boolean g1;
    public final boolean h;
    public final boolean h1;
    public final int i;
    public final String i1;
    public final String j1;
    public final int k1;
    public final int t;

    public /* synthetic */ m3x0(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2) {
        this(1, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, "", null, false, false, false, true, 0, 0, new q730(0, 15), true, true, null, 0, (i & 65536) != 0 ? false : z, null, null, null, (i & 1048576) != 0 ? false : z2, null, "", false, null, false, (i & 67108864) != 0 ? false : z3, false, (i & 268435456) != 0 ? false : z4, (i & 536870912) != 0 ? false : z5, null, null, (i2 & 1) != 0 ? false : z6, false, false, null);
    }

    public static m3x0 a(m3x0 m3x0Var, int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i2, int i3, q730 q730Var, boolean z5, boolean z6, String str3, int i4, String str4, String str5, String str6, String str7, String str8, boolean z7, l3x0 l3x0Var, boolean z8, boolean z9, Boolean bool, String str9, boolean z10, boolean z11, String str10, int i5, int i6) {
        int i7 = (i5 & 1) != 0 ? m3x0Var.k1 : i;
        String str11 = m3x0Var.a;
        String str12 = m3x0Var.b;
        String str13 = (i5 & 8) != 0 ? m3x0Var.c : str;
        String str14 = (i5 & 16) != 0 ? m3x0Var.d : str2;
        boolean z12 = (i5 & 32) != 0 ? m3x0Var.e : z;
        boolean z13 = (i5 & 64) != 0 ? m3x0Var.f : z2;
        boolean z14 = (i5 & 128) != 0 ? m3x0Var.g : z3;
        boolean z15 = (i5 & 256) != 0 ? m3x0Var.h : z4;
        int i8 = (i5 & 512) != 0 ? m3x0Var.i : i2;
        int i9 = (i5 & 1024) != 0 ? m3x0Var.t : i3;
        q730 q730Var2 = (i5 & 2048) != 0 ? m3x0Var.X : q730Var;
        boolean z16 = (i5 & 4096) != 0 ? m3x0Var.Y : z5;
        boolean z17 = (i5 & 8192) != 0 ? m3x0Var.Z : z6;
        String str15 = (i5 & 16384) != 0 ? m3x0Var.N0 : str3;
        int i10 = (32768 & i5) != 0 ? m3x0Var.O0 : i4;
        boolean z18 = m3x0Var.P0;
        String str16 = (131072 & i5) != 0 ? m3x0Var.Q0 : str4;
        String str17 = (262144 & i5) != 0 ? m3x0Var.R0 : str5;
        String str18 = (524288 & i5) != 0 ? m3x0Var.S0 : str6;
        boolean z19 = m3x0Var.T0;
        String str19 = (i5 & 2097152) != 0 ? m3x0Var.U0 : str7;
        String str20 = (i5 & 4194304) != 0 ? m3x0Var.V0 : str8;
        boolean z20 = (i5 & 8388608) != 0 ? m3x0Var.W0 : z7;
        l3x0 l3x0Var2 = (i5 & 16777216) != 0 ? m3x0Var.X0 : l3x0Var;
        boolean z21 = (i5 & 33554432) != 0 ? m3x0Var.Y0 : z8;
        boolean z22 = m3x0Var.Z0;
        boolean z23 = (i5 & 134217728) != 0 ? m3x0Var.a1 : z9;
        boolean z24 = m3x0Var.b1;
        boolean z25 = m3x0Var.c1;
        Boolean bool2 = (i5 & 1073741824) != 0 ? m3x0Var.d1 : bool;
        String str21 = (i5 & Integer.MIN_VALUE) != 0 ? m3x0Var.e1 : str9;
        boolean z26 = m3x0Var.f1;
        boolean z27 = (i6 & 2) != 0 ? m3x0Var.g1 : z10;
        boolean z28 = (i6 & 4) != 0 ? m3x0Var.h1 : z11;
        String str22 = (i6 & 8) != 0 ? m3x0Var.i1 : str10;
        m3x0Var.getClass();
        return new m3x0(i7, str11, str12, str13, str14, z12, z13, z14, z15, i8, i9, q730Var2, z16, z17, str15, i10, z18, str16, str17, str18, z19, str19, str20, z20, l3x0Var2, z21, z22, z23, z24, z25, bool2, str21, z26, z27, z28, str22);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3x0)) {
            return false;
        }
        m3x0 m3x0Var = (m3x0) obj;
        return this.k1 == m3x0Var.k1 && u890.j(this.a, m3x0Var.a) && u890.j(this.b, m3x0Var.b) && u890.j(this.c, m3x0Var.c) && u890.j(this.d, m3x0Var.d) && this.e == m3x0Var.e && this.f == m3x0Var.f && this.g == m3x0Var.g && this.h == m3x0Var.h && this.i == m3x0Var.i && this.t == m3x0Var.t && u890.j(this.X, m3x0Var.X) && this.Y == m3x0Var.Y && this.Z == m3x0Var.Z && u890.j(this.N0, m3x0Var.N0) && this.O0 == m3x0Var.O0 && this.P0 == m3x0Var.P0 && u890.j(this.Q0, m3x0Var.Q0) && u890.j(this.R0, m3x0Var.R0) && u890.j(this.S0, m3x0Var.S0) && this.T0 == m3x0Var.T0 && u890.j(this.U0, m3x0Var.U0) && u890.j(this.V0, m3x0Var.V0) && this.W0 == m3x0Var.W0 && u890.j(this.X0, m3x0Var.X0) && this.Y0 == m3x0Var.Y0 && this.Z0 == m3x0Var.Z0 && this.a1 == m3x0Var.a1 && this.b1 == m3x0Var.b1 && this.c1 == m3x0Var.c1 && u890.j(this.d1, m3x0Var.d1) && u890.j(this.e1, m3x0Var.e1) && this.f1 == m3x0Var.f1 && this.g1 == m3x0Var.g1 && this.h1 == m3x0Var.h1 && u890.j(this.i1, m3x0Var.i1);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(l1d.C(this.k1) * 31, 31, this.a), 31, this.b), 31, this.c);
        String str = this.d;
        int iG = xcg1.g(xcg1.g((this.X.hashCode() + kaa0.f(this.t, kaa0.f(this.i, xcg1.g(xcg1.g(xcg1.g(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31)) * 31, 31, this.Y), 31, this.Z);
        String str2 = this.N0;
        int iG2 = xcg1.g(kaa0.f(this.O0, (iG + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.P0);
        String str3 = this.Q0;
        int iHashCode = (iG2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.R0;
        int iHashCode2 = (iHashCode + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.S0;
        int iG3 = xcg1.g((iHashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.T0);
        String str6 = this.U0;
        int iG4 = xcg1.g(cy30.d((iG3 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.V0), 31, this.W0);
        l3x0 l3x0Var = this.X0;
        int iG5 = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iG4 + (l3x0Var == null ? 0 : l3x0Var.hashCode())) * 31, 31, this.Y0), 31, this.Z0), 31, this.a1), 31, this.b1), 31, this.c1);
        Boolean bool = this.d1;
        int iHashCode3 = (iG5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.e1;
        int iG6 = xcg1.g(xcg1.g(xcg1.g((iHashCode3 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.f1), 31, this.g1), 31, this.h1);
        String str8 = this.i1;
        return iG6 + (str8 != null ? str8.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.k1;
        if (i2 == 1) {
            str = "NOT_LOADED";
        } else if (i2 == 2) {
            str = "LOADING";
        } else if (i2 == 3) {
            str = "LOADED";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "FAILED";
        }
        parcel.writeString(str);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i);
        parcel.writeInt(this.t);
        parcel.writeParcelable(this.X, i);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeString(this.N0);
        parcel.writeInt(this.O0);
        parcel.writeInt(this.P0 ? 1 : 0);
        parcel.writeString(this.Q0);
        parcel.writeString(this.R0);
        parcel.writeString(this.S0);
        parcel.writeInt(this.T0 ? 1 : 0);
        parcel.writeString(this.U0);
        parcel.writeString(this.V0);
        parcel.writeInt(this.W0 ? 1 : 0);
        l3x0 l3x0Var = this.X0;
        if (l3x0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            l3x0Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.Y0 ? 1 : 0);
        parcel.writeInt(this.Z0 ? 1 : 0);
        parcel.writeInt(this.a1 ? 1 : 0);
        parcel.writeInt(this.b1 ? 1 : 0);
        parcel.writeInt(this.c1 ? 1 : 0);
        Boolean bool = this.d1;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool);
        }
        parcel.writeString(this.e1);
        parcel.writeInt(this.f1 ? 1 : 0);
        parcel.writeInt(this.g1 ? 1 : 0);
        parcel.writeInt(this.h1 ? 1 : 0);
        parcel.writeString(this.i1);
    }

    public m3x0(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, int i2, int i3, q730 q730Var, boolean z5, boolean z6, String str5, int i4, boolean z7, String str6, String str7, String str8, boolean z8, String str9, String str10, boolean z9, l3x0 l3x0Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Boolean bool, String str11, boolean z15, boolean z16, boolean z17, String str12) {
        this.k1 = i;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = i2;
        this.t = i3;
        this.X = q730Var;
        this.Y = z5;
        this.Z = z6;
        this.N0 = str5;
        this.O0 = i4;
        this.P0 = z7;
        this.Q0 = str6;
        this.R0 = str7;
        this.S0 = str8;
        this.T0 = z8;
        this.U0 = str9;
        this.V0 = str10;
        this.W0 = z9;
        this.X0 = l3x0Var;
        this.Y0 = z10;
        this.Z0 = z11;
        this.a1 = z12;
        this.b1 = z13;
        this.c1 = z14;
        this.d1 = bool;
        this.e1 = str11;
        this.f1 = z15;
        this.g1 = z16;
        this.h1 = z17;
        this.i1 = str12;
        Set set = s4b1.f;
        this.j1 = uic.C(str, (String) null).z();
    }
}
