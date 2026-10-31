package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u421 implements Connectable {
    public final /* synthetic */ Connectable a;

    public u421(byp0 byp0Var, xrc0 xrc0Var, q8n q8nVar, ayl aylVar) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.c(r421.class, new i2v(aylVar, (byte) 1));
        subtypeEffectHandlerBuilderC.g(q421.class, new zd1(q8nVar, byp0Var, xrc0Var, (byte) 18));
        this.a = RxConnectables.a(subtypeEffectHandlerBuilderC.h());
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
