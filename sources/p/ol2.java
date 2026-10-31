package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ol2 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ wl2 a;

    public ol2(wl2 wl2Var) {
        this.a = wl2Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        kp5 kp5Var = this.a.a;
        cn2 cn2Var = (cn2) kp5Var.g;
        i8h1 i8h1VarA = cn2Var.a();
        x6h1 x6h1VarC = cn2Var.b.b.c();
        x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1VarA.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
        xk xkVar = (xk) kp5Var.a;
        xkVar.a();
        xkVar.a.c();
        return rih1.a;
    }
}
