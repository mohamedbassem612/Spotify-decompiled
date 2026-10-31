package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v9b1 implements lnm, e9n {
    public final cge a;
    public final o8n b;

    public v9b1(cge cgeVar, o8n o8nVar) {
        this.a = cgeVar;
        this.b = o8nVar;
    }

    @Override // p.e9n
    public final e9n getCallerFrame() {
        return this.a;
    }

    @Override // p.lnm
    public final o8n getContext() {
        return this.b;
    }

    @Override // p.lnm
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
