package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.SimplePlainQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicLong;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableOnBackpressureBuffer<T> extends AbstractFlowableWithUpstream<T, T> {
    public final int c;
    public final boolean d;
    public final Action e;

    public static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        public final gnc1 a;
        public final SimplePlainQueue b;
        public final Action c;
        public pnc1 d;
        public volatile boolean e;
        public volatile boolean f;
        public Throwable g;
        public final AtomicLong h = new AtomicLong();
        public boolean i;

        public BackpressureBufferSubscriber(gnc1 gnc1Var, int i, boolean z, Action action) {
            this.a = gnc1Var;
            this.c = action;
            this.b = z ? new SpscLinkedArrayQueue(i) : new SpscArrayQueue(i);
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        public final int a(int i) {
            this.i = true;
            return 2;
        }

        public final boolean b(boolean z, boolean z2, gnc1 gnc1Var) {
            if (this.e) {
                this.b.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.g;
            if (th != null) {
                this.b.clear();
                gnc1Var.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            gnc1Var.onComplete();
            return true;
        }

        public final void c() {
            if (getAndIncrement() == 0) {
                SimplePlainQueue simplePlainQueue = this.b;
                gnc1 gnc1Var = this.a;
                int iAddAndGet = 1;
                while (!b(this.f, simplePlainQueue.isEmpty(), gnc1Var)) {
                    long j = this.h.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.f;
                        Object objPoll = simplePlainQueue.poll();
                        boolean z2 = objPoll == null;
                        if (b(z, z2, gnc1Var)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        gnc1Var.onNext(objPoll);
                        j2++;
                    }
                    if (j2 == j && b(this.f, simplePlainQueue.isEmpty(), gnc1Var)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.h.addAndGet(-j2);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p.pnc1
        public final void cancel() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.d.cancel();
            if (this.i || getAndIncrement() != 0) {
                return;
            }
            this.b.clear();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.b.clear();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.b.isEmpty();
        }

        @Override // p.gnc1
        public final void onComplete() {
            this.f = true;
            if (this.i) {
                this.a.onComplete();
            } else {
                c();
            }
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            this.g = th;
            this.f = true;
            if (this.i) {
                this.a.onError(th);
            } else {
                c();
            }
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (this.b.offer(obj)) {
                if (this.i) {
                    this.a.onNext(null);
                    return;
                } else {
                    c();
                    return;
                }
            }
            this.d.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.c.run();
            } catch (Throwable th) {
                Exceptions.a(th);
                missingBackpressureException.initCause(th);
            }
            onError(missingBackpressureException);
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.d, pnc1Var)) {
                this.d = pnc1Var;
                this.a.onSubscribe(this);
                pnc1Var.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            return this.b.poll();
        }

        @Override // p.pnc1
        public final void request(long j) {
            if (this.i || !SubscriptionHelper.e(j)) {
                return;
            }
            BackpressureHelper.a(this.h, j);
            c();
        }
    }

    public FlowableOnBackpressureBuffer(Flowable flowable, int i, Action action) {
        super(flowable);
        this.c = i;
        this.d = true;
        this.e = action;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        this.b.subscribe((FlowableSubscriber) new BackpressureBufferSubscriber(gnc1Var, this.c, this.d, this.e));
    }
}
