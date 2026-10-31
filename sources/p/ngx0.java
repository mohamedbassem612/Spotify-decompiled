package p;

import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ngx0 implements lgx0 {
    public final yix0 a;
    public final n6r0 b;

    public ngx0(yix0 yix0Var, n6r0 n6r0Var) {
        this.a = yix0Var;
        this.b = n6r0Var;
    }

    public final Connection L(Consumer consumer) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(jgx0.class, new o4e0(this, (byte) 24));
        return RxConnectables.a(subtypeEffectHandlerBuilderC.h()).L(consumer);
    }
}
