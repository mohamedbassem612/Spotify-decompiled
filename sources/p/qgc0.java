package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class qgc0 {
    public static final float a = (48.0f + 15.0f) / 2.0f;

    public static final void a(ygc0 ygc0Var, p3v p3vVar, b0k b0kVar, int i) {
        int i2;
        Float fValueOf;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(193805721);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ygc0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(p3vVar) ? 32 : 16;
        }
        int i3 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            int iT = jfv.t(cbx.c(x340Var).b.a, ngv.MILLISECONDS);
            if (p3vVar == null) {
                x340Var.i0(1230774605);
                x340Var.r(false);
                fValueOf = null;
            } else {
                x340Var.i0(1230774606);
                float f = p3vVar.a;
                float fD = d(x340Var);
                x340Var.r(false);
                fValueOf = Float.valueOf((fD * iT) / f);
            }
            int iFloatValue = fValueOf != null ? (int) fValueOf.floatValue() : 0;
            ceo ceoVar = ((jhx) cbx.c(x340Var).a.b).a;
            pxg1 pxg1VarN0 = irn1.n0(iT, iFloatValue, ceoVar);
            tzg1 tzg1Var = xay.a;
            bby bbyVar = new bby(new oig1(new qg10(0.0f, pxg1VarN0), (eb91) null, (cfe) null, (eg41) null, (LinkedHashMap) null, 126));
            ln00 ln00Var = ln00.b;
            fza.d();
            p9m p9mVarP = hm5.P(bbyVar, ln00.b);
            p9m p9mVarP2 = hm5.P(xay.e(2, irn1.n0(iT, 0, ceoVar)), xay.f(2, irn1.n0(iT, 0, ceoVar)));
            boolean zI = x340Var.i(ceoVar) | x340Var.e(iT) | x340Var.e(iFloatValue);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new hl9(iT, iFloatValue, ceoVar);
                x340Var.s0(objT);
            }
            g23 g23Var = new g23(p9mVarP, p9mVarP2, hm5.h(1, (vu30) objT), (byte) 18);
            boolean zI2 = x340Var.i(g23Var);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new pdb0(g23Var, (byte) 19);
                x340Var.s0(objT2);
            }
            hm5.a(ygc0Var, nim0Var, (iu30) objT2, een.e, "LimitedExperienceIndicator", (iu30) null, mvi.b, x340Var, (i2 & 14) | 1597440 | ((i2 >> 3) & 112), 32);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(ygc0Var, p3vVar, i);
        }
    }

    public static final void b(ygc0 ygc0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(283635566);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ygc0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            j2i j2iVar = mvi.a;
            m4c m4cVar = fkj0.X;
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = xto.t((Object) null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            if (ven0Var.getValue() == null) {
                x340Var.i0(-21520025);
                boolean zI = x340Var.i(ven0Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new b720(ven0Var, j2iVar, (byte) 1);
                    x340Var.s0(objT2);
                }
                ejo1.l(0, 1, x340Var, (vu30) objT2, (qim0) null);
                x340Var.r(false);
            } else {
                x340Var.i0(-21333591);
                x340Var.r(false);
            }
            a(ygc0Var, (p3v) ven0Var.getValue(), x340Var, ((i3 << 3) & 896) | (i3 & 14));
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(ygc0Var, qim0Var, i, (byte) 15);
        }
    }

    public static final void c(int i, int i2, int i3, String str, b0k b0kVar, qim0 qim0Var) {
        int i4;
        int i5;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1317647734);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i5 = i4 | 384;
        } else {
            i5 = i4 | (x340Var.i(qim0Var) ? 256 : 128);
        }
        if (x340Var.Y(i5 & 1, (i5 & 147) != 146)) {
            qim0 qim0Var3 = i6 != 0 ? nim0.a : qim0Var;
            if (str != null) {
                x340Var.i0(1957640186);
                gfx.b(i, apo.r(1747219002, new uo50(qim0Var3, str, (byte) 4), x340Var), x340Var, 54);
                x340Var.r(false);
            } else {
                x340Var.i0(1959483384);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pgc0(str, i, qim0Var2, i2, i3);
        }
    }

    public static final float d(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1166968642);
        wat watVar = (wat) x340Var.k(t4k.h);
        float fM0 = watVar.M0(lmt0.s(x340Var).d(watVar));
        x340Var.r(false);
        return fM0;
    }
}
