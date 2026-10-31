package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z96 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z96(Function0 function0, boolean z, boolean z2, boolean z3, String str, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 0;
        this.f = function0;
        this.b = z;
        this.d = z2;
        this.e = z3;
        this.c = str;
        this.g = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        qim0 qim0VarZ;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.g;
        Object obj4 = this.c;
        Object obj5 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                r4o1.s((Function0) obj5, this.b, this.d, this.e, (String) obj4, (qim0) obj3, (b0k) obj, iP);
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0Var = nim0.a;
                    qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarZ2 = uyn1.z(0.0f, 4.0f, 1, qim0VarF);
                    boolean z = this.b;
                    if (z) {
                        x340Var2.i0(-933751739);
                        x340Var2.r(false);
                        qim0VarZ = qim0Var;
                    } else {
                        x340Var2.i0(-933847281);
                        cvx cvxVar2 = cbx.b(x340Var2).b;
                        qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var);
                        x340Var2.r(false);
                    }
                    qim0 qim0VarThen = qim0VarZ2.then(qim0VarZ);
                    iu30 iu30Var = (iu30) obj5;
                    j2e0 j2e0Var = (j2e0) obj3;
                    String str = (String) obj4;
                    jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarThen);
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
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    if (z) {
                        x340Var2.i0(247122464);
                        p2o1.d(iu30Var, j2e0Var, (qim0) null, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(247198383);
                        x340Var2.r(false);
                    }
                    pw31 pw31Var = pw31.a;
                    if (str == null || str.length() <= 0) {
                        x340Var2.i0(247601786);
                        t1c.a(pw31Var.a(1.0f, qim0Var, true), x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(247258554);
                        uwo1.e(str, pw31Var.e(pw31Var.a(1.0f, qim0Var, true), een.N0), cbx.d(x340Var2).h, 0L, new a0e1(z ? 3 : 5), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1704);
                        x340Var2 = x340Var2;
                        x340Var2.r(false);
                    }
                    boolean z2 = this.d;
                    boolean z3 = this.e;
                    if (z2) {
                        x340Var2.i0(247694631);
                        p2o1.c(z3, iu30Var, j2e0Var, (qim0) null, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(247867239);
                        p2o1.f(z3, iu30Var, j2e0Var, (qim0) null, x340Var2, 0);
                        x340Var2.r(false);
                    }
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(196609);
                u4p1.r((r9d1) obj5, (iu30) obj4, this.b, this.d, this.e, (j2i) obj3, (b0k) obj, iP2);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                p1p1.x((o2u0) obj5, (List) obj4, this.b, this.d, this.e, (iu30) obj3, (b0k) obj, iP3);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z96(Object obj, Object obj2, boolean z, boolean z2, boolean z3, cv30 cv30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.f = obj;
        this.c = obj2;
        this.b = z;
        this.d = z2;
        this.e = z3;
        this.g = cv30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z96(boolean z, iu30 iu30Var, j2e0 j2e0Var, String str, boolean z2, boolean z3) {
        super(2);
        this.a = (byte) 1;
        this.b = z;
        this.f = iu30Var;
        this.g = j2e0Var;
        this.c = str;
        this.d = z2;
        this.e = z3;
    }
}
