package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nrr0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qrr0 a;

    public nrr0(qrr0 qrr0Var) {
        this.a = qrr0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        qrr0 qrr0Var = this.a;
        String strF = f4i1.f("spotify:managed-account-linking:teen-education:", qrr0Var.c.a, "");
        qrr0Var.a.a(strF, qrr0Var.d.a(strF), mno1.h(new mmr0[]{new mmr0("date_of_birth", ((mdw) obj).a)}));
        return rih1.a;
    }
}
