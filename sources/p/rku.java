package p;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.SerialDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rku {
    public final SerialDisposable a = new SerialDisposable();

    public final void a() {
        this.a.a((Disposable) null);
    }

    public final void b(Disposable disposable) {
        this.a.a(disposable);
    }
}
