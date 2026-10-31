package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableCache<T> extends AbstractObservableWithUpstream<T, T> implements Observer<T> {
    public static final CacheDisposable[] X = new CacheDisposable[0];
    public static final CacheDisposable[] Y = new CacheDisposable[0];
    public final AtomicBoolean b;
    public final int c;
    public final AtomicReference d;
    public volatile long e;
    public final Node f;
    public Node g;
    public int h;
    public Throwable i;
    public volatile boolean t;

    public static final class CacheDisposable<T> extends AtomicInteger implements Disposable {
        public final Observer a;
        public final ObservableCache b;
        public Node c;
        public int d;
        public long e;
        public volatile boolean f;

        public CacheDisposable(Observer observer, ObservableCache observableCache) {
            this.a = observer;
            this.b = observableCache;
            this.c = observableCache.f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void dispose() {
            CacheDisposable[] cacheDisposableArr;
            if (this.f) {
                return;
            }
            this.f = true;
            AtomicReference atomicReference = this.b.d;
            while (true) {
                CacheDisposable<T>[] cacheDisposableArr2 = (CacheDisposable[]) atomicReference.get();
                int length = cacheDisposableArr2.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (cacheDisposableArr2[i] == this) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    cacheDisposableArr = ObservableCache.X;
                } else {
                    CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                    System.arraycopy(cacheDisposableArr2, 0, cacheDisposableArr3, 0, i);
                    System.arraycopy(cacheDisposableArr2, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                    cacheDisposableArr = cacheDisposableArr3;
                }
                while (!atomicReference.compareAndSet(cacheDisposableArr2, cacheDisposableArr)) {
                    if (atomicReference.get() != cacheDisposableArr2) {
                    }
                }
                return;
            }
        }

        public boolean isDisposed() {
            return this.f;
        }
    }

    public static final class Node<T> {
        public final Object[] a;
        public volatile Node b;

        public Node(int i) {
            this.a = new Object[i];
        }
    }

    public ObservableCache(Observable observable, int i) {
        super(observable);
        this.c = i;
        this.b = new AtomicBoolean();
        Node node = new Node(i);
        this.f = node;
        this.g = node;
        this.d = new AtomicReference(X);
    }

    public final void a(CacheDisposable cacheDisposable) {
        if (cacheDisposable.getAndIncrement() != 0) {
            return;
        }
        long j = cacheDisposable.e;
        int i = cacheDisposable.d;
        Node node = cacheDisposable.c;
        Observer observer = cacheDisposable.a;
        int i2 = this.c;
        int iAddAndGet = 1;
        while (!cacheDisposable.f) {
            boolean z = this.t;
            boolean z2 = this.e == j;
            if (z && z2) {
                cacheDisposable.c = null;
                Throwable th = this.i;
                if (th != null) {
                    observer.onError(th);
                    return;
                } else {
                    observer.onComplete();
                    return;
                }
            }
            if (z2) {
                cacheDisposable.e = j;
                cacheDisposable.d = i;
                cacheDisposable.c = node;
                iAddAndGet = cacheDisposable.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                if (i == i2) {
                    node = node.b;
                    i = 0;
                }
                observer.onNext(node.a[i]);
                i++;
                j++;
            }
        }
        cacheDisposable.c = null;
    }

    public final void onComplete() {
        this.t = true;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.d.getAndSet(Y)) {
            a(cacheDisposable);
        }
    }

    public final void onError(Throwable th) {
        this.i = th;
        this.t = true;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.d.getAndSet(Y)) {
            a(cacheDisposable);
        }
    }

    public final void onNext(Object obj) {
        int i = this.h;
        if (i == this.c) {
            Node node = new Node(i);
            node.a[0] = obj;
            this.h = 1;
            this.g.b = node;
            this.g = node;
        } else {
            this.g.a[i] = obj;
            this.h = i + 1;
        }
        this.e++;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.d.get()) {
            a(cacheDisposable);
        }
    }

    public final void onSubscribe(Disposable disposable) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void subscribeActual(Observer observer) {
        CacheDisposable cacheDisposable = new CacheDisposable(observer, this);
        observer.onSubscribe(cacheDisposable);
        loop0: while (true) {
            AtomicReference atomicReference = this.d;
            CacheDisposable[] cacheDisposableArr = (CacheDisposable[]) atomicReference.get();
            if (cacheDisposableArr == Y) {
                break;
            }
            int length = cacheDisposableArr.length;
            CacheDisposable[] cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
            do {
                if (atomicReference.compareAndSet(cacheDisposableArr, cacheDisposableArr2)) {
                    break loop0;
                }
            } while (atomicReference.get() == cacheDisposableArr);
        }
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            a(cacheDisposable);
        } else {
            ((AbstractObservableWithUpstream) this).a.subscribe(this);
        }
    }
}
