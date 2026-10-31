package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class w99 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ z99 a;

    public w99(z99 z99Var) {
        this.a = z99Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        e99 e99Var = (e99) obj;
        ajq0 ajq0Var = this.a.a;
        ptf1 ptf1Var = (ptf1) ajq0Var.c;
        s2c1 s2c1Var = e99Var.a;
        int i = e99Var.b;
        boolean z = e99Var.c;
        String str = e99Var.d;
        ajq0.w(ajq0Var, str, ptf1Var.n(s2c1Var, i, z, str));
        return rih1.a;
    }
}
