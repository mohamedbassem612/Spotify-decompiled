package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n5z implements v6r0 {
    public final nt8 a;

    public n5z(nt8 nt8Var) {
        this.a = nt8Var;
    }

    @Override // p.v6r0
    public final MobiusLoop.Controller a(Object obj) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        nt8 nt8Var = this.a;
        subtypeEffectHandlerBuilderC.g(z4z.class, new b5z(nt8Var, (byte) 1));
        subtypeEffectHandlerBuilderC.g(y4z.class, new b5z(nt8Var, (byte) 0));
        return MobiusAndroid.b(Mobius.d(l5z.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h())), (ir61) obj, m5z.a);
    }
}
