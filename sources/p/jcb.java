package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jcb implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ Consumer a;
    public final /* synthetic */ scb b;

    public jcb(Consumer consumer, scb scbVar) {
        this.a = consumer;
        this.b = scbVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        String str = ((hbb) obj).a;
        this.a.accept(this.b.b.e() ? new ueb(new v2f0(str), bk8.O0, false) : new veb(str));
        return rih1.a;
    }
}
