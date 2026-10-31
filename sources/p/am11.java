package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class am11 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bm11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ am11(bm11 bm11Var, byte b) {
        super(1);
        this.a = b;
        this.b = bm11Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bm11 bm11Var = this.b;
        switch (b) {
            case 0:
                ay8 ay8VarF = d3p1.F(bm11Var.a, bm11Var.c, (yl11) obj);
                p410 p410Var = bm11Var.b.a;
                return h5p1.s(ay8VarF, (bpb1) p410Var.f, p410Var.y(), new vd2(4, (lnm) null, (byte) 25));
            case 1:
                ((qtr) obj).b(new gz0(bm11Var, (lnm) null, (byte) 20));
                return rih1.a;
            default:
                return new xwm0(bm11Var, (byte) 17);
        }
    }
}
