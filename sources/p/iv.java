package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iv implements Function {
    public final /* synthetic */ jv a;

    public iv(jv jvVar) {
        this.a = jvVar;
    }

    public final Object apply(Object obj) {
        Consumer consumer = (Consumer) obj;
        fv fvVar = new fv();
        jv jvVar = this.a;
        zq zqVar = jvVar.c;
        consumer.getClass();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(wq.class, new yq(zqVar, (byte) 0));
        subtypeEffectHandlerBuilderC.g(xq.class, new yq(zqVar, (byte) 1));
        subtypeEffectHandlerBuilderC.c(vq.class, new dn(consumer, (byte) 1));
        return l1d.g(Mobius.d(fvVar, RxConnectables.a(subtypeEffectHandlerBuilderC.h()))).d(new gv(jvVar)).b(new hv(jvVar));
    }
}
