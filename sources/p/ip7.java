package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ip7 implements f4r {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public ip7(yk90 yk90Var, dgb1 dgb1Var) {
        this.a = (byte) 3;
        this.c = yk90Var;
        this.b = dgb1Var;
    }

    public final f1r a(Object obj) {
        git0 git0Var;
        lem lemVar;
        int i;
        byte b = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                kp7 kp7Var = (kp7) obj2;
                String str = kp7Var.b;
                i7e0 i7e0Var = ((jey0) obj).a;
                boolean z = i7e0Var instanceof k8e0;
                if (z) {
                    k8e0 k8e0Var = (k8e0) i7e0Var;
                    fh90 fh90VarE = tro1.E(k8e0Var);
                    String str2 = k8e0Var.d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    git0Var = new git0(str2, str, fh90VarE, 8);
                } else {
                    if (!(i7e0Var instanceof jae0)) {
                        eg.o();
                        return null;
                    }
                    git0Var = null;
                }
                f1r f1rVarR = git0Var != null ? qxy0.r(kp7Var.a.N0.a(git0Var)) : null;
                if (z) {
                    k8e0 k8e0Var2 = (k8e0) i7e0Var;
                    lemVar = new lem(10, k8e0Var2.c, tro1.D(k8e0Var2));
                } else {
                    if (!(i7e0Var instanceof jae0)) {
                        eg.o();
                        return null;
                    }
                    lemVar = null;
                }
                lch lchVarS = g6p1.s(f1rVarR, lemVar != null ? qxy0.r(((km1) kp7Var.g.c).a(lemVar)) : null);
                am1 am1VarM = tro1.m(i7e0Var, str);
                lch lchVarS2 = g6p1.s(lchVarS, am1VarM != null ? qxy0.r(((km1) kp7Var.c.h).a(am1VarM)) : null);
                c1x0 c1x0VarY = tro1.y(i7e0Var);
                lch lchVarS3 = g6p1.s(lchVarS2, c1x0VarY != null ? qxy0.r(((iik0) kp7Var.d.h).a(c1x0VarY)) : null);
                yk90 yk90Var = (yk90) obj3;
                hwq data = i7e0Var.getData();
                f1r f1rVarF = kp7.f(yk90Var.f, data);
                f1r f1rVarR2 = f1rVarF != null ? qxy0.r(f1rVarF) : null;
                f1r f1rVarF2 = kp7.f(yk90Var.a, data);
                lch lchVarS4 = g6p1.s(f1rVarR2, f1rVarF2 != null ? qxy0.r(f1rVarF2) : null);
                f1r f1rVarF3 = kp7.f(yk90Var.d, data);
                return g6p1.s(lchVarS3, g6p1.s(lchVarS4, f1rVarF3 != null ? qxy0.r(f1rVarF3) : null));
            case 1:
                return ((o3r) ((s24) obj2).h).a((String) obj3);
            case 2:
                vw21 vw21Var = (vw21) obj2;
                Set<aq21> set = (Set) vw21Var.b.get(obj3);
                if (set == null) {
                    eg.m(f4i1.d(obj3, "Missing metadata for key "));
                    return null;
                }
                Set<String> set2 = (Set) ((Map) vw21Var.a.invoke(obj)).get(obj3);
                if (set2 == null) {
                    eg.m(f4i1.d(obj3, "Missing uris for key "));
                    return null;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (aq21 aq21Var : set) {
                    Object key = aq21Var.getKey();
                    if (!(key instanceof Class) || !ez00.class.isAssignableFrom((Class) key)) {
                        hhg1.f(cy30.m("Kodiak LCR metadata keys must be Extension classes, but found ", key, "."));
                        return null;
                    }
                    linkedHashSet.add(aq21Var);
                }
                ArrayList<mmr0> arrayList = new ArrayList();
                for (String str3 : set2) {
                    ArrayList arrayList2 = new ArrayList(q7h.U(linkedHashSet, 10));
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new mmr0(str3, (aq21) it.next()));
                    }
                    r7h.W(arrayList2, arrayList);
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
                for (mmr0 mmr0Var : arrayList) {
                    String str4 = (String) mmr0Var.a;
                    aq21 aq21Var2 = (aq21) mmr0Var.b;
                    xv00 xv00Var = new xv00(rc11.a.b((Class) aq21Var2.getKey()));
                    if (aq21Var2 instanceof zp21) {
                        i = 1;
                    } else {
                        if (!(aq21Var2 instanceof yp21)) {
                            eg.o();
                            return null;
                        }
                        i = 2;
                    }
                    arrayList3.add(new e1r(new jh5(xv00Var, str4), i, new m4r(aq21Var2, (byte) 1)));
                }
                return new hoc0(arrayList3, false);
            default:
                key0 key0Var = (key0) obj;
                h7e0 h7e0Var = key0Var.b;
                yk90 yk90Var2 = (yk90) obj3;
                dgb1 dgb1Var = (dgb1) obj2;
                hwq hwqVar = key0Var.a;
                lch lchVarS5 = g6p1.s(g6p1.s(g6p1.s(dgb1.f(yk90Var2.c, hwqVar), dgb1.f(yk90Var2.e, hwqVar)), dgb1.f(yk90Var2.h, hwqVar)), dgb1.f(yk90Var2.i, hwqVar));
                f1r f1rVarF4 = dgb1.f(yk90Var2.a, hwqVar);
                lch lchVarS6 = g6p1.s(lchVarS5, f1rVarF4 != null ? qxy0.r(f1rVarF4) : null);
                f1r f1rVarF5 = dgb1.f(yk90Var2.b, hwqVar);
                lch lchVarS7 = g6p1.s(lchVarS6, f1rVarF5 != null ? qxy0.r(f1rVarF5) : null);
                f1r f1rVarF6 = dgb1.f(yk90Var2.d, hwqVar);
                lch lchVarS8 = g6p1.s(lchVarS7, f1rVarF6 != null ? qxy0.r(f1rVarF6) : null);
                f1r f1rVarF7 = dgb1.f(yk90Var2.f, hwqVar);
                lch lchVarS9 = g6p1.s(lchVarS8, f1rVarF7 != null ? qxy0.r(f1rVarF7) : null);
                f1r f1rVarF8 = dgb1.f(yk90Var2.g, hwqVar);
                lch lchVarS10 = g6p1.s(lchVarS9, f1rVarF8 != null ? qxy0.r(f1rVarF8) : null);
                f1r f1rVarF9 = dgb1.f(yk90Var2.k, hwqVar);
                lch lchVarS11 = g6p1.s(lchVarS10, f1rVarF9 != null ? qxy0.r(f1rVarF9) : null);
                f1r f1rVarF10 = dgb1.f(yk90Var2.j, hwqVar);
                lch lchVarS12 = g6p1.s(lchVarS11, f1rVarF10 != null ? qxy0.r(f1rVarF10) : null);
                Iterator it2 = yk90Var2.l.iterator();
                lch lchVarS13 = null;
                while (it2.hasNext()) {
                    f1r f1rVarF11 = dgb1.f((xk90) it2.next(), hwqVar);
                    lchVarS13 = g6p1.s(lchVarS13, f1rVarF11 != null ? qxy0.r(f1rVarF11) : null);
                }
                return g6p1.s(g6p1.s(g6p1.s(g6p1.s(lchVarS12, lchVarS13), qxy0.r(dgb1Var.X.a(key0Var))), dgb1Var.i ? qxy0.r(dgb1Var.Y.a(key0Var)) : null), dgb1Var.d ? g6p1.s(qxy0.r(((o3r) dgb1Var.e.d).a(new i1q0(h7e0Var.getUri(), dgb1Var.a))), qxy0.r(dgb1Var.f.a.a(new g1q0(h7e0Var.getUri())))) : null);
        }
    }

    public /* synthetic */ ip7(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
