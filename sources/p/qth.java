package p;

import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qth extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d8a b;
    public final /* synthetic */ x4a c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qth(qim0 qim0Var, d8a d8aVar, x4a x4aVar, Function0 function0) {
        super(2);
        this.a = (byte) 0;
        this.e = qim0Var;
        this.b = d8aVar;
        this.c = x4aVar;
        this.d = function0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        af5 af5VarG;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 1;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                byte b3 = 0;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    long j = cbx.a(x340Var2).b.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    mta mtaVar = cbx.b(x340Var2).d;
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    qim0 qim0VarF = u291.f(zr7.i(dug.f(this.e, cbx.a(x340Var2).a.c, d4o1.a), o40.d1), 1.0f);
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
                    cwl1.f(i3o1.n(2131233220, x340Var2, 0), (String) null, u291.r(uyn1.x(u291.a(nim0.a, 48.0f, 48.0f), 12.0f), 24.0f), een.h, (j6m) null, 0.0f, (ColorFilter) null, x340Var2, 56, 112);
                    d8a d8aVar = this.b;
                    if (d8aVar instanceof c8a) {
                        x340Var2.i0(1543410300);
                        af5VarG = new af5(cwl1.o0(x340Var2, ((c8a) d8aVar).a));
                        x340Var2.r(false);
                    } else {
                        if (!(d8aVar instanceof b8a)) {
                            throw p3d1.k(x340Var2, 1543408569, false);
                        }
                        x340Var2.i0(1543413302);
                        af5VarG = ((b8a) d8aVar).a.g(x340Var2);
                        x340Var2.r(false);
                    }
                    uwo1.d(af5VarG, j, uyn1.z(0.0f, 4.0f, 1, u291.b(0.0f, 24.0f, 1, new wnb0(1.0f, true))), cbx.d(x340Var2).g, new a0e1(5), null, 2, false, new cjc0(2), 0, null, null, x340Var2, 0, 0, 3744);
                    gfx.g(8, apo.r(302194716, new oth(this.c, b2), x340Var2), x340Var2, 54);
                    gfx.g(7, apo.r(1521946515, new pth(this.d, j, b3), x340Var2), x340Var2, 54);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                e9p1.b(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                ltn1.q(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qth(d8a d8aVar, x4a x4aVar, Function0 function0, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = d8aVar;
        this.c = x4aVar;
        this.d = function0;
        this.e = qim0Var;
    }
}
