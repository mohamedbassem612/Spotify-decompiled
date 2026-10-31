package p;

import com.spotify.messages.UbiExpr1Heartbeat;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s8h1 {
    public final t2j0 a;
    public final Scheduler b;
    public final yqg c;
    public final kly0 d;
    public Disposable e = EmptyDisposable.a;
    public final Object f = new Object();
    public Long g;

    public s8h1(t2j0 t2j0Var, Scheduler scheduler, yqg yqgVar, tsq tsqVar) {
        this.a = t2j0Var;
        this.b = scheduler;
        this.c = yqgVar;
        this.d = tsqVar;
    }

    public final void a(UbiExpr1Heartbeat ubiExpr1Heartbeat) {
        Observable<Long> observableInterval = Observable.interval(((r8h1) this.d.get()).b, TimeUnit.SECONDS);
        Scheduler scheduler = this.b;
        this.e = observableInterval.subscribeOn(scheduler).observeOn(scheduler).doOnNext(new z0u0(this, ubiExpr1Heartbeat, (byte) 28)).doOnError(wx91.g).subscribe();
    }
}
