package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c8l1 implements zu30 {
    public final /* synthetic */ List a;
    public final /* synthetic */ z7l1 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ zau0 d;
    public final /* synthetic */ l6k1 e;
    public final /* synthetic */ lvd f;
    public final /* synthetic */ iac0 g;
    public final /* synthetic */ a9l1 h;

    public c8l1(List list, z7l1 z7l1Var, float f, zau0 zau0Var, l6k1 l6k1Var, lvd lvdVar, iac0 iac0Var, a9l1 a9l1Var) {
        this.a = list;
        this.b = z7l1Var;
        this.c = f;
        this.d = zau0Var;
        this.e = l6k1Var;
        this.f = lvdVar;
        this.g = iac0Var;
        this.h = a9l1Var;
    }

    @Override // p.zu30
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        y7l1 y7l1Var = this.b.a;
        Object obj5 = fkj0.X;
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            w7l1 w7l1Var = (w7l1) this.a.get(iIntValue);
            x340Var2.i0(-1382076080);
            boolean zG = x340Var2.g(w7l1Var.f);
            Object objT = x340Var2.T();
            if (zG || objT == obj5) {
                objT = this.e.a(new hcf1(this.f, (byte) 29), this.g, this.h);
                x340Var2.s0(objT);
            }
            o6k1 o6k1Var = (o6k1) objT;
            float f = y7l1Var.c ? 0.6666667f : 0.5625f;
            float f2 = this.c;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarS = d7e.s(u291.v(nim0Var, f2), f);
            String str = w7l1Var.b;
            t7l1 t7l1Var = w7l1Var.a;
            String str2 = w7l1Var.f;
            int i2 = i;
            m6k1 m6k1Var = new m6k1(t7l1Var, str, w7l1Var.c, this.d, str2, w7l1Var.e, w7l1Var.d, y7l1Var.d, y7l1Var.e, w7l1Var.g, 512);
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, y7l1Var.c ? 10.0f : 0.0f, 0.0f, 11);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(tgp1.l(x340Var2));
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            String str3 = w7l1Var.f;
            boolean z = (((i2 & 112) ^ 48) > 32 && x340Var2.e(iIntValue)) || (i2 & 48) == 32;
            Object objT2 = x340Var2.T();
            if (z || objT2 == obj5) {
                objT2 = new sl11(iIntValue, (byte) 21);
                x340Var2.s0(objT2);
            }
            dgo1.c(str3, (iu30) objT2, apo.r(-1450207704, new pej1(o6k1Var, m6k1Var, qim0VarS, (byte) 13), x340Var2), x340Var2, 384);
            x340Var2.r(true);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
