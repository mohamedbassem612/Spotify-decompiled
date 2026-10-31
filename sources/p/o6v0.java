package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnErrorReturn;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o6v0 {
    public final yqg a;
    public final m021 b;
    public final Flowable c;

    public o6v0(yqg yqgVar, m021 m021Var, Flowable flowable) {
        this.a = yqgVar;
        this.b = m021Var;
        this.c = flowable;
    }

    public final FlowableOnErrorReturn a() {
        m021 m021Var = this.b;
        Flowable flowableU = Flowable.h(((Flowable) m021Var.b).X(new mlw0(m021Var, (byte) 23)), this.c, new qkn0(this, (byte) 25)).U(l6v0.a);
        flowableU.getClass();
        return flowableU.t(Functions.a).M(zi20.Z0);
    }
}
