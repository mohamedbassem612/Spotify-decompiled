package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m9g implements Function {
    public final /* synthetic */ n9g a;

    public m9g(n9g n9gVar) {
        this.a = n9gVar;
    }

    public final Object apply(Object obj) {
        Consumer consumer = (Consumer) obj;
        j9g j9gVar = new j9g();
        n9g n9gVar = this.a;
        s6g s6gVar = n9gVar.a;
        consumer.getClass();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(e6g.class, new r6g(s6gVar, (byte) 0));
        subtypeEffectHandlerBuilderC.g(f6g.class, new r6g(s6gVar, (byte) 1));
        subtypeEffectHandlerBuilderC.g(d6g.class, new r6g(s6gVar, (byte) 2));
        subtypeEffectHandlerBuilderC.g(o6g.class, new r6g(s6gVar, (byte) 3));
        subtypeEffectHandlerBuilderC.c(m6g.class, new q6g(s6gVar, (byte) 3));
        subtypeEffectHandlerBuilderC.c(n6g.class, new q6g(s6gVar, (byte) 4));
        subtypeEffectHandlerBuilderC.c(h6g.class, new q6g(s6gVar, (byte) 5));
        subtypeEffectHandlerBuilderC.c(i6g.class, new q6g(s6gVar, (byte) 6));
        subtypeEffectHandlerBuilderC.c(l6g.class, new q6g(s6gVar, (byte) 7));
        subtypeEffectHandlerBuilderC.c(j6g.class, new q6g(s6gVar, (byte) 0));
        subtypeEffectHandlerBuilderC.c(k6g.class, new q6g(s6gVar, (byte) 1));
        subtypeEffectHandlerBuilderC.c(g6g.class, new q6g(s6gVar, (byte) 2));
        subtypeEffectHandlerBuilderC.c(c6g.class, new dn(consumer, (byte) 10));
        return l1d.g(Mobius.d(j9gVar, RxConnectables.a(subtypeEffectHandlerBuilderC.h()))).d(new k9g(n9gVar)).b(new l9g(n9gVar));
    }
}
