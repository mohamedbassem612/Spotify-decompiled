package io.reactivex.rxjava3.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.schedulers.ComputationScheduler;
import io.reactivex.rxjava3.internal.schedulers.IoScheduler;
import io.reactivex.rxjava3.internal.schedulers.NewThreadScheduler;
import io.reactivex.rxjava3.internal.schedulers.SingleScheduler;
import io.reactivex.rxjava3.internal.schedulers.TrampolineScheduler;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class Schedulers {
    public static final Scheduler a = RxJavaPlugins.a(new SingleTask());
    public static final Scheduler b = RxJavaPlugins.a(new ComputationTask());
    public static final Scheduler c = RxJavaPlugins.a(new IOTask());
    public static final TrampolineScheduler d = TrampolineScheduler.c;

    public static final class ComputationHolder {
        public static final ComputationScheduler a = new ComputationScheduler();
    }

    public static final class ComputationTask implements Supplier<Scheduler> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return ComputationHolder.a;
        }
    }

    public static final class IOTask implements Supplier<Scheduler> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return IoHolder.a;
        }
    }

    public static final class IoHolder {
        public static final IoScheduler a = new IoScheduler();
    }

    public static final class NewThreadHolder {
        public static final NewThreadScheduler a = new NewThreadScheduler();
    }

    public static final class NewThreadTask implements Supplier<Scheduler> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return NewThreadHolder.a;
        }
    }

    public static final class SingleHolder {
        public static final SingleScheduler a = new SingleScheduler();
    }

    public static final class SingleTask implements Supplier<Scheduler> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return SingleHolder.a;
        }
    }

    static {
        RxJavaPlugins.a(new NewThreadTask());
    }
}
