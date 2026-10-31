package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fis {
    public final Observable a;

    public fis(Observable observable) {
        this.a = observable.map(p9w.X0).distinctUntilChanged().onErrorReturnItem(Boolean.FALSE);
    }
}
