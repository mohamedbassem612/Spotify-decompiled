package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import p.gnc1;
import p.moy0;
import p.wb00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableOnErrorNext<T> extends AbstractFlowableWithUpstream<T, T> {
    public final wb00 c;

    public static final class OnErrorNextSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        public boolean X;
        public boolean Y;
        public long Z;
        public final gnc1 i;
        public final Function t;

        public OnErrorNextSubscriber(gnc1 gnc1Var, wb00 wb00Var) {
            super(false);
            this.i = gnc1Var;
            this.t = wb00Var;
        }

        @Override // p.gnc1
        public final void onComplete() {
            if (this.Y) {
                return;
            }
            this.Y = true;
            this.X = true;
            this.i.onComplete();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            boolean z = this.X;
            gnc1 gnc1Var = this.i;
            if (z) {
                if (this.Y) {
                    RxJavaPlugins.b(th);
                    return;
                } else {
                    gnc1Var.onError(th);
                    return;
                }
            }
            this.X = true;
            try {
                Object objApply = this.t.apply(th);
                Objects.requireNonNull(objApply, "The nextSupplier returned a null Publisher");
                moy0 moy0Var = (moy0) objApply;
                long j = this.Z;
                if (j != 0) {
                    d(j);
                }
                moy0Var.subscribe(this);
            } catch (Throwable th2) {
                Exceptions.a(th2);
                gnc1Var.onError(new CompositeException(th, th2));
            }
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (this.Y) {
                return;
            }
            if (!this.X) {
                this.Z++;
            }
            this.i.onNext(obj);
        }
    }

    public FlowableOnErrorNext(FlowableFromCallable flowableFromCallable, wb00 wb00Var) {
        super(flowableFromCallable);
        this.c = wb00Var;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        OnErrorNextSubscriber onErrorNextSubscriber = new OnErrorNextSubscriber(gnc1Var, this.c);
        gnc1Var.onSubscribe(onErrorNextSubscriber);
        this.b.subscribe((FlowableSubscriber) onErrorNextSubscriber);
    }
}
