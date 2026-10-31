package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u2a1 implements SingleTransformer, Function {
    public final /* synthetic */ n381 a;
    public final /* synthetic */ Scheduler b;

    public /* synthetic */ u2a1(n381 n381Var, Scheduler scheduler) {
        this.a = n381Var;
        this.b = scheduler;
    }

    public Object apply(Object obj) {
        String str = ((o2a1) obj).a ? "enabled" : "disabled";
        return rca.A((rca) this.a.b, str, (fq21) null, 2, (Object) null).toObservable().map(new hdn1(str, (byte) 7)).timeout(10000L, TimeUnit.MILLISECONDS, this.b, Observable.error(new TimeoutException())).onErrorReturn(new vdn1(str, (byte) 17));
    }

    public Single c(Single single) {
        return single.flatMap(new n381(this.a, this.b, (byte) 21));
    }
}
