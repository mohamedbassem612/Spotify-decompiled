package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    public final boolean a(Throwable th) {
        if (ExceptionHelper.a(this, th)) {
            return true;
        }
        RxJavaPlugins.b(th);
        return false;
    }

    public final void b() {
        Throwable thD = ExceptionHelper.d(this);
        if (thD == null || thD == ExceptionHelper.a) {
            return;
        }
        RxJavaPlugins.b(thD);
    }

    public final void c(CompletableObserver completableObserver) {
        Throwable thD = ExceptionHelper.d(this);
        if (thD == null) {
            completableObserver.onComplete();
        } else if (thD != ExceptionHelper.a) {
            completableObserver.onError(thD);
        }
    }

    public final void d(Observer observer) {
        Throwable thD = ExceptionHelper.d(this);
        if (thD == null) {
            observer.onComplete();
        } else if (thD != ExceptionHelper.a) {
            observer.onError(thD);
        }
    }

    public final void e(gnc1 gnc1Var) {
        Throwable thD = ExceptionHelper.d(this);
        if (thD == null) {
            gnc1Var.onComplete();
        } else if (thD != ExceptionHelper.a) {
            gnc1Var.onError(thD);
        }
    }
}
