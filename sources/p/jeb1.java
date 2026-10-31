package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jeb1 implements pk90 {
    public final xrq a;
    public final vbs b;
    public final ay8 c;
    public final boolean d = true;
    public final yd91 e;
    public final n381 f;

    public jeb1(d0r d0rVar, String str, kmj1 kmj1Var, xrq xrqVar, jq4 jq4Var, vbs vbsVar) {
        this.a = xrqVar;
        this.b = vbsVar;
        this.c = d3p1.F(d0rVar, kmj1Var.a(str), rih1.a);
        byte b = 1;
        this.e = jq4Var.u() ? new yd91(3, new ieb1(this, (byte) 0)) : new yd91(3, new ieb1(this, b));
        this.f = p381.a;
    }

    public static eeb1 h(zuc0 zuc0Var) {
        mq70 mq70Var;
        up70 up70VarA;
        String str;
        xkk1 xkk1VarA = zuc0Var.q.a(xkk1.class);
        if (xkk1VarA == null || (mq70Var = xkk1VarA.b) == null || (up70VarA = mq70Var.a(vp70.c)) == null || (str = up70VarA.a.a) == null) {
            return null;
        }
        return new eeb1(str);
    }

    public static String i(zuc0 zuc0Var) {
        mq70 mq70Var;
        up70 up70VarA;
        xkk1 xkk1VarA = zuc0Var.q.a(xkk1.class);
        String str = (xkk1VarA == null || (mq70Var = xkk1VarA.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null) ? null : up70VarA.a.a;
        if (str != null) {
            return str;
        }
        Set set = s4b1.f;
        return uic.x(zuc0Var.c).u() ? zuc0Var.a(1) : "";
    }

    @Override // p.pk90
    public final boolean a() {
        return this.d;
    }

    @Override // p.pk90
    public final m381 c() {
        return this.f;
    }

    @Override // p.pk90
    public final yd91 d() {
        return this.e;
    }

    public final void e(String str, ecx ecxVar, b0k b0kVar, int i) {
        int i2;
        String strConcat;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(968472242);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(ecxVar) : x340Var.i(ecxVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ltx ltxVar = ltx.c;
            Uri uri = Uri.parse(str);
            as80 as80Var = mif1.P0;
            fwx fwxVarG = hso1.G(ltxVar, 0L, 0L, x340Var, ltx.d, 30);
            pux puxVar = new pux(fwxVarG, fwxVarG);
            cbx.a.getClass();
            String str2 = ecxVar == uwr.a() ? "square" : "sixteen_by_nine";
            if (str.length() == 0) {
                strConcat = "standard_row_media_" + str2 + "_placeholder_" + ltxVar;
            } else {
                strConcat = "standard_row_media_".concat(str2);
            }
            eso1.e(uri, isl.a, anm1.N(strConcat, nim0.a), (p3v) null, (zvx) null, ecxVar, as80Var, (tl3) null, (ColorFilter) null, puxVar, false, false, x340Var, ((i2 << 12) & 458752) | 1073744944, 0, 3472);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(this, str, ecxVar, i, (byte) 6);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void f(geb1 geb1Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1497038557);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(geb1Var) : x340Var.i(geb1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (geb1Var instanceof feb1) {
            x340Var.i0(159993670);
            String str = ((feb1) geb1Var).a;
            cbx.a.getClass();
            e(str, uwr.a(), x340Var, (i2 << 3) & 896);
            x340Var.r(false);
        } else {
            if (!(geb1Var instanceof eeb1)) {
                throw p3d1.k(x340Var, 159992423, false);
            }
            x340Var.i0(159997191);
            String str2 = ((eeb1) geb1Var).a;
            cbx.a.getClass();
            e(str2, uwr.d(), x340Var, (i2 << 3) & 896);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(this, geb1Var, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00f5  */
    public final void g(hwq hwqVar, b0k b0kVar, int i) {
        int i2;
        cmj1 cmj1Var;
        Object feb1Var;
        Object obj;
        Object objT;
        List list;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1363443864);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(hwqVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object value = rwq.h(this.c, x340Var, 0).getValue();
            eeb1 eeb1Var = null;
            i1r i1rVar = value instanceof i1r ? (i1r) value : null;
            if (i1rVar == null || (cmj1Var = (cmj1) i1rVar.a) == null) {
                cmj1Var = cmj1.a;
            }
            l7e0 l7e0Var = hwqVar.g;
            if (l7e0Var instanceof j7e0) {
                zuc0 zuc0Var = ((j7e0) l7e0Var).a;
                if (zuc0Var.m) {
                    feb1Var = new feb1("");
                } else if (cmj1Var == cmj1.c) {
                    feb1Var = h(zuc0Var);
                    if (feb1Var == null) {
                        feb1Var = new eeb1(i(zuc0Var));
                    }
                } else if (cmj1Var == cmj1.b) {
                    feb1Var = h(zuc0Var);
                    if (feb1Var == null) {
                        hll hllVarA = zuc0Var.q.a(hll.class);
                        if (hllVarA != null && (list = hllVarA.d) != null && list.contains(fll.c)) {
                            eeb1Var = new eeb1(i(zuc0Var));
                        }
                        if (eeb1Var != null) {
                            obj = eeb1Var;
                        } else {
                            feb1Var = new feb1(i(zuc0Var));
                        }
                    }
                    rdb1 rdb1Var = rdb1.U0;
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = rdb1.T0;
                        x340Var.s0(objT);
                    }
                    hm5.a(obj, (qim0) null, rdb1Var, (tl3) null, "artwork", (iu30) objT, apo.r(765662391, new cq61(this, (byte) 29), x340Var), x340Var, 1794432, 10);
                } else if (!this.b.g || !rqt0.D(zuc0Var) || (feb1Var = h(zuc0Var)) == null) {
                    feb1Var = new feb1(i(zuc0Var));
                }
            } else {
                feb1Var = new feb1("");
            }
            obj = feb1Var;
            rdb1 rdb1Var2 = rdb1.U0;
            objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = rdb1.T0;
                x340Var.s0(objT);
            }
            hm5.a(obj, (qim0) null, rdb1Var2, (tl3) null, "artwork", (iu30) objT, apo.r(765662391, new cq61(this, (byte) 29), x340Var), x340Var, 1794432, 10);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(this, hwqVar, i, (byte) 1);
        }
    }
}
