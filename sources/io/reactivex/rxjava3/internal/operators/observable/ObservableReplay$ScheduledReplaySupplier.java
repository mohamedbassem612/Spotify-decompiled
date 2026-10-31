package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableReplay$ScheduledReplaySupplier<T> implements ObservableReplay.BufferSupplier<T> {
    public final int a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final boolean e;

    public ObservableReplay$ScheduledReplaySupplier(int i, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        this.a = i;
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
        this.e = z;
    }

    public final ObservableReplay.ReplayBuffer call() {
        final Scheduler scheduler = this.d;
        final boolean z = this.e;
        final int i = this.a;
        final long j = this.b;
        final TimeUnit timeUnit = this.c;
        return new ObservableReplay.BoundedReplayBuffer<T>(i, j, timeUnit, scheduler, z) { // from class: io.reactivex.rxjava3.internal.operators.observable.ObservableReplay$SizeAndTimeBoundReplayBuffer
            public final Scheduler d;
            public final long e;
            public final TimeUnit f;
            public final int g;

            {
                super(z);
                this.d = scheduler;
                this.g = i;
                this.e = j;
                this.f = timeUnit;
            }

            public final Object a(Object obj) {
                this.d.getClass();
                TimeUnit timeUnit2 = this.f;
                return new Timed(obj, Scheduler.a(timeUnit2), timeUnit2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final ObservableReplay.Node c() {
                ObservableReplay.Node node;
                this.d.getClass();
                long jA = Scheduler.a(this.f) - this.e;
                ObservableReplay.Node node2 = (ObservableReplay.Node) get();
                Object obj = node2.get();
                while (true) {
                    ObservableReplay.Node node3 = (ObservableReplay.Node) obj;
                    node = node2;
                    node2 = node3;
                    if (node2 == null) {
                        break;
                    }
                    Timed timed = (Timed) node2.a;
                    if (NotificationLite.g(timed.a) || NotificationLite.h(timed.a) || timed.b > jA) {
                        break;
                    }
                    obj = node2.get();
                }
                return node;
            }

            public final Object f(Object obj) {
                return ((Timed) obj).a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void h() {
                ObservableReplay.Node node;
                this.d.getClass();
                long jA = Scheduler.a(this.f) - this.e;
                ObservableReplay.Node node2 = (ObservableReplay.Node) get();
                ObservableReplay.Node node3 = (ObservableReplay.Node) node2.get();
                int i2 = 0;
                while (true) {
                    ObservableReplay.Node node4 = node3;
                    node = node2;
                    node2 = node4;
                    int i3 = ((ObservableReplay.BoundedReplayBuffer) this).b;
                    if (i3 > 1) {
                        if (i3 <= this.g) {
                            if (((Timed) node2.a).b > jA) {
                                break;
                            }
                            i2++;
                            ((ObservableReplay.BoundedReplayBuffer) this).b = i3 - 1;
                            node3 = (ObservableReplay.Node) node2.get();
                        } else {
                            i2++;
                            ((ObservableReplay.BoundedReplayBuffer) this).b = i3 - 1;
                            node3 = (ObservableReplay.Node) node2.get();
                        }
                    } else {
                        break;
                    }
                }
                if (i2 != 0) {
                    g(node);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void j() {
                ObservableReplay.Node node;
                this.d.getClass();
                long jA = Scheduler.a(this.f) - this.e;
                ObservableReplay.Node node2 = (ObservableReplay.Node) get();
                ObservableReplay.Node node3 = (ObservableReplay.Node) node2.get();
                int i2 = 0;
                while (true) {
                    ObservableReplay.Node node4 = node3;
                    node = node2;
                    node2 = node4;
                    int i3 = ((ObservableReplay.BoundedReplayBuffer) this).b;
                    if (i3 <= 1 || ((Timed) node2.a).b > jA) {
                        break;
                    }
                    i2++;
                    ((ObservableReplay.BoundedReplayBuffer) this).b = i3 - 1;
                    node3 = (ObservableReplay.Node) node2.get();
                }
                if (i2 != 0) {
                    g(node);
                }
            }
        };
    }
}
