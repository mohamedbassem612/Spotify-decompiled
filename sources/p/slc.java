package p;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class slc implements CompletableObserver {
    public final vku a = new vku();
    public final /* synthetic */ tlc b;
    public final /* synthetic */ String c;

    public slc(tlc tlcVar, String str) {
        this.b = tlcVar;
        this.c = str;
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public final void onComplete() {
        this.b.d.onNext(new nlc(this.c));
        this.a.c();
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public final void onError(Throwable th) {
        this.a.c();
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public final void onSubscribe(Disposable disposable) {
        this.a.a(disposable);
    }
}
