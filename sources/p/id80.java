package p;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class id80 implements cmh1 {
    public final iu30 a;
    public final Object b = new Object();
    public final LinkedHashSet c = new LinkedHashSet();
    public final LinkedHashMap d = new LinkedHashMap();
    public volatile boolean e;
    public final cmh1 f;
    public final /* synthetic */ jd80 g;

    public id80(jd80 jd80Var, iu30 iu30Var) {
        this.g = jd80Var;
        this.a = iu30Var;
        this.f = jd80Var.a.c(new ux70(this, (byte) 7));
    }

    public final Map a(Set set) {
        b7x b7xVar;
        xkg0 xkg0VarB;
        Object obj = this.b;
        jd80 jd80Var = this.g;
        synchronized (obj) {
            try {
                if (this.e) {
                    throw new IllegalStateException("Subscription is disposed");
                }
                Set<jh5> setV0 = dm61.v0(set, this.c);
                Set setV1 = dm61.v0(this.c, set);
                LinkedHashSet linkedHashSet = this.c;
                linkedHashSet.clear();
                linkedHashSet.addAll(set);
                LinkedHashMap linkedHashMap = this.d;
                Iterator it = setV1.iterator();
                while (it.hasNext()) {
                    linkedHashMap.remove((jh5) it.next());
                }
                Map mapA = this.f.a(set);
                Set setV2 = dm61.v0(setV0, set);
                if (setV2.isEmpty()) {
                    b7xVar = b7x.a;
                } else {
                    xkg0 xkg0VarA = f3r.a(jd80Var.a, setV2);
                    b7x linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : xkg0VarA.entrySet()) {
                        if (((k3r) entry.getValue()) instanceof j3r) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    b7xVar = linkedHashMap2;
                }
                xkg0 xkg0Var = new xkg0();
                for (jh5 jh5Var : setV0) {
                    k3r j3rVar = (k3r) mapA.get(jh5Var);
                    if (j3rVar == null) {
                        j3rVar = (k3r) b7xVar.get(jh5Var);
                    }
                    if (!(j3rVar instanceof j3r)) {
                        Object obj2 = ((Map) this.g.b.b).get(jh5Var);
                        if (obj2 != null) {
                            j3rVar = new j3r(obj2);
                        } else if (j3rVar == null) {
                            j3rVar = i3r.a;
                        }
                    }
                    this.d.put(jh5Var, j3rVar);
                    xkg0Var.put(jh5Var, j3rVar);
                }
                xkg0VarB = xkg0Var.b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return xkg0VarB;
    }

    public final void b(Set set) {
        jd80 jd80Var = this.g;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jd80Var.b.a((jh5) it.next(), (Object) null);
        }
        synchronized (this.b) {
            LinkedHashMap linkedHashMap = this.d;
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                linkedHashMap.remove((jh5) it2.next());
            }
        }
        this.f.b(set);
    }

    public final Object c(List list, onm onmVar) {
        Object objC = this.f.c(list, onmVar);
        return objC == d9n.a ? objC : rih1.a;
    }

    public final void dispose() {
        synchronized (this.b) {
            if (this.e) {
                return;
            }
            this.e = true;
            this.f.dispose();
            this.g.c.remove(this);
        }
    }
}
