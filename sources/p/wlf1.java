package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wlf1 implements Parcelable {
    public static final Parcelable.Creator<wlf1> CREATOR = new r8f1((byte) 12);
    public final boolean N0;
    public final boolean O0;
    public final boolean P0;
    public final String Q0;
    public final boolean R0;
    public final boolean S0;
    public final boolean T0;
    public final boolean U0;
    public final boolean V0;
    public final List W0;
    public final boolean X;
    public final String X0;
    public final boolean Y;
    public final boolean Z;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final k4m e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean t;

    public wlf1(String str, String str2, String str3, String str4, k4m k4mVar, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str5, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, List list, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = k4mVar;
        this.f = i;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.t = z4;
        this.X = z5;
        this.Y = z6;
        this.Z = z7;
        this.N0 = z8;
        this.O0 = z9;
        this.P0 = z10;
        this.Q0 = str5;
        this.R0 = z11;
        this.S0 = z12;
        this.T0 = z13;
        this.U0 = z14;
        this.V0 = z15;
        this.W0 = list;
        this.X0 = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlf1)) {
            return false;
        }
        wlf1 wlf1Var = (wlf1) obj;
        return u890.j(this.a, wlf1Var.a) && u890.j(this.b, wlf1Var.b) && u890.j(this.c, wlf1Var.c) && u890.j(this.d, wlf1Var.d) && this.e == wlf1Var.e && this.f == wlf1Var.f && this.g == wlf1Var.g && this.h == wlf1Var.h && this.i == wlf1Var.i && this.t == wlf1Var.t && this.X == wlf1Var.X && this.Y == wlf1Var.Y && this.Z == wlf1Var.Z && this.N0 == wlf1Var.N0 && this.O0 == wlf1Var.O0 && this.P0 == wlf1Var.P0 && u890.j(this.Q0, wlf1Var.Q0) && this.R0 == wlf1Var.R0 && this.S0 == wlf1Var.S0 && this.T0 == wlf1Var.T0 && this.U0 == wlf1Var.U0 && this.V0 == wlf1Var.V0 && u890.j(this.W0, wlf1Var.W0) && u890.j(this.X0, wlf1Var.X0);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.X0.hashCode() + f4i1.b(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(ab80.k(this.f, p3d1.g(this.e, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.t), 31, this.X), 31, this.Y), 31, this.Z), 31, this.N0), 31, this.O0), 31, this.P0), 31, this.Q0), 31, this.R0), 31, this.S0), 31, this.T0), 31, this.U0), 31, this.V0), 31, this.W0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e.name());
        parcel.writeString(fd21.o(this.f));
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeInt(this.N0 ? 1 : 0);
        parcel.writeInt(this.O0 ? 1 : 0);
        parcel.writeInt(this.P0 ? 1 : 0);
        parcel.writeString(this.Q0);
        parcel.writeInt(this.R0 ? 1 : 0);
        parcel.writeInt(this.S0 ? 1 : 0);
        parcel.writeInt(this.T0 ? 1 : 0);
        parcel.writeInt(this.U0 ? 1 : 0);
        parcel.writeInt(this.V0 ? 1 : 0);
        Iterator itM = kk0.m(parcel, this.W0);
        while (itM.hasNext()) {
            ((gp51) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.X0);
    }
}
