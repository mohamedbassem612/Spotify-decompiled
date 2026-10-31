package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rg21 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ smt0 a;
    public final /* synthetic */ xg21 b;

    public rg21(smt0 smt0Var, xg21 xg21Var) {
        this.a = smt0Var;
        this.b = xg21Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        jg21 jg21Var = (jg21) obj;
        this.a.invoke();
        xg21 xg21Var = this.b;
        kt91 kt91Var = xg21Var.c;
        String string = xg21Var.f.getString(2131961204, jg21Var.b);
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        kt91Var.o(new er91((fs91) null, string, (Integer) null, (String) null, 2131961202, new wa21(xg21Var, jg21Var, (byte) 1), (cvr) null, (xq91) null, false));
        return rih1.a;
    }
}
