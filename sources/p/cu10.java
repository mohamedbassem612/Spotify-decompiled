package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cu10 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mu10 a;
    public final /* synthetic */ Consumer b;

    public cu10(mu10 mu10Var, Consumer consumer) {
        this.a = mu10Var;
        this.b = consumer;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new nx(obj, (lnm) null, this.a, this.b, (byte) 8)).collect(new cg00(r261Var, (byte) 5), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
