package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fts implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dt71 b;

    public /* synthetic */ fts(dt71 dt71Var, byte b) {
        this.a = b;
        this.b = dt71Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 18;
        d9n d9nVar = d9n.a;
        dt71 dt71Var = this.b;
        switch (b) {
            case 0:
                dt71Var.collect(new x5s(vr20Var, (byte) 17), lnmVar);
                break;
            case 1:
                dt71Var.collect(new x5s(vr20Var, (byte) 18), lnmVar);
                break;
            case 2:
                dt71Var.collect(new x5s(vr20Var, (byte) 19), lnmVar);
                break;
            case 3:
                dt71Var.collect(new cy20(vr20Var, (byte) 10), lnmVar);
                break;
            case 4:
                dt71Var.collect(new cy20(vr20Var, (byte) 12), lnmVar);
                break;
            case 5:
                dt71Var.collect(new gw60(vr20Var, (byte) 12), lnmVar);
                break;
            case 6:
                dt71Var.collect(new g6z0(vr20Var, b2), lnmVar);
                break;
            case 7:
                dt71Var.collect(new tm61(vr20Var, (byte) 21), lnmVar);
                break;
            case 8:
                dt71Var.collect(new qmd1(vr20Var, (byte) 8), lnmVar);
                break;
            default:
                dt71Var.collect(new yhg1(vr20Var, (byte) 13), lnmVar);
                break;
        }
        return d9nVar;
    }
}
