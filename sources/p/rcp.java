package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rcp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ rcp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final c6b0 a(s061 s061Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                q8n q8nVar = (q8n) ((ntv) ((ks6) ((lbp) r7qVar).c).a).a.get();
                c8o.l(q8nVar);
                return new c6b0(q8nVar, s061Var);
            case 1:
                q8n q8nVar2 = (q8n) ((vwv) ((qq) ((lbp) r7qVar).c).b).a.get();
                c8o.l(q8nVar2);
                return new c6b0(q8nVar2, s061Var);
            case 2:
                q8n q8nVar3 = (q8n) ((jyv) ((qq) ((lbp) r7qVar).c).b).a.get();
                c8o.l(q8nVar3);
                return new c6b0(q8nVar3, s061Var);
            default:
                return new c6b0((q8n) r7qVar.b.E1.get(), s061Var);
        }
    }
}
