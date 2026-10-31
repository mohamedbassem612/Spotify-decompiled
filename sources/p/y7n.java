package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y7n extends Scheduler.Worker {
    public boolean a;
    public final /* synthetic */ z7n b;

    public y7n(z7n z7nVar) {
        this.b = z7nVar;
    }

    public final Disposable b(Runnable runnable, long j, TimeUnit timeUnit) {
        z7n z7nVar = this.b;
        if (j <= 0) {
            ((d8n) z7nVar.c).c.post(runnable);
            return Disposable.e(Functions.b);
        }
        Disposable disposableSubscribe = Completable.u(j, timeUnit, Schedulers.b).g(new wf0(this, z7nVar, runnable, (byte) 7)).subscribe();
        disposableSubscribe.getClass();
        return disposableSubscribe;
    }

    public void dispose() {
        this.a = true;
    }

    public boolean isDisposed() {
        return this.a;
    }
}
