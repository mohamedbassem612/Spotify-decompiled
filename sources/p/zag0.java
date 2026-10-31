package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zag0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bbg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zag0(bbg0 bbg0Var, byte b) {
        super(3);
        this.a = b;
        this.b = bbg0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bbg0 bbg0Var = this.b;
        switch (b) {
            case 0:
                q9g0 q9g0Var = (q9g0) obj;
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    lzn0 lzn0Var = bbg0Var.b;
                    sb40 sb40Var = bbg0Var.l;
                    fbg0 fbg0Var = new fbg0(lzn0Var, bbg0Var.d, bbg0Var.g, sb40Var.a(), sb40Var.b(), bbg0Var.m, bbg0Var.j, bbg0Var.k);
                    x340Var.s0(fbg0Var);
                    objT = fbg0Var;
                }
                otw.c((fbg0) objT, new dbg0(q9g0Var), (qim0) null, (ipb1) null, x340Var, 0, 12);
                break;
            default:
                jbg0 jbg0Var = (jbg0) obj;
                ((Number) obj3).intValue();
                x340 x340Var2 = (b0k) obj2;
                Object objT2 = x340Var2.T();
                if (objT2 == fkj0.X) {
                    lzn0 lzn0Var2 = bbg0Var.b;
                    sb40 sb40Var2 = bbg0Var.l;
                    jdg0 jdg0Var = new jdg0(lzn0Var2, bbg0Var.d, bbg0Var.h, sb40Var2.a(), sb40Var2.b(), bbg0Var.m, bbg0Var.j, bbg0Var.k);
                    x340Var2.s0(jdg0Var);
                    objT2 = jdg0Var;
                }
                otw.c((jdg0) objT2, new idg0(jbg0Var, bbg0Var.c.b), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                break;
        }
        return rih1Var;
    }
}
