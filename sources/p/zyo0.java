package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zyo0 implements xpw {
    public final ror a;
    public final ov4 b;
    public final ypg0 c;
    public final js20 d;
    public final eih1 e;
    public final psw f;

    public zyo0(List list, q8n q8nVar, ror rorVar, ov4 ov4Var) {
        xe01 xe01VarB;
        this.a = rorVar;
        this.b = ov4Var;
        list = list.isEmpty() ? null : list;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                mr20 mr20VarA = ((wyo0) it.next()).a();
                ytw0 ytw0Var = jfv.b;
                arrayList.add(i6p1.w(mr20VarA, fdg1.k0(1, ngv.e), wso0.d));
            }
            xe01VarB = d5p1.t(new wa3((mr20[]) o7h.l1(arrayList).toArray(new mr20[0]), (byte) 28), smo1.e(q8nVar), new alb1(0L, Long.MAX_VALUE), (Object) null);
        } else {
            xe01VarB = gio1.b(w7x.a);
        }
        this.c = new ypg0(cmo0.Z, xe01VarB);
        this.d = x3p1.m(new any(xe01VarB, (byte) 18), cmo0.Y, ofo0.Z, (o8n) null, (iu30) null, 24);
        this.e = new eih1();
        j2i j2iVar = new j2i(934659370, new aso0(this, (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    public final void e(vyo0 vyo0Var, float f, boolean z, b0k b0kVar, int i) {
        qim0 qim0VarQ;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1582721738);
        int i2 = i | (x340Var.i(vyo0Var) ? 4 : 2) | (x340Var.d(f) ? 32 : 16) | (x340Var.h(z) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(-712155108);
                x340Var.r(false);
                qim0VarQ = i1p1.q(u291.f(nim0Var, 1.0f), er31.b(f));
            } else {
                x340Var.i0(-712067440);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0VarQ = i1p1.q(uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, 4.0f, 7), er31.b(f));
                x340Var.r(false);
            }
            otw.c(vyo0Var.a, vyo0Var.b, qim0VarQ, (ipb1) null, x340Var, 0, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l3a(this, vyo0Var, f, z, i, (byte) 4);
        }
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
