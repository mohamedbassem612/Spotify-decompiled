package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bo implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eo b;

    public /* synthetic */ bo(eo eoVar, byte b) {
        this.a = b;
        this.b = eoVar;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        eo eoVar = this.b;
        switch (b) {
            case 0:
                if (obj == null) {
                    eoVar.c();
                    return rih1Var;
                }
                bhn0.d();
                return null;
            default:
                eoVar.c();
                return rih1Var;
        }
    }
}
