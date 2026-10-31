package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x9f extends hab0 implements vu30 {
    public final /* synthetic */ y9f a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9f(y9f y9fVar) {
        super(2);
        this.a = y9fVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        p9f p9fVar = this.a.c;
        he11 he11Var = p9fVar.b;
        q8n q8nVar = p9fVar.d;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(d9f.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new e9f(he11Var)));
        return Mobius.d(o9f.a, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI)).c(p9fVar.a, new EventSource[]{p9fVar.c});
    }
}
