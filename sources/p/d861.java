package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d861 {
    public final d0r a;
    public final ajq0 b;
    public final lik1 c;
    public final o3r d = w3p1.o(new l4r(new xv00(rc11.a.b(jo70.class)), 1, p761.P0, new j4r(p761.N0), p761.Q0), p761.O0);

    public d861(d0r d0rVar, ajq0 ajq0Var, lik1 lik1Var) {
        this.a = d0rVar;
        this.b = ajq0Var;
        this.c = lik1Var;
    }

    public final void a(f861 f861Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        jo70 jo70Var;
        String str;
        m4c m4cVar = fkj0.X;
        String str2 = f861Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2042039658);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(f861Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            boolean zG = x340Var.g(str2);
            Object objT = x340Var.T();
            d0r d0rVar = this.a;
            if (zG || objT == m4cVar) {
                objT = d3p1.F(d0rVar, this.d, str2);
                x340Var.s0(objT);
            }
            i1r i1rVar = (k1r) rwq.h((zob1) objT, x340Var, 0).getValue();
            String str3 = null;
            i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
            if (i1rVar2 != null && (jo70Var = (jo70) i1rVar2.a) != null && (str = jo70Var.a) != null && !ihc1.y0(str)) {
                str3 = str;
            }
            if (str3 == null) {
                str3 = "";
            }
            boolean zG2 = x340Var.g(d0rVar) | ((i3 & 14) == 4);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                dnc0 dnc0Var = new dnc0(this.a, (Function0) null, (Function0) null, (cc9) null, (guh0) null, 126);
                dnc0Var.b(new gj50(new b861(f861Var, (byte) 0), false), new c861(this, f861Var, (byte) 0));
                objT2 = dnc0Var.a();
                x340Var.s0(objT2);
            }
            cnc0 cnc0Var = (cnc0) objT2;
            boolean zG3 = x340Var.g(str2);
            Object objT3 = x340Var.T();
            if (zG3 || objT3 == m4cVar) {
                objT3 = new etk0(str2);
                x340Var.s0(objT3);
            }
            etk0 etk0Var = (etk0) objT3;
            boolean zI = x340Var.i(etk0Var);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new mn41(etk0Var, (byte) 26);
                x340Var.s0(objT4);
            }
            q1d0 q1d0VarN = jyo1.n(xtb0VarA, cnc0Var, new h3h1((iu30) objT4), x340Var, 0);
            j2i j2iVarR = apo.r(-145394621, new nl41(str3, (byte) 7), x340Var);
            j2i j2iVarR2 = apo.r(796334653, new a861(xtb0VarA, q1d0VarN, (byte) 0), x340Var);
            int i4 = ((i3 >> 3) & 14) | 24624;
            qim0 qim0Var3 = nim0.a;
            irn1.u(qim0Var3, j2iVarR, (vu30) null, (erl1) null, j2iVarR2, x340Var, i4, 12);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(this, f861Var, qim0Var2, i, (byte) 12);
        }
    }
}
