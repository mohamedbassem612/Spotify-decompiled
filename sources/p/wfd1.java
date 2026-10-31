package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wfd1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dh30 a;

    public wfd1(dh30 dh30Var) {
        this.a = dh30Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        sfd1 sfd1Var = (sfd1) obj;
        j80 j80Var = sfd1Var.a;
        Object objI = this.a.I(new ldh(j80Var.a, j80Var.b, sfd1Var.b, sfd1Var.c, null), onmVar);
        return objI == d9n.a ? objI : rih1.a;
    }
}
