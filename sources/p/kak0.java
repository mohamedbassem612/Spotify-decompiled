package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kak0 implements Parcelable {
    public static final Parcelable.Creator<kak0> CREATOR = new w9k0((byte) 1);
    public final boolean N0;
    public final boolean O0;
    public final Float P0;
    public final lhg1 Q0;
    public final lhg1 R0;
    public final lhg1 S0;
    public final String T0;
    public final String U0;
    public final lhg1 V0;
    public final m8w0 W0;
    public final xx8 X;
    public final boolean X0;
    public final List Y;
    public final int Y0;
    public final List Z;
    public final int Z0;
    public final boolean a;
    public final int a1;
    public final dbk0 b;
    public final int b1;
    public final boolean c;
    public final float c1;
    public final boolean d;
    public final int d1;
    public final pdm0 e;
    public final int e1;
    public final Boolean f;
    public final int f1;
    public final ycu0 g;
    public final giq0 g1;
    public final lhg1 h;
    public final uia h1;
    public final lhg1 i;
    public final uia i1;
    public final Float j1;
    public final Float k1;
    public final Float l1;
    public final Float m1;
    public final int n1;
    public final boolean o1;
    public final boolean p1;
    public final String q1;
    public final boolean r1;
    public final lhg1 s1;
    public final lhg1 t;
    public final Boolean t1;
    public final Integer u1;
    public final lyj0 v1;
    public final long w1;
    public final boolean x1;
    public final Integer y1;
    public final Integer z1;

    public kak0(boolean z, dbk0 dbk0Var, boolean z2, boolean z3, pdm0 pdm0Var, Boolean bool, ycu0 ycu0Var, lhg1 lhg1Var, lhg1 lhg1Var2, lhg1 lhg1Var3, xx8 xx8Var, List list, List list2, boolean z4, boolean z5, Float f, lhg1 lhg1Var4, lhg1 lhg1Var5, lhg1 lhg1Var6, String str, String str2, lhg1 lhg1Var7, m8w0 m8w0Var, boolean z6, int i, int i2, int i3, int i4, float f2, int i5, int i6, int i7, Float f3, Float f4, int i8, boolean z7, boolean z8, String str3, boolean z9, lhg1 lhg1Var8, Boolean bool2, Integer num, lyj0 lyj0Var, long j, boolean z10, int i9, int i10) {
        this(z, dbk0Var, z2, z3, pdm0Var, (i9 & 32) != 0 ? null : bool, (i9 & 64) != 0 ? wcu0.a : ycu0Var, lhg1Var, lhg1Var2, lhg1Var3, xx8Var, list, list2, z4, z5, f, lhg1Var4, lhg1Var5, lhg1Var6, (i9 & 524288) != 0 ? lhg1Var6.b.b : str, (i9 & 1048576) != 0 ? lhg1Var6.b.h : str2, (i9 & 2097152) != 0 ? lhg1Var4 : lhg1Var7, m8w0Var, (i9 & 8388608) != 0 ? false : z6, i, i2, i3, i4, f2, i5, i6, (i9 & Integer.MIN_VALUE) != 0 ? 25 : i7, giq0.a, null, null, null, null, f3, f4, i8, z7, z8, str3, z9, lhg1Var8, bool2, (i10 & 16384) != 0 ? null : num, (32768 & i10) != 0 ? new lyj0() : lyj0Var, (i10 & 65536) != 0 ? 0L : j, z10, null, null);
    }

    public static kak0 a(kak0 kak0Var, pdm0 pdm0Var, Boolean bool, ycu0 ycu0Var, lhg1 lhg1Var, lhg1 lhg1Var2, lhg1 lhg1Var3, xx8 xx8Var, List list, List list2, Float f, lhg1 lhg1Var4, lhg1 lhg1Var5, lhg1 lhg1Var6, String str, String str2, lhg1 lhg1Var7, m8w0 m8w0Var, boolean z, int i, int i2, int i3, giq0 giq0Var, uia uiaVar, uia uiaVar2, Float f2, Float f3, Float f4, Float f5, boolean z2, boolean z3, String str3, boolean z4, lhg1 lhg1Var8, Boolean bool2, Integer num, lyj0 lyj0Var, long j, Integer num2, Integer num3, int i4, int i5) {
        boolean z5 = kak0Var.a;
        dbk0 dbk0Var = kak0Var.b;
        boolean z6 = kak0Var.c;
        boolean z7 = kak0Var.d;
        pdm0 pdm0Var2 = (i4 & 16) != 0 ? kak0Var.e : pdm0Var;
        Boolean bool3 = (i4 & 32) != 0 ? kak0Var.f : bool;
        ycu0 ycu0Var2 = (i4 & 64) != 0 ? kak0Var.g : ycu0Var;
        lhg1 lhg1Var9 = (i4 & 128) != 0 ? kak0Var.h : lhg1Var;
        lhg1 lhg1Var10 = (i4 & 256) != 0 ? kak0Var.i : lhg1Var2;
        lhg1 lhg1Var11 = (i4 & 512) != 0 ? kak0Var.t : lhg1Var3;
        xx8 xx8Var2 = (i4 & 1024) != 0 ? kak0Var.X : xx8Var;
        List list3 = (i4 & 2048) != 0 ? kak0Var.Y : list;
        List list4 = (i4 & 4096) != 0 ? kak0Var.Z : list2;
        Boolean bool4 = bool3;
        lhg1 lhg1Var12 = lhg1Var9;
        lhg1 lhg1Var13 = lhg1Var11;
        List list5 = list3;
        boolean z8 = kak0Var.N0;
        pdm0 pdm0Var3 = pdm0Var2;
        ycu0 ycu0Var3 = ycu0Var2;
        lhg1 lhg1Var14 = lhg1Var10;
        xx8 xx8Var3 = xx8Var2;
        List list6 = list4;
        boolean z9 = kak0Var.O0;
        Float f6 = (i4 & 32768) != 0 ? kak0Var.P0 : f;
        lhg1 lhg1Var15 = (i4 & 65536) != 0 ? kak0Var.Q0 : lhg1Var4;
        lhg1 lhg1Var16 = (i4 & 131072) != 0 ? kak0Var.R0 : lhg1Var5;
        lhg1 lhg1Var17 = (i4 & 262144) != 0 ? kak0Var.S0 : lhg1Var6;
        String str4 = (i4 & 524288) != 0 ? kak0Var.T0 : str;
        String str5 = (i4 & 1048576) != 0 ? kak0Var.U0 : str2;
        lhg1 lhg1Var18 = (i4 & 2097152) != 0 ? kak0Var.V0 : lhg1Var7;
        m8w0 m8w0Var2 = (i4 & 4194304) != 0 ? kak0Var.W0 : m8w0Var;
        boolean z10 = (i4 & 8388608) != 0 ? kak0Var.X0 : z;
        int i6 = (i4 & 16777216) != 0 ? kak0Var.Y0 : i;
        int i7 = kak0Var.Z0;
        int i8 = kak0Var.a1;
        int i9 = kak0Var.b1;
        float f7 = kak0Var.c1;
        int i10 = (i4 & 536870912) != 0 ? kak0Var.d1 : i2;
        int i11 = (i4 & 1073741824) != 0 ? kak0Var.e1 : i3;
        int i12 = kak0Var.f1;
        giq0 giq0Var2 = (i5 & 1) != 0 ? kak0Var.g1 : giq0Var;
        uia uiaVar3 = (i5 & 2) != 0 ? kak0Var.h1 : uiaVar;
        uia uiaVar4 = (i5 & 4) != 0 ? kak0Var.i1 : uiaVar2;
        Float f8 = (i5 & 8) != 0 ? kak0Var.j1 : f2;
        Float f9 = (i5 & 16) != 0 ? kak0Var.k1 : f3;
        Float f10 = (i5 & 32) != 0 ? kak0Var.l1 : f4;
        Float f11 = (i5 & 64) != 0 ? kak0Var.m1 : f5;
        int i13 = kak0Var.n1;
        boolean z11 = (i5 & 256) != 0 ? kak0Var.o1 : z2;
        boolean z12 = (i5 & 512) != 0 ? kak0Var.p1 : z3;
        String str6 = (i5 & 1024) != 0 ? kak0Var.q1 : str3;
        boolean z13 = (i5 & 2048) != 0 ? kak0Var.r1 : z4;
        lhg1 lhg1Var19 = (i5 & 4096) != 0 ? kak0Var.s1 : lhg1Var8;
        Boolean bool5 = (i5 & 8192) != 0 ? kak0Var.t1 : bool2;
        Integer num4 = (i5 & 16384) != 0 ? kak0Var.u1 : num;
        lyj0 lyj0Var2 = (i5 & 32768) != 0 ? kak0Var.v1 : lyj0Var;
        long j2 = (i5 & 65536) != 0 ? kak0Var.w1 : j;
        boolean z14 = kak0Var.x1;
        Integer num5 = (i5 & 262144) != 0 ? kak0Var.y1 : num2;
        Integer num6 = (i5 & 524288) != 0 ? kak0Var.z1 : num3;
        kak0Var.getClass();
        return new kak0(z5, dbk0Var, z6, z7, pdm0Var3, bool4, ycu0Var3, lhg1Var12, lhg1Var14, lhg1Var13, xx8Var3, list5, list6, z8, z9, f6, lhg1Var15, lhg1Var16, lhg1Var17, str4, str5, lhg1Var18, m8w0Var2, z10, i6, i7, i8, i9, f7, i10, i11, i12, giq0Var2, uiaVar3, uiaVar4, f8, f9, f10, f11, i13, z11, z12, str6, z13, lhg1Var19, bool5, num4, lyj0Var2, j2, z14, num5, num6);
    }

    public final String b() {
        if (u890.j(this.W0, j8w0.a)) {
            return this.q1;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kak0)) {
            return false;
        }
        kak0 kak0Var = (kak0) obj;
        return this.a == kak0Var.a && this.b == kak0Var.b && this.c == kak0Var.c && this.d == kak0Var.d && u890.j(this.e, kak0Var.e) && u890.j(this.f, kak0Var.f) && u890.j(this.g, kak0Var.g) && u890.j(this.h, kak0Var.h) && u890.j(this.i, kak0Var.i) && u890.j(this.t, kak0Var.t) && this.X == kak0Var.X && u890.j(this.Y, kak0Var.Y) && u890.j(this.Z, kak0Var.Z) && this.N0 == kak0Var.N0 && this.O0 == kak0Var.O0 && u890.j(this.P0, kak0Var.P0) && u890.j(this.Q0, kak0Var.Q0) && u890.j(this.R0, kak0Var.R0) && u890.j(this.S0, kak0Var.S0) && u890.j(this.T0, kak0Var.T0) && u890.j(this.U0, kak0Var.U0) && u890.j(this.V0, kak0Var.V0) && u890.j(this.W0, kak0Var.W0) && this.X0 == kak0Var.X0 && this.Y0 == kak0Var.Y0 && this.Z0 == kak0Var.Z0 && this.a1 == kak0Var.a1 && this.b1 == kak0Var.b1 && Float.compare(this.c1, kak0Var.c1) == 0 && this.d1 == kak0Var.d1 && this.e1 == kak0Var.e1 && this.f1 == kak0Var.f1 && this.g1 == kak0Var.g1 && u890.j(this.h1, kak0Var.h1) && u890.j(this.i1, kak0Var.i1) && u890.j(this.j1, kak0Var.j1) && u890.j(this.k1, kak0Var.k1) && u890.j(this.l1, kak0Var.l1) && u890.j(this.m1, kak0Var.m1) && this.n1 == kak0Var.n1 && this.o1 == kak0Var.o1 && this.p1 == kak0Var.p1 && u890.j(this.q1, kak0Var.q1) && this.r1 == kak0Var.r1 && u890.j(this.s1, kak0Var.s1) && u890.j(this.t1, kak0Var.t1) && u890.j(this.u1, kak0Var.u1) && u890.j(this.v1, kak0Var.v1) && this.w1 == kak0Var.w1 && this.x1 == kak0Var.x1 && u890.j(this.y1, kak0Var.y1) && u890.j(this.z1, kak0Var.z1);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + xcg1.g(xcg1.g((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d)) * 31;
        Boolean bool = this.f;
        int iHashCode2 = (this.h.hashCode() + ((this.g.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
        lhg1 lhg1Var = this.i;
        int iHashCode3 = (iHashCode2 + (lhg1Var == null ? 0 : lhg1Var.hashCode())) * 31;
        lhg1 lhg1Var2 = this.t;
        int iG = xcg1.g(xcg1.g(f4i1.b(f4i1.b((this.X.hashCode() + ((iHashCode3 + (lhg1Var2 == null ? 0 : lhg1Var2.hashCode())) * 31)) * 31, 31, this.Y), 31, this.Z), 31, this.N0), 31, this.O0);
        Float f = this.P0;
        int iHashCode4 = (iG + (f == null ? 0 : f.hashCode())) * 31;
        lhg1 lhg1Var3 = this.Q0;
        int iHashCode5 = (iHashCode4 + (lhg1Var3 == null ? 0 : lhg1Var3.hashCode())) * 31;
        lhg1 lhg1Var4 = this.R0;
        int iD = cy30.d(cy30.d((this.S0.hashCode() + ((iHashCode5 + (lhg1Var4 == null ? 0 : lhg1Var4.hashCode())) * 31)) * 31, 31, this.T0), 31, this.U0);
        lhg1 lhg1Var5 = this.V0;
        int iHashCode6 = (this.g1.hashCode() + kaa0.f(this.f1, kaa0.f(this.e1, kaa0.f(this.d1, x0d.f(kaa0.f(this.b1, kaa0.f(this.a1, kaa0.f(this.Z0, kaa0.f(this.Y0, xcg1.g((this.W0.hashCode() + ((iD + (lhg1Var5 == null ? 0 : lhg1Var5.hashCode())) * 31)) * 31, 31, this.X0), 31), 31), 31), 31), 31, this.c1), 31), 31), 31)) * 31;
        uia uiaVar = this.h1;
        int iHashCode7 = (iHashCode6 + (uiaVar == null ? 0 : uiaVar.hashCode())) * 31;
        uia uiaVar2 = this.i1;
        int iHashCode8 = (iHashCode7 + (uiaVar2 == null ? 0 : uiaVar2.hashCode())) * 31;
        Float f2 = this.j1;
        int iHashCode9 = (iHashCode8 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.k1;
        int iHashCode10 = (iHashCode9 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.l1;
        int iHashCode11 = (iHashCode10 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.m1;
        int iG2 = xcg1.g(xcg1.g(kaa0.f(this.n1, (iHashCode11 + (f5 == null ? 0 : f5.hashCode())) * 31, 31), 31, this.o1), 31, this.p1);
        String str = this.q1;
        int iG3 = xcg1.g((iG2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.r1);
        lhg1 lhg1Var6 = this.s1;
        int iHashCode12 = (iG3 + (lhg1Var6 == null ? 0 : lhg1Var6.hashCode())) * 31;
        Boolean bool2 = this.t1;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.u1;
        int iG4 = xcg1.g(cy30.f((this.v1.hashCode() + ((iHashCode13 + (num == null ? 0 : num.hashCode())) * 31)) * 31, this.w1, 31), 31, this.x1);
        Integer num2 = this.y1;
        int iHashCode14 = (iG4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.z1;
        return iHashCode14 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MixingModel(");
        sb.append("presetMode=" + this.W0);
        sb.append(", currentTransition=".concat(this.S0.b()));
        sb.append(", autoTransition=".concat(this.h.b()));
        lhg1 lhg1Var = this.Q0;
        if (lhg1Var != null) {
            sb.append(", storedTransition=".concat(lhg1Var.b()));
        }
        lhg1 lhg1Var2 = this.R0;
        if (lhg1Var2 != null) {
            sb.append(", customTransition=".concat(lhg1Var2.b()));
        }
        lhg1 lhg1Var3 = this.s1;
        if (lhg1Var3 != null) {
            sb.append(", beatmatchReferenceTransition=".concat(lhg1Var3.b()));
        }
        sb.append(", playerState=" + this.g);
        sb.append(", modalBottomSheet=" + this.e);
        uia uiaVar = this.h1;
        sb.append(", beatsTrackA=" + (uiaVar != null ? Integer.valueOf(uiaVar.b.size()) : "null") + " beats");
        uia uiaVar2 = this.i1;
        sb.append(", beatsTrackB=" + (uiaVar2 != null ? Integer.valueOf(uiaVar2.b.size()) : "null") + " beats");
        sb.append(", trackABpm=" + this.j1 + ", trackBBpm=" + this.k1);
        sb.append(", trackASpeed=" + this.l1 + ", trackBSpeed=" + this.m1);
        StringBuilder sb2 = new StringBuilder(", isCurveEditingMode=");
        sb2.append(this.X0);
        sb.append(sb2.toString());
        sb.append(", hasBeatmatchedTransition=" + this.r1);
        sb.append(", beatmatchOverrideAllowed=" + this.t1);
        sb.append(", beatMatchedBarCount=" + this.u1);
        sb.append(", ongoingBackendCalls=" + this.g1);
        sb.append(", isSharedTransitionOutdated=" + this.o1);
        sb.append(", isSharedTransitionFlow=" + this.p1);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        this.b.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeParcelable(this.e, i);
        Boolean bool = this.f;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool);
        }
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(this.t, i);
        this.X.writeToParcel(parcel, i);
        Iterator itM = kk0.m(parcel, this.Y);
        while (itM.hasNext()) {
            ((sr10) itM.next()).writeToParcel(parcel, i);
        }
        Iterator itM2 = kk0.m(parcel, this.Z);
        while (itM2.hasNext()) {
            ((sr10) itM2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.N0 ? 1 : 0);
        parcel.writeInt(this.O0 ? 1 : 0);
        Float f = this.P0;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeParcelable(this.Q0, i);
        parcel.writeParcelable(this.R0, i);
        parcel.writeParcelable(this.S0, i);
        parcel.writeString(this.T0);
        parcel.writeString(this.U0);
        parcel.writeParcelable(this.V0, i);
        parcel.writeParcelable(this.W0, i);
        parcel.writeInt(this.X0 ? 1 : 0);
        parcel.writeInt(this.Y0);
        parcel.writeInt(this.Z0);
        parcel.writeInt(this.a1);
        parcel.writeInt(this.b1);
        parcel.writeFloat(this.c1);
        parcel.writeInt(this.d1);
        parcel.writeInt(this.e1);
        parcel.writeInt(this.f1);
        Float f2 = this.l1;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Float f3 = this.m1;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f3.floatValue());
        }
        parcel.writeInt(this.n1);
        parcel.writeInt(this.o1 ? 1 : 0);
        parcel.writeInt(this.p1 ? 1 : 0);
        parcel.writeString(this.q1);
        parcel.writeInt(this.r1 ? 1 : 0);
        parcel.writeParcelable(this.s1, i);
        Boolean bool2 = this.t1;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool2);
        }
        Integer num = this.u1;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        this.v1.writeToParcel(parcel, i);
        parcel.writeLong(this.w1);
        parcel.writeInt(this.x1 ? 1 : 0);
    }

    public kak0(boolean z, dbk0 dbk0Var, boolean z2, boolean z3, pdm0 pdm0Var, Boolean bool, ycu0 ycu0Var, lhg1 lhg1Var, lhg1 lhg1Var2, lhg1 lhg1Var3, xx8 xx8Var, List list, List list2, boolean z4, boolean z5, Float f, lhg1 lhg1Var4, lhg1 lhg1Var5, lhg1 lhg1Var6, String str, String str2, lhg1 lhg1Var7, m8w0 m8w0Var, boolean z6, int i, int i2, int i3, int i4, float f2, int i5, int i6, int i7, giq0 giq0Var, uia uiaVar, uia uiaVar2, Float f3, Float f4, Float f5, Float f6, int i8, boolean z7, boolean z8, String str3, boolean z9, lhg1 lhg1Var8, Boolean bool2, Integer num, lyj0 lyj0Var, long j, boolean z10, Integer num2, Integer num3) {
        this.a = z;
        this.b = dbk0Var;
        this.c = z2;
        this.d = z3;
        this.e = pdm0Var;
        this.f = bool;
        this.g = ycu0Var;
        this.h = lhg1Var;
        this.i = lhg1Var2;
        this.t = lhg1Var3;
        this.X = xx8Var;
        this.Y = list;
        this.Z = list2;
        this.N0 = z4;
        this.O0 = z5;
        this.P0 = f;
        this.Q0 = lhg1Var4;
        this.R0 = lhg1Var5;
        this.S0 = lhg1Var6;
        this.T0 = str;
        this.U0 = str2;
        this.V0 = lhg1Var7;
        this.W0 = m8w0Var;
        this.X0 = z6;
        this.Y0 = i;
        this.Z0 = i2;
        this.a1 = i3;
        this.b1 = i4;
        this.c1 = f2;
        this.d1 = i5;
        this.e1 = i6;
        this.f1 = i7;
        this.g1 = giq0Var;
        this.h1 = uiaVar;
        this.i1 = uiaVar2;
        this.j1 = f3;
        this.k1 = f4;
        this.l1 = f5;
        this.m1 = f6;
        this.n1 = i8;
        this.o1 = z7;
        this.p1 = z8;
        this.q1 = str3;
        this.r1 = z9;
        this.s1 = lhg1Var8;
        this.t1 = bool2;
        this.u1 = num;
        this.v1 = lyj0Var;
        this.w1 = j;
        this.x1 = z10;
        this.y1 = num2;
        this.z1 = num3;
    }
}
