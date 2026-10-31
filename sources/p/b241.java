package p;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b241 implements Observer {
    public final /* synthetic */ ssw0 a;
    public final /* synthetic */ AtomicReference b;

    public b241(AtomicReference atomicReference, ssw0 ssw0Var) {
        this.a = ssw0Var;
        this.b = atomicReference;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        this.a.H(null);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        this.a.H(th);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        try {
            ilo1.E(obj, this.a);
        } catch (InterruptedException unused) {
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        AtomicReference atomicReference;
        do {
            atomicReference = this.b;
            if (atomicReference.compareAndSet(null, disposable)) {
                return;
            }
        } while (atomicReference.get() == null);
        disposable.dispose();
    }
}
