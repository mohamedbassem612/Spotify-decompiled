package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class en70 implements war0 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final /* synthetic */ war0 b;

    public en70(war0 war0Var) {
        this.b = war0Var;
    }

    @Override // p.war0
    public final dbr0 a() {
        return (bn70) this.b.a();
    }

    @Override // p.war0
    public final void c(rjp0 rjp0Var) {
        rjp0 rjp0Var2 = (rjp0) this.a.remove(rjp0Var);
        if (rjp0Var2 != null) {
            this.b.c(rjp0Var2);
        }
    }

    @Override // p.war0
    public final void d(rjp0 rjp0Var) {
        dn70 dn70Var = new dn70(new l811(), this, new p811(), rjp0Var);
        this.a.put(rjp0Var, dn70Var);
        this.b.d(dn70Var);
    }
}
