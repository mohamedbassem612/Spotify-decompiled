package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bs70 extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ yr70 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ drr0 f;
    public final /* synthetic */ ven0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs70(float f, yr70 yr70Var, ven0 ven0Var, float f2, float f3, drr0 drr0Var, ven0 ven0Var2) {
        super(2);
        this.a = f;
        this.b = yr70Var;
        this.c = ven0Var;
        this.d = f2;
        this.e = f3;
        this.f = drr0Var;
        this.g = ven0Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = dug.f(u291.d(nim0Var, 1.0f), u7h.b(u7h.b, this.a, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            Uri uri = Uri.parse(this.b.c);
            ven0 ven0Var = this.c;
            boolean zI = x340Var2.i(ven0Var);
            Object objT = x340Var2.T();
            if (zI || objT == m4cVar) {
                objT = new i030(ven0Var, (byte) 22);
                x340Var2.s0(objT);
            }
            qim0 qim0VarS = u291.s(eqr0.B(nim0Var, (iu30) objT), this.d, this.e);
            drr0 drr0Var = this.f;
            boolean zI2 = x340Var2.i(drr0Var);
            ven0 ven0Var2 = this.g;
            boolean zI3 = zI2 | x340Var2.i(ven0Var2);
            Object objT2 = x340Var2.T();
            if (zI3 || objT2 == m4cVar) {
                objT2 = new tqm(drr0Var, ven0Var2, (byte) 2);
                x340Var2.s0(objT2);
            }
            eso1.e(uri, isl.a, i541.C(qim0VarS, (iu30) objT2), (p3v) null, (zvx) null, (ecx) null, mif1.S0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 224304, 0, 3968);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
