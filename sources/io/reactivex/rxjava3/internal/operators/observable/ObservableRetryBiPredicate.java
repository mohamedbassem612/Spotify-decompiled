package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableRetryBiPredicate<T> extends AbstractObservableWithUpstream<T, T> {
    public final BiPredicate b;

    public static final class RetryBiObserver<T> extends AtomicInteger implements Observer<T> {
        public final Observer a;
        public final SequentialDisposable b;
        public final ObservableSource c;
        public final BiPredicate d;
        public int e;

        public RetryBiObserver(Observer observer, BiPredicate biPredicate, SequentialDisposable sequentialDisposable, ObservableSource observableSource) {
            this.a = observer;
            this.b = sequentialDisposable;
            this.c = observableSource;
            this.d = biPredicate;
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

        public final void onComplete() {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            Observer observer = this.a;
            try {
                BiPredicate biPredicate = this.d;
                int i = this.e + 1;
                this.e = i;
                if (biPredicate.test(Integer.valueOf(i), th)) {
                    a();
                } else {
                    observer.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.a(th2);
                observer.onError(new CompositeException(new Throwable[]{th, th2}));
            }
        }

        public final void onNext(Object obj) {
            this.a.onNext(obj);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this.b, disposable);
        }
    }

    public ObservableRetryBiPredicate(Observable observable, BiPredicate biPredicate) {
        super(observable);
        this.b = biPredicate;
    }

    public final void subscribeActual(Observer observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        new RetryBiObserver(observer, this.b, sequentialDisposable, ((AbstractObservableWithUpstream) this).a).a();
    }
}
