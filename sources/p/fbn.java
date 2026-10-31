package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fbn extends hab0 implements iu30 {
    public final /* synthetic */ gbn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbn(gbn gbnVar) {
        super(1);
        this.a = gbnVar;
    }

    public final Object invoke(Object obj) {
        dbn dbnVar = this.a.b;
        cbn cbnVar = new cbn();
        xan xanVar = dbnVar.a;
        Consumer consumer = dbnVar.b;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.d(wan.class, new dn(consumer, (byte) 19), xanVar.a);
        return Mobius.d(cbnVar, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
    }
}
