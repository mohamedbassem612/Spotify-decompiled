package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import p.gnc1;
import p.moy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableConcatArray<T> extends Flowable<T> {
    public final moy0[] b;

    public static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        public final AtomicInteger X;
        public int Y;
        public long Z;
        public final gnc1 i;
        public final moy0[] t;

        public ConcatArraySubscriber(moy0[] moy0VarArr, gnc1 gnc1Var) {
            super(false);
            this.i = gnc1Var;
            this.t = moy0VarArr;
            this.X = new AtomicInteger();
        }

        @Override // p.gnc1
        public final void onComplete() {
            AtomicInteger atomicInteger = this.X;
            if (atomicInteger.getAndIncrement() == 0) {
                moy0[] moy0VarArr = this.t;
                int length = moy0VarArr.length;
                int i = this.Y;
                do {
                    gnc1 gnc1Var = this.i;
                    if (i == length) {
                        gnc1Var.onComplete();
                        return;
                    }
                    moy0 moy0Var = moy0VarArr[i];
                    if (moy0Var == null) {
                        gnc1Var.onError(new NullPointerException("A Publisher entry is null"));
                        return;
                    }
                    long j = this.Z;
                    if (j != 0) {
                        this.Z = 0L;
                        d(j);
                    }
                    moy0Var.subscribe(this);
                    i++;
                    this.Y = i;
                } while (atomicInteger.decrementAndGet() != 0);
            }
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            this.i.onError(th);
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            this.Z++;
            this.i.onNext(obj);
        }
    }

    public FlowableConcatArray(moy0[] moy0VarArr) {
        this.b = moy0VarArr;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber(this.b, gnc1Var);
        gnc1Var.onSubscribe(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }
}
