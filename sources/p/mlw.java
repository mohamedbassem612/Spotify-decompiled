package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mlw implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r261 b;

    public /* synthetic */ mlw(r261 r261Var, byte b) {
        this.a = b;
        this.b = r261Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        r261 r261Var = this.b;
        switch (b) {
            case 0:
                Object objB = r261Var.b(obj, lnmVar);
                return objB == d9nVar ? objB : rih1Var;
            default:
                Object objB2 = r261Var.b(obj, lnmVar);
                return objB2 == d9nVar ? objB2 : rih1Var;
        }
    }
}
