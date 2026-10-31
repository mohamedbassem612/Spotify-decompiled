package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oxk {
    public final String A;
    public final r591 B;
    public final String C;
    public final String a;
    public final qxk b;
    public final c380 c;
    public final yxk d;
    public final sxk e;
    public final s781 f;
    public final String g;
    public final gmc1 h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final nyb n;
    public final dyh1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f50p;
    public final boolean q;
    public final mrn r;
    public final h1e s;
    public final int t;
    public final sxk u;
    public final c380 v;
    public final u380 w;
    public final u380 x;
    public final boolean y;
    public final c380 z;

    public oxk(String str, qxk qxkVar, c380 c380Var, yxk yxkVar, sxk sxkVar, s781 s781Var, String str2, gmc1 gmc1Var, String str3, boolean z, boolean z2, boolean z3, boolean z4, nyb nybVar, dyh1 dyh1Var, String str4, boolean z5, mrn mrnVar, h1e h1eVar, int i, sxk sxkVar2, c380 c380Var2, u380 u380Var, u380 u380Var2, boolean z6, c380 c380Var3, String str5, r591 r591Var, String str6) {
        this.a = str;
        this.b = qxkVar;
        this.c = c380Var;
        this.d = yxkVar;
        this.e = sxkVar;
        this.f = s781Var;
        this.g = str2;
        this.h = gmc1Var;
        this.i = str3;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = nybVar;
        this.o = dyh1Var;
        this.f50p = str4;
        this.q = z5;
        this.r = mrnVar;
        this.s = h1eVar;
        this.t = i;
        this.u = sxkVar2;
        this.v = c380Var2;
        this.w = u380Var;
        this.x = u380Var2;
        this.y = z6;
        this.z = c380Var3;
        this.A = str5;
        this.B = r591Var;
        this.C = str6;
    }

    public static oxk a(oxk oxkVar, String str, qxk qxkVar, c380 c380Var, yxk yxkVar, sxk sxkVar, s781 s781Var, gmc1 gmc1Var, boolean z, boolean z2, boolean z3, nyb nybVar, dyh1 dyh1Var, String str2, boolean z4, mrn mrnVar, h1e h1eVar, int i, sxk sxkVar2, c380 c380Var2, u380 u380Var, u380 u380Var2, boolean z5, c380 c380Var3, String str3, r591 r591Var, String str4, int i2) {
        String str5 = (i2 & 1) != 0 ? oxkVar.a : str;
        qxk qxkVar2 = (i2 & 2) != 0 ? oxkVar.b : qxkVar;
        c380 c380Var4 = (i2 & 4) != 0 ? oxkVar.c : c380Var;
        yxk yxkVar2 = (i2 & 8) != 0 ? oxkVar.d : yxkVar;
        sxk sxkVar3 = (i2 & 16) != 0 ? oxkVar.e : sxkVar;
        s781 s781Var2 = (i2 & 32) != 0 ? oxkVar.f : s781Var;
        String str6 = oxkVar.g;
        gmc1 gmc1Var2 = (i2 & 128) != 0 ? oxkVar.h : gmc1Var;
        String str7 = oxkVar.i;
        boolean z6 = (i2 & 512) != 0 ? oxkVar.j : z;
        boolean z7 = (i2 & 1024) != 0 ? oxkVar.k : z2;
        boolean z8 = oxkVar.l;
        boolean z9 = (i2 & 4096) != 0 ? oxkVar.m : z3;
        nyb nybVar2 = (i2 & 8192) != 0 ? oxkVar.n : nybVar;
        dyh1 dyh1Var2 = (i2 & 16384) != 0 ? oxkVar.o : dyh1Var;
        String str8 = (32768 & i2) != 0 ? oxkVar.f50p : str2;
        boolean z10 = (65536 & i2) != 0 ? oxkVar.q : z4;
        mrn mrnVar2 = (131072 & i2) != 0 ? oxkVar.r : mrnVar;
        h1e h1eVar2 = (262144 & i2) != 0 ? oxkVar.s : h1eVar;
        int i3 = (524288 & i2) != 0 ? oxkVar.t : i;
        sxk sxkVar4 = (1048576 & i2) != 0 ? oxkVar.u : sxkVar2;
        c380 c380Var5 = (2097152 & i2) != 0 ? oxkVar.v : c380Var2;
        u380 u380Var3 = (4194304 & i2) != 0 ? oxkVar.w : u380Var;
        u380 u380Var4 = (8388608 & i2) != 0 ? oxkVar.x : u380Var2;
        boolean z11 = (16777216 & i2) != 0 ? oxkVar.y : z5;
        c380 c380Var6 = (33554432 & i2) != 0 ? oxkVar.z : c380Var3;
        String str9 = (67108864 & i2) != 0 ? oxkVar.A : str3;
        r591 r591Var2 = (134217728 & i2) != 0 ? oxkVar.B : r591Var;
        String str10 = (i2 & 268435456) != 0 ? oxkVar.C : str4;
        oxkVar.getClass();
        return new oxk(str5, qxkVar2, c380Var4, yxkVar2, sxkVar3, s781Var2, str6, gmc1Var2, str7, z6, z7, z8, z9, nybVar2, dyh1Var2, str8, z10, mrnVar2, h1eVar2, i3, sxkVar4, c380Var5, u380Var3, u380Var4, z11, c380Var6, str9, r591Var2, str10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final c380 b() {
        List listSingletonList;
        List listSingletonList2;
        sxk sxkVar = this.e;
        if (v8r.o(sxkVar)) {
            h1e h1eVar = this.s;
            if (h1eVar instanceof e1e) {
                listSingletonList = Collections.singletonList(((e1e) h1eVar).a);
            } else {
                listSingletonList = z6x.a;
            }
        } else {
            listSingletonList = z6x.a;
        }
        if (v8r.o(sxkVar)) {
            s781 s781Var = this.f;
            List listSingletonList3 = s781Var.d;
            if (listSingletonList3.isEmpty()) {
                listSingletonList3 = Collections.singletonList(s781Var.c);
            }
            listSingletonList2 = listSingletonList3;
        } else {
            listSingletonList2 = Collections.singletonList(this.b.b);
        }
        List list = listSingletonList;
        List list2 = listSingletonList2;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new f27((String) it.next(), null, false));
        }
        return mqo1.A(o7h.N0(arrayList, list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxk)) {
            return false;
        }
        oxk oxkVar = (oxk) obj;
        return u890.j(this.a, oxkVar.a) && u890.j(this.b, oxkVar.b) && this.c.equals(oxkVar.c) && u890.j(this.d, oxkVar.d) && u890.j(this.e, oxkVar.e) && u890.j(this.f, oxkVar.f) && u890.j(this.g, oxkVar.g) && u890.j(this.h, oxkVar.h) && u890.j(this.i, oxkVar.i) && this.j == oxkVar.j && this.k == oxkVar.k && this.l == oxkVar.l && this.m == oxkVar.m && this.n == oxkVar.n && u890.j(this.o, oxkVar.o) && u890.j(this.f50p, oxkVar.f50p) && this.q == oxkVar.q && u890.j(this.r, oxkVar.r) && u890.j(this.s, oxkVar.s) && this.t == oxkVar.t && u890.j(this.u, oxkVar.u) && u890.j(this.v, oxkVar.v) && u890.j(this.w, oxkVar.w) && u890.j(this.x, oxkVar.x) && this.y == oxkVar.y && u890.j(this.z, oxkVar.z) && u890.j(this.A, oxkVar.A) && this.B == oxkVar.B && u890.j(this.C, oxkVar.C);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + kk0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31)) * 31)) * 31;
        String str = this.g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        gmc1 gmc1Var = this.h;
        int iHashCode3 = (this.o.hashCode() + ((this.n.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d((iHashCode2 + (gmc1Var == null ? 0 : gmc1Var.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31)) * 31;
        String str2 = this.f50p;
        int iG = xcg1.g((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.q);
        mrn mrnVar = this.r;
        int iF = kaa0.f(this.t, (this.s.hashCode() + ((iG + (mrnVar == null ? 0 : mrnVar.hashCode())) * 31)) * 31, 31);
        sxk sxkVar = this.u;
        int iD = cy30.d(kk0.f(this.z, xcg1.g((this.x.hashCode() + ((this.w.hashCode() + kk0.f(this.v, (iF + (sxkVar == null ? 0 : sxkVar.hashCode())) * 31, 31)) * 31)) * 31, 31, this.y), 31), 31, this.A);
        r591 r591Var = this.B;
        int iHashCode4 = (iD + (r591Var == null ? 0 : r591Var.hashCode())) * 31;
        String str3 = this.C;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
