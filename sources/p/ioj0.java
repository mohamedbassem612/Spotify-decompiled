package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ioj0 {
    public final cqs0 a;

    public ioj0(Map map) {
        this((cqs0) c0p1.g(map));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    public final ioj0 a(Map map, boolean z) {
        cqs0 cqs0VarG;
        if (map.isEmpty()) {
            return this;
        }
        bqs0 bqs0VarBuilder = this.a.builder();
        boolean z2 = false;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Map map2 = (Map) entry.getValue();
            cqs0 cqs0Var = (cqs0) bqs0VarBuilder.get(str);
            if (cqs0Var != null) {
                bqs0 bqs0VarBuilder2 = cqs0Var.builder();
                boolean z3 = false;
                for (Map.Entry entry2 : map2.entrySet()) {
                    Object key = entry2.getKey();
                    hoj0 hoj0Var = (hoj0) entry2.getValue();
                    hoj0 hoj0Var2 = (hoj0) bqs0VarBuilder2.get(key);
                    if (!z || hoj0Var2 == null || !(hoj0Var2 instanceof goj0) || !(hoj0Var instanceof foj0)) {
                        if (!u890.j(hoj0Var2, hoj0Var)) {
                            bqs0VarBuilder2.put(key, hoj0Var);
                            z3 = true;
                        }
                    }
                }
                cqs0VarG = z3 ? bqs0VarBuilder2.build() : cqs0Var;
                if (cqs0VarG == null) {
                    cqs0VarG = mqo1.G(map2);
                }
            } else {
                cqs0VarG = mqo1.G(map2);
            }
            if (cqs0VarG != cqs0Var) {
                bqs0VarBuilder.put(str, cqs0VarG);
                z2 = true;
            }
        }
        return z2 ? new ioj0(bqs0VarBuilder.build()) : this;
    }

    public final boolean b() {
        Collection collectionD = ((m7) this.a).d();
        if ((collectionD instanceof Collection) && collectionD.isEmpty()) {
            return false;
        }
        Iterator it = collectionD.iterator();
        while (it.hasNext()) {
            Collection collectionD2 = ((m7) ((cqs0) it.next())).d();
            if (!(collectionD2 instanceof Collection) || !collectionD2.isEmpty()) {
                Iterator it2 = collectionD2.iterator();
                while (it2.hasNext()) {
                    if (((hoj0) it2.next()) instanceof foj0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final hoj0 c(Class cls, String str) {
        cqs0 cqs0Var = (cqs0) this.a.get(str);
        if (cqs0Var == null) {
            return null;
        }
        Object obj = cqs0Var.get(cls);
        if (obj instanceof hoj0) {
            return (hoj0) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ioj0) {
            return u890.j(this.a, ((ioj0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MetadataValues(m=" + this.a + ")";
    }

    public /* synthetic */ ioj0() {
        this(b7x.a);
    }

    public ioj0(cqs0 cqs0Var) {
        this.a = cqs0Var;
    }
}
