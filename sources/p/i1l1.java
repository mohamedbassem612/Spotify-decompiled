package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromCallable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToSingle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i1l1 implements Function {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ j1l1 b;
    public final /* synthetic */ Scheduler c;
    public final /* synthetic */ n7m0 d;

    public i1l1(Scheduler scheduler, j1l1 j1l1Var, n7m0 n7m0Var) {
        this.c = scheduler;
        this.b = j1l1Var;
        this.d = n7m0Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        n7m0 n7m0Var = this.d;
        Scheduler scheduler = this.c;
        j1l1 j1l1Var = this.b;
        switch (b) {
            case 0:
                return new CompletableFromCallable(new wra(j1l1Var, (spq0) obj, n7m0Var, (byte) 10)).s(scheduler);
            default:
                return new MaybeToSingle(j1l1Var.f.firstElement().f(f2x0.X0), j5.a).flatMapCompletable(new i1l1(scheduler, j1l1Var, n7m0Var)).w();
        }
    }

    public i1l1(j1l1 j1l1Var, Scheduler scheduler, n7m0 n7m0Var) {
        this.b = j1l1Var;
        this.c = scheduler;
        this.d = n7m0Var;
    }
}
