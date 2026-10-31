package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableRepeatUntil<T> extends AbstractObservableWithUpstream<T, T> {
    public final BooleanSupplier b;

    public static final class RepeatUntilObserver<T> extends AtomicInteger implements Observer<T> {
        public final Observer a;
        public final SequentialDisposable b;
        public final ObservableSource c;
        public final BooleanSupplier d;

        public RepeatUntilObserver(Observer observer, BooleanSupplier booleanSupplier, SequentialDisposable sequentialDisposable, ObservableSource observableSource) {
            this.a = observer;
            this.b = sequentialDisposable;
            this.c = observableSource;
            this.d = booleanSupplier;
        }

        public final void onComplete() {
            Observer observer = this.a;
            try {
                if (this.d.a()) {
                    observer.onComplete();
                } else if (getAndIncrement() == 0) {
                    int iAddAndGet = 1;
                    do {
                        this.c.subscribe(this);
                        iAddAndGet = addAndGet(-iAddAndGet);
                    } while (iAddAndGet != 0);
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                observer.onError(th);
            }
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            this.a.onNext(obj);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this.b, disposable);
        }
    }

    public ObservableRepeatUntil(Observable observable, BooleanSupplier booleanSupplier) {
        super(observable);
        this.b = booleanSupplier;
    }

    public final void subscribeActual(Observer observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        RepeatUntilObserver repeatUntilObserver = new RepeatUntilObserver(observer, this.b, sequentialDisposable, ((AbstractObservableWithUpstream) this).a);
        if (repeatUntilObserver.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            do {
                repeatUntilObserver.c.subscribe(repeatUntilObserver);
                iAddAndGet = repeatUntilObserver.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }
}
