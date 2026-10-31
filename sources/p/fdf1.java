package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fdf1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gdf1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fdf1(gdf1 gdf1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = gdf1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        gdf1 gdf1Var = this.b;
        switch (b) {
            case 0:
                return new fdf1(gdf1Var, lnmVar, (byte) 0);
            default:
                return new fdf1(gdf1Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                hm5.M(obj);
                gdf1 gdf1Var = this.b;
                gdf1Var.m = true;
                gdf1Var.c.c();
                this.b.l = false;
                this.b.j.setValue(Boolean.FALSE);
                break;
            default:
                hm5.M(obj);
                this.b.c.e();
                gdf1 gdf1Var2 = this.b;
                gdf1Var2.m = false;
                gdf1Var2.n = false;
                gdf1Var2.l = false;
                this.b.j.setValue(Boolean.FALSE);
                break;
        }
        return rih1.a;
    }
}
