package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ptg1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ utg1 a;

    public ptg1(utg1 utg1Var) {
        this.a = utg1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        utg1 utg1Var = this.a;
        ffe1 ffe1Var = utg1Var.d;
        i8h1 i8h1Var = (i8h1) ffe1Var.b;
        x6h1 x6h1VarC = ffe1Var.e().b.c();
        x6h1VarC.i.add(new a7h1("learn_more_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        utg1Var.e.a("spotify:internal:on-demand-trial:plan-overview", i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:on-demand-trial:plan-overview")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
        return rih1.a;
    }
}
