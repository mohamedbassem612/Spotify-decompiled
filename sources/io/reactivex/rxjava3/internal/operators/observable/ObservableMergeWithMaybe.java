package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableMergeWithMaybe<T> extends AbstractObservableWithUpstream<T, T> {
    public final MaybeSource b;

    public static final class MergeWithObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        public final Observer a;
        public final AtomicReference b = new AtomicReference();
        public final OtherObserver c = new OtherObserver(this);
        public final AtomicThrowable d = new AtomicThrowable();
        public volatile SpscLinkedArrayQueue e;
        public Object f;
        public volatile boolean g;
        public volatile boolean h;
        public volatile byte i;

        public static final class OtherObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
            public final MergeWithObserver a;

            public OtherObserver(MergeWithObserver mergeWithObserver) {
                this.a = mergeWithObserver;
            }

            public final void onComplete() {
                MergeWithObserver mergeWithObserver = this.a;
                mergeWithObserver.i = (byte) 2;
                if (mergeWithObserver.getAndIncrement() == 0) {
                    mergeWithObserver.a();
                }
            }

            public final void onError(Throwable th) {
                MergeWithObserver mergeWithObserver = this.a;
                if (mergeWithObserver.d.a(th)) {
                    DisposableHelper.a(mergeWithObserver.b);
                    if (mergeWithObserver.getAndIncrement() == 0) {
                        mergeWithObserver.a();
                    }
                }
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.g(this, disposable);
            }

            public final void onSuccess(Object obj) {
                MergeWithObserver mergeWithObserver = this.a;
                if (mergeWithObserver.compareAndSet(0, 1)) {
                    mergeWithObserver.a.onNext(obj);
                    mergeWithObserver.i = (byte) 2;
                } else {
                    mergeWithObserver.f = obj;
                    mergeWithObserver.i = (byte) 1;
                    if (mergeWithObserver.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeWithObserver.a();
            }
        }

        public MergeWithObserver(Observer observer) {
            this.a = observer;
        }

        public final void a() {
            Observer observer = this.a;
            int iAddAndGet = 1;
            while (!this.g) {
                if (this.d.get() != null) {
                    this.f = null;
                    this.e = null;
                    this.d.d(observer);
                    return;
                }
                byte b = this.i;
                if (b == 1) {
                    Object obj = this.f;
                    this.f = null;
                    this.i = (byte) 2;
                    observer.onNext(obj);
                    b = 2;
                }
                boolean z = this.h;
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.e;
                Object objPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                boolean z2 = objPoll == null;
                if (z && z2 && b == 2) {
                    this.e = null;
                    observer.onComplete();
                    return;
                } else if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    observer.onNext(objPoll);
                }
            }
            this.f = null;
            this.e = null;
        }

        public void dispose() {
            this.g = true;
            DisposableHelper.a(this.b);
            DisposableHelper.a(this.c);
            this.d.b();
            if (getAndIncrement() == 0) {
                this.e = null;
                this.f = null;
            }
        }

        public boolean isDisposed() {
            return DisposableHelper.b((Disposable) this.b.get());
        }

        public final void onComplete() {
            this.h = true;
            if (getAndIncrement() == 0) {
                a();
            }
        }

        public final void onError(Throwable th) {
            if (this.d.a(th)) {
                DisposableHelper.a(this.c);
                if (getAndIncrement() == 0) {
                    a();
                }
            }
        }

        public final void onNext(Object obj) {
            if (compareAndSet(0, 1)) {
                this.a.onNext(obj);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.e;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(Observable.bufferSize());
                    this.e = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(obj);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            a();
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this.b, disposable);
        }
    }

    public ObservableMergeWithMaybe(Observable observable, MaybeSource maybeSource) {
        super(observable);
        this.b = maybeSource;
    }

    public final void subscribeActual(Observer observer) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(observer);
        observer.onSubscribe(mergeWithObserver);
        ((AbstractObservableWithUpstream) this).a.subscribe(mergeWithObserver);
        this.b.subscribe(mergeWithObserver.c);
    }
}
