package p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nzq implements lzq {
    public final List a;
    public final HashSet b;
    public final ien0 c = new ien0(j1r.a);
    public final /* synthetic */ List d;
    public final /* synthetic */ f1r e;
    public final /* synthetic */ rzq f;

    public nzq(List list, HashSet hashSet, f1r f1rVar, rzq rzqVar) {
        this.d = list;
        this.e = f1rVar;
        this.f = rzqVar;
        this.a = list;
        this.b = hashSet;
    }

    @Override // p.c0r
    public final ien0 a() {
        return this.c;
    }

    @Override // p.lzq
    public final void b() {
        this.c.c(this.e.a(this.f.j));
    }

    @Override // p.lzq
    public final Set c() {
        return this.b;
    }

    @Override // p.lzq
    public final List d() {
        return this.a;
    }

    @Override // p.c0r
    public final void dispose() {
        boolean z;
        rzq rzqVar = this.f;
        synchronized (rzqVar.e) {
            try {
                boolean z2 = false;
                for (jh5 jh5Var : this.b) {
                    rzqVar.q.o(oqn1.n(jh5Var, this));
                    t811 t811Var = rzqVar.j;
                    l811 l811Var = new l811();
                    t811Var.a.compute(jh5Var, new s811(jh5Var, l811Var));
                    if (l811Var.a && !jh5Var.a()) {
                        rzqVar.k.remove(jh5Var);
                        rzqVar.l.add(jh5Var);
                        qzq qzqVar = rzqVar.f77p;
                        qzqVar.remove(jh5Var);
                        qzqVar.put(jh5Var, Long.valueOf(System.nanoTime()));
                        z2 = true;
                    }
                }
                if (z2) {
                    rzqVar.v = true;
                    rzqVar.w++;
                }
                z = rzqVar.g == 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        ukj0 ukj0Var = this.f.a;
        if (ukj0Var != null) {
            List<e1r> list = this.d;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (e1r e1rVar : list) {
                arrayList.add(new ip21(e1rVar.a.a.toString(), e1rVar.a.b.toString(), eqq.v(e1rVar.b)));
            }
            ukj0Var.k(new z7r(arrayList));
        }
        if (z) {
            ukj0 ukj0Var2 = this.f.a;
            this.f.r();
        }
    }
}
