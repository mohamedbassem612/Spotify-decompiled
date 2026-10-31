package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vpw extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpw(boolean z, long j, hw61 hw61Var, tob1 tob1Var) {
        super(3);
        this.b = z;
        this.c = j;
        this.d = hw61Var;
        this.e = tob1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        qim0 qim0VarR;
        byte b = this.a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        boolean z = this.b;
        switch (b) {
            case 0:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                tob1 tob1Var = (tob1) obj4;
                hw61 hw61Var = (hw61) obj5;
                x340 x340Var = (b0k) obj2;
                x340Var.i0(-1546206387);
                long j = this.c;
                if (z) {
                    x340Var.i0(489933298);
                    boolean zI = x340Var.i(hw61Var) | x340Var.i(tob1Var) | x340Var.f(j);
                    Object objT = x340Var.T();
                    if (zI || objT == fkj0.X) {
                        lff lffVar = new lff(hw61Var, tob1Var, j, (byte) 1);
                        x340Var.s0(lffVar);
                        objT = lffVar;
                    }
                    qim0VarR = exd0.r(qim0Var, (iu30) objT);
                    x340Var.r(false);
                } else {
                    x340Var.i0(489794046);
                    x340Var.r(false);
                    float f = rck.b;
                    qim0VarR = d1u.E(1.0f, j, qim0Var, hw61Var);
                }
                x340Var.r(false);
                return qim0VarR;
            default:
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (z) {
                    x340 x340Var3 = x340Var2;
                    x340Var3.i0(49970922);
                    ((hym1) obj5).e(0, 0L, this.c, (String) obj4, x340Var3, (qim0) null);
                    x340Var3.r(false);
                } else {
                    x340 x340Var4 = x340Var2;
                    x340Var4.i0(50033387);
                    x340Var4.r(false);
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpw(boolean z, hym1 hym1Var, String str, long j) {
        super(3);
        this.b = z;
        this.d = hym1Var;
        this.e = str;
        this.c = j;
    }
}
