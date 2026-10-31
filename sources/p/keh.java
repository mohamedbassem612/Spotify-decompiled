package p;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class keh implements Observer {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ keh(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onComplete() {
        switch (this.a) {
            case 0:
                synchronized (((mp8) this.b)) {
                    new IllegalStateException("queue has been shut down");
                }
                return;
            default:
                ((Observer) this.b).onComplete();
                return;
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                synchronized (((mp8) this.b)) {
                    new IllegalStateException("fatal error", th);
                }
                return;
            default:
                Observer observer = (Observer) this.b;
                try {
                    if (th == null) {
                        throw new NullPointerException("error == null");
                    }
                    observer.onNext(new f331((byte) 0));
                    observer.onComplete();
                    return;
                } catch (Throwable th2) {
                    try {
                        observer.onError(th2);
                        return;
                    } catch (Throwable th3) {
                        Exceptions.a(th3);
                        RxJavaPlugins.b(new CompositeException(new Throwable[]{th2, th3}));
                        return;
                    }
                }
        }
    }

    public final void onNext(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                if (!(th instanceof RuntimeException)) {
                    throw new RuntimeException(th);
                }
                throw ((RuntimeException) th);
            default:
                sy21 sy21Var = (sy21) obj;
                Observer observer = (Observer) this.b;
                if (sy21Var != null) {
                    observer.onNext(new f331((byte) 0));
                    return;
                } else {
                    bhn0.i("response == null");
                    return;
                }
        }
    }

    public final void onSubscribe(Disposable disposable) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((Observer) this.b).onSubscribe(disposable);
                break;
        }
    }

    private final void a(Disposable disposable) {
    }
}
