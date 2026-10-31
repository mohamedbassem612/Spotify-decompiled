package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xpg1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ cv30 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpg1(Function0 function0, Function0 function1, o6j1 o6j1Var, boolean z, boolean z2, boolean z3, Function0 function2, j2i j2iVar) {
        super(3);
        this.b = function0;
        this.c = function1;
        this.g = o6j1Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.h = function2;
        this.i = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.i;
        Object obj5 = this.h;
        iu30 iu30Var = this.c;
        Object obj6 = this.b;
        Object obj7 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                tob1 tob1Var = (tob1) obj4;
                tob1 tob1Var2 = (tob1) obj5;
                if (this.d) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(44947562);
                    String str = (String) obj7;
                    Function0 function0 = (Function0) obj6;
                    Function0 function1 = (Function0) iu30Var;
                    boolean zI = x340Var2.i(tob1Var2) | x340Var2.i(tob1Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new dy(tob1Var2, tob1Var, (byte) 11);
                        x340Var2.s0(objT);
                    }
                    qon1.f(str, this.e, this.f, function0, function1, i541.C(nim0Var, (iu30) objT), x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(45358219);
                    cbx.a.getClass();
                    qon1.g(d7e.r(uwr.d().a, nim0Var, false), x340Var3, 0);
                    x340Var3.r(false);
                }
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                x340 x340Var4 = (b0k) obj2;
                Object objT2 = x340Var4.T();
                if (objT2 == fkj0.X) {
                    objT2 = ktd.n(x340Var4);
                }
                qim0 qim0VarF = u291.f(bin.y(nim0.a, (idn0) objT2, jtr.c, false, null, null, null, (Function0) obj6, (Function0) iu30Var, 444), 1.0f);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var4).f;
                w2g0.c(dug.f(i1p1.q(qim0VarF, er31.b(8.0f)), cbx.a(x340Var4).a.a.a(), d4o1.a), (tl3) null, apo.r(-669621928, new hb7((o6j1) obj7, this.d, this.e, this.f, (Function0) obj5, (j2i) obj4), x340Var4), x340Var4, 3072, 6);
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj2;
                ((Number) obj3).intValue();
                w0o1.d(1, apo.r(2106241019, new hb7((o2u0) obj7, (List) obj6, this.d, this.e, this.f, iu30Var), x340Var5), x340Var5, 54);
                qim0 qim0VarB = ((g2c) obj).b(nim0Var);
                vu30 vu30Var = (vu30) obj5;
                vu30 vu30Var2 = (vu30) obj4;
                mbh mbhVarA = jbh.a(h36.g, een.P0, x340Var5, 0);
                x340 x340Var6 = x340Var5;
                int iHashCode = Long.hashCode(x340Var6.T);
                xos0 xos0VarM = x340Var6.m();
                qim0 qim0VarE = zr7.E(x340Var5, qim0VarB);
                hzj.A.getClass();
                x340 x340Var7 = x340Var5;
                if (x340Var7.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var7.m0();
                if (x340Var7.S) {
                    x340Var7.l(hmb0.t1);
                } else {
                    x340Var7.v0();
                }
                nko1.H(mbhVarA, x340Var5, y580.O0);
                nko1.H(xos0VarM, x340Var5, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var5, y580.R0);
                nko1.F(x340Var5);
                nko1.H(qim0VarE, x340Var5, y580.Y);
                if (vu30Var != null) {
                    x340Var7.i0(-990477992);
                    vu30Var.invoke(x340Var5, 0);
                } else {
                    x340Var7.i0(-990477319);
                    op71.g(x340Var5, nim0Var);
                }
                x340Var7.r(false);
                if (vu30Var2 != null) {
                    x340Var7.i0(-990475720);
                    vu30Var2.invoke(x340Var5, 0);
                } else {
                    x340Var7.i0(-990475047);
                    op71.g(x340Var5, nim0Var);
                }
                x340Var7.r(false);
                x340Var7.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpg1(o2u0 o2u0Var, List list, boolean z, boolean z2, boolean z3, iu30 iu30Var, vu30 vu30Var, vu30 vu30Var2) {
        super(3);
        this.g = o2u0Var;
        this.b = list;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.c = iu30Var;
        this.h = vu30Var;
        this.i = vu30Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpg1(boolean z, String str, boolean z2, boolean z3, Function0 function0, Function0 function1, tob1 tob1Var, tob1 tob1Var2) {
        super(3);
        this.d = z;
        this.g = str;
        this.e = z2;
        this.f = z3;
        this.b = function0;
        this.c = function1;
        this.h = tob1Var;
        this.i = tob1Var2;
    }
}
