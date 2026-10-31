package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableZip<T, R> extends Observable<R> {
    public final ObservableSource[] a;
    public final Iterable b;
    public final Function c;
    public final int d;
    public final boolean e;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        public final Observer a;
        public final Function b;
        public final ZipObserver[] c;
        public final Object[] d;
        public final boolean e;
        public volatile boolean f;

        public ZipCoordinator(Observer observer, Function function, int i, boolean z) {
            this.a = observer;
            this.b = function;
            this.c = new ZipObserver[i];
            this.d = new Object[i];
            this.e = z;
        }

        public final void a() {
            ZipObserver[] zipObserverArr = this.c;
            for (ZipObserver zipObserver : zipObserverArr) {
                zipObserver.b.clear();
            }
            for (ZipObserver zipObserver2 : zipObserverArr) {
                DisposableHelper.a(zipObserver2.e);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            ZipObserver[] zipObserverArr = this.c;
            Observer observer = this.a;
            Object[] objArr = this.d;
            boolean z = this.e;
            int iAddAndGet = 1;
            while (true) {
                int i = 0;
                int i2 = 0;
                for (ZipObserver zipObserver : zipObserverArr) {
                    if (objArr[i2] == null) {
                        boolean z2 = zipObserver.c;
                        Object objPoll = zipObserver.b.poll();
                        boolean z3 = objPoll == null;
                        if (this.f) {
                            a();
                            return;
                        }
                        if (z2) {
                            if (!z) {
                                Throwable th2 = zipObserver.d;
                                if (th2 != null) {
                                    this.f = true;
                                    a();
                                    observer.onError(th2);
                                    return;
                                } else if (z3) {
                                    this.f = true;
                                    a();
                                    observer.onComplete();
                                    return;
                                }
                            } else if (z3) {
                                Throwable th3 = zipObserver.d;
                                this.f = true;
                                a();
                                if (th3 != null) {
                                    observer.onError(th3);
                                    return;
                                } else {
                                    observer.onComplete();
                                    return;
                                }
                            }
                        }
                        if (z3) {
                            i++;
                        } else {
                            objArr[i2] = objPoll;
                        }
                    } else if (zipObserver.c && !z && (th = zipObserver.d) != null) {
                        this.f = true;
                        a();
                        observer.onError(th);
                        return;
                    }
                    i2++;
                }
                if (i != 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        Object objApply = this.b.apply(objArr.clone());
                        Objects.requireNonNull(objApply, "The zipper returned a null value");
                        observer.onNext(objApply);
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th4) {
                        Exceptions.a(th4);
                        a();
                        observer.onError(th4);
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.f) {
                return;
            }
            this.f = true;
            for (ZipObserver zipObserver : this.c) {
                DisposableHelper.a(zipObserver.e);
            }
            if (getAndIncrement() == 0) {
                for (ZipObserver zipObserver2 : this.c) {
                    zipObserver2.b.clear();
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f;
        }

        public void subscribe(ObservableSource<? extends T>[] observableSourceArr, int i) {
            ZipObserver[] zipObserverArr = this.c;
            int length = zipObserverArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                zipObserverArr[i2] = new ZipObserver(this, i);
            }
            lazySet(0);
            this.a.onSubscribe(this);
            for (int i3 = 0; i3 < length && !this.f; i3++) {
                observableSourceArr[i3].subscribe(zipObserverArr[i3]);
            }
        }
    }

    public static final class ZipObserver<T, R> implements Observer<T> {
        public final ZipCoordinator a;
        public final SpscLinkedArrayQueue b;
        public volatile boolean c;
        public Throwable d;
        public final AtomicReference e = new AtomicReference();

        public ZipObserver(ZipCoordinator zipCoordinator, int i) {
            this.a = zipCoordinator;
            this.b = new SpscLinkedArrayQueue(i);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.c = true;
            this.a.b();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.d = th;
            this.c = true;
            this.a.b();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.b.offer(obj);
            this.a.b();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this.e, disposable);
        }
    }

    public ObservableZip(ObservableSource[] observableSourceArr, Iterable iterable, Function function, int i, boolean z) {
        this.a = observableSourceArr;
        this.b = iterable;
        this.c = function;
        this.d = i;
        this.e = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        int length;
        ObservableSource<? extends T>[] observableSourceArr = this.a;
        if (observableSourceArr == null) {
            observableSourceArr = new ObservableSource[8];
            length = 0;
            for (ObservableSource<? extends T> observableSource : this.b) {
                if (length == observableSourceArr.length) {
                    ObservableSource<? extends T>[] observableSourceArr2 = new ObservableSource[(length >> 2) + length];
                    System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                    observableSourceArr = observableSourceArr2;
                }
                observableSourceArr[length] = observableSource;
                length++;
            }
        } else {
            length = observableSourceArr.length;
        }
        if (length == 0) {
            EmptyDisposable.b(observer);
        } else {
            new ZipCoordinator(observer, this.c, length, this.e).subscribe(observableSourceArr, this.d);
        }
    }
}
