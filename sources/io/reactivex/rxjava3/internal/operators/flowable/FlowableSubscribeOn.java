package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableSubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Scheduler c;
    public final boolean d;

    public static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements FlowableSubscriber<T>, pnc1, Runnable {
        public final gnc1 a;
        public final Scheduler.Worker b;
        public final AtomicReference c = new AtomicReference();
        public final AtomicLong d = new AtomicLong();
        public final boolean e;
        public moy0 f;

        public SubscribeOnSubscriber(gnc1 gnc1Var, Scheduler.Worker worker, moy0 moy0Var, boolean z) {
            this.a = gnc1Var;
            this.b = worker;
            this.f = moy0Var;
            this.e = !z;
        }

        public final void a(long j, pnc1 pnc1Var) {
            if (this.e || Thread.currentThread() == get()) {
                pnc1Var.request(j);
            } else {
                this.b.a(new Request(j, pnc1Var));
            }
        }

        @Override // p.pnc1
        public final void cancel() {
            SubscriptionHelper.a(this.c);
            this.b.dispose();
        }

        @Override // p.gnc1
        public final void onComplete() {
            this.a.onComplete();
            this.b.dispose();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            this.a.onError(th);
            this.b.dispose();
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            this.a.onNext(obj);
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.d(this.c, pnc1Var)) {
                long andSet = this.d.getAndSet(0L);
                if (andSet != 0) {
                    a(andSet, pnc1Var);
                }
            }
        }

        @Override // p.pnc1
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                AtomicReference atomicReference = this.c;
                pnc1 pnc1Var = (pnc1) atomicReference.get();
                if (pnc1Var != null) {
                    a(j, pnc1Var);
                    return;
                }
                AtomicLong atomicLong = this.d;
                BackpressureHelper.a(atomicLong, j);
                pnc1 pnc1Var2 = (pnc1) atomicReference.get();
                if (pnc1Var2 != null) {
                    long andSet = atomicLong.getAndSet(0L);
                    if (andSet != 0) {
                        a(andSet, pnc1Var2);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            lazySet(Thread.currentThread());
            moy0 moy0Var = this.f;
            this.f = null;
            moy0Var.subscribe(this);
        }
    }

    public FlowableSubscribeOn(Flowable flowable, Scheduler scheduler, boolean z) {
        super(flowable);
        this.c = scheduler;
        this.d = z;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        Scheduler.Worker workerB = this.c.b();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(gnc1Var, workerB, this.b, this.d);
        gnc1Var.onSubscribe(subscribeOnSubscriber);
        workerB.a(subscribeOnSubscriber);
    }
}
