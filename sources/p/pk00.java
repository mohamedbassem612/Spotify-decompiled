package p;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pk00 implements hs80 {
    public final vz20 a;
    public final boolean b;
    public final idd1 c;
    public final idd1 d;
    public final LinkedHashMap e = new LinkedHashMap();
    public final AtomicReference f = new AtomicReference(null);
    public final llm g;

    public pk00(Function0 function0, qa2 qa2Var, vz20 vz20Var, q8n q8nVar, boolean z) {
        this.a = vz20Var;
        this.b = z;
        this.c = new idd1(new ivw(function0, (byte) 28));
        this.d = new idd1(new pdy(qa2Var, (byte) 23));
        this.g = smo1.e(q8nVar);
    }

    public final abu0 a() {
        abu0 abu0Var;
        boolean z = this.b;
        idd1 idd1Var = this.d;
        if (z) {
            return (abu0) idd1Var.getValue();
        }
        ttm0 ttm0Var = (ttm0) this.c.getValue();
        if (ttm0Var == null || (abu0Var = (abu0) idd1Var.getValue()) == null) {
            return null;
        }
        return new nk00(this, ttm0Var, abu0Var);
    }

    @Override // p.hs80
    public final void dispose() {
        smo1.q(this.g);
        this.e.clear();
    }

    @Override // p.hs80
    public final void start() {
        ttm0 ttm0Var = (ttm0) this.c.getValue();
        if (ttm0Var == null || this.b) {
            return;
        }
        c921.y(this.g, (o8n) null, 0, new ymu(this, ttm0Var, (lnm) null, (byte) 28), 3);
    }
}
