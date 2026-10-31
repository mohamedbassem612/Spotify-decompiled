package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qop {
    public final tzo a;
    public final c8c0 b;
    public final n6r0 c;
    public final dma1 d;
    public final String e;

    public qop(tzo tzoVar, String str, c8c0 c8c0Var, n6r0 n6r0Var, dma1 dma1Var) {
        this.a = tzoVar;
        this.b = c8c0Var;
        this.c = n6r0Var;
        this.d = dma1Var;
        this.e = str;
    }

    public final Intent a() {
        Intent intent = ((fzc0) ((uap) this.a.b).J).a;
        c8o.m(intent);
        return intent;
    }

    public final bpb1 b() {
        return ((tf90) ((uap) this.a.b).f0.get()).a;
    }

    public final iac0 c() {
        iac0 iac0Var = ((q7r0) ((uap) this.a.b).H).d.c;
        c8o.m(iac0Var);
        return iac0Var;
    }

    public final String d() {
        return ((uap) this.a.b).h();
    }

    public final muz e() {
        return ((cyp) ((uap) this.a.b).u.get()).d();
    }

    public final g431 f() {
        g431 g431Var = ((h431) ((uap) this.a.b).i0.get()).a;
        if (g431Var != null) {
            return g431Var;
        }
        hhg1.n("Trying to access Result Registry too early. Its only available at plugin creation point and onwards and can be injected using javax.inject.Provider<ResultRegistry>");
        return null;
    }

    public final lik1 g() {
        return ((bve0) ((uap) this.a.b).t.get()).getViewUri();
    }
}
