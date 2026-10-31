package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.pnc1;
import p.y1x0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableFlatMapMaybe<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final Function c;
    public final int d;

    public static final class FlatMapMaybeSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, pnc1 {
        public final gnc1 a;
        public final int b;
        public final Function g;
        public pnc1 i;
        public volatile boolean t;
        public final AtomicLong c = new AtomicLong();
        public final CompositeDisposable d = new CompositeDisposable();
        public final AtomicThrowable f = new AtomicThrowable();
        public final AtomicInteger e = new AtomicInteger(1);
        public final AtomicReference h = new AtomicReference();

        public final class InnerObserver extends AtomicReference<Disposable> implements MaybeObserver<R>, Disposable {
            public InnerObserver() {
            }

            public void dispose() {
                DisposableHelper.a(this);
            }

            public boolean isDisposed() {
                return DisposableHelper.b(get());
            }

            public final void onComplete() {
                FlatMapMaybeSubscriber flatMapMaybeSubscriber = FlatMapMaybeSubscriber.this;
                int i = flatMapMaybeSubscriber.b;
                AtomicInteger atomicInteger = flatMapMaybeSubscriber.e;
                flatMapMaybeSubscriber.d.c(this);
                if (flatMapMaybeSubscriber.get() == 0) {
                    if (flatMapMaybeSubscriber.compareAndSet(0, 1)) {
                        boolean z = atomicInteger.decrementAndGet() == 0;
                        SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) flatMapMaybeSubscriber.h.get();
                        if (z && (spscLinkedArrayQueue == null || spscLinkedArrayQueue.isEmpty())) {
                            flatMapMaybeSubscriber.f.e(flatMapMaybeSubscriber.a);
                            return;
                        }
                        if (i != Integer.MAX_VALUE) {
                            flatMapMaybeSubscriber.i.request(1L);
                        }
                        if (flatMapMaybeSubscriber.decrementAndGet() == 0) {
                            return;
                        }
                        flatMapMaybeSubscriber.b();
                        return;
                    }
                }
                atomicInteger.decrementAndGet();
                if (i != Integer.MAX_VALUE) {
                    flatMapMaybeSubscriber.i.request(1L);
                }
                if (flatMapMaybeSubscriber.getAndIncrement() == 0) {
                    flatMapMaybeSubscriber.b();
                }
            }

            public final void onError(Throwable th) {
                FlatMapMaybeSubscriber flatMapMaybeSubscriber = FlatMapMaybeSubscriber.this;
                CompositeDisposable compositeDisposable = flatMapMaybeSubscriber.d;
                compositeDisposable.c(this);
                if (flatMapMaybeSubscriber.f.a(th)) {
                    flatMapMaybeSubscriber.i.cancel();
                    compositeDisposable.dispose();
                    flatMapMaybeSubscriber.e.decrementAndGet();
                    if (flatMapMaybeSubscriber.getAndIncrement() == 0) {
                        flatMapMaybeSubscriber.b();
                    }
                }
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.g(this, disposable);
            }

            /* JADX WARN: Code duplicated, block: B:31:0x0070  */
            /* JADX WARN: Code duplicated, block: B:37:0x0084 A[ORIG_RETURN, RETURN] */
            /* JADX WARN: Code duplicated, block: B:43:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            public final void onSuccess(Object obj) {
                SpscLinkedArrayQueue spscLinkedArrayQueueC;
                FlatMapMaybeSubscriber flatMapMaybeSubscriber = FlatMapMaybeSubscriber.this;
                flatMapMaybeSubscriber.d.c(this);
                if (flatMapMaybeSubscriber.get() == 0) {
                    if (flatMapMaybeSubscriber.compareAndSet(0, 1)) {
                        boolean z = flatMapMaybeSubscriber.e.decrementAndGet() == 0;
                        if (flatMapMaybeSubscriber.c.get() != 0) {
                            flatMapMaybeSubscriber.a.onNext(obj);
                            SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) flatMapMaybeSubscriber.h.get();
                            if (z && (spscLinkedArrayQueue == null || spscLinkedArrayQueue.isEmpty())) {
                                flatMapMaybeSubscriber.f.e(flatMapMaybeSubscriber.a);
                                return;
                            } else {
                                BackpressureHelper.e(flatMapMaybeSubscriber.c, 1L);
                                if (flatMapMaybeSubscriber.b != Integer.MAX_VALUE) {
                                    flatMapMaybeSubscriber.i.request(1L);
                                }
                            }
                        } else {
                            SpscLinkedArrayQueue spscLinkedArrayQueueC2 = flatMapMaybeSubscriber.c();
                            synchronized (spscLinkedArrayQueueC2) {
                                spscLinkedArrayQueueC2.offer(obj);
                            }
                        }
                        if (flatMapMaybeSubscriber.decrementAndGet() == 0) {
                            return;
                        }
                    } else {
                        spscLinkedArrayQueueC = flatMapMaybeSubscriber.c();
                        synchronized (spscLinkedArrayQueueC) {
                            spscLinkedArrayQueueC.offer(obj);
                        }
                        flatMapMaybeSubscriber.e.decrementAndGet();
                        if (flatMapMaybeSubscriber.getAndIncrement() != 0) {
                            return;
                        }
                    }
                } else {
                    spscLinkedArrayQueueC = flatMapMaybeSubscriber.c();
                    synchronized (spscLinkedArrayQueueC) {
                        spscLinkedArrayQueueC.offer(obj);
                        flatMapMaybeSubscriber.e.decrementAndGet();
                        if (flatMapMaybeSubscriber.getAndIncrement() != 0) {
                            return;
                        }
                    }
                }
                flatMapMaybeSubscriber.b();
            }
        }

        public FlatMapMaybeSubscriber(gnc1 gnc1Var, Function function, int i) {
            this.a = gnc1Var;
            this.g = function;
            this.b = i;
        }

        public final void a() {
            SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) this.h.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.clear();
            }
        }

        public final void b() {
            gnc1 gnc1Var = this.a;
            AtomicInteger atomicInteger = this.e;
            AtomicReference atomicReference = this.h;
            int iAddAndGet = 1;
            do {
                long j = this.c.get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (this.t) {
                        a();
                        return;
                    }
                    if (((Throwable) this.f.get()) != null) {
                        a();
                        this.f.e(gnc1Var);
                        return;
                    }
                    boolean z = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) atomicReference.get();
                    Object objPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        this.f.e(gnc1Var);
                        return;
                    } else {
                        if (z2) {
                            break;
                        }
                        gnc1Var.onNext(objPoll);
                        j2++;
                    }
                }
                if (j2 == j) {
                    if (this.t) {
                        a();
                        return;
                    }
                    if (((Throwable) this.f.get()) != null) {
                        a();
                        this.f.e(gnc1Var);
                        return;
                    }
                    boolean z3 = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue spscLinkedArrayQueue2 = (SpscLinkedArrayQueue) atomicReference.get();
                    boolean z4 = spscLinkedArrayQueue2 == null || spscLinkedArrayQueue2.isEmpty();
                    if (z3 && z4) {
                        this.f.e(gnc1Var);
                        return;
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.e(this.c, j2);
                    if (this.b != Integer.MAX_VALUE) {
                        this.i.request(j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public final SpscLinkedArrayQueue c() {
            AtomicReference atomicReference = this.h;
            SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) atomicReference.get();
            if (spscLinkedArrayQueue != null) {
                return spscLinkedArrayQueue;
            }
            SpscLinkedArrayQueue spscLinkedArrayQueue2 = new SpscLinkedArrayQueue(Flowable.a);
            while (!atomicReference.compareAndSet(null, spscLinkedArrayQueue2)) {
                if (atomicReference.get() != null) {
                    return (SpscLinkedArrayQueue) atomicReference.get();
                }
            }
            return spscLinkedArrayQueue2;
        }

        public final void cancel() {
            this.t = true;
            this.i.cancel();
            this.d.dispose();
            this.f.b();
        }

        public final void onComplete() {
            this.e.decrementAndGet();
            if (getAndIncrement() == 0) {
                b();
            }
        }

        public final void onError(Throwable th) {
            this.e.decrementAndGet();
            if (this.f.a(th)) {
                this.d.dispose();
                if (getAndIncrement() == 0) {
                    b();
                }
            }
        }

        public final void onNext(Object obj) {
            try {
                Object objApply = this.g.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null MaybeSource");
                MaybeSource maybeSource = (MaybeSource) objApply;
                this.e.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.t || !this.d.b(innerObserver)) {
                    return;
                }
                maybeSource.subscribe(innerObserver);
            } catch (Throwable th) {
                Exceptions.a(th);
                this.i.cancel();
                onError(th);
            }
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.i, pnc1Var)) {
                this.i = pnc1Var;
                this.a.onSubscribe(this);
                int i = this.b;
                if (i == Integer.MAX_VALUE) {
                    pnc1Var.request(Long.MAX_VALUE);
                } else {
                    pnc1Var.request(i);
                }
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.a(this.c, j);
                if (getAndIncrement() == 0) {
                    b();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowableFlatMapMaybe(FlowableZip flowableZip) {
        super(flowableZip);
        y1x0 y1x0Var = y1x0.P0;
        this.c = y1x0Var;
        this.d = Integer.MAX_VALUE;
    }

    public final void V(gnc1 gnc1Var) {
        ((AbstractFlowableWithUpstream) this).b.subscribe(new FlatMapMaybeSubscriber(gnc1Var, this.c, this.d));
    }
}
