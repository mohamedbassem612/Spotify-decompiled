package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.BasicQueueDisposable;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableFromIterable<T> extends Observable<T> {
    public final Iterable a;

    public static final class FromIterableDisposable<T> extends BasicQueueDisposable<T> {
        public final Observer a;
        public final Iterator b;
        public volatile boolean c;
        public boolean d;
        public boolean e;
        public boolean f;

        public FromIterableDisposable(Observer observer, Iterator it) {
            this.a = observer;
            this.b = it;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        public final int a(int i) {
            this.d = true;
            return 1;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.e = true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.c = true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.c;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.e;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            if (this.e) {
                return null;
            }
            boolean z = this.f;
            Iterator it = this.b;
            if (!z) {
                this.f = true;
            } else if (!it.hasNext()) {
                this.e = true;
                return null;
            }
            Object next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            return next;
        }
    }

    public ObservableFromIterable(Iterable iterable) {
        this.a = iterable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        try {
            Iterator<T> it = this.a.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.b(observer);
                    return;
                }
                FromIterableDisposable fromIterableDisposable = new FromIterableDisposable(observer, it);
                observer.onSubscribe(fromIterableDisposable);
                if (fromIterableDisposable.d) {
                    return;
                }
                Iterator it2 = fromIterableDisposable.b;
                Observer observer2 = fromIterableDisposable.a;
                while (!fromIterableDisposable.isDisposed()) {
                    try {
                        Object next = it2.next();
                        Objects.requireNonNull(next, "The iterator returned a null value");
                        observer2.onNext(next);
                        if (fromIterableDisposable.isDisposed()) {
                            return;
                        }
                        try {
                            if (!it2.hasNext()) {
                                if (fromIterableDisposable.isDisposed()) {
                                    return;
                                }
                                observer2.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            Exceptions.a(th);
                            observer2.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.a(th2);
                        observer2.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.a(th3);
                EmptyDisposable.c(th3, observer);
            }
        } catch (Throwable th4) {
            Exceptions.a(th4);
            EmptyDisposable.c(th4, observer);
        }
    }
}
