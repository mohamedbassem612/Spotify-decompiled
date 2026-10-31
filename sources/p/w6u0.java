package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w6u0 implements f961 {
    public final kly0 a;
    public final kly0 b;
    public boolean d;
    public final llm f;
    public final dt71 c = mgo1.e(1, 0, 0, 4);
    public String e = "";

    public w6u0(kly0 kly0Var, kly0 kly0Var2, q8n q8nVar) {
        this.a = kly0Var;
        this.b = kly0Var2;
        llm llmVarE = smo1.e(ilo1.B(q8nVar, guo1.B()).y(new z8n("PlaybackTimeoutErrorService")));
        this.f = llmVarE;
        c921.y(llmVarE, (o8n) null, 0, new vse0(this, (lnm) null, (byte) 9), 3);
        c921.y(llmVarE, (o8n) null, 0, new c3u0(this, (lnm) null, (byte) 1), 3);
    }

    @Override // p.dwo
    public final void shutdown() {
        smo1.q(this.f);
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
