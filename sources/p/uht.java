package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uht extends fit {
    public final g8b0 g;
    public final toe0 h;
    public final toe0 i;
    public final /* synthetic */ wht j;

    public uht(wht whtVar, g8b0 g8b0Var) {
        this.j = whtVar;
        byp bypVar = whtVar.Y;
        hfy0 hfy0Var = whtVar.e;
        List list = hfy0Var.Q0;
        List list2 = hfy0Var.R0;
        List list3 = hfy0Var.S0;
        List list4 = hfy0Var.X;
        zjn0 zjn0Var = (zjn0) bypVar.c;
        ks6 ks6Var = (ks6) bypVar.b;
        ArrayList arrayList = new ArrayList(q7h.U(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(dem1.y(zjn0Var, ((Number) it.next()).intValue()));
        }
        super(bypVar, list, list2, list3, new rht(arrayList, (byte) 0));
        this.g = g8b0Var;
        s1c1 s1c1Var = (s1c1) ks6Var.a;
        sht shtVar = new sht(this, (byte) 0);
        voe0 voe0Var = (voe0) s1c1Var;
        voe0Var.getClass();
        this.h = new toe0(voe0Var, shtVar);
        s1c1 s1c1Var2 = (s1c1) ks6Var.a;
        sht shtVar2 = new sht(this, (byte) 1);
        voe0 voe0Var2 = (voe0) s1c1Var2;
        voe0Var2.getClass();
        this.i = new toe0(voe0Var2, shtVar2);
    }

    @Override // p.fit, p.aqi0, p.zpi0
    public final Collection a(ajn0 ajn0Var, int i) {
        Object obj = this.b.b;
        return super.a(ajn0Var, i);
    }

    @Override // p.fit, p.aqi0, p.zpi0
    public final Collection c(ajn0 ajn0Var, int i) {
        Object obj = this.b.b;
        return super.c(ajn0Var, i);
    }

    @Override // p.aqi0, p.zpi0
    public final Collection d(wgt wgtVar, iu30 iu30Var) {
        return (Collection) this.h.invoke();
    }

    @Override // p.fit, p.aqi0, p.zpi0
    public final jfg g(ajn0 ajn0Var, int i) {
        beg begVar;
        Object obj = this.b.b;
        mxr mxrVar = this.j.P0;
        return (mxrVar == null || (begVar = (beg) ((ffr) mxrVar.b).invoke(ajn0Var)) == null) ? super.g(ajn0Var, i) : begVar;
    }

    @Override // p.fit
    public final void h(ArrayList arrayList) {
        ArrayList arrayList2;
        mxr mxrVar = this.j.P0;
        if (mxrVar != null) {
            Set setKeySet = ((LinkedHashMap) mxrVar.a).keySet();
            arrayList2 = new ArrayList();
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                beg begVar = (beg) ((ffr) mxrVar.b).invoke((ajn0) it.next());
                if (begVar != null) {
                    arrayList2.add(begVar);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 == null) {
            arrayList2 = z6x.a;
        }
        arrayList.addAll(arrayList2);
    }

    @Override // p.fit
    public final void j(ArrayList arrayList, ajn0 ajn0Var) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((a8b0) it.next()).E().c(ajn0Var, 12));
        }
        byp bypVar = this.b;
        arrayList.addAll(((yz1) ((ks6) bypVar.b).Z).b(ajn0Var, this.j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((cao0) ((bao0) ((ks6) bypVar.b).P0)).d.h(ajn0Var, arrayList2, arrayList3, this.j, new tht(arrayList, (byte) 0));
    }

    @Override // p.fit
    public final void k(ArrayList arrayList, ajn0 ajn0Var) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((a8b0) it.next()).E().a(ajn0Var, 12));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((cao0) ((bao0) ((ks6) this.b.b).P0)).d.h(ajn0Var, arrayList2, arrayList3, this.j, new tht(arrayList, (byte) 0));
    }

    @Override // p.fit
    public final heg l(ajn0 ajn0Var) {
        return this.j.h.d(ajn0Var);
    }

    @Override // p.fit
    public final Set n() {
        List listD = this.j.N0.d();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            Set setE = ((a8b0) it.next()).E().e();
            if (setE == null) {
                return null;
            }
            r7h.W(setE, linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // p.fit
    public final Set o() {
        wht whtVar = this.j;
        List listD = whtVar.N0.d();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            r7h.W(((a8b0) it.next()).E().b(), linkedHashSet);
        }
        linkedHashSet.addAll(((yz1) ((ks6) this.b.b).Z).e(whtVar));
        return linkedHashSet;
    }

    @Override // p.fit
    public final Set p() {
        List listD = this.j.N0.d();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            r7h.W(((a8b0) it.next()).E().f(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // p.fit
    public final boolean r(iit iitVar) {
        return ((qct0) ((ks6) this.b.b).N0).f(this.j, iitVar);
    }
}
