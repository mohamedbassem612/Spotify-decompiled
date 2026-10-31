package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CompletableMergeIterable extends Completable {
    public final Iterable a;

    public static final class MergeCompletableObserver extends AtomicBoolean implements CompletableObserver, Disposable {
        public final CompositeDisposable a;
        public final CompletableObserver b;
        public final AtomicInteger c;

        public MergeCompletableObserver(CompletableObserver completableObserver, CompositeDisposable compositeDisposable, AtomicInteger atomicInteger) {
            this.b = completableObserver;
            this.a = compositeDisposable;
            this.c = atomicInteger;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.a.dispose();
            set(true);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.a.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            if (this.c.decrementAndGet() == 0) {
                this.b.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.a.dispose();
            if (compareAndSet(false, true)) {
                this.b.onError(th);
            } else {
                RxJavaPlugins.b(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            this.a.b(disposable);
        }
    }

    public CompletableMergeIterable(Iterable iterable) {
        this.a = iterable;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void r(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        AtomicInteger atomicInteger = new AtomicInteger(1);
        MergeCompletableObserver mergeCompletableObserver = new MergeCompletableObserver(completableObserver, compositeDisposable, atomicInteger);
        completableObserver.onSubscribe(mergeCompletableObserver);
        try {
            Iterator it = this.a.iterator();
            Objects.requireNonNull(it, "The source iterator returned is null");
            while (!compositeDisposable.isDisposed()) {
                try {
                    if (!it.hasNext()) {
                        mergeCompletableObserver.onComplete();
                        return;
                    }
                    if (compositeDisposable.isDisposed()) {
                        return;
                    }
                    try {
                        Object next = it.next();
                        Objects.requireNonNull(next, "The iterator returned a null CompletableSource");
                        CompletableSource completableSource = (CompletableSource) next;
                        if (compositeDisposable.isDisposed()) {
                            return;
                        }
                        atomicInteger.getAndIncrement();
                        completableSource.subscribe(mergeCompletableObserver);
                    } catch (Throwable th) {
                        Exceptions.a(th);
                        compositeDisposable.dispose();
                        mergeCompletableObserver.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.a(th2);
                    compositeDisposable.dispose();
                    mergeCompletableObserver.onError(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            Exceptions.a(th3);
            completableObserver.onError(th3);
        }
    }
}
