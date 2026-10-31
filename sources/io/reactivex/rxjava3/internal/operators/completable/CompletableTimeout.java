package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CompletableTimeout extends Completable {
    public final Completable a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final CompletableSource e;

    public final class DisposeTask implements Runnable {
        public final AtomicBoolean a;
        public final CompositeDisposable b;
        public final CompletableObserver c;

        public DisposeTask(AtomicBoolean atomicBoolean, CompositeDisposable compositeDisposable, CompletableObserver completableObserver) {
            this.a = atomicBoolean;
            this.b = compositeDisposable;
            this.c = completableObserver;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.a.compareAndSet(false, true)) {
                this.b.g();
                CompletableTimeout completableTimeout = CompletableTimeout.this;
                CompletableSource completableSource = completableTimeout.e;
                if (completableSource != null) {
                    completableSource.subscribe(new DisposeObserver(this));
                } else {
                    this.c.onError(new TimeoutException(ExceptionHelper.e(completableTimeout.b, completableTimeout.c)));
                }
            }
        }
    }

    public static final class TimeOutObserver implements CompletableObserver {
        public final CompositeDisposable a;
        public final AtomicBoolean b;
        public final CompletableObserver c;

        public TimeOutObserver(CompositeDisposable compositeDisposable, AtomicBoolean atomicBoolean, CompletableObserver completableObserver) {
            this.a = compositeDisposable;
            this.b = atomicBoolean;
            this.c = completableObserver;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            if (this.b.compareAndSet(false, true)) {
                this.a.dispose();
                this.c.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            if (!this.b.compareAndSet(false, true)) {
                RxJavaPlugins.b(th);
            } else {
                this.a.dispose();
                this.c.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            this.a.b(disposable);
        }
    }

    public CompletableTimeout(Completable completable, long j, TimeUnit timeUnit, Scheduler scheduler, CompletableSource completableSource) {
        this.a = completable;
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
        this.e = completableSource;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void r(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        compositeDisposable.b(this.d.d(new DisposeTask(atomicBoolean, compositeDisposable, completableObserver), this.b, this.c));
        this.a.subscribe(new TimeOutObserver(compositeDisposable, atomicBoolean, completableObserver));
    }
}
