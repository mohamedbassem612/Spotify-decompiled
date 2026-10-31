package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableRetryPredicate<T> extends AbstractObservableWithUpstream<T, T> {
    public final Predicate b;
    public final long c;

    public static final class RepeatObserver<T> extends AtomicInteger implements Observer<T> {
        public final Observer a;
        public final SequentialDisposable b;
        public final ObservableSource c;
        public final Predicate d;
        public long e;

        public RepeatObserver(Observer observer, long j, Predicate predicate, SequentialDisposable sequentialDisposable, ObservableSource observableSource) {
            this.a = observer;
            this.b = sequentialDisposable;
            this.c = observableSource;
            this.d = predicate;
            this.e = j;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.b.isDisposed()) {
                    this.c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            long j = this.e;
            if (j != Long.MAX_VALUE) {
                this.e = j - 1;
            }
            Observer observer = this.a;
            if (j == 0) {
                observer.onError(th);
                return;
            }
            try {
                if (this.d.test(th)) {
                    a();
                } else {
                    observer.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.a(th2);
                observer.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.a.onNext(obj);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this.b, disposable);
        }
    }

    public ObservableRetryPredicate(Observable observable, long j, Predicate predicate) {
        super(observable);
        this.b = predicate;
        this.c = j;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        new RepeatObserver(observer, this.c, this.b, sequentialDisposable, this.a).a();
    }
}
