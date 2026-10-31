package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k0i0 implements dwo {
    public static final bma1 b = bma1.b.q("android-media-session.media3_enabled");
    public final llm a;

    public k0i0(dma1 dma1Var, kly0 kly0Var, q8n q8nVar) {
        llm llmVarE = smo1.e(ilo1.B(q8nVar, op71.f()));
        this.a = llmVarE;
        try {
            c921.y(llmVarE, (o8n) null, 0, new tfe0(kly0Var, dma1Var, (lnm) null, (byte) 26), 3);
        } catch (Throwable unused) {
        }
    }

    @Override // p.dwo
    public final void shutdown() {
        smo1.q(this.a);
    }
}
