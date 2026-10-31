package p;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hli1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cmi1 a;

    public hli1(cmi1 cmi1Var) {
        this.a = cmi1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        jdu jduVar = (jdu) this.a.t;
        synchronized (jduVar) {
            MobiusLoop mobiusLoop = jduVar.f;
            if (mobiusLoop != null) {
                mobiusLoop.a(new gdu(true));
            }
        }
        return rih1.a;
    }
}
