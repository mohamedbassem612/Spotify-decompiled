package p;

import com.spotify.searchview.proto.Entity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mgj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hn61 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mgj(hn61 hn61Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = hn61Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        jdx idxVar;
        jdx jdxVar;
        byte b = this.a;
        z50 z50Var = z50.c;
        rih1 rih1Var = rih1.a;
        rih1 rih1Var2 = null;
        hn61 hn61Var = this.b;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 48);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
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
                    vu30 vu30Var = hn61Var.d;
                    Boolean bool = hn61Var.h;
                    if (vu30Var == null) {
                        x340Var2.i0(400986434);
                        x340Var2.r(false);
                    } else {
                        c13.o(x340Var2, 844219039, 0, vu30Var, x340Var2);
                        x340Var2.r(false);
                        rih1Var2 = rih1Var;
                    }
                    if (rih1Var2 == null) {
                        x340Var2.i0(844219440);
                        uwo1.e(hn61Var.c, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                    } else {
                        x340Var2.i0(844218386);
                    }
                    x340Var2.r(false);
                    if (bool != null) {
                        x340Var2.i0(401086720);
                        boolean zBooleanValue = bool.booleanValue();
                        boolean zG = x340Var2.g(iu30Var);
                        Object objT = x340Var2.T();
                        if (zG || objT == fkj0.X) {
                            objT = new k4j(iu30Var, (byte) 17);
                            x340Var2.s0(objT);
                        }
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var2).b;
                        aex.b(zBooleanValue, (iu30) objT, uyn1.B(nim0Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), cwl1.o0(x340Var2, 2131961697), 0, (idn0) null, (ga80) null, x340Var2, 0, 112);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(401466315);
                        x340Var2.r(false);
                    }
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                    return rih1Var;
                }
                int iC = l1d.C(hn61Var.g);
                if (iC == 0) {
                    idxVar = new idx(4);
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    idxVar = jdx.c;
                }
                jdx jdxVar2 = idxVar;
                boolean zG2 = x340Var4.g(iu30Var);
                Object objT2 = x340Var4.T();
                if (zG2 || objT2 == fkj0.X) {
                    objT2 = new hdj(iu30Var, (byte) 28);
                    x340Var4.s0(objT2);
                }
                foo1.c(new gbx(z50Var, (Function0) objT2), jdxVar2, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1361493555, new lgj(hn61Var, (byte) 2), x340Var4), x340Var4, 0, 48, 2044);
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                    return rih1Var;
                }
                int iC2 = l1d.C(hn61Var.g);
                if (iC2 == 0) {
                    jdxVar = ldx.c;
                } else {
                    if (iC2 != 1) {
                        eg.o();
                        return null;
                    }
                    jdxVar = jdx.c;
                }
                jdx jdxVar3 = jdxVar;
                boolean zG3 = x340Var6.g(iu30Var);
                Object objT3 = x340Var6.T();
                if (zG3 || objT3 == fkj0.X) {
                    objT3 = new hdj(iu30Var, (byte) 29);
                    x340Var6.s0(objT3);
                }
                foo1.c(new gbx(z50Var, (Function0) objT3), jdxVar3, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1354816369, new lgj(hn61Var, (byte) 3), x340Var6), x340Var6, 0, 48, 2044);
                return rih1Var;
        }
    }
}
