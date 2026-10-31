package p;

import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rz01 implements Connection {
    public final CompositeDisposable a = new CompositeDisposable();
    public final ObservableTransformer b;
    public final /* synthetic */ Consumer c;

    public rz01(sz01 sz01Var, Consumer consumer) {
        this.c = consumer;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(gz01.class, sz01Var.f);
        dsg dsgVar = sz01Var.d;
        Scheduler scheduler = sz01Var.c;
        subtypeEffectHandlerBuilderC.d(hz01.class, dsgVar, scheduler);
        subtypeEffectHandlerBuilderC.g(iz01.class, sz01Var.i);
        subtypeEffectHandlerBuilderC.d(jz01.class, sz01Var.e, scheduler);
        unq unqVar = sz01Var.t;
        lik1 lik1Var = sz01Var.a;
        subtypeEffectHandlerBuilderC.d(kz01.class, unqVar.a(lik1Var), scheduler);
        subtypeEffectHandlerBuilderC.g(lz01.class, sz01Var.X);
        subtypeEffectHandlerBuilderC.g(mz01.class, sz01Var.Y.a(lik1Var));
        tnq tnqVar = sz01Var.h;
        sjw0 sjw0Var = sz01Var.b;
        subtypeEffectHandlerBuilderC.g(nz01.class, tnqVar.a(sjw0Var));
        subtypeEffectHandlerBuilderC.c(oz01.class, sz01Var.g.a(sjw0Var));
        this.b = subtypeEffectHandlerBuilderC.h();
    }

    public final void accept(Object obj) {
        this.a.b(Observable.just((pz01) obj).compose(this.b).subscribe(new k1p0(this.c, (byte) 5)));
    }

    public final void dispose() {
        this.a.dispose();
    }
}
