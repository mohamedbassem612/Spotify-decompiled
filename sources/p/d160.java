package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d160 implements anc0 {
    public final String a;
    public final q8n b;
    public final haa0 c;
    public final ayh d = sap1.a();
    public llm e;

    public d160(String str, q8n q8nVar, haa0 haa0Var) {
        this.a = str;
        this.b = q8nVar;
        this.c = haa0Var;
        this.e = smo1.e(flo1.l(op71.f(), q8nVar));
    }

    @Override // p.anc0
    public final void a() {
        smo1.p(this.e, (CancellationException) null);
    }

    @Override // p.anc0
    public final void b() {
        smo1.p(this.e, (CancellationException) null);
        llm llmVarE = smo1.e(flo1.l(op71.f(), this.b));
        this.e = llmVarE;
        fn31.T(llmVarE, (o8n) null, 0, new c160(this, null, (byte) 1), 3);
    }

    @Override // p.anc0
    public final Object h(l8t0 l8t0Var) {
        Object objQ = this.d.Q(l8t0Var);
        return objQ == d9n.a ? objQ : rih1.a;
    }
}
