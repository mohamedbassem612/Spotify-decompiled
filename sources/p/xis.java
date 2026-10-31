package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xis implements Connectable {
    public final ajx0 a;
    public final n6r0 b;

    public xis(ajx0 ajx0Var, n6r0 n6r0Var) {
        this.a = ajx0Var;
        this.b = n6r0Var;
    }

    public final Connection L(Consumer consumer) {
        fjx0 fjx0VarM1106a = this.a.m1106a(this.b);
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(jgx0.class, new bk1(fjx0VarM1106a, (byte) 12));
        return RxConnectables.a(subtypeEffectHandlerBuilderC.h()).L(consumer);
    }
}
