package p;

import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qg60 implements pg60 {
    public final gg11 a;
    public final Scheduler b;
    public final idd1 c = new idd1(new g050(this, (byte) 16));

    public qg60(gg11 gg11Var, Scheduler scheduler) {
        this.a = gg11Var;
        this.b = scheduler;
    }

    @Override // p.pg60
    public final ObservableTransformer a() {
        return (ObservableTransformer) this.c.getValue();
    }

    @Override // p.pg60
    public final void b(String str, mfu mfuVar) {
        sg60 sg60Var = (sg60) this.a.get(str);
        if (sg60Var != null) {
            sg60Var.a(mfuVar);
        }
    }
}
