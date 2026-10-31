package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class msa0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mta0 a;

    public msa0(mta0 mta0Var) {
        this.a = mta0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        gsa0 gsa0Var = (gsa0) obj;
        fq2 fq2Var = this.a.b;
        String str = gsa0Var.a;
        rq2 rq2Var = gsa0Var.b;
        fq2 fq2Var2 = fq2Var;
        Object objZ = fq2Var2.z(str, new gp21(128, gsa0Var.c, gsa0Var.f, gsa0Var.g, gsa0Var.h, null, rq2Var, gsa0Var.e, gsa0Var.d, gsa0Var.i), onmVar);
        return objZ == d9n.a ? objZ : rih1.a;
    }
}
