package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import p.gnc1;
import p.pw41;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableDoAfterNext<T> extends AbstractFlowableWithUpstream<T, T> {
    public final pw41 c;

    public static final class DoAfterConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        public final Consumer f;

        public DoAfterConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, pw41 pw41Var) {
            super(conditionalSubscriber);
            this.f = pw41Var;
        }

        public final boolean f(Object obj) {
            boolean zF = ((BasicFuseableConditionalSubscriber) this).a.f(obj);
            try {
                this.f.accept(obj);
                return zF;
            } catch (Throwable th) {
                b(th);
                return zF;
            }
        }

        public final void onNext(Object obj) {
            ((BasicFuseableConditionalSubscriber) this).a.onNext(obj);
            if (((BasicFuseableConditionalSubscriber) this).e == 0) {
                try {
                    this.f.accept(obj);
                } catch (Throwable th) {
                    b(th);
                }
            }
        }

        public final Object poll() {
            Object objPoll = ((BasicFuseableConditionalSubscriber) this).c.poll();
            if (objPoll != null) {
                this.f.accept(objPoll);
            }
            return objPoll;
        }
    }

    public static final class DoAfterSubscriber<T> extends BasicFuseableSubscriber<T, T> {
        public final Consumer f;

        public DoAfterSubscriber(gnc1 gnc1Var, pw41 pw41Var) {
            super(gnc1Var);
            this.f = pw41Var;
        }

        public final void onNext(Object obj) {
            if (((BasicFuseableSubscriber) this).d) {
                return;
            }
            ((BasicFuseableSubscriber) this).a.onNext(obj);
            if (((BasicFuseableSubscriber) this).e == 0) {
                try {
                    this.f.accept(obj);
                } catch (Throwable th) {
                    b(th);
                }
            }
        }

        public final Object poll() {
            Object objPoll = ((BasicFuseableSubscriber) this).c.poll();
            if (objPoll != null) {
                this.f.accept(objPoll);
            }
            return objPoll;
        }
    }

    public FlowableDoAfterNext(FlowableDoOnEach flowableDoOnEach, pw41 pw41Var) {
        super(flowableDoOnEach);
        this.c = pw41Var;
    }

    public final void V(gnc1 gnc1Var) {
        boolean z = gnc1Var instanceof ConditionalSubscriber;
        pw41 pw41Var = this.c;
        Flowable flowable = ((AbstractFlowableWithUpstream) this).b;
        if (z) {
            flowable.subscribe(new DoAfterConditionalSubscriber((ConditionalSubscriber) gnc1Var, pw41Var));
        } else {
            flowable.subscribe(new DoAfterSubscriber(gnc1Var, pw41Var));
        }
    }
}
