package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kcb implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ Consumer a;
    public final /* synthetic */ scb b;

    public kcb(Consumer consumer, scb scbVar) {
        this.a = consumer;
        this.b = scbVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ibb ibbVar = (ibb) obj;
        String str = ibbVar.a;
        String str2 = ibbVar.b;
        this.a.accept(this.b.b.v() ? new ueb(new w2f0(str, str2), bk8.O0, false) : new ueb(new z2f0(str, str2), bk8.a, false));
        return rih1.a;
    }
}
