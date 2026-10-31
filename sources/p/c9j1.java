package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c9j1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ cv30 i;
    public final /* synthetic */ cv30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9j1(String str, String str2, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i) {
        super(2);
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = function0;
        this.h = function1;
        this.i = function2;
        this.t = function3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        vu30 vu30Var = this.t;
        iu30 iu30Var = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarX = uyn1.x(u291.f(nim0Var, 1.0f), 8.0f);
                    Function0 function0 = (Function0) obj6;
                    Function0 function1 = (Function0) obj5;
                    String str = (String) obj4;
                    Function0 function2 = (Function0) iu30Var;
                    String str2 = (String) obj3;
                    Function0 function3 = (Function0) vu30Var;
                    jw31 jw31VarA = ew31.a(h36.g, een.O0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
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
                    p1p1.w(this.d, this.e, function0, function1, uyn1.B(nim0Var, 4.0f, 0.0f, 12.0f, 0.0f, 10), x340Var2, 0);
                    lee1 lee1Var = cbx.d(x340Var2).n;
                    boolean z = this.f;
                    boolean zH = x340Var2.h(z) | x340Var2.g(function2);
                    Object objT = x340Var2.T();
                    if (zH || objT == fkj0.X) {
                        objT = new y96(z, function2, (byte) 9);
                        x340Var2.s0(objT);
                    }
                    c0p1.e(str, 1, lee1Var, (Function0) objT, apo.r(-351001306, new c980(str2, z, function3), x340Var2), x340Var2, 24624);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                p1p1.l((String) obj4, (String) obj3, this.d, this.e, this.f, (Function0) obj6, (Function0) obj5, (Function0) iu30Var, (Function0) vu30Var, (b0k) obj, iP);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                p1p1.v((o2u0) obj6, (List) obj5, this.d, this.e, this.f, iu30Var, vu30Var, (vu30) obj4, (qim0) obj3, (b0k) obj, iP2);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9j1(o2u0 o2u0Var, List list, boolean z, boolean z2, boolean z3, iu30 iu30Var, vu30 vu30Var, vu30 vu30Var2, qim0 qim0Var, int i) {
        super(2);
        this.g = o2u0Var;
        this.h = list;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.i = iu30Var;
        this.t = vu30Var;
        this.b = vu30Var2;
        this.c = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9j1(boolean z, boolean z2, Function0 function0, Function0 function1, String str, boolean z3, Function0 function2, String str2, Function0 function3) {
        super(2);
        this.d = z;
        this.e = z2;
        this.g = function0;
        this.h = function1;
        this.b = str;
        this.f = z3;
        this.i = function2;
        this.c = str2;
        this.t = function3;
    }
}
