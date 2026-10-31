package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hhf1 implements o4h1 {
    public final Scheduler a;
    public final g341 b;
    public final vku c = new vku();
    public final BehaviorSubject d = BehaviorSubject.g(jhf1.a);

    public hhf1(Scheduler scheduler, g341 g341Var) {
        this.a = scheduler;
        this.b = g341Var;
    }

    @Override // p.o4h1
    public final void start() {
        Disposable disposableSubscribe = this.b.b(ihf1.a).timeout(2L, TimeUnit.SECONDS, Single.error(new TimeoutException())).observeOn(this.a).subscribe(new ghf1(this, (byte) 0), new ghf1(this, (byte) 1));
        disposableSubscribe.getClass();
        this.c.a(disposableSubscribe);
    }

    @Override // p.o4h1
    public final void stop() {
        this.c.c();
    }
}
