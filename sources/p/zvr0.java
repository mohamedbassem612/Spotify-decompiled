package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zvr0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ bmg1 b;
    public final /* synthetic */ dlg1 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvr0(iu30 iu30Var, bmg1 bmg1Var, dlg1 dlg1Var) {
        super(3);
        this.d = iu30Var;
        this.b = bmg1Var;
        this.c = dlg1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                nko1.d(0, (b0k) obj2, this.d, null, this.c, this.b);
                return rih1Var;
            default:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarB = uyn1.B(u291.d(nim0Var, 1.0f), 0.0f, 0.0f, 0.0f, ((vzq0) obj).a(), 7);
                Float fValueOf = Float.valueOf(0.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarE = dug.e(qim0VarB, v9c.t(new mmr0[]{new mmr0(fValueOf, new u7h(((xex) ((gmt) zex.a.c).b).z)), new mmr0(Float.valueOf(0.5f), new u7h(cbx.a(x340Var).a.c)), new mmr0(Float.valueOf(1.0f), new u7h(cbx.a(x340Var).a.c))}, 0.0f, 0.0f, 14), null, 0.0f, 6);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarE);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(hmb0.t1);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, y580.Y);
                iu30 iu30Var = this.d;
                dlg1 dlg1Var = this.c;
                bmg1 bmg1Var = this.b;
                nko1.w(0, x340Var, iu30Var, null, dlg1Var, bmg1Var);
                if (u890.j(bmg1Var.h, emg1.a)) {
                    x340Var3.i0(-2086142483);
                    nko1.i(0, x340Var, iu30Var, h2c.a.a(nim0Var, een.X));
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-2086052149);
                    x340Var3.r(false);
                }
                x340Var3.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvr0(bmg1 bmg1Var, dlg1 dlg1Var, iu30 iu30Var) {
        super(3);
        this.b = bmg1Var;
        this.c = dlg1Var;
        this.d = iu30Var;
    }
}
