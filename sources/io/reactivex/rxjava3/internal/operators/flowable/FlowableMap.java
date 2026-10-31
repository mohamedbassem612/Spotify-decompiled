package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import java.util.Objects;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableMap<T, U> extends AbstractFlowableWithUpstream<T, U> {
    public final Function c;

    public static final class MapConditionalSubscriber<T, U> extends BasicFuseableConditionalSubscriber<T, U> {
        public final Function f;

        public MapConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, Function function) {
            super(conditionalSubscriber);
            this.f = function;
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        public final boolean f(Object obj) {
            if (this.d) {
                return true;
            }
            int i = this.e;
            ConditionalSubscriber conditionalSubscriber = this.a;
            if (i != 0) {
                conditionalSubscriber.f(null);
                return true;
            }
            try {
                Object objApply = this.f.apply(obj);
                Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                return conditionalSubscriber.f(objApply);
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (this.d) {
                return;
            }
            int i = this.e;
            ConditionalSubscriber conditionalSubscriber = this.a;
            if (i != 0) {
                conditionalSubscriber.onNext(null);
                return;
            }
            try {
                Object objApply = this.f.apply(obj);
                Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                conditionalSubscriber.onNext(objApply);
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.f.apply(objPoll);
            Objects.requireNonNull(objApply, "The mapper function returned a null value.");
            return objApply;
        }
    }

    public static final class MapSubscriber<T, U> extends BasicFuseableSubscriber<T, U> {
        public final Function f;

        public MapSubscriber(gnc1 gnc1Var, Function function) {
            super(gnc1Var);
            this.f = function;
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (this.d) {
                return;
            }
            int i = this.e;
            gnc1 gnc1Var = this.a;
            if (i != 0) {
                gnc1Var.onNext(null);
                return;
            }
            try {
                Object objApply = this.f.apply(obj);
                Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                gnc1Var.onNext(objApply);
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.f.apply(objPoll);
            Objects.requireNonNull(objApply, "The mapper function returned a null value.");
            return objApply;
        }
    }

    public FlowableMap(Flowable flowable, Function function) {
        super(flowable);
        this.c = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        boolean z = gnc1Var instanceof ConditionalSubscriber;
        Function function = this.c;
        Flowable flowable = this.b;
        if (z) {
            flowable.subscribe((FlowableSubscriber) new MapConditionalSubscriber((ConditionalSubscriber) gnc1Var, function));
        } else {
            flowable.subscribe((FlowableSubscriber) new MapSubscriber(gnc1Var, function));
        }
    }
}
