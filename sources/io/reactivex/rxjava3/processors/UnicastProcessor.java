package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class UnicastProcessor<T> extends FlowableProcessor<T> {
    public boolean Y;
    public final SpscLinkedArrayQueue b;
    public volatile boolean e;
    public Throwable f;
    public volatile boolean h;
    public final AtomicReference c = new AtomicReference(null);
    public final boolean d = true;
    public final AtomicReference g = new AtomicReference();
    public final AtomicBoolean i = new AtomicBoolean();
    public final BasicIntQueueSubscription t = new UnicastQueueSubscription();
    public final AtomicLong X = new AtomicLong();

    public final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        public UnicastQueueSubscription() {
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        public final int a(int i) {
            UnicastProcessor.this.Y = true;
            return 2;
        }

        @Override // p.pnc1
        public final void cancel() {
            if (UnicastProcessor.this.h) {
                return;
            }
            UnicastProcessor.this.h = true;
            Runnable runnable = (Runnable) UnicastProcessor.this.c.getAndSet(null);
            if (runnable != null) {
                runnable.run();
            }
            UnicastProcessor.this.g.lazySet(null);
            if (UnicastProcessor.this.t.getAndIncrement() == 0) {
                UnicastProcessor.this.g.lazySet(null);
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                if (unicastProcessor.Y) {
                    return;
                }
                unicastProcessor.b.clear();
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            UnicastProcessor.this.b.clear();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return UnicastProcessor.this.b.isEmpty();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            return UnicastProcessor.this.b.poll();
        }

        @Override // p.pnc1
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                BackpressureHelper.a(unicastProcessor.X, j);
                unicastProcessor.f0();
            }
        }
    }

    public UnicastProcessor(int i) {
        this.b = new SpscLinkedArrayQueue(i);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        if (this.i.get() || !this.i.compareAndSet(false, true)) {
            IllegalStateException illegalStateException = new IllegalStateException("This processor allows only a single Subscriber");
            gnc1Var.onSubscribe(EmptySubscription.a);
            gnc1Var.onError(illegalStateException);
        } else {
            gnc1Var.onSubscribe(this.t);
            this.g.set(gnc1Var);
            if (this.h) {
                this.g.lazySet(null);
            } else {
                f0();
            }
        }
    }

    public final boolean e0(boolean z, boolean z2, boolean z3, gnc1 gnc1Var, SpscLinkedArrayQueue spscLinkedArrayQueue) {
        if (this.h) {
            spscLinkedArrayQueue.clear();
            this.g.lazySet(null);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (z && this.f != null) {
            spscLinkedArrayQueue.clear();
            this.g.lazySet(null);
            gnc1Var.onError(this.f);
            return true;
        }
        if (!z3) {
            return false;
        }
        Throwable th = this.f;
        this.g.lazySet(null);
        if (th != null) {
            gnc1Var.onError(th);
            return true;
        }
        gnc1Var.onComplete();
        return true;
    }

    public final void f0() {
        if (this.t.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        gnc1 gnc1Var = (gnc1) this.g.get();
        int iAddAndGet2 = 1;
        while (gnc1Var == null) {
            iAddAndGet2 = this.t.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                gnc1Var = (gnc1) this.g.get();
            }
        }
        boolean z = this.Y;
        SpscLinkedArrayQueue spscLinkedArrayQueue = this.b;
        boolean z2 = this.d;
        if (z) {
            while (!this.h) {
                boolean z3 = this.e;
                if (!z2 && z3 && this.f != null) {
                    spscLinkedArrayQueue.clear();
                    this.g.lazySet(null);
                    gnc1Var.onError(this.f);
                    return;
                }
                gnc1Var.onNext(null);
                if (z3) {
                    this.g.lazySet(null);
                    Throwable th = this.f;
                    if (th != null) {
                        gnc1Var.onError(th);
                        return;
                    } else {
                        gnc1Var.onComplete();
                        return;
                    }
                }
                iAddAndGet = this.t.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.g.lazySet(null);
            return;
        }
        boolean z4 = !z2;
        int iAddAndGet3 = 1;
        while (true) {
            long j = this.X.get();
            long j2 = 0;
            while (j != j2) {
                boolean z5 = this.e;
                Object objPoll = spscLinkedArrayQueue.poll();
                boolean z6 = objPoll == null;
                if (e0(z4, z5, z6, gnc1Var, spscLinkedArrayQueue)) {
                    return;
                }
                if (z6) {
                    break;
                }
                gnc1Var.onNext(objPoll);
                j2++;
            }
            if (j == j2 && e0(z4, this.e, spscLinkedArrayQueue.isEmpty(), gnc1Var, spscLinkedArrayQueue)) {
                return;
            }
            if (j2 != 0 && j != Long.MAX_VALUE) {
                this.X.addAndGet(-j2);
            }
            iAddAndGet3 = this.t.addAndGet(-iAddAndGet3);
            if (iAddAndGet3 == 0) {
                return;
            } else {
                z4 = z4;
            }
        }
    }

    @Override // p.gnc1
    public final void onComplete() {
        if (this.e || this.h) {
            return;
        }
        this.e = true;
        Runnable runnable = (Runnable) this.c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        f0();
    }

    @Override // p.gnc1
    public final void onError(Throwable th) {
        ExceptionHelper.c(th, "onError called with a null Throwable.");
        if (this.e || this.h) {
            RxJavaPlugins.b(th);
            return;
        }
        this.f = th;
        this.e = true;
        Runnable runnable = (Runnable) this.c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        f0();
    }

    @Override // p.gnc1
    public final void onNext(Object obj) {
        ExceptionHelper.c(obj, "onNext called with a null value.");
        if (this.e || this.h) {
            return;
        }
        this.b.offer(obj);
        f0();
    }

    @Override // p.gnc1
    public final void onSubscribe(pnc1 pnc1Var) {
        if (this.e || this.h) {
            pnc1Var.cancel();
        } else {
            pnc1Var.request(Long.MAX_VALUE);
        }
    }
}
