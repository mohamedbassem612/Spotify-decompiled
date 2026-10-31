package p;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q241 implements CompletableObserver {
    public Disposable a = null;
    public final /* synthetic */ r241 b;

    public q241(r241 r241Var) {
        this.b = r241Var;
    }

    public final void onComplete() {
        this.a.dispose();
        this.b.b.a(this.a);
    }

    public final void onError(Throwable th) {
        onComplete();
    }

    public final void onSubscribe(Disposable disposable) {
        this.a = disposable;
        this.b.b.b(disposable);
    }
}
