package p;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class opa {
    public final fkp a;
    public final yqg b;
    public final f5k c;
    public final sga d;
    public final hpa e;
    public final llm f;
    public long g;
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public final ConcurrentHashMap i = new ConcurrentHashMap();
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public final ConcurrentHashMap k = new ConcurrentHashMap();
    public final ConcurrentHashMap l = new ConcurrentHashMap();

    public opa(q8n q8nVar, fkp fkpVar, yqg yqgVar, f5k f5kVar, sga sgaVar, hpa hpaVar) {
        this.a = fkpVar;
        this.b = yqgVar;
        this.c = f5kVar;
        this.d = sgaVar;
        this.e = hpaVar;
        this.f = smo1.e(ilo1.B(q8nVar, guo1.B()).y(new z8n("betamax-transcoder-scope")));
    }

    public final void a(long j) {
        long j2;
        String str = (String) this.k.remove(Long.valueOf(j));
        if (str == null) {
            str = "";
        }
        c8g1 c8g1Var = (c8g1) this.i.remove(Long.valueOf(j));
        ConcurrentHashMap concurrentHashMap = this.h;
        if (c8g1Var != null) {
            kgg1 kgg1Var = (kgg1) c8g1Var.b().get();
            if (kgg1Var != null) {
                kgg1Var.b();
            }
            faa0 faa0Var = (faa0) c8g1Var.a().get();
            if (faa0Var != null) {
                faa0Var.d((CancellationException) null);
            }
            ppa ppaVar = (ppa) concurrentHashMap.get(Long.valueOf(j));
            if (ppaVar != null) {
                ppaVar.c(j, 5, str);
            }
            rgc rgcVar = (rgc) this.j.remove(Long.valueOf(j));
            if (rgcVar == null) {
                rgcVar = new rgc();
            }
            j2 = j;
            this.e.a(j2, rgcVar.b().get(), rgcVar.a().get());
            concurrentHashMap.remove(Long.valueOf(j2));
        } else {
            j2 = j;
        }
        faa0 faa0Var2 = (faa0) this.l.remove(Long.valueOf(j2));
        if (faa0Var2 != null) {
            faa0Var2.d((CancellationException) null);
            ppa ppaVar2 = (ppa) concurrentHashMap.get(Long.valueOf(j2));
            if (ppaVar2 != null) {
                ppaVar2.c(j2, 5, str);
            }
        }
    }
}
