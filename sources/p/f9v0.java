package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f9v0 implements Connectable {
    public final uu00 a;

    public f9v0(uu00 uu00Var) {
        this.a = uu00Var;
    }

    public final Connection L(Consumer consumer) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(d9v0.class, new o4e0(this, (byte) 18));
        return RxConnectables.a(subtypeEffectHandlerBuilderC.h()).L(consumer);
    }
}
