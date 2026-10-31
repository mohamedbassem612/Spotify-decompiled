package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oqe implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ rqe a;

    public oqe(rqe rqeVar) {
        this.a = rqeVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        fq2 fq2Var = this.a.a;
        synchronized (fq2Var.R) {
            fq2Var.W++;
        }
        this.a.a.J();
        return rih1.a;
    }
}
