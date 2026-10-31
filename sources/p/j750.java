package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j750 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ lzn0 b;
    public final /* synthetic */ lik1 c;
    public final /* synthetic */ lik1 d;
    public final /* synthetic */ v850 e;
    public final /* synthetic */ lc20 f;
    public final /* synthetic */ Function0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j750(Function0 function0, lik1 lik1Var, v850 v850Var, lzn0 lzn0Var, lik1 lik1Var2, lc20 lc20Var) {
        super(2);
        this.g = function0;
        this.c = lik1Var;
        this.e = v850Var;
        this.b = lzn0Var;
        this.d = lik1Var2;
        this.f = lc20Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                nim0 nim0Var = nim0.a;
                qim0 qim0VarY = voo1.y(u291.f(nim0Var, 1.0f), voo1.b);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                cvx cvxVar3 = cbx.b(x340Var2).b;
                qim0 qim0VarB = uyn1.B(qim0VarY, 16.0f, 0.0f, 16.0f, 16.0f, 2);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
                hzj.A.getClass();
                if (x340Var2.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(hmb0.t1);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                Function0 function0 = this.g;
                boolean zG = x340Var2.g(function0);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    objT = new zg20(function0, (byte) 22);
                    x340Var2.s0(objT);
                }
                q3p1.b(6, 0, (Function0) objT, x340Var2, true);
                pbh pbhVar = pbh.a;
                op71.g(x340Var2, pbhVar.a(1.0f, nim0Var, true));
                lik1 lik1Var = nik1.d4;
                lik1 lik1Var2 = this.c;
                boolean zJ = u890.j(lik1Var2, lik1Var);
                v850 v850Var = this.e;
                if (zJ) {
                    x340Var2.i0(-155678346);
                    mth1.f(0, x340Var2, anm1.N("test_tag_graduation_requested_content", nim0Var), v850Var == v850.b);
                    x340Var2.r(false);
                } else {
                    if (!u890.j(lik1Var2, nik1.c4)) {
                        x340Var2.i0(-155667307);
                        x340Var2.r(false);
                        hhg1.g(lik1Var2, "Unsupported uri for graduation acknowledgement: ");
                        return null;
                    }
                    x340Var2.i0(-155670923);
                    mth1.e(anm1.N("test_tag_graduation_postponed_content", nim0Var), x340Var2, 0);
                    x340Var2.r(false);
                }
                op71.g(x340Var2, pbhVar.a(0.75f, nim0Var, true));
                mth1.g(this.b, lik1Var2, this.d, v850Var == v850.a, this.f, pbhVar.c(een.Q0, nim0Var), x340Var2, 0);
                x340Var2.r(true);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                mth1.d(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j750(lzn0 lzn0Var, lik1 lik1Var, lik1 lik1Var2, v850 v850Var, lc20 lc20Var, Function0 function0, int i) {
        super(2);
        this.b = lzn0Var;
        this.c = lik1Var;
        this.d = lik1Var2;
        this.e = v850Var;
        this.f = lc20Var;
        this.g = function0;
    }
}
