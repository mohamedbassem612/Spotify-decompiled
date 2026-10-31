package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.BackpressureOverflowStrategy;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p.gnc1;
import p.pnc1;
import p.ps4;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableOnBackpressureBufferStrategy<T> extends AbstractFlowableWithUpstream<T, T> {
    public final byte c;
    public final Action d;
    public final BackpressureOverflowStrategy e;

    public static final class OnBackpressureBufferStrategySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, pnc1 {
        public final gnc1 a;
        public final Action b;
        public final BackpressureOverflowStrategy c;
        public final byte d;
        public final AtomicLong e = new AtomicLong();
        public final ArrayDeque f = new ArrayDeque();
        public pnc1 g;
        public volatile boolean h;
        public volatile boolean i;
        public Throwable t;

        /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
        public OnBackpressureBufferStrategySubscriber(gnc1 gnc1Var, Action action, BackpressureOverflowStrategy backpressureOverflowStrategy, long j) {
            this.a = gnc1Var;
            this.b = action;
            this.c = backpressureOverflowStrategy;
            this.d = (int) j;
        }

        public static void a(ArrayDeque arrayDeque) {
            synchronized (arrayDeque) {
                arrayDeque.clear();
            }
        }

        public final void b() {
            boolean zIsEmpty;
            Object objPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            ArrayDeque arrayDeque = this.f;
            gnc1 gnc1Var = this.a;
            int iAddAndGet = 1;
            do {
                long j = this.e.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.h) {
                        a(arrayDeque);
                        return;
                    }
                    boolean z = this.i;
                    synchronized (arrayDeque) {
                        objPoll = arrayDeque.poll();
                    }
                    boolean z2 = objPoll == null;
                    if (z) {
                        Throwable th = this.t;
                        if (th != null) {
                            a(arrayDeque);
                            gnc1Var.onError(th);
                            return;
                        } else if (z2) {
                            gnc1Var.onComplete();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    gnc1Var.onNext(objPoll);
                    j2++;
                }
                if (j2 == j) {
                    if (this.h) {
                        a(arrayDeque);
                        return;
                    }
                    boolean z3 = this.i;
                    synchronized (arrayDeque) {
                        zIsEmpty = arrayDeque.isEmpty();
                    }
                    if (z3) {
                        Throwable th2 = this.t;
                        if (th2 != null) {
                            a(arrayDeque);
                            gnc1Var.onError(th2);
                            return;
                        } else if (zIsEmpty) {
                            gnc1Var.onComplete();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.e(this.e, j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p.pnc1
        public final void cancel() {
            this.h = true;
            this.g.cancel();
            if (getAndIncrement() == 0) {
                a(this.f);
            }
        }

        @Override // p.gnc1
        public final void onComplete() {
            this.i = true;
            b();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            if (this.i) {
                RxJavaPlugins.b(th);
                return;
            }
            this.t = th;
            this.i = true;
            b();
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            boolean z;
            boolean z2;
            if (this.i) {
                return;
            }
            ArrayDeque arrayDeque = this.f;
            synchronized (arrayDeque) {
                try {
                    z = false;
                    if (arrayDeque.size() == this.d) {
                        int iOrdinal = this.c.ordinal();
                        z2 = true;
                        if (iOrdinal == 1) {
                            arrayDeque.poll();
                            arrayDeque.offer(obj);
                        } else if (iOrdinal == 2) {
                            arrayDeque.pollLast();
                            arrayDeque.offer(obj);
                        }
                        z2 = false;
                        z = true;
                    } else {
                        arrayDeque.offer(obj);
                        z2 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z) {
                if (!z2) {
                    b();
                    return;
                } else {
                    this.g.cancel();
                    onError(new MissingBackpressureException());
                    return;
                }
            }
            Action action = this.b;
            if (action != null) {
                try {
                    action.run();
                } catch (Throwable th2) {
                    Exceptions.a(th2);
                    this.g.cancel();
                    onError(th2);
                }
            }
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.g, pnc1Var)) {
                this.g = pnc1Var;
                this.a.onSubscribe(this);
                pnc1Var.request(Long.MAX_VALUE);
            }
        }

        @Override // p.pnc1
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.a(this.e, j);
                b();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowableOnBackpressureBufferStrategy(FlowableCombineLatest flowableCombineLatest) {
        super(flowableCombineLatest);
        ps4 ps4Var = ps4.b;
        this.c = (byte) 10;
        this.d = ps4Var;
        this.e = BackpressureOverflowStrategy.a;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        this.b.subscribe((FlowableSubscriber) new OnBackpressureBufferStrategySubscriber(gnc1Var, this.d, this.e, this.c));
    }
}
