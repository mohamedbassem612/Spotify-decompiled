package p;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z911 implements pua0 {
    public final pua0 a;
    public final vu30 b;
    public final Object c = new Object();
    public Set d = w7x.a;
    public boolean e;
    public final llm f;

    public z911(pua0 pua0Var, urm urmVar, q8n q8nVar, vu30 vu30Var) {
        this.a = pua0Var;
        this.b = vu30Var;
        llm llmVarH = us71.h(q8nVar);
        this.f = llmVarH;
        l4p1.u(llmVarH, new fu20(urmVar.a(), new p2z0(this, (lnm) null, (byte) 14), (byte) 1));
    }

    public final Map a(Set set) {
        Map mapA;
        synchronized (this.c) {
            this.d = set;
            mapA = this.a.a(set);
        }
        return mapA;
    }

    public final void b(Set set) {
        synchronized (this.c) {
            this.a.b(set);
        }
    }

    public final Object c(List list, onm onmVar) {
        Object objC = this.a.c(list, onmVar);
        return objC == d9n.a ? objC : rih1.a;
    }

    public final void dispose() {
        synchronized (this.c) {
            if (this.e) {
                return;
            }
            this.e = true;
            smo1.p(this.f, (CancellationException) null);
            this.a.dispose();
        }
    }
}
