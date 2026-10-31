package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class opr extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ spr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ opr(spr sprVar, byte b) {
        super(1);
        this.a = b;
        this.b = sprVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        spr sprVar = this.b;
        switch (b) {
            case 0:
                moy0 moy0Var = (moy0) sprVar.b.get();
                vbm[] vbmVarArr = q601.a;
                kge kgeVar = new kge(moy0Var);
                wpr wprVar = (wpr) sprVar.g.getValue();
                return new x010(kgeVar, d5p1.r(new vpr(new iib(new fu20(rqt0.u(new qer(new dkm(((qor) wprVar.a.get()).h, (byte) 26), ((anl) obj).b, (byte) 9)), new eum(wprVar, null, (byte) 17), (byte) 1), new xx0(wprVar, (lnm) null, (byte) 4), (byte) 6), (byte) 0), wprVar.b, new alb1(0L, Long.MAX_VALUE), 1), new mnl(3, (lnm) null, (byte) 11), (byte) 1);
            default:
                ((qtr) obj).b(new kr(sprVar, (lnm) null, (byte) 10));
                return rih1.a;
        }
    }
}
