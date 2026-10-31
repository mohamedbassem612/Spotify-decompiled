package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yc31 implements SingleTransformer, Function {
    public final iu30 a;

    public yc31() {
        this.a = xt21.V0;
    }

    public /* synthetic */ Object apply(Object obj) {
        return this.a.invoke(obj);
    }

    public Single c(Single single) {
        return single.retryWhen(new uqv0(this, (byte) 26));
    }

    public yc31(iu30 iu30Var) {
        this.a = iu30Var;
    }
}
