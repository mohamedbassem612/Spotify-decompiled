package p;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bjc implements CompletableObserver {
    public final vku a = new vku();
    public final /* synthetic */ cjc b;
    public final /* synthetic */ gmc c;

    public bjc(cjc cjcVar, gmc gmcVar) {
        this.b = cjcVar;
        this.c = gmcVar;
    }

    public final void onComplete() {
        this.b.d.onNext(this.c);
        this.a.c();
    }

    public final void onError(Throwable th) {
        this.a.c();
    }

    public final void onSubscribe(Disposable disposable) {
        this.a.a(disposable);
    }
}
