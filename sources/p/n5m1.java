package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n5m1 implements nk90 {
    public final String a;
    public final y4m1 b;
    public final yd91 c = new yd91(3, new bkk1(this, 22));
    public final n381 d;

    public n5m1(String str, ytw0 ytw0Var, y4m1 y4m1Var) {
        this.a = str;
        this.b = y4m1Var;
        m5m1 m5m1Var = m5m1.b;
        n381 n381Var = p381.a;
        this.d = new n381(m5m1Var);
    }

    @Override // p.nk90
    public final float b() {
        return 24.0f;
    }

    @Override // p.pk90
    public final m381 c() {
        return this.d;
    }

    @Override // p.pk90
    public final yd91 d() {
        return this.c;
    }

    public final void e(hwq hwqVar, b0k b0kVar, int i) {
        int i2;
        l7e0 l7e0Var = hwqVar.g;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1683374360);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(hwqVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zG = x340Var.g(l7e0Var);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = Integer.valueOf(l7e0Var instanceof j7e0 ? ytw0.f(((j7e0) l7e0Var).a.g).b.size() : 0);
                x340Var.s0(objT);
            }
            int iIntValue = ((Number) objT).intValue();
            String str = this.a;
            boolean zG2 = x340Var.g(str);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == obj) {
                objT2 = this.b.b(str);
                x340Var.s0(objT2);
            }
            ven0 ven0VarG = rwq.g((mr20) objT2, new czl1(false, true, false), (o8n) null, x340Var, 0, 2);
            Object[] objArr = new Object[0];
            boolean zI = x340Var.i(ven0VarG);
            Object objT3 = x340Var.T();
            if (zI || objT3 == obj) {
                objT3 = new l5m1(ven0VarG, (byte) 0);
                x340Var.s0(objT3);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT3, x340Var, 0);
            Boolean boolValueOf = Boolean.valueOf(((czl1) ven0VarG.getValue()).a);
            boolean zI2 = x340Var.i(ven0Var) | x340Var.i(ven0VarG);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == obj) {
                objT4 = new vs3(ven0VarG, ven0Var, (lnm) null, (byte) 12);
                x340Var.s0(objT4);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT4);
            float f = ((Boolean) ven0Var.getValue()).booleanValue() ? 24.0f : 0.0f;
            uwr uwrVar = cbx.a;
            tob1 tob1VarA = z95.a(f, irn1.o0((int) jfv.h(cbx.c(x340Var).b.b), 0, ((jhx) cbx.c(x340Var).a.b).a, 2), (String) null, x340Var, 0, 12);
            y9g1.j(((p3v) tob1VarA.getValue()).a, ((p3v) tob1VarA.getValue()).a / 24.0f, (((czl1) ven0VarG.getValue()).b && ((czl1) ven0VarG.getValue()).a) ? iIntValue : 0, 0, x340Var, (qim0) null);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new exk1(this, hwqVar, i, (byte) 3);
        }
    }
}
