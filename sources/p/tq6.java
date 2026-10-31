package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tq6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tq6(String str, String str2, Function0 function0, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        String str = this.c;
        String str2 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                flo1.a(czo1.p(1), str2, str, function0, (b0k) obj);
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
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
                    String strO0 = cwl1.o0(x340Var2, 2131953715);
                    uwr uwrVar = cbx.a;
                    vbe.s(strO0, (qim0) null, cbx.a(x340Var2).b.c, cbx.a(x340Var2).b.c, cbx.d(x340Var2).k, false, x340Var2, 0, 34);
                    cvx cvxVar = cbx.b(x340Var2).b;
                    uwo1.e(ydh.g(8.0f, 2131953713, x340Var2, x340Var2, nim0Var), (qim0) null, cbx.d(x340Var2).h, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    op71.g(x340Var2, u291.h(nim0Var, 12.0f));
                    fqo1.n(0, str2, str, x340Var2, (qim0) null);
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    String strG = ydh.g(16.0f, 2131953712, x340Var2, x340Var2, nim0Var);
                    boolean zG = x340Var2.g(function0);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new pj8(function0, (byte) 26);
                        x340Var2.s0(objT);
                    }
                    Function0 function1 = (Function0) objT;
                    if (ihc1.y0(strG)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50(strG), function1), new idx(4), (qim0) null, (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-386397795, new j3b(strG, (byte) 17), x340Var2), x340Var2, 0, 48, 2012);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                wm5.j(czo1.p(1), str2, str, function0, (b0k) obj);
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (str2 == null) {
                        str2 = str;
                    }
                    if (ihc1.y0(str2)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50(str2), function0), new idx(19), anm1.N("hint_card_button", nim0Var), (max) null, yla.s(x340Var4), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1422104975, new dz40(str, (byte) 9), x340Var4), x340Var4, 384, 48, 2008);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                fqo1.m(czo1.p(1), str2, str, function0, (b0k) obj);
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                tx9.g(czo1.p(1), str2, str, function0, (b0k) obj);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                g3p1.l(czo1.p(1), str2, str, function0, (b0k) obj);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tq6(String str, String str2, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = function0;
    }
}
