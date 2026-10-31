package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableFlatMapSingle<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final Function c;
    public final boolean d;
    public final int e;

    public static final class FlatMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, pnc1 {
        public volatile boolean X;
        public final gnc1 a;
        public final boolean b;
        public final int c;
        public final Function h;
        public pnc1 t;
        public final AtomicLong d = new AtomicLong();
        public final CompositeDisposable e = new CompositeDisposable();
        public final AtomicThrowable g = new AtomicThrowable();
        public final AtomicInteger f = new AtomicInteger(1);
        public final AtomicReference i = new AtomicReference();

        public final class InnerObserver extends AtomicReference<Disposable> implements SingleObserver<R>, Disposable {
            public InnerObserver() {
            }

            public void dispose() {
                DisposableHelper.a(this);
            }

            public boolean isDisposed() {
                return DisposableHelper.b(get());
            }

            public final void onError(Throwable th) {
                FlatMapSingleSubscriber flatMapSingleSubscriber = FlatMapSingleSubscriber.this;
                CompositeDisposable compositeDisposable = flatMapSingleSubscriber.e;
                compositeDisposable.c(this);
                if (flatMapSingleSubscriber.g.a(th)) {
                    if (!flatMapSingleSubscriber.b) {
                        flatMapSingleSubscriber.t.cancel();
                        compositeDisposable.dispose();
                    } else if (flatMapSingleSubscriber.c != Integer.MAX_VALUE) {
                        flatMapSingleSubscriber.t.request(1L);
                    }
                    flatMapSingleSubscriber.f.decrementAndGet();
                    if (flatMapSingleSubscriber.getAndIncrement() == 0) {
                        flatMapSingleSubscriber.b();
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
                FlatMapSingleSubscriber flatMapSingleSubscriber = FlatMapSingleSubscriber.this;
                flatMapSingleSubscriber.e.c(this);
                if (flatMapSingleSubscriber.get() == 0) {
                    if (flatMapSingleSubscriber.compareAndSet(0, 1)) {
                        boolean z = flatMapSingleSubscriber.f.decrementAndGet() == 0;
                        if (flatMapSingleSubscriber.d.get() != 0) {
                            flatMapSingleSubscriber.a.onNext(obj);
                            SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) flatMapSingleSubscriber.i.get();
                            if (z && (spscLinkedArrayQueue == null || spscLinkedArrayQueue.isEmpty())) {
                                flatMapSingleSubscriber.g.e(flatMapSingleSubscriber.a);
                                return;
                            } else {
                                BackpressureHelper.e(flatMapSingleSubscriber.d, 1L);
                                if (flatMapSingleSubscriber.c != Integer.MAX_VALUE) {
                                    flatMapSingleSubscriber.t.request(1L);
                                }
                            }
                        } else {
                            SpscLinkedArrayQueue spscLinkedArrayQueueC2 = flatMapSingleSubscriber.c();
                            synchronized (spscLinkedArrayQueueC2) {
                                spscLinkedArrayQueueC2.offer(obj);
                            }
                        }
                        if (flatMapSingleSubscriber.decrementAndGet() == 0) {
                            return;
                        }
                    } else {
                        spscLinkedArrayQueueC = flatMapSingleSubscriber.c();
                        synchronized (spscLinkedArrayQueueC) {
                            spscLinkedArrayQueueC.offer(obj);
                        }
                        flatMapSingleSubscriber.f.decrementAndGet();
                        if (flatMapSingleSubscriber.getAndIncrement() != 0) {
                            return;
                        }
                    }
                } else {
                    spscLinkedArrayQueueC = flatMapSingleSubscriber.c();
                    synchronized (spscLinkedArrayQueueC) {
                        spscLinkedArrayQueueC.offer(obj);
                        flatMapSingleSubscriber.f.decrementAndGet();
                        if (flatMapSingleSubscriber.getAndIncrement() != 0) {
                            return;
                        }
                    }
                }
                flatMapSingleSubscriber.b();
            }
        }

        public FlatMapSingleSubscriber(int i, Function function, gnc1 gnc1Var, boolean z) {
            this.a = gnc1Var;
            this.h = function;
            this.b = z;
            this.c = i;
        }

        public final void a() {
            SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) this.i.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.clear();
            }
        }

        public final void b() {
            gnc1 gnc1Var = this.a;
            AtomicInteger atomicInteger = this.f;
            AtomicReference atomicReference = this.i;
            int iAddAndGet = 1;
            do {
                long j = this.d.get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (this.X) {
                        a();
                        return;
                    }
                    if (!this.b && ((Throwable) this.g.get()) != null) {
                        a();
                        this.g.e(this.a);
                        return;
                    }
                    boolean z = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) atomicReference.get();
                    Object objPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        this.g.e(gnc1Var);
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
                    if (this.X) {
                        a();
                        return;
                    }
                    if (!this.b && ((Throwable) this.g.get()) != null) {
                        a();
                        this.g.e(gnc1Var);
                        return;
                    }
                    boolean z3 = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue spscLinkedArrayQueue2 = (SpscLinkedArrayQueue) atomicReference.get();
                    boolean z4 = spscLinkedArrayQueue2 == null || spscLinkedArrayQueue2.isEmpty();
                    if (z3 && z4) {
                        this.g.e(gnc1Var);
                        return;
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.e(this.d, j2);
                    if (this.c != Integer.MAX_VALUE) {
                        this.t.request(j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public final SpscLinkedArrayQueue c() {
            AtomicReference atomicReference = this.i;
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
            this.X = true;
            this.t.cancel();
            this.e.dispose();
            this.g.b();
        }

        public final void onComplete() {
            this.f.decrementAndGet();
            if (getAndIncrement() == 0) {
                b();
            }
        }

        public final void onError(Throwable th) {
            this.f.decrementAndGet();
            if (this.g.a(th)) {
                if (!this.b) {
                    this.e.dispose();
                }
                if (getAndIncrement() == 0) {
                    b();
                }
            }
        }

        public final void onNext(Object obj) {
            try {
                Object objApply = this.h.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null SingleSource");
                SingleSource singleSource = (SingleSource) objApply;
                this.f.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.X || !this.e.b(innerObserver)) {
                    return;
                }
                singleSource.subscribe(innerObserver);
            } catch (Throwable th) {
                Exceptions.a(th);
                this.t.cancel();
                onError(th);
            }
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.t, pnc1Var)) {
                this.t = pnc1Var;
                this.a.onSubscribe(this);
                int i = this.c;
                if (i == Integer.MAX_VALUE) {
                    pnc1Var.request(Long.MAX_VALUE);
                } else {
                    pnc1Var.request(i);
                }
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.a(this.d, j);
                if (getAndIncrement() == 0) {
                    b();
                }
            }
        }
    }

    public FlowableFlatMapSingle(Flowable flowable, Function function, boolean z, int i) {
        super(flowable);
        this.c = function;
        this.d = z;
        this.e = i;
    }

    public final void V(gnc1 gnc1Var) {
        ((AbstractFlowableWithUpstream) this).b.subscribe(new FlatMapSingleSubscriber(this.e, this.c, gnc1Var, this.d));
    }
}
