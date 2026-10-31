package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ojf0 implements Parcelable {
    public static final Parcelable.Creator<ojf0> CREATOR = new j7f0((byte) 15);
    public final boolean N0;
    public final pfm0 O0;
    public final pfm0 P0;
    public final boolean Q0;
    public final boolean R0;
    public final dn21 S0;
    public final sr3 T0;
    public final List X;
    public final boolean Y;
    public final boolean Z;
    public final dof1 a;
    public final String b;
    public final xpf0 c;
    public final bff0 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final aog1 h;
    public final String i;
    public final xx81 t;

    public ojf0(dof1 dof1Var, String str, xpf0 xpf0Var, bff0 bff0Var, boolean z, boolean z2, boolean z3, aog1 aog1Var, String str2, xx81 xx81Var, List list, boolean z4, boolean z5, boolean z6, pfm0 pfm0Var, pfm0 pfm0Var2, boolean z7, boolean z8, dn21 dn21Var, sr3 sr3Var) {
        this.a = dof1Var;
        this.b = str;
        this.c = xpf0Var;
        this.d = bff0Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = aog1Var;
        this.i = str2;
        this.t = xx81Var;
        this.X = list;
        this.Y = z4;
        this.Z = z5;
        this.N0 = z6;
        this.O0 = pfm0Var;
        this.P0 = pfm0Var2;
        this.Q0 = z7;
        this.R0 = z8;
        this.S0 = dn21Var;
        this.T0 = sr3Var;
    }

    public static ojf0 a(ojf0 ojf0Var, dof1 dof1Var, String str, xpf0 xpf0Var, bff0 bff0Var, boolean z, aog1 aog1Var, String str2, xx81 xx81Var, List list, boolean z2, pfm0 pfm0Var, boolean z3, dn21 dn21Var, sr3 sr3Var, int i) {
        dof1 dof1Var2 = (i & 1) != 0 ? ojf0Var.a : dof1Var;
        String str3 = (i & 2) != 0 ? ojf0Var.b : str;
        xpf0 xpf0Var2 = (i & 4) != 0 ? ojf0Var.c : xpf0Var;
        bff0 bff0Var2 = (i & 8) != 0 ? ojf0Var.d : bff0Var;
        boolean z4 = ojf0Var.e;
        boolean z5 = (i & 32) != 0 ? ojf0Var.f : z;
        boolean z6 = ojf0Var.g;
        aog1 aog1Var2 = (i & 128) != 0 ? ojf0Var.h : aog1Var;
        String str4 = (i & 256) != 0 ? ojf0Var.i : str2;
        xx81 xx81Var2 = (i & 512) != 0 ? ojf0Var.t : xx81Var;
        List list2 = (i & 1024) != 0 ? ojf0Var.X : list;
        boolean z7 = ojf0Var.Y;
        boolean z8 = ojf0Var.Z;
        boolean z9 = (i & 8192) != 0 ? ojf0Var.N0 : z2;
        pfm0 pfm0Var2 = (i & 16384) != 0 ? ojf0Var.O0 : pfm0Var;
        pfm0 pfm0Var3 = ojf0Var.P0;
        boolean z10 = (i & 65536) != 0 ? ojf0Var.Q0 : z3;
        boolean z11 = ojf0Var.R0;
        dn21 dn21Var2 = (i & 262144) != 0 ? ojf0Var.S0 : dn21Var;
        sr3 sr3Var2 = (i & 524288) != 0 ? ojf0Var.T0 : sr3Var;
        ojf0Var.getClass();
        return new ojf0(dof1Var2, str3, xpf0Var2, bff0Var2, z4, z5, z6, aog1Var2, str4, xx81Var2, list2, z7, z8, z9, pfm0Var2, pfm0Var3, z10, z11, dn21Var2, sr3Var2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojf0)) {
            return false;
        }
        ojf0 ojf0Var = (ojf0) obj;
        return u890.j(this.a, ojf0Var.a) && u890.j(this.b, ojf0Var.b) && u890.j(this.c, ojf0Var.c) && u890.j(this.d, ojf0Var.d) && this.e == ojf0Var.e && this.f == ojf0Var.f && this.g == ojf0Var.g && u890.j(this.h, ojf0Var.h) && u890.j(this.i, ojf0Var.i) && u890.j(this.t, ojf0Var.t) && this.X.equals(ojf0Var.X) && this.Y == ojf0Var.Y && this.Z == ojf0Var.Z && this.N0 == ojf0Var.N0 && u890.j(this.O0, ojf0Var.O0) && u890.j(this.P0, ojf0Var.P0) && this.Q0 == ojf0Var.Q0 && this.R0 == ojf0Var.R0 && u890.j(this.S0, ojf0Var.S0) && u890.j(this.T0, ojf0Var.T0);
    }

    public final int hashCode() {
        int iHashCode = (this.h.hashCode() + xcg1.g(xcg1.g(xcg1.g((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g)) * 31;
        String str = this.i;
        int iG = xcg1.g(xcg1.g((this.P0.hashCode() + ((this.O0.hashCode() + xcg1.g(xcg1.g(xcg1.g(f4i1.b((this.t.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.X), 31, this.Y), 31, this.Z), 31, this.N0)) * 31)) * 31, 31, this.Q0), 31, this.R0);
        dn21 dn21Var = this.S0;
        int iHashCode2 = (iG + (dn21Var == null ? 0 : dn21Var.hashCode())) * 31;
        sr3 sr3Var = this.T0;
        return iHashCode2 + (sr3Var != null ? sr3Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeParcelable(this.h, i);
        parcel.writeString(this.i);
        parcel.writeParcelable(this.t, i);
        Iterator itM = kk0.m(parcel, this.X);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeInt(this.N0 ? 1 : 0);
        parcel.writeParcelable(this.O0, i);
        parcel.writeParcelable(this.P0, i);
        parcel.writeInt(this.Q0 ? 1 : 0);
        parcel.writeInt(this.R0 ? 1 : 0);
        dn21 dn21Var = this.S0;
        if (dn21Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dn21Var.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.T0, i);
    }
}
