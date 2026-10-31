package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iv00 implements dv00 {
    public final uu00 a;
    public final boolean b;
    public final String c;
    public final xla1 d = new xla1(rc11.a.b(xv00.class));
    public final Object e = new Object();
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public final ConcurrentHashMap g = new ConcurrentHashMap();

    public iv00(uu00 uu00Var, boolean z, String str) {
        this.a = uu00Var;
        this.b = z;
        this.c = str;
    }

    @Override // p.dmh1
    public final void b(ses0 ses0Var) {
        int iC = ses0Var.c();
        for (int i = 0; i < iC; i++) {
            if (ses0Var.g(i)) {
                jh5 jh5VarH = ses0Var.h(i);
                jh5VarH.getClass();
                if (this.d.a().m(jh5VarH.a)) {
                    Object obj = null;
                    for (fv00 fv00Var : this.f) {
                        Object obj2 = fv00Var.k.get(jh5VarH);
                        Object obj3 = obj2 == null ? fv00Var.j.get(jh5VarH) : obj2;
                        if (obj3 != null) {
                            obj = obj3;
                        }
                    }
                    if (obj == null) {
                        obj = this.g.get(jh5VarH);
                    }
                    ses0Var.n(i, obj != null ? new j3r(obj) : h3r.b);
                }
            }
        }
    }

    @Override // p.dmh1
    public final cmh1 c(iu30 iu30Var) {
        fv00 fv00Var;
        synchronized (this.e) {
            fv00Var = new fv00(this.a, this.b, this.c, iu30Var, new sty(this, (byte) 21), new sty(this, (byte) 22), sqg0.U(this.g));
            this.f.add(fv00Var);
        }
        return fv00Var;
    }

    @Override // p.dmh1
    public final yla1 e() {
        return this.d;
    }

    public final void f(Map map) {
        ArrayList<mmr0> arrayList;
        synchronized (this.e) {
            this.g.putAll(map);
            CopyOnWriteArrayList<fv00> copyOnWriteArrayList = this.f;
            arrayList = new ArrayList(q7h.U(copyOnWriteArrayList, 10));
            for (fv00 fv00Var : copyOnWriteArrayList) {
                arrayList.add(oqn1.n(fv00Var, fv00Var.d(map)));
            }
        }
        for (mmr0 mmr0Var : arrayList) {
            fv00 fv00Var2 = (fv00) mmr0Var.a;
            List list = (List) mmr0Var.b;
            fv00Var2.getClass();
            if (!list.isEmpty()) {
                fv00Var2.d.invoke(list);
            }
        }
    }
}
