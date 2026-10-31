package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import java.util.Iterator;
import java.util.Objects;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableFromIterable<T> extends Flowable<T> {
    public final Iterable b;

    public static abstract class BaseRangeSubscription<T> extends BasicQueueSubscription<T> {
        public Iterator a;
        public volatile boolean b;
        public boolean c;

        public BaseRangeSubscription(Iterator it) {
            this.a = it;
        }

        public final int a(int i) {
            return 1;
        }

        public abstract void b();

        public abstract void c(long j);

        public final void cancel() {
            this.b = true;
        }

        public final void clear() {
            this.a = null;
        }

        public final boolean isEmpty() {
            Iterator it = this.a;
            if (it == null) {
                return true;
            }
            if (!this.c || it.hasNext()) {
                return false;
            }
            this.a = null;
            return true;
        }

        public final Object poll() {
            Iterator it = this.a;
            if (it == null) {
                return null;
            }
            if (!this.c) {
                this.c = true;
            } else if (!it.hasNext()) {
                return null;
            }
            Object next = this.a.next();
            Objects.requireNonNull(next, "Iterator.next() returned a null value");
            return next;
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

    public static final class IteratorConditionalSubscription<T> extends BaseRangeSubscription<T> {
        public final ConditionalSubscriber d;

        public IteratorConditionalSubscription(ConditionalSubscriber conditionalSubscriber, Iterator it) {
            super(it);
            this.d = conditionalSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public final void b() {
            Iterator it = this.a;
            ConditionalSubscriber conditionalSubscriber = this.d;
            while (!this.b) {
                try {
                    Object next = it.next();
                    if (this.b) {
                        return;
                    }
                    if (next == null) {
                        conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    conditionalSubscriber.f(next);
                    if (this.b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.b) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.a(th);
                        conditionalSubscriber.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.a(th2);
                    conditionalSubscriber.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public final void c(long j) {
            Iterator it = this.a;
            ConditionalSubscriber conditionalSubscriber = this.d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    } else {
                        if (this.b) {
                            return;
                        }
                        try {
                            Object next = it.next();
                            if (this.b) {
                                return;
                            }
                            if (next == null) {
                                conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean zF = conditionalSubscriber.f(next);
                            if (this.b) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.b) {
                                        return;
                                    }
                                    conditionalSubscriber.onComplete();
                                    return;
                                } else if (zF) {
                                    j2++;
                                }
                            } catch (Throwable th) {
                                Exceptions.a(th);
                                conditionalSubscriber.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.a(th2);
                            conditionalSubscriber.onError(th2);
                            return;
                        }
                    }
                }
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }

    public static final class IteratorSubscription<T> extends BaseRangeSubscription<T> {
        public final gnc1 d;

        public IteratorSubscription(gnc1 gnc1Var, Iterator it) {
            super(it);
            this.d = gnc1Var;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public final void b() {
            Iterator it = this.a;
            gnc1 gnc1Var = this.d;
            while (!this.b) {
                try {
                    Object next = it.next();
                    if (this.b) {
                        return;
                    }
                    if (next == null) {
                        gnc1Var.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    gnc1Var.onNext(next);
                    if (this.b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.b) {
                                return;
                            }
                            gnc1Var.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.a(th);
                        gnc1Var.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.a(th2);
                    gnc1Var.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public final void c(long j) {
            Iterator it = this.a;
            gnc1 gnc1Var = this.d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    } else {
                        if (this.b) {
                            return;
                        }
                        try {
                            Object next = it.next();
                            if (this.b) {
                                return;
                            }
                            if (next == null) {
                                gnc1Var.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            gnc1Var.onNext(next);
                            if (this.b) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.b) {
                                        return;
                                    }
                                    gnc1Var.onComplete();
                                    return;
                                }
                                j2++;
                            } catch (Throwable th) {
                                Exceptions.a(th);
                                gnc1Var.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.a(th2);
                            gnc1Var.onError(th2);
                            return;
                        }
                    }
                }
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }

    public FlowableFromIterable(Iterable iterable) {
        this.b = iterable;
    }

    public static <T> void subscribe(gnc1 gnc1Var, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                EmptySubscription.b(gnc1Var);
            } else if (gnc1Var instanceof ConditionalSubscriber) {
                gnc1Var.onSubscribe(new IteratorConditionalSubscription((ConditionalSubscriber) gnc1Var, it));
            } else {
                gnc1Var.onSubscribe(new IteratorSubscription(gnc1Var, it));
            }
        } catch (Throwable th) {
            Exceptions.a(th);
            EmptySubscription.c(th, gnc1Var);
        }
    }

    public final void V(gnc1 gnc1Var) {
        try {
            subscribe(gnc1Var, this.b.iterator());
        } catch (Throwable th) {
            Exceptions.a(th);
            gnc1Var.onSubscribe(EmptySubscription.a);
            gnc1Var.onError(th);
        }
    }
}
