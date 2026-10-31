package p;

import android.text.Html;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ec8 extends mc7 {
    public final /* synthetic */ byte d;
    public final ufs e;
    public final byte f;
    public final hux g;

    public ec8(ufs ufsVar, byte b) {
        this.d = b;
        switch (b) {
            case 1:
                this.e = ufsVar;
                this.g = mrx.c;
                this.f = (byte) 2;
                break;
            default:
                this.e = ufsVar;
                this.g = pkx.c;
                this.f = (byte) 2;
                break;
        }
    }

    @Override // p.mc7
    public final vu30 e(lc7 lc7Var, b0k b0kVar) {
        switch (this.d) {
            case 0:
                x340 x340Var = (x340) b0kVar;
                x340Var.i0(-977581438);
                j2i j2iVarR = apo.r(-511237947, new pp5(lc7Var, this, (byte) 27), x340Var);
                x340Var.r(false);
                return j2iVarR;
            default:
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.i0(746373194);
                j2i j2iVarR2 = apo.r(1759260685, new cc8(lc7Var, (byte) 1), x340Var2);
                x340Var2.r(false);
                return j2iVarR2;
        }
    }

    @Override // p.mc7
    public final Object f(kc7 kc7Var) {
        switch (this.d) {
            case 0:
                d dVar = (d) kc7Var.b;
                String strY0 = o7h.y0(dVar.P0, (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
                String string = Html.fromHtml(dVar.Y, 0).toString();
                String str = !ihc1.y0(string) ? string : null;
                String strP = aqo1.p(this.e, dVar.b, dVar.O0, dVar.Q0, false);
                String str2 = dVar.i;
                String str3 = !ihc1.y0(str2) ? str2 : null;
                float f = dVar.t;
                return new ub8(strY0, str, strP, str3, f > 0.0f ? Float.valueOf(f) : null);
            default:
                e eVar = kc7Var.b;
                String str4 = eVar.i;
                String str5 = eVar.t;
                return new gaz(str4, ihc1.y0(str5) ? null : str5, aqo1.p(this.e, eVar.i, eVar.X, eVar.Y, true));
        }
    }

    @Override // p.mc7
    public final hux g() {
        switch (this.d) {
            case 0:
                break;
        }
        return this.g;
    }

    @Override // p.mc7
    public final int h() {
        switch (this.d) {
            case 0:
                break;
        }
        return this.f;
    }

    @Override // p.mc7
    public final j2i m(lc7 lc7Var, b0k b0kVar) {
        switch (this.d) {
            case 0:
                x340 x340Var = (x340) b0kVar;
                x340Var.i0(55363788);
                j2i j2iVarR = apo.r(216909199, new cc8(lc7Var, (byte) 0), x340Var);
                x340Var.r(false);
                return j2iVarR;
            default:
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.i0(2135749524);
                j2i j2iVarR2 = apo.r(-1692874281, new cc8(lc7Var, (byte) 2), x340Var2);
                x340Var2.r(false);
                return j2iVarR2;
        }
    }

    public void o(Float f, String str, String str2, b0k b0kVar, int i) {
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1841713781);
        int i2 = i | (b0kVar3.g(f) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.g(str2) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            wat watVar = (wat) b0kVar3.k(t4k.h);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            cvx cvxVar = cbx.b(b0kVar3).b;
            int i3 = i2 & 14;
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32) | (i3 == 4);
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                ye5 ye5Var = new ye5();
                if (f != null) {
                    z6p1.s(ye5Var, "rating_icon");
                    ye5Var.g(String.format("%.1f", Arrays.copyOf(new Object[]{f}, 1)));
                    if (str != null || str2 != null) {
                        ye5Var.g(" • ");
                    }
                }
                if (str != null) {
                    ye5Var.g(str);
                    if (str2 != null) {
                        ye5Var.g(" • ");
                    }
                }
                if (str2 != null) {
                    ye5Var.g(str2);
                }
                objT = ye5Var.p();
                b0kVar3.s0(objT);
            }
            af5 af5Var = (af5) objT;
            boolean z2 = i3 == 4;
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = f != null ? mqo1.t(new mmr0[]{new mmr0("rating_icon", new gh80(new d6t0(7, watVar.s(16.0f), watVar.s(12.0f)), new j2i(-1133149832, new ac8(3, (byte) 0), true)))}) : dqs0.e;
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            uwo1.f(af5Var, u291.f(nim0.a, 1.0f), cbx.d(b0kVar3).j, (x9h) null, (a0e1) null, (iu30) null, 5, false, new cjc0(1), 0, (qx8) null, (cqs0) objT2, b0kVar2, 0, 0, 1720);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wb6(i, this, f, str, str2, (byte) 16);
        }
    }
}
