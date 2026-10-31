package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zcu implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cdu a;

    public zcu(cdu cduVar) {
        this.a = cduVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objEmit = this.a.d.emit(new pcu(((qcu) obj).a), onmVar);
        return objEmit == d9n.a ? objEmit : rih1.a;
    }
}
