package p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ild0 implements f961 {
    public final llm a;
    public final LinkedHashSet b;
    public final dt71 c;
    public final boolean d;

    public ild0(Flowable flowable, uq4 uq4Var) {
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        llm llmVarE = smo1.e(ha71.A(j0d1VarB, pyf0.a.f));
        this.a = llmVarE;
        this.b = new LinkedHashSet();
        this.c = mgo1.e(1, 0, 0, 6);
        boolean zA = uq4Var.a();
        this.d = zA;
        if (zA) {
            c921.y(llmVarE, (o8n) null, 0, new q4d0(flowable, this, (lnm) null, (byte) 10), 3);
        }
    }

    @Override // p.dwo
    public final void shutdown() {
        smo1.q(this.a);
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
