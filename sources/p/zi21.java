package p;

import com.spotify.mobius.Mobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zi21 extends hab0 implements iu30 {
    public final /* synthetic */ bj21 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi21(bj21 bj21Var) {
        super(1);
        this.a = bj21Var;
    }

    public final Object invoke(Object obj) {
        cir0 cir0Var = (cir0) obj;
        jnq jnqVar = (jnq) this.a.c.a.a.c;
        q8n q8nVar = (q8n) ((dj21) jnqVar.c).b.get();
        c8o.l(q8nVar);
        dj21 dj21Var = (dj21) jnqVar.c;
        kt91 kt91Var = (kt91) dj21Var.c.get();
        c8o.l(kt91Var);
        a9m a9mVar = (a9m) dj21Var.e.get();
        c8o.l(a9mVar);
        return Mobius.d(ti21.a, new ei21(q8nVar, kt91Var, a9mVar, (fj21) jnqVar.d, (koq) ((jly0) jnqVar.a).get(), cir0Var));
    }
}
