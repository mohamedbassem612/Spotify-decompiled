package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ncf implements Parcelable {
    public static final Parcelable.Creator<ncf> CREATOR = new zbf((byte) 1);
    public final boolean N0;
    public final String O0;
    public final boolean P0;
    public final int Q0;
    public final int R0;
    public final t7q0 S0;
    public final boolean T0;
    public final boolean U0;
    public final boolean V0;
    public final Map W0;
    public final String X;
    public final boolean X0;
    public final boolean Y;
    public final boolean Y0;
    public final boolean Z;
    public final Map Z0;
    public final goe a;
    public final String a1;
    public final w4i1 b;
    public final boolean b1;
    public final boolean c;
    public final boolean c1;
    public final boolean d;
    public final pfs0 d1;
    public final acf e;
    public final boolean e1;
    public final nlv f;
    public final uu2 f1;
    public final mcf g;
    public final boolean g1;
    public final boolean h;
    public final h5f h1;
    public final int i;
    public final List i1;
    public final boolean j1;
    public final boolean t;

    public ncf(goe goeVar, w4i1 w4i1Var, boolean z, boolean z2, acf acfVar, nlv nlvVar, mcf mcfVar, boolean z3, int i, boolean z4, String str, boolean z5, boolean z6, boolean z7, String str2, boolean z8, int i2, int i3, t7q0 t7q0Var, boolean z9, boolean z10, boolean z11, Map map, boolean z12, boolean z13, Map map2, String str3, boolean z14, boolean z15, pfs0 pfs0Var, boolean z16, uu2 uu2Var, boolean z17, h5f h5fVar, List list) {
        this.a = goeVar;
        this.b = w4i1Var;
        this.c = z;
        this.d = z2;
        this.e = acfVar;
        this.f = nlvVar;
        this.g = mcfVar;
        this.h = z3;
        this.i = i;
        this.t = z4;
        this.X = str;
        this.Y = z5;
        this.Z = z6;
        this.N0 = z7;
        this.O0 = str2;
        this.P0 = z8;
        this.Q0 = i2;
        this.R0 = i3;
        this.S0 = t7q0Var;
        this.T0 = z9;
        this.U0 = z10;
        this.V0 = z11;
        this.W0 = map;
        this.X0 = z12;
        this.Y0 = z13;
        this.Z0 = map2;
        this.a1 = str3;
        this.b1 = z14;
        this.c1 = z15;
        this.d1 = pfs0Var;
        this.e1 = z16;
        this.f1 = uu2Var;
        this.g1 = z17;
        this.h1 = h5fVar;
        this.i1 = list;
        this.j1 = sqe.w(goeVar);
    }

    public static ncf a(ncf ncfVar, goe goeVar, acf acfVar, nlv nlvVar, mcf mcfVar, boolean z, int i, boolean z2, boolean z3, boolean z4, String str, int i2, t7q0 t7q0Var, boolean z5, Map map, boolean z6, Map map2, String str2, pfs0 pfs0Var, uu2 uu2Var, boolean z7, h5f h5fVar, List list, int i3, int i4) {
        goe goeVar2 = (i3 & 1) != 0 ? ncfVar.a : goeVar;
        w4i1 w4i1Var = ncfVar.b;
        boolean z8 = ncfVar.c;
        boolean z9 = (i3 & 8) != 0 ? ncfVar.d : true;
        acf acfVar2 = (i3 & 16) != 0 ? ncfVar.e : acfVar;
        nlv nlvVar2 = (i3 & 32) != 0 ? ncfVar.f : nlvVar;
        mcf mcfVar2 = (i3 & 64) != 0 ? ncfVar.g : mcfVar;
        boolean z10 = (i3 & 128) != 0 ? ncfVar.h : z;
        int i5 = (i3 & 256) != 0 ? ncfVar.i : i;
        boolean z11 = ncfVar.t;
        String str3 = (i3 & 1024) != 0 ? ncfVar.X : null;
        boolean z12 = (i3 & 2048) != 0 ? ncfVar.Y : z2;
        boolean z13 = (i3 & 4096) != 0 ? ncfVar.Z : z3;
        boolean z14 = (i3 & 8192) != 0 ? ncfVar.N0 : z4;
        String str4 = (i3 & 16384) != 0 ? ncfVar.O0 : str;
        boolean z15 = (32768 & i3) != 0 ? ncfVar.P0 : true;
        int i6 = (65536 & i3) != 0 ? ncfVar.Q0 : i2;
        int i7 = ncfVar.R0;
        t7q0 t7q0Var2 = (262144 & i3) != 0 ? ncfVar.S0 : t7q0Var;
        boolean z16 = ncfVar.T0;
        boolean z17 = ncfVar.U0;
        boolean z18 = (i3 & 2097152) != 0 ? ncfVar.V0 : z5;
        Map map3 = (i3 & 4194304) != 0 ? ncfVar.W0 : map;
        boolean z19 = ncfVar.X0;
        boolean z20 = (i3 & 16777216) != 0 ? ncfVar.Y0 : z6;
        Map map4 = (i3 & 33554432) != 0 ? ncfVar.Z0 : map2;
        String str5 = (i3 & 67108864) != 0 ? ncfVar.a1 : str2;
        boolean z21 = ncfVar.b1;
        boolean z22 = ncfVar.c1;
        pfs0 pfs0Var2 = (i3 & 536870912) != 0 ? ncfVar.d1 : pfs0Var;
        boolean z23 = ncfVar.e1;
        uu2 uu2Var2 = (i3 & Integer.MIN_VALUE) != 0 ? ncfVar.f1 : uu2Var;
        boolean z24 = (i4 & 1) != 0 ? ncfVar.g1 : z7;
        h5f h5fVar2 = (i4 & 2) != 0 ? ncfVar.h1 : h5fVar;
        List list2 = (i4 & 4) != 0 ? ncfVar.i1 : list;
        ncfVar.getClass();
        return new ncf(goeVar2, w4i1Var, z8, z9, acfVar2, nlvVar2, mcfVar2, z10, i5, z11, str3, z12, z13, z14, str4, z15, i6, i7, t7q0Var2, z16, z17, z18, map3, z19, z20, map4, str5, z21, z22, pfs0Var2, z23, uu2Var2, z24, h5fVar2, list2);
    }

    public final boolean b() {
        goe goeVar = this.a;
        if (goeVar.c.a()) {
            return this.e.a.isEmpty() || !u890.j(goeVar.b, atf.a);
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncf)) {
            return false;
        }
        ncf ncfVar = (ncf) obj;
        return u890.j(this.a, ncfVar.a) && u890.j(this.b, ncfVar.b) && this.c == ncfVar.c && this.d == ncfVar.d && u890.j(this.e, ncfVar.e) && u890.j(this.f, ncfVar.f) && u890.j(this.g, ncfVar.g) && this.h == ncfVar.h && this.i == ncfVar.i && this.t == ncfVar.t && u890.j(this.X, ncfVar.X) && this.Y == ncfVar.Y && this.Z == ncfVar.Z && this.N0 == ncfVar.N0 && u890.j(this.O0, ncfVar.O0) && this.P0 == ncfVar.P0 && this.Q0 == ncfVar.Q0 && this.R0 == ncfVar.R0 && u890.j(this.S0, ncfVar.S0) && this.T0 == ncfVar.T0 && this.U0 == ncfVar.U0 && this.V0 == ncfVar.V0 && u890.j(this.W0, ncfVar.W0) && this.X0 == ncfVar.X0 && this.Y0 == ncfVar.Y0 && u890.j(this.Z0, ncfVar.Z0) && u890.j(this.a1, ncfVar.a1) && this.b1 == ncfVar.b1 && this.c1 == ncfVar.c1 && u890.j(this.d1, ncfVar.d1) && this.e1 == ncfVar.e1 && u890.j(this.f1, ncfVar.f1) && this.g1 == ncfVar.g1 && this.h1 == ncfVar.h1 && u890.j(this.i1, ncfVar.i1);
    }

    public final ArrayList g() {
        List list = this.e.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((w4i1) it.next()).a);
        }
        Set setP1 = o7h.p1(arrayList);
        List list2 = this.a.e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (!u890.j(((jwm) obj).a.a, this.b.a)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!setP1.contains(((jwm) obj2).a.a)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((jwm) it2.next()).a);
        }
        return arrayList4;
    }

    public final String h() {
        rqn rqnVar;
        icf icfVar = this.g;
        if (icfVar instanceof hcf) {
            rqnVar = ((hcf) icfVar).c;
        } else {
            rqnVar = icfVar instanceof icf ? icfVar.a : null;
        }
        if (rqnVar instanceof pqn) {
            String str = ((pqn) rqnVar).a;
            return str == null ? "" : str;
        }
        if (rqnVar instanceof qqn) {
            String str2 = ((qqn) rqnVar).a;
            return str2 == null ? "" : str2;
        }
        if (rqnVar == null) {
            return this.a.a;
        }
        eg.o();
        return null;
    }

    public final int hashCode() {
        int i;
        int iHashCode = (this.e.hashCode() + xcg1.g(xcg1.g(ydh.d(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d)) * 31;
        nlv nlvVar = this.f;
        if (nlvVar == null) {
            i = 0;
        } else {
            nlvVar.getClass();
            i = 2020616790;
        }
        int iG = xcg1.g(kaa0.f(this.i, xcg1.g((this.g.hashCode() + ((iHashCode + i) * 31)) * 31, 31, this.h), 31), 31, this.t);
        String str = this.X;
        int iG2 = xcg1.g(xcg1.g(xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.Y), 31, this.Z), 31, this.N0);
        String str2 = this.O0;
        int iF = kaa0.f(this.R0, kaa0.f(this.Q0, xcg1.g((iG2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.P0), 31), 31);
        t7q0 t7q0Var = this.S0;
        int iE = cy30.e(xcg1.g(xcg1.g(cy30.e(xcg1.g(xcg1.g(xcg1.g((iF + (t7q0Var == null ? 0 : t7q0Var.hashCode())) * 31, 31, this.T0), 31, this.U0), 31, this.V0), 31, this.W0), 31, this.X0), 31, this.Y0), 31, this.Z0);
        String str3 = this.a1;
        int iG3 = xcg1.g(xcg1.g((iE + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.b1), 31, this.c1);
        pfs0 pfs0Var = this.d1;
        return this.i1.hashCode() + ((this.h1.hashCode() + xcg1.g((this.f1.hashCode() + xcg1.g((iG3 + (pfs0Var != null ? pfs0Var.hashCode() : 0)) * 31, 31, this.e1)) * 31, 31, this.g1)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        this.e.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeString(this.X);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeInt(this.N0 ? 1 : 0);
        parcel.writeString(this.O0);
        parcel.writeInt(this.P0 ? 1 : 0);
        parcel.writeInt(this.Q0);
        parcel.writeInt(this.R0);
        parcel.writeParcelable(this.S0, i);
        parcel.writeInt(this.T0 ? 1 : 0);
        parcel.writeInt(this.U0 ? 1 : 0);
        parcel.writeInt(this.V0 ? 1 : 0);
        Iterator itJ = xcg1.j(parcel, this.W0);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString((String) entry.getKey());
            Iterator itM = kk0.m(parcel, (List) entry.getValue());
            while (itM.hasNext()) {
                parcel.writeParcelable((Parcelable) itM.next(), i);
            }
        }
        parcel.writeInt(this.X0 ? 1 : 0);
        parcel.writeInt(this.Y0 ? 1 : 0);
        Iterator itJ2 = xcg1.j(parcel, this.Z0);
        while (itJ2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itJ2.next();
            parcel.writeString((String) entry2.getKey());
            parcel.writeStringList((List) entry2.getValue());
        }
        parcel.writeString(this.a1);
        parcel.writeInt(this.b1 ? 1 : 0);
        parcel.writeInt(this.c1 ? 1 : 0);
        parcel.writeParcelable(this.d1, i);
        parcel.writeInt(this.e1 ? 1 : 0);
        parcel.writeParcelable(this.f1, i);
        parcel.writeInt(this.g1 ? 1 : 0);
        parcel.writeString(this.h1.name());
        Iterator itM2 = kk0.m(parcel, this.i1);
        while (itM2.hasNext()) {
            parcel.writeString(((h5f) itM2.next()).name());
        }
    }
}
