package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zbf1 extends hab0 implements vu30 {
    public final /* synthetic */ ven0 X;
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ j7s c;
    public final /* synthetic */ qam1 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ rk41 g;
    public final /* synthetic */ List h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbf1(float f, float f2, j7s j7sVar, qam1 qam1Var, iu30 iu30Var, boolean z, rk41 rk41Var, List list, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3) {
        super(2);
        this.a = f;
        this.b = f2;
        this.c = j7sVar;
        this.d = qam1Var;
        this.e = iu30Var;
        this.f = z;
        this.g = rk41Var;
        this.h = list;
        this.i = ven0Var;
        this.t = ven0Var2;
        this.X = ven0Var3;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            float f = this.a;
            boolean zD = x340Var2.d(f);
            float f2 = this.b;
            boolean zD2 = zD | x340Var2.d(f2);
            Object objT = x340Var2.T();
            if (zD2 || objT == m4cVar) {
                objT = new e8(f, f2, (byte) 16);
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
            j7s j7sVar = this.c;
            List list = (List) j7sVar.f;
            boolean zI = x340Var2.i(j7sVar);
            qam1 qam1Var = this.d;
            boolean zI2 = zI | x340Var2.i(qam1Var);
            iu30 iu30Var = this.e;
            boolean zG = zI2 | x340Var2.g(iu30Var);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == m4cVar) {
                e971 e971Var = new e971(j7sVar, qam1Var, iu30Var, this.i, (byte) 18);
                x340Var2.s0(e971Var);
                objT2 = e971Var;
            }
            iu30 iu30Var2 = (iu30) objT2;
            boolean z = this.f;
            boolean z2 = !z;
            rk41 rk41Var = this.g;
            boolean z3 = rk41Var.a;
            boolean z4 = j7sVar.a;
            boolean zI3 = x340Var2.i(rk41Var);
            Object objT3 = x340Var2.T();
            if (zI3 || objT3 == m4cVar) {
                objT3 = new kf6(rk41Var, (byte) 6);
                x340Var2.s0(objT3);
            }
            acf1.b(list, iu30Var2, z2, z3, z4, (Function0) objT3, this.h, z ? null : (Integer) this.t.getValue(), ((Number) this.X.getValue()).intValue(), x340Var2, 8);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
