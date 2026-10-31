package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s2a1 implements Function, SingleTransformer {
    public final /* synthetic */ s1a1 a;
    public final /* synthetic */ n381 b;
    public final /* synthetic */ Scheduler c;
    public final /* synthetic */ r1a1 d;

    public /* synthetic */ s2a1(s1a1 s1a1Var, n381 n381Var, Scheduler scheduler, r1a1 r1a1Var) {
        this.a = s1a1Var;
        this.b = n381Var;
        this.c = scheduler;
        this.d = r1a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    public Object apply(Object obj) {
        Single singleL;
        String str = (String) obj;
        rca rcaVar = (rca) this.b.b;
        s1a1 s1a1Var = this.a;
        kx91 kx91Var = s1a1Var.b;
        if (kx91Var == null) {
            singleL = rca.L(rcaVar, str, (String) null, (fq21) null, 4, (Object) null);
        } else {
            singleL = rca.g(rcaVar, new mqi1(str, kx91Var.a != null ? new wg61() : null, kx91Var.b != null ? new fb61() : null), (fq21) null, 2, (Object) null);
            if (singleL == null) {
                singleL = rca.L(rcaVar, str, (String) null, (fq21) null, 4, (Object) null);
            }
        }
        return singleL.flatMap(new pob((byte) 25, false)).timeout(10000L, TimeUnit.MILLISECONDS, this.c, Single.error(new TimeoutException())).doOnError(new z0u0((byte) 19, new Object[0], "createNewSession failed")).map(new r2a1(s1a1Var, this.d, (byte) 0));
    }

    public Single c(Single single) {
        return single.flatMap(new s2a1(this.a, this.b, this.c, this.d));
    }
}
