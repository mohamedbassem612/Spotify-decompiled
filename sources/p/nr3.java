package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nr3 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nr3(boolean z, iu30 iu30Var, byte b) {
        super(3);
        this.a = b;
        this.b = z;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        iu30 iu30Var = this.c;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                boolean zG = x340Var.g(iu30Var);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new ib2(iu30Var, (byte) 15);
                    x340Var.s0(objT);
                }
                anm1.c(this.b, (iu30) objT, (qim0) null, (max) null, (idn0) null, x340Var, 0, 28);
                break;
            case 1:
                ((Number) obj3).intValue();
                anm1.c(this.b, this.c, (qim0) null, (max) null, (idn0) null, (b0k) obj2, 0, 28);
                break;
            case 2:
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var3 = x340Var2;
                if (!x340Var3.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var3.b0();
                } else {
                    if (this.b) {
                        x340Var3.i0(1038974581);
                        dem1.n(iu30Var, x340Var3, 0);
                        x340Var3.r(false);
                    } else {
                        x340Var3.i0(1039032241);
                        x340Var3.r(false);
                    }
                    dem1.l(iu30Var, x340Var3, 0);
                }
                break;
            default:
                ((Number) obj3).intValue();
                anm1.c(this.b, this.c, (qim0) null, (max) null, (idn0) null, (b0k) obj2, 0, 28);
                break;
        }
        return rih1Var;
    }
}
