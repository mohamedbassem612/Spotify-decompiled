package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleFlatMapIterableObservable<T, R> extends Observable<R> {
    public final Single a;
    public final Function b;

    public static final class FlatMapIterableObserver<T, R> extends BasicIntQueueDisposable<R> implements SingleObserver<T> {
        public final Observer a;
        public final Function b;
        public Disposable c;
        public volatile Iterator d;
        public volatile boolean e;
        public boolean f;

        public FlatMapIterableObserver(Observer observer, Function function) {
            this.a = observer;
            this.b = function;
        }

        public final int a(int i) {
            this.f = true;
            return 2;
        }

        public final void clear() {
            this.d = null;
        }

        public void dispose() {
            this.e = true;
            this.c.dispose();
            this.c = DisposableHelper.a;
        }

        public boolean isDisposed() {
            return this.e;
        }

        public final boolean isEmpty() {
            return this.d == null;
        }

        public final void onError(Throwable th) {
            this.c = DisposableHelper.a;
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }

        public final void onSuccess(Object obj) {
            Observer observer = this.a;
            try {
                Iterator<T> it = ((Iterable) this.b.apply(obj)).iterator();
                if (!it.hasNext()) {
                    observer.onComplete();
                    return;
                }
                if (this.f) {
                    this.d = it;
                    observer.onNext((Object) null);
                    observer.onComplete();
                    return;
                }
                while (!this.e) {
                    try {
                        observer.onNext(it.next());
                        if (this.e) {
                            return;
                        }
                        try {
                            if (!it.hasNext()) {
                                observer.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            Exceptions.a(th);
                            observer.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.a(th2);
                        observer.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.a(th3);
                this.a.onError(th3);
            }
        }

        public final Object poll() {
            Iterator it = this.d;
            if (it == null) {
                return null;
            }
            Object next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.d = null;
            }
            return next;
        }
    }

    public SingleFlatMapIterableObservable(Single single, Function function) {
        this.a = single;
        this.b = function;
    }

    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new FlatMapIterableObserver(observer, this.b));
    }
}
