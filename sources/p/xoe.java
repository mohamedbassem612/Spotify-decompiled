package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xoe extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xoe(Function0 function0, Function0 function1, boolean z, boolean z2, int i) {
        super(2);
        this.a = (byte) 1;
        this.b = function0;
        this.c = function1;
        this.d = z;
        this.e = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        gex0 gex0Var = h36.a;
        nim0 nim0Var = nim0.a;
        Function0 function0 = this.c;
        boolean z = this.e;
        Function0 function1 = this.b;
        boolean z2 = this.d;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    jw31 jw31VarA = ew31.a(gex0Var, een.N0, x340Var2, 0);
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
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    loo1.h(function1, x340Var2, 0);
                    if (!z2 || z) {
                        x340Var2.i0(331271948);
                    } else {
                        x340Var2.i0(-1928977729);
                        oto1.f(0, function0, x340Var2, null);
                    }
                    x340Var2.r(false);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                m1p1.b(czo1.p(1), this.b, this.c, (b0k) obj, this.d, this.e);
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                vby0.d(czo1.p(1), this.b, this.c, (b0k) obj, this.d, this.e);
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    jw31 jw31VarA2 = ew31.a(gex0Var, een.N0, x340Var4, 0);
                    int iHashCode2 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(x340Var4, nim0Var);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(jw31VarA2, x340Var4, y580.O0);
                    nko1.H(xos0VarM2, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE2, x340Var4, y580.Y);
                    if (z2) {
                        x340Var4.i0(-1634719963);
                        gbx gbxVar = new gbx(z50.c, function1);
                        ldx ldxVar = ldx.c;
                        gdx gdxVarS = yla.s(x340Var4);
                        uwr uwrVar = cbx.a;
                        mta mtaVar = cbx.b(x340Var4).d;
                        qim0 qim0VarN = anm1.N("KeyboardAccessory.MicButton", u291.r(nim0Var, 32.0f));
                        cvx cvxVar = cbx.b(x340Var4).b;
                        wro1.h(gbxVar, ldxVar, qim0VarN, jax.a, gdxVarS, new zzq0(4.0f, 4.0f, 4.0f, 4.0f), false, null, null, kui.a, x340Var4, 12582912, 6, 776);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-1633797930);
                        x340Var4.r(false);
                    }
                    if (z) {
                        x340Var4.i0(-1022533291);
                        oto1.f(0, function0, x340Var4, null);
                    } else {
                        x340Var4.i0(-1633721546);
                    }
                    x340Var4.r(false);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                poo1.n(czo1.p(1), this.b, this.c, (b0k) obj, this.d, this.e);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xoe(Function0 function0, boolean z, boolean z2, Function0 function1) {
        super(2);
        this.a = (byte) 0;
        this.b = function0;
        this.d = z;
        this.e = z2;
        this.c = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xoe(boolean z, Function0 function0, boolean z2, Function0 function1) {
        super(2);
        this.a = (byte) 3;
        this.d = z;
        this.b = function0;
        this.e = z2;
        this.c = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xoe(boolean z, boolean z2, Function0 function0, Function0 function1, int i, byte b) {
        super(2);
        this.a = b;
        this.d = z;
        this.e = z2;
        this.b = function0;
        this.c = function1;
    }
}
