package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g1t {
    public final yqg a;
    public final gw70 b;
    public final tvb0 c;
    public final tm d;
    public final p40 e;
    public final ejs f;
    public final l6s g;
    public final aum1 h;
    public final mes i;
    public final z0t j;
    public final hvq k;
    public final kly0 l;

    public g1t(yqg yqgVar, gw70 gw70Var, tvb0 tvb0Var, tm tmVar, lhc lhcVar, p40 p40Var, ejs ejsVar, l6s l6sVar, aum1 aum1Var, mes mesVar, z0t z0tVar, hvq hvqVar, tsq tsqVar) {
        this.a = yqgVar;
        this.b = gw70Var;
        this.c = tvb0Var;
        this.d = tmVar;
        this.e = p40Var;
        this.f = ejsVar;
        this.g = l6sVar;
        this.h = aum1Var;
        this.i = mesVar;
        this.j = z0tVar;
        this.k = hvqVar;
        this.l = tsqVar;
    }

    public final void a(qvm1 qvm1Var, upb0 upb0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        Object obj;
        Object ml1Var;
        hlu hluVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-685547484);
        int i2 = i | (x340Var.i(qvm1Var) ? 4 : 2) | (x340Var.g(upb0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(this) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean zB = ef.a(x340Var).b(3);
            uf20 uf20Var = qvm1Var.e.e;
            boolean z = qvm1Var.i;
            i4d0 i4d0Var = qvm1Var.f;
            List list = qvm1Var.g;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                obj = objT;
                hlu hluVar2 = new hlu(c97.b(1.0f));
                hluVar2.a(list, i4d0Var, z);
                x340Var.s0(hluVar2);
                obj = hluVar2;
            }
            obj = objT;
            hlu hluVar3 = (hlu) obj;
            ven0 ven0VarS = v8r.s(Integer.valueOf(uf20Var.a), x340Var);
            ven0 ven0VarS2 = v8r.s(uf20Var.g, x340Var);
            ven0 ven0VarS3 = v8r.s(qvm1Var.a, x340Var);
            ven0 ven0VarS4 = v8r.s(list, x340Var);
            ven0 ven0VarS5 = v8r.s(i4d0Var, x340Var);
            ven0 ven0VarS6 = v8r.s(Boolean.valueOf(z), x340Var);
            Boolean boolValueOf = Boolean.valueOf(zB);
            boolean zH = x340Var.h(zB) | x340Var.g(ven0VarS) | x340Var.g(ven0VarS4) | x340Var.g(ven0VarS5) | x340Var.g(ven0VarS6) | x340Var.g(ven0VarS2) | x340Var.g(ven0VarS3);
            Object objT2 = x340Var.T();
            if (zH || objT2 == m4cVar) {
                hluVar = hluVar3;
                ml1Var = new ml1(zB, ven0VarS, ven0VarS4, hluVar, ven0VarS5, ven0VarS6, ven0VarS2, ven0VarS3, (lnm) null);
                x340Var.s0(ml1Var);
            } else {
                ml1Var = objT2;
                hluVar = hluVar3;
            }
            qxd0.t(boolValueOf, x340Var, (vu30) ml1Var);
            boolean zBooleanValue = ((Boolean) hluVar.e.getValue()).booleanValue();
            if (((Boolean) this.i.a.getValue()).booleanValue()) {
                x340Var.i0(-575115019);
                boolean zI = x340Var.i(this) | x340Var.h(zBooleanValue) | ((i2 & 112) == 32);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new vm1(this, zBooleanValue, upb0Var, (byte) 7);
                    x340Var.s0(objT3);
                }
                qxd0.S((Function0) objT3, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-574645090);
                x340Var.r(false);
            }
            mod.b(oi7.a.a(this.b), apo.r(1627632868, new f1t(qvm1Var, this, iu30Var, qim0Var, hluVar, upb0Var, (byte) 2), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sxj((byte) 18, i, this, qvm1Var, upb0Var, iu30Var, qim0Var);
        }
    }
}
