package p;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class is41 implements cmh1 {
    public final cmh1 a;
    public final iu30 b;
    public final g931 c;
    public final long d;
    public final c9n e;

    public is41(cmh1 cmh1Var, iu30 iu30Var, g931 g931Var, long j, c9n c9nVar) {
        this.a = cmh1Var;
        this.b = iu30Var;
        this.c = g931Var;
        this.d = j;
        this.e = c9nVar;
    }

    public final Map a(Set set) {
        Map mapA = this.a.a(set);
        synchronized (this.c) {
            try {
                boolean zIsEmpty = dm61.v0(dm61.v0(set, (Set) this.c.b), (LinkedHashSet) this.c.c).isEmpty();
                this.c.b = set;
                for (Map.Entry entry : mapA.entrySet()) {
                    jh5 jh5Var = (jh5) entry.getKey();
                    if (!(((k3r) entry.getValue()) instanceof i3r)) {
                        ((LinkedHashSet) this.c.c).add(jh5Var);
                    }
                }
                ((LinkedHashSet) this.c.c).retainAll(set);
                boolean zIsEmpty2 = dm61.v0(set, (LinkedHashSet) this.c.c).isEmpty();
                xab1 xab1Var = (xab1) this.c.d;
                if (zIsEmpty2) {
                    if (xab1Var != null) {
                        xab1Var.d((CancellationException) null);
                    }
                    this.c.d = null;
                } else if (xab1Var == null || !zIsEmpty) {
                    if (xab1Var != null) {
                        xab1Var.d((CancellationException) null);
                    }
                    this.c.d = fn31.T(this.e, (o8n) null, 0, new ic01(this, (lnm) null, (byte) 28), 3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mapA;
    }

    public final void b(Set set) {
        this.a.b(set);
    }

    public final Object c(List list, onm onmVar) {
        Object objC = this.a.c(list, onmVar);
        return objC == d9n.a ? objC : rih1.a;
    }

    public final void dispose() {
        synchronized (this.c) {
            try {
                xab1 xab1Var = (xab1) this.c.d;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                this.c.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.dispose();
    }
}
