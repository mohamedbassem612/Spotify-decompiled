package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mbi0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ obi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mbi0(obi0 obi0Var, byte b) {
        super(1);
        this.a = b;
        this.b = obi0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        obi0 obi0Var = this.b;
        switch (b) {
            case 0:
                return h5p1.q(new p1e0(d3p1.F(obi0Var.i, obi0Var.O0, (mey0) obj), (byte) 10), obi0Var.a.a(), obi0Var.g.a, obi0Var.X.a(), rqt0.u(obi0Var.h.E((String) null)), new ytr(obi0Var, (lnm) null, (byte) 1));
            case 1:
                return too1.x((mey0) obj, (nbw0) null, (pjw0) null, (w281) null, (prl) null, (e2k1) null, new t810(new ioj0(), null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, 2097150), obi0Var.c, obi0Var.d, obi0Var.e, obi0Var.t);
            default:
                ((qtr) obj).b(new k1(obi0Var.f, obi0Var.b, (lnm) null, (byte) 17));
                return rih1.a;
        }
    }
}
