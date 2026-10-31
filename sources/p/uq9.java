package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uq9 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uq9(tm tmVar, byte b) {
        super(1);
        this.a = b;
        this.b = tmVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tm tmVar = this.b;
        switch (b) {
            case 0:
                xe01 xe01Var = ((rm9) tmVar.c).u;
                return h5p1.s(xe01Var, rqt0.u(new ht20(r4p1.m(new xr0(xe01Var, (byte) 7), fm9.c1), new sd0(2, (lnm) null, (byte) 16))), ((it8) tmVar.d).o((String) obj), new r20(tmVar, (lnm) null, (byte) 11));
            default:
                ((qtr) obj).b(new kr(tmVar, (lnm) null, (byte) 6));
                return rih1.a;
        }
    }
}
