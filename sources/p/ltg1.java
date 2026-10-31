package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ltg1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ utg1 a;

    public ltg1(utg1 utg1Var) {
        this.a = utg1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ffe1 ffe1Var = this.a.d;
        i8h1 i8h1Var = (i8h1) ffe1Var.b;
        x6h1 x6h1VarC = ffe1Var.e().b.c();
        x6h1VarC.i.add(new a7h1("start_trial_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("trial_premium_features", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
        return rih1.a;
    }
}
