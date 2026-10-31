package p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lqb0 extends yqb0 {
    public static final /* synthetic */ int v = 0;
    public final beg n;
    public final mb11 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f28p;
    public final toe0 q;
    public final toe0 r;
    public final toe0 s;
    public final toe0 t;
    public final ffr u;

    public lqb0(o860 o860Var, beg begVar, mb11 mb11Var, boolean z, lqb0 lqb0Var) {
        super(o860Var, lqb0Var);
        this.n = begVar;
        this.o = mb11Var;
        this.f28p = z;
        voe0 voe0Var = (voe0) ((uw0) o860Var.b).d;
        this.q = new toe0(voe0Var, new na((Object) this, (Object) o860Var, (byte) 28));
        this.r = new toe0(voe0Var, new iqb0(this, (byte) 0));
        this.s = new toe0(voe0Var, new jqb0(o860Var, this));
        this.t = new toe0(voe0Var, new iqb0(this, (byte) 1));
        this.u = voe0Var.b(new da((Object) this, (Object) o860Var, (byte) 27));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    public static xw81 A(xw81 xw81Var) {
        kf30 kf30VarI;
        tsi1 tsi1Var = (tsi1) o7h.C0(xw81Var.F());
        if (tsi1Var != null) {
            jfg jfgVarS = tsi1Var.getType().t0().s();
            if (jfgVarS != null) {
                int i = kht.a;
                lf30 lf30VarF = iht.f(jfgVarS);
                if (!lf30VarF.d()) {
                    lf30VarF = null;
                }
                if (lf30VarF != null) {
                    kf30VarI = lf30VarF.i();
                } else {
                    kf30VarI = null;
                }
            } else {
                kf30VarI = null;
            }
            if (!u890.j(kf30VarI, sfb1.g)) {
                tsi1Var = null;
            }
            if (tsi1Var != null) {
                xw81 xw81Var2 = (xw81) xw81Var.n0().a(o7h.l0(1, xw81Var.F())).t(((e1h1) tsi1Var.getType().r0().get(0)).b()).build();
                if (xw81Var2 != null) {
                    xw81Var2.V0 = true;
                }
                return xw81Var2;
            }
        }
        return null;
    }

    public static boolean C(ov30 ov30Var, ov30 ov30Var2) {
        if (exq0.c.n(ov30Var2, ov30Var, true).b() != 1) {
            return false;
        }
        JavaIncompatibilityRulesOverridabilityCondition.Companion.getClass();
        return !b8a0.a(ov30Var2, ov30Var);
    }

    public static boolean D(xw81 xw81Var, xw81 xw81Var2) {
        int i = ccc.l;
        if (u890.j(xw81Var.getName().b(), "removeAt") && u890.j(h0p1.n(xw81Var), koa1.g.e)) {
            xw81Var2 = xw81Var2.a();
        }
        xw81Var2.getClass();
        return C(xw81Var2, xw81Var);
    }

    public static xw81 E(tdy0 tdy0Var, String str, iu30 iu30Var) {
        xw81 xw81Var;
        Iterator it = ((Iterable) iu30Var.invoke(ajn0.e(str))).iterator();
        do {
            xw81Var = null;
            if (!it.hasNext()) {
                break;
            }
            xw81 xw81Var2 = (xw81) it.next();
            if (xw81Var2.F().size() == 0) {
                cao0 cao0Var = c8b0.a;
                a8b0 a8b0Var = xw81Var2.h;
                if (a8b0Var == null ? false : cao0Var.b(a8b0Var, tdy0Var.getType())) {
                    xw81Var = xw81Var2;
                }
            }
        } while (xw81Var == null);
        return xw81Var;
    }

    public static xw81 G(tdy0 tdy0Var, iu30 iu30Var) {
        xw81 xw81Var;
        a8b0 a8b0Var;
        Iterator it = ((Iterable) iu30Var.invoke(ajn0.e(dia0.b(tdy0Var.getName().b())))).iterator();
        do {
            xw81Var = null;
            if (!it.hasNext()) {
                break;
            }
            xw81 xw81Var2 = (xw81) it.next();
            if (xw81Var2.F().size() == 1 && (a8b0Var = xw81Var2.h) != null) {
                ajn0 ajn0Var = g6b0.e;
                if (g6b0.E(a8b0Var, rfb1.d) && c8b0.a.a(((tsi1) o7h.V0(xw81Var2.F())).getType(), tdy0Var.getType())) {
                    xw81Var = xw81Var2;
                }
            }
        } while (xw81Var == null);
        return xw81Var;
    }

    public static xw81 z(xw81 xw81Var, ov30 ov30Var, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return xw81Var;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            xw81 xw81Var2 = (xw81) it.next();
            if (!xw81Var.equals(xw81Var2) && xw81Var2.c1 == null && C(xw81Var2, ov30Var)) {
                ov30 ov30VarBuild = xw81Var.n0().o().build();
                ov30VarBuild.getClass();
                return (xw81) ov30VarBuild;
            }
        }
        return xw81Var;
    }

    public final boolean B(tdy0 tdy0Var, iu30 iu30Var) {
        if (nb51.G(tdy0Var)) {
            return false;
        }
        xw81 xw81VarF = F(tdy0Var, iu30Var);
        xw81 xw81VarG = G(tdy0Var, iu30Var);
        if (xw81VarF == null) {
            return false;
        }
        if (tdy0Var.K()) {
            return xw81VarG != null && xw81VarG.o() == xw81VarF.o();
        }
        return true;
    }

    public final xw81 F(tdy0 tdy0Var, iu30 iu30Var) {
        ajn0 ajn0Var;
        zdy0 zdy0VarB = tdy0Var.b();
        String strB = null;
        zdy0 zdy0Var = zdy0VarB != null ? (zdy0) wpb1.x(zdy0VarB) : null;
        if (zdy0Var != null) {
            g6b0.A(zdy0Var);
            jyc jycVarB = kht.b(kht.i(zdy0Var), ye3.R0);
            if (jycVarB != null && (ajn0Var = (ajn0) ecc.a.get(kht.g(jycVarB))) != null) {
                strB = ajn0Var.b();
            }
        }
        return (strB == null || wpb1.y(this.n, zdy0Var)) ? E(tdy0Var, dia0.a(tdy0Var.getName().b()), iu30Var) : E(tdy0Var, strB, iu30Var);
    }

    public final LinkedHashSet H(ajn0 ajn0Var) {
        Collection collectionY = y();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionY.iterator();
        while (it.hasNext()) {
            r7h.W(((a8b0) it.next()).E().c(ajn0Var, 15), linkedHashSet);
        }
        return linkedHashSet;
    }

    public final Set I(ajn0 ajn0Var) {
        Collection collectionY = y();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionY.iterator();
        while (it.hasNext()) {
            Collection collectionA = ((a8b0) it.next()).E().a(ajn0Var, 15);
            ArrayList arrayList2 = new ArrayList(q7h.U(collectionA, 10));
            Iterator it2 = collectionA.iterator();
            while (it2.hasNext()) {
                arrayList2.add((tdy0) it2.next());
            }
            r7h.W(arrayList2, arrayList);
        }
        return o7h.p1(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[LOOP:1: B:56:0x011a->B:104:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x016f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x01af A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:55:0x0116  */
    /* JADX WARN: Code duplicated, block: B:58:0x0120  */
    /* JADX WARN: Code duplicated, block: B:61:0x012e  */
    /* JADX WARN: Code duplicated, block: B:64:0x013d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0154  */
    /* JADX WARN: Code duplicated, block: B:73:0x016b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0175  */
    /* JADX WARN: Code duplicated, block: B:84:0x019c  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c8 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:98:0x00ee A[SYNTHETIC] */
    public final boolean J(xw81 xw81Var) {
        List listN;
        ajn0 ajn0Var;
        xw81 xw81VarA;
        LinkedHashSet<xw81> linkedHashSetH;
        ArrayList<ov30> arrayList;
        Iterator it;
        ov30 ov30VarA;
        ArrayList arrayList2;
        xw81 xw81Var2;
        Iterator it2;
        ajn0 name = xw81Var.getName();
        String strB = name.b();
        kf30 kf30Var = dia0.a;
        if (nhc1.Y(strB, "get", false) || nhc1.Y(strB, "is", false)) {
            ajn0 ajn0VarR = f0o1.r(name, "get", (String) null, 12);
            if (ajn0VarR == null) {
                ajn0VarR = f0o1.r(name, "is", (String) null, 8);
            }
            listN = p7h.N(ajn0VarR);
        } else if (nhc1.Y(strB, "set", false)) {
            listN = f46.i0(new ajn0[]{f0o1.r(name, "set", (String) null, 4), f0o1.r(name, "set", "is", 4)});
        } else {
            listN = (List) ecc.b.get(name);
            if (listN == null) {
                listN = z6x.a;
            }
        }
        List list = listN;
        if ((list instanceof Collection) && list.isEmpty()) {
            ArrayList arrayList3 = koa1.a;
            ajn0Var = (ajn0) koa1.k.get(xw81Var.getName());
            if (ajn0Var == null) {
                int i = dcc.l;
                if (koa1.e.contains(xw81Var.getName())) {
                    LinkedHashSet linkedHashSetH2 = H(xw81Var.getName());
                    arrayList = new ArrayList();
                    it = linkedHashSetH2.iterator();
                    while (it.hasNext()) {
                        ov30VarA = dcc.a((xw81) it.next());
                        if (ov30VarA != null) {
                            arrayList.add(ov30VarA);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        for (ov30 ov30Var : arrayList) {
                            if (!h0p1.m(xw81Var, 2).equals(h0p1.m(ov30Var.w1(), 2))) {
                            }
                        }
                    }
                }
                xw81VarA = A(xw81Var);
                if (xw81VarA == null) {
                    return true;
                }
                linkedHashSetH = H(xw81Var.getName());
                if (linkedHashSetH.isEmpty()) {
                    return true;
                }
                for (xw81 xw81Var3 : linkedHashSetH) {
                    if (xw81Var3.isSuspend()) {
                    }
                }
                return true;
            }
            LinkedHashSet linkedHashSetH3 = H(ajn0Var);
            arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetH3) {
                if (wpb1.x((xw81) obj) != null) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                int i2 = dcc.l;
                if (koa1.e.contains(xw81Var.getName())) {
                    LinkedHashSet linkedHashSetH4 = H(xw81Var.getName());
                    arrayList = new ArrayList();
                    it = linkedHashSetH4.iterator();
                    while (it.hasNext()) {
                        ov30VarA = dcc.a((xw81) it.next());
                        if (ov30VarA != null) {
                            arrayList.add(ov30VarA);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        while (r0.hasNext()) {
                            if (!h0p1.m(xw81Var, 2).equals(h0p1.m(ov30Var.w1(), 2))) {
                            }
                        }
                    }
                }
                xw81VarA = A(xw81Var);
                if (xw81VarA == null) {
                    return true;
                }
                linkedHashSetH = H(xw81Var.getName());
                if (linkedHashSetH.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (xw81Var3.isSuspend()) {
                    }
                }
                return true;
            }
            nv30 nv30VarN0 = xw81Var.n0();
            nv30VarN0.d(ajn0Var);
            nv30VarN0.H();
            nv30VarN0.w();
            ov30 ov30VarBuild = nv30VarN0.build();
            ov30VarBuild.getClass();
            xw81Var2 = (xw81) ov30VarBuild;
            if (arrayList2.isEmpty()) {
                int i3 = dcc.l;
                if (koa1.e.contains(xw81Var.getName())) {
                    LinkedHashSet linkedHashSetH5 = H(xw81Var.getName());
                    arrayList = new ArrayList();
                    it = linkedHashSetH5.iterator();
                    while (it.hasNext()) {
                        ov30VarA = dcc.a((xw81) it.next());
                        if (ov30VarA != null) {
                            arrayList.add(ov30VarA);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        while (r0.hasNext()) {
                            if (!h0p1.m(xw81Var, 2).equals(h0p1.m(ov30Var.w1(), 2))) {
                            }
                        }
                    }
                }
                xw81VarA = A(xw81Var);
                if (xw81VarA == null) {
                    return true;
                }
                linkedHashSetH = H(xw81Var.getName());
                if (linkedHashSetH.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (xw81Var3.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (D((xw81) it2.next(), xw81Var2)) {
                }
            }
            int i4 = dcc.l;
            if (koa1.e.contains(xw81Var.getName())) {
                LinkedHashSet linkedHashSetH6 = H(xw81Var.getName());
                arrayList = new ArrayList();
                it = linkedHashSetH6.iterator();
                while (it.hasNext()) {
                    ov30VarA = dcc.a((xw81) it.next());
                    if (ov30VarA != null) {
                        arrayList.add(ov30VarA);
                    }
                }
                if (!arrayList.isEmpty()) {
                    while (r0.hasNext()) {
                        if (!h0p1.m(xw81Var, 2).equals(h0p1.m(ov30Var.w1(), 2))) {
                        }
                    }
                }
            }
            xw81VarA = A(xw81Var);
            if (xw81VarA == null) {
                return true;
            }
            linkedHashSetH = H(xw81Var.getName());
            if (linkedHashSetH.isEmpty()) {
                return true;
            }
            while (r8.hasNext()) {
                if (xw81Var3.isSuspend()) {
                }
            }
            return true;
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Set<tdy0> setI = I((ajn0) it3.next());
            if (!(setI instanceof Collection) || !setI.isEmpty()) {
                for (tdy0 tdy0Var : setI) {
                    if (!B(tdy0Var, new da((Object) xw81Var, (Object) this, (byte) 28)) || (!tdy0Var.K() && nhc1.Y(xw81Var.getName().b(), "set", false))) {
                    }
                }
            }
        }
        ArrayList arrayList4 = koa1.a;
        ajn0Var = (ajn0) koa1.k.get(xw81Var.getName());
        if (ajn0Var == null) {
            int i5 = dcc.l;
            if (koa1.e.contains(xw81Var.getName())) {
                LinkedHashSet linkedHashSetH7 = H(xw81Var.getName());
                arrayList = new ArrayList();
                it = linkedHashSetH7.iterator();
                while (it.hasNext()) {
                    ov30VarA = dcc.a((xw81) it.next());
                    if (ov30VarA != null) {
                        arrayList.add(ov30VarA);
                    }
                }
                if (!arrayList.isEmpty()) {
                    while (r0.hasNext()) {
                        if (!h0p1.m(xw81Var, 2).equals(h0p1.m(ov30Var.w1(), 2)) && !C(xw81Var, ov30Var)) {
                            return false;
                        }
                    }
                }
            }
            xw81VarA = A(xw81Var);
            if (xw81VarA == null) {
                return true;
            }
            linkedHashSetH = H(xw81Var.getName());
            if (linkedHashSetH.isEmpty()) {
                return true;
            }
            while (r8.hasNext()) {
                if (xw81Var3.isSuspend() || !C(xw81VarA, xw81Var3)) {
                }
            }
            return true;
        }
        LinkedHashSet linkedHashSetH8 = H(ajn0Var);
        arrayList2 = new ArrayList();
        while (r1.hasNext()) {
            if (wpb1.x((xw81) obj) != null) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            int i6 = dcc.l;
            if (koa1.e.contains(xw81Var.getName())) {
                LinkedHashSet linkedHashSetH9 = H(xw81Var.getName());
                arrayList = new ArrayList();
                it = linkedHashSetH9.iterator();
                while (it.hasNext()) {
                    ov30VarA = dcc.a((xw81) it.next());
                    if (ov30VarA != null) {
                        arrayList.add(ov30VarA);
                    }
                }
                if (!arrayList.isEmpty()) {
                    while (r0.hasNext()) {
                        if (!h0p1.m(xw81Var, 2).equals(h0p1.m(ov30Var.w1(), 2))) {
                        }
                    }
                }
            }
            xw81VarA = A(xw81Var);
            if (xw81VarA == null) {
                return true;
            }
            linkedHashSetH = H(xw81Var.getName());
            if (linkedHashSetH.isEmpty()) {
                return true;
            }
            while (r8.hasNext()) {
                if (xw81Var3.isSuspend()) {
                }
            }
            return true;
        }
        nv30 nv30VarN1 = xw81Var.n0();
        nv30VarN1.d(ajn0Var);
        nv30VarN1.H();
        nv30VarN1.w();
        ov30 ov30VarBuild2 = nv30VarN1.build();
        ov30VarBuild2.getClass();
        xw81Var2 = (xw81) ov30VarBuild2;
        if (arrayList2.isEmpty()) {
            int i7 = dcc.l;
            if (koa1.e.contains(xw81Var.getName())) {
                LinkedHashSet linkedHashSetH10 = H(xw81Var.getName());
                arrayList = new ArrayList();
                it = linkedHashSetH10.iterator();
                while (it.hasNext()) {
                    ov30VarA = dcc.a((xw81) it.next());
                    if (ov30VarA != null) {
                        arrayList.add(ov30VarA);
                    }
                }
                if (!arrayList.isEmpty()) {
                    while (r0.hasNext()) {
                        if (!h0p1.m(xw81Var, 2).equals(h0p1.m(ov30Var.w1(), 2))) {
                        }
                    }
                }
            }
            xw81VarA = A(xw81Var);
            if (xw81VarA == null) {
                return true;
            }
            linkedHashSetH = H(xw81Var.getName());
            if (linkedHashSetH.isEmpty()) {
                return true;
            }
            while (r8.hasNext()) {
                if (xw81Var3.isSuspend()) {
                }
            }
            return true;
        }
        it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (D((xw81) it2.next(), xw81Var2)) {
            }
        }
        int i8 = dcc.l;
        if (koa1.e.contains(xw81Var.getName())) {
            LinkedHashSet linkedHashSetH11 = H(xw81Var.getName());
            arrayList = new ArrayList();
            it = linkedHashSetH11.iterator();
            while (it.hasNext()) {
                ov30VarA = dcc.a((xw81) it.next());
                if (ov30VarA != null) {
                    arrayList.add(ov30VarA);
                }
            }
            if (!arrayList.isEmpty()) {
                while (r0.hasNext()) {
                    if (!h0p1.m(xw81Var, 2).equals(h0p1.m(ov30Var.w1(), 2))) {
                    }
                }
            }
        }
        xw81VarA = A(xw81Var);
        if (xw81VarA == null) {
            return true;
        }
        linkedHashSetH = H(xw81Var.getName());
        if (linkedHashSetH.isEmpty()) {
            return true;
        }
        while (r8.hasNext()) {
            if (xw81Var3.isSuspend()) {
            }
        }
        return true;
        return false;
    }

    public final ArrayList K(ajn0 ajn0Var) {
        Collection collectionB = ((u9r) this.e.invoke()).b(ajn0Var);
        ArrayList arrayList = new ArrayList(q7h.U(collectionB, 10));
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            arrayList.add(s((vb11) it.next()));
        }
        return arrayList;
    }

    public final ArrayList L(ajn0 ajn0Var) {
        LinkedHashSet linkedHashSetH = H(ajn0Var);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetH) {
            xw81 xw81Var = (xw81) obj;
            if (wpb1.x(xw81Var) == null && dcc.a(xw81Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p.yqb0, p.aqi0, p.zpi0
    public final Collection a(ajn0 ajn0Var, int i) {
        Object obj = this.b.b;
        return super.a(ajn0Var, i);
    }

    @Override // p.yqb0, p.aqi0, p.zpi0
    public final Collection c(ajn0 ajn0Var, int i) {
        Object obj = this.b.b;
        return super.c(ajn0Var, i);
    }

    @Override // p.aqi0, p.zpi0
    public final jfg g(ajn0 ajn0Var, int i) {
        ffr ffrVar;
        beg begVar;
        Object obj = this.b.b;
        lqb0 lqb0Var = (lqb0) this.c;
        return (lqb0Var == null || (ffrVar = lqb0Var.u) == null || (begVar = (beg) ffrVar.invoke(ajn0Var)) == null) ? (jfg) this.u.invoke(ajn0Var) : begVar;
    }

    @Override // p.yqb0
    public final Set h(wgt wgtVar, iu30 iu30Var) {
        return dm61.y0((Set) this.r.invoke(), ((Map) this.t.invoke()).keySet());
    }

    @Override // p.yqb0
    public final Set i(wgt wgtVar, iu30 iu30Var) {
        Collection collectionD = this.n.g().d();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionD.iterator();
        while (it.hasNext()) {
            r7h.W(((a8b0) it.next()).E().b(), linkedHashSet);
        }
        toe0 toe0Var = this.e;
        linkedHashSet.addAll(((u9r) toe0Var.invoke()).a());
        linkedHashSet.addAll(((u9r) toe0Var.invoke()).d());
        linkedHashSet.addAll(h(wgtVar, iu30Var));
        Object obj = this.b.b;
        linkedHashSet.addAll(new ArrayList());
        return linkedHashSet;
    }

    @Override // p.yqb0
    public final void j(ArrayList arrayList, ajn0 ajn0Var) {
        boolean zI = this.o.i();
        o860 o860Var = this.b;
        if (zI) {
            toe0 toe0Var = this.e;
            if (((u9r) toe0Var.invoke()).c(ajn0Var) != null) {
                if (arrayList.isEmpty()) {
                    yb11 yb11VarC = ((u9r) toe0Var.invoke()).c(ajn0Var);
                    yb11VarC.getClass();
                    c8a0 c8a0VarL1 = c8a0.L1(this.n, flo1.n(o860Var, yb11VarC), yb11VarC.c(), wdx0.b(yb11VarC), true);
                    a8b0 a8b0VarL = ((st60) o860Var.e).L(yb11VarC.f(), bs51.u(2, false, (drb0) null, 6));
                    rob0 rob0VarO = o();
                    lht lhtVar = mht.e;
                    z6x z6xVar = z6x.a;
                    c8a0VarL1.K1(null, rob0VarO, z6xVar, z6xVar, z6xVar, a8b0VarL, 3, lhtVar, null);
                    c8a0VarL1.e1 = 1;
                    arrayList.add(c8a0VarL1);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((xw81) it.next()).F().isEmpty()) {
                        }
                    }
                    yb11 yb11VarC2 = ((u9r) toe0Var.invoke()).c(ajn0Var);
                    yb11VarC2.getClass();
                    c8a0 c8a0VarL2 = c8a0.L1(this.n, flo1.n(o860Var, yb11VarC2), yb11VarC2.c(), wdx0.b(yb11VarC2), true);
                    a8b0 a8b0VarL2 = ((st60) o860Var.e).L(yb11VarC2.f(), bs51.u(2, false, (drb0) null, 6));
                    rob0 rob0VarO2 = o();
                    lht lhtVar2 = mht.e;
                    z6x z6xVar2 = z6x.a;
                    c8a0VarL2.K1(null, rob0VarO2, z6xVar2, z6xVar2, z6xVar2, a8b0VarL2, 3, lhtVar2, null);
                    c8a0VarL2.e1 = 1;
                    arrayList.add(c8a0VarL2);
                }
            }
        }
        Object obj = o860Var.b;
    }

    @Override // p.yqb0
    public final u9r k() {
        return new aeg(this.o, aht.b1);
    }

    @Override // p.yqb0
    public final void l(LinkedHashSet linkedHashSet, ajn0 ajn0Var) {
        LinkedHashSet linkedHashSetH = H(ajn0Var);
        if (!koa1.j.contains(ajn0Var)) {
            int i = dcc.l;
            if (!koa1.e.contains(ajn0Var)) {
                if (!linkedHashSetH.isEmpty()) {
                    Iterator it = linkedHashSetH.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((ov30) it.next()).isSuspend()) {
                            }
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : linkedHashSetH) {
                    if (J((xw81) obj)) {
                        arrayList.add(obj);
                    }
                }
                v(linkedHashSet, ajn0Var, arrayList, false);
                return;
            }
        }
        a9 bi91Var = new bi91();
        LinkedHashSet linkedHashSetE = rc2.E(ajn0Var, linkedHashSetH, z6x.a, this.n, siz.F, ((cao0) ((bao0) ((uw0) this.b.b).b)).d);
        w(ajn0Var, linkedHashSet, linkedHashSetE, linkedHashSet, new ft30(1, this, lqb0.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, (byte) 24));
        w(ajn0Var, linkedHashSet, linkedHashSetE, bi91Var, new ft30(1, this, lqb0.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, (byte) 25));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : linkedHashSetH) {
            if (J((xw81) obj2)) {
                arrayList2.add(obj2);
            }
        }
        v(linkedHashSet, ajn0Var, o7h.N0(bi91Var, arrayList2), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable, p.a9, p.bi91] */
    @Override // p.yqb0
    public final void m(ArrayList arrayList, ajn0 ajn0Var) {
        vb11 vb11Var;
        boolean zIsAnnotation = this.o.a.isAnnotation();
        o860 o860Var = this.b;
        if (zIsAnnotation && (vb11Var = (vb11) o7h.W0(((u9r) this.e.invoke()).b(ajn0Var))) != null) {
            f8a0 f8a0VarF1 = f8a0.F1(this.n, flo1.n(o860Var, vb11Var), kuo1.k(vb11Var.e()), false, vb11Var.c(), wdx0.b(vb11Var), false);
            zdy0 zdy0VarI = sj1.i(f8a0VarF1, rzs0.g);
            f8a0VarF1.B1(zdy0VarI, null, null, null);
            a8b0 a8b0VarL = ((st60) ryn1.n(o860Var, f8a0VarF1, vb11Var, 0, (znb0) o860Var.d).e).L(vb11Var.g(), bs51.u(2, ((Method) vb11Var.b()).getDeclaringClass().isAnnotation(), (drb0) null, 6));
            rob0 rob0VarO = o();
            z6x z6xVar = z6x.a;
            f8a0VarF1.E1(a8b0VarL, z6xVar, rob0VarO, null, z6xVar);
            zdy0VarI.N0 = a8b0VarL;
            arrayList.add(f8a0VarF1);
        }
        Set setI = I(ajn0Var);
        if (setI.isEmpty()) {
            return;
        }
        ?? bi91Var = new bi91();
        a9 bi91Var2 = new bi91();
        x(setI, arrayList, bi91Var, new kqb0(this, (byte) 0));
        x(dm61.v0(setI, (Iterable) bi91Var), bi91Var2, null, new kqb0(this, (byte) 1));
        arrayList.addAll(rc2.E(ajn0Var, dm61.y0(setI, bi91Var2), arrayList, this.n, rdx0.g, ((cao0) ((bao0) ((uw0) o860Var.b).b)).d));
    }

    @Override // p.yqb0
    public final Set n() {
        if (this.o.a.isAnnotation()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((u9r) this.e.invoke()).e());
        Iterator it = this.n.g().d().iterator();
        while (it.hasNext()) {
            r7h.W(((a8b0) it.next()).E().f(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // p.yqb0
    public final rob0 o() {
        beg begVar = this.n;
        if (begVar != null) {
            int i = iht.a;
            return begVar.q0();
        }
        iht.a(0);
        throw null;
    }

    @Override // p.yqb0
    public final n9r p() {
        return this.n;
    }

    @Override // p.yqb0
    public final boolean q(c8a0 c8a0Var) {
        if (this.o.a.isAnnotation()) {
            return false;
        }
        return J(c8a0Var);
    }

    @Override // p.yqb0
    public final xqb0 r(ArrayList arrayList, a8b0 a8b0Var, List list) {
        Object obj = this.b.b;
        if (this.n != null) {
            List list2 = Collections.EMPTY_LIST;
            if (list2 != null) {
                return new xqb0(a8b0Var, list, arrayList, list2);
            }
            k220.q("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"});
            return null;
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p.yqb0
    public final String toString() {
        return "Lazy Java member scope for " + this.o.d();
    }

    public final void u(ArrayList arrayList, p7a0 p7a0Var, int i, vb11 vb11Var, a8b0 a8b0Var, a8b0 a8b0Var2) {
        db11 nb11Var;
        eg5 eg5Var = rzs0.g;
        ajn0 ajn0VarC = vb11Var.c();
        if (a8b0Var == null) {
            o1h1.a(2);
            throw null;
        }
        gmh1 gmh1VarG = o1h1.g(a8b0Var, false);
        Object defaultValue = vb11Var.a.getDefaultValue();
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List list = bb11.a;
            if (Enum.class.isAssignableFrom(cls)) {
                nb11Var = new rb11(null, (Enum) defaultValue);
            } else if (defaultValue instanceof Annotation) {
                nb11Var = new eb11(null, (Annotation) defaultValue);
            } else if (defaultValue instanceof Object[]) {
                nb11Var = new fb11(null, (Object[]) defaultValue);
            } else {
                nb11Var = defaultValue instanceof Class ? new nb11(null, (Class) defaultValue) : new tb11(null, defaultValue);
            }
        } else {
            nb11Var = null;
        }
        boolean z = nb11Var != null;
        gmh1 gmh1VarG2 = a8b0Var2 != null ? o1h1.g(a8b0Var2, false) : null;
        Object obj = this.b.b;
        arrayList.add(new tsi1(p7a0Var, null, i, eg5Var, ajn0VarC, gmh1VarG, z, false, false, gmh1VarG2, wdx0.b(vb11Var)));
    }

    public final void v(LinkedHashSet linkedHashSet, ajn0 ajn0Var, ArrayList arrayList, boolean z) {
        LinkedHashSet<xw81> linkedHashSetE = rc2.E(ajn0Var, arrayList, linkedHashSet, this.n, rdx0.g, ((cao0) ((bao0) ((uw0) this.b.b).b)).d);
        if (!z) {
            linkedHashSet.addAll(linkedHashSetE);
            return;
        }
        ArrayList arrayListN0 = o7h.N0(linkedHashSetE, linkedHashSet);
        ArrayList arrayList2 = new ArrayList(q7h.U(linkedHashSetE, 10));
        for (xw81 xw81VarZ : linkedHashSetE) {
            jyc jycVarX = wpb1.x(xw81VarZ);
            if (jycVarX == null) {
                int i = dcc.l;
                jycVarX = !koa1.e.contains(xw81VarZ.getName()) ? null : kht.b(xw81VarZ, j141.t);
            }
            xw81 xw81Var = (xw81) jycVarX;
            if (xw81Var != null) {
                xw81VarZ = z(xw81VarZ, xw81Var, arrayListN0);
            }
            arrayList2.add(xw81VarZ);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0065  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void w(ajn0 ajn0Var, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, iu30 iu30Var) {
        xw81 xw81VarZ;
        Object next;
        xw81 xw81Var;
        xw81 xw81VarZ2;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            xw81 xw81Var2 = (xw81) it.next();
            xw81 xw81Var3 = (xw81) wpb1.x(xw81Var2);
            xw81 xw81Var4 = null;
            if (xw81Var3 != null) {
                String strW = wpb1.w(xw81Var3);
                strW.getClass();
                Iterator it2 = ((Collection) iu30Var.invoke(ajn0.e(strW))).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        xw81VarZ = null;
                        break;
                    }
                    nv30 nv30VarN0 = ((xw81) it2.next()).n0();
                    nv30VarN0.d(ajn0Var);
                    nv30VarN0.H();
                    nv30VarN0.w();
                    ov30 ov30VarBuild = nv30VarN0.build();
                    ov30VarBuild.getClass();
                    xw81 xw81Var5 = (xw81) ov30VarBuild;
                    if (D(xw81Var3, xw81Var5)) {
                        xw81VarZ = z(xw81Var5, xw81Var3, linkedHashSet);
                        break;
                    }
                }
            } else {
                xw81VarZ = null;
                break;
            }
            h4p1.d(abstractSet, xw81VarZ);
            ov30 ov30VarA = dcc.a(xw81Var2);
            if (ov30VarA == 0) {
                xw81VarZ2 = null;
            } else {
                Iterator it3 = ((Iterable) iu30Var.invoke(((o9r) ov30VarA).getName())).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    xw81 xw81Var6 = (xw81) next;
                    if (h0p1.m(xw81Var6, 2).equals(h0p1.m(ov30VarA.w1(), 2)) && !C(xw81Var6, ov30VarA)) {
                        break;
                    }
                }
                xw81 xw81Var7 = (xw81) next;
                if (xw81Var7 != null) {
                    nv30 nv30VarN1 = xw81Var7.n0();
                    List listF = ov30VarA.F();
                    ArrayList arrayList = new ArrayList(q7h.U(listF, 10));
                    Iterator it4 = listF.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((tsi1) it4.next()).getType());
                    }
                    nv30VarN1.a(xto1.w(arrayList, xw81Var7.F(), ov30VarA));
                    nv30VarN1.H();
                    nv30VarN1.w();
                    nv30VarN1.A();
                    xw81Var = (xw81) nv30VarN1.build();
                } else {
                    xw81Var = null;
                }
                if (xw81Var == null) {
                    xw81VarZ2 = null;
                } else {
                    if (!J(xw81Var)) {
                        xw81Var = null;
                    }
                    if (xw81Var != null) {
                        xw81VarZ2 = z(xw81Var, ov30VarA, linkedHashSet);
                    } else {
                        xw81VarZ2 = null;
                    }
                }
            }
            h4p1.d(abstractSet, xw81VarZ2);
            if (xw81Var2.isSuspend()) {
                Iterator it5 = ((Iterable) iu30Var.invoke(xw81Var2.getName())).iterator();
                while (it5.hasNext()) {
                    xw81 xw81VarA = A((xw81) it5.next());
                    if (xw81VarA == null || !C(xw81VarA, xw81Var2)) {
                        xw81VarA = null;
                    }
                    if (xw81VarA != null) {
                        xw81Var4 = xw81VarA;
                        break;
                    }
                }
            }
            h4p1.d(abstractSet, xw81Var4);
        }
    }

    public final void x(Set set, AbstractCollection abstractCollection, bi91 bi91Var, iu30 iu30Var) {
        xw81 xw81VarG;
        fey0 fey0VarP;
        a8a0 a8a0Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            tdy0 tdy0Var = (tdy0) it.next();
            if (B(tdy0Var, iu30Var)) {
                xw81 xw81VarF = F(tdy0Var, iu30Var);
                xw81VarF.getClass();
                if (tdy0Var.K()) {
                    xw81VarG = G(tdy0Var, iu30Var);
                    xw81VarG.getClass();
                } else {
                    xw81VarG = null;
                }
                if (xw81VarG != null) {
                    xw81VarG.o();
                    xw81VarF.o();
                }
                a8a0 a8a0Var2 = new a8a0(this.n, rzs0.g, xw81VarF.o(), xw81VarF.getVisibility(), xw81VarG != null, tdy0Var.getName(), xw81VarF.getSource(), null, 1, false, null);
                a8b0 a8b0Var = xw81VarF.h;
                a8b0Var.getClass();
                rob0 rob0VarO = o();
                z6x z6xVar = z6x.a;
                a8a0Var2.E1(a8b0Var, z6xVar, rob0VarO, null, z6xVar);
                zdy0 zdy0VarO = sj1.o(a8a0Var2, xw81VarF.getAnnotations(), false, xw81VarF.getSource());
                zdy0VarO.Z = xw81VarF;
                zdy0VarO.A1(a8a0Var2.getType());
                if (xw81VarG != null) {
                    tsi1 tsi1Var = (tsi1) o7h.s0(xw81VarG.F());
                    if (tsi1Var == null) {
                        ncn0.e(xw81VarG, "No parameter found for ");
                        return;
                    } else {
                        fey0VarP = sj1.p(a8a0Var2, xw81VarG.getAnnotations(), tsi1Var.getAnnotations(), false, xw81VarG.getVisibility(), xw81VarG.getSource());
                        fey0VarP.Z = xw81VarG;
                    }
                } else {
                    fey0VarP = null;
                }
                a8a0Var2.B1(zdy0VarO, fey0VarP, null, null);
                a8a0Var = a8a0Var2;
            } else {
                a8a0Var = null;
            }
            if (a8a0Var != null) {
                abstractCollection.add(a8a0Var);
                if (bi91Var != null) {
                    bi91Var.add(tdy0Var);
                    return;
                }
                return;
            }
        }
    }

    public final Collection y() {
        boolean z = this.f28p;
        beg begVar = this.n;
        if (z) {
            return begVar.g().d();
        }
        Object obj = this.b.b;
        return begVar.g().d();
    }
}
