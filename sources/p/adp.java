package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class adp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ adp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final nkj1 a(qaj1 qaj1Var, lbj1 lbj1Var, boolean z) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                t7p t7pVar = (t7p) ((lbp) r7qVar).c;
                q290 q290Var = (q290) ((q2q) t7pVar.b).a.Wf.get();
                c8o.l(q290Var);
                gcq gcqVar = (gcq) ((q2q) t7pVar.b).a.xf.get();
                c8o.l(gcqVar);
                return new nkj1(q290Var, gcqVar, qaj1Var, lbj1Var, z);
            case 1:
                t7p t7pVar2 = (t7p) ((lbp) r7qVar).c;
                q290 q290Var2 = (q290) ((b0q) t7pVar2.b).a.Wf.get();
                c8o.l(q290Var2);
                gcq gcqVar2 = (gcq) ((b0q) t7pVar2.b).a.xf.get();
                c8o.l(gcqVar2);
                return new nkj1(q290Var2, gcqVar2, qaj1Var, lbj1Var, z);
            default:
                teq teqVar = r7qVar.d;
                return new nkj1((q290) teqVar.Wf.get(), (gcq) teqVar.xf.get(), qaj1Var, lbj1Var, z);
        }
    }
}
