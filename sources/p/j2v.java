package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j2v implements Connectable {
    public final /* synthetic */ Connectable a;

    public j2v(xpp0 xpp0Var, ayl aylVar) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.c(tuu.class, new xu(aylVar, (byte) 25));
        subtypeEffectHandlerBuilderC.c(vuu.class, new i2v(aylVar, (byte) 0));
        subtypeEffectHandlerBuilderC.g(uuu.class, new ax8(xpp0Var, (byte) 1));
        this.a = RxConnectables.a(subtypeEffectHandlerBuilderC.h());
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
