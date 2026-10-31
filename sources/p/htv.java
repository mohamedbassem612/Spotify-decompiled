package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class htv {
    public final lbr a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final g3d0 f;
    public final x7i1 g;
    public final gtv h;
    public final Map i;
    public final etv j;
    public final List k;
    public final c380 l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public htv(lbr lbrVar, boolean z, boolean z2, boolean z3, boolean z4, g3d0 g3d0Var, x7i1 x7i1Var, gtv gtvVar, Map map, etv etvVar, List list, c380 c380Var) {
        this.a = lbrVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = g3d0Var;
        this.g = x7i1Var;
        this.h = gtvVar;
        this.i = map;
        this.j = etvVar;
        this.k = list;
        this.l = c380Var;
        this.m = !z;
        boolean z5 = etvVar.f;
        this.n = z5;
        this.o = z5;
    }

    public static htv a(htv htvVar, boolean z, boolean z2, boolean z3, x7i1 x7i1Var, gtv gtvVar, Map map, etv etvVar, ArrayList arrayList, c380 c380Var, int i) {
        lbr lbrVar = (i & 1) != 0 ? htvVar.a : jbr.a;
        boolean z4 = (i & 2) != 0 ? htvVar.b : z;
        boolean z5 = (i & 4) != 0 ? htvVar.c : z2;
        boolean z6 = (i & 8) != 0 ? htvVar.d : z3;
        boolean z7 = (i & 16) != 0 ? htvVar.e : true;
        g3d0 g3d0Var = htvVar.f;
        x7i1 x7i1Var2 = (i & 64) != 0 ? htvVar.g : x7i1Var;
        gtv gtvVar2 = (i & 128) != 0 ? htvVar.h : gtvVar;
        Map map2 = (i & 256) != 0 ? htvVar.i : map;
        etv etvVar2 = (i & 512) != 0 ? htvVar.j : etvVar;
        List list = (i & 1024) != 0 ? htvVar.k : arrayList;
        c380 c380Var2 = (i & 2048) != 0 ? htvVar.l : c380Var;
        htvVar.getClass();
        return new htv(lbrVar, z4, z5, z6, z7, g3d0Var, x7i1Var2, gtvVar2, map2, etvVar2, list, c380Var2);
    }

    public final boolean b() {
        return this.o;
    }

    public final lbr c() {
        return this.a;
    }

    public final etv d() {
        return this.j;
    }

    public final c380 e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htv)) {
            return false;
        }
        htv htvVar = (htv) obj;
        return u890.j(this.a, htvVar.a) && this.b == htvVar.b && this.c == htvVar.c && this.d == htvVar.d && this.e == htvVar.e && u890.j(this.f, htvVar.f) && this.g.equals(htvVar.g) && this.h.equals(htvVar.h) && u890.j(this.i, htvVar.i) && this.j.equals(htvVar.j) && u890.j(this.k, htvVar.k) && u890.j(this.l, htvVar.l);
    }

    public final Map f() {
        return this.i;
    }

    public final gtv g() {
        return this.h;
    }

    public final boolean h() {
        return this.d;
    }

    public final int hashCode() {
        return this.l.hashCode() + f4i1.b((this.j.hashCode() + cy30.e((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31)) * 31, 31, this.i)) * 31, 31, this.k);
    }

    public final boolean i() {
        return this.e;
    }

    public final boolean j() {
        return this.m;
    }

    public final boolean k() {
        return this.c;
    }
}
