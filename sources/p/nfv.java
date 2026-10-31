package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nfv extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pfv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nfv(pfv pfvVar, byte b) {
        super(1);
        this.a = b;
        this.b = pfvVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pfv pfvVar = this.b;
        switch (b) {
            case 0:
                return d3p1.H(pfvVar.a, pfvVar.d, (lfv) obj);
            default:
                lfv lfvVar = (lfv) obj;
                iix0 iix0Var = (iix0) d3p1.H(pfvVar.a, pfvVar.d, lfvVar).a.getValue();
                iix0 iix0VarI = fj30.I(iix0Var, lfvVar.b);
                if (iix0VarI != null) {
                    iix0Var = iix0VarI;
                }
                return new mfv(lfvVar, iix0Var);
        }
    }
}
