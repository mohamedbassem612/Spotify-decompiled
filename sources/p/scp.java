package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class scp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ scp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final e6b0 a(s061 s061Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                q8n q8nVar = (q8n) ((ntv) ((ks6) ((lbp) r7qVar).c).a).a.get();
                c8o.l(q8nVar);
                return new e6b0(q8nVar, s061Var);
            default:
                return new e6b0((q8n) r7qVar.b.E1.get(), s061Var);
        }
    }
}
