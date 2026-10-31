package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hw01 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kob1 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ y1t0 d;
    public final /* synthetic */ idd1 e;
    public final /* synthetic */ ycm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hw01(kob1 kob1Var, iu30 iu30Var, y1t0 y1t0Var, idd1 idd1Var, ycm ycmVar, byte b) {
        super(2);
        this.a = b;
        this.b = kob1Var;
        this.c = iu30Var;
        this.d = y1t0Var;
        this.e = idd1Var;
        this.f = ycmVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    qim0 qim0VarA = py20.a(uyn1.B(nim0.a, 16.0f, 0.0f, 0.0f, 0.0f, 14), 0L, (cr31) null, x340Var2, 6, 15);
                    kob1 kob1Var = this.b;
                    qim0 qim0VarH = pqo.h(qim0VarA, !kob1Var.f15p || kob1Var.q);
                    uvx uvxVarB = uvx.b((uvx) x340Var2.k(vvx.a), 2, (tvx) null, new p3v(48.0f), 11);
                    iu30 iu30Var = this.c;
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = new fr01(iu30Var, (byte) 11);
                        x340Var2.s0(objT);
                    }
                    z50 z50Var = z50.c;
                    gbx gbxVar = new gbx(z50Var, (Function0) objT);
                    boolean zG2 = x340Var2.g(iu30Var);
                    Object objT2 = x340Var2.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new fr01(iu30Var, (byte) 12);
                        x340Var2.s0(objT2);
                    }
                    jto1.b(qim0VarH, uvxVarB, (max) null, false, (idn0) null, (ga80) null, gbxVar, new gbx(z50Var, (Function0) objT2), (xu30) null, apo.r(191796173, new gw01(kob1Var, this.d), x340Var2), apo.r(827133005, new gw01(kob1Var, (byte) 1), x340Var2), apo.r(-1523862386, new hov0(this.e, kob1Var, (byte) 14), x340Var2), apo.r(420109519, new hho0(kob1Var, this.f, iu30Var, (byte) 20), x340Var2), fcj.a, (xu30) null, apo.r(1957057938, new gw01(kob1Var, (byte) 2), x340Var2), x340Var2, 805306432, 200118, 16700);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    kob1 kob1Var2 = this.b;
                    boolean z = kob1Var2.u;
                    iu30 iu30Var2 = this.c;
                    boolean zG3 = x340Var4.g(iu30Var2);
                    Object objT3 = x340Var4.T();
                    if (zG3 || objT3 == fkj0.X) {
                        objT3 = new fr01(iu30Var2, (byte) 10);
                        x340Var4.s0(objT3);
                    }
                    kyo1.a(z, (Function0) objT3, apo.r(1808250710, new hw01(kob1Var2, iu30Var2, this.d, this.e, this.f, (byte) 0), x340Var4), x340Var4, 384);
                }
                break;
        }
        return rih1Var;
    }
}
