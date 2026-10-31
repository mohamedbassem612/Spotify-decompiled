package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ywf0 {
    public final wwf0 a;
    public final drm1 b;
    public final nxf0 c;

    public ywf0(wwf0 wwf0Var, drm1 drm1Var, nxf0 nxf0Var) {
        this.a = wwf0Var;
        this.b = drm1Var;
        this.c = nxf0Var;
    }

    public final MobiusLoop.Controller a(hxf0 hxf0Var, fxf0 fxf0Var, Set set) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(q461.class, new rwf0(this.a, this.c));
        subtypeEffectHandlerBuilderC.c(lrn0.class, new pwf0(hxf0Var));
        subtypeEffectHandlerBuilderC.c(sy40.class, new qwf0(hxf0Var));
        MobiusLoop.Builder builderD = Mobius.d(this.b, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
        return !set.isEmpty() ? Mobius.b(builderD, fxf0Var, new xwf0(set), MainThreadWorkRunner.a()) : Mobius.c(builderD, fxf0Var, MainThreadWorkRunner.a());
    }
}
