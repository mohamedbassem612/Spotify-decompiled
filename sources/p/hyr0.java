package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class hyr0 {
    public static final uvx a = new uvx(1, (pgx) null, 3, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 498);

    public static final void a(xxr0 xxr0Var, b0k b0kVar, int i) {
        hux huxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-428044569);
        int i2 = (x340Var.g(xxr0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String str = xxr0Var.f;
            int i3 = xxr0Var.b;
            Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
            uri.getClass();
            int iC = l1d.C(i3);
            if (iC == 0) {
                huxVar = ltx.c;
            } else if (iC == 1) {
                huxVar = nkx.c;
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                huxVar = pkx.c;
            }
            nux nuxVar = new nux(huxVar, huxVar);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            eso1.e(uri, isl.a, pqo.h(i1p1.q(u291.r(nim0.a, 48.0f), g(x340Var, i3)), h(xxr0Var)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var, 1073741872, 0, 3576);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fyr0(xxr0Var, i, (byte) 0);
        }
    }

    public static final void b(xxr0 xxr0Var, j2i j2iVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        gbx gbxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2087797461);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(xxr0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            String str = xxr0Var.n;
            hax haxVar = (str == null || xxr0Var.m) ? jax.a : new hax(str);
            if (xxr0Var.j) {
                b0kVar3.i0(-2141737752);
                String strO0 = cwl1.o0(b0kVar3, 2131959647);
                boolean z = (i2 & 896) == 256;
                Object objT = b0kVar3.T();
                if (z || objT == fkj0.X) {
                    objT = new dgq0(iu30Var, (byte) 29);
                    b0kVar3.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    gbxVar = new gbx(new y50(strO0), function0);
                    b0kVar3.r(false);
                }
            } else {
                b0kVar3.i0(-2141603864);
                b0kVar3.r(false);
                gbxVar = null;
            }
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("parental_hub_entity_row", nim0.a), a, haxVar, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, (xu30) null, apo.r(-1957699458, new gyr0(xxr0Var, (byte) 0), b0kVar3), (xu30) null, apo.r(-1237555555, new gyr0(xxr0Var, (byte) 1), b0kVar3), apo.r(-1911622340, new ukm0(j2iVar, xxr0Var, (byte) 18), b0kVar3), (xu30) null, (xu30) null, apo.r(361144601, new gyr0(xxr0Var, (byte) 2), b0kVar3), b0kVar2, 805306432, 197040, 26040);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(xxr0Var, j2iVar, iu30Var, i, (byte) 15);
        }
    }

    public static final void c(xxr0 xxr0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1174561037);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(xxr0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            String str = xxr0Var.n;
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("parental_hub_entity_row_loading", nim0.a), a, (str == null || xxr0Var.m) ? jax.a : new hax(str), false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, apo.r(802951876, new gyr0(xxr0Var, (byte) 3), b0kVar3), (xu30) null, h6j.a, (xu30) null, (xu30) null, (xu30) null, h6j.b, b0kVar2, 805306432, 196656, 30200);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(xxr0Var, i, (byte) 17);
        }
    }

    public static final void d(float f, int i, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1584869716);
        int i2 = (x340Var.d(f) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarV = u291.v(nim0.a, f);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarH = u291.h(qim0VarV, 12.0f);
            cr31 cr31Var = er31.a;
            t1c.a(cwl1.l0(dug.f(i1p1.q(qim0VarH, cr31Var), cbx.a(x340Var).a.b.a(), d4o1.a), 0L, cr31Var, 13), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n5h((byte) 9, f, i);
        }
    }

    public static final void e(xxr0 xxr0Var, b0k b0kVar, int i) {
        byte b;
        boolean z;
        b0k b0kVar2;
        String strN0;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1584173607);
        int i2 = (b0kVar3.g(xxr0Var) ? 4 : 2) | i;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            fra fraVar = een.N0;
            boolean zH = h(xxr0Var);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = pqo.h(nim0Var, zH);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarH);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            if (xxr0Var.g) {
                b0kVar3.i0(163473584);
                kqn1.d(2, 6, 2, b0kVar3, (qim0) null);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                ab80.p(nim0Var, 4.0f, b0kVar3, false);
            } else {
                b0kVar3.i0(163611007);
                b0kVar3.r(false);
            }
            if (xxr0Var.h) {
                b0kVar3.i0(163644828);
                xtx xtxVar = xtx.c;
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar3).g;
                b0kVar2 = b0kVar3;
                z = false;
                w0h1.a(xtxVar, isl.a, u291.r(nim0Var, 12.0f), 0L, 0L, false, b0kVar2, xtx.d | 48, 56);
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                ab80.p(nim0Var, 4.0f, b0kVar2, false);
            } else {
                z = false;
                b0kVar2 = b0kVar3;
                b0kVar2.i0(163924479);
                b0kVar2.r(false);
            }
            int i3 = xxr0Var.l;
            String str = xxr0Var.d;
            if (i3 == 3) {
                b0kVar2.i0(-457377554);
                b0kVar2.r(z);
                strN0 = "";
            } else {
                int i4 = xxr0Var.b;
                if (i4 == 2) {
                    strN0 = x0d.k(b0kVar2, 677983943, 2131959640, b0kVar2, z);
                } else if (i4 == 3) {
                    b0kVar2.i0(677987399);
                    if (ihc1.y0(str)) {
                        strN0 = x0d.k(b0kVar2, 677988170, 2131959641, b0kVar2, z);
                    } else {
                        b0kVar2.i0(677990437);
                        strN0 = cwl1.n0(2131959642, new Object[]{str}, b0kVar2);
                        b0kVar2.r(z);
                    }
                    b0kVar2.r(z);
                } else if (ihc1.y0(str)) {
                    strN0 = x0d.k(b0kVar2, 677994117, 2131959653, b0kVar2, z);
                } else {
                    b0kVar2.i0(677996256);
                    strN0 = cwl1.n0(2131959654, new Object[]{str}, b0kVar2);
                    b0kVar2.r(z);
                }
            }
            uwr uwrVar3 = cbx.a;
            b0kVar3 = b0kVar2;
            b = 1;
            uwo1.e(strN0, (qim0) null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar3, 0, 0, 1714);
            b0kVar3.r(true);
        } else {
            b = 1;
            b0kVar3.b0();
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new fyr0(xxr0Var, i, b);
        }
    }

    public static final void f(xxr0 xxr0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        int i2;
        long j;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1325866293);
        int i3 = (b0kVar3.g(xxr0Var) ? 4 : 2) | i;
        if (b0kVar3.Y(i3 & 1, (i3 & 3) != 2)) {
            fra fraVar = een.N0;
            boolean zH = h(xxr0Var);
            int i4 = xxr0Var.o;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = pqo.h(nim0Var, zH);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarH);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            if (i4 != 3) {
                b0kVar3.i0(-1908883824);
                b0kVar2 = b0kVar3;
                i2 = 3;
                wkt0.a(i4 == 1 ? zkt0.a : zkt0.b, u291.r(nim0Var, 16.0f), (ksl) null, 0L, false, b0kVar2, 0, 28);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar2).b;
                ab80.p(nim0Var, 4.0f, b0kVar2, false);
            } else {
                b0kVar2 = b0kVar3;
                i2 = 3;
                b0kVar2.i0(-1908604173);
                b0kVar2.r(false);
            }
            String str = xxr0Var.c;
            uwr uwrVar2 = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar2).g;
            if (i4 != i2) {
                b0kVar2.i0(-477204357);
                j = cbx.a(b0kVar2).b.c;
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-477202861);
                j = cbx.a(b0kVar2).b.a;
                b0kVar2.r(false);
            }
            b0kVar3 = b0kVar2;
            uwo1.e(str, (qim0) null, lee1Var, j, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar3, 0, 0, 1714);
            b0kVar3.r(true);
        } else {
            b0kVar3.b0();
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new fyr0(xxr0Var, i, (byte) 2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final cr31 g(b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i);
        if (iC != 0) {
            if (iC == 1) {
                x340 x340Var = (x340) b0kVar;
                x340Var.i0(1220147936);
                x340Var.r(false);
                return er31.a;
            }
            if (iC != 2) {
                throw p3d1.k((x340) b0kVar, 1220143414, false);
            }
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(1220145357);
        uwr uwrVar = cbx.a;
        cua cuaVar = cbx.b(x340Var2).f;
        cr31 cr31VarB = er31.b(4.0f);
        x340Var2.r(false);
        return cr31VarB;
    }

    public static final boolean h(xxr0 xxr0Var) {
        return xxr0Var.k && xxr0Var.n == null && !xxr0Var.m;
    }
}
