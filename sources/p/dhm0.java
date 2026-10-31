package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dhm0 implements Parcelable {
    public static final Parcelable.Creator<dhm0> CREATOR = new w9k0((byte) 26);
    public final boolean N0;
    public final xbe0 O0;
    public final boolean P0;
    public final boolean Q0;
    public final List R0;
    public final String S0;
    public final wuz T0;
    public final int U0;
    public final List V0;
    public final String W0;
    public final boolean X;
    public final boolean Y;
    public final Set Z;
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Set i;
    public final Set t;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dhm0(String str, String str2, boolean z, boolean z2, String str3, boolean z3, boolean z4, boolean z5, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, boolean z6, boolean z7, LinkedHashSet linkedHashSet3, boolean z8, xbe0 xbe0Var, boolean z9, boolean z10, ArrayList arrayList, String str4, int i, int i2) {
        String str5 = (i2 & 1) != 0 ? "" : str;
        String str6 = (i2 & 2) != 0 ? "" : str2;
        boolean z11 = (i2 & 4) != 0 ? false : z;
        boolean z12 = (i2 & 8) != 0 ? false : z2;
        String str7 = (i2 & 16) != 0 ? "" : str3;
        boolean z13 = (i2 & 32) != 0 ? true : z3;
        boolean z14 = (i2 & 64) != 0 ? false : z4;
        boolean z15 = (i2 & 128) != 0 ? true : z5;
        int i3 = i2 & 256;
        LinkedHashSet linkedHashSet4 = w7x.a;
        this(str5, str6, z11, z12, str7, z13, z14, z15, i3 != 0 ? linkedHashSet4 : linkedHashSet, (i2 & 512) != 0 ? linkedHashSet4 : linkedHashSet2, (i2 & 1024) != 0 ? false : z6, (i2 & 2048) != 0 ? true : z7, (i2 & 4096) != 0 ? linkedHashSet4 : linkedHashSet3, (i2 & 8192) != 0 ? true : z8, (i2 & 16384) != 0 ? tbe0.a : xbe0Var, (32768 & i2) != 0 ? false : z9, (65536 & i2) != 0 ? false : z10, (131072 & i2) != 0 ? z6x.a : arrayList, (262144 & i2) != 0 ? "" : str4, (wuz) null, (i2 & 1048576) != 0 ? 6 : i);
    }

    public static dhm0 a(dhm0 dhm0Var, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, boolean z5, Set set, Set set2, boolean z6, Set set3, boolean z7, xbe0 xbe0Var, boolean z8, boolean z9, List list, wuz wuzVar, int i) {
        String str3 = dhm0Var.a;
        String str4 = (i & 2) != 0 ? dhm0Var.b : str;
        boolean z10 = (i & 4) != 0 ? dhm0Var.c : z;
        boolean z11 = (i & 8) != 0 ? dhm0Var.d : z2;
        String str5 = (i & 16) != 0 ? dhm0Var.e : str2;
        boolean z12 = (i & 32) != 0 ? dhm0Var.f : z3;
        boolean z13 = (i & 64) != 0 ? dhm0Var.g : z4;
        boolean z14 = (i & 128) != 0 ? dhm0Var.h : z5;
        Set set4 = (i & 256) != 0 ? dhm0Var.i : set;
        Set set5 = (i & 512) != 0 ? dhm0Var.t : set2;
        boolean z15 = dhm0Var.X;
        boolean z16 = (i & 2048) != 0 ? dhm0Var.Y : z6;
        Set set6 = (i & 4096) != 0 ? dhm0Var.Z : set3;
        boolean z17 = (i & 8192) != 0 ? dhm0Var.N0 : z7;
        xbe0 xbe0Var2 = (i & 16384) != 0 ? dhm0Var.O0 : xbe0Var;
        boolean z18 = (i & 32768) != 0 ? dhm0Var.P0 : z8;
        boolean z19 = (i & 65536) != 0 ? dhm0Var.Q0 : z9;
        List list2 = (i & 131072) != 0 ? dhm0Var.R0 : list;
        String str6 = dhm0Var.S0;
        wuz wuzVar2 = (i & 524288) != 0 ? dhm0Var.T0 : wuzVar;
        int i2 = dhm0Var.U0;
        dhm0Var.getClass();
        return new dhm0(str3, str4, z10, z11, str5, z12, z13, z14, set4, set5, z15, z16, set6, z17, xbe0Var2, z18, z19, list2, str6, wuzVar2, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhm0)) {
            return false;
        }
        dhm0 dhm0Var = (dhm0) obj;
        return u890.j(this.a, dhm0Var.a) && u890.j(this.b, dhm0Var.b) && this.c == dhm0Var.c && this.d == dhm0Var.d && u890.j(this.e, dhm0Var.e) && this.f == dhm0Var.f && this.g == dhm0Var.g && this.h == dhm0Var.h && u890.j(this.i, dhm0Var.i) && u890.j(this.t, dhm0Var.t) && this.X == dhm0Var.X && this.Y == dhm0Var.Y && u890.j(this.Z, dhm0Var.Z) && this.N0 == dhm0Var.N0 && u890.j(this.O0, dhm0Var.O0) && this.P0 == dhm0Var.P0 && this.Q0 == dhm0Var.Q0 && u890.j(this.R0, dhm0Var.R0) && u890.j(this.S0, dhm0Var.S0) && u890.j(this.T0, dhm0Var.T0) && this.U0 == dhm0Var.U0;
    }

    public final int hashCode() {
        int iD = cy30.d(f4i1.b(xcg1.g(xcg1.g((this.O0.hashCode() + xcg1.g(gvg.c(xcg1.g(xcg1.g(gvg.c(gvg.c(xcg1.g(xcg1.g(xcg1.g(cy30.d(xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.t), 31, this.X), 31, this.Y), 31, this.Z), 31, this.N0)) * 31, 31, this.P0), 31, this.Q0), 31, this.R0), 31, this.S0);
        wuz wuzVar = this.T0;
        return Integer.hashCode(this.U0) + ((iD + (wuzVar == null ? 0 : wuzVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        Iterator itH = k4s0.h(this.i, parcel);
        while (itH.hasNext()) {
            parcel.writeString((String) itH.next());
        }
        Iterator itH2 = k4s0.h(this.t, parcel);
        while (itH2.hasNext()) {
            parcel.writeString((String) itH2.next());
        }
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
        Iterator itH3 = k4s0.h(this.Z, parcel);
        while (itH3.hasNext()) {
            parcel.writeString((String) itH3.next());
        }
        parcel.writeInt(this.N0 ? 1 : 0);
        parcel.writeParcelable(this.O0, i);
        parcel.writeInt(this.P0 ? 1 : 0);
        parcel.writeInt(this.Q0 ? 1 : 0);
        Iterator itM = kk0.m(parcel, this.R0);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeString(this.S0);
        parcel.writeInt(this.U0);
    }

    public dhm0(String str, String str2, boolean z, boolean z2, String str3, boolean z3, boolean z4, boolean z5, Set set, Set set2, boolean z6, boolean z7, Set set3, boolean z8, xbe0 xbe0Var, boolean z9, boolean z10, List list, String str4, wuz wuzVar, int i) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = set;
        this.t = set2;
        this.X = z6;
        this.Y = z7;
        this.Z = set3;
        this.N0 = z8;
        this.O0 = xbe0Var;
        this.P0 = z9;
        this.Q0 = z10;
        this.R0 = list;
        this.S0 = str4;
        this.T0 = wuzVar;
        this.U0 = i;
        this.V0 = o7h.d1(list, i);
        this.W0 = str2.concat(":recommended");
    }
}
