package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ccv {
    public final q8n a;
    public final esg b;
    public final owf1 c;
    public final bev d;
    public final gqb0 e;
    public final bih1 f;

    public ccv(q8n q8nVar, esg esgVar, vbp vbpVar, owf1 owf1Var, wbp wbpVar, bev bevVar, goq goqVar) {
        gqb0 gqb0Var;
        bih1 bih1Var;
        this.a = q8nVar;
        this.b = esgVar;
        this.c = owf1Var;
        this.d = bevVar;
        switch (vbpVar.a) {
            case 0:
                gqb0Var = new gqb0(goqVar, (byte) 3);
                break;
            case 1:
                gqb0Var = new gqb0(goqVar, (byte) 3);
                break;
            case 2:
                gqb0Var = new gqb0(goqVar, (byte) 3);
                break;
            default:
                gqb0Var = new gqb0(goqVar, (byte) 3);
                break;
        }
        this.e = gqb0Var;
        switch (wbpVar.a) {
            case 0:
                bl3 bl3Var = (bl3) ((udv) ((e93) ((lbp) wbpVar.b).c).c).g.get();
                c8o.l(bl3Var);
                bih1Var = new bih1(bl3Var, bevVar, (byte) 6);
                break;
            case 1:
                bih1Var = new bih1((bl3) wbpVar.b.b.q8.get(), bevVar, (byte) 6);
                break;
            case 2:
                bih1Var = new bih1((bl3) wbpVar.b.b.q8.get(), bevVar, (byte) 6);
                break;
            default:
                bih1Var = new bih1((bl3) wbpVar.b.b.q8.get(), bevVar, (byte) 6);
                break;
        }
        this.f = bih1Var;
    }
}
