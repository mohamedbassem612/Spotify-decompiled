package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CompletableConcatIterable extends Completable {
    public final ArrayList a;

    public static final class ConcatInnerObserver extends AtomicInteger implements CompletableObserver {
        public final CompletableObserver a;
        public final Iterator b;
        public final SequentialDisposable c = new SequentialDisposable();

        public ConcatInnerObserver(CompletableObserver completableObserver, Iterator it) {
            this.a = completableObserver;
            this.b = it;
        }

        public final void a() {
            CompletableObserver completableObserver = this.a;
            SequentialDisposable sequentialDisposable = this.c;
            if (!sequentialDisposable.isDisposed() && getAndIncrement() == 0) {
                Iterator it = this.b;
                while (!sequentialDisposable.isDisposed()) {
                    try {
                        if (!it.hasNext()) {
                            completableObserver.onComplete();
                            return;
                        }
                        try {
                            Object next = it.next();
                            Objects.requireNonNull(next, "The CompletableSource returned is null");
                            ((CompletableSource) next).subscribe(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } catch (Throwable th) {
                            Exceptions.a(th);
                            completableObserver.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.a(th2);
                        completableObserver.onError(th2);
                        return;
                    }
                }
            }
        }

        public final void onComplete() {
            a();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this.c, disposable);
        }
    }

    public CompletableConcatIterable(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final void r(CompletableObserver completableObserver) {
        try {
            Iterator it = this.a.iterator();
            Objects.requireNonNull(it, "The iterator returned is null");
            ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(completableObserver, it);
            completableObserver.onSubscribe(concatInnerObserver.c);
            concatInnerObserver.a();
        } catch (Throwable th) {
            Exceptions.a(th);
            completableObserver.onSubscribe(EmptyDisposable.a);
            completableObserver.onError(th);
        }
    }
}
