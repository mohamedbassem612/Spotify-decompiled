package p;

import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q211 implements Connection {
    public final CompositeDisposable a = new CompositeDisposable();
    public final ObservableTransformer b;
    public final /* synthetic */ Consumer c;

    public q211(cr6 cr6Var, Consumer consumer) {
        this.c = consumer;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.c(u111.class, new l211(cr6Var, (byte) 0));
        subtypeEffectHandlerBuilderC.d(t111.class, new l211(cr6Var, (byte) 1), (Scheduler) cr6Var.e);
        subtypeEffectHandlerBuilderC.g(w111.class, new p211(cr6Var, (byte) 0));
        subtypeEffectHandlerBuilderC.g(v111.class, new p211(cr6Var, (byte) 1));
        this.b = subtypeEffectHandlerBuilderC.h();
    }

    public final void accept(Object obj) {
        this.a.b(Observable.just((x111) obj).compose(this.b).subscribe(new k1p0(this.c, (byte) 6)));
    }

    public final void dispose() {
        this.a.dispose();
    }
}
