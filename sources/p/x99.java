package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x99 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ z99 a;

    public x99(z99 z99Var) {
        this.a = z99Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        f99 f99Var = (f99) obj;
        ajq0 ajq0Var = this.a.a;
        ptf1 ptf1Var = (ptf1) ajq0Var.c;
        s2c1 s2c1Var = f99Var.a;
        int i = f99Var.b;
        boolean z = f99Var.c;
        String str = f99Var.d;
        ajq0.w(ajq0Var, str, ptf1Var.n(s2c1Var, i, z, str));
        return rih1.a;
    }
}
