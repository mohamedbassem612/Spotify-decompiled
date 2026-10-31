package p;

import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qak extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rak b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ es41 d;
    public final /* synthetic */ tob1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qak(rak rakVar, ven0 ven0Var, es41 es41Var, tob1 tob1Var, byte b) {
        super(2);
        this.a = b;
        this.b = rakVar;
        this.c = ven0Var;
        this.d = es41Var;
        this.e = tob1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    p2o0 p2o0Var = this.b.a;
                    xbk xbkVar = (xbk) this.c.getValue();
                    tob1 tob1Var = this.e;
                    boolean zI = x340Var2.i(tob1Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new pak(tob1Var, (byte) 0);
                        x340Var2.s0(objT);
                    }
                    p2o0Var.b(xbkVar, (qim0) null, this.d, (iu30) objT, x340Var2, 0);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-1840897931, new qak(this.b, this.c, this.d, this.e, (byte) 0), x340Var4), x340Var4, 3078, 6);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    rak rakVar = this.b;
                    qsw.c(new obk1((ConstraintLayout) rakVar.f.b), apo.r(-1943101592, new qak(rakVar, this.c, this.d, this.e, (byte) 1), x340Var6), x340Var6, 48);
                }
                break;
        }
        return rih1Var;
    }
}
