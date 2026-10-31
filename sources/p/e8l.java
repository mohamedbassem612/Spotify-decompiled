package p;

import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e8l implements Connection {
    public final CompositeDisposable a = new CompositeDisposable();
    public final ObservableTransformer b;
    public final /* synthetic */ Consumer c;

    public e8l(ku1 ku1Var, Consumer consumer) {
        this.c = consumer;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(uaw.class, (so) ((lmw) ku1Var.b).b);
        this.b = subtypeEffectHandlerBuilderC.h();
    }

    public final void accept(Object obj) {
        this.a.b(Observable.just((uaw) obj).compose(this.b).subscribe(new dn(this.c, (byte) 13)));
    }

    public final void dispose() {
        this.a.dispose();
    }
}
