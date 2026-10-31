package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ggb implements dwo {
    public final kly0 a;
    public final llm b;
    public final idd1 c;
    public final faa0 d;

    public ggb(q8n q8nVar, kly0 kly0Var) {
        this.a = kly0Var;
        llm llmVarE = smo1.e(ilo1.B(q8nVar, new z8n("BluetoothDaemon")));
        this.b = llmVarE;
        this.c = new idd1(new q30(this, (byte) 25));
        this.d = c921.y(llmVarE, (o8n) null, 0, new kk(this, (lnm) null, (byte) 29), 3);
    }

    public final void shutdown() {
        c921.D(new vk6(this, (lnm) null, (byte) 12));
    }
}
