package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nl2 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ wl2 a;

    public nl2(wl2 wl2Var) {
        this.a = wl2Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        kp5 kp5Var = this.a.a;
        xk xkVar = (xk) kp5Var.a;
        zk zkVar = zk.b;
        lik1 lik1VarF = xkVar.f(zkVar);
        cn2 cn2Var = (cn2) kp5Var.g;
        String str = lik1VarF.a;
        i8h1 i8h1VarA = cn2Var.a();
        x6h1 x6h1VarC = cn2Var.b.b.c();
        x6h1VarC.i.add(new a7h1("continue_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        xkVar.c(zkVar, i8h1VarA.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), mno1.g());
        return rih1.a;
    }
}
