package p;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class doc1 extends bbc implements Observer, MaybeObserver {
    public static final /* synthetic */ long S0 = avg.a.objectFieldOffset(doc1.class.getDeclaredField("_subscription$volatile"));
    private volatile /* synthetic */ Object _subscription$volatile;

    public final void G() {
        Disposable disposable = (Disposable) avg.a.getAndSetObject(this, S0, (Object) null);
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public final void onComplete() {
        e((Throwable) null, false);
    }

    public final void onError(Throwable th) {
        e(th, false);
    }

    public final void onSubscribe(Disposable disposable) {
        avg.a.putObjectVolatile(this, S0, disposable);
    }

    public final void onSuccess(Object obj) {
        l(obj);
        e((Throwable) null, false);
    }
}
