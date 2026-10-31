package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class fit extends aqi0 {
    public static final /* synthetic */ mma0[] f = {new cey0(fit.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0), new cey0(fit.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0)};
    public final byp b;
    public final eit c;
    public final toe0 d;
    public final soe0 e;

    public fit(byp bypVar, List list, List list2, List list3, Function0 function0) {
        this.b = bypVar;
        ks6 ks6Var = (ks6) bypVar.b;
        ((u321) ks6Var.c).getClass();
        this.c = new eit(this, list, list2, list3);
        s1c1 s1c1Var = (s1c1) ks6Var.a;
        bit bitVar = new bit(function0, (byte) 0);
        voe0 voe0Var = (voe0) s1c1Var;
        voe0Var.getClass();
        this.d = new toe0(voe0Var, bitVar);
        ka kaVar = new ka(this, (byte) 27);
        voe0 voe0Var2 = (voe0) s1c1Var;
        voe0Var2.getClass();
        this.e = new soe0(voe0Var2, kaVar);
    }

    @Override // p.aqi0, p.zpi0
    public Collection a(ajn0 ajn0Var, int i) {
        eit eitVar = this.c;
        toe0 toe0Var = eitVar.h;
        mma0 mma0Var = eit.j[1];
        return !((Set) toe0Var.invoke()).contains(ajn0Var) ? z6x.a : (Collection) eitVar.e.invoke(ajn0Var);
    }

    @Override // p.aqi0, p.zpi0
    public final Set b() {
        toe0 toe0Var = this.c.g;
        mma0 mma0Var = eit.j[0];
        return (Set) toe0Var.invoke();
    }

    @Override // p.aqi0, p.zpi0
    public Collection c(ajn0 ajn0Var, int i) {
        eit eitVar = this.c;
        toe0 toe0Var = eitVar.g;
        mma0 mma0Var = eit.j[0];
        return !((Set) toe0Var.invoke()).contains(ajn0Var) ? z6x.a : (Collection) eitVar.d.invoke(ajn0Var);
    }

    @Override // p.aqi0, p.zpi0
    public final Set e() {
        mma0 mma0Var = f[1];
        return (Set) this.e.invoke();
    }

    @Override // p.aqi0, p.zpi0
    public final Set f() {
        toe0 toe0Var = this.c.h;
        mma0 mma0Var = eit.j[1];
        return (Set) toe0Var.invoke();
    }

    @Override // p.aqi0, p.zpi0
    public jfg g(ajn0 ajn0Var, int i) {
        if (q(ajn0Var)) {
            return ((ks6) this.b.b).a(l(ajn0Var));
        }
        eit eitVar = this.c;
        if (eitVar.c.keySet().contains(ajn0Var)) {
            return (jit) eitVar.f.invoke(ajn0Var);
        }
        return null;
    }

    public final Collection i(wgt wgtVar, iu30 iu30Var) {
        ArrayList arrayList = new ArrayList(0);
        if (wgtVar.a(wgt.f)) {
            h(arrayList);
        }
        eit eitVar = this.c;
        eitVar.getClass();
        toe0 toe0Var = eitVar.g;
        toe0 toe0Var2 = eitVar.h;
        k0d k0dVar = k0d.X;
        boolean zA = wgtVar.a(wgt.j);
        Collection collection = z6x.a;
        if (zA) {
            mma0 mma0Var = eit.j[1];
            Set<ajn0> set = (Set) toe0Var2.invoke();
            ArrayList arrayList2 = new ArrayList();
            for (ajn0 ajn0Var : set) {
                if (((Boolean) iu30Var.invoke(ajn0Var)).booleanValue()) {
                    mma0 mma0Var2 = eit.j[1];
                    arrayList2.addAll(!((Set) toe0Var2.invoke()).contains(ajn0Var) ? collection : (Collection) eitVar.e.invoke(ajn0Var));
                }
            }
            r7h.f0(arrayList2, k0dVar);
            arrayList.addAll(arrayList2);
        }
        if (wgtVar.a(wgt.i)) {
            mma0 mma0Var3 = eit.j[0];
            Set<ajn0> set2 = (Set) toe0Var.invoke();
            ArrayList arrayList3 = new ArrayList();
            for (ajn0 ajn0Var2 : set2) {
                if (((Boolean) iu30Var.invoke(ajn0Var2)).booleanValue()) {
                    mma0 mma0Var4 = eit.j[0];
                    arrayList3.addAll(!((Set) toe0Var.invoke()).contains(ajn0Var2) ? collection : (Collection) eitVar.d.invoke(ajn0Var2));
                }
            }
            r7h.f0(arrayList3, k0dVar);
            arrayList.addAll(arrayList3);
        }
        if (wgtVar.a(wgt.l)) {
            for (ajn0 ajn0Var3 : m()) {
                if (((Boolean) iu30Var.invoke(ajn0Var3)).booleanValue()) {
                    h4p1.d(arrayList, ((ks6) this.b.b).a(l(ajn0Var3)));
                }
            }
        }
        if (wgtVar.a(wgt.g)) {
            for (ajn0 ajn0Var4 : eitVar.c.keySet()) {
                if (((Boolean) iu30Var.invoke(ajn0Var4)).booleanValue()) {
                    h4p1.d(arrayList, (jit) eitVar.f.invoke(ajn0Var4));
                }
            }
        }
        return h4p1.h(arrayList);
    }

    public abstract heg l(ajn0 ajn0Var);

    public final Set m() {
        mma0 mma0Var = f[0];
        return (Set) this.d.invoke();
    }

    public Set n() {
        return w7x.a;
    }

    public Set o() {
        return w7x.a;
    }

    public Set p() {
        return w7x.a;
    }

    public boolean q(ajn0 ajn0Var) {
        return m().contains(ajn0Var);
    }

    public boolean r(iit iitVar) {
        return true;
    }

    public void h(ArrayList arrayList) {
    }

    public void j(ArrayList arrayList, ajn0 ajn0Var) {
    }

    public void k(ArrayList arrayList, ajn0 ajn0Var) {
    }
}
