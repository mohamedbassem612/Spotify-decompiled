package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yxg1 extends hab0 implements xu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ jye1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxg1(float f, float f2, ArrayList arrayList, jye1 jye1Var) {
        super(3);
        this.a = f;
        this.b = f2;
        this.c = arrayList;
        this.d = jye1Var;
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
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var2).b.c;
            float f2 = cbx.b(x340Var2).b.e;
            float fD = i2cVar.d();
            float fC = i2cVar.c();
            float f3 = 2.0f * f;
            float f4 = this.a;
            if (p3v.b(fC, f4 + f3 + f2) >= 0) {
                f2 = 0.0f;
            }
            Comparable comparableA = pap1.A(new p3v(f4), new p3v(fD), zjy.p(0.0f, new p3v((fC - f3) - f2)));
            if (p3v.b(((p3v) comparableA).a, this.b) < 0) {
                comparableA = null;
            }
            p3v p3vVar = (p3v) comparableA;
            nim0 nim0Var = nim0.a;
            if (p3vVar != null) {
                x340Var2.i0(1425589180);
                mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 48);
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
                op71.g(x340Var2, u291.h(nim0Var, f));
                crn1.a((tob1) this.c.get(1), (qim0) null, apo.r(-558344072, new xaf1(this.d, p3vVar, (byte) 17), x340Var2), x340Var2, 384);
                op71.g(x340Var2, u291.h(nim0Var, f));
                x340Var2.r(true);
                x340Var2.r(false);
            } else {
                v8i0.i(f, 1426138345, x340Var2, x340Var2, nim0Var);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
