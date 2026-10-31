package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableRange extends Flowable<Integer> {
    public final boolean b;
    public final int c;

    public static abstract class BaseRangeSubscription extends BasicQueueSubscription<Integer> {
        public final int a;
        public int b;
        public volatile boolean c;

        public BaseRangeSubscription(int i, int i2) {
            this.b = i;
            this.a = i2;
        }

        public final int a(int i) {
            return 1;
        }

        public abstract void b();

        public abstract void c(long j);

        public final void cancel() {
            this.c = true;
        }

        public final void clear() {
            this.b = this.a;
        }

        public final boolean isEmpty() {
            return this.b == this.a;
        }

        public final Object poll() {
            int i = this.b;
            if (i == this.a) {
                return null;
            }
            this.b = i + 1;
            return Integer.valueOf(i);
        }

        public final void request(long j) {
            if (SubscriptionHelper.e(j) && BackpressureHelper.a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    b();
                } else {
                    c(j);
                }
            }
        }
    }

    public static final class RangeConditionalSubscription extends BaseRangeSubscription {
        public final ConditionalSubscriber d;

        public RangeConditionalSubscription(ConditionalSubscriber conditionalSubscriber, int i, int i2) {
            super(i, i2);
            this.d = conditionalSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public final void b() {
            int i = this.a;
            ConditionalSubscriber conditionalSubscriber = this.d;
            int i2 = this.b;
            while (true) {
                boolean z = this.c;
                if (i2 == i) {
                    if (z) {
                        return;
                    }
                    conditionalSubscriber.onComplete();
                    return;
                } else {
                    if (z) {
                        return;
                    }
                    conditionalSubscriber.f(Integer.valueOf(i2));
                    i2++;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public final void c(long j) {
            int i = this.a;
            int i2 = this.b;
            ConditionalSubscriber conditionalSubscriber = this.d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == i) {
                        if (i2 == i) {
                            if (this.c) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.c) {
                            return;
                        }
                        if (conditionalSubscriber.f(Integer.valueOf(i2))) {
                            j2++;
                        }
                        i2++;
                    }
                }
                this.b = i2;
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }

    public static final class RangeSubscription extends BaseRangeSubscription {
        public final gnc1 d;

        public RangeSubscription(gnc1 gnc1Var, int i, int i2) {
            super(i, i2);
            this.d = gnc1Var;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public final void b() {
            int i = this.a;
            gnc1 gnc1Var = this.d;
            int i2 = this.b;
            while (true) {
                boolean z = this.c;
                if (i2 == i) {
                    if (z) {
                        return;
                    }
                    gnc1Var.onComplete();
                    return;
                } else {
                    if (z) {
                        return;
                    }
                    gnc1Var.onNext(Integer.valueOf(i2));
                    i2++;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public final void c(long j) {
            int i = this.a;
            int i2 = this.b;
            gnc1 gnc1Var = this.d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == i) {
                        if (i2 == i) {
                            if (this.c) {
                                return;
                            }
                            gnc1Var.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.c) {
                            return;
                        }
                        gnc1Var.onNext(Integer.valueOf(i2));
                        j2++;
                        i2++;
                    }
                }
                this.b = i2;
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlowableRange(int i, int i2) {
        this.b = i;
        this.c = i + i2;
    }

    public final void V(gnc1 gnc1Var) {
        boolean z = gnc1Var instanceof ConditionalSubscriber;
        int i = this.c;
        boolean z2 = this.b;
        if (z) {
            gnc1Var.onSubscribe(new RangeConditionalSubscription((ConditionalSubscriber) gnc1Var, z2 ? 1 : 0, i));
        } else {
            gnc1Var.onSubscribe(new RangeSubscription(gnc1Var, z2 ? 1 : 0, i));
        }
    }
}
