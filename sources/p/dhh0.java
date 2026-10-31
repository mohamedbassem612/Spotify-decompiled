package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dhh0 implements Function {
    public final /* synthetic */ s24 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ m210 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ a710 e;

    public dhh0(s24 s24Var, long j, m210 m210Var, int i, a710 a710Var) {
        this.a = s24Var;
        this.b = j;
        this.c = m210Var;
        this.d = i;
        this.e = a710Var;
    }

    public final Object apply(Object obj) {
        xp91 xp91Var = (xp91) obj;
        boolean z = xp91Var instanceof wp91;
        s24 s24Var = this.a;
        if (!z) {
            return s24Var.X(this.b, this.c);
        }
        Flowable flowable = (Flowable) s24Var.d;
        return new FlowableSingleSingle(ydh.f(flowable, flowable)).flatMapCompletable(new chh0(s24Var, this.d, this.b, this.c, this.e, xp91Var));
    }
}
