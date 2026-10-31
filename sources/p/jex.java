package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jex implements zu30 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;

    public jex(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
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
            n3g n3gVar = (n3g) this.a.get(iIntValue);
            x340Var2.i0(-1227527546);
            qim0 qim0VarX = lrn1.x(aqb0Var.a(nim0.a, irn1.l0(0.0f, 400.0f, (Object) null, 1), irn1.l0(0.0f, 400.0f, (Object) null, 1), this.b ? irn1.l0(0.0f, 400.0f, (Object) null, 1) : null), -iIntValue);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            k4s0.i(0, n3gVar.b, x340Var2, true, false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
