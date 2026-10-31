package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oqy implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kdn0 b;

    public /* synthetic */ oqy(kdn0 kdn0Var, byte b) {
        this.a = b;
        this.b = kdn0Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kdn0 kdn0Var = this.b;
        switch (b) {
            case 0:
                kdn0Var.j((String) obj);
                break;
            case 1:
                kdn0Var.j((rrt0) obj);
                break;
            default:
                kdn0Var.j((rrt0) obj);
                break;
        }
        return rih1Var;
    }
}
