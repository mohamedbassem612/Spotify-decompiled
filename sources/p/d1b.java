package p;

import android.content.res.Resources;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d1b {
    public final Observable a;
    public final v5n b;
    public final bi0 c;
    public final t4d1 d;
    public final kt91 e;
    public final i8h1 f;
    public final ntk0 g;
    public final Resources h;

    public d1b(Observable observable, v5n v5nVar, bi0 bi0Var, t4d1 t4d1Var, kt91 kt91Var, i8h1 i8h1Var, ntk0 ntk0Var, Resources resources) {
        this.a = observable;
        this.b = v5nVar;
        this.c = bi0Var;
        this.d = t4d1Var;
        this.e = kt91Var;
        this.f = i8h1Var;
        this.g = ntk0Var;
        this.h = resources;
    }

    public final MobiusLoop.Controller a(e1b e1bVar) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(jr40.class, new so(this.a, this.b, (byte) 1));
        subtypeEffectHandlerBuilderC.g(ao40.class, new bk1(this.d, (byte) 5));
        subtypeEffectHandlerBuilderC.a(v681.class, new v0b(this.e, (byte) 0));
        a21 a21Var = new a21(this.c, this.h, (byte) 19);
        Scheduler scheduler = AndroidSchedulers.a;
        RxAndroidPlugins.b(scheduler);
        subtypeEffectHandlerBuilderC.d(y871.class, a21Var, scheduler);
        i8h1 i8h1Var = this.f;
        ntk0 ntk0Var = this.g;
        subtypeEffectHandlerBuilderC.a(mse0.class, new u0b(i8h1Var, ntk0Var, (byte) 0));
        subtypeEffectHandlerBuilderC.a(ese0.class, new u0b(i8h1Var, ntk0Var, (byte) 1));
        return Mobius.b(l1d.g(Mobius.d(c1b.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(RxEventSources.a(new ObservableSource[]{Observable.empty()}))), e1bVar, b1b.a, MainThreadWorkRunner.a());
    }
}
