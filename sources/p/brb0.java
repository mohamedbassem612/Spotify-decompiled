package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class brb0 extends crb0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f4p = 0;
    public final mb11 n;
    public final hqb0 o;

    public brb0(o860 o860Var, mb11 mb11Var, hqb0 hqb0Var) {
        super(o860Var, null);
        this.n = mb11Var;
        this.o = hqb0Var;
    }

    public static tdy0 u(tdy0 tdy0Var) {
        if (tdy0Var.getKind() != 2) {
            return tdy0Var;
        }
        Collection<tdy0> collectionL = tdy0Var.l();
        ArrayList arrayList = new ArrayList(q7h.U(collectionL, 10));
        for (tdy0 tdy0Var2 : collectionL) {
            tdy0Var2.getClass();
            arrayList.add(u(tdy0Var2));
        }
        return (tdy0) o7h.V0(o7h.j0(arrayList));
    }

    @Override // p.aqi0, p.zpi0
    public final jfg g(ajn0 ajn0Var, int i) {
        return null;
    }

    @Override // p.yqb0
    public final Set i(wgt wgtVar, iu30 iu30Var) {
        Set setO1 = o7h.o1(((u9r) this.e.invoke()).a());
        brb0 brb0VarZ = xto1.z(this.o);
        Set setB = brb0VarZ != null ? brb0VarZ.b() : null;
        if (setB == null) {
            setB = w7x.a;
        }
        setO1.addAll(setB);
        if (this.n.a.isEnum()) {
            setO1.addAll(p7h.M(new ajn0[]{sfb1.c, sfb1.a}));
        }
        Object obj = this.b.b;
        setO1.addAll(new ArrayList());
        return setO1;
    }

    @Override // p.yqb0
    public final void j(ArrayList arrayList, ajn0 ajn0Var) {
        Object obj = this.b.b;
    }

    @Override // p.yqb0
    public final u9r k() {
        return new aeg(this.n, aht.d1);
    }

    @Override // p.yqb0
    public final void l(LinkedHashSet linkedHashSet, ajn0 ajn0Var) {
        hqb0 hqb0Var = this.o;
        brb0 brb0VarZ = xto1.z(hqb0Var);
        linkedHashSet.addAll(rc2.F(ajn0Var, (Collection) (brb0VarZ == null ? w7x.a : o7h.p1(brb0VarZ.c(ajn0Var, 15))), linkedHashSet, hqb0Var, ((cao0) ((bao0) ((uw0) this.b.b).b)).d));
        if (this.n.a.isEnum()) {
            if (ajn0Var.equals(sfb1.c)) {
                linkedHashSet.add(sj1.l(hqb0Var));
            } else if (ajn0Var.equals(sfb1.a)) {
                linkedHashSet.add(sj1.m(hqb0Var));
            }
        }
    }

    @Override // p.yqb0
    public final void m(ArrayList arrayList, ajn0 ajn0Var) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        gqb0 gqb0Var = new gqb0(ajn0Var, (byte) 1);
        hqb0 hqb0Var = this.o;
        syo1.m(Collections.singletonList(hqb0Var), yi20.i, new arb0(hqb0Var, linkedHashSet, gqb0Var));
        boolean zIsEmpty = arrayList.isEmpty();
        o860 o860Var = this.b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                tdy0 tdy0VarU = u((tdy0) obj);
                Object arrayList2 = linkedHashMap.get(tdy0VarU);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(tdy0VarU, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                r7h.W(rc2.F(ajn0Var, (Collection) ((Map.Entry) it.next()).getValue(), arrayList, hqb0Var, ((cao0) ((bao0) ((uw0) o860Var.b).b)).d), arrayList3);
            }
            arrayList.addAll(arrayList3);
        } else {
            arrayList.addAll(rc2.F(ajn0Var, linkedHashSet, arrayList, hqb0Var, ((cao0) ((bao0) ((uw0) o860Var.b).b)).d));
        }
        if (this.n.a.isEnum() && ajn0Var.equals(sfb1.b)) {
            h4p1.d(arrayList, sj1.k(hqb0Var));
        }
    }

    @Override // p.yqb0
    public final Set n() {
        Set setO1 = o7h.o1(((u9r) this.e.invoke()).e());
        aht ahtVar = aht.e1;
        hqb0 hqb0Var = this.o;
        syo1.m(Collections.singletonList(hqb0Var), yi20.i, new arb0(hqb0Var, setO1, ahtVar));
        if (this.n.a.isEnum()) {
            setO1.add(sfb1.b);
        }
        return setO1;
    }

    @Override // p.yqb0
    public final n9r p() {
        return this.o;
    }
}
