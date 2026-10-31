package p;

import android.view.View;
import android.view.Window;
import androidx.car.app.k;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.crashreporting.processstatesummary.proto.ProcessStateSummaryEnvelope;
import com.spotify.mobius.Next;
import io.reactivex.rxjava3.core.Completable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class sjo0 {
    public static final aez a = new aez();
    public static b180 b;
    public static k c;
    public static dp5 d;
    public static yrg0 e;
    public static nvc f;

    public static final void a(int i, int i2, int i3, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1178671002);
        j06 j06Var = x340Var.a;
        int i4 = i3 | (x340Var.e(i) ? 4 : 2) | (x340Var.e(i2) ? 32 : 16);
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            fra fraVar = een.N0;
            qim0Var2 = qim0Var;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            jw31 jw31VarA = ew31.a(h36.e, fraVar, x340Var, 54);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            String strN0 = cwl1.n0(2131960718, new Object[]{Integer.valueOf(i2 + 1), Integer.valueOf(i)}, x340Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            boolean zG = x340Var.g(strN0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new i3o(strN0, (byte) 17);
                x340Var.s0(objT);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarU = qxy0.u(s161.b(nim0Var, true, (iu30) objT), (idn0) null, 3);
            jw31 jw31VarA2 = ew31.a(d36Var, een.Z, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarU);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            x340Var.i0(-1046020353);
            for (int i5 = 0; i5 < i; i5++) {
                if (i5 == i2) {
                    x340Var.i0(-473738484);
                    uwr uwrVar2 = cbx.a;
                    j = cbx.a(x340Var).c.a;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-473676608);
                    x340Var.r(false);
                    uwr uwrVar3 = cbx.a;
                    j = ((vex) zex.a.e).j;
                }
                t1c.a(dug.f(i1p1.q(u291.r(nim0Var, 8.0f), er31.a), j, d4o1.a), x340Var, 0);
            }
            us71.m(x340Var, false, true, true);
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f0e((byte) 3, i, i2, i3, qim0Var2);
        }
    }

    public static final void b(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        byte b2;
        qim0 qim0Var2;
        cr31 cr31VarB;
        vu30 vu30Var = y580.Y;
        llj lljVar = y580.R0;
        llj lljVar2 = y580.N0;
        llj lljVar3 = y580.O0;
        nl3 nl3Var = een.P0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-397478377);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.h(z) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long j = ((yex) zex.a.d).c;
            if (z) {
                x340Var.i0(275375042);
                x340Var.r(false);
                cr31VarB = er31.a;
            } else {
                x340Var.i0(275375631);
                cua cuaVar = cbx.b(x340Var).f;
                cr31VarB = er31.b(4.0f);
                x340Var.r(false);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = uyn1.B(u291.f(qim0Var3, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, nl3Var, x340Var, 0);
            qim0 qim0Var4 = qim0Var3;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar3);
            nko1.H(xos0VarM, x340Var, lljVar2);
            x0d.q(iHashCode, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE, x340Var, vu30Var);
            x340Var.i0(929333297);
            int i3 = 0;
            while (i3 < 8) {
                qim0 qim0Var5 = qim0Var4;
                int i4 = i3;
                qim0 qim0VarY = uyn1.y(u291.f(qim0Var5, 1.0f), 16.0f, 8.0f);
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                f36 f36Var2 = f36Var;
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarY);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar3);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar, x340Var);
                nko1.H(qim0VarE2, x340Var, vu30Var);
                qim0 qim0VarQ = i1p1.q(u291.r(qim0Var5, 48.0f), cr31VarB);
                u5j1 u5j1Var = d4o1.a;
                t1c.a(dug.f(qim0VarQ, j, u5j1Var), x340Var, 0);
                op71.g(x340Var, u291.v(qim0Var5, 12.0f));
                mbh mbhVarA2 = jbh.a(f36Var2, nl3Var, x340Var, 0);
                vu30 vu30Var2 = vu30Var;
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                nl3 nl3Var2 = nl3Var;
                qim0 qim0VarE3 = zr7.E(x340Var, qim0Var5);
                x340Var.m0();
                cr31 cr31Var = cr31VarB;
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA2, x340Var, lljVar3);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar, x340Var);
                nko1.H(qim0VarE3, x340Var, vu30Var2);
                qim0 qim0VarH = u291.h(u291.f(qim0Var5, 0.6f), 14.0f);
                uwr uwrVar2 = cbx.a;
                cua cuaVar2 = cbx.b(x340Var).f;
                t1c.a(dug.f(i1p1.q(qim0VarH, er31.b(2.0f)), j, u5j1Var), x340Var, 0);
                qim0 qim0VarH2 = u291.h(ab80.o(qim0Var5, 6.0f, x340Var, qim0Var5, 0.4f), 12.0f);
                cua cuaVar3 = cbx.b(x340Var).f;
                t1c.a(dug.f(i1p1.q(qim0VarH2, er31.b(2.0f)), j, u5j1Var), x340Var, 0);
                x340Var.r(true);
                x340Var.r(true);
                i3 = i4 + 1;
                vu30Var = vu30Var2;
                qim0Var4 = qim0Var5;
                f36Var = f36Var2;
                nl3Var = nl3Var2;
                cr31VarB = cr31Var;
            }
            qim0Var2 = qim0Var4;
            b2 = 1;
            x340Var.r(false);
            x340Var.r(true);
        } else {
            b2 = 1;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0(z, qim0Var2, i, b2);
        }
    }

    public static final void c(jtl1 jtl1Var, int i, int i2, qim0 qim0Var, Function0 function0, b0k b0kVar, int i3) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1142071854);
        int i4 = i3 | (x340Var.i(jtl1Var) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | (x340Var.e(i2) ? 256 : 128) | 3072 | (x340Var.i(function0) ? 16384 : 8192);
        if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            htl1 htl1Var = (htl1) f4p1.k(jtl1Var.b, (iac0) null, x340Var, 7).getValue();
            boolean zJ = u890.j(htl1Var != null ? htl1Var.b : null, brl1.b);
            qim0 qim0Var3 = nim0.a;
            if (zJ) {
                x340Var.i0(1268657090);
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                op71.g(x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                if (2.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                wnb0 wnb0Var = new wnb0(2.0f <= Float.MAX_VALUE ? 2.0f : Float.MAX_VALUE, true);
                uwr uwrVar = cbx.a;
                a8o.s(function0, uyn1.B(wnb0Var, cbx.b(x340Var).b.a, 0.0f, 0.0f, 0.0f, 14), apo.r(-446888030, new rgq0((byte) 0, i, i2), x340Var), x340Var, ((i4 >> 12) & 14) | 384, 0);
                x340Var.r(true);
                x340Var.r(false);
            } else {
                x340Var.i0(1269021371);
                uwr uwrVar2 = cbx.a;
                a8o.s(function0, uyn1.B(qim0Var3, cbx.b(x340Var).b.a, 0.0f, 0.0f, 0.0f, 14), apo.r(786878173, new rgq0((byte) 1, i, i2), x340Var), x340Var, ((i4 >> 12) & 14) | 384, 0);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1(jtl1Var, i, i2, qim0Var2, function0, i3);
        }
    }

    public static final void d(String str, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1571856652);
        int i3 = (x340Var.g(str) ? 4 : 2) | i;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            if (str.equals("recently_played")) {
                i2 = 2131962757;
            } else if (str.equals("followed_artists")) {
                i2 = 2131962754;
            } else if (str.equals("liked_songs")) {
                i2 = 2131962755;
            } else {
                i2 = str.equals("most_played") ? 2131962756 : 2131962753;
            }
            crm0.o(cwl1.o0(x340Var, i2), "song_dna_search_tab_empty", x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nl41(str, i, (byte) 19);
        }
    }

    public static final void e(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2116188820);
        if (x340Var.Y(i & 1, i != 0)) {
            crm0.o(cwl1.o0(x340Var, 2131962758), "song_dna_search_tab_failed", x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t491(i, (byte) 9);
        }
    }

    public static final void f(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2052452777);
        if (x340Var.Y(i & 1, i != 0)) {
            crm0.o(cwl1.o0(x340Var, 2131962753), "song_dna_search_tab_empty", x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t491(i, (byte) 10);
        }
    }

    public static final void g(int i, int i2, int i3, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(929499685);
        int i4 = (x340Var.e(i) ? 4 : 2) | i3 | (x340Var.e(i2) ? 32 : 16);
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            String strN0 = cwl1.n0(2131963719, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, x340Var);
            uwr uwrVar = cbx.a;
            uwo1.e(strN0, null, cbx.d(x340Var).h, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(12.0f, 0.0f, 2, nim0.a);
            cvx cvxVar2 = cbx.b(x340Var).b;
            t1c.a(dug.f(u291.h(u291.v(qim0VarZ, 12.0f), 1.0f), cbx.a(x340Var).b.a, d4o1.a), x340Var, 0);
            uwo1.e(cwl1.o0(x340Var, 2131963720), null, cbx.d(x340Var).h, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vak0(i, i2, i3, (byte) 1);
        }
    }

    public static final void h(asf1 asf1Var, b0k b0kVar, int i) {
        int i2;
        byte b2;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        gra graVar = een.h;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(332315267);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(asf1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            int i3 = asf1Var.a;
            nim0 nim0Var = nim0.a;
            n4k n4kVar = hmb0.t1;
            if (i3 == 1) {
                x340Var.i0(104643155);
                uwr uwrVar = cbx.a;
                qim0 qim0VarD = u291.d(uyn1.B(nim0Var, 0.0f, cbx.b(x340Var).b.a, 0.0f, 0.0f, 13), 1.0f);
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar4);
                nko1.H(xos0VarM, x340Var, lljVar3);
                nko1.H(Integer.valueOf(iHashCode), x340Var, lljVar2);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, lljVar);
                b2 = 4;
                xto1.e(null, 0, 0L, 0L, x340Var, 0, 15);
                x340Var.r(true);
                x340Var.r(false);
            } else if (i3 == 2 && asf1Var.b == 2) {
                x340Var.i0(104980869);
                uwr uwrVar2 = cbx.a;
                qim0 qim0VarD2 = u291.d(uyn1.B(nim0Var, 0.0f, cbx.b(x340Var).b.a, 0.0f, 0.0f, 13), 1.0f);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD2);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                nko1.H(Integer.valueOf(iHashCode2), x340Var, lljVar2);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                b2 = 4;
                uwo1.e(cwl1.o0(x340Var, 2131962763), null, cbx.d(x340Var).e, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2026);
                x340Var = x340Var;
                x340Var.r(true);
                x340Var.r(false);
            } else {
                b2 = 4;
                x340Var.i0(105358077);
                x340Var.r(false);
            }
        } else {
            b2 = 4;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oib1(asf1Var, i, b2);
        }
    }

    public static final n511 i(ndo0 ndo0Var, elb0 elb0Var, n511 n511Var) {
        return n511Var.n(ndo0Var.M(elb0Var, false).h());
    }

    public static final long j(long j, cr41 cr41Var) {
        int iOrdinal = cr41Var.ordinal();
        if (iOrdinal == 0) {
            return j;
        }
        if (iOrdinal == 1) {
            return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        if (iOrdinal != 2) {
            eg.o();
            return 0L;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
    }

    public static final int k(float f2) {
        return (int) Math.ceil(f2);
    }

    public static wrw0 l(byte[] bArr) {
        b3e0 b3e0Var = null;
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append("0123456789abcdef".charAt((b2 & 255) >>> 4));
            sb.append("0123456789abcdef".charAt(b2 & 15));
        }
        String string = sb.toString();
        if (bArr.length > 128) {
            return new urw0(1, string);
        }
        try {
            ProcessStateSummaryEnvelope processStateSummaryEnvelopeV = ProcessStateSummaryEnvelope.v(bArr);
            if (processStateSummaryEnvelopeV.o().size() != 16) {
                return new urw0(3, string);
            }
            ByteBuffer byteBufferOrder = processStateSummaryEnvelopeV.o().b().order(ByteOrder.BIG_ENDIAN);
            UUID uuid = new UUID(byteBufferOrder.getLong(), byteBufferOrder.getLong());
            String strT = processStateSummaryEnvelopeV.t();
            if (strT.length() <= 0) {
                strT = null;
            }
            String strP = processStateSummaryEnvelopeV.p();
            if (strP.length() <= 0) {
                strP = null;
            }
            int iQ = processStateSummaryEnvelopeV.q();
            int iN = processStateSummaryEnvelopeV.n();
            int iR = processStateSummaryEnvelopeV.r();
            int iS = processStateSummaryEnvelopeV.s();
            if (iQ >= 0 && iQ < 8 && iN >= 0 && iN < 8 && iR >= 0 && iR < 8 && iS >= 0 && iS < 8) {
                b3e0 b3e0Var2 = new b3e0(iQ, iN, iR, iS);
                if (iQ != 0 || iN != 0 || iR != 0 || iS != 0) {
                    b3e0Var = b3e0Var2;
                }
            }
            return new vrw0(uuid, strT, strP, b3e0Var);
        } catch (InvalidProtocolBufferException unused) {
            return new urw0(2, string);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (r6 == r8) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m(p.pob0 r20, p.g6o0 r21, long r22, p.cr41 r24, p.cr41 r25, p.onm r26) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.sjo0.m(p.pob0, p.g6o0, long, p.cr41, p.cr41, p.onm):java.lang.Object");
    }

    public static byte[] n(UUID uuid, String str, String str2, b3e0 b3e0Var) {
        xrw0 xrw0VarU = ProcessStateSummaryEnvelope.u();
        byte[] bArrArray = ByteBuffer.allocate(16).order(ByteOrder.BIG_ENDIAN).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array();
        hhc hhcVar = phc.b;
        xrw0VarU.q(phc.e(0, bArrArray, bArrArray.length));
        if (str != null) {
            xrw0VarU.v(str);
        }
        if (str2 != null) {
            xrw0VarU.r(str2);
        }
        if (b3e0Var != null) {
            xrw0VarU.s(b3e0Var.a);
            xrw0VarU.n(b3e0Var.b);
            xrw0VarU.t(b3e0Var.c);
            xrw0VarU.u(b3e0Var.d);
        }
        return ((ProcessStateSummaryEnvelope) xrw0VarU.build()).toByteArray();
    }

    public static final Next o(ojf0 ojf0Var, xm21 xm21Var) {
        Set set = w7x.a;
        return Next.i(ojf0.a(ojf0Var, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, z6x.a, false, new jfm0(new p061(set, false), xm21Var), false, (dn21) null, (sr3) null, 769023), ojf0Var.O0 instanceof lfm0 ? Collections.singleton(new whf0(false)) : set);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object p(ov20 ov20Var, onm onmVar) {
        d2y d2yVar;
        if (onmVar instanceof d2y) {
            d2yVar = (d2y) onmVar;
            int i = d2yVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                d2yVar.b = i - Integer.MIN_VALUE;
            } else {
                d2yVar = new d2y(onmVar);
            }
        } else {
            d2yVar = new d2y(onmVar);
        }
        Object objN = d2yVar.a;
        int i2 = d2yVar.b;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objN);
                    ytw0 ytw0Var = jfv.b;
                    long jK0 = fdg1.k0(10, ngv.e);
                    ett ettVar = new ett(ov20Var, (lnm) null, (byte) 16);
                    d2yVar.b = 1;
                    objN = rc2.N(jK0, ettVar, d2yVar);
                    d9n d9nVar = d9n.a;
                    if (objN == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objN);
                }
                return new m2y((String) objN);
            } catch (TimeoutCancellationException | Exception unused) {
                return i2y.a;
            }
        } catch (CancellationException e2) {
            throw e2;
        }
    }

    public static final int q(int i, List list) {
        int i2;
        byte b2;
        int i3 = ((sor0) o7h.A0(list)).c;
        if (i > ((sor0) o7h.A0(list)).c) {
            rf80.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            sor0 sor0Var = (sor0) list.get(i2);
            if (sor0Var.b > i) {
                b2 = 1;
            } else {
                b2 = sor0Var.c <= i ? (byte) -1 : (byte) 0;
            }
            if (b2 >= 0) {
                if (b2 <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        int size2 = list.size();
        String strB = p5d0.b(list, (String) null, new g6f0((byte) 5), 31);
        StringBuilder sbQ = cy30.q(i2, size2, "Found paragraph index ", " should be in range [0, ", ").\nDebug info: index=");
        sbQ.append(i);
        sbQ.append(", paragraphs=[");
        sbQ.append(strB);
        sbQ.append("]");
        rf80.a(sbQ.toString());
        return i2;
    }

    public static final int r(int i, List list) {
        byte b2;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            sor0 sor0Var = (sor0) list.get(i3);
            if (sor0Var.d > i) {
                b2 = 1;
            } else {
                b2 = sor0Var.e <= i ? (byte) -1 : (byte) 0;
            }
            if (b2 < 0) {
                i2 = i3 + 1;
            } else {
                if (b2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int s(float f2, ArrayList arrayList) {
        byte b2;
        if (f2 <= 0.0f) {
            return 0;
        }
        if (f2 >= ((sor0) o7h.A0(arrayList)).g) {
            return p7h.L(arrayList);
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            sor0 sor0Var = (sor0) arrayList.get(i2);
            if (sor0Var.f > f2) {
                b2 = 1;
            } else {
                b2 = sor0Var.g <= f2 ? (byte) -1 : (byte) 0;
            }
            if (b2 < 0) {
                i = i2 + 1;
            } else {
                if (b2 <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void t(ArrayList arrayList, long j, iu30 iu30Var) {
        int size = arrayList.size();
        for (int iQ = q(nbe1.g(j), arrayList); iQ < size; iQ++) {
            sor0 sor0Var = (sor0) arrayList.get(iQ);
            if (sor0Var.b >= nbe1.f(j)) {
                return;
            }
            if (sor0Var.b != sor0Var.c) {
                iu30Var.invoke(sor0Var);
            }
        }
    }

    public static int u(int i) {
        try {
            return ydh.r(hrt.w(i).toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return 22;
        }
    }

    public static nvc v() {
        nvc nvcVar = f;
        if (nvcVar != null) {
            return nvcVar;
        }
        return null;
    }

    public static final nhf0 w(ojf0 ojf0Var, tv80 tv80Var) {
        List listX = rqg0.x(ojf0Var);
        if (listX.isEmpty()) {
            listX = null;
        }
        if (listX != null) {
            return new nhf0(new fcb0(listX, (String) null, 1), tv80Var);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object x(r241 r241Var, rpu rpuVar, onm onmVar) {
        e2y e2yVar;
        if (onmVar instanceof e2y) {
            e2yVar = (e2y) onmVar;
            int i = e2yVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e2yVar.c = i - Integer.MIN_VALUE;
            } else {
                e2yVar = new e2y(onmVar);
            }
        } else {
            e2yVar = new e2y(onmVar);
        }
        Object obj = e2yVar.b;
        int i2 = e2yVar.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Completable completableB = r241Var.b("dj-voice-commentary", rpuVar.a);
                e2yVar.a = rpuVar;
                e2yVar.c = 1;
                Object objI = fc11.i(completableB, e2yVar);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rpuVar = e2yVar.a;
                hm5.M(obj);
            }
            return new l2y(rpuVar);
        } catch (IOException unused) {
            return k2y.a;
        }
    }

    public static void y(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object z(u6f0 u6f0Var, String str, onm onmVar) {
        xu90 xu90Var;
        if (onmVar instanceof xu90) {
            xu90Var = (xu90) onmVar;
            int i = xu90Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xu90Var.c = i - Integer.MIN_VALUE;
            } else {
                xu90Var = new xu90(onmVar);
            }
        } else {
            xu90Var = new xu90(onmVar);
        }
        Object objA = xu90Var.b;
        int i2 = xu90Var.c;
        Object obj = null;
        if (i2 == 0) {
            hm5.M(objA);
            List listSingletonList = Collections.singletonList(str);
            xu90Var.a = str;
            xu90Var.c = 1;
            objA = u6f0Var.a("LISTENING_ACTIVITY", listSingletonList, xu90Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = xu90Var.a;
            hm5.M(objA);
        }
        r6f0 r6f0Var = (s6f0) objA;
        if (!(r6f0Var instanceof o6f0) && !u890.j(r6f0Var, p6f0.a)) {
            if (r6f0Var instanceof r6f0) {
                List list = (List) r6f0Var.a.get(str);
                if (list != null) {
                    for (Object obj2 : list) {
                        if (u890.j(((q6f0) obj2).b, "LISTENING_ACTIVITY")) {
                            obj = obj2;
                            break;
                        }
                    }
                    return (q6f0) obj;
                }
            } else {
                eg.o();
            }
        }
        return null;
    }
}
