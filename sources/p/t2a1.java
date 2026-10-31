package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t2a1 implements Function, SingleTransformer {
    public final /* synthetic */ n381 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Scheduler c;

    public /* synthetic */ t2a1(n381 n381Var, boolean z, Scheduler scheduler) {
        this.a = n381Var;
        this.b = z;
        this.c = scheduler;
    }

    public Object apply(Object obj) {
        return rca.Q((rca) this.a.b, (String) obj, this.b, (String) null, (fq21) null, 8, (Object) null).flatMap(new hwb((byte) 25)).timeout(10000L, TimeUnit.MILLISECONDS, this.c, Single.error(new TimeoutException())).map(l9x0.P0);
    }

    public Single c(Single single) {
        return single.flatMap(new t2a1(this.a, this.b, this.c));
    }
}
