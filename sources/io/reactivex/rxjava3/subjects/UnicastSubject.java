package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class UnicastSubject<T> extends Subject<T> {
    public final SpscLinkedArrayQueue a;
    public final AtomicReference c;
    public volatile boolean e;
    public volatile boolean f;
    public Throwable g;
    public boolean t;
    public final boolean d = true;
    public final AtomicReference b = new AtomicReference();
    public final AtomicBoolean h = new AtomicBoolean();
    public final BasicIntQueueDisposable i = new UnicastQueueDisposable();

    public final class UnicastQueueDisposable extends BasicIntQueueDisposable<T> {
        public UnicastQueueDisposable() {
        }

        public final int a(int i) {
            UnicastSubject.this.t = true;
            return 2;
        }

        public final void clear() {
            UnicastSubject.this.a.clear();
        }

        public void dispose() {
            if (UnicastSubject.this.e) {
                return;
            }
            UnicastSubject.this.e = true;
            UnicastSubject.this.g();
            UnicastSubject.this.b.lazySet(null);
            if (UnicastSubject.this.i.getAndIncrement() == 0) {
                UnicastSubject.this.b.lazySet(null);
                UnicastSubject unicastSubject = UnicastSubject.this;
                if (unicastSubject.t) {
                    return;
                }
                unicastSubject.a.clear();
            }
        }

        public boolean isDisposed() {
            return UnicastSubject.this.e;
        }

        public final boolean isEmpty() {
            return UnicastSubject.this.a.isEmpty();
        }

        public final Object poll() {
            return UnicastSubject.this.a.poll();
        }
    }

    public UnicastSubject(int i, Runnable runnable) {
        this.a = new SpscLinkedArrayQueue(i);
        this.c = new AtomicReference(runnable);
    }

    public static UnicastSubject f(int i, Runnable runnable) {
        ObjectHelper.a(i, "capacityHint");
        Objects.requireNonNull(runnable, "onTerminate");
        return new UnicastSubject(i, runnable);
    }

    public final boolean a() {
        return this.b.get() != null;
    }

    public final void g() {
        AtomicReference atomicReference = this.c;
        Runnable runnable = (Runnable) atomicReference.get();
        if (runnable != null) {
            while (!atomicReference.compareAndSet(runnable, null)) {
                if (atomicReference.get() != runnable) {
                    return;
                }
            }
            runnable.run();
        }
    }

    public final void h() {
        Throwable th;
        if (this.i.getAndIncrement() != 0) {
            return;
        }
        Observer observer = (Observer) this.b.get();
        int iAddAndGet = 1;
        int iAddAndGet2 = 1;
        while (observer == null) {
            iAddAndGet2 = this.i.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                observer = (Observer) this.b.get();
            }
        }
        boolean z = this.t;
        SpscLinkedArrayQueue spscLinkedArrayQueue = this.a;
        boolean z2 = this.d;
        if (z) {
            while (!this.e) {
                boolean z3 = this.f;
                if (!z2 && z3 && (th = this.g) != null) {
                    this.b.lazySet(null);
                    spscLinkedArrayQueue.clear();
                    observer.onError(th);
                    return;
                }
                observer.onNext((Object) null);
                if (z3) {
                    this.b.lazySet(null);
                    Throwable th2 = this.g;
                    if (th2 != null) {
                        observer.onError(th2);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                iAddAndGet = this.i.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.b.lazySet(null);
            return;
        }
        boolean z4 = true;
        int iAddAndGet3 = 1;
        while (!this.e) {
            boolean z5 = this.f;
            Object objPoll = this.a.poll();
            boolean z6 = objPoll == null;
            if (z5) {
                if (!z2 && z4) {
                    Throwable th3 = this.g;
                    if (th3 != null) {
                        this.b.lazySet(null);
                        spscLinkedArrayQueue.clear();
                        observer.onError(th3);
                        return;
                    }
                    z4 = false;
                }
                if (z6) {
                    this.b.lazySet(null);
                    Throwable th4 = this.g;
                    if (th4 != null) {
                        observer.onError(th4);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
            }
            if (z6) {
                iAddAndGet3 = this.i.addAndGet(-iAddAndGet3);
                if (iAddAndGet3 == 0) {
                    return;
                }
            } else {
                observer.onNext(objPoll);
            }
        }
        this.b.lazySet(null);
        spscLinkedArrayQueue.clear();
    }

    public final void onComplete() {
        if (this.f || this.e) {
            return;
        }
        this.f = true;
        g();
        h();
    }

    public final void onError(Throwable th) {
        ExceptionHelper.c(th, "onError called with a null Throwable.");
        if (this.f || this.e) {
            RxJavaPlugins.b(th);
            return;
        }
        this.g = th;
        this.f = true;
        g();
        h();
    }

    public final void onNext(Object obj) {
        ExceptionHelper.c(obj, "onNext called with a null value.");
        if (this.f || this.e) {
            return;
        }
        this.a.offer(obj);
        h();
    }

    public final void onSubscribe(Disposable disposable) {
        if (this.f || this.e) {
            disposable.dispose();
        }
    }

    public final void subscribeActual(Observer observer) {
        if (this.h.get() || !this.h.compareAndSet(false, true)) {
            EmptyDisposable.c(new IllegalStateException("Only a single observer allowed."), observer);
            return;
        }
        observer.onSubscribe(this.i);
        this.b.lazySet(observer);
        if (this.e) {
            this.b.lazySet(null);
        } else {
            h();
        }
    }
}
