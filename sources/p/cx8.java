package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cx8 implements ObservableTransformer {
    public final Observable a;

    public cx8(Observable observable) {
        this.a = observable;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        return Observable.empty().startWithItem(new tw8()).compose(RxMobius.b(Mobius.d(new xw8(), RxConnectables.a(new ax8(observable, (byte) 0))).h(RxEventSources.a(this.a.map(xbp1.X))).d(yw8.a).b(zw8.a), j5.a)).filter(wdu0.f).map(cxo1.X);
    }
}
