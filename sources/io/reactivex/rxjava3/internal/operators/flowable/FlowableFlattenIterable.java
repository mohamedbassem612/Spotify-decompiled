package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.f4s0;
import p.gnc1;
import p.jma;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableFlattenIterable<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final jma c;
    public final byte d;

    public static final class FlattenIterableSubscriber<T, R> extends BasicIntQueueSubscription<R> implements FlowableSubscriber<T> {
        public Iterator X;
        public int Y;
        public int Z;
        public final gnc1 a;
        public final Function b;
        public final int c;
        public final int d;
        public pnc1 f;
        public SimpleQueue g;
        public volatile boolean h;
        public volatile boolean i;
        public final AtomicReference t = new AtomicReference();
        public final AtomicLong e = new AtomicLong();

        public FlattenIterableSubscriber(gnc1 gnc1Var, Function function, int i) {
            this.a = gnc1Var;
            this.b = function;
            this.c = i;
            this.d = i - (i >> 2);
        }

        public final int a(int i) {
            return this.Z == 1 ? 1 : 0;
        }

        public final boolean b(boolean z, boolean z2, gnc1 gnc1Var, SimpleQueue simpleQueue) {
            if (this.i) {
                this.X = null;
                simpleQueue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (((Throwable) this.t.get()) == null) {
                if (!z2) {
                    return false;
                }
                gnc1Var.onComplete();
                return true;
            }
            Throwable thD = ExceptionHelper.d(this.t);
            this.X = null;
            simpleQueue.clear();
            gnc1Var.onError(thD);
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void c() {
            int i;
            if (getAndIncrement() != 0) {
                return;
            }
            gnc1 gnc1Var = this.a;
            SimpleQueue simpleQueue = this.g;
            boolean z = false;
            int i2 = 1;
            Object[] objArr = this.Z != 1;
            Iterator<T> it = this.X;
            int iAddAndGet = 1;
            while (true) {
                if (it == null) {
                    boolean z2 = this.h;
                    try {
                        Object objPoll = simpleQueue.poll();
                        if (b(z2, objPoll == null ? i2 : z ? 1 : 0, gnc1Var, simpleQueue)) {
                            return;
                        }
                        if (objPoll != null) {
                            try {
                                it = ((Iterable) this.b.apply(objPoll)).iterator();
                                if (it.hasNext()) {
                                    this.X = it;
                                } else {
                                    if (objArr != false) {
                                        int i3 = this.Y + i2;
                                        if (i3 == this.d) {
                                            this.Y = z ? 1 : 0;
                                            this.f.request(i3);
                                        } else {
                                            this.Y = i3;
                                        }
                                    }
                                    it = null;
                                }
                            } catch (Throwable th) {
                                Exceptions.a(th);
                                this.f.cancel();
                                ExceptionHelper.a(this.t, th);
                                gnc1Var.onError(ExceptionHelper.d(this.t));
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.a(th2);
                        this.f.cancel();
                        ExceptionHelper.a(this.t, th2);
                        Throwable thD = ExceptionHelper.d(this.t);
                        this.X = null;
                        simpleQueue.clear();
                        gnc1Var.onError(thD);
                        return;
                    }
                }
                if (it != null) {
                    long j = this.e.get();
                    long j2 = 0;
                    while (true) {
                        if (j2 == j) {
                            i = i2;
                            break;
                        }
                        if (b(this.h, z, gnc1Var, simpleQueue)) {
                            return;
                        }
                        try {
                            T next = it.next();
                            i = i2;
                            Objects.requireNonNull(next, "The iterator returned a null value");
                            gnc1Var.onNext(next);
                            if (b(this.h, z, gnc1Var, simpleQueue)) {
                                return;
                            }
                            j2++;
                            try {
                                if (!it.hasNext()) {
                                    if (objArr != false) {
                                        int i4 = this.Y + 1;
                                        if (i4 == this.d) {
                                            this.Y = z ? 1 : 0;
                                            this.f.request(i4);
                                        } else {
                                            this.Y = i4;
                                        }
                                    }
                                    this.X = null;
                                    it = null;
                                    break;
                                }
                                i2 = i;
                            } catch (Throwable th3) {
                                Exceptions.a(th3);
                                this.X = null;
                                this.f.cancel();
                                ExceptionHelper.a(this.t, th3);
                                gnc1Var.onError(ExceptionHelper.d(this.t));
                                return;
                            }
                        } catch (Throwable th4) {
                            Exceptions.a(th4);
                            this.X = null;
                            this.f.cancel();
                            ExceptionHelper.a(this.t, th4);
                            gnc1Var.onError(ExceptionHelper.d(this.t));
                            return;
                        }
                    }
                    if (j2 == j) {
                        if (b(this.h, (simpleQueue.isEmpty() && it == null) ? i : 0, gnc1Var, simpleQueue)) {
                            return;
                        }
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.e.addAndGet(-j2);
                    }
                    if (it != null) {
                    }
                    i2 = i;
                    z = false;
                } else {
                    i = i2;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                i2 = i;
                z = false;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void cancel() {
            if (this.i) {
                return;
            }
            this.i = true;
            this.f.cancel();
            if (getAndIncrement() == 0) {
                this.g.clear();
            }
        }

        public final void clear() {
            this.X = null;
            this.g.clear();
        }

        public final boolean isEmpty() {
            return this.X == null && this.g.isEmpty();
        }

        public final void onComplete() {
            if (this.h) {
                return;
            }
            this.h = true;
            c();
        }

        public final void onError(Throwable th) {
            if (this.h || !ExceptionHelper.a(this.t, th)) {
                RxJavaPlugins.b(th);
            } else {
                this.h = true;
                c();
            }
        }

        public final void onNext(Object obj) {
            if (this.h) {
                return;
            }
            if (this.Z != 0 || this.g.offer(obj)) {
                c();
            } else {
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.f, pnc1Var)) {
                this.f = pnc1Var;
                if (pnc1Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) pnc1Var;
                    int iA = queueSubscription.a(3);
                    if (iA == 1) {
                        this.Z = iA;
                        this.g = queueSubscription;
                        this.h = true;
                        this.a.onSubscribe(this);
                        return;
                    }
                    if (iA == 2) {
                        this.Z = iA;
                        this.g = queueSubscription;
                        this.a.onSubscribe(this);
                        pnc1Var.request(this.c);
                        return;
                    }
                }
                this.g = new SpscArrayQueue(this.c);
                this.a.onSubscribe(this);
                pnc1Var.request(this.c);
            }
        }

        public final Object poll() {
            Iterator<T> it = this.X;
            while (it == null) {
                Object objPoll = this.g.poll();
                if (objPoll != null) {
                    it = ((Iterable) this.b.apply(objPoll)).iterator();
                    if (it.hasNext()) {
                        this.X = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            }
            T next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.X = null;
            }
            return next;
        }

        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.a(this.e, j);
                c();
            }
        }
    }

    public FlowableFlattenIterable(FlowableScanSeed flowableScanSeed, jma jmaVar) {
        super(flowableScanSeed);
        this.c = jmaVar;
        this.d = (byte) 2;
    }

    public static <T, R> gnc1 subscribe(gnc1 gnc1Var, Function<? super T, ? extends Iterable<? extends R>> function, int i) {
        return new FlattenIterableSubscriber(gnc1Var, function, i);
    }

    public final void V(gnc1 gnc1Var) {
        EmptySubscription emptySubscription = EmptySubscription.a;
        Supplier supplier = ((AbstractFlowableWithUpstream) this).b;
        boolean z = supplier instanceof Supplier;
        jma jmaVar = this.c;
        if (!z) {
            supplier.subscribe(new FlattenIterableSubscriber(gnc1Var, jmaVar, this.d));
            return;
        }
        try {
            Object obj = supplier.get();
            if (obj == null) {
                gnc1Var.onSubscribe(emptySubscription);
                gnc1Var.onComplete();
                return;
            }
            try {
                jmaVar.getClass();
                FlowableFromIterable.subscribe(gnc1Var, ((Iterable) f4s0.b.get(obj)).iterator());
            } catch (Throwable th) {
                Exceptions.a(th);
                gnc1Var.onSubscribe(emptySubscription);
                gnc1Var.onError(th);
            }
        } catch (Throwable th2) {
            Exceptions.a(th2);
            gnc1Var.onSubscribe(emptySubscription);
            gnc1Var.onError(th2);
        }
    }
}
