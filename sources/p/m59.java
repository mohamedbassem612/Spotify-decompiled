package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.mobius.extras.CompositeLogger;
import com.spotify.mobius.extras.Connectables;
import com.spotify.mobius.extras.SLF4JLogger;
import com.spotify.mobius.extras.SimpleConnectable;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m59 implements o4h1 {
    public final s59 a;
    public final j141 b;
    public final MobiusLoop.Controller c;

    public m59(s59 s59Var, j141 j141Var, g59 g59Var) {
        this.a = s59Var;
        this.b = j141Var;
        h59 h59Var = new h59(zdr0.b, g59Var.d.a);
        f59 f59Var = new f59();
        m49 m49Var = g59Var.b;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        k49 k49Var = new k49(m49Var, (byte) 0);
        Scheduler scheduler = m49Var.b;
        subtypeEffectHandlerBuilderC.d(g49.class, k49Var, scheduler);
        subtypeEffectHandlerBuilderC.d(h49.class, new k49(m49Var, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.g(e49.class, new ax8(new l49(m49Var, (byte) 0), (byte) 2));
        subtypeEffectHandlerBuilderC.g(j49.class, new ax8(new l49(m49Var, (byte) 1), (byte) 2));
        subtypeEffectHandlerBuilderC.g(c49.class, new ax8(new l49(m49Var, (byte) 2), (byte) 2));
        subtypeEffectHandlerBuilderC.g(d49.class, new ax8(new l49(m49Var, (byte) 3), (byte) 2));
        subtypeEffectHandlerBuilderC.g(i49.class, new ax8(new l49(m49Var, (byte) 4), (byte) 2));
        subtypeEffectHandlerBuilderC.d(f49.class, new k49(m49Var, (byte) 2), scheduler);
        this.c = MobiusAndroid.b(Mobius.d(f59Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(RxEventSources.a(new ObservableSource[]{((Observable) g59Var.e.invoke()).map(e4y.Y), ((Observable) g59Var.c.invoke()).map(q9w.Y).onErrorReturn(s9w.Y), g59Var.f.e().map(t9w.Y)})).f(CompositeLogger.g(g59Var.a, new MobiusLoop.Logger[]{new SLF4JLogger("puffin-mobius-auto-detect")})), h59Var, new e59());
    }

    public final void start() {
        SimpleConnectable simpleConnectableA = Connectables.a(new wbx0(this.b, (byte) 29), this.a);
        MobiusLoop.Controller controller = this.c;
        controller.c(simpleConnectableA);
        controller.start();
    }

    public final void stop() {
        MobiusLoop.Controller controller = this.c;
        controller.stop();
        controller.disconnect();
    }
}
