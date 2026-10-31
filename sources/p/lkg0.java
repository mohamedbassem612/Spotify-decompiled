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
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lkg0 implements o4h1 {
    public final s59 a;
    public final List b;
    public final gqb0 c;
    public final MobiusLoop.Controller d;

    public lkg0(s59 s59Var, List list, gqb0 gqb0Var, gkg0 gkg0Var) {
        this.a = s59Var;
        this.b = list;
        this.c = gqb0Var;
        kkg0 kkg0Var = gkg0Var.b;
        boolean z = kkg0Var.b;
        rrn1 aer0Var = (!z || kkg0Var.c == null) ? new aer0() : new idr0();
        boolean z2 = kkg0Var.a;
        String str = kkg0Var.c;
        boolean z3 = kkg0Var.d;
        env0 env0Var = kkg0Var.e;
        fae1 bnv0Var = null;
        if (env0Var != null) {
            if (env0Var instanceof cnv0) {
                bnv0Var = new anv0(((cnv0) env0Var).a);
            } else {
                if (!(env0Var instanceof dnv0)) {
                    eg.o();
                    throw null;
                }
                dnv0 dnv0Var = (dnv0) env0Var;
                bnv0Var = new bnv0(dnv0Var.a, dnv0Var.b, dnv0Var.c, dnv0Var.d);
            }
        }
        hkg0 hkg0Var = new hkg0(z2, bnv0Var, kkg0Var.f, z, str, z3, aer0Var, list, kkg0Var.g, false, qb0.a);
        bkg0 bkg0Var = new bkg0();
        gjg0 gjg0Var = gkg0Var.a;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        ejg0 ejg0Var = new ejg0(gjg0Var, (byte) 0);
        Scheduler scheduler = gjg0Var.b;
        subtypeEffectHandlerBuilderC.d(yig0.class, ejg0Var, scheduler);
        subtypeEffectHandlerBuilderC.d(zig0.class, new ejg0(gjg0Var, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.d(ajg0.class, new ejg0(gjg0Var, (byte) 2), scheduler);
        subtypeEffectHandlerBuilderC.g(cjg0.class, new ax8(new fjg0(gjg0Var, (byte) 0), (byte) 2));
        subtypeEffectHandlerBuilderC.g(xig0.class, new ax8(new fjg0(gjg0Var, (byte) 1), (byte) 2));
        subtypeEffectHandlerBuilderC.g(bjg0.class, new ax8(new fjg0(gjg0Var, (byte) 2), (byte) 2));
        subtypeEffectHandlerBuilderC.g(wig0.class, new ax8(new fjg0(gjg0Var, (byte) 3), (byte) 2));
        subtypeEffectHandlerBuilderC.g(uig0.class, new ax8(new fjg0(gjg0Var, (byte) 4), (byte) 2));
        subtypeEffectHandlerBuilderC.g(vig0.class, new ax8(new fjg0(gjg0Var, (byte) 5), (byte) 2));
        this.d = MobiusAndroid.b(Mobius.d(bkg0Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(RxEventSources.a(new ObservableSource[]{((Observable) gkg0Var.d.invoke()).map(ckg0.a), ((Observable) gkg0Var.e.invoke()).map(dkg0.a), Observable.fromCallable(new ekg0(gkg0Var)).map(fkg0.a)})).f(CompositeLogger.g(gkg0Var.c, new MobiusLoop.Logger[]{new SLF4JLogger("puffin-mobius-manual-select")})), hkg0Var, new akg0());
    }

    public final void start() {
        SimpleConnectable simpleConnectableA = Connectables.a(new dg90(this.c, (byte) 20), this.a);
        MobiusLoop.Controller controller = this.d;
        controller.c(simpleConnectableA);
        controller.start();
    }

    public final void stop() {
        MobiusLoop.Controller controller = this.d;
        controller.stop();
        controller.disconnect();
    }
}
