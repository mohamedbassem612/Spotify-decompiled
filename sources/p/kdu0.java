package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kdu0 implements ObservableSource {
    public final /* synthetic */ Observable a;

    public kdu0(Observable observable) {
        this.a = observable.filter(f331.b1).onErrorReturnItem(new jdu0()).distinctUntilChanged().map(zz10.Y0);
    }

    @Override // io.reactivex.rxjava3.core.ObservableSource
    public final void subscribe(Observer observer) {
        this.a.subscribe(observer);
    }
}
