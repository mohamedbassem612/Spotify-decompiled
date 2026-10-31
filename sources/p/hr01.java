package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hr01 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ney0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ hyy0 d;
    public final /* synthetic */ agc0 e;
    public final /* synthetic */ idd1 f;
    public final /* synthetic */ ycm g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr01(iu30 iu30Var, hyy0 hyy0Var, agc0 agc0Var, ney0 ney0Var, idd1 idd1Var, ycm ycmVar) {
        super(2);
        this.c = iu30Var;
        this.d = hyy0Var;
        this.e = agc0Var;
        this.b = ney0Var;
        this.f = idd1Var;
        this.g = ycmVar;
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
                    qim0 qim0VarA = py20.a(nim0.a, 0L, (cr31) null, x340Var2, 6, 15);
                    uvx uvxVarB = uvx.b((uvx) x340Var2.k(vvx.a), 2, (tvx) null, new p3v(64.0f), 11);
                    iu30 iu30Var = this.c;
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = new fr01(iu30Var, (byte) 2);
                        x340Var2.s0(objT);
                    }
                    z50 z50Var = z50.c;
                    gbx gbxVar = new gbx(z50Var, (Function0) objT);
                    boolean zG2 = x340Var2.g(iu30Var);
                    Object objT2 = x340Var2.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new fr01(iu30Var, (byte) 3);
                        x340Var2.s0(objT2);
                    }
                    gbx gbxVar2 = new gbx(z50Var, (Function0) objT2);
                    agc0 agc0Var = this.e;
                    hyy0 hyy0Var = this.d;
                    ney0 ney0Var = this.b;
                    jto1.b(qim0VarA, uvxVarB, (max) null, false, (idn0) null, (ga80) null, gbxVar, gbxVar2, (xu30) null, apo.r(743431788, new c9y(hyy0Var, agc0Var, ney0Var, iu30Var, (byte) 27), x340Var2), apo.r(-267389204, new gr01(ney0Var, (byte) 0), x340Var2), apo.r(955213421, new hov0(this.f, ney0Var, (byte) 13), x340Var2), apo.r(-2117151250, new hho0(ney0Var, this.g, iu30Var, (byte) 18), x340Var2), (xu30) null, (xu30) null, apo.r(1550656625, new gr01(ney0Var, (byte) 1), x340Var2), x340Var2, 805306432, 197046, 24892);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    ney0 ney0Var2 = this.b;
                    boolean z = ney0Var2.z;
                    iu30 iu30Var2 = this.c;
                    boolean zG3 = x340Var4.g(iu30Var2);
                    Object objT3 = x340Var4.T();
                    if (zG3 || objT3 == fkj0.X) {
                        objT3 = new fr01(iu30Var2, (byte) 1);
                        x340Var4.s0(objT3);
                    }
                    kyo1.a(z, (Function0) objT3, apo.r(893063989, new hr01(iu30Var2, this.d, this.e, ney0Var2, this.f, this.g), x340Var4), x340Var4, 384);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr01(ney0 ney0Var, iu30 iu30Var, hyy0 hyy0Var, agc0 agc0Var, idd1 idd1Var, ycm ycmVar) {
        super(2);
        this.b = ney0Var;
        this.c = iu30Var;
        this.d = hyy0Var;
        this.e = agc0Var;
        this.f = idd1Var;
        this.g = ycmVar;
    }
}
