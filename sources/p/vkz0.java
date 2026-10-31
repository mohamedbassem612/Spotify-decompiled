package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vkz0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wkz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vkz0(wkz0 wkz0Var, byte b) {
        super(2);
        this.a = b;
        this.b = wkz0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wkz0 wkz0Var = this.b;
        switch (b) {
            case 0:
                tv80 tv80Var = (tv80) obj2;
                wkz0Var.c.f(new dwn0((String) obj, "", false, false, 0, 0, false, null, null, tv80Var != null ? new bwn0(tv80Var) : null));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                byte b2 = 0;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    ngs0 ngs0Var = new ngs0((los) ((jly0) ((jmq) wkz0Var.d.a.c).b).get());
                    ykz0 ykz0Var = wkz0Var.b;
                    String str = ykz0Var.b;
                    c380 c380VarA = mqo1.A(ykz0Var.a);
                    boolean zI = x340Var2.i(wkz0Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new vkz0(wkz0Var, b2);
                        x340Var2.s0(objT);
                    }
                    otw.c(ngs0Var, new dlz0(str, c380VarA, (vu30) objT), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                }
                break;
        }
        return rih1Var;
    }
}
