package p;

import android.net.Uri;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class o0p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(boolean z, boolean z2, c380 c380Var, oa0 oa0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1707317832);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.g(c380Var) ? 256 : 128) | (x340Var.i(oa0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            hap1.c(z2, z ? sgc1.u(1.0f, 0.0f) : sgc1.u(0.0f, 0.0f), apo.r(-1901222139, new wf((Object) oa0Var, (Object) c380Var, (byte) 6), x340Var), x340Var, ((i2 >> 3) & 14) | 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pa0(z, z2, (Object) c380Var, (Object) oa0Var, i, (byte) 0);
        }
    }

    public static final void b(jsl jslVar, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(721599628);
        int i2 = (x340Var.g(jslVar) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gux guxVar = gux.c;
            qim0 qim0VarR = u291.r(nim0.a, 16.0f);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new in00(function0, (byte) 29);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarR, false, null, null, null, (Function0) objT, 15);
            uwr uwrVar = cbx.a;
            w0h1.a(guxVar, jslVar, qim0VarX, 0L, ((vex) zex.a.b).a, true, x340Var, 196608 | gux.d | ((i2 << 3) & 112), 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xh00((Object) jslVar, (Object) function0, i, (byte) 9);
        }
    }

    public static final void c(e920 e920Var, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1487468813);
        int i2 = (b0kVar3.g(e920Var) ? 4 : 2) | i | (b0kVar3.i(iu30Var) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(b0kVar3, 2131956226);
            qim0 qim0VarN = anm1.N("filter-chip-concept", nim0.a);
            boolean z = e920Var.b;
            if (z) {
                b0kVar3.i0(2006256693);
                j2iVarR = apo.r(980403187, new d720(iu30Var, (byte) 2), b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(2006570847);
                b0kVar3.r(false);
                j2iVarR = null;
            }
            j2i j2iVar = j2iVarR;
            boolean z2 = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new y720(iu30Var, (byte) 3);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            dem1.d((Function0) objT, qim0VarN, strO0, 0, 0, 0L, 0.0f, z, false, 1, (vu30) null, j2iVar, (idn0) null, apo.r(147681127, new rr10(e920Var, (byte) 4), b0kVar3), b0kVar2, 805306368, 3072, 5496);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new xh00((Object) e920Var, (Object) iu30Var, i, (byte) 10);
        }
    }

    public static final void d(f920 f920Var, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1772162283);
        int i2 = (b0kVar3.g(f920Var) ? 4 : 2) | i | (b0kVar3.i(iu30Var) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(b0kVar3, 2131954835);
            qim0 qim0VarN = anm1.N("filter-chip-date", nim0.a);
            boolean z = f920Var.b;
            if (z) {
                b0kVar3.i0(-748148943);
                j2iVarR = apo.r(-600219013, new d720(iu30Var, (byte) 3), b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-747838633);
                b0kVar3.r(false);
                j2iVarR = null;
            }
            j2i j2iVar = j2iVarR;
            boolean z2 = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new y720(iu30Var, (byte) 5);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            dem1.d((Function0) objT, qim0VarN, strO0, 0, 0, 0L, 0.0f, z, false, 1, (vu30) null, j2iVar, (idn0) null, apo.r(2135536879, new rr10(f920Var, (byte) 5), b0kVar3), b0kVar2, 805306368, 3072, 5496);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new xh00((Object) f920Var, (Object) iu30Var, i, (byte) 11);
        }
    }

    public static final void e(m920 m920Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1530827318);
        int i2 = i | (x340Var.g(m920Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            zzq0 zzq0VarH = uyn1.h(3, 0.0f, 0.0f);
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new zf10(m920Var, iu30Var, (byte) 8);
                x340Var.s0(objT);
            }
            ujo1.e(qim0VarF, null, zzq0VarH, d36Var, fraVar, null, false, null, (iu30) objT, x340Var, 0, 458);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx00((byte) 10, i, m920Var, qim0Var2, iu30Var);
        }
    }

    public static final void f(String str, LocalDateTime localDateTime, ZoneId zoneId, Locale locale, String str2, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1596698470);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (b0kVar3.g(localDateTime) ? 32 : 16) | (b0kVar3.i(zoneId) ? 256 : 128) | (b0kVar3.g(locale) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.g(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 131072 : 65536;
        }
        int i4 = i3 | 1572864;
        if (b0kVar3.Y(i4 & 1, (599187 & i4) != 599186)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("lp-carousel-card", u291.v(qim0Var3, 160.0f));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            ydx ydxVar = new ydx(2.0f, 12.0f, 8.0f, new zzq0(8.0f, 8.0f, 8.0f, 8.0f));
            String strO0 = cwl1.o0(b0kVar3, 2131957471);
            boolean z = (i4 & 458752) == 131072;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new ijd0(iu30Var, (byte) 1);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                qim0Var2 = qim0Var3;
                b0kVar2 = b0kVar3;
                ioo1.c(qim0VarN, null, ydxVar, null, null, null, null, new gbx(new y50(strO0), function0), null, apo.r(1433812449, new h6a0(str, localDateTime, (byte) 11), b0kVar3), null, apo.r(-789034176, new cy00(localDateTime, zoneId, locale, (byte) 24), b0kVar3), gwi.a, null, null, null, apo.r(-825714533, new z3y(str2, (byte) 21), b0kVar3), b0kVar2, 805306880, 1573296, 58746);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kt3((Object) str, (Object) localDateTime, (Object) zoneId, (Object) locale, (Object) str2, (Object) iu30Var, (Object) qim0Var2, i, (byte) 8);
        }
    }

    public static final void g(k920 k920Var, iu30 iu30Var, b0k b0kVar, int i) {
        long j;
        l920 l920Var = k920Var.a;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(212076573);
        int i2 = (x340Var.g(k920Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            m0p1 m0p1Var = l920Var.a;
            boolean z = m0p1Var instanceof j920;
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(76501157);
                String strO0 = cwl1.o0(x340Var, 2131953515);
                if (l920Var.b == 2) {
                    x340Var.i0(77203183);
                    uwr uwrVar = cbx.a;
                    j = cbx.a(x340Var).b.e;
                    x340Var.r(false);
                } else {
                    x340Var.i0(77262362);
                    x340Var.r(false);
                    j = u7h.j;
                }
                qim0 qim0VarN = anm1.N("filter-chip-location-home", nim0Var);
                boolean z2 = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z2 || objT == m4cVar) {
                    objT = new y720(iu30Var, (byte) 7);
                    x340Var.s0(objT);
                }
                dem1.d((Function0) objT, qim0VarN, strO0, 0, 0, j, 0.0f, false, false, 0, apo.r(1432101884, new n920(k920Var, (byte) 0), x340Var), (vu30) null, (idn0) null, apo.r(-757061633, new n920(k920Var, (byte) 1), x340Var), x340Var, 0, 3078, 7128);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                if (!(m0p1Var instanceof i920)) {
                    throw p3d1.k(x340Var, 1942128535, false);
                }
                x340Var.i0(77531907);
                String strO1 = cwl1.o0(x340Var, 2131953515);
                qim0 qim0VarN2 = anm1.N("filter-chip-location-browse", nim0Var);
                boolean z3 = (i2 & 112) == 32;
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new y720(iu30Var, (byte) 8);
                    x340Var.s0(objT2);
                }
                dem1.d((Function0) objT2, qim0VarN2, strO1, 0, 0, 0L, 0.0f, true, false, 0, (vu30) null, apo.r(326838708, new d720(iu30Var, (byte) 4), x340Var), (idn0) null, apo.r(825395510, new n920(k920Var, (byte) 2), x340Var), x340Var, 12582912, 3120, 6008);
                x340Var = x340Var;
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xh00((Object) k920Var, (Object) iu30Var, i, (byte) 12);
        }
    }

    public static final void h(String str, String str2, imt0 imt0Var, Function0 function0, qim0 qim0Var, Function0 function1, String str3, u7h u7hVar, u7h u7hVar2, u7h u7hVar3, String str4, t650 t650Var, vu30 vu30Var, vu30 vu30Var2, b0k b0kVar, int i) {
        vu30 vu30Var3;
        x340 x340Var;
        tl3 tl3Var;
        boolean z;
        boolean z2;
        long j;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        tl3 tl3Var2 = een.d;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(614517131);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.g(imt0Var) ? 256 : 128) | (x340Var2.i(function0) ? 2048 : 1024) | (x340Var2.i(qim0Var) ? 16384 : 8192) | (x340Var2.i(function1) ? 131072 : 65536) | (x340Var2.g(str3) ? 1048576 : 524288) | (x340Var2.g(u7hVar) ? 8388608 : 4194304) | (x340Var2.g(u7hVar2) ? 67108864 : 33554432) | (x340Var2.g(u7hVar3) ? 536870912 : 268435456);
        int i3 = 3456 | (x340Var2.g(str4) ? 4 : 2) | (x340Var2.i(t650Var) ? 32 : 16);
        if (x340Var2.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 1171) == 1170) ? false : true)) {
            String strY0 = o7h.y0(f46.i0(new String[]{(str3 == null || str3.length() <= 0) ? null : str3, str, (str2 == null || str2.length() <= 0) ? null : str2}), ", ", (String) null, (String) null, (iu30) null, 62);
            uwr uwrVar = cbx.a;
            cbx.a.getClass();
            qim0 qim0VarR = d7e.r(uwr.d().a, qim0Var, false);
            boolean zG = x340Var2.g(strY0);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new atp0(strY0, (byte) 24);
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarR, false, (iu30) objT);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = ktd.n(x340Var2);
            }
            qim0 qim0VarY = bin.y(qim0VarB, (idn0) objT2, jtr.c, false, null, null, null, function1, function0, 444);
            cua cuaVar = cbx.b(x340Var2).f;
            qim0 qim0VarQ = i1p1.q(qim0VarY, er31.b(8.0f));
            gfh0 gfh0VarC = t1c.c(tl3Var2, false);
            tl3 tl3Var3 = tl3Var2;
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarQ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z3 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar4);
            nko1.H(xos0VarM, x340Var2, lljVar3);
            x0d.q(iHashCode, x340Var2, lljVar2, x340Var2);
            nko1.H(qim0VarE, x340Var2, lljVar);
            qim0 qim0Var2 = nim0.a;
            h0p1.i(imt0Var, u291.d(qim0Var2, 1.0f), x340Var2, (i2 >> 6) & 14);
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarD);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar4);
            nko1.H(xos0VarM2, x340Var2, lljVar3);
            x0d.q(iHashCode2, x340Var2, lljVar2, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar);
            pbh pbhVar = pbh.a;
            if (t650Var != null) {
                x340Var2.i0(1139897292);
                qim0 qim0VarF = u291.f(pbhVar.a(1.0f, qim0Var2, true), 1.0f);
                ArrayList<r650> arrayList = t650Var.a;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (r650 r650Var : arrayList) {
                    arrayList2.add(new mmr0(Float.valueOf(r650Var.b), new u7h(r650Var.a)));
                    tl3Var3 = tl3Var3;
                }
                tl3Var = tl3Var3;
                mmr0[] mmr0VarArr = (mmr0[]) arrayList2.toArray(new mmr0[0]);
                t1c.a(dug.e(qim0VarF, v9c.t((mmr0[]) Arrays.copyOf(mmr0VarArr, mmr0VarArr.length), 0.0f, Float.POSITIVE_INFINITY, 8), null, 0.0f, 6), x340Var2, 0);
                x340Var2.r(false);
            } else {
                tl3Var = tl3Var3;
                x340Var2.i0(1140281103);
                t1c.a(u291.f(pbhVar.a(1.0f, qim0Var2, true), 1.0f), x340Var2, 0);
                x340Var2.r(false);
            }
            qim0 qim0VarB2 = uyn1.B(dug.f(u291.f(qim0Var2, 1.0f), t650Var != null ? ((r650) o7h.A0(t650Var.a)).a : u7h.j, d4o1.a), 16.0f, 0.0f, 16.0f, 16.0f, 2);
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.O0, x340Var2, 0);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarB2);
            hzj.A.getClass();
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar4);
            nko1.H(xos0VarM3, x340Var2, lljVar3);
            x0d.q(iHashCode3, x340Var2, lljVar2, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar);
            pw31 pw31Var = pw31.a;
            int i4 = i2 >> 12;
            tl3 tl3Var4 = tl3Var;
            l0o1.d(str, str2, pw31Var.a(1.0f, qim0Var2, true), str4, u7hVar2, u7hVar3, x340Var2, (i2 & 126) | ((i3 << 9) & 7168) | (57344 & i4) | (i4 & 458752));
            qim0 qim0VarC = eqr0.C(qim0Var2, 4.0f, 4.0f);
            gfh0 gfh0VarC2 = t1c.c(tl3Var4, false);
            int iHashCode4 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM4 = x340Var2.m();
            qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarC);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar4);
            nko1.H(xos0VarM4, x340Var2, lljVar3);
            x0d.q(iHashCode4, x340Var2, lljVar2, x340Var2);
            nko1.H(qim0VarE4, x340Var2, lljVar);
            vu30Var.invoke(x340Var2, 6);
            x340Var2.r(true);
            x340Var2.r(true);
            x340Var2.r(true);
            qim0 qim0VarA = h2c.a.a(u291.f(qim0Var2, 1.0f), tl3Var4);
            jw31 jw31VarA2 = ew31.a(h36.a, een.Z, x340Var2, 0);
            int iHashCode5 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM5 = x340Var2.m();
            qim0 qim0VarE5 = zr7.E(x340Var2, qim0VarA);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA2, x340Var2, lljVar4);
            nko1.H(xos0VarM5, x340Var2, lljVar3);
            x0d.q(iHashCode5, x340Var2, lljVar2, x340Var2);
            nko1.H(qim0VarE5, x340Var2, lljVar);
            if (str3 == null || str3.length() == 0) {
                x340Var = x340Var2;
                z = true;
                x340Var.i0(-300379191);
                op71.g(x340Var, pw31Var.a(1.0f, qim0Var2, true));
                x340Var.r(false);
            } else {
                x340Var2.i0(-300785694);
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var2).n;
                if (u7hVar == null) {
                    x340Var2.i0(405943781);
                    j = cbx.a(x340Var2).b.a;
                    z2 = false;
                    x340Var2.r(false);
                } else {
                    z2 = false;
                    x340Var2.i0(405942603);
                    x340Var2.r(false);
                    j = u7hVar.a;
                }
                boolean z4 = z2;
                z = true;
                uwo1.e(str3, uyn1.B(pw31Var.a(1.0f, qim0Var2, true), 16.0f, 20.0f, 0.0f, 0.0f, 12), lee1Var, j, null, null, 2, false, new cjc0(1), 0, null, x340Var2, (i2 >> 18) & 14, 0, 1712);
                x340Var = x340Var2;
                ab80.p(qim0Var2, 12.0f, x340Var, z4);
            }
            vu30Var3 = vu30Var2;
            vu30Var3.invoke(x340Var, 6);
            x340Var.r(z);
            x340Var.r(z);
        } else {
            vu30Var3 = vu30Var2;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new woq0(str, str2, imt0Var, function0, qim0Var, function1, str3, u7hVar, u7hVar2, u7hVar3, str4, t650Var, vu30Var, vu30Var3, i);
        }
    }

    public static final s511 i(String str) {
        return new s511(str);
    }

    public static final void j(Logger logger, yrd1 yrd1Var, hsd1 hsd1Var, String str) {
        logger.fine(hsd1Var.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + yrd1Var.a);
    }

    public static final int k(String str) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        v5b1 v5b1Var = s4b1VarX.d;
        if (v5b1Var != null) {
            if (v5b1Var.a() != 1) {
                return 2;
            }
        } else {
            if (s4b1VarX.c == blc0.o6) {
                return 3;
            }
            Uri uri = Uri.parse(str);
            List<String> pathSegments = uri.getPathSegments();
            if (u890.j(pathSegments != null ? (String) o7h.s0(pathSegments) : null, "internal") || u890.j(uri.getHost(), "internal") || nhc1.Y(str, "spotify:internal:", false)) {
                return 2;
            }
        }
        return 1;
    }

    public static x2p l(x390 x390Var, iac0 iac0Var) {
        iac0Var.getClass();
        return new x2p(x390Var, iac0Var);
    }

    public static final String m(long j) {
        String strH;
        if (j <= -999500000) {
            strH = pze0.h((j - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j <= -999500) {
            strH = pze0.h((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            strH = pze0.h((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            strH = pze0.h((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            strH = pze0.h((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            strH = pze0.h((j + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strH}, 1));
    }

    public static m4j1 n(String str) {
        try {
            List listQ0 = ihc1.Q0(str, new String[]{"."}, 0, 6);
            int size = listQ0.size();
            if (3 > size || size >= 5) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            List list = listQ0;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            return new m4j1(((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue(), ((Number) arrayList.get(2)).intValue(), (Integer) o7h.t0(3, arrayList));
        } catch (Exception unused) {
            return null;
        }
    }

    public static final go80 o(klm klmVar, xbp0 xbp0Var, rbp0 rbp0Var) {
        return klmVar.a("NonServiceStartingIntentSenderDaemon", new rap0(xbp0Var, rbp0Var, (byte) 23));
    }

    public static boolean p(xz4 xz4Var) {
        return xz4Var.a();
    }

    public static final wb71 q(sge0 sge0Var, qb71 qb71Var) {
        return new wb71(new rb71(sge0Var.b, qb71Var), sge0Var.c, sge0Var.d);
    }

    public static final bc71 r(bc71 bc71Var, sge0 sge0Var) {
        if (sge0Var == null) {
            return bc71Var;
        }
        oge0 oge0Var = sge0Var.a;
        if (oge0Var instanceof oge0) {
            oge0 oge0Var2 = oge0Var;
            float f = sge0Var.b;
            mb71 mb71Var = new mb71(oge0Var2.a, oge0Var2.b);
            return bc71Var instanceof yb71 ? yb71.j((yb71) bc71Var, new rb71(f, mb71Var)) : q(sge0Var, mb71Var);
        }
        if (oge0Var instanceof pge0) {
            return q(sge0Var, new nb71(((pge0) oge0Var).a));
        }
        if (oge0Var instanceof qge0) {
            return q(sge0Var, new pb71(((qge0) oge0Var).a));
        }
        eg.o();
        return null;
    }

    public static final qo90 s(qo90 qo90Var, Map map) {
        List<po90> list = qo90Var.d;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (po90 po90VarA : list) {
            boolean z = po90VarA.e;
            String str = po90VarA.b;
            if (!z) {
                nv21 nv21Var = (pv21) map.get(str);
                if (nv21Var instanceof nv21) {
                    nv21 nv21Var2 = nv21Var;
                    po90VarA = po90.a(po90VarA, nv21Var2.a, nv21Var2.b);
                } else if (nv21Var instanceof ov21) {
                    po90VarA = po90.a(po90VarA, str, (String) null);
                } else if (!(nv21Var instanceof mv21) && nv21Var != null) {
                    eg.o();
                    return null;
                }
            }
            arrayList.add(po90VarA);
        }
        return new qo90(qo90Var.a, qo90Var.b, qo90Var.c, arrayList, qo90Var.e, qo90Var.f, qo90Var.g, qo90Var.h);
    }
}
