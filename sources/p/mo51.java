package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mo51 {
    public final Flowable a;
    public final Flowable b;
    public final w9u0 c;
    public final Consumer d;
    public final jn4 e;
    public final dma1 f;

    public mo51(Flowable flowable, Flowable flowable2, w9u0 w9u0Var, Consumer consumer, jn4 jn4Var, dma1 dma1Var) {
        this.a = flowable;
        this.b = flowable2;
        this.c = w9u0Var;
        this.d = consumer;
        this.e = jn4Var;
        this.f = dma1Var;
    }

    public final qo51 a(qzh qzhVar) {
        return new qo51(this.a, this.b, this.c, this.d, this.e, qzhVar, this.f);
    }
}
