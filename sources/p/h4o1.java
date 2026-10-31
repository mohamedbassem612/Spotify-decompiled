package p;

import android.content.res.Resources;
import android.net.Uri;
import com.spotify.player.model.ContextTrack;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class h4o1 {
    public static final jc10 a = new jc10(new cp21(""));
    public static b180 b;

    public static final void a(String str, long j, Function0 function0, qim0 qim0Var, float f, boolean z, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-732139574);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.g(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.d(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var2.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var2.i(j2iVar) ? 1048576 : 524288;
        }
        if (x340Var2.Y(i2 & 1, (599187 & i2) != 599186)) {
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = us71.i(f > 0.0f ? f : 0.5625f, x340Var2);
            }
            drr0 drr0Var = (drr0) objT;
            qqb qqbVarD = k1u.d(1.0f, j);
            qim0 qim0VarQ = i1p1.q(d1u.F(qim0Var, qqbVarD.a, qqbVarD.b, er31.b(16.0f)), er31.b(16.0f));
            if (drr0Var.s() > 0.0f) {
                float f2 = 192.0f;
                if (z && drr0Var.s() >= 1.0f) {
                    f2 = 220.0f;
                }
                qim0VarQ = qim0VarQ.then(u291.j(f2 / drr0Var.s(), 0.0f, 2, u291.v(nim0.a, f2)));
            }
            qim0 qim0Var2 = qim0VarQ;
            Uri uri = Uri.parse(str);
            uwr uwrVar = cbx.a;
            i9h i9hVar = new i9h(cbx.a(x340Var2).c.b);
            i9h i9hVar2 = new i9h(u7h.j);
            boolean z2 = (57344 & i2) == 16384;
            Object objT2 = x340Var2.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new ef6(f, (Object) drr0Var, (byte) 2);
                x340Var2.s0(objT2);
            }
            iu30 iu30Var = (iu30) objT2;
            boolean z3 = (i2 & 896) == 256;
            Object objT3 = x340Var2.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new vj0(function0, (byte) 12);
                x340Var2.s0(objT3);
            }
            int i3 = i2;
            ni7 ni7VarA = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, i9hVar2, i9hVar, false, false, (j6m) null, iu30Var, (iu30) objT3, (iu30) null, 0L, x340Var2, 2359296, 0, 118686);
            x340Var = x340Var2;
            qim0 qim0VarX = uyn1.x(xyn1.s(qim0Var2, ni7VarA, null, null, 0.0f, null, 62), 8.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            ywx0.l(((i3 >> 15) & 112) | 6, j2iVar, h2c.a, x340Var, true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qtd(str, j, function0, qim0Var, f, z, j2iVar, i, (byte) 0);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(ke00 ke00Var, d0r d0rVar, fod0 fod0Var, k7p k7pVar, q7p q7pVar, cfp cfpVar, afp afpVar, u9u0 u9u0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-6841276);
        int i2 = i | (x340Var.g(ke00Var) ? 4 : 2) | (x340Var.i(d0rVar) ? 32 : 16) | (x340Var.i(fod0Var) ? 256 : 128) | (x340Var.i(k7pVar) ? 2048 : 1024) | (x340Var.i(q7pVar) ? 16384 : 8192) | (x340Var.i(cfpVar) ? 131072 : 65536) | (x340Var.i(afpVar) ? 1048576 : 524288) | (x340Var.i(u9u0Var) ? 8388608 : 4194304);
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = k7pVar.a(d0rVar);
                x340Var.s0(objT);
            }
            wek wekVar = (wek) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = q7pVar.a(d0rVar);
                x340Var.s0(objT2);
            }
            ovi1 ovi1Var = (ovi1) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = cfpVar.a(d0rVar, fod0Var);
                x340Var.s0(objT3);
            }
            yqm0 yqm0Var = (yqm0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                afpVar.getClass();
                lzn0 lzn0VarC = ((vh00) ((h72) afpVar.a.c).b).c();
                c8o.l(lzn0VarC);
                objT4 = new l63(lzn0VarC, u9u0Var, d0rVar);
                x340Var.s0(objT4);
            }
            l63 l63Var = (l63) objT4;
            if (ke00Var instanceof he00) {
                x340Var.i0(-1944084737);
                tek tekVar = new tek(((he00) ke00Var).a, 0, 62, false);
                j2i j2iVar = eni.a;
                j2i j2iVar2 = eni.b;
                j2i j2iVar3 = eni.c;
                xgc xgcVar = wek.Z;
                i1o1.e(wekVar, tekVar, d0rVar, null, null, j2iVar, j2iVar2, 0, j2iVar3, x340Var, 102432776 | ((i2 << 3) & 896), 76);
                x340Var.r(false);
            } else if (ke00Var instanceof je00) {
                x340Var.i0(-1943680001);
                i1o1.e(ovi1Var, new kvi1(((je00) ke00Var).a), d0rVar, null, null, eni.d, eni.e, 0, eni.f, x340Var, 102432776 | ((i2 << 3) & 896), 76);
                x340Var.r(false);
            } else if (ke00Var instanceof ie00) {
                x340Var.i0(-1943269902);
                i1o1.e(yqm0Var, new tqm0(z6x.a), d0rVar, null, null, eni.g, eni.h, 0, eni.i, x340Var, 102432776 | ((i2 << 3) & 896), 76);
                x340Var.r(false);
            } else {
                if (!(ke00Var instanceof ge00)) {
                    throw p3d1.k(x340Var, 2015496684, false);
                }
                x340Var.i0(-1942852487);
                h63 h63Var = new h63(1, (Integer) null, (Integer) null, ((ge00) ke00Var).a, (String) null);
                j2i j2iVar4 = eni.j;
                j2i j2iVar5 = eni.k;
                j2i j2iVar6 = eni.l;
                o3r o3rVar = l63.h;
                i1o1.e(l63Var, h63Var, d0rVar, null, null, j2iVar4, j2iVar5, 0, j2iVar6, x340Var, 102432776 | ((i2 << 3) & 896), 76);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n(ke00Var, d0rVar, fod0Var, k7pVar, q7pVar, cfpVar, afpVar, u9u0Var, i, (byte) 9);
        }
    }

    public static final void c(qim0 qim0Var, es41 es41Var, g36 g36Var, nl3 nl3Var, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        es41 es41Var2;
        g36 g36Var2;
        nl3 nl3Var2;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1535596611);
        int i2 = i | (x340Var.i(qim0Var) ? 4 : 2) | 222352 | (x340Var.i(iu30Var) ? 1048576 : 524288);
        boolean z3 = true;
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                es41Var = l6o1.C(0, 0, 1, x340Var);
                nl3Var = een.P0;
                g36Var = h36.c;
            } else {
                x340Var.b0();
                z3 = z;
            }
            es41Var2 = es41Var;
            g36 g36Var3 = g36Var;
            nl3 nl3Var3 = nl3Var;
            x340Var.s();
            ago1.b(q6x.b, apo.r(1185486684, new mrw(qim0Var, es41Var2, z3, g36Var3, nl3Var3, iu30Var), x340Var), x340Var, 48);
            z2 = z3;
            g36Var2 = g36Var3;
            nl3Var2 = nl3Var3;
        } else {
            x340Var.b0();
            es41Var2 = es41Var;
            g36Var2 = g36Var;
            nl3Var2 = nl3Var;
            z2 = z;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mrw(qim0Var, es41Var2, g36Var2, nl3Var2, z2, iu30Var, i);
        }
    }

    public static final void d(le00 le00Var, d0r d0rVar, k7p k7pVar, q7p q7pVar, cfp cfpVar, afp afpVar, fod0 fod0Var, u9u0 u9u0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-857414335);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(le00Var) : b0kVar3.i(le00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(d0rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(k7pVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(q7pVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(cfpVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(afpVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.i(fod0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= b0kVar3.i(u9u0Var) ? 8388608 : 4194304;
        }
        int i3 = i2 | 100663296;
        if (b0kVar3.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            xtb0 xtb0VarA = aub0.a(0, b0kVar3, 3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = j9k1.x(u291.f(qim0Var3, 1.0f), new ac8(3, (byte) 8));
            int i4 = i3 & 14;
            boolean z = i4 == 4 || ((i3 & 8) != 0 && b0kVar3.i(le00Var));
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new nty(le00Var, (byte) 27);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarN = anm1.N("carousel_row", s161.b(qim0VarX, false, (iu30) objT));
            zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
            boolean z2 = true;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            if (i4 != 4 && ((i3 & 8) == 0 || !b0kVar3.i(le00Var))) {
                z2 = false;
            }
            boolean zI = b0kVar3.i(d0rVar) | z2 | b0kVar3.i(fod0Var) | b0kVar3.i(k7pVar) | b0kVar3.i(q7pVar) | b0kVar3.i(cfpVar) | b0kVar3.i(afpVar) | b0kVar3.i(u9u0Var);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                qi1 qi1Var = new qi1(le00Var, d0rVar, fod0Var, k7pVar, q7pVar, cfpVar, afpVar, u9u0Var, (byte) 5);
                b0kVar3.s0(qi1Var);
                objT2 = qi1Var;
            }
            b0kVar2 = b0kVar3;
            s3o1.e(qim0VarN, xtb0VarA, zzq0VarH, d36Var, null, null, null, (iu30) objT2, b0kVar2, 0, 232);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ne00(le00Var, d0rVar, k7pVar, q7pVar, cfpVar, afpVar, fod0Var, u9u0Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void e(float f, int i, b0k b0kVar, qim0 qim0Var) {
        float f2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-649179294);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i | 432;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            zsc zscVar = zex.a;
            f2 = 1.0f;
            t1c.a(dug.e(qim0Var, new mic0(0, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), p7h.M(new u7h[]{new u7h(u7h.b(((yex) zscVar.d).a, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(((yex) zscVar.d).a, 1.0f, 0.0f, 0.0f, 0.0f, 14))}), (List) null), null, 0.0f, 6), x340Var, 0);
        } else {
            x340Var.b0();
            f2 = f;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ou(qim0Var, f2, i, (byte) 4);
        }
    }

    public static final void f(int i, boolean z, Function0 function0, Function0 function1, b0k b0kVar, int i2) {
        Function0 function2;
        int i3;
        int i4;
        int i5;
        x340 x340Var = (x340) b0kVar;
        int i6 = (kk0.t(1736727136, i, x340Var) ? 4 : 2) | i2 | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024);
        if (x340Var.Y(i6 & 1, (i6 & 1171) != 1170)) {
            boolean z2 = i == 1;
            boolean z3 = i == 2;
            boolean z4 = z2 && z;
            if (z4) {
                i3 = 2131957276;
            } else if (z2) {
                i3 = 2131957273;
            } else {
                i3 = z3 ? 2131957280 : 2131957283;
            }
            String strO0 = cwl1.o0(x340Var, i3);
            if (z4) {
                i4 = 2131957275;
            } else if (z2) {
                i4 = 2131957272;
            } else {
                i4 = z3 ? 2131957279 : 2131957282;
            }
            String strO1 = cwl1.o0(x340Var, i4);
            String strO2 = cwl1.o0(x340Var, 2131957277);
            z50 z50Var = z50.c;
            zgx zgxVar = new zgx(strO2, new gbx(z50Var, function0));
            if (z4) {
                i5 = 2131957274;
            } else if (z2) {
                i5 = 2131957271;
            } else {
                i5 = z3 ? 2131957278 : 2131957281;
            }
            function2 = function0;
            mqo1.d(function2, null, null, strO0, strO1, zgxVar, new zgx(cwl1.o0(x340Var, i5), new gbx(z50Var, function1)), x340Var, ((i6 >> 6) & 14) | 2359296, 6);
        } else {
            function2 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bub(i, z, function2, function1, i2);
        }
    }

    public static final void g(String str, r8x r8xVar, b0k b0kVar, int i) {
        r8x r8xVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1635323662);
        int i2 = (x340Var.g(str) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            r8xVar2 = r8xVar;
            otw.c(r8xVar2, new l8x(2, cwl1.n0(2131951887, new Object[]{str}, x340Var), cwl1.o0(x340Var, 2131951886)), (qim0) null, (ipb1) null, x340Var, 6, 12);
        } else {
            r8xVar2 = r8xVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new loi0(str, r8xVar2, i, (byte) 27);
        }
    }

    public static final void h(xfx xfxVar, hi10 hi10Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        iu30 iu30Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1130615078);
        int i2 = i | (x340Var.i(xfxVar) ? 4 : 2) | (x340Var.i(hi10Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = q4r0.Q0;
                x340Var.s0(objT);
            }
            iu30 iu30Var3 = (iu30) objT;
            boolean zI = x340Var.i(xfxVar);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new umr0(xfxVar, iu30Var3, (byte) 3);
                x340Var.s0(objT2);
            }
            iu30 iu30Var4 = (iu30) objT2;
            boolean zI2 = x340Var.i(hi10Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new wvq0(hi10Var, (byte) 13);
                x340Var.s0(objT3);
            }
            dm5.a(iu30Var4, qim0Var, (iu30) objT3, x340Var, (i2 >> 3) & 112, 0);
            iu30Var2 = iu30Var3;
        } else {
            x340Var.b0();
            iu30Var2 = iu30Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(xfxVar, hi10Var, qim0Var, iu30Var2, i, (byte) 9);
        }
    }

    public static final void i(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1727759794);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarB = uyn1.B(u291.h(u291.v(nim0.a, 150.0f), 150.0f), 0.0f, 0.0f, 0.0f, 20.0f, 7);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarB, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new htu(i, (byte) 16);
        }
    }

    public static final void j(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1313447729);
        j06 j06Var = x340Var.a;
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.a.c();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 8.0f);
            fra fraVar = een.N0;
            cvx cvxVar3 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(2.0f);
            zov0 zov0Var = cbx.b(x340Var).g;
            t1c.a(cwl1.l0(dug.f(u291.r(qim0Var3, 40.0f), jC, cr31VarB), jC, cr31VarB, 12), x340Var, 0);
            cua cuaVar2 = cbx.b(x340Var).f;
            cr31 cr31VarB2 = er31.b(4.0f);
            qim0 qim0VarL0 = cwl1.l0(dug.f(u291.f(qim0Var3, 0.6f), jC, cr31VarB2), jC, cr31VarB2, 12);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarL0);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            uwo1.e(" ", null, cbx.d(x340Var).j, 0L, null, null, 2, false, new cjc0(1), 0, null, x340Var, 6, 0, 1722);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var2, i, (byte) 10);
        }
    }

    public static boolean k(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(Object[] objArr, pl10 pl10Var) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (k8p1.h(objArr[i], pl10Var)) {
                if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final h8b0 m() {
        return new h8b0(2, 3, 20);
    }

    public static final int n(Resources resources) {
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier == 0) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    public static final boolean o(ContextTrack contextTrack) {
        return l4o1.W(contextTrack) || nhc1.Y(contextTrack.uri(), "spotify:local:", false);
    }

    public static final boolean p(lby lbyVar) {
        jb6 jb6Var = lbyVar.e;
        if (jb6Var instanceof jb6) {
            return jb6Var.a;
        }
        if (jb6Var instanceof fww0) {
            return ((fww0) jb6Var).a;
        }
        if (!(jb6Var instanceof i53) && !(jb6Var instanceof cu7) && !(jb6Var instanceof k48) && !(jb6Var instanceof v68) && !(jb6Var instanceof k39) && !(jb6Var instanceof ji40) && !(jb6Var instanceof tfu0) && !(jb6Var instanceof yf51) && !(jb6Var instanceof jjf1) && !(jb6Var instanceof i6k) && !(jb6Var instanceof xui1) && !(jb6Var instanceof yma0) && !(jb6Var instanceof o2v0) && !u890.j(jb6Var, tm8.a)) {
            eg.o();
        }
        return false;
    }

    public static final poy0 q(iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, o8n o8nVar, iu30 iu30Var3) {
        qtr qtrVar = new qtr();
        iu30Var3.invoke(qtrVar);
        return new poy0(iu30Var, iu30Var2, vu30Var, qtrVar, true, o8nVar);
    }

    public static String r(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strP;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strP = "null";
            } else {
                try {
                    strP = obj.toString();
                } catch (Exception e) {
                    String strF = f4i1.f(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strF), (Throwable) e);
                    strP = cy30.p("<", strF, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strP;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
