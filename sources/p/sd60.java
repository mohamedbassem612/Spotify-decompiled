package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sd60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rd60 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ yqg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd60(rd60 rd60Var, iu30 iu30Var, yqg yqgVar, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 1:
                this.b = rd60Var;
                this.c = iu30Var;
                this.d = yqgVar;
                super(2);
                break;
            default:
                this.b = rd60Var;
                this.c = iu30Var;
                this.d = yqgVar;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        j2i j2iVarR;
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
                    loo1.f(this.b, this.c, (qim0) null, this.d, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    Object objT = x340Var4.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = ktd.o(0.0f, x340Var4);
                    }
                    ven0 ven0Var = (ven0) objT;
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    ngx ngxVar = ngx.e;
                    tvx tvxVarB = gto1.B(1, x340Var4, 5);
                    cvx cvxVar2 = cbx.b(x340Var4).b;
                    uvx uvxVar = new uvx(0, ngxVar, 5, uyn1.h(1, 0.0f, ((p3v) ven0Var.getValue()).a), (zzq0) null, tvx.a(tvxVarB, 2.0f, 4), (hw61) null, 1, (p3v) null, 337);
                    rd60 rd60Var = this.b;
                    hax haxVar = rd60Var.b ? new hax("TODO") : jax.a;
                    iu30 iu30Var = this.c;
                    boolean zG = x340Var4.g(iu30Var);
                    yqg yqgVar = this.d;
                    boolean zG2 = zG | x340Var4.g(yqgVar);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new sn8(iu30Var, yqgVar, (byte) 4);
                        x340Var4.s0(objT2);
                    }
                    gbx gbxVar = new gbx(z50.c, (Function0) objT2);
                    j2i j2iVarR2 = apo.r(-1815791493, new td60(rd60Var, (byte) 0), x340Var4);
                    String str = rd60Var.a.e;
                    if (str == null) {
                        x340Var4.i0(841602337);
                        x340Var4.r(false);
                        j2iVarR = null;
                    } else {
                        x340Var4.i0(841602338);
                        j2iVarR = apo.r(1920228199, new z3y(str, (byte) 13), x340Var4);
                        x340Var4.r(false);
                    }
                    jto1.b(qim0VarF, uvxVar, haxVar, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, (xu30) null, j2iVarR2, j2iVarR, apo.r(61125308, new td60(rd60Var, (byte) 1), x340Var4), apo.r(-1978338179, new cex(rd60Var, iu30Var, (byte) 19), x340Var4), (xu30) null, (xu30) null, apo.r(493205952, new cex(rd60Var, ven0Var, (byte) 20), x340Var4), x340Var4, 805306432, 197040, 25016);
                }
                break;
        }
        return rih1Var;
    }
}
