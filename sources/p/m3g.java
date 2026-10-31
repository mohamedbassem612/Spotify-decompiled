package p;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m3g implements hsw {
    public final bct a;
    public final x010 b;
    public final mr20 c;
    public final yd91 d;

    public m3g(bct bctVar, d2f1 d2f1Var, Context context) {
        kp5 kp5Var = bctVar.c;
        this.a = bctVar;
        boolean z = false;
        boolean z2 = context.getResources().getConfiguration().orientation == 1;
        if (d2f1Var.g && z2) {
            z = true;
        }
        huz huzVar = new huz(Boolean.valueOf(z), (byte) 10);
        xe01 xe01Var = (xe01) kp5Var.g;
        this.b = new x010(huzVar, xe01Var == null ? new huz(Boolean.FALSE, (byte) 10) : xe01Var, new ce2(3, (lnm) null, (byte) 10), (byte) 1);
        te1 te1Var = new te1(d3p1.F(bctVar.b, lvx.m(), rih1.a), (byte) 16);
        mr20 mr20Var = (mr20) kp5Var.d;
        this.c = rqt0.u(new x010(te1Var, mr20Var == null ? new huz(Boolean.FALSE, (byte) 10) : mr20Var, new ce2(3, (lnm) null, (byte) 11), (byte) 1));
        this.d = new yd91(3, new lwe(this, (byte) 12));
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.d;
    }

    public final void e(cxc0 cxc0Var, b0k b0kVar, int i) {
        int i2;
        m3g m3gVar;
        cxc0 cxc0Var2;
        r3g r3gVar;
        rxe1 rxe1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(409930114);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(cxc0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            bct bctVar = this.a;
            ven0 ven0VarH = rwq.h((xe01) bctVar.c.h, x340Var, 0);
            if (((List) ven0VarH.getValue()).isEmpty()) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new j3g(this, cxc0Var, i, (byte) 0);
                    return;
                }
                return;
            }
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new LinkedHashMap();
                x340Var.s0(objT);
            }
            Map map = (Map) objT;
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            f(xtb0VarA, ((x2g) o7h.q0((List) ven0VarH.getValue())).a, x340Var, (i2 << 3) & 896);
            ymc0 ymc0Var = (ymc0) rwq.h(bctVar.a, x340Var, 0).getValue();
            if (ymc0Var == null || (rxe1Var = ymc0Var.b) == null) {
                r3gVar = null;
            } else {
                kiv kivVar = t3g.a;
                r3gVar = new r3g(z4p1.e(rxe1Var.a), z4p1.e(rxe1Var.b));
            }
            m3gVar = this;
            cxc0Var2 = cxc0Var;
            t3g.b(r3gVar, apo.r(247171273, new m(xtb0VarA, ven0VarH, m3gVar, cxc0Var2, map, (byte) 26), x340Var), x340Var, 48);
        } else {
            m3gVar = this;
            cxc0Var2 = cxc0Var;
            x340Var.b0();
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new j3g(m3gVar, cxc0Var2, i, (byte) 1);
        }
    }

    public final void f(xtb0 xtb0Var, int i, b0k b0kVar, int i2) {
        int i3;
        m3g m3gVar;
        xtb0 xtb0Var2;
        int i4;
        int i5;
        Object obj;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2139657224);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(xtb0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                obj = objT;
                int[] iArr = {i};
                x340Var.s0(iArr);
                obj = iArr;
            }
            obj = objT;
            int[] iArr2 = (int[]) obj;
            if (iArr2[0] == i) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new k3g(this, xtb0Var, i, i2, (byte) 0);
                    return;
                }
                return;
            }
            m3gVar = this;
            xtb0Var2 = xtb0Var;
            i4 = i;
            i5 = i2;
            iArr2[0] = i4;
            if (((err0) xtb0Var2.e.b).s() == 0 && ((err0) xtb0Var2.e.c).s() == 0) {
                xtb0Var2.j(0, 0);
            }
        } else {
            m3gVar = this;
            xtb0Var2 = xtb0Var;
            i4 = i;
            i5 = i2;
            x340Var.b0();
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new k3g(m3gVar, xtb0Var2, i4, i5, (byte) 1);
        }
    }

    @Override // p.hsw
    public final mr20 g() {
        return this.b;
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        return this.c;
    }

    @Override // p.tf51
    public final mf51 getType() {
        return mf51.b;
    }
}
