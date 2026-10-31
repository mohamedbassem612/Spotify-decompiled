package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lkl1 implements f0f1 {
    public final kkl1 a;
    public final Scheduler b;
    public final so c;
    public final PublishSubject d = new PublishSubject();
    public final AtomicBoolean e = new AtomicBoolean(false);

    public lkl1(kkl1 kkl1Var, Scheduler scheduler, so soVar) {
        this.a = kkl1Var;
        this.b = scheduler;
        this.c = soVar;
    }

    public final void a() {
        this.e.set(true);
        cancel();
    }

    public final void b() {
        this.e.set(false);
    }

    public final Object c(int i) {
        return f(i, false);
    }

    public final void cancel() {
        this.d.onNext(sih1.a);
    }

    public final Object d(int i, yy81 yy81Var) {
        return f(i, true);
    }

    public final Observable e(int i, boolean z) {
        return this.a.a(z ? "1" : "0").toObservable().compose(this.c).map(pdx0.Y0).takeUntil(this.d).firstOrError().onErrorReturn(rdx0.X0).doOnError(vrk1.i).timeout(i, TimeUnit.MILLISECONDS, this.b, Single.just(j5.a)).toObservable();
    }

    public final q0f1 f(int i, boolean z) {
        if (!this.e.get()) {
            try {
                spq0 spq0Var = (spq0) e(i, z).blockingFirst();
                if (spq0Var.c()) {
                    return (q0f1) spq0Var.b();
                }
            } catch (RuntimeException e) {
                if (e.getCause() != null) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (cause.getClass().equals(InterruptedException.class)) {
                        cancel();
                        Thread.currentThread().interrupt();
                        return null;
                    }
                }
                throw e;
            }
        }
        return null;
    }
}
