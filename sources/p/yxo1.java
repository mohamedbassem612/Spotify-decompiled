package p;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class yxo1 {
    public static b180 a;
    public static b180 b;

    public static final boolean C(oma0 oma0Var) {
        if (oma0Var.i()) {
            return false;
        }
        tka0 tka0VarK = oma0Var.k();
        tka0 tka0Var = tka0VarK instanceof tka0 ? tka0VarK : null;
        Class clsU = tka0Var != null ? j2h1.u(tka0Var) : null;
        return (clsU == null || clsU.equals(Void.TYPE)) ? false : true;
    }

    public static final boolean D(ic11 ic11Var) {
        l3b0 l3b0VarP;
        List listF = ic11Var.f();
        if (!(listF instanceof Collection) || !listF.isEmpty()) {
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                if (((hc11) it.next()).s() != 1) {
                    return false;
                }
            }
        }
        String name = ic11Var.getName();
        bla0 bla0VarA = ic11Var.a();
        String str = null;
        bla0 bla0Var = bla0VarA instanceof bla0 ? bla0VarA : null;
        if (bla0Var != null && (l3b0VarP = bla0Var.P()) != null) {
            str = l3b0VarP.m;
        }
        return u890.j(name, str);
    }

    public static final ven0 H(String str, int i, int i2, dlv dlvVar, boolean z, boolean z2, Function0 function0, b0k b0kVar) {
        return zod.S(new hsi1(str, Float.valueOf(0.0f), Float.valueOf(1.0f), new pxg1(i2, i, dlvVar), rno1.a), z, z2, function0, b0kVar, 3080, 0);
    }

    public static final Class L(oma0 oma0Var) {
        jla0 jla0VarK = oma0Var != null ? oma0Var.k() : null;
        tka0 tka0Var = jla0VarK instanceof tka0 ? (tka0) jla0VarK : null;
        if (tka0Var != null && tka0Var.p()) {
            if (!bpi1.j(oma0Var)) {
                return ((wdg) tka0Var).n();
            }
            oma0 oma0VarS = bpi1.s(oma0Var);
            if (oma0VarS != null && !bpi1.j(oma0VarS) && !C(oma0VarS)) {
                return ((wdg) tka0Var).n();
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Code duplicated, block: B:54:0x012e  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:62:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, String str2, qim0 qim0Var, boolean z, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        boolean z2;
        boolean z3;
        qim0 qim0Var3;
        boolean z4;
        h311 h311VarV;
        qim0 qim0Var4;
        qim0 qim0Var5;
        boolean z5;
        Object objT;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z6;
        n4k n4kVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-711441147);
        j06 j06Var = x340Var.a;
        int i4 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var.g(qim0Var2) ? 256 : 128);
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= x340Var.h(z2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                qim0Var4 = nim0.a;
                if (i5 != 0) {
                    qim0Var5 = qim0Var4;
                } else {
                    qim0Var5 = qim0Var2;
                }
                if (i6 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                d36 d36Var = new d36(16.0f, true, new um5(false));
                qim0 qim0VarZ = u291.z(u291.f(qim0Var5, 1.0f), (fra) null, 3);
                cvx cvxVar2 = cbx.b(x340Var).b;
                cvx cvxVar3 = cbx.b(x340Var).b;
                qim0 qim0VarY = uyn1.y(qim0VarZ, 16.0f, 12.0f);
                objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = h3.b1;
                    x340Var.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0VarY, true, (iu30) objT);
                jw31VarA = ew31.a(d36Var, een.Z, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarB);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z6 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z6) {
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
                wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE, lljVar4, 1.0f, true);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int i7 = i3;
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, wnb0VarQ);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                uwo1.e(str, anm1.N("account-details-text-row-title", qim0Var4), cbx.d(x340Var).g, cbx.a(x340Var).b.a, new a0e1(5), null, 0, false, null, 0, null, x340Var, (i7 & 14) | 48, 0, 2016);
                uwo1.e(str2, anm1.N("account-details-text-row-subtitle", qim0Var4), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(5), null, 0, false, null, 0, null, x340Var, ((i7 >> 3) & 14) | 48, 0, 2016);
                x340Var = x340Var;
                x340Var.r(true);
                if (z5) {
                    x340Var.i0(1286981005);
                    plx plxVar = plx.c;
                    long j = cbx.a(x340Var).b.b;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    w0h1.a(plxVar, isl.a, u291.r(qim0Var4, 16.0f).then(new i5j1(een.N0)), j, 0L, false, x340Var, plx.d | 48, 48);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1287282945);
                    x340Var.r(false);
                }
                x340Var.r(true);
                qim0Var3 = qim0Var5;
                z4 = z5;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new sl(str, str2, qim0Var3, z4, i, i2, (byte) 0);
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i3 & 1, z3)) {
            qim0Var4 = nim0.a;
            if (i5 != 0) {
                qim0Var5 = qim0Var4;
            } else {
                qim0Var5 = qim0Var2;
            }
            if (i6 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            uwr uwrVar2 = cbx.a;
            cvx cvxVar4 = cbx.b(x340Var).b;
            d36 d36Var2 = new d36(16.0f, true, new um5(false));
            qim0 qim0VarZ2 = u291.z(u291.f(qim0Var5, 1.0f), (fra) null, 3);
            cvx cvxVar5 = cbx.b(x340Var).b;
            cvx cvxVar6 = cbx.b(x340Var).b;
            qim0 qim0VarY2 = uyn1.y(qim0VarZ2, 16.0f, 12.0f);
            objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = h3.b1;
                x340Var.s0(objT);
            }
            qim0 qim0VarB2 = s161.b(qim0VarY2, true, (iu30) objT);
            jw31VarA = ew31.a(d36Var2, een.Z, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarB2);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z6 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z6) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar5 = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar5);
            llj lljVar6 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar7 = y580.R0;
            nko1.H(numValueOf2, x340Var, lljVar7);
            nko1.F(x340Var);
            llj lljVar8 = y580.Y;
            wnb0 wnb0VarQ2 = kk0.q(x340Var, qim0VarE, lljVar8, 1.0f, true);
            mbh mbhVarA2 = jbh.a(h36.c, een.P0, x340Var, 0);
            int i8 = i3;
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, wnb0VarQ2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar5);
            nko1.H(xos0VarM3, x340Var, lljVar6);
            x0d.q(iHashCode3, x340Var, lljVar7, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar8);
            uwo1.e(str, anm1.N("account-details-text-row-title", qim0Var4), cbx.d(x340Var).g, cbx.a(x340Var).b.a, new a0e1(5), null, 0, false, null, 0, null, x340Var, (i8 & 14) | 48, 0, 2016);
            uwo1.e(str2, anm1.N("account-details-text-row-subtitle", qim0Var4), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(5), null, 0, false, null, 0, null, x340Var, ((i8 >> 3) & 14) | 48, 0, 2016);
            x340Var = x340Var;
            x340Var.r(true);
            if (z5) {
                x340Var.i0(1286981005);
                plx plxVar2 = plx.c;
                long j2 = cbx.a(x340Var).b.b;
                zov0 zov0Var2 = cbx.b(x340Var).g;
                w0h1.a(plxVar2, isl.a, u291.r(qim0Var4, 16.0f).then(new i5j1(een.N0)), j2, 0L, false, x340Var, plx.d | 48, 48);
                x340Var.r(false);
            } else {
                x340Var.i0(1287282945);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var3 = qim0Var5;
            z4 = z5;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sl(str, str2, qim0Var3, z4, i, i2, (byte) 0);
        }
    }

    public static final void b(String str, boolean z, long j, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-986769277);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.f(j) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            fra fraVar = een.N0;
            int i3 = i2 & 112;
            boolean z2 = ((i2 & 7168) == 2048) | (i3 == 32);
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new z20(iu30Var, z, (byte) 7);
                x340Var.s0(objT);
            }
            qim0 qim0VarF = u291.f(bin.x(qim0Var, false, null, null, null, (Function0) objT, 15), 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 16.0f, 0.0f, 16.0f, cbx.b(x340Var).b.a, 2);
            boolean z3 = i3 == 32;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new gy((byte) 12, z);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB2 = s161.b(qim0VarB, true, (iu30) objT2);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB2);
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
            nko1.H(qim0VarE, x340Var, y580.Y);
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(-881517402);
                w0h1.a(klx.c, isl.a, (qim0) null, j, 0L, false, x340Var, klx.d | 48 | ((i2 << 3) & 7168), 52);
                x340Var.r(false);
            } else {
                x340Var.i0(-881349227);
                zov0 zov0Var = cbx.b(x340Var).g;
                qim0 qim0VarR = d7e.r(1.0f, u291.v(nim0Var, 24.0f), false);
                cr31 cr31Var = er31.a;
                qim0 qim0VarQ = i1p1.q(qim0VarR, cr31Var);
                avw0 avw0Var = cbx.b(x340Var).c;
                t1c.a(d1u.E(2.0f, cbx.a(x340Var).c.b, qim0VarQ, cr31Var), x340Var, 0);
                x340Var.r(false);
            }
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.r(nim0Var, 12.0f));
            uwo1.e(str, null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mvf(str, z, j, iu30Var, qim0Var, i);
        }
    }

    public static final void c(boolean z, iu30 iu30Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        boolean z2;
        int i2;
        Object ipoVar;
        int i3;
        Boolean bool;
        c9n c9nVar;
        tob1 tob1Var;
        o95 o95Var;
        ven0 ven0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1442406716);
        if ((i & 6) == 0) {
            z2 = z;
            i2 = (x340Var.h(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            int iA = (int) (((crl1) x340Var.k(t4k.u)).a() & 4294967295L);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = c97.b(iA);
                x340Var.s0(objT);
            }
            o95 o95Var2 = (o95) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT2);
            }
            c9n c9nVar2 = (c9n) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(0);
                x340Var.s0(objT3);
            }
            ven0 ven0Var2 = (ven0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT4);
            }
            ven0 ven0Var3 = (ven0) objT4;
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT5);
            }
            tob1 tob1Var2 = (ven0) objT5;
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zI = ((i2 & 14) == 4) | x340Var.i(o95Var2) | x340Var.i(c9nVar2) | x340Var.e(iA);
            Object objT6 = x340Var.T();
            if (zI || objT6 == m4cVar) {
                i3 = i2;
                bool = boolValueOf;
                c9nVar = c9nVar2;
                tob1Var = tob1Var2;
                o95Var = o95Var2;
                ven0Var = ven0Var2;
                ipoVar = new ipo(z2, ven0Var, o95Var, c9nVar, iA, tob1Var, (lnm) null);
                x340Var.s0(ipoVar);
            } else {
                i3 = i2;
                ipoVar = objT6;
                c9nVar = c9nVar2;
                bool = boolValueOf;
                tob1Var = tob1Var2;
                ven0Var = ven0Var2;
                o95Var = o95Var2;
            }
            qxd0.t(bool, x340Var, (vu30) ipoVar);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            Object objT7 = x340Var.T();
            if (objT7 == m4cVar) {
                objT7 = new bzm(ven0Var, (byte) 9);
                x340Var.s0(objT7);
            }
            qim0 qim0VarX = ern1.x(qim0VarF, (iu30) objT7);
            boolean zI2 = x340Var.i(o95Var);
            Object objT8 = x340Var.T();
            if (zI2 || objT8 == m4cVar) {
                objT8 = new wqe(o95Var, (byte) 5);
                x340Var.s0(objT8);
            }
            qim0 qim0VarB = eqr0.B(qim0VarX, (iu30) objT8);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF2 = dug.f(qim0VarB, cbx.a(x340Var).a.a.a(), d4o1.a);
            Boolean bool2 = (Boolean) tob1Var.getValue();
            bool2.getClass();
            boolean zI3 = ((i3 & 112) == 32) | x340Var.i(o95Var) | x340Var.i(c9nVar);
            Object objT9 = x340Var.T();
            if (zI3 || objT9 == m4cVar) {
                lpo lpoVar = new lpo(tob1Var, ven0Var3, o95Var, c9nVar, iu30Var, ven0Var);
                x340Var.s0(lpoVar);
                objT9 = lpoVar;
            }
            qim0 qim0VarB2 = f8d1.b(qim0VarF2, bool2, (PointerInputEventHandler) objT9);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB2);
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
            dv20.l((i3 >> 9) & 14, j2iVar, x340Var, (boolean) r10);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(z, iu30Var, qim0Var, j2iVar, i);
        }
    }

    public static final void d(String str, String str2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1636310315);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Uri uri = Uri.parse(str);
            jsl jslVarC = two1.C(2131962251, (i2 >> 3) & 14, str2, x340Var);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cbx.a.getClass();
            qim0 qim0VarR = d7e.r(uwr.a().a, qim0VarF, false);
            cua cuaVar = cbx.b(x340Var).f;
            eso1.e(uri, jslVarC, i1p1.q(qim0VarR, er31.b(4.0f)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, true, false, x340Var, 0, 6, 3064);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b4((byte) 17, i, str, str2);
        }
    }

    public static final void e(cce cceVar, o0i o0iVar, q9l1 q9l1Var, z0i z0iVar, boolean z, boolean z2, z0i z0iVar2, u7h u7hVar, ew50 ew50Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(445390577);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(cceVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(q9l1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(z0iVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.g(z0iVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.g(u7hVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= (134217728 & i) == 0 ? x340Var.g(ew50Var) : x340Var.i(ew50Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= x340Var.g(qim0Var) ? 536870912 : 268435456;
        }
        if (x340Var.Y(i2 & 1, (306783379 & i2) != 306783378)) {
            kiv kivVar = t4k.h;
            qim0 qim0VarB = u291.b(0.0f, ((wat) x340Var.k(kivVar)).M0(((Rect) q9l1Var.h.d.e).height()), 1, qim0Var);
            x340Var.j0(475845883);
            wat watVar = (wat) x340Var.k(kivVar);
            x340Var.j0(-492369756);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = x0d.o(watVar, x340Var);
            }
            x340Var.r(false);
            ufh0 ufh0Var = (ufh0) objT;
            x340Var.j0(-492369756);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = x0d.m(x340Var);
            }
            x340Var.r(false);
            xhl xhlVar = (xhl) objT2;
            x340Var.j0(-492369756);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT3);
            }
            x340Var.r(false);
            ven0 ven0Var = (ven0) objT3;
            x340Var.j0(-492369756);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = x0d.n(xhlVar, x340Var);
            }
            x340Var.r(false);
            nil nilVar = (nil) objT4;
            x340Var.j0(-492369756);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = bb00.i(rih1.a, f331.X0, x340Var);
            }
            x340Var.r(false);
            ven0 ven0Var2 = (ven0) objT5;
            who1.h(s161.b(qim0VarB, false, new tu(ufh0Var, (byte) 9)), apo.i(x340Var, -1488813576, new l3b(ven0Var2, xhlVar, new su(ven0Var, nilVar, (byte) 5), z0iVar, z0iVar2, q9l1Var, cceVar, o0iVar, z2, z, ew50Var, u7hVar)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 5), x340Var, 48);
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t3d(cceVar, o0iVar, q9l1Var, z0iVar, z, z2, z0iVar2, u7hVar, ew50Var, qim0Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0119  */
    /* JADX WARN: Code duplicated, block: B:101:0x011b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0143  */
    /* JADX WARN: Code duplicated, block: B:107:0x014a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0150  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:112:0x020e  */
    /* JADX WARN: Code duplicated, block: B:114:0x021a  */
    /* JADX WARN: Code duplicated, block: B:116:0x023e  */
    /* JADX WARN: Code duplicated, block: B:118:0x027b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0281  */
    /* JADX WARN: Code duplicated, block: B:122:0x0295  */
    /* JADX WARN: Code duplicated, block: B:124:0x0299  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:97:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0116  */
    public static final void f(int i, hux huxVar, long j, hwi0 hwi0Var, float f, float f2, qim0 qim0Var, Integer num, boolean z, float f3, b0k b0kVar, int i2, int i3) {
        int i4;
        Integer num2;
        int i5;
        int i6;
        boolean z2;
        Integer num3;
        boolean z3;
        h311 h311VarV;
        boolean z4;
        boolean z5;
        Integer num4;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        nim0 nim0Var;
        String strO0;
        Function0 function0;
        int i7;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-851814732);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.e(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.f(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var.g(hwi0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= x340Var.d(f) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= x340Var.d(f2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= x340Var.i(qim0Var) ? 1048576 : 524288;
        }
        int i8 = i3 & 128;
        if (i8 == 0) {
            if ((12582912 & i2) == 0) {
                num2 = num;
                i4 |= x340Var.g(num2) ? 8388608 : 4194304;
            }
            i5 = i3 & 256;
            if (i5 != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (x340Var.h(z)) {
                    i6 = 67108864;
                } else {
                    i6 = 33554432;
                }
                i4 |= i6;
            }
            if ((i2 & 805306368) == 0) {
                if (x340Var.d(f3)) {
                    i7 = 536870912;
                } else {
                    i7 = 268435456;
                }
                i4 |= i7;
            }
            if ((i4 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i4 & 1, z2)) {
                x340Var.d0();
                if ((i2 & 1) != 0 || x340Var.E()) {
                    if (i8 != 0) {
                        num2 = null;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    z5 = z4;
                } else {
                    x340Var.b0();
                    z5 = z;
                }
                num4 = num2;
                x340Var.s();
                mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0Var);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                nim0Var = nim0.a;
                w0h1.a(huxVar, isl.a, u291.r(nim0Var, f3), j, 0L, z5, x340Var, ((i4 >> 3) & 14) | 56 | ((i4 << 3) & 7168) | ((i4 >> 9) & 458752), 16);
                String strG = ydh.g(f, i, x340Var, x340Var, nim0Var);
                uwr uwrVar = cbx.a;
                uwo1.e(strG, null, cbx.d(x340Var).e, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2026);
                if (num4 != null) {
                    v8i0.i(f2, -800372806, x340Var, x340Var, nim0Var);
                    uwo1.e(cwl1.o0(x340Var, num4.intValue()), null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-800097960);
                    x340Var.r(false);
                }
                if (hwi0Var != null) {
                    x340Var.i0(-800063178);
                    strO0 = cwl1.o0(x340Var, 2131961436);
                    cvx cvxVar = cbx.b(x340Var).b;
                    op71.g(x340Var, u291.h(nim0Var, 16.0f));
                    function0 = hwi0Var.a;
                    if (!ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    } else {
                        foo1.c(new gbx(new y50(strO0), function0), jdx.c, null, null, null, null, null, null, null, null, apo.r(792358523, new y5d0(strO0, (byte) 29), x340Var), x340Var, 0, 48, 2044);
                        x340Var.r(false);
                    }
                } else {
                    x340Var.i0(-799753736);
                    x340Var.r(false);
                }
                x340Var.r(true);
                z3 = z5;
                num3 = num4;
            } else {
                x340Var.b0();
                num3 = num2;
                z3 = z;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new g6j0(i, huxVar, j, hwi0Var, f, f2, qim0Var, num3, z3, f3, i2, i3);
            }
        }
        i4 |= 12582912;
        num2 = num;
        i5 = i3 & 256;
        if (i5 != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (x340Var.h(z)) {
                i6 = 67108864;
            } else {
                i6 = 33554432;
            }
            i4 |= i6;
        }
        if ((i2 & 805306368) == 0) {
            if (x340Var.d(f3)) {
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i4 |= i7;
        }
        if ((i4 & 306783379) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i4 & 1, z2)) {
            x340Var.d0();
            if ((i2 & 1) != 0) {
                if (i8 != 0) {
                    num2 = null;
                }
                if (i5 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                z5 = z4;
            } else {
                if (i8 != 0) {
                    num2 = null;
                }
                if (i5 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                z5 = z4;
            }
            num4 = num2;
            x340Var.s();
            mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a != null) {
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
            nim0Var = nim0.a;
            w0h1.a(huxVar, isl.a, u291.r(nim0Var, f3), j, 0L, z5, x340Var, ((i4 >> 3) & 14) | 56 | ((i4 << 3) & 7168) | ((i4 >> 9) & 458752), 16);
            String strG2 = ydh.g(f, i, x340Var, x340Var, nim0Var);
            uwr uwrVar2 = cbx.a;
            uwo1.e(strG2, null, cbx.d(x340Var).e, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2026);
            if (num4 != null) {
                v8i0.i(f2, -800372806, x340Var, x340Var, nim0Var);
                uwo1.e(cwl1.o0(x340Var, num4.intValue()), null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
                x340Var.r(false);
            } else {
                x340Var.i0(-800097960);
                x340Var.r(false);
            }
            if (hwi0Var != null) {
                x340Var.i0(-800063178);
                strO0 = cwl1.o0(x340Var, 2131961436);
                cvx cvxVar2 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 16.0f));
                function0 = hwi0Var.a;
                if (!ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    foo1.c(new gbx(new y50(strO0), function0), jdx.c, null, null, null, null, null, null, null, null, apo.r(792358523, new y5d0(strO0, (byte) 29), x340Var), x340Var, 0, 48, 2044);
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(-799753736);
                x340Var.r(false);
            }
            x340Var.r(true);
            z3 = z5;
            num3 = num4;
        } else {
            x340Var.b0();
            num3 = num2;
            z3 = z;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g6j0(i, huxVar, j, hwi0Var, f, f2, qim0Var, num3, z3, f3, i2, i3);
        }
    }

    public static final void g(k8t0 k8t0Var, iu30 iu30Var, xfx xfxVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1357015920);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(k8t0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(xfxVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            irn1.u(null, null, null, null, apo.r(-616588023, new hho0(k8t0Var, iu30Var, xfxVar), x340Var), x340Var, 24576, 15);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(i, k8t0Var, iu30Var, xfxVar, qim0Var2, (byte) 2);
        }
    }

    public static final void h(k8t0 k8t0Var, iu30 iu30Var, xfx xfxVar, vzq0 vzq0Var, b0k b0kVar, int i) {
        int i2;
        k8t0 k8t0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-990573203);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(k8t0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(xfxVar) ? 256 : 128;
        }
        int i3 = i & 3072;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(vzq0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new v7t0(xfxVar, iu30Var);
                x340Var.s0(objT);
            }
            v7t0 v7t0Var = (v7t0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new d7u(xfxVar, iu30Var);
                x340Var.s0(objT2);
            }
            d7u d7uVar = (d7u) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = new bka(xfxVar, iu30Var);
                x340Var.s0(objT3);
            }
            bka bkaVar = (bka) objT3;
            qim0 qim0VarW = uyn1.w(l6o1.H(nim0Var, l6o1.C(0, 0, 1, x340Var), false, 14), vzq0Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarW);
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
            int i4 = (i2 << 3) & 112;
            k8t0Var2 = k8t0Var;
            otw.c(bkaVar, k8t0Var2, (qim0) null, (ipb1) null, x340Var, i4, 12);
            otw.c(v7t0Var, k8t0Var2, (qim0) null, (ipb1) null, x340Var, i4, 12);
            otw.c(d7uVar, k8t0Var2, (qim0) null, (ipb1) null, x340Var, i4, 12);
            x340Var.r(true);
        } else {
            k8t0Var2 = k8t0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(k8t0Var2, iu30Var, xfxVar, vzq0Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x0119  */
    /* JADX WARN: Code duplicated, block: B:71:0x0120  */
    /* JADX WARN: Code duplicated, block: B:72:0x0126  */
    /* JADX WARN: Code duplicated, block: B:75:0x0189  */
    /* JADX WARN: Code duplicated, block: B:76:0x018c  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void i(String str, String str2, String str3, qim0 qim0Var, boolean z, vu30 vu30Var, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        vu30 vu30Var2;
        int i5;
        int i6;
        boolean z3;
        boolean z4;
        vu30 vu30Var3;
        h311 h311VarV;
        boolean z5;
        vu30 vu30VarR;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        float f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2096369206);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                i3 |= x340Var.h(z2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    vu30Var2 = vu30Var;
                    if (x340Var.i(vu30Var2)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                i6 = i3;
                if ((i6 & 74899) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i6 & 1, z3)) {
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i4 != 0) {
                        vu30VarR = apo.r(1952070704, new b4(str, str2, (byte) 18), x340Var);
                    } else {
                        vu30VarR = vu30Var2;
                    }
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    cua cuaVar = cbx.b(x340Var).f;
                    qim0 qim0VarX = uyn1.x(dug.f(i1p1.q(u291.f(qim0Var, 1.0f), er31.b(8.0f)), u7h.b(u7h.b, 0.6f, 0.0f, 0.0f, 0.0f, 14), d4o1.a), 8.0f);
                    mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarX);
                    hzj.A.getClass();
                    if (x340Var.a != null) {
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
                    vu30VarR.invoke(x340Var, Integer.valueOf((i6 >> 15) & 14));
                    nim0 nim0Var = nim0.a;
                    lee1 lee1Var = kk0.p(nim0Var, 8.0f, x340Var, x340Var).k;
                    long j = u7h.f;
                    vu30 vu30Var4 = vu30VarR;
                    uwo1.e(str2, null, lee1Var, j, null, null, 2, false, new cjc0(2), 0, null, x340Var, ((i6 >> 3) & 14) | 1575936, 0, 1714);
                    if (z5) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    uwo1.e(str3, d9y0.k(nim0Var, f), cbx.d(x340Var).j, u7h.b(j, 0.7f, 0.0f, 0.0f, 0.0f, 14), null, null, 2, false, new cjc0(2), 0, null, x340Var, ((i6 >> 6) & 14) | 1575936, 0, 1712);
                    zov0 zov0Var = ywx0.k(nim0Var, 8.0f, x340Var, x340Var).g;
                    zpn1.f(u291.h(nim0Var, 12.0f), 0L, x340Var, 0, 2);
                    x340Var.r(true);
                    z4 = z5;
                    vu30Var3 = vu30Var4;
                } else {
                    x340Var.b0();
                    z4 = z2;
                    vu30Var3 = vu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yc5(str, str2, str3, qim0Var, z4, vu30Var3, i, i2);
                }
            }
            i3 |= 196608;
            vu30Var2 = vu30Var;
            i6 = i3;
            if ((i6 & 74899) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i6 & 1, z3)) {
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i4 != 0) {
                    vu30VarR = apo.r(1952070704, new b4(str, str2, (byte) 18), x340Var);
                } else {
                    vu30VarR = vu30Var2;
                }
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                cua cuaVar2 = cbx.b(x340Var).f;
                qim0 qim0VarX2 = uyn1.x(dug.f(i1p1.q(u291.f(qim0Var, 1.0f), er31.b(8.0f)), u7h.b(u7h.b, 0.6f, 0.0f, 0.0f, 0.0f, 14), d4o1.a), 8.0f);
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarX2);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                vu30VarR.invoke(x340Var, Integer.valueOf((i6 >> 15) & 14));
                nim0 nim0Var2 = nim0.a;
                lee1 lee1Var2 = kk0.p(nim0Var2, 8.0f, x340Var, x340Var).k;
                long j2 = u7h.f;
                vu30 vu30Var5 = vu30VarR;
                uwo1.e(str2, null, lee1Var2, j2, null, null, 2, false, new cjc0(2), 0, null, x340Var, ((i6 >> 3) & 14) | 1575936, 0, 1714);
                if (z5) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                uwo1.e(str3, d9y0.k(nim0Var2, f), cbx.d(x340Var).j, u7h.b(j2, 0.7f, 0.0f, 0.0f, 0.0f, 14), null, null, 2, false, new cjc0(2), 0, null, x340Var, ((i6 >> 6) & 14) | 1575936, 0, 1712);
                zov0 zov0Var2 = ywx0.k(nim0Var2, 8.0f, x340Var, x340Var).g;
                zpn1.f(u291.h(nim0Var2, 12.0f), 0L, x340Var, 0, 2);
                x340Var.r(true);
                z4 = z5;
                vu30Var3 = vu30Var5;
            } else {
                x340Var.b0();
                z4 = z2;
                vu30Var3 = vu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new yc5(str, str2, str3, qim0Var, z4, vu30Var3, i, i2);
            }
        }
        i3 |= 24576;
        z2 = z;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                vu30Var2 = vu30Var;
                if (x340Var.i(vu30Var2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            i6 = i3;
            if ((i6 & 74899) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i6 & 1, z3)) {
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i4 != 0) {
                    vu30VarR = apo.r(1952070704, new b4(str, str2, (byte) 18), x340Var);
                } else {
                    vu30VarR = vu30Var2;
                }
                uwr uwrVar3 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var).b;
                cua cuaVar3 = cbx.b(x340Var).f;
                qim0 qim0VarX3 = uyn1.x(dug.f(i1p1.q(u291.f(qim0Var, 1.0f), er31.b(8.0f)), u7h.b(u7h.b, 0.6f, 0.0f, 0.0f, 0.0f, 14), d4o1.a), 8.0f);
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarX3);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                vu30VarR.invoke(x340Var, Integer.valueOf((i6 >> 15) & 14));
                nim0 nim0Var3 = nim0.a;
                lee1 lee1Var3 = kk0.p(nim0Var3, 8.0f, x340Var, x340Var).k;
                long j3 = u7h.f;
                vu30 vu30Var6 = vu30VarR;
                uwo1.e(str2, null, lee1Var3, j3, null, null, 2, false, new cjc0(2), 0, null, x340Var, ((i6 >> 3) & 14) | 1575936, 0, 1714);
                if (z5) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                uwo1.e(str3, d9y0.k(nim0Var3, f), cbx.d(x340Var).j, u7h.b(j3, 0.7f, 0.0f, 0.0f, 0.0f, 14), null, null, 2, false, new cjc0(2), 0, null, x340Var, ((i6 >> 6) & 14) | 1575936, 0, 1712);
                zov0 zov0Var3 = ywx0.k(nim0Var3, 8.0f, x340Var, x340Var).g;
                zpn1.f(u291.h(nim0Var3, 12.0f), 0L, x340Var, 0, 2);
                x340Var.r(true);
                z4 = z5;
                vu30Var3 = vu30Var6;
            } else {
                x340Var.b0();
                z4 = z2;
                vu30Var3 = vu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new yc5(str, str2, str3, qim0Var, z4, vu30Var3, i, i2);
            }
        }
        i3 |= 196608;
        vu30Var2 = vu30Var;
        i6 = i3;
        if ((i6 & 74899) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i6 & 1, z3)) {
            if (i7 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (i4 != 0) {
                vu30VarR = apo.r(1952070704, new b4(str, str2, (byte) 18), x340Var);
            } else {
                vu30VarR = vu30Var2;
            }
            uwr uwrVar4 = cbx.a;
            cvx cvxVar4 = cbx.b(x340Var).b;
            cua cuaVar4 = cbx.b(x340Var).f;
            qim0 qim0VarX4 = uyn1.x(dug.f(i1p1.q(u291.f(qim0Var, 1.0f), er31.b(8.0f)), u7h.b(u7h.b, 0.6f, 0.0f, 0.0f, 0.0f, 14), d4o1.a), 8.0f);
            mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarX4);
            hzj.A.getClass();
            if (x340Var.a != null) {
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
            vu30VarR.invoke(x340Var, Integer.valueOf((i6 >> 15) & 14));
            nim0 nim0Var4 = nim0.a;
            lee1 lee1Var4 = kk0.p(nim0Var4, 8.0f, x340Var, x340Var).k;
            long j4 = u7h.f;
            vu30 vu30Var7 = vu30VarR;
            uwo1.e(str2, null, lee1Var4, j4, null, null, 2, false, new cjc0(2), 0, null, x340Var, ((i6 >> 3) & 14) | 1575936, 0, 1714);
            if (z5) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            uwo1.e(str3, d9y0.k(nim0Var4, f), cbx.d(x340Var).j, u7h.b(j4, 0.7f, 0.0f, 0.0f, 0.0f, 14), null, null, 2, false, new cjc0(2), 0, null, x340Var, ((i6 >> 6) & 14) | 1575936, 0, 1712);
            zov0 zov0Var4 = ywx0.k(nim0Var4, 8.0f, x340Var, x340Var).g;
            zpn1.f(u291.h(nim0Var4, 12.0f), 0L, x340Var, 0, 2);
            x340Var.r(true);
            z4 = z5;
            vu30Var3 = vu30Var7;
        } else {
            x340Var.b0();
            z4 = z2;
            vu30Var3 = vu30Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yc5(str, str2, str3, qim0Var, z4, vu30Var3, i, i2);
        }
    }

    public static final void j(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        long jB;
        long jB2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1327537783);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | 384 | (x340Var.i(function0) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            ven0 ven0VarM = k1u.m(idn0Var, x340Var, 0);
            if (z) {
                jB = ((Boolean) ven0VarM.getValue()).booleanValue() ? u7h.b(u7h.f, 0.16f, 0.0f, 0.0f, 0.0f, 14) : u7h.b(u7h.f, 0.1f, 0.0f, 0.0f, 0.0f, 14);
            } else {
                jB = u7h.b(u7h.f, 0.05f, 0.0f, 0.0f, 0.0f, 14);
            }
            if (z) {
                x340Var.i0(-158506771);
                uwr uwrVar = cbx.a;
                jB2 = cbx.a(x340Var).b.a;
            } else {
                x340Var.i0(-158505605);
                uwr uwrVar2 = cbx.a;
                jB2 = u7h.b(cbx.a(x340Var).b.a, 0.4f, 0.0f, 0.0f, 0.0f, 14);
            }
            x340Var.r(false);
            cr31 cr31Var = er31.a;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarW = uyn1.w(bin.v(dug.f(i1p1.q(qim0Var3, cr31Var), jB, d4o1.a), idn0Var, null, z, null, null, function0, 24), new zzq0(12.0f, 8.0f, 12.0f, 8.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarW);
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
            uwo1.e(str, null, cbx.d(x340Var).j, jB2, null, null, 0, false, new cjc0(1), 0, null, x340Var, i2 & 14, 0, 1778);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pfg(str, z, qim0Var2, function0, i, (byte) 10);
        }
    }

    public static final void k(String str, String str2, Uri uri, Float f, boolean z, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1366187338);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.g(uri) ? 256 : 128) | (b0kVar3.g(f) ? 2048 : 1024) | (b0kVar3.h(z) ? 16384 : 8192) | (b0kVar3.i(function0) ? 131072 : 65536);
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = d6d1.T0;
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(nim0.a, true, (iu30) objT);
            if (f != null) {
                b0kVar3.i0(978223208);
                j2iVarR = apo.r(1047160581, new n8k0(f, z, function0, (byte) 16), b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(978521986);
                b0kVar3.r(false);
                j2iVarR = null;
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarB, null, null, false, null, null, null, null, null, apo.r(1862532723, new k0c0(uri, (byte) 3), b0kVar3), jmj.b, apo.r(-1510843118, new dba1(str2, (byte) 3), b0kVar3), j2iVarR, null, null, apo.r(-2006779506, new dba1(str, (byte) 4), b0kVar3), b0kVar2, 805306368, 196662, 25086);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1(str, str2, (Comparable) uri, (Object) f, z, (cv30) function0, i, (byte) 26);
        }
    }

    public static final void r(int i, int i2) {
        if (i < 0 || i >= i2) {
            eg.g(cy30.i(i, "index: ", i2, ", size: "));
        }
    }

    public static final void s(int i, int i2) {
        if (i < 0 || i > i2) {
            eg.g(cy30.i(i, "index: ", i2, ", size: "));
        }
    }

    public static final void t(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            k220.e(i3, cy30.q(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            hhg1.n(cy30.i(i, "fromIndex: ", i2, " > toIndex: "));
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    public static final rzc u(List list, rzc rzcVar, dc11 dc11Var, boolean z) {
        List parameters = dc11Var.getParameters();
        if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                if (bpi1.h(((hc11) it.next()).t())) {
                }
            }
            if (!bpi1.h(dc11Var.getReturnType())) {
                return rzcVar;
            }
        } else if (!bpi1.h(dc11Var.getReturnType())) {
            return rzcVar;
        }
        return new jsi1(list, rzcVar, dc11Var, z);
    }

    public static final String x(Map map) {
        Object next;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (nhc1.Y((String) next, "group_id_", false)) {
                return (String) next;
            }
        }
        next = null;
        return (String) next;
    }

    public static final Method y(Class cls, dc11 dc11Var) {
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            declaredMethod.getClass();
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            eqg.c("No unbox method found in inline class: ", cls, " (calling ", dc11Var);
            return null;
        }
    }

    public static final go80 z(klm klmVar, obp0 obp0Var, obp0 obp0Var2, sbp0 sbp0Var, sap0 sap0Var, obp0 obp0Var3, sbp0 sbp0Var2, sbp0 sbp0Var3, sbp0 sbp0Var4) {
        return klmVar.a("EngageContinuationClusterDaemon", new dbp0(obp0Var, obp0Var2, sbp0Var, sap0Var, obp0Var3, sbp0Var2, sbp0Var3, sbp0Var4, (byte) 1));
    }

    public abstract yxo1 A(int i, String str);

    public abstract boolean B();

    public abstract yxo1 E(String str, long[] jArr);

    public abstract yxo1 F(long j, String str);

    public abstract yxo1 G(String str, Parcelable parcelable);

    public abstract yxo1 I(String str, Serializable serializable);

    public abstract yxo1 J(String str, String str2);

    public abstract tc70 K(String str, String[] strArr);

    public yxo1 l(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        if (B()) {
            return hubsImmutableComponentBundle.a;
        }
        for (String str : hubsImmutableComponentBundle.s()) {
            Object objJ = hubsImmutableComponentBundle.j(str);
            if (objJ instanceof Serializable) {
                this = this.I(str, (Serializable) objJ);
            } else if (objJ instanceof Parcelable) {
                this = this.G(str, (Parcelable) objJ);
            } else if (objJ != null) {
                eg.f(cy30.j(objJ.getClass(), "Invalid type "));
                return null;
            }
        }
        return this;
    }

    public abstract yxo1 m(String str, boolean z);

    public abstract yxo1 n(String str, boolean[] zArr);

    public abstract HubsImmutableComponentBundle o();

    public abstract yxo1 p(HubsImmutableComponentBundle hubsImmutableComponentBundle, String str);

    public abstract yxo1 q(String str, HubsImmutableComponentBundle[] hubsImmutableComponentBundleArr);

    public abstract yxo1 v(String str, double[] dArr);

    public abstract yxo1 w(String str, double d);
}
