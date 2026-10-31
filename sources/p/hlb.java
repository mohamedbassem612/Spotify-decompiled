package p;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import retrofit2.adapter.rxjava3.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hlb implements Observer {
    public final Observer a;
    public boolean b;

    public hlb(Observer observer) {
        this.a = observer;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        if (this.b) {
            return;
        }
        this.a.onComplete();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        if (!this.b) {
            this.a.onError(th);
            return;
        }
        AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
        assertionError.initCause(th);
        RxJavaPlugins.b(assertionError);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        sy21 sy21Var = (sy21) obj;
        boolean z = sy21Var.a.Q0;
        Observer observer = this.a;
        if (z) {
            observer.onNext(sy21Var.b);
            return;
        }
        this.b = true;
        Throwable httpException = new HttpException(sy21Var);
        try {
            observer.onError(httpException);
        } catch (Throwable th) {
            Exceptions.a(th);
            RxJavaPlugins.b(new CompositeException(httpException, th));
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        this.a.onSubscribe(disposable);
    }
}
