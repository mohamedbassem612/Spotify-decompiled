package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p.i3a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class BehaviorSubject<T> extends Subject<T> {
    public static final BehaviorDisposable[] g = new BehaviorDisposable[0];
    public static final BehaviorDisposable[] h = new BehaviorDisposable[0];
    public final AtomicReference a;
    public final AtomicReference b;
    public final Lock c;
    public final Lock d;
    public final AtomicReference e;
    public long f;

    public static final class BehaviorDisposable<T> implements Disposable, AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {
        public final Observer a;
        public final BehaviorSubject b;
        public boolean c;
        public boolean d;
        public AppendOnlyLinkedArrayList e;
        public boolean f;
        public volatile boolean g;
        public long h;

        public BehaviorDisposable(Observer observer, BehaviorSubject behaviorSubject) {
            this.a = observer;
            this.b = behaviorSubject;
        }

        public final void a(long j, Object obj) {
            if (this.g) {
                return;
            }
            if (!this.f) {
                synchronized (this) {
                    try {
                        if (this.g) {
                            return;
                        }
                        if (this.h == j) {
                            return;
                        }
                        if (this.d) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.e;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                                this.e = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.b(obj);
                            return;
                        }
                        this.c = true;
                        this.f = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(obj);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.g) {
                return;
            }
            this.g = true;
            this.b.i(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.g;
        }

        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            return this.g || NotificationLite.a(this.a, obj);
        }
    }

    public BehaviorSubject(Object obj) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock.readLock();
        this.d = reentrantReadWriteLock.writeLock();
        this.b = new AtomicReference(g);
        this.a = new AtomicReference(obj);
        this.e = new AtomicReference();
    }

    public static BehaviorSubject f() {
        return new BehaviorSubject(null);
    }

    public static BehaviorSubject g(Object obj) {
        Objects.requireNonNull(obj, "defaultValue is null");
        return new BehaviorSubject(obj);
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    public final boolean a() {
        return ((BehaviorDisposable[]) this.b.get()).length != 0;
    }

    public final Object h() {
        Object obj = this.a.get();
        if (NotificationLite.g(obj) || NotificationLite.h(obj)) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(BehaviorDisposable behaviorDisposable) {
        BehaviorDisposable[] behaviorDisposableArr;
        while (true) {
            AtomicReference atomicReference = this.b;
            BehaviorDisposable[] behaviorDisposableArr2 = (BehaviorDisposable[]) atomicReference.get();
            int length = behaviorDisposableArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (behaviorDisposableArr2[i] == behaviorDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                behaviorDisposableArr = g;
            } else {
                BehaviorDisposable[] behaviorDisposableArr3 = new BehaviorDisposable[length - 1];
                System.arraycopy(behaviorDisposableArr2, 0, behaviorDisposableArr3, 0, i);
                System.arraycopy(behaviorDisposableArr2, i + 1, behaviorDisposableArr3, i, (length - i) - 1);
                behaviorDisposableArr = behaviorDisposableArr3;
            }
            while (!atomicReference.compareAndSet(behaviorDisposableArr2, behaviorDisposableArr)) {
                if (atomicReference.get() != behaviorDisposableArr2) {
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        if (i3a.o(this.e, ExceptionHelper.a)) {
            Lock lock = this.d;
            lock.lock();
            this.f++;
            AtomicReference atomicReference = this.a;
            NotificationLite notificationLite = NotificationLite.a;
            atomicReference.lazySet(notificationLite);
            lock.unlock();
            for (BehaviorDisposable behaviorDisposable : (BehaviorDisposable[]) this.b.getAndSet(h)) {
                behaviorDisposable.a(this.f, notificationLite);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        ExceptionHelper.c(th, "onError called with a null Throwable.");
        if (!i3a.q(this.e, th)) {
            RxJavaPlugins.b(th);
            return;
        }
        Object objE = NotificationLite.e(th);
        Lock lock = this.d;
        lock.lock();
        this.f++;
        this.a.lazySet(objE);
        lock.unlock();
        for (BehaviorDisposable behaviorDisposable : (BehaviorDisposable[]) this.b.getAndSet(h)) {
            behaviorDisposable.a(this.f, objE);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        ExceptionHelper.c(obj, "onNext called with a null value.");
        if (this.e.get() != null) {
            return;
        }
        Lock lock = this.d;
        lock.lock();
        this.f++;
        this.a.lazySet(obj);
        lock.unlock();
        for (BehaviorDisposable behaviorDisposable : (BehaviorDisposable[]) this.b.get()) {
            behaviorDisposable.a(this.f, obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        if (this.e.get() != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        BehaviorDisposable[] behaviorDisposableArr;
        BehaviorDisposable[] behaviorDisposableArr2;
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        BehaviorDisposable behaviorDisposable = new BehaviorDisposable(observer, this);
        observer.onSubscribe(behaviorDisposable);
        AtomicReference atomicReference = this.b;
        do {
            behaviorDisposableArr = (BehaviorDisposable[]) atomicReference.get();
            if (behaviorDisposableArr == h) {
                Throwable th = (Throwable) this.e.get();
                if (th == ExceptionHelper.a) {
                    observer.onComplete();
                    return;
                } else {
                    observer.onError(th);
                    return;
                }
            }
            int length = behaviorDisposableArr.length;
            behaviorDisposableArr2 = new BehaviorDisposable[length + 1];
            System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr2, 0, length);
            behaviorDisposableArr2[length] = behaviorDisposable;
        } while (!i3a.p(atomicReference, behaviorDisposableArr, behaviorDisposableArr2));
        if (behaviorDisposable.g) {
            i(behaviorDisposable);
            return;
        }
        if (behaviorDisposable.g) {
            return;
        }
        synchronized (behaviorDisposable) {
            try {
                if (behaviorDisposable.g) {
                    return;
                }
                if (behaviorDisposable.c) {
                    return;
                }
                BehaviorSubject behaviorSubject = behaviorDisposable.b;
                Lock lock = behaviorSubject.c;
                lock.lock();
                behaviorDisposable.h = behaviorSubject.f;
                Object obj = behaviorSubject.a.get();
                lock.unlock();
                behaviorDisposable.d = obj != null;
                behaviorDisposable.c = true;
                if (obj == null || behaviorDisposable.test(obj)) {
                    return;
                }
                while (!behaviorDisposable.g) {
                    synchronized (behaviorDisposable) {
                        try {
                            appendOnlyLinkedArrayList = behaviorDisposable.e;
                            if (appendOnlyLinkedArrayList == null) {
                                behaviorDisposable.d = false;
                                return;
                            }
                            behaviorDisposable.e = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    appendOnlyLinkedArrayList.c(behaviorDisposable);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
