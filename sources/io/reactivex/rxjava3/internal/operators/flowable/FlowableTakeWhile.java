package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.gnc1;
import p.m7y0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableTakeWhile<T> extends AbstractFlowableWithUpstream<T, T> {
    public final m7y0 c;

    public static final class TakeWhileSubscriber<T> implements FlowableSubscriber<T>, pnc1 {
        public final gnc1 a;
        public final Predicate b;
        public pnc1 c;
        public boolean d;

        public TakeWhileSubscriber(gnc1 gnc1Var, m7y0 m7y0Var) {
            this.a = gnc1Var;
            this.b = m7y0Var;
        }

        @Override // p.pnc1
        public final void cancel() {
            this.c.cancel();
        }

        @Override // p.gnc1
        public final void onComplete() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.a.onComplete();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.b(th);
            } else {
                this.d = true;
                this.a.onError(th);
            }
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (this.d) {
                return;
            }
            try {
                boolean zTest = this.b.test(obj);
                gnc1 gnc1Var = this.a;
                if (zTest) {
                    gnc1Var.onNext(obj);
                    return;
                }
                this.d = true;
                this.c.cancel();
                gnc1Var.onComplete();
            } catch (Throwable th) {
                Exceptions.a(th);
                this.c.cancel();
                onError(th);
            }
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.c, pnc1Var)) {
                this.c = pnc1Var;
                this.a.onSubscribe(this);
            }
        }

        @Override // p.pnc1
        public final void request(long j) {
            this.c.request(j);
        }
    }

    public FlowableTakeWhile(Flowable flowable, m7y0 m7y0Var) {
        super(flowable);
        this.c = m7y0Var;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        this.b.subscribe((FlowableSubscriber) new TakeWhileSubscriber(gnc1Var, this.c));
    }
}
