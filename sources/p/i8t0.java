package p;

import android.app.Activity;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i8t0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ j8t0 a;

    public i8t0(j8t0 j8t0Var) {
        this.a = j8t0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        tzr0 tzr0Var = this.a.a;
        ffe1 ffe1Var = (ffe1) tzr0Var.d;
        i8h1 i8h1Var = (i8h1) ((xrp) ffe1Var.c).get();
        x6h1 x6h1VarC = ((ell0) ffe1Var.b).a.c();
        x6h1VarC.i.add(new a7h1("benefit_list_card", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        tv80 tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("no_action", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
        huj.b((lzn0) tzr0Var.e, (Activity) tzr0Var.b, (ryf) tzr0Var.c, oxf.b, ((x7t0) obj).a, tv80VarM);
        return rih1.a;
    }
}
