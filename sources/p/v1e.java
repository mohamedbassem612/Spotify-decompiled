package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v1e implements Function {
    public final /* synthetic */ w1e a;

    public v1e(w1e w1eVar) {
        this.a = w1eVar;
    }

    public final Object apply(Object obj) {
        Consumer consumer = (Consumer) obj;
        s1e s1eVar = new s1e();
        w1e w1eVar = this.a;
        oxd oxdVar = w1eVar.c;
        consumer.getClass();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.c(lxd.class, new dn(consumer, (byte) 6));
        subtypeEffectHandlerBuilderC.c(cxd.class, new dn(consumer, (byte) 7));
        subtypeEffectHandlerBuilderC.c(mxd.class, new dn(consumer, (byte) 8));
        subtypeEffectHandlerBuilderC.c(kxd.class, new dn(consumer, (byte) 9));
        subtypeEffectHandlerBuilderC.c(gxd.class, new nxd(oxdVar, (byte) 2));
        subtypeEffectHandlerBuilderC.c(hxd.class, new nxd(oxdVar, (byte) 3));
        subtypeEffectHandlerBuilderC.c(ixd.class, new nxd(oxdVar, (byte) 4));
        subtypeEffectHandlerBuilderC.c(jxd.class, new nxd(oxdVar, (byte) 5));
        subtypeEffectHandlerBuilderC.c(dxd.class, new nxd(oxdVar, (byte) 6));
        subtypeEffectHandlerBuilderC.c(exd.class, new nxd(oxdVar, (byte) 0));
        subtypeEffectHandlerBuilderC.c(fxd.class, new nxd(oxdVar, (byte) 1));
        return l1d.g(Mobius.d(s1eVar, RxConnectables.a(subtypeEffectHandlerBuilderC.h()))).d(new t1e(w1eVar)).b(new u1e(w1eVar));
    }
}
