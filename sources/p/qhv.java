package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qhv implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uhv b;

    public /* synthetic */ qhv(uhv uhvVar, byte b) {
        this.a = b;
        this.b = uhvVar;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        uhv uhvVar = this.b;
        switch (b) {
            case 0:
                uhvVar.q(((Number) obj).intValue());
                break;
            default:
                if (uhvVar.n != null) {
                    uhvVar.p();
                }
                break;
        }
        return rih1Var;
    }
}
