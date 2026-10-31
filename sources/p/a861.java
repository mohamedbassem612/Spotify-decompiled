package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a861 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xtb0 b;
    public final /* synthetic */ q1d0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a861(xtb0 xtb0Var, q1d0 q1d0Var, byte b) {
        super(3);
        this.a = b;
        this.b = xtb0Var;
        this.c = q1d0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        q1d0 q1d0Var = this.c;
        switch (b) {
            case 0:
                vzq0 vzq0Var = (vzq0) obj;
                int iIntValue = ((Number) obj3).intValue();
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                x340 x340Var = (b0k) obj2;
                boolean zI = x340Var.i(q1d0Var);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new xo8(q1d0Var, (byte) 8);
                    x340Var.s0(objT);
                }
                ujo1.d(qim0VarD, this.b, vzq0Var, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, (iIntValue << 6) & 896, 504);
                break;
            default:
                float f = ((p3v) obj).a;
                x340 x340Var2 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var2.d(f) ? 4 : 2;
                }
                x340 x340Var3 = x340Var2;
                if (!x340Var3.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x340Var3.b0();
                } else {
                    qim0 qim0VarN = anm1.N("series_shelf_row", u291.h(u291.f(nim0Var, 1.0f), f));
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var3).b;
                    zzq0 zzq0VarH = uyn1.h(2, 8.0f, 0.0f);
                    fra fraVar = een.Z;
                    boolean zI2 = x340Var3.i(q1d0Var);
                    Object objT2 = x340Var3.T();
                    if (zI2 || objT2 == fkj0.X) {
                        objT2 = new xo8(q1d0Var, (byte) 9);
                        x340Var3.s0(objT2);
                    }
                    s3o1.e(qim0VarN, this.b, zzq0VarH, (c36) null, fraVar, (iq20) null, (h3h1) null, (iu30) objT2, x340Var3, 0, 216);
                }
                break;
        }
        return rih1Var;
    }
}
