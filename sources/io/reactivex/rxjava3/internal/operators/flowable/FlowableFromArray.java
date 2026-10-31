package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import java.util.Objects;
import p.gnc1;
import p.gvg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableFromArray<T> extends Flowable<T> {
    public final Object[] b;

    public static final class ArrayConditionalSubscription<T> extends BaseArraySubscription<T> {
        public final ConditionalSubscriber d;

        public ArrayConditionalSubscription(ConditionalSubscriber conditionalSubscriber, Object[] objArr) {
            super(objArr);
            this.d = conditionalSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public final void b() {
            Object[] objArr = this.a;
            int length = objArr.length;
            ConditionalSubscriber conditionalSubscriber = this.d;
            int i = this.b;
            while (true) {
                boolean z = this.c;
                if (i == length) {
                    if (z) {
                        return;
                    }
                    conditionalSubscriber.onComplete();
                    return;
                } else {
                    if (z) {
                        return;
                    }
                    Object obj = objArr[i];
                    if (obj == null) {
                        conditionalSubscriber.onError(new NullPointerException(gvg.e(i, "The element at index ", " is null")));
                        return;
                    } else {
                        conditionalSubscriber.f(obj);
                        i++;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public final void c(long j) {
            Object[] objArr = this.a;
            int length = objArr.length;
            int i = this.b;
            ConditionalSubscriber conditionalSubscriber = this.d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i == length) {
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
                        Object obj = objArr[i];
                        if (obj == null) {
                            conditionalSubscriber.onError(new NullPointerException(gvg.e(i, "The element at index ", " is null")));
                            return;
                        } else {
                            if (conditionalSubscriber.f(obj)) {
                                j2++;
                            }
                            i++;
                        }
                    }
                }
                this.b = i;
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }

    public static final class ArraySubscription<T> extends BaseArraySubscription<T> {
        public final gnc1 d;

        public ArraySubscription(gnc1 gnc1Var, Object[] objArr) {
            super(objArr);
            this.d = gnc1Var;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public final void b() {
            Object[] objArr = this.a;
            int length = objArr.length;
            gnc1 gnc1Var = this.d;
            int i = this.b;
            while (true) {
                boolean z = this.c;
                if (i == length) {
                    if (z) {
                        return;
                    }
                    gnc1Var.onComplete();
                    return;
                } else {
                    if (z) {
                        return;
                    }
                    Object obj = objArr[i];
                    if (obj == null) {
                        gnc1Var.onError(new NullPointerException(gvg.e(i, "The element at index ", " is null")));
                        return;
                    } else {
                        gnc1Var.onNext(obj);
                        i++;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public final void c(long j) {
            Object[] objArr = this.a;
            int length = objArr.length;
            int i = this.b;
            gnc1 gnc1Var = this.d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i == length) {
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
                        Object obj = objArr[i];
                        if (obj == null) {
                            gnc1Var.onError(new NullPointerException(gvg.e(i, "The element at index ", " is null")));
                            return;
                        } else {
                            gnc1Var.onNext(obj);
                            j2++;
                            i++;
                        }
                    }
                }
                this.b = i;
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }

    public static abstract class BaseArraySubscription<T> extends BasicQueueSubscription<T> {
        public final Object[] a;
        public int b;
        public volatile boolean c;

        public BaseArraySubscription(Object[] objArr) {
            this.a = objArr;
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
            this.b = this.a.length;
        }

        public final boolean isEmpty() {
            return this.b == this.a.length;
        }

        public final Object poll() {
            int i = this.b;
            Object[] objArr = this.a;
            if (i == objArr.length) {
                return null;
            }
            this.b = i + 1;
            Object obj = objArr[i];
            Objects.requireNonNull(obj, "array element is null");
            return obj;
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

    public FlowableFromArray(Object[] objArr) {
        this.b = objArr;
    }

    public final void V(gnc1 gnc1Var) {
        boolean z = gnc1Var instanceof ConditionalSubscriber;
        Object[] objArr = this.b;
        if (z) {
            gnc1Var.onSubscribe(new ArrayConditionalSubscription((ConditionalSubscriber) gnc1Var, objArr));
        } else {
            gnc1Var.onSubscribe(new ArraySubscription(gnc1Var, objArr));
        }
    }
}
