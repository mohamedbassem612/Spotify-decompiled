package p;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ci50 implements wu30 {
    public final /* synthetic */ di50 a;
    public final /* synthetic */ lzn0 b;
    public final /* synthetic */ kt91 c;
    public final /* synthetic */ i8h1 d;
    public final /* synthetic */ ntk0 e;
    public final /* synthetic */ jh50 f;
    public final /* synthetic */ Scheduler g;
    public final /* synthetic */ qh50 h;

    public ci50(di50 di50Var, lzn0 lzn0Var, kt91 kt91Var, i8h1 i8h1Var, ntk0 ntk0Var, jh50 jh50Var, Scheduler scheduler, qh50 qh50Var) {
        this.a = di50Var;
        this.b = lzn0Var;
        this.c = kt91Var;
        this.d = i8h1Var;
        this.e = ntk0Var;
        this.f = jh50Var;
        this.g = scheduler;
        this.h = qh50Var;
    }

    public final Object apply(Object obj) {
        yh50 yh50Var = (yh50) obj;
        yh50Var.getClass();
        bi50 bi50Var = new bi50();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        jh50 jh50Var = this.f;
        subtypeEffectHandlerBuilderC.g(t4b.class, new sh50(jh50Var, (byte) 0));
        lzn0 lzn0Var = this.b;
        f5b f5bVar = new f5b(lzn0Var, (byte) 8);
        Scheduler scheduler = this.g;
        subtypeEffectHandlerBuilderC.d(c5b.class, f5bVar, scheduler);
        subtypeEffectHandlerBuilderC.a(e5b.class, new v0b(this.c, (byte) 2));
        i8h1 i8h1Var = this.d;
        ntk0 ntk0Var = this.e;
        subtypeEffectHandlerBuilderC.a(y4b.class, new u0b(i8h1Var, ntk0Var, (byte) 4));
        subtypeEffectHandlerBuilderC.a(x4b.class, new u0b(i8h1Var, ntk0Var, (byte) 5));
        subtypeEffectHandlerBuilderC.d(z4b.class, new f5b(lzn0Var, bi50Var), scheduler);
        subtypeEffectHandlerBuilderC.g(v4b.class, new sh50(jh50Var, (byte) 1));
        subtypeEffectHandlerBuilderC.a(w4b.class, new u0b(i8h1Var, ntk0Var, (byte) 6));
        subtypeEffectHandlerBuilderC.d(d5b.class, new od30(this.h, (byte) 14), scheduler);
        MobiusLoop.Controller controllerB = Mobius.b(l1d.g(Mobius.d(ai50.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(RxEventSources.a(new ObservableSource[]{Observable.empty()}))), yh50Var, zh50.a, MainThreadWorkRunner.a());
        x2p x2pVar = (x2p) ((gjp) this.a).a.c;
        gw70 gw70Var = (gw70) ((vh50) x2pVar.c).d.get();
        c8o.l(gw70Var);
        vh50 vh50Var = (vh50) x2pVar.c;
        Context context = (Context) vh50Var.a.a;
        c8o.l(context);
        gw70 gw70Var2 = (gw70) vh50Var.d.get();
        c8o.l(gw70Var2);
        c8o.l((im4) vh50Var.h.get());
        zfx zfxVar = new zfx(new wfx(context, gw70Var2), (byte) 5);
        t2b t2bVar = new t2b((byte) 0);
        Resources resources = (Resources) vh50Var.b.get();
        c8o.l(resources);
        return new ei50(gw70Var, zfxVar, t2bVar, resources, controllerB);
    }
}
