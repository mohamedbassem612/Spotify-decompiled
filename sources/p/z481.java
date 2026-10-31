package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromCallable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z481 implements iu30 {
    public final Scheduler a;
    public final vas b;
    public final b431 c;

    public z481(cir0 cir0Var, Scheduler scheduler, vas vasVar) {
        this.a = scheduler;
        this.b = vasVar;
        this.c = cir0Var.h().a(i7w0.j, new az41(this, (byte) 2));
    }

    public final Object invoke(Object obj) {
        return new CompletableFromCallable(new e71(this, (tv80) obj, (byte) 20)).s(this.a);
    }
}
