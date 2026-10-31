package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i1u0 implements f961 {
    public final tau0 a;
    public final g1u0 b;
    public final g0l c;
    public final e6u0 d;
    public final dpb e;
    public final vku f;
    public boolean g;
    public final ReentrantLock h;
    public volatile boolean i;

    public i1u0(Scheduler scheduler, Flowable flowable, tau0 tau0Var, g1u0 g1u0Var, g0l g0lVar, e6u0 e6u0Var, dpb dpbVar) {
        this.a = tau0Var;
        this.b = g1u0Var;
        this.c = g0lVar;
        this.d = e6u0Var;
        this.e = dpbVar;
        vku vkuVar = new vku();
        this.f = vkuVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.h = reentrantLock;
        vkuVar.a(Flowable.e(flowable, ((inr) g0lVar).d().toFlowable(BackpressureStrategy.d), yoi1.h(e6u0Var.c, o6x.a).X(aj20.Y0), vf61.e1).L(scheduler).subscribe((Consumer) new ixp0(this, (byte) 18)));
        reentrantLock.lock();
        try {
            this.i = true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a() {
        l0l l0lVarC = this.c.c();
        if (l0lVarC != null ? l0lVarC.l() : false) {
            this.f.a(this.a.a().a(q9u0.c("PlaybackNotificationManager", false)).subscribe());
        }
        if (this.g) {
            this.b.e();
            this.g = false;
        }
    }

    public final void b() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (this.i) {
                a();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p.dwo
    public final void shutdown() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            this.i = false;
            reentrantLock.unlock();
            a();
            this.f.c();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
