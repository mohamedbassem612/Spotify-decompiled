package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u9h implements t9h {
    public final Scheduler a;
    public final Scheduler b;
    public final MobiusLoop.Builder c;

    public u9h(o9h o9hVar, Scheduler scheduler, Scheduler scheduler2) {
        this.a = scheduler;
        this.b = scheduler2;
        drm1 drm1Var = new drm1((byte) 6);
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        f72 f72Var = new f72(o9hVar, (byte) 7);
        Scheduler scheduler3 = o9hVar.b;
        subtypeEffectHandlerBuilderC.b(m9h.class, f72Var, scheduler3);
        subtypeEffectHandlerBuilderC.d(n9h.class, new mba(o9hVar, (byte) 25), scheduler3);
        this.c = Mobius.d(drm1Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).b(new i3b(this, (byte) 15)).d(new n4b(this, (byte) 11));
    }
}
