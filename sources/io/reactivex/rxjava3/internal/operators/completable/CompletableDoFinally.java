package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CompletableDoFinally extends Completable {
    public final Completable a;
    public final Action b;

    public static final class DoFinallyObserver extends AtomicInteger implements CompletableObserver, Disposable {
        public final CompletableObserver a;
        public final Action b;
        public Disposable c;

        public DoFinallyObserver(CompletableObserver completableObserver, Action action) {
            this.a = completableObserver;
            this.b = action;
        }

        public final void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.b.run();
                } catch (Throwable th) {
                    Exceptions.a(th);
                    RxJavaPlugins.b(th);
                }
            }
        }

        public void dispose() {
            this.c.dispose();
            a();
        }

        public boolean isDisposed() {
            return this.c.isDisposed();
        }

        public final void onComplete() {
            this.a.onComplete();
            a();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
            a();
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public CompletableDoFinally(Completable completable, Action action) {
        this.a = completable;
        this.b = action;
    }

    public final void r(CompletableObserver completableObserver) {
        this.a.subscribe(new DoFinallyObserver(completableObserver, this.b));
    }
}
