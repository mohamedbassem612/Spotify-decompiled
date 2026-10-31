package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sg21 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ smt0 a;
    public final /* synthetic */ xg21 b;

    public sg21(smt0 smt0Var, xg21 xg21Var) {
        this.a = smt0Var;
        this.b = xg21Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        this.a.invoke();
        xg21 xg21Var = this.b;
        kt91 kt91Var = xg21Var.c;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961203});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961203});
        kt91Var.o(new er91((fs91) null, "", 2131961203, (String) null, 2131961205, new wa21(xg21Var, (ig21) obj, (byte) 2), (cvr) null, (xq91) null, false));
        return rih1.a;
    }
}
