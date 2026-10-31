package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class l3b1 implements Function {
    public final /* synthetic */ m3b1 a;

    public l3b1(m3b1 m3b1Var) {
        this.a = m3b1Var;
    }

    public final Object apply(Object obj) {
        Consumer consumer = (Consumer) obj;
        i3b1 i3b1Var = new i3b1();
        m3b1 m3b1Var = this.a;
        kmw kmwVar = m3b1Var.b;
        consumer.getClass();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(kbw.class, new hmw(kmwVar, (byte) 0));
        subtypeEffectHandlerBuilderC.g(yaw.class, new hmw(kmwVar, (byte) 1));
        subtypeEffectHandlerBuilderC.g(rfw.class, new hmw(kmwVar, (byte) 2));
        subtypeEffectHandlerBuilderC.c(dcw.class, new gmw(kmwVar, (byte) 4));
        subtypeEffectHandlerBuilderC.c(ccw.class, new gmw(kmwVar, (byte) 5));
        subtypeEffectHandlerBuilderC.c(tbw.class, new gmw(kmwVar, (byte) 6));
        subtypeEffectHandlerBuilderC.c(xbw.class, new gmw(kmwVar, (byte) 7));
        subtypeEffectHandlerBuilderC.c(vbw.class, new gmw(kmwVar, (byte) 8));
        subtypeEffectHandlerBuilderC.c(icw.class, new gmw(kmwVar, (byte) 9));
        subtypeEffectHandlerBuilderC.c(ubw.class, new gmw(kmwVar, (byte) 0));
        subtypeEffectHandlerBuilderC.c(zbw.class, new gmw(kmwVar, (byte) 1));
        subtypeEffectHandlerBuilderC.c(bcw.class, new gmw(kmwVar, (byte) 2));
        subtypeEffectHandlerBuilderC.c(ncw.class, new gmw(kmwVar, (byte) 3));
        subtypeEffectHandlerBuilderC.c(diw.class, new dn(consumer, (byte) 21));
        return l1d.g(Mobius.d(i3b1Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()))).d(new j3b1(m3b1Var)).b(new k3b1(m3b1Var));
    }
}
