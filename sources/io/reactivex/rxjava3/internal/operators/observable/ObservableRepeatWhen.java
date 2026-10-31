package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableRepeatWhen<T> extends AbstractObservableWithUpstream<T, T> {
    public final Function b;

    public static final class RepeatWhenObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        public final Observer a;
        public final Subject d;
        public final ObservableSource g;
        public volatile boolean h;
        public final AtomicInteger b = new AtomicInteger();
        public final AtomicThrowable c = new AtomicThrowable();
        public final InnerRepeatObserver e = new InnerRepeatObserver();
        public final AtomicReference f = new AtomicReference();

        public final class InnerRepeatObserver extends AtomicReference<Disposable> implements Observer<Object> {
            public InnerRepeatObserver() {
            }

            public final void onComplete() {
                RepeatWhenObserver repeatWhenObserver = RepeatWhenObserver.this;
                DisposableHelper.a(repeatWhenObserver.f);
                HalfSerializer.a(repeatWhenObserver.a, repeatWhenObserver, repeatWhenObserver.c);
            }

            public final void onError(Throwable th) {
                RepeatWhenObserver repeatWhenObserver = RepeatWhenObserver.this;
                DisposableHelper.a(repeatWhenObserver.f);
                HalfSerializer.b(repeatWhenObserver.a, th, repeatWhenObserver, repeatWhenObserver.c);
            }

            public final void onNext(Object obj) {
                RepeatWhenObserver.this.a();
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.g(this, disposable);
            }
        }

        public RepeatWhenObserver(Observer observer, Subject subject, ObservableSource observableSource) {
            this.a = observer;
            this.d = subject;
            this.g = observableSource;
        }

        public final void a() {
            if (this.b.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.h) {
                        this.h = true;
                        this.g.subscribe(this);
                    }
                    if (this.b.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public void dispose() {
            DisposableHelper.a(this.f);
            DisposableHelper.a(this.e);
        }

        public boolean isDisposed() {
            return DisposableHelper.b((Disposable) this.f.get());
        }

        public final void onComplete() {
            DisposableHelper.c(this.f, (Disposable) null);
            this.h = false;
            this.d.onNext(0);
        }

        public final void onError(Throwable th) {
            DisposableHelper.a(this.e);
            HalfSerializer.b(this.a, th, this, this.c);
        }

        public final void onNext(Object obj) {
            HalfSerializer.c(this.a, obj, this, this.c);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this.f, disposable);
        }
    }

    public ObservableRepeatWhen(Observable observable, Function function) {
        super(observable);
        this.b = function;
    }

    public final void subscribeActual(Observer observer) {
        Subject subjectC = new PublishSubject().c();
        try {
            Object objApply = this.b.apply(subjectC);
            Objects.requireNonNull(objApply, "The handler returned a null ObservableSource");
            ObservableSource observableSource = (ObservableSource) objApply;
            RepeatWhenObserver repeatWhenObserver = new RepeatWhenObserver(observer, subjectC, ((AbstractObservableWithUpstream) this).a);
            observer.onSubscribe(repeatWhenObserver);
            observableSource.subscribe(repeatWhenObserver.e);
            repeatWhenObserver.a();
        } catch (Throwable th) {
            Exceptions.a(th);
            EmptyDisposable.c(th, observer);
        }
    }
}
