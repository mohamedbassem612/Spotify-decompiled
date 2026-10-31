package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableFlatMapStream<T, R> extends Observable<R> {
    public final Observable a;
    public final Function b;

    public static final class FlatMapStreamObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public final Observer a;
        public final Function b;
        public Disposable c;
        public volatile boolean d;
        public boolean e;

        public FlatMapStreamObserver(Observer observer, Function function) {
            this.a = observer;
            this.b = function;
        }

        public void dispose() {
            this.d = true;
            this.c.dispose();
        }

        public boolean isDisposed() {
            return this.d;
        }

        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.b(th);
            } else {
                this.e = true;
                this.a.onError(th);
            }
        }

        public final void onNext(Object obj) {
            if (this.e) {
                return;
            }
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null Stream");
                Stream stream = (Stream) objApply;
                try {
                    for (T t : stream) {
                        if (this.d) {
                            this.e = true;
                            break;
                        }
                        Objects.requireNonNull(t, "The Stream's Iterator.next returned a null value");
                        if (this.d) {
                            this.e = true;
                            break;
                        }
                        this.a.onNext(t);
                        if (this.d) {
                            this.e = true;
                            break;
                        }
                    }
                    stream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            stream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                Exceptions.a(th4);
                this.c.dispose();
                onError(th4);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMapStream(Observable observable, Function function) {
        this.a = observable;
        this.b = function;
    }

    public final void subscribeActual(Observer observer) {
        Stream stream;
        Supplier supplier = this.a;
        boolean z = supplier instanceof Supplier;
        Function function = this.b;
        if (!z) {
            supplier.subscribe(new FlatMapStreamObserver(observer, function));
            return;
        }
        try {
            Object obj = supplier.get();
            if (obj != null) {
                Object objApply = function.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null Stream");
                stream = (Stream) objApply;
            } else {
                stream = null;
            }
            if (stream != null) {
                ObservableFromStream.a(observer, stream);
            } else {
                EmptyDisposable.b(observer);
            }
        } catch (Throwable th) {
            Exceptions.a(th);
            EmptyDisposable.c(th, observer);
        }
    }
}
