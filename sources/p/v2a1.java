package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v2a1 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n381 b;
    public final /* synthetic */ Scheduler c;

    public /* synthetic */ v2a1(n381 n381Var, Scheduler scheduler, byte b) {
        this.a = b;
        this.b = n381Var;
        this.c = scheduler;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        n381 n381Var = this.b;
        switch (b) {
            case 0:
                t1a1 t1a1Var = (t1a1) obj;
                String str = t1a1Var.a;
                return rca.w((rca) n381Var.b, str, (fq21) null, 2, (Object) null).p(y6x0.O0).e(Single.just(new l3a1(str, true))).timeout(10000L, TimeUnit.MILLISECONDS, this.c, Single.error(new TimeoutException())).doOnError(new z0u0((byte) 19, new Object[]{str}, "Failed to delete session %s")).toObservable().onErrorReturn(new c681(t1a1Var, (byte) 8));
            default:
                p2a1 p2a1Var = (p2a1) obj;
                return rca.q((rca) n381Var.b, p2a1Var.a ? "enabled" : "disabled", (fq21) null, 2, (Object) null).toObservable().map(new ks21(p2a1Var, (byte) 25)).timeout(10000L, TimeUnit.MILLISECONDS, this.c, Observable.error(new TimeoutException())).onErrorReturn(new xq81(p2a1Var, (byte) 4));
        }
    }
}
