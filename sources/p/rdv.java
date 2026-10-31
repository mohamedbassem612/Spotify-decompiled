package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rdv {
    public final String a;
    public final List b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final la61 f;
    public final lia1 g;
    public final c380 h;
    public final c380 i;
    public final int j;
    public final ak3 k;
    public final Set l;

    public rdv(String str, List list, boolean z, int i, boolean z2, la61 la61Var, lia1 lia1Var, c380 c380Var, c380 c380Var2, int i2, ak3 ak3Var, Set set) {
        this.a = str;
        this.b = list;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = la61Var;
        this.g = lia1Var;
        this.h = c380Var;
        this.i = c380Var2;
        this.j = i2;
        this.k = ak3Var;
        this.l = set;
    }

    public static rdv a(rdv rdvVar, String str, List list, boolean z, int i, boolean z2, lia1 lia1Var, c380 c380Var, c380 c380Var2, int i2, Set set, int i3) {
        String str2 = (i3 & 1) != 0 ? rdvVar.a : str;
        List list2 = (i3 & 2) != 0 ? rdvVar.b : list;
        boolean z3 = (i3 & 4) != 0 ? rdvVar.c : z;
        int i4 = (i3 & 8) != 0 ? rdvVar.d : i;
        boolean z4 = (i3 & 16) != 0 ? rdvVar.e : z2;
        la61 la61Var = rdvVar.f;
        lia1 lia1Var2 = (i3 & 64) != 0 ? rdvVar.g : lia1Var;
        c380 c380Var3 = (i3 & 128) != 0 ? rdvVar.h : c380Var;
        c380 c380Var4 = (i3 & 256) != 0 ? rdvVar.i : c380Var2;
        int i5 = (i3 & 512) != 0 ? rdvVar.j : i2;
        rdvVar.getClass();
        ak3 ak3Var = rdvVar.k;
        Set set2 = (i3 & 4096) != 0 ? rdvVar.l : set;
        rdvVar.getClass();
        return new rdv(str2, list2, z3, i4, z4, la61Var, lia1Var2, c380Var3, c380Var4, i5, ak3Var, set2);
    }

    public static int e(c380 c380Var) {
        Iterator it = c380Var.iterator();
        int i = 0;
        while (it.hasNext()) {
            wcv wcvVar = (ycv) it.next();
            int i2 = 1;
            if (wcvVar instanceof wcv) {
                wcv wcvVar2 = wcvVar;
                i2 = 1 + wcvVar2.g + wcvVar2.f;
            }
            i += i2;
        }
        return i;
    }

    public final rdv b(String str) {
        c380<xcv> c380Var = this.h;
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        for (xcv xcvVarC : c380Var) {
            if (xcvVarC instanceof xcv) {
                xcv xcvVar = xcvVarC;
                if (u890.j(xcvVar.a, str)) {
                    xcvVarC = xcv.c(xcvVar, !xcvVar.e, 8175);
                }
            }
            arrayList.add(xcvVarC);
        }
        c380<xcv> c380Var2 = this.i;
        ArrayList arrayList2 = new ArrayList(q7h.U(c380Var2, 10));
        for (xcv xcvVarC2 : c380Var2) {
            if (xcvVarC2 instanceof xcv) {
                xcv xcvVar2 = xcvVarC2;
                if (u890.j(xcvVar2.a, str)) {
                    xcvVarC2 = xcv.c(xcvVar2, !xcvVar2.e, 8175);
                }
            }
            arrayList2.add(xcvVarC2);
        }
        return a(this, null, null, false, 0, false, null, mqo1.A(arrayList), mqo1.A(arrayList2), 0, null, 7807);
    }

    public final pdv c() {
        if (this.h.size() + this.i.size() > 0) {
            return ldv.a;
        }
        if (this.a.length() > 0) {
            return new jdv(ndv.c);
        }
        if (d() != null) {
            return new jdv(mdv.c);
        }
        return this.c ? kdv.a : new jdv(odv.c);
    }

    public final qdv d() {
        return (qdv) o7h.C0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdv)) {
            return false;
        }
        rdv rdvVar = (rdv) obj;
        return this.a.equals(rdvVar.a) && u890.j(this.b, rdvVar.b) && this.c == rdvVar.c && this.d == rdvVar.d && this.e == rdvVar.e && this.f.equals(rdvVar.f) && this.g == rdvVar.g && u890.j(this.h, rdvVar.h) && u890.j(this.i, rdvVar.i) && this.j == rdvVar.j && this.k == rdvVar.k && u890.j(this.l, rdvVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + kaa0.f(6, kaa0.f(this.j, kk0.f(this.i, kk0.f(this.h, (this.g.hashCode() + ((this.f.a.hashCode() + xcg1.g(ab80.k(this.d, xcg1.g(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e)) * 31)) * 31, 31), 31), 31), 31)) * 31);
    }
}
