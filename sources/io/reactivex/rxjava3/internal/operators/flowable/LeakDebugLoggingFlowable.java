package io.reactivex.rxjava3.internal.operators.flowable;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import p.gnc1;
import p.nhc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lio/reactivex/rxjava3/internal/operators/flowable/LeakDebugLoggingFlowable;", "", "T", "Lio/reactivex/rxjava3/internal/operators/flowable/FlowableWithUpstream;", "LoggerSubscriber", "third_party_java_io_reactivex_rxjava3_internal_operators_flowable-rxjava3flowableext"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LeakDebugLoggingFlowable<T> extends FlowableWithUpstream<T, T> {
    public final String c;
    public final AtomicInteger d;
    public final AtomicInteger e;
    public final Map f;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lio/reactivex/rxjava3/internal/operators/flowable/LeakDebugLoggingFlowable$LoggerSubscriber;", "Lio/reactivex/rxjava3/core/FlowableSubscriber;", "Lp/pnc1;", "third_party_java_io_reactivex_rxjava3_internal_operators_flowable-rxjava3flowableext"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class LoggerSubscriber implements FlowableSubscriber<T>, pnc1 {
        public final gnc1 a;
        public final int b;
        public pnc1 c;
        public boolean d;
        public String e;

        public LoggerSubscriber(gnc1 gnc1Var, int i) {
            this.a = gnc1Var;
            this.b = i;
        }

        public static ArrayList a(StackTraceElement[] stackTraceElementArr) {
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                String className = stackTraceElement.getClassName();
                className.getClass();
                if (nhc1.Y(className, "com.spotify", false) && !nhc1.Y(className, "com.spotify.rxjava", false)) {
                    arrayList.add(stackTraceElement);
                }
            }
            return arrayList;
        }

        public final void cancel() {
            pnc1 pnc1Var = this.c;
            if (pnc1Var != null) {
                pnc1Var.cancel();
            }
            synchronized (this) {
                LeakDebugLoggingFlowable.this.d.decrementAndGet();
            }
            ArrayList arrayListA = a(Thread.currentThread().getStackTrace());
            if (!arrayListA.isEmpty()) {
                StackTraceElement stackTraceElement = (StackTraceElement) arrayListA.get(0);
                LeakDebugLoggingFlowable leakDebugLoggingFlowable = LeakDebugLoggingFlowable.this;
                Logger.g("%s: Unsubscribed (%d): %s. Original subscription line: %s", new Object[]{leakDebugLoggingFlowable.c, Integer.valueOf(leakDebugLoggingFlowable.d.get()), stackTraceElement.toString(), this.e});
            }
            LeakDebugLoggingFlowable.this.f.remove(Integer.valueOf(this.b));
            this.e = null;
        }

        public final void onComplete() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.b(th);
            } else {
                this.d = true;
                this.a.onError(th);
            }
        }

        public final void onNext(Object obj) {
            if (this.d) {
                return;
            }
            this.a.onNext(obj);
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            LeakDebugLoggingFlowable leakDebugLoggingFlowable = LeakDebugLoggingFlowable.this;
            AtomicInteger atomicInteger = leakDebugLoggingFlowable.d;
            if (SubscriptionHelper.f(this.c, pnc1Var)) {
                this.c = pnc1Var;
                this.a.onSubscribe(this);
                atomicInteger.incrementAndGet();
                ArrayList arrayListA = a(Thread.currentThread().getStackTrace());
                if (!arrayListA.isEmpty()) {
                    StackTraceElement stackTraceElement = (StackTraceElement) arrayListA.get(0);
                    this.e = stackTraceElement.toString();
                    Logger.g("%s: Subscribed (%d): %s", new Object[]{leakDebugLoggingFlowable.c, Integer.valueOf(atomicInteger.get()), stackTraceElement.toString()});
                }
                String str = this.e;
                if (str != null) {
                    leakDebugLoggingFlowable.f.put(Integer.valueOf(this.b), str);
                }
            }
        }

        public final void request(long j) {
            pnc1 pnc1Var = this.c;
            if (pnc1Var != null) {
                pnc1Var.request(j);
            }
        }
    }

    public LeakDebugLoggingFlowable(Flowable flowable) {
        super(flowable);
        this.c = "PlayerSubscriptions";
        this.d = new AtomicInteger(0);
        this.e = new AtomicInteger(0);
        this.f = Collections.synchronizedMap(new HashMap(50));
    }

    public final void V(gnc1 gnc1Var) {
        this.b.subscribe(new LoggerSubscriber(gnc1Var, this.e.incrementAndGet()));
    }
}
