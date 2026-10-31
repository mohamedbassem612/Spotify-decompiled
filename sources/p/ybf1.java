package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ybf1 extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ tnu0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ lz20 f;
    public final /* synthetic */ ven0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybf1(float f, float f2, tnu0 tnu0Var, Function0 function0, boolean z, lz20 lz20Var, ven0 ven0Var) {
        super(2);
        this.a = f;
        this.b = f2;
        this.c = tnu0Var;
        this.d = function0;
        this.e = z;
        this.f = lz20Var;
        this.g = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            float f = this.a;
            boolean zD = x340Var2.d(f);
            float f2 = this.b;
            boolean zD2 = zD | x340Var2.d(f2);
            Object objT = x340Var2.T();
            if (zD2 || objT == fkj0.X) {
                objT = new e8(f, f2, (byte) 15);
                x340Var2.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0VarF, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.e, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarC);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            boolean z = this.e;
            acf1.a(this.c, this.d, z, this.f, z ? Integer.valueOf(((Number) this.g.getValue()).intValue()) : null, x340Var2, 3080);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
