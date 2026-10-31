package p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x0r implements f961 {
    public final np60 a;
    public final vku b = new vku();
    public final llm c;
    public final ayh d;
    public final AtomicBoolean e;

    public x0r(np60 np60Var, w25 w25Var, xvo xvoVar) {
        this.a = np60Var;
        fns fnsVar = igu.a;
        llm llmVarE = smo1.e(b3s.c);
        this.c = llmVarE;
        ayh ayhVarA = sap1.a();
        this.d = ayhVarA;
        this.e = new AtomicBoolean();
        if (w25Var.j()) {
            c921.y(llmVarE, (o8n) null, 0, new hxn(xvoVar, this, (lnm) null, (byte) 5), 3);
        } else {
            ayhVarA.m0(null);
        }
    }

    @Override // p.dwo
    public final void shutdown() {
        this.b.c();
        smo1.q(this.c);
        this.d.m0(null);
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
