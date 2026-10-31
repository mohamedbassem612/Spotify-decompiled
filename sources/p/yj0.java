package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yj0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ op0 b;
    public final /* synthetic */ jk0 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yj0(op0 op0Var, jk0 jk0Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = op0Var;
        this.c = jk0Var;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        jk0 jk0Var = this.c;
        boolean z = false;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    cs10 cs10Var = new cs10(true);
                    mj0 mj0Var = jk0Var.a;
                    ij0 ij0Var = mj0Var.b;
                    String str = ij0Var.c;
                    String str2 = ij0Var.a;
                    ji0 ji0Var = mj0Var.a;
                    String str3 = mj0Var.f;
                    String str4 = mj0Var.d;
                    String str5 = mj0Var.g;
                    String str6 = mj0Var.h;
                    String str7 = mj0Var.i;
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        obj3 = objT;
                        qj qjVar = new qj(iu30Var, (byte) 5);
                        x340Var2.s0(qjVar);
                        obj3 = qjVar;
                    }
                    obj3 = objT;
                    otw.c(this.b, new kp0(cs10Var, str, str2, ji0Var, str3, str4, str5, str6, str7, false, (iu30) obj3), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qim0 qim0VarB = u291.B(nim0.a, (gra) null, 3);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(hmb0.t1);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(gfh0VarC, x340Var4, y580.O0);
                    nko1.H(xos0VarM, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE, x340Var4, y580.Y);
                    gfx.g(18, apo.r(-1786159224, new yj0(this.b, jk0Var, iu30Var, z ? 1 : 0), x340Var4), x340Var4, 54);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
