package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import io.reactivex.rxjava3.operators.QueueSubscription;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableFilter<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Predicate c;

    public static final class FilterConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        public final Predicate f;

        public FilterConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, Predicate predicate) {
            super(conditionalSubscriber);
            this.f = predicate;
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        public final boolean f(Object obj) {
            if (this.d) {
                return false;
            }
            int i = this.e;
            ConditionalSubscriber conditionalSubscriber = this.a;
            if (i != 0) {
                return conditionalSubscriber.f(null);
            }
            try {
                return this.f.test(obj) && conditionalSubscriber.f(obj);
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (f(obj)) {
                return;
            }
            this.b.request(1L);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            QueueSubscription queueSubscription = this.c;
            while (true) {
                Object objPoll = queueSubscription.poll();
                if (objPoll == null) {
                    return null;
                }
                if (this.f.test(objPoll)) {
                    return objPoll;
                }
                if (this.e == 2) {
                    queueSubscription.request(1L);
                }
            }
        }
    }

    public static final class FilterSubscriber<T> extends BasicFuseableSubscriber<T, T> implements ConditionalSubscriber<T> {
        public final Predicate f;

        public FilterSubscriber(gnc1 gnc1Var, Predicate predicate) {
            super(gnc1Var);
            this.f = predicate;
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        public final boolean f(Object obj) {
            if (this.d) {
                return false;
            }
            int i = this.e;
            gnc1 gnc1Var = this.a;
            if (i != 0) {
                gnc1Var.onNext(null);
                return true;
            }
            try {
                boolean zTest = this.f.test(obj);
                if (zTest) {
                    gnc1Var.onNext(obj);
                }
                return zTest;
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (f(obj)) {
                return;
            }
            this.b.request(1L);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            QueueSubscription queueSubscription = this.c;
            while (true) {
                Object objPoll = queueSubscription.poll();
                if (objPoll == null) {
                    return null;
                }
                if (this.f.test(objPoll)) {
                    return objPoll;
                }
                if (this.e == 2) {
                    queueSubscription.request(1L);
                }
            }
        }
    }

    public FlowableFilter(Flowable flowable, Predicate predicate) {
        super(flowable);
        this.c = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        boolean z = gnc1Var instanceof ConditionalSubscriber;
        Predicate predicate = this.c;
        Flowable flowable = this.b;
        if (z) {
            flowable.subscribe((FlowableSubscriber) new FilterConditionalSubscriber((ConditionalSubscriber) gnc1Var, predicate));
        } else {
            flowable.subscribe((FlowableSubscriber) new FilterSubscriber(gnc1Var, predicate));
        }
    }
}
