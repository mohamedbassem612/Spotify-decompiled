package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x3b implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bbc b;

    public /* synthetic */ x3b(bbc bbcVar, byte b) {
        this.a = b;
        this.b = bbcVar;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bbc bbcVar = this.b;
        switch (b) {
            case 0:
                bbcVar.l(rih1Var);
                return rih1Var;
            default:
                Object objB = bbcVar.b(obj, lnmVar);
                return objB == d9n.a ? objB : rih1Var;
        }
    }
}
