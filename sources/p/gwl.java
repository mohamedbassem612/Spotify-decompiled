package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gwl extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kwl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gwl(kwl kwlVar, byte b) {
        super(1);
        this.a = b;
        this.b = kwlVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        kwl kwlVar = this.b;
        switch (b) {
            case 0:
                String str = ((owl) obj).a;
                o3e0 o3e0Var = kwlVar.b;
                return h5p1.r(hu20.e(hu20.e(new lt20(((tag1) o3e0Var.c).b(str), new i440(3, (lnm) null, (byte) 9), (byte) 0), new c6e0((lnm) null, str, o3e0Var, (byte) 0)), new b7c((lnm) null, kwlVar, (byte) 14)), (x010) kwlVar.d.d, (mr20) kwlVar.c.g, (plu) kwlVar.e.d, new fwl(5, null));
            default:
                qtr qtrVar = (qtr) obj;
                qtrVar.c(new ew0(kwlVar, (lnm) null, (byte) 13));
                qtrVar.d = new cuk(kwlVar, (lnm) null, (byte) 9);
                qtrVar.c = true;
                qtrVar.b(new ep0(kwlVar, null, (byte) 16));
                return rih1.a;
        }
    }
}
