package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m6f1 extends hab0 implements xu30 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ tob1 Y;
    public final /* synthetic */ tob1 Z;
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ hdn0 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ drr0 f;
    public final /* synthetic */ j2i g;
    public final /* synthetic */ int h;
    public final /* synthetic */ c380 i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6f1(float f, float f2, int i, hdn0 hdn0Var, ven0 ven0Var, drr0 drr0Var, j2i j2iVar, int i2, c380 c380Var, boolean z, boolean z2, ven0 ven0Var2, ven0 ven0Var3) {
        super(3);
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = hdn0Var;
        this.e = ven0Var;
        this.f = drr0Var;
        this.g = j2iVar;
        this.h = i2;
        this.i = c380Var;
        this.t = z;
        this.X = z2;
        this.Y = ven0Var2;
        this.Z = ven0Var3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(i2cVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            List list = k6f1.a;
            float f = this.a + 1.0f;
            float f2 = zjy.j(i2cVar.c() / f, new p3v(this.b)).a;
            float f3 = f2 * f;
            float f4 = (0.08f * f2) + f3;
            float fD = i2cVar.d();
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = us71.i(Float.NaN, x340Var2);
            }
            drr0 drr0Var = (drr0) objT;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            Integer numValueOf = Integer.valueOf(this.c);
            hdn0 hdn0Var = this.d;
            boolean zG = x340Var2.g(hdn0Var);
            ven0 ven0Var = this.e;
            boolean zG2 = zG | x340Var2.g(ven0Var);
            drr0 drr0Var2 = this.f;
            boolean zG3 = zG2 | x340Var2.g(drr0Var2);
            Object objT2 = x340Var2.T();
            if (zG3 || objT2 == m4cVar) {
                objT2 = new mhg(hdn0Var, drr0Var2, ven0Var, (byte) 13);
                x340Var2.s0(objT2);
            }
            qim0 qim0VarB = f8d1.b(qim0VarF, numValueOf, (PointerInputEventHandler) objT2);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 48);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = new qg6(drr0Var, (byte) 24);
                x340Var2.s0(objT3);
            }
            smo1.h(f3, f4, ern1.x(qim0VarF2, (iu30) objT3), apo.r(-1274440087, new l6f1(this.h, this.i, this.c, f3, f2, f4, fD, this.t, this.X, ven0Var, this.f, this.Y, this.Z, drr0Var), x340Var2), x340Var2, 3456);
            dv20.l(0, this.g, x340Var2, true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
