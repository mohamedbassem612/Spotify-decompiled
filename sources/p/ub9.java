package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ub9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 4;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub9(float f, c380 c380Var, vu30 vu30Var, j2i j2iVar, float f2) {
        super(2);
        this.b = f;
        this.e = c380Var;
        this.d = vu30Var;
        this.f = j2iVar;
        this.c = f2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                n1p1.a((c380) obj3, (qim0) obj4, (hcx) obj5, this.b, this.c, (b0k) obj, czo1.p(24585));
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                lvx.b((lrk) obj3, (tgk) obj5, this.b, this.c, (qim0) obj4, (b0k) obj, iP);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                sbl.e((wam) obj3, this.b, this.c, (Function0) obj5, (qim0) obj4, (b0k) obj, iP2);
                break;
            case 3:
                ((Number) obj2).intValue();
                b6p1.g((pep0) obj3, (qim0) obj4, this.b, this.c, (dqz0) obj5, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                j2i j2iVar = (j2i) obj5;
                vu30 vu30Var = (vu30) obj4;
                c380 c380Var = (c380) obj3;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
                    d36 d36Var = new d36(this.b, true, new um5(false));
                    boolean zI = x340Var2.i(c380Var) | x340Var2.g(vu30Var) | x340Var2.g(j2iVar);
                    float f = this.c;
                    boolean zD = x340Var2.d(f) | zI;
                    Object objT = x340Var2.T();
                    if (zD || objT == fkj0.X) {
                        yv40 yv40Var = new yv40(c380Var, vu30Var, j2iVar, f, (byte) 2);
                        x340Var2.s0(yv40Var);
                        objT = yv40Var;
                    }
                    ujo1.e(qim0VarF, (xtb0) null, zzq0VarH, d36Var, (pl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var2, 0, 490);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub9(lrk lrkVar, tgk tgkVar, float f, float f2, qim0 qim0Var, int i) {
        super(2);
        this.e = lrkVar;
        this.f = tgkVar;
        this.b = f;
        this.c = f2;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub9(wam wamVar, float f, float f2, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.e = wamVar;
        this.b = f;
        this.c = f2;
        this.f = function0;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub9(c380 c380Var, qim0 qim0Var, hcx hcxVar, float f, float f2, int i) {
        super(2);
        this.e = c380Var;
        this.d = qim0Var;
        this.f = hcxVar;
        this.b = f;
        this.c = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub9(pep0 pep0Var, qim0 qim0Var, float f, float f2, dqz0 dqz0Var, int i) {
        super(2);
        this.e = pep0Var;
        this.d = qim0Var;
        this.b = f;
        this.c = f2;
        this.f = dqz0Var;
    }
}
