package p;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kyj0 {
    public final int a;
    public final String b;
    public final ArrayDeque c;
    public final ArrayDeque d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;
    public wj60 g;
    public jyj0 h;
    public long i;

    public kyj0(int i) {
        String string = UUID.randomUUID().toString();
        this.a = i;
        this.b = string;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.i = 1L;
        if (i >= 0) {
            return;
        }
        hhg1.n("History capacity cannot be negative");
        throw null;
    }

    public static void f(ArrayDeque arrayDeque, ntf1 ntf1Var, ntf1 ntf1Var2) {
        ArrayList arrayList = new ArrayList(q7h.U(arrayDeque, 10));
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            wj60 wj60VarA = (wj60) it.next();
            if (wj60VarA.c.equals(ntf1Var)) {
                d0k0 d0k0Var = wj60VarA.b;
                lhg1 lhg1VarT = v1p1.t(d0k0Var.b, ntf1Var2);
                lhg1 lhg1Var = d0k0Var.c;
                wj60VarA = wj60.a(wj60VarA, new d0k0(d0k0Var.a, lhg1VarT, lhg1Var != null ? v1p1.t(lhg1Var, ntf1Var2) : null, v1p1.t(d0k0Var.d, ntf1Var2), d0k0Var.e, d0k0Var.f), ntf1Var2, 1);
            }
            arrayList.add(wj60VarA);
        }
        arrayDeque.clear();
        arrayDeque.addAll(arrayList);
    }

    public static wj60 h(a7k0 a7k0Var, long j) {
        return new wj60(j, a7k0Var.a, a7k0Var.b.a);
    }

    public final void a() {
        jyj0 jyj0Var = this.h;
        if (jyj0Var == null) {
            return;
        }
        this.h = null;
        g(jyj0Var.a, jyj0Var.b, null);
    }

    public final a7k0 b() {
        jyj0 jyj0Var = this.h;
        if (jyj0Var != null) {
            return jyj0Var.b;
        }
        wj60 wj60Var = this.g;
        if (wj60Var != null) {
            d0k0 d0k0Var = wj60Var.b;
            Object obj = this.f.get(wj60Var.c);
            if (obj != null) {
                return new a7k0(d0k0Var, (ilk0) obj);
            }
            eg.m("Required value was null.");
        }
        return null;
    }

    public final lyj0 c() {
        wj60 wj60Var;
        return (this.a == 0 || (wj60Var = this.g) == null) ? new lyj0() : new lyj0(wj60Var.a, this.b, !this.c.isEmpty(), !this.d.isEmpty());
    }

    public final void d() {
        xj61 xj61Var = new xj61();
        wj60 wj60Var = this.g;
        if (wj60Var != null) {
            xj61Var.add(Long.valueOf(wj60Var.a));
        }
        ArrayDeque arrayDeque = this.c;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            xj61Var.add(Long.valueOf(((wj60) it.next()).a));
        }
        ArrayDeque arrayDeque2 = this.d;
        Iterator it2 = arrayDeque2.iterator();
        while (it2.hasNext()) {
            xj61Var.add(Long.valueOf(((wj60) it2.next()).a));
        }
        this.e.keySet().retainAll(cwl1.j(xj61Var));
        xj61 xj61Var2 = new xj61();
        wj60 wj60Var2 = this.g;
        if (wj60Var2 != null) {
            xj61Var2.add(wj60Var2.c);
        }
        Iterator it3 = arrayDeque.iterator();
        while (it3.hasNext()) {
            xj61Var2.add(((wj60) it3.next()).c);
        }
        Iterator it4 = arrayDeque2.iterator();
        while (it4.hasNext()) {
            xj61Var2.add(((wj60) it4.next()).c);
        }
        this.f.keySet().retainAll(cwl1.j(xj61Var2));
    }

    public final lyj0 e(ntf1 ntf1Var, a7k0 a7k0Var) {
        ilk0 ilk0Var = a7k0Var.b;
        if (this.a == 0) {
            return c();
        }
        a();
        ntf1 ntf1Var2 = ilk0Var.a;
        wj60 wj60VarA = this.g;
        if (wj60VarA == null) {
            wj60VarA = null;
        } else if (wj60VarA.c.equals(ntf1Var)) {
            wj60VarA = wj60.a(wj60VarA, a7k0Var.a, ntf1Var2, 1);
        }
        this.g = wj60VarA;
        f(this.c, ntf1Var, ntf1Var2);
        f(this.d, ntf1Var, ntf1Var2);
        LinkedHashMap linkedHashMap = this.f;
        linkedHashMap.remove(ntf1Var);
        linkedHashMap.put(ntf1Var2, ilk0Var);
        d();
        return c();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00cd A[PHI: r10
      0x00cd: PHI (r10v4 p.duk1) = (r10v3 p.duk1), (r10v22 p.duk1), (r10v22 p.duk1) binds: [B:32:0x00bb, B:37:0x00c5, B:38:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f9 A[PHI: r10
      0x00f9: PHI (r10v6 p.jez) = (r10v5 p.jez), (r10v17 p.jez), (r10v17 p.jez) binds: [B:51:0x00e7, B:56:0x00f1, B:57:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0125 A[PHI: r10
      0x0125: PHI (r10v8 p.ha20) = (r10v7 p.ha20), (r10v12 p.ha20), (r10v12 p.ha20) binds: [B:70:0x0113, B:75:0x011d, B:76:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x0151 A[PHI: r1
      0x0151: PHI (r1v12 p.rx30) = (r1v11 p.rx30), (r1v16 p.rx30), (r1v16 p.rx30) binds: [B:89:0x013f, B:94:0x0149, B:95:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    public final lyj0 g(a7k0 a7k0Var, a7k0 a7k0Var2, woo wooVar) {
        duk1 duk1Var;
        jez jezVar;
        ha20 ha20Var;
        rx30 rx30Var;
        d0k0 d0k0Var = a7k0Var2.a;
        ilk0 ilk0Var = a7k0Var2.b;
        wj60 wj60Var = this.g;
        if (wj60Var == null) {
            eg.m("History must be started before recording");
            return null;
        }
        long j = wj60Var.a;
        ilk0 ilk0Var2 = a7k0Var.b;
        ntf1 ntf1Var = ilk0Var2.a;
        LinkedHashMap linkedHashMap = this.f;
        linkedHashMap.put(ntf1Var, ilk0Var2);
        linkedHashMap.put(ilk0Var.a, ilk0Var);
        boolean zL = v1p1.l(a7k0Var, a7k0Var2);
        LinkedHashMap linkedHashMap2 = this.e;
        if (zL) {
            this.g = wj60.a(wj60Var, d0k0Var, ilk0Var.a, 1);
            if (wooVar != null) {
                Long lValueOf = Long.valueOf(j);
                Object obj = linkedHashMap2.get(Long.valueOf(j));
                if (obj == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                linkedHashMap2.put(lValueOf, v1p1.d(wooVar, (wxj0) obj));
            }
            return c();
        }
        wj60 wj60VarH = h(a7k0Var, j);
        ArrayDeque arrayDeque = this.c;
        arrayDeque.addLast(wj60VarH);
        if (arrayDeque.size() > this.a) {
            arrayDeque.removeFirst();
        }
        this.d.clear();
        long j2 = this.i;
        this.i = 1 + j2;
        this.g = h(a7k0Var2, j2);
        Object obj2 = linkedHashMap2.get(Long.valueOf(j));
        if (obj2 == null) {
            eg.m("Required value was null.");
            return null;
        }
        wxj0 wxj0VarD = (wxj0) obj2;
        Iterator it = f46.i0(new lhg1[]{d0k0Var.c, d0k0Var.b}).iterator();
        while (it.hasNext()) {
            q6w0 q6w0Var = ((lhg1) it.next()).a;
            s69 s69Var = q6w0Var.h;
            s69 s69Var2 = s69Var == null ? wxj0VarD.a : s69Var;
            s69 s69Var3 = q6w0Var.i;
            s69 s69Var4 = s69Var3 == null ? wxj0VarD.b : s69Var3;
            duk1 duk1Var2 = wxj0VarD.c;
            if (duk1Var2 != null) {
                duk1Var = duk1Var2;
            } else {
                buk1 buk1Var = q6w0Var.b;
                duk1Var2 = buk1Var != null ? buk1Var.a : null;
                if (s69Var == null && s69Var3 == null) {
                    duk1Var = null;
                } else {
                    duk1Var = duk1Var2;
                }
            }
            gez gezVar = q6w0Var.t;
            gez gezVar2 = gezVar == null ? wxj0VarD.d : gezVar;
            gez gezVar3 = q6w0Var.X;
            gez gezVar4 = gezVar3 == null ? wxj0VarD.e : gezVar3;
            jez jezVar2 = wxj0VarD.f;
            if (jezVar2 != null) {
                jezVar = jezVar2;
            } else {
                hez hezVar = q6w0Var.c;
                jezVar2 = hezVar != null ? hezVar.a : null;
                if (gezVar == null && gezVar3 == null) {
                    jezVar = null;
                } else {
                    jezVar = jezVar2;
                }
            }
            r920 r920Var = q6w0Var.Y;
            r920 r920Var2 = r920Var == null ? wxj0VarD.g : r920Var;
            r920 r920Var3 = q6w0Var.Z;
            r920 r920Var4 = r920Var3 == null ? wxj0VarD.h : r920Var3;
            ha20 ha20Var2 = wxj0VarD.i;
            if (ha20Var2 != null) {
                ha20Var = ha20Var2;
            } else {
                fa20 fa20Var = q6w0Var.d;
                ha20Var2 = fa20Var != null ? fa20Var.a : null;
                if (r920Var == null && r920Var3 == null) {
                    ha20Var = null;
                } else {
                    ha20Var = ha20Var2;
                }
            }
            ox30 ox30Var = q6w0Var.N0;
            ox30 ox30Var2 = ox30Var == null ? wxj0VarD.j : ox30Var;
            ox30 ox30Var3 = q6w0Var.O0;
            ox30 ox30Var4 = ox30Var3 == null ? wxj0VarD.k : ox30Var3;
            rx30 rx30Var2 = wxj0VarD.l;
            if (rx30Var2 != null) {
                rx30Var = rx30Var2;
            } else {
                px30 px30Var = q6w0Var.e;
                rx30Var2 = px30Var != null ? px30Var.a : null;
                if (ox30Var == null && ox30Var3 == null) {
                    rx30Var = null;
                } else {
                    rx30Var = rx30Var2;
                }
            }
            wxj0VarD = new wxj0(s69Var2, s69Var4, duk1Var, gezVar2, gezVar4, jezVar, r920Var2, r920Var4, ha20Var, ox30Var2, ox30Var4, rx30Var);
        }
        Long lValueOf2 = Long.valueOf(j2);
        if (wooVar != null) {
            wxj0VarD = v1p1.d(wooVar, wxj0VarD);
        }
        linkedHashMap2.put(lValueOf2, wxj0VarD);
        d();
        return c();
    }

    public final j7k0 i(wj60 wj60Var) {
        d0k0 d0k0Var = wj60Var.b;
        Object obj = this.f.get(wj60Var.c);
        if (obj != null) {
            return new j7k0(d0k0Var, (ilk0) obj, c(), false);
        }
        eg.m("Required value was null.");
        return null;
    }
}
