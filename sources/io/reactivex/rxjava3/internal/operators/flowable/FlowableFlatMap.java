package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimplePlainQueue;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.dv20;
import p.gnc1;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableFlatMap<T, U> extends AbstractFlowableWithUpstream<T, U> {
    public final Function c;
    public final int d;
    public final int e;

    public static final class InnerSubscriber<T, U> extends AtomicReference<pnc1> implements FlowableSubscriber<U>, Disposable {
        public final long a;
        public final MergeSubscriber b;
        public final int c;
        public final int d;
        public volatile boolean e;
        public volatile SimpleQueue f;
        public long g;
        public int h;

        public InnerSubscriber(MergeSubscriber mergeSubscriber, int i, long j) {
            this.a = j;
            this.b = mergeSubscriber;
            this.d = i;
            this.c = i >> 2;
        }

        public final void a(long j) {
            if (this.h != 1) {
                long j2 = this.g + j;
                if (j2 < this.c) {
                    this.g = j2;
                } else {
                    this.g = 0L;
                    get().request(j2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == SubscriptionHelper.a;
        }

        @Override // p.gnc1
        public final void onComplete() {
            this.e = true;
            this.b.b();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            lazySet(SubscriptionHelper.a);
            MergeSubscriber mergeSubscriber = this.b;
            if (mergeSubscriber.h.a(th)) {
                this.e = true;
                if (!mergeSubscriber.c) {
                    mergeSubscriber.Y.cancel();
                    for (InnerSubscriber innerSubscriber : (InnerSubscriber[]) mergeSubscriber.t.getAndSet(MergeSubscriber.S0)) {
                        innerSubscriber.dispose();
                    }
                }
                mergeSubscriber.b();
            }
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            int i = this.h;
            MergeSubscriber mergeSubscriber = this.b;
            if (i == 2) {
                mergeSubscriber.b();
                return;
            }
            if (mergeSubscriber.get() == 0 && mergeSubscriber.compareAndSet(0, 1)) {
                long j = mergeSubscriber.X.get();
                SimpleQueue spscArrayQueue = this.f;
                if (j == 0 || !(spscArrayQueue == null || spscArrayQueue.isEmpty())) {
                    if (spscArrayQueue == null) {
                        spscArrayQueue = new SpscArrayQueue(mergeSubscriber.e);
                        this.f = spscArrayQueue;
                    }
                    if (!spscArrayQueue.offer(obj)) {
                        mergeSubscriber.onError(new MissingBackpressureException("Inner queue full?!"));
                    }
                } else {
                    mergeSubscriber.a.onNext(obj);
                    if (j != Long.MAX_VALUE) {
                        mergeSubscriber.X.decrementAndGet();
                    }
                    a(1L);
                }
                if (mergeSubscriber.decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue spscArrayQueue2 = this.f;
                if (spscArrayQueue2 == null) {
                    spscArrayQueue2 = new SpscArrayQueue(mergeSubscriber.e);
                    this.f = spscArrayQueue2;
                }
                if (!spscArrayQueue2.offer(obj)) {
                    mergeSubscriber.onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (mergeSubscriber.getAndIncrement() != 0) {
                    return;
                }
            }
            mergeSubscriber.c();
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.d(this, pnc1Var)) {
                if (pnc1Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) pnc1Var;
                    int iA = queueSubscription.a(7);
                    if (iA == 1) {
                        this.h = iA;
                        this.f = queueSubscription;
                        this.e = true;
                        this.b.b();
                        return;
                    }
                    if (iA == 2) {
                        this.h = iA;
                        this.f = queueSubscription;
                    }
                }
                pnc1Var.request(this.d);
            }
        }
    }

    public static final class MergeSubscriber<T, U> extends AtomicInteger implements FlowableSubscriber<T>, pnc1 {
        public static final InnerSubscriber[] R0 = new InnerSubscriber[0];
        public static final InnerSubscriber[] S0 = new InnerSubscriber[0];
        public long N0;
        public int O0;
        public int P0;
        public final int Q0;
        public final AtomicLong X;
        public pnc1 Y;
        public long Z;
        public final gnc1 a;
        public final Function b;
        public final boolean c;
        public final int d;
        public final int e;
        public volatile SimplePlainQueue f;
        public volatile boolean g;
        public final AtomicThrowable h = new AtomicThrowable();
        public volatile boolean i;
        public final AtomicReference t;

        public MergeSubscriber(gnc1 gnc1Var, Function function, boolean z, int i, int i2) {
            AtomicReference atomicReference = new AtomicReference();
            this.t = atomicReference;
            this.X = new AtomicLong();
            this.a = gnc1Var;
            this.b = function;
            this.c = z;
            this.d = i;
            this.e = i2;
            this.Q0 = Math.max(1, i >> 1);
            atomicReference.lazySet(R0);
        }

        public final boolean a() {
            if (this.i) {
                SimplePlainQueue simplePlainQueue = this.f;
                if (simplePlainQueue != null) {
                    simplePlainQueue.clear();
                }
                return true;
            }
            if (this.c || this.h.get() == null) {
                return false;
            }
            SimplePlainQueue simplePlainQueue2 = this.f;
            if (simplePlainQueue2 != null) {
                simplePlainQueue2.clear();
            }
            this.h.e(this.a);
            return true;
        }

        public final void b() {
            if (getAndIncrement() == 0) {
                c();
            }
        }

        /* JADX WARN: Code duplicated, block: B:102:0x015d  */
        /* JADX WARN: Code duplicated, block: B:106:0x0167  */
        /* JADX WARN: Code duplicated, block: B:108:0x016d  */
        /* JADX WARN: Code duplicated, block: B:124:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:129:0x01a5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:130:0x01a5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:132:0x01a5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:141:0x0175 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:142:0x0165 A[EDGE_INSN: B:142:0x0165->B:105:0x0165 BREAK  A[LOOP:2: B:56:0x00b9->B:109:0x016e], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:145:0x016e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:148:0x00ca A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:150:0x0117 A[EDGE_INSN: B:150:0x0117->B:82:0x0117 BREAK  A[LOOP:4: B:65:0x00d5->B:73:0x00e8], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:60:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:64:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:67:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:73:0x00e8 A[LOOP:4: B:65:0x00d5->B:73:0x00e8, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:84:0x011b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:85:0x011d  */
        /* JADX WARN: Code duplicated, block: B:86:0x0128  */
        /* JADX WARN: Code duplicated, block: B:88:0x0135  */
        public final void c() {
            boolean z;
            long j;
            int i;
            long j2;
            boolean z2;
            long j3;
            int i2;
            int i3;
            boolean z3;
            InnerSubscriber innerSubscriber;
            Object objPoll;
            SimpleQueue simpleQueue;
            int i4;
            boolean z4;
            long j4;
            long jAddAndGet;
            gnc1 gnc1Var = this.a;
            int iAddAndGet = 1;
            while (!a()) {
                SimplePlainQueue simplePlainQueue = this.f;
                long jAddAndGet2 = this.X.get();
                boolean z5 = jAddAndGet2 == Long.MAX_VALUE;
                if (simplePlainQueue != null) {
                    long j5 = 0;
                    j = 0;
                    while (true) {
                        if (jAddAndGet2 == 0) {
                            z = true;
                            break;
                        }
                        z = true;
                        Object objPoll2 = simplePlainQueue.poll();
                        if (a()) {
                            return;
                        }
                        if (objPoll2 == null) {
                            break;
                        }
                        gnc1Var.onNext(objPoll2);
                        j++;
                        j5++;
                        jAddAndGet2--;
                    }
                    if (j5 != 0) {
                        jAddAndGet2 = z5 ? Long.MAX_VALUE : this.X.addAndGet(-j5);
                    }
                } else {
                    z = true;
                    j = 0;
                }
                boolean z6 = this.g;
                SimplePlainQueue simplePlainQueue2 = this.f;
                InnerSubscriber[] innerSubscriberArr = (InnerSubscriber[]) this.t.get();
                int length = innerSubscriberArr.length;
                if (z6 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0)) {
                    this.h.e(this.a);
                    return;
                }
                if (length != 0) {
                    long j6 = this.N0;
                    int i5 = this.O0;
                    if (length > i5) {
                        j2 = 0;
                        if (innerSubscriberArr[i5].a != j6) {
                        }
                        j3 = jAddAndGet2;
                        i2 = 0;
                        i3 = i5;
                        z3 = false;
                        while (true) {
                            if (i2 < length) {
                                i = iAddAndGet;
                                innerSubscriberArr = innerSubscriberArr;
                                break;
                            }
                            if (a()) {
                                return;
                            }
                            innerSubscriber = innerSubscriberArr[i3];
                            objPoll = null;
                            while (true) {
                                simpleQueue = innerSubscriber.f;
                                if (simpleQueue != null) {
                                    i = iAddAndGet;
                                    i2 = i2;
                                    innerSubscriberArr = innerSubscriberArr;
                                    break;
                                }
                                i = iAddAndGet;
                                j4 = j2;
                                while (j3 != j2) {
                                    if (a()) {
                                        return;
                                    }
                                    try {
                                        objPoll = simpleQueue.poll();
                                        if (objPoll == null) {
                                            break;
                                        }
                                        gnc1Var.onNext(objPoll);
                                        j3--;
                                        j4++;
                                    } catch (Throwable th) {
                                        Exceptions.a(th);
                                        innerSubscriber.dispose();
                                        this.h.a(th);
                                        if (!this.c) {
                                            this.Y.cancel();
                                        }
                                        if (a()) {
                                            return;
                                        }
                                        e(innerSubscriber);
                                        i4 = i2 + 1;
                                        innerSubscriberArr = innerSubscriberArr;
                                        z3 = z;
                                    }
                                }
                                if (j4 != j2) {
                                    if (z5) {
                                        jAddAndGet = Long.MAX_VALUE;
                                    } else {
                                        jAddAndGet = this.X.addAndGet(-j4);
                                    }
                                    innerSubscriber.a(j4);
                                    j3 = jAddAndGet;
                                } else {
                                    i2 = i2;
                                    innerSubscriberArr = innerSubscriberArr;
                                }
                                if (j3 == j2 || objPoll == null) {
                                    break;
                                }
                                innerSubscriberArr = innerSubscriberArr;
                                iAddAndGet = i;
                                i2 = i2;
                            }
                            z4 = innerSubscriber.e;
                            SimpleQueue simpleQueue2 = innerSubscriber.f;
                            if (z4 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                e(innerSubscriber);
                                if (a()) {
                                    return;
                                }
                                j++;
                                z3 = z;
                            }
                            if (j3 == j2) {
                                break;
                            }
                            i3++;
                            i4 = i2;
                            if (i3 == length) {
                                i3 = 0;
                            }
                            i2 = i4 + 1;
                            innerSubscriberArr = innerSubscriberArr;
                            iAddAndGet = i;
                        }
                        z2 = z3;
                        this.O0 = i3;
                        this.N0 = innerSubscriberArr[i3].a;
                    } else {
                        j2 = 0;
                    }
                    if (length <= i5) {
                        i5 = 0;
                    }
                    for (int i6 = 0; i6 < length && innerSubscriberArr[i5].a != j6; i6++) {
                        i5++;
                        if (i5 == length) {
                            i5 = 0;
                        }
                    }
                    this.O0 = i5;
                    this.N0 = innerSubscriberArr[i5].a;
                    j3 = jAddAndGet2;
                    i2 = 0;
                    i3 = i5;
                    z3 = false;
                    while (true) {
                        if (i2 < length) {
                            i = iAddAndGet;
                            innerSubscriberArr = innerSubscriberArr;
                            break;
                        }
                        if (a()) {
                            return;
                        }
                        innerSubscriber = innerSubscriberArr[i3];
                        objPoll = null;
                        while (true) {
                            simpleQueue = innerSubscriber.f;
                            if (simpleQueue != null) {
                                i = iAddAndGet;
                                j4 = j2;
                                while (j3 != j2) {
                                    if (a()) {
                                        return;
                                    }
                                    objPoll = simpleQueue.poll();
                                    if (objPoll == null) {
                                        break;
                                        break;
                                    } else {
                                        gnc1Var.onNext(objPoll);
                                        j3--;
                                        j4++;
                                    }
                                }
                                if (j4 != j2) {
                                    if (z5) {
                                        jAddAndGet = this.X.addAndGet(-j4);
                                    } else {
                                        jAddAndGet = Long.MAX_VALUE;
                                    }
                                    innerSubscriber.a(j4);
                                    j3 = jAddAndGet;
                                } else {
                                    i2 = i2;
                                    innerSubscriberArr = innerSubscriberArr;
                                }
                                if (j3 == j2) {
                                    break;
                                }
                                break;
                                break;
                            }
                            i = iAddAndGet;
                            i2 = i2;
                            innerSubscriberArr = innerSubscriberArr;
                            break;
                            innerSubscriberArr = innerSubscriberArr;
                            iAddAndGet = i;
                            i2 = i2;
                        }
                        z4 = innerSubscriber.e;
                        SimpleQueue simpleQueue3 = innerSubscriber.f;
                        if (z4) {
                            e(innerSubscriber);
                            if (a()) {
                                return;
                            }
                            j++;
                            z3 = z;
                        }
                        if (j3 == j2) {
                            break;
                            break;
                        }
                        i3++;
                        i4 = i2;
                        if (i3 == length) {
                            i3 = 0;
                        }
                        i2 = i4 + 1;
                        innerSubscriberArr = innerSubscriberArr;
                        iAddAndGet = i;
                    }
                    z2 = z3;
                    this.O0 = i3;
                    this.N0 = innerSubscriberArr[i3].a;
                } else {
                    i = iAddAndGet;
                    j2 = 0;
                    z2 = false;
                }
                long j7 = j;
                if (j7 != j2 && !this.i) {
                    this.Y.request(j7);
                }
                if (z2) {
                    iAddAndGet = i;
                } else {
                    iAddAndGet = addAndGet(-i);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p.pnc1
        public final void cancel() {
            SimplePlainQueue simplePlainQueue;
            if (this.i) {
                return;
            }
            this.i = true;
            this.Y.cancel();
            AtomicReference atomicReference = this.t;
            InnerSubscriber[] innerSubscriberArr = S0;
            InnerSubscriber[] innerSubscriberArr2 = (InnerSubscriber[]) atomicReference.getAndSet(innerSubscriberArr);
            if (innerSubscriberArr2 != innerSubscriberArr) {
                for (InnerSubscriber innerSubscriber : innerSubscriberArr2) {
                    innerSubscriber.dispose();
                }
                this.h.b();
            }
            if (getAndIncrement() != 0 || (simplePlainQueue = this.f) == null) {
                return;
            }
            simplePlainQueue.clear();
        }

        public final SimplePlainQueue d() {
            SimplePlainQueue spscLinkedArrayQueue = this.f;
            if (spscLinkedArrayQueue == null) {
                spscLinkedArrayQueue = this.d == Integer.MAX_VALUE ? new SpscLinkedArrayQueue(this.e) : new SpscArrayQueue(this.d);
                this.f = spscLinkedArrayQueue;
            }
            return spscLinkedArrayQueue;
        }

        public final void e(InnerSubscriber innerSubscriber) {
            AtomicReference atomicReference;
            InnerSubscriber[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                atomicReference = this.t;
                innerSubscriberArr = (InnerSubscriber[]) atomicReference.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerSubscriberArr[i] == innerSubscriber) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr2 = R0;
                } else {
                    InnerSubscriber[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i);
                    System.arraycopy(innerSubscriberArr, i + 1, innerSubscriberArr3, i, (length - i) - 1);
                    innerSubscriberArr2 = innerSubscriberArr3;
                }
            } while (!dv20.o(atomicReference, innerSubscriberArr, innerSubscriberArr2));
        }

        @Override // p.gnc1
        public final void onComplete() {
            if (this.g) {
                return;
            }
            this.g = true;
            b();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            if (this.g) {
                RxJavaPlugins.b(th);
                return;
            }
            if (this.h.a(th)) {
                this.g = true;
                if (!this.c) {
                    for (InnerSubscriber innerSubscriber : (InnerSubscriber[]) this.t.getAndSet(S0)) {
                        innerSubscriber.dispose();
                    }
                }
                b();
            }
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            InnerSubscriber[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            if (this.g) {
                return;
            }
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                moy0 moy0Var = (moy0) objApply;
                if (!(moy0Var instanceof Supplier)) {
                    int i = this.e;
                    long j = this.Z;
                    this.Z = 1 + j;
                    InnerSubscriber innerSubscriber = new InnerSubscriber(this, i, j);
                    AtomicReference atomicReference = this.t;
                    do {
                        innerSubscriberArr = (InnerSubscriber[]) atomicReference.get();
                        if (innerSubscriberArr == S0) {
                            innerSubscriber.dispose();
                            return;
                        }
                        int length = innerSubscriberArr.length;
                        innerSubscriberArr2 = new InnerSubscriber[length + 1];
                        System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                        innerSubscriberArr2[length] = innerSubscriber;
                    } while (!dv20.o(atomicReference, innerSubscriberArr, innerSubscriberArr2));
                    moy0Var.subscribe(innerSubscriber);
                    return;
                }
                try {
                    Object obj2 = ((Supplier) moy0Var).get();
                    if (obj2 == null) {
                        if (this.d == Integer.MAX_VALUE || this.i) {
                            return;
                        }
                        int i2 = this.P0 + 1;
                        this.P0 = i2;
                        int i3 = this.Q0;
                        if (i2 == i3) {
                            this.P0 = 0;
                            this.Y.request(i3);
                            return;
                        }
                        return;
                    }
                    if (get() == 0 && compareAndSet(0, 1)) {
                        long j2 = this.X.get();
                        SimplePlainQueue simplePlainQueueD = this.f;
                        if (j2 == 0 || !(simplePlainQueueD == null || simplePlainQueueD.isEmpty())) {
                            if (simplePlainQueueD == null) {
                                simplePlainQueueD = d();
                            }
                            if (!simplePlainQueueD.offer(obj2)) {
                                onError(new MissingBackpressureException("Scalar queue full?!"));
                            }
                        } else {
                            this.a.onNext(obj2);
                            if (j2 != Long.MAX_VALUE) {
                                this.X.decrementAndGet();
                            }
                            if (this.d != Integer.MAX_VALUE && !this.i) {
                                int i4 = this.P0 + 1;
                                this.P0 = i4;
                                int i5 = this.Q0;
                                if (i4 == i5) {
                                    this.P0 = 0;
                                    this.Y.request(i5);
                                }
                            }
                        }
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } else if (!d().offer(obj2)) {
                        onError(new MissingBackpressureException("Scalar queue full?!"));
                        return;
                    } else if (getAndIncrement() != 0) {
                        return;
                    }
                    c();
                } catch (Throwable th) {
                    Exceptions.a(th);
                    this.h.a(th);
                    b();
                }
            } catch (Throwable th2) {
                Exceptions.a(th2);
                this.Y.cancel();
                onError(th2);
            }
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.Y, pnc1Var)) {
                this.Y = pnc1Var;
                this.a.onSubscribe(this);
                if (this.i) {
                    return;
                }
                int i = this.d;
                if (i == Integer.MAX_VALUE) {
                    pnc1Var.request(Long.MAX_VALUE);
                } else {
                    pnc1Var.request(i);
                }
            }
        }

        @Override // p.pnc1
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.a(this.X, j);
                b();
            }
        }
    }

    public FlowableFlatMap(Flowable flowable, Function function, int i, int i2) {
        super(flowable);
        this.c = function;
        this.d = i;
        this.e = i2;
    }

    public static <T, U> FlowableSubscriber<T> subscribe(gnc1 gnc1Var, Function<? super T, ? extends moy0> function, boolean z, int i, int i2) {
        return new MergeSubscriber(gnc1Var, function, z, i, i2);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        Flowable flowable = this.b;
        Function function = this.c;
        if (FlowableScalarXMap.b(flowable, gnc1Var, function)) {
            return;
        }
        flowable.subscribe((FlowableSubscriber) subscribe(gnc1Var, function, false, this.d, this.e));
    }
}
