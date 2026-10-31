package p;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dpc1 implements zpi0 {
    public final zpi0 b;
    public final l1h1 c;
    public HashMap d;
    public final idd1 e = new idd1(new jqb0(this, (byte) 22));

    public dpc1(zpi0 zpi0Var, l1h1 l1h1Var) {
        this.b = zpi0Var;
        this.c = new l1h1(y2o1.K(l1h1Var.a));
    }

    @Override // p.zpi0
    public final Collection a(ajn0 ajn0Var, int i) {
        return h(this.b.a(ajn0Var, i));
    }

    @Override // p.zpi0
    public final Set b() {
        return this.b.b();
    }

    @Override // p.zpi0
    public final Collection c(ajn0 ajn0Var, int i) {
        return h(this.b.c(ajn0Var, i));
    }

    @Override // p.zpi0
    public final Collection d(wgt wgtVar, iu30 iu30Var) {
        return (Collection) this.e.getValue();
    }

    @Override // p.zpi0
    public final Set e() {
        return this.b.e();
    }

    @Override // p.zpi0
    public final Set f() {
        return this.b.f();
    }

    @Override // p.zpi0
    public final jfg g(ajn0 ajn0Var, int i) {
        jfg jfgVarG = this.b.g(ajn0Var, i);
        if (jfgVarG != null) {
            return (jfg) i(jfgVarG);
        }
        return null;
    }

    public final Collection h(Collection collection) {
        if (this.c.a.e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(i((n9r) it.next()));
        }
        return linkedHashSet;
    }

    public final n9r i(n9r n9rVar) {
        l1h1 l1h1Var = this.c;
        if (l1h1Var.a.e()) {
            return n9rVar;
        }
        HashMap map = this.d;
        if (map == null) {
            map = new HashMap();
            this.d = map;
        }
        Object objD = map.get(n9rVar);
        if (objD == null) {
            if (!(n9rVar instanceof apc1)) {
                hhg1.o(n9rVar, "Unknown descriptor in scope: ");
                return null;
            }
            objD = ((apc1) n9rVar).d(l1h1Var);
            if (objD == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + n9rVar + " substitution fails");
            }
            map.put(n9rVar, objD);
        }
        return (n9r) objD;
    }
}
