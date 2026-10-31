package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableDistinctUntilChanged<T, K> extends AbstractFlowableWithUpstream<T, T> {
    public final Function c;
    public final BiPredicate d;

    public static final class DistinctUntilChangedConditionalSubscriber<T, K> extends BasicFuseableConditionalSubscriber<T, T> {
        public final Function f;
        public final BiPredicate g;
        public Object h;
        public boolean i;

        public DistinctUntilChangedConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, Function function, BiPredicate biPredicate) {
            super(conditionalSubscriber);
            this.f = function;
            this.g = biPredicate;
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        public final boolean f(Object obj) {
            if (this.d) {
                return false;
            }
            int i = this.e;
            ConditionalSubscriber conditionalSubscriber = this.a;
            if (i != 0) {
                return conditionalSubscriber.f(obj);
            }
            try {
                Object objApply = this.f.apply(obj);
                if (this.i) {
                    boolean zTest = this.g.test(this.h, objApply);
                    this.h = objApply;
                    if (zTest) {
                        return false;
                    }
                } else {
                    this.i = true;
                    this.h = objApply;
                }
                conditionalSubscriber.onNext(obj);
                return true;
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
            while (true) {
                Object objPoll = this.c.poll();
                if (objPoll == null) {
                    return null;
                }
                Object objApply = this.f.apply(objPoll);
                if (!this.i) {
                    this.i = true;
                    this.h = objApply;
                    return objPoll;
                }
                if (!this.g.test(this.h, objApply)) {
                    this.h = objApply;
                    return objPoll;
                }
                this.h = objApply;
                if (this.e != 1) {
                    this.b.request(1L);
                }
            }
        }
    }

    public static final class DistinctUntilChangedSubscriber<T, K> extends BasicFuseableSubscriber<T, T> implements ConditionalSubscriber<T> {
        public final Function f;
        public final BiPredicate g;
        public Object h;
        public boolean i;

        public DistinctUntilChangedSubscriber(gnc1 gnc1Var, Function function, BiPredicate biPredicate) {
            super(gnc1Var);
            this.f = function;
            this.g = biPredicate;
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        public final boolean f(Object obj) {
            if (this.d) {
                return false;
            }
            int i = this.e;
            gnc1 gnc1Var = this.a;
            if (i != 0) {
                gnc1Var.onNext(obj);
                return true;
            }
            try {
                Object objApply = this.f.apply(obj);
                if (this.i) {
                    boolean zTest = this.g.test(this.h, objApply);
                    this.h = objApply;
                    if (zTest) {
                        return false;
                    }
                } else {
                    this.i = true;
                    this.h = objApply;
                }
                gnc1Var.onNext(obj);
                return true;
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
            while (true) {
                Object objPoll = this.c.poll();
                if (objPoll == null) {
                    return null;
                }
                Object objApply = this.f.apply(objPoll);
                if (!this.i) {
                    this.i = true;
                    this.h = objApply;
                    return objPoll;
                }
                if (!this.g.test(this.h, objApply)) {
                    this.h = objApply;
                    return objPoll;
                }
                this.h = objApply;
                if (this.e != 1) {
                    this.b.request(1L);
                }
            }
        }
    }

    public FlowableDistinctUntilChanged(Flowable flowable, Function function, BiPredicate biPredicate) {
        super(flowable);
        this.c = function;
        this.d = biPredicate;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        boolean z = gnc1Var instanceof ConditionalSubscriber;
        BiPredicate biPredicate = this.d;
        Function function = this.c;
        Flowable flowable = this.b;
        if (z) {
            flowable.subscribe((FlowableSubscriber) new DistinctUntilChangedConditionalSubscriber((ConditionalSubscriber) gnc1Var, function, biPredicate));
        } else {
            flowable.subscribe((FlowableSubscriber) new DistinctUntilChangedSubscriber(gnc1Var, function, biPredicate));
        }
    }
}
