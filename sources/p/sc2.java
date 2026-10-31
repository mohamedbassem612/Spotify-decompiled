package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sc2 implements Connectable {
    public final /* synthetic */ Connectable a;

    public sc2(qns0 qns0Var) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(qc2.class, new bk1(qns0Var, (byte) 3));
        this.a = RxConnectables.a(subtypeEffectHandlerBuilderC.h());
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
