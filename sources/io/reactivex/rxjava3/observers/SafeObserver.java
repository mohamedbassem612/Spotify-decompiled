package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SafeObserver<T> implements Observer<T>, Disposable {
    public final Observer a;
    public Disposable b;
    public boolean c;

    public SafeObserver(Observer observer) {
        this.a = observer;
    }

    public void dispose() {
        this.b.dispose();
    }

    public boolean isDisposed() {
        return this.b.isDisposed();
    }

    public final void onComplete() {
        if (this.c) {
            return;
        }
        this.c = true;
        Disposable disposable = this.b;
        Observer observer = this.a;
        if (disposable != null) {
            try {
                observer.onComplete();
                return;
            } catch (Throwable th) {
                Exceptions.a(th);
                RxJavaPlugins.b(th);
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            observer.onSubscribe(EmptyDisposable.a);
            try {
                observer.onError(nullPointerException);
            } catch (Throwable th2) {
                Exceptions.a(th2);
                RxJavaPlugins.b(new CompositeException(new Throwable[]{nullPointerException, th2}));
            }
        } catch (Throwable th3) {
            Exceptions.a(th3);
            RxJavaPlugins.b(new CompositeException(new Throwable[]{nullPointerException, th3}));
        }
    }

    public final void onError(Throwable th) {
        if (this.c) {
            RxJavaPlugins.b(th);
            return;
        }
        this.c = true;
        Disposable disposable = this.b;
        Observer observer = this.a;
        if (disposable != null) {
            if (th == null) {
                th = ExceptionHelper.b("onError called with a null Throwable.");
            }
            try {
                observer.onError(th);
                return;
            } catch (Throwable th2) {
                Exceptions.a(th2);
                RxJavaPlugins.b(new CompositeException(new Throwable[]{th, th2}));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            observer.onSubscribe(EmptyDisposable.a);
            try {
                observer.onError(new CompositeException(new Throwable[]{th, nullPointerException}));
            } catch (Throwable th3) {
                Exceptions.a(th3);
                RxJavaPlugins.b(new CompositeException(new Throwable[]{th, nullPointerException, th3}));
            }
        } catch (Throwable th4) {
            Exceptions.a(th4);
            RxJavaPlugins.b(new CompositeException(new Throwable[]{th, nullPointerException, th4}));
        }
    }

    public final void onNext(Object obj) {
        if (this.c) {
            return;
        }
        Disposable disposable = this.b;
        Observer observer = this.a;
        if (disposable == null) {
            this.c = true;
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                observer.onSubscribe(EmptyDisposable.a);
                try {
                    observer.onError(nullPointerException);
                    return;
                } catch (Throwable th) {
                    Exceptions.a(th);
                    RxJavaPlugins.b(new CompositeException(new Throwable[]{nullPointerException, th}));
                    return;
                }
            } catch (Throwable th2) {
                Exceptions.a(th2);
                RxJavaPlugins.b(new CompositeException(new Throwable[]{nullPointerException, th2}));
                return;
            }
        }
        if (obj == null) {
            NullPointerException nullPointerExceptionB = ExceptionHelper.b("onNext called with a null value.");
            try {
                this.b.dispose();
                onError(nullPointerExceptionB);
                return;
            } catch (Throwable th3) {
                Exceptions.a(th3);
                onError(new CompositeException(new Throwable[]{nullPointerExceptionB, th3}));
                return;
            }
        }
        try {
            observer.onNext(obj);
        } catch (Throwable th4) {
            Exceptions.a(th4);
            try {
                this.b.dispose();
                onError(th4);
            } catch (Throwable th5) {
                Exceptions.a(th5);
                onError(new CompositeException(new Throwable[]{th4, th5}));
            }
        }
    }

    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.h(this.b, disposable)) {
            this.b = disposable;
            try {
                this.a.onSubscribe(this);
            } catch (Throwable th) {
                Exceptions.a(th);
                this.c = true;
                try {
                    disposable.dispose();
                    RxJavaPlugins.b(th);
                } catch (Throwable th2) {
                    Exceptions.a(th2);
                    RxJavaPlugins.b(new CompositeException(new Throwable[]{th, th2}));
                }
            }
        }
    }
}
