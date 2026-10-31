package p;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.text.Html;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class b2p1 {
    public static b180 a;
    public static b180 b;

    public static final int A(sc11 sc11Var) {
        int iOrdinal = sc11Var.ordinal();
        if (iOrdinal == 0) {
            return 2131960996;
        }
        if (iOrdinal == 1) {
            return 2131960997;
        }
        if (iOrdinal == 2) {
            return 2131960994;
        }
        if (iOrdinal == 3) {
            return 2131960995;
        }
        if (iOrdinal == 4) {
            return 2131960993;
        }
        if (iOrdinal == 5) {
            return 2131960992;
        }
        eg.o();
        return 0;
    }

    public static final ven0 B(ymd0 ymd0Var, Object obj, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        iac0 iac0Var = (iac0) x340Var.k(jfe0.a);
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            if (ymd0Var.e != ymd0.X) {
                obj = ymd0Var.e();
            }
            objT = v8r.q(obj);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        boolean zI = x340Var.i(ymd0Var) | x340Var.i(iac0Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new pg(ymd0Var, iac0Var, ven0Var, (byte) 20);
            x340Var.s0(objT2);
        }
        qxd0.h(ymd0Var, iac0Var, (iu30) objT2, x340Var);
        return ven0Var;
    }

    public static final ven0 C(ymd0 ymd0Var, b0k b0kVar) {
        return B(ymd0Var, ymd0Var.e(), b0kVar, 0);
    }

    public static final int D(jl9 jl9Var, yqg yqgVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = bb00.h(jl9Var.a(yqgVar.b()), x340Var);
        }
        err0 err0Var = (hdn0) objT;
        jp9 jp9Var = jl9Var.b;
        List list = jl9Var.a;
        boolean zI = ((((i & 112) ^ 48) > 32 && x340Var.g(yqgVar)) || (i & 48) == 32) | x340Var.i(err0Var) | x340Var.i(jl9Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new bh(jl9Var, yqgVar, err0Var, (lnm) null, (byte) 23);
            x340Var.s0(objT2);
        }
        qxd0.s(jp9Var, list, (vu30) objT2, x340Var);
        return err0Var.s();
    }

    public static void E(String str, Parcel parcel) {
        parcel.writeString(str);
    }

    public static final void a(lqg lqgVar, iac0 iac0Var, khc khcVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1088266719);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(lqgVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iac0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(khcVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            int iU = jch0.U(((wat) b0kVar3.k(t4k.h)).X0(16.0f));
            boolean zE = b0kVar3.e(iU) | ((i3 & 7168) == 2048) | b0kVar3.i(khcVar) | b0kVar3.i(lqgVar) | b0kVar3.i(iac0Var);
            Object objT = b0kVar3.T();
            if (zE || objT == fkj0.X) {
                qf8 qf8Var = new qf8(iU, khcVar, lqgVar, iac0Var, iu30Var);
                b0kVar3.s0(qf8Var);
                objT = qf8Var;
            }
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            dm5.a((iu30) objT, u291.d(qim0Var3, 1.0f), (iu30) null, b0kVar2, 0, 4);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0((byte) 20, i, lqgVar, iac0Var, khcVar, iu30Var, qim0Var2);
        }
    }

    public static final void b(lqg lqgVar, iac0 iac0Var, khc khcVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-140827887);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(lqgVar) ? 4 : 2) | (x340Var.i(iac0Var) ? 32 : 16) | (x340Var.i(khcVar) ? 256 : 128) | 3072;
        byte b2 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zI = x340Var.i(lqgVar);
            Object objT = x340Var.T();
            if (zI || objT == obj) {
                objT = new kqg(lqgVar, b2);
                x340Var.s0(objT);
            }
            qxd0.i(lqgVar, (iu30) objT, x340Var);
            ven0 ven0VarH = rwq.h(lqgVar.h, x340Var, 0);
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = us71.i(0.0f, x340Var);
            }
            drr0 drr0Var = (drr0) objT2;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            Object objT3 = x340Var.T();
            if (objT3 == obj) {
                objT3 = new ygr0((tob1) drr0Var, true);
                x340Var.s0(objT3);
            }
            bzn1.e(null, bdi.a, false, null, rgr0.a, null, (ygr0) objT3, null, x340Var, 2097200, 173);
            qim0 qim0VarR = i1p1.r(u291.d(qim0Var3, 1.0f));
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, rqt0.h | 32, qim0VarR);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarP);
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
            if (((sqg) ven0VarH.getValue()) == sqg.b) {
                x340Var.i0(1398663117);
                boolean zI2 = x340Var.i(drr0Var);
                Object objT4 = x340Var.T();
                if (zI2 || objT4 == obj) {
                    objT4 = new qg6(drr0Var, (byte) 8);
                    x340Var.s0(objT4);
                }
                a(lqgVar, iac0Var, khcVar, (iu30) objT4, null, x340Var, i2 & 1022);
                x340Var.r(false);
            } else {
                x340Var.i0(1398909133);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hwd(i, lqgVar, iac0Var, khcVar, qim0Var2, (byte) 14);
        }
    }

    public static final void c(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-157317680);
        int i2 = (x340Var.g(str) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            era eraVar = een.Q0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), 400.0f);
            mbh mbhVarA = jbh.a(h36.e, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            w0h1.a(mrx.c, isl.a, u291.r(nim0Var, 60.0f), 0L, 0L, false, x340Var, mrx.d | 48, 56);
            op71.g(x340Var, u291.h(nim0Var, 24.0f));
            String strN0 = cwl1.n0(2131956021, new Object[]{str}, x340Var);
            uwr uwrVar = cbx.a;
            uwo1.e(strN0, null, cbx.d(x340Var).g, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2026);
            uwo1.e(ydh.g(16.0f, 2131956022, x340Var, x340Var, nim0Var), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ps00(str, i);
        }
    }

    public static final void d(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(425735827);
        if (x340Var.Y(i & 1, i != 0)) {
            uwo1.e(cwl1.o0(x340Var, 2131956023), u291.h(u291.f(nim0.a, 1.0f), 400.0f), null, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2028);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new htu(i, (byte) 28);
        }
    }

    public static final void e(sp00 sp00Var, ak7 ak7Var, lzn0 lzn0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(205536798);
        int i2 = (x340Var.i(sp00Var) ? 4 : 2) | i | (x340Var.i(ak7Var) ? 32 : 16) | (x340Var.i(lzn0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            mno1.c((qyl) null, apo.r(1263315409, new qfx(ak7Var, sp00Var, lzn0Var, rwq.h((xe01) sp00Var.c, x340Var, 0), (byte) 17), x340Var), x340Var, 48, 1);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx00(sp00Var, ak7Var, lzn0Var, i, (byte) 14);
        }
    }

    public static final void f(p6k0 p6k0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        boolean z;
        p6k0 p6k0Var2 = p6k0Var;
        iu30 iu30Var3 = iu30Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(518507595);
        j06 j06Var = ((x340) b0kVar2).a;
        if ((i & 6) == 0) {
            i2 = i | (b0kVar2.g(p6k0Var2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(iu30Var3) ? 32 : 16;
        }
        int i3 = i2;
        if (b0kVar2.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            fra fraVar = een.N0;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, b0kVar2, 48);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z2 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            pw31 pw31Var = pw31.a;
            qim0 qim0VarA = pw31Var.a(1.0f, qim0Var, true);
            gfh0 gfh0VarC = t1c.c(een.g, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarA);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            int i4 = i3 & 112;
            boolean z3 = i4 == 32;
            Object objT = b0kVar2.T();
            if (z3 || objT == m4cVar) {
                objT = new stj0(iu30Var3, (byte) 8);
                b0kVar2.s0(objT);
            }
            z50 z50Var = z50.c;
            gbx gbxVar = new gbx(z50Var, (Function0) objT);
            ldx ldxVar = ldx.c;
            foo1.c(gbxVar, ldxVar, anm1.N("mixing_header_cancel_button", qim0Var), jax.a, yla.s(b0kVar2), null, null, null, null, null, u1j.f, b0kVar2, 25008, 48, 1992);
            b0kVar2.r(true);
            qim0 qim0VarA2 = pw31Var.a(1.5f, qim0Var, true);
            gfh0 gfh0VarC2 = t1c.c(een.h, false);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarA2);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC2, b0kVar2, lljVar);
            nko1.H(xos0VarM3, b0kVar2, lljVar2);
            x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar4);
            o6k0 o6k0Var = p6k0Var.a;
            boolean z4 = o6k0Var.a;
            ihh1 ihh1Var = o6k0Var.g;
            fq7.g(o6k0Var.g == ihh1.a, (qim0) null, xay.e(3, (ni20) null), xay.f(3, (ni20) null), (String) null, apo.r(1947962884, new mbj0(p6k0Var, (byte) 10), b0kVar2), b0kVar2, 200064, 18);
            if (ihh1Var != ihh1.c) {
                b0kVar2.i0(-1259763566);
                iu30Var2 = iu30Var;
                z = false;
                fq7.g(ihh1Var == ihh1.b, (qim0) null, xay.e(3, (ni20) null), xay.f(3, (ni20) null), (String) null, apo.r(-698278753, new u6k0(p6k0Var, iu30Var2, (byte) 0), b0kVar2), b0kVar2, 200064, 18);
                b0kVar2.r(false);
            } else {
                iu30Var2 = iu30Var;
                z = false;
                b0kVar2.i0(-1259298442);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
            qim0 qim0VarA3 = pw31Var.a(1.0f, qim0Var, true);
            gfh0 gfh0VarC3 = t1c.c(een.i, z);
            int iHashCode4 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM4 = b0kVar2.m();
            qim0 qim0VarE4 = zr7.E(b0kVar2, qim0VarA3);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC3, b0kVar2, lljVar);
            nko1.H(xos0VarM4, b0kVar2, lljVar2);
            x0d.q(iHashCode4, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE4, b0kVar2, lljVar4);
            jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, b0kVar2, 48);
            int iHashCode5 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM5 = b0kVar2.m();
            qim0 qim0VarE5 = zr7.E(b0kVar2, qim0Var);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM5, b0kVar2, lljVar2);
            x0d.q(iHashCode5, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE5, b0kVar2, lljVar4);
            boolean z5 = (i4 == 32) | ((i3 & 14) == 4);
            Object objT2 = b0kVar2.T();
            if (z5 || objT2 == m4cVar) {
                objT2 = new v6k0(p6k0Var, iu30Var2, (byte) 0);
                b0kVar2.s0(objT2);
            }
            gbx gbxVar2 = new gbx(z50Var, (Function0) objT2);
            gdx gdxVarS = yla.s(b0kVar2);
            b0kVar2 = b0kVar2;
            p6k0Var2 = p6k0Var;
            iu30Var3 = iu30Var;
            foo1.c(gbxVar2, ldxVar, pqo.h(anm1.N("mixing_header_save_button_enabled_is_" + z4, qim0Var), !z4), null, gdxVarS, null, null, null, null, null, u1j.g, b0kVar2, 48, 48, 2008);
            us71.m(b0kVar2, true, true, true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new w6k0(p6k0Var2, iu30Var3, i, (byte) 0);
        }
    }

    public static final void g(qij1 qij1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1799142184);
        int i2 = (x340Var.g(qij1Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            j(qij1Var.a, qij1Var.b, qij1Var.d, qij1Var.e, x340Var, 0);
            String str = qij1Var.h;
            qim0 qim0VarA = h2c.a.a(nim0Var, een.X);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarA, 16.0f, 8.0f);
            long jB = u7h.b(cbx.a(x340Var).a.c, 0.54f, 0.0f, 0.0f, 0.0f, 14);
            cua cuaVar = cbx.b(x340Var).f;
            r(0, str, x340Var, dug.f(qim0VarY, jB, er31.b(4.0f)));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oij1(qij1Var, i, (byte) 0);
        }
    }

    public static final void h(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(28265504);
        if (!x340Var.Y(i & 1, i != 0)) {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new htu(i, (byte) 29);
        }
    }

    public static final void i(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1940504560);
        if (x340Var.Y(i & 1, i != 0)) {
            l4p1.g(null, x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 0);
        }
    }

    public static final void j(jlw0 jlw0Var, jlw0 jlw0Var2, int i, String str, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1730867917);
        int i3 = i2 | (x340Var.g(jlw0Var) ? 4 : 2) | (x340Var.g(jlw0Var2) ? 32 : 16) | (x340Var.e(i) ? 256 : 128) | (x340Var.g(str) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            if (jlw0Var != null) {
                x340Var.i0(-1091043763);
                Uri uri = Uri.parse(jlw0Var.a);
                String str2 = jlw0Var.b;
                if (ihc1.y0(str2)) {
                    str2 = str;
                }
                jsl jslVarC = two1.C(2131962251, 0, str2, x340Var);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cbx.a.getClass();
                qim0 qim0VarR = d7e.r(uwr.d().a, qim0VarF, false);
                cua cuaVar = cbx.b(x340Var).f;
                eso1.e(uri, jslVarC, anm1.N("video.content.main.image", i1p1.q(qim0VarR, er31.b(8.0f))), (p3v) null, (zvx) null, (ecx) null, mif1.S0, (tl3) null, (ColorFilter) null, (qux) null, true, true, x340Var, 1572864, 54, 952);
                x340Var.r(false);
            } else {
                x340Var.i0(-1090379743);
                gra graVar = een.h;
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                uwr uwrVar2 = cbx.a;
                cbx.a.getClass();
                qim0 qim0VarR2 = d7e.r(uwr.d().a, qim0VarF2, false);
                cua cuaVar2 = cbx.b(x340Var).f;
                qim0 qim0VarN = anm1.N("video.content.main.image", dug.f(i1p1.q(qim0VarR2, er31.b(8.0f)), z4p1.e(i), d4o1.a));
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
                Uri uri2 = Uri.parse(jlw0Var2.a);
                String str3 = jlw0Var2.b;
                if (ihc1.y0(str3)) {
                    str3 = str;
                }
                eso1.e(uri2, two1.C(2131962251, 0, str3, x340Var), d7e.r(1.0f, u291.c(nim0Var, 1.0f), false), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, true, false, x340Var, 1597824, 6, 2984);
                x340Var.r(true);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1(jlw0Var, jlw0Var2, i, str, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void k(qij1 qij1Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        b0k b0kVar2;
        byte b2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1791055697);
        j06 j06Var = ((x340) b0kVar3).a;
        int i2 = (b0kVar3.g(qij1Var) ? 4 : 2) | i;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            gce0 gce0Var = gce0.a1;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(zr7.i(nim0Var, gce0Var), 1.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 16.0f, 16.0f, 16.0f, 0.0f, 8);
            cbx.a.getClass();
            t1c.a(hno1.f(qim0VarB, uwr.d()), b0kVar3, 0);
            qim0 qim0VarF2 = dug.f(zr7.i(u291.d(nim0Var, 1.0f), gce0Var), z4p1.e(qij1Var.c), d4o1.a);
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            qim0 qim0VarX = uyn1.x(qim0VarF2, 16.0f);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, b0kVar3, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarX);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA2, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            wnb0 wnb0VarQ = kk0.q(b0kVar3, qim0VarE2, lljVar4, 1.0f, true);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, b0kVar3, 0);
            int iHashCode3 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM3 = b0kVar3.m();
            qim0 qim0VarE3 = zr7.E(b0kVar3, wnb0VarQ);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, lljVar);
            nko1.H(xos0VarM3, b0kVar3, lljVar2);
            x0d.q(iHashCode3, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE3, b0kVar3, lljVar4);
            b0kVar2 = b0kVar3;
            ryo1.g(2, 0, 384, 24, qij1Var.e, qij1Var.f, b0kVar2, null);
            b0kVar2.r(true);
            cvx cvxVar5 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(nim0Var, 12.0f));
            sbl.o(qij1Var.g, (qim0) null, 0, b0kVar2, 0, 6);
            b2 = 1;
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b2 = 1;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oij1(qij1Var, i, b2);
        }
    }

    public static final void l(p6k0 p6k0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1480305655);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(p6k0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            o6k0 o6k0Var = p6k0Var.a;
            boolean z = o6k0Var.d;
            ihh1 ihh1Var = o6k0Var.g;
            boolean z2 = z || o6k0Var.f;
            boolean z3 = ihh1Var != ihh1.a;
            boolean z4 = ihh1Var == ihh1.b;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new zen0(Boolean.valueOf(z4));
                x340Var.s0(objT);
            }
            zen0 zen0Var = (zen0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new zen0(Boolean.valueOf(!z3 && z2));
                x340Var.s0(objT2);
            }
            zen0 zen0Var2 = (zen0) objT2;
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zH = x340Var.h(z3) | x340Var.i(zen0Var2) | x340Var.i(zen0Var) | x340Var.h(z4) | x340Var.h(z2);
            Object objT3 = x340Var.T();
            if (zH || objT3 == m4cVar) {
                guj0 guj0Var = new guj0(z3, zen0Var2, zen0Var, z4, z2, (lnm) null, (byte) 1);
                x340Var.s0(guj0Var);
                objT3 = guj0Var;
            }
            qxd0.s(ihh1Var, boolValueOf, (vu30) objT3, x340Var);
            x561 x561Var = new x561(zen0Var, zen0Var2);
            n(apo.r(-2019924979, new k2g0(iu30Var, (byte) 13), x340Var), apo.r(1390306510, new x6k0(x561Var, p6k0Var, iu30Var, (byte) 0), x340Var), apo.r(505570703, new x6k0(x561Var, p6k0Var, iu30Var, (byte) 1), x340Var), x340Var, 438);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w6k0(p6k0Var, iu30Var, i, (byte) 1);
        }
    }

    public static final void m(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(499896463);
        if (x340Var.Y(i & 1, i != 0)) {
            uwo1.e(cwl1.o0(x340Var, 2131956024), u291.h(u291.f(nim0.a, 1.0f), 400.0f), null, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2028);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 1);
        }
    }

    public static final void n(j2i j2iVar, j2i j2iVar2, j2i j2iVar3, b0k b0kVar, int i) {
        j2i j2iVar4;
        j2i j2iVar5;
        j2i j2iVar6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-563060512);
        j06 j06Var = x340Var.a;
        if (x340Var.Y(i & 1, (i & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = td4.j;
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(gfh0Var, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
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
            j2iVar4 = j2iVar;
            j2iVar4.invoke(x340Var, 6);
            x340Var.r(true);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            j2iVar5 = j2iVar2;
            j2iVar5.invoke(x340Var, 6);
            x340Var.r(true);
            gfh0 gfh0VarC3 = t1c.c(graVar, false);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC3, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            j2iVar6 = j2iVar3;
            ktd.s(j2iVar6, x340Var, 6, true, true);
        } else {
            j2iVar4 = j2iVar;
            j2iVar5 = j2iVar2;
            j2iVar6 = j2iVar3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rvg0(j2iVar4, j2iVar5, j2iVar6, i, (byte) 23);
        }
    }

    public static final void o(int i, Function0 function0, b0k b0kVar, iu30 iu30Var) {
        byte b2;
        vu30 vu30Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-977332150);
        int i2 = i | (x340Var.i(iu30Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            y7e1 y7e1VarD = c4p1.D(0, 3, null, x340Var);
            boolean zI = ((i2 & 14) == 4) | x340Var.i(y7e1VarD);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new qy5(y7e1VarD, iu30Var, (lnm) null, (byte) 6);
                x340Var.s0(objT);
            }
            qxd0.t(y7e1VarD, x340Var, (vu30) objT);
            fra fraVar = een.N0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = uyn1.B(dug.f(qim0VarF, cbx.a(x340Var).a.c, d4o1.a), 16.0f, 10.0f, 16.0f, 0.0f, 8);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE, y580.Y, 1.0f, true);
            eyx eyxVar = eyx.e;
            String strO0 = cwl1.o0(x340Var, 2131956025);
            if (y7e1VarD.d().d.length() > 0) {
                x340Var.i0(1262127229);
                vu30 vu30VarR = apo.r(-1460116979, new ex1(y7e1VarD, (byte) 1), x340Var);
                x340Var.r(false);
                vu30Var = vu30VarR;
            } else {
                x340Var.i0(1262432858);
                x340Var.r(false);
                vu30Var = null;
            }
            rwo1.a(y7e1VarD, eyxVar, wnb0VarQ, null, strO0, api.g, vu30Var, false, null, null, null, null, d6e1.b, null, null, null, null, null, 0.0f, false, x340Var, 196608, 0, 0, 2088840);
            String strO1 = cwl1.o0(x340Var, 2131956019);
            lee1 lee1Var = cbx.d(x340Var).j;
            boolean z = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                b2 = 0;
                objT2 = new zg20(function0, (byte) 0);
                x340Var.s0(objT2);
            } else {
                b2 = 0;
            }
            uwo1.e(strO1, uyn1.B(bin.x(nim0Var, false, null, null, null, (Function0) objT2, 15), 10.0f, 0.0f, 0.0f, 0.0f, 14), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            b2 = 0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ah20(iu30Var, function0, i, b2);
        }
    }

    public static final void p(gyd1 gyd1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        String str;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-2008263637);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.g(gyd1Var) ? 4 : 2) | (b0kVar2.i(iu30Var) ? 32 : 16) | 384;
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, qim0VarF);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            boolean z2 = gyd1Var.c;
            int i3 = gyd1Var.a;
            if (i3 == 2131954102) {
                str = "comments_terms_public_comments_checkbox";
            } else if (i3 == 2131954104) {
                str = "comments_terms_needs_review_checkbox";
            } else {
                if (i3 != 2131954103) {
                    bhn0.x(i3, "Unknown comment term title resource: ");
                    return;
                }
                str = "comments_terms_safety_matters_checkbox";
            }
            aex.b(z2, iu30Var, anm1.N(str, qim0Var3), null, 0, null, null, b0kVar2, i2 & 112, 120);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            wnb0 wnb0VarK = c13.k(qim0Var3, 8.0f, b0kVar2, 1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, wnb0VarK);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            String strO0 = cwl1.o0(b0kVar2, i3);
            lee1 lee1Var = cbx.d(b0kVar2).k;
            long j = cbx.a(b0kVar2).b.a;
            b0kVar2 = b0kVar2;
            uwo1.e(strO0, null, lee1Var, j, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2034);
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(qim0Var3, 8.0f));
            uwo1.e(cwl1.o0(b0kVar2, gyd1Var.b), null, cbx.d(b0kVar2).m, cbx.a(b0kVar2).b.a, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2034);
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new juc1(gyd1Var, iu30Var, qim0Var2, i, (byte) 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0335 A[PHI: r14
      0x0335: PHI (r14v24 p.iu30) = (r14v22 p.iu30), (r14v25 p.iu30) binds: [B:75:0x0333, B:71:0x032c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0346  */
    public static final void q(c380 c380Var, vu30 vu30Var, Function0 function0, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        Function0 function1;
        qim0 qim0Var2;
        boolean z;
        jax haxVar;
        long j;
        iu30 iu30Var2;
        boolean z2;
        boolean zG;
        Object objT;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1601682362);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.g(c380Var) ? 4 : 2) | (b0kVar2.i(vu30Var) ? 32 : 16) | (b0kVar2.i(function0) ? 256 : 128) | (b0kVar2.i(iu30Var) ? 2048 : 1024) | 24576;
        if (b0kVar2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            if (!c380Var.isEmpty()) {
                Iterator it = c380Var.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    } else if (!((gyd1) it.next()).c) {
                        z = false;
                        break;
                    }
                }
            } else {
                z = true;
                break;
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = l6o1.H(anm1.N("comments_terms_sheet", u291.f(qim0Var3, 1.0f)), l6o1.C(0, 0, 1, b0kVar2), false, 14);
            uwr uwrVar = cbx.a;
            qim0 qim0VarY = voo1.y(uyn1.z(cbx.b(b0kVar2).b.a, 0.0f, 2, qim0VarH), voo1.g);
            era eraVar = een.Q0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z3 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0Var2 = qim0Var3;
            uwo1.e(ydh.g(16.0f, 2131954099, b0kVar2, b0kVar2, qim0Var3), null, cbx.d(b0kVar2).e, cbx.a(b0kVar2).b.a, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2018);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            uwo1.e(ydh.g(8.0f, 2131954101, b0kVar2, b0kVar2, qim0Var2), null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2018);
            qim0 qim0VarO = ab80.o(qim0Var2, cbx.b(b0kVar2).b.a, b0kVar2, qim0Var2, 1.0f);
            long jA = cbx.a(b0kVar2).a.b.a();
            cua cuaVar = cbx.b(b0kVar2).f;
            qim0 qim0VarF = dug.f(qim0VarO, jA, er31.b(8.0f));
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            qim0 qim0VarY2 = uyn1.y(qim0VarF, 16.0f, 16.0f);
            mbh mbhVarA2 = jbh.a(f36Var, een.P0, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarY2);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            Iterator itN = kk0.n(b0kVar2, qim0VarE2, lljVar4, -1337041639, c380Var);
            int i3 = 0;
            while (itN.hasNext()) {
                Object next = itN.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                gyd1 gyd1Var = (gyd1) next;
                boolean zE = b0kVar2.e(i3) | ((i2 & 112) == 32);
                Object objT2 = b0kVar2.T();
                if (zE || objT2 == m4cVar) {
                    objT2 = new t7m(vu30Var, i3, (byte) 4);
                    b0kVar2.s0(objT2);
                }
                p(gyd1Var, (iu30) objT2, null, b0kVar2, 0);
                i3 = i4;
            }
            b0kVar2.r(false);
            b0kVar2.r(true);
            uwr uwrVar2 = cbx.a;
            String strG = ydh.g(cbx.b(b0kVar2).b.a, 2131954100, b0kVar2, b0kVar2, qim0Var2);
            int i5 = i2 >> 6;
            ye5 ye5VarO = kk0.o(-1037726084, b0kVar2);
            StringBuilder sb = ye5VarO.a;
            String string = Html.fromHtml(strG, 63).toString();
            long j2 = cbx.a(b0kVar2).b.a;
            se11 se11Var = new se11("<a href=\"([^\"]+)\">([^<]+)</a>");
            b0kVar2.i0(-1037717248);
            nh40 nh40Var = new nh40(se11.b(se11Var, strG));
            int i6 = 0;
            while (nh40Var.hasNext()) {
                mbh0 mbh0Var = (mbh0) nh40Var.next();
                String str = (String) mbh0Var.a().get(1);
                String str2 = (String) mbh0Var.a().get(2);
                int iW0 = ihc1.w0(string, str2, i6, false, 4);
                if (iW0 >= 0) {
                    b0kVar2.i0(-1480863008);
                    ye5VarO.g(string.substring(i6, iW0));
                    int length = sb.length();
                    ye5VarO.g(str2);
                    int length2 = sb.length();
                    j = j2;
                    ye5VarO.d(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), length, length2);
                    if (((i5 & 112) ^ 48) > 32) {
                        iu30Var2 = iu30Var;
                        if (b0kVar2.g(iu30Var2)) {
                            z2 = true;
                        }
                        zG = z2 | b0kVar2.g(str);
                        objT = b0kVar2.T();
                        if (zG || objT == m4cVar) {
                            objT = new uhg(iu30Var2, str, (byte) 7);
                            b0kVar2.s0(objT);
                        }
                        ye5VarO.b(new ljc0(str, (pae1) null, (rjc0) objT, 2), length, length2);
                        int length3 = str2.length() + iW0;
                        b0kVar2.r(false);
                        i6 = length3;
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    if ((i5 & 48) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zG = z2 | b0kVar2.g(str);
                    objT = b0kVar2.T();
                    if (zG) {
                        objT = new uhg(iu30Var2, str, (byte) 7);
                        b0kVar2.s0(objT);
                    } else {
                        objT = new uhg(iu30Var2, str, (byte) 7);
                        b0kVar2.s0(objT);
                    }
                    ye5VarO.b(new ljc0(str, (pae1) null, (rjc0) objT, 2), length, length2);
                    int length4 = str2.length() + iW0;
                    b0kVar2.r(false);
                    i6 = length4;
                } else {
                    j = j2;
                    b0kVar2.i0(-1480398845);
                    b0kVar2.r(false);
                }
                nh40Var = nh40Var;
                j2 = j;
            }
            b0kVar2.r(false);
            if (i6 < string.length()) {
                ye5VarO.g(string.substring(i6));
            }
            af5 af5VarP = ye5VarO.p();
            b0kVar2.r(false);
            uwr uwrVar3 = cbx.a;
            uwo1.d(af5VarP, cbx.a(b0kVar2).b.b, u291.f(qim0Var2, 1.0f), cbx.d(b0kVar2).j, new a0e1(3), null, 0, false, null, 0, null, null, b0kVar2, 0, 0, 4064);
            op71.g(b0kVar2, u291.h(qim0Var2, cbx.b(b0kVar2).b.b));
            boolean z4 = (i2 & 896) == 256;
            Object objT3 = b0kVar2.T();
            if (z4 || objT3 == m4cVar) {
                function1 = function0;
                objT3 = new uuc1(function1, (byte) 9);
                b0kVar2.s0(objT3);
            } else {
                function1 = function0;
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT3);
            idx idxVar = new idx(13);
            gdx gdxVarP = yla.p(b0kVar2);
            qim0 qim0VarN = anm1.N("comments_terms_confirm_button", qim0Var2);
            if (z) {
                b0kVar2.i0(563087915);
                b0kVar2.r(false);
                haxVar = jax.a;
            } else {
                b0kVar2.i0(563088667);
                haxVar = new hax(cwl1.o0(b0kVar2, 2131954098));
                b0kVar2.r(false);
            }
            foo1.c(gbxVar, idxVar, qim0VarN, haxVar, gdxVarP, null, null, null, null, null, umj.a, b0kVar2, 0, 48, 1992);
            b0kVar2 = b0kVar2;
            x0d.s(qim0Var2, cbx.b(b0kVar2).b.a, b0kVar2, true);
        } else {
            function1 = function0;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wnx0(c380Var, vu30Var, function1, iu30Var, qim0Var2, i, (byte) 27);
        }
    }

    public static final void r(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(429680511);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (str == null) {
            x340Var.i0(1609663298);
            x340Var.r(false);
        } else {
            x340Var.i0(1609663299);
            gfx.b(18, apo.r(-610315092, new uo50(qim0Var, str, (byte) 29), x340Var), x340Var, 54);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pij1(str, qim0Var, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public static final void s(qij1 qij1Var, xwa xwaVar, xwa xwaVar2, qim0 qim0Var, xwa xwaVar3, b0k b0kVar, int i, int i2) {
        xwa xwaVar4;
        qim0 qim0Var2;
        int i3;
        xwa xwaVar5;
        int i4;
        int i5;
        boolean z;
        qim0 qim0Var3;
        xwa xwaVar6;
        h311 h311VarV;
        xwa xwaVar7;
        xwa xwaVar8;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2094457425);
        int i6 = (x340Var.g(qij1Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            xwaVar4 = xwaVar;
            i6 |= x340Var.g(xwaVar4) ? 32 : 16;
        } else {
            xwaVar4 = xwaVar;
        }
        if ((i & 384) == 0) {
            i6 |= x340Var.g(xwaVar2) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                qim0Var2 = qim0Var;
                i6 |= x340Var.g(qim0Var2) ? 2048 : 1024;
            }
            i3 = i2 & 16;
            if (i3 != 0) {
                i5 = i6 | 24576;
                xwaVar5 = xwaVar3;
            } else {
                xwaVar5 = xwaVar3;
                if (x340Var.g(xwaVar5)) {
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i5 = i6 | i4;
            }
            if ((i5 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i5 & 1, z)) {
                if (i7 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if (i3 != 0) {
                    xwaVar7 = null;
                } else {
                    xwaVar7 = xwaVar5;
                }
                und.a(xwaVar4, (qim0) null, 0.0f, apo.r(466324748, new pej1(qij1Var, qim0Var3, xwaVar2, (byte) 2), x340Var), x340Var, ((i5 >> 3) & 14) | 3072, 6);
                if (xwaVar7 == null) {
                    x340Var.i0(-1302873132);
                    x340Var.r(false);
                    xwaVar8 = xwaVar7;
                } else {
                    x340Var.i0(-1302873131);
                    xwaVar8 = xwaVar7;
                    und.a(xwaVar8, d9y0.k(qim0Var3, 0.0f), 0.0f, apo.r(-1430477333, new oij1(qij1Var, (byte) 3), x340Var), x340Var, 3072, 4);
                    x340Var.r(false);
                }
                xwaVar6 = xwaVar8;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                xwaVar6 = xwaVar5;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new nym(qij1Var, xwaVar, xwaVar2, qim0Var3, xwaVar6, i, i2, (byte) 5);
            }
        }
        i6 |= 3072;
        qim0Var2 = qim0Var;
        i3 = i2 & 16;
        if (i3 != 0) {
            i5 = i6 | 24576;
            xwaVar5 = xwaVar3;
        } else {
            xwaVar5 = xwaVar3;
            if (x340Var.g(xwaVar5)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i5 = i6 | i4;
        }
        if ((i5 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i5 & 1, z)) {
            if (i7 != 0) {
                qim0Var3 = nim0.a;
            } else {
                qim0Var3 = qim0Var2;
            }
            if (i3 != 0) {
                xwaVar7 = null;
            } else {
                xwaVar7 = xwaVar5;
            }
            und.a(xwaVar4, (qim0) null, 0.0f, apo.r(466324748, new pej1(qij1Var, qim0Var3, xwaVar2, (byte) 2), x340Var), x340Var, ((i5 >> 3) & 14) | 3072, 6);
            if (xwaVar7 == null) {
                x340Var.i0(-1302873132);
                x340Var.r(false);
                xwaVar8 = xwaVar7;
            } else {
                x340Var.i0(-1302873131);
                xwaVar8 = xwaVar7;
                und.a(xwaVar8, d9y0.k(qim0Var3, 0.0f), 0.0f, apo.r(-1430477333, new oij1(qij1Var, (byte) 3), x340Var), x340Var, 3072, 4);
                x340Var.r(false);
            }
            xwaVar6 = xwaVar8;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            xwaVar6 = xwaVar5;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nym(qij1Var, xwaVar, xwaVar2, qim0Var3, xwaVar6, i, i2, (byte) 5);
        }
    }

    public static final void t(qij1 qij1Var, qim0 qim0Var, vu30 vu30Var, b0k b0kVar, int i, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1540025479);
        int i3 = (x340Var.g(qij1Var) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= x340Var.i(vu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                vu30Var = apo.r(-849066847, new oij1(qij1Var, (byte) 4), x340Var);
            }
            w2g0.c(dug.f(zr7.i(qim0Var, gce0.a1), z4p1.e(qij1Var.c), d4o1.a), (tl3) null, apo.r(-355039773, new sgi1(vu30Var, qij1Var, (byte) 7), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        vu30 vu30Var2 = vu30Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dg6(qij1Var, qim0Var, vu30Var2, i, i2, (byte) 10);
        }
    }

    public static final jmr0 u(oq70 oq70Var, Context context, int i) {
        if (oq70Var instanceof kxa) {
            return sj1.b(new yk4(((kxa) oq70Var).a), i);
        }
        return oq70Var instanceof t7v ? new w7v(x2p1.g(oq70Var, context.getResources()).mutate()) : new x9c(oq70Var, (byte) 1);
    }

    public static jmr0 v(oq70 oq70Var, Context context) {
        return u(oq70Var, context, 1);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    public static final ok71 w(qk71 qk71Var, kk71 kk71Var) {
        c9 c9VarF;
        fl71 fl71Var = kk71Var.d;
        fl71 fl71Var2 = fl71Var instanceof fl71 ? fl71Var : null;
        c380 c380VarA = fl71Var2 != null ? fl71Var2.a() : null;
        boolean z = qk71Var instanceof ok71;
        if (z) {
            ok71 ok71Var = (ok71) qk71Var;
            if (ok71Var.c instanceof fl71) {
                return ok71.a(ok71Var, (c9) null, kk71Var.d, kk71Var.e, (Boolean) null, 35);
            }
        }
        ela1 ela1Var = new ela1(kk71Var.a, kk71Var.b, kk71Var.c);
        hl71 hl71Var = kk71Var.d;
        te71 te71Var = kk71Var.e;
        boolean z2 = hl71Var instanceof fl71;
        if (c380VarA != null) {
            int size = c380VarA.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new mk71(c2p1.B(i)));
            }
            c9VarF = mqo1.F(arrayList);
            if (c9VarF == null) {
                c9VarF = fg91.b;
            }
        } else {
            c9VarF = fg91.b;
        }
        ok71 ok71Var2 = z ? (ok71) qk71Var : null;
        return new ok71(c9VarF, ela1Var, hl71Var, te71Var, z2, ok71Var2 != null ? ok71Var2.f : null);
    }

    public static final ok71 x(ok71 ok71Var, int i, nk71 nk71Var) {
        c380 c380Var = ok71Var.a;
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        int i2 = 0;
        for (Object obj : c380Var) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            nk71 nk71Var2 = (nk71) obj;
            if (i2 == i) {
                nk71Var2 = nk71Var;
            }
            arrayList.add(nk71Var2);
            i2 = i3;
        }
        return ok71.a(ok71Var, mqo1.F(arrayList), (hl71) null, (te71) null, (Boolean) null, 62);
    }

    public static f9p y(t2l1 t2l1Var, u2l1 u2l1Var, q7r0 q7r0Var, rih1 rih1Var) {
        t2l1Var.getClass();
        rih1Var.getClass();
        return new f9p(t2l1Var, u2l1Var, q7r0Var);
    }

    public static final io80 z(klm klmVar, ycp0 ycp0Var) {
        return klmVar.b("PlaybackSettingsService", new mcp0(ycp0Var, (byte) 3));
    }
}
