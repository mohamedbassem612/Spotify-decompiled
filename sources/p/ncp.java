package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ncp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ ncp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final s061 a(c9n c9nVar, mr20 mr20Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                q8n q8nVar = (q8n) ((ntv) ((ks6) ((lbp) r7qVar).c).a).c.get();
                c8o.l(q8nVar);
                return new s061(q8nVar, c9nVar, mr20Var);
            case 1:
                q8n q8nVar2 = (q8n) ((vwv) ((qq) ((lbp) r7qVar).c).b).b.get();
                c8o.l(q8nVar2);
                return new s061(q8nVar2, c9nVar, mr20Var);
            case 2:
                q8n q8nVar3 = (q8n) ((jyv) ((qq) ((lbp) r7qVar).c).b).b.get();
                c8o.l(q8nVar3);
                return new s061(q8nVar3, c9nVar, mr20Var);
            default:
                return new s061((q8n) r7qVar.b.r2.get(), c9nVar, mr20Var);
        }
    }
}
