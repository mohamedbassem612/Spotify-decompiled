package p;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vku {
    public final CompositeDisposable a = new CompositeDisposable();

    public final void a(Disposable disposable) {
        this.a.b(disposable);
    }

    public final void b(Disposable... disposableArr) {
        this.a.f((Disposable[]) Arrays.copyOf(disposableArr, disposableArr.length));
    }

    public final void c() {
        this.a.g();
    }
}
