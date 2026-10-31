package p;

import android.R;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.kidsentitybanning.search.v1.ArtistEntity;
import com.spotify.kidsentitybanning.search.v1.SearchEntity;
import com.spotify.kidsentitybanning.search.v1.SearchResponse;
import com.spotify.kidsentitybanning.search.v1.TrackEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class voo1 {
    public static final qti1 a = new qti1((byte) 11);
    public static final qti1 b = new qti1((byte) 12);
    public static final qti1 c = new qti1((byte) 13);
    public static final qti1 d = new qti1((byte) 14);
    public static final qti1 e = new qti1((byte) 15);
    public static final qti1 f = new qti1((byte) 16);
    public static final qti1 g = new qti1((byte) 17);
    public static b180 h;

    public static final void a(List list, hcx hcxVar, float f2, float f3, long j, qim0 qim0Var, b0k b0kVar, int i) {
        float f4;
        h311 h311VarV;
        h37 h37Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(662990511);
        int i2 = i | (x340Var.g(list) ? 4 : 2) | (x340Var.f(j) ? 16384 : 8192) | (x340Var.i(qim0Var) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            if (list.isEmpty()) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    h37Var = new h37(list, hcxVar, f2, f3, j, qim0Var, i, (byte) 0);
                }
            } else {
                hcx hcxVar2 = hcxVar;
                f4 = f2;
                long j2 = j;
                float fA = hcxVar2.a(x340Var) + (2.0f * f4);
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = new j37((byte) 0, f3);
                    x340Var.s0(objT);
                }
                gfh0 gfh0Var = (gfh0) objT;
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
                nko1.H(gfh0Var, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                x340Var.i0(-295066270);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jb9 jb9Var = (jb9) it.next();
                    String str = jb9Var.a;
                    Uri uri = str.length() > 0 ? Uri.parse(str) : Uri.EMPTY;
                    bmq0.a(uri, d1u.E(f4, j2, u291.r(nim0.a, fA), er31.a), hcxVar2, (String) null, jb9Var.b, 0L, 0L, false, x340Var, 384, 232);
                    hcxVar2 = hcxVar;
                    j2 = j;
                    fA = fA;
                }
                x340Var.r(false);
                x340Var.r(true);
            }
            h311VarV.d = h37Var;
        }
        f4 = f2;
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h37Var = new h37(list, hcxVar, f4, f3, j, qim0Var, i, (byte) 1);
            h311VarV.d = h37Var;
        }
    }

    public static final void b(s0f s0fVar, whf whfVar, Function0 function0, qim0 qim0Var, boolean z, boolean z2, vu30 vu30Var, b0k b0kVar, int i) {
        vu30 vu30Var2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1358165009);
        int i2 = i | (x340Var.i(s0fVar) ? 4 : 2) | (x340Var.i(whfVar) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | 3072 | (x340Var.h(z) ? 16384 : 8192) | (x340Var.h(z2) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("chat_section_card", qim0Var3);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarQ = i1p1.q(qim0VarN, er31.b(16.0f));
            long jA = cbx.a(x340Var).a.a.a();
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0VarF = dug.f(qim0VarQ, jA, u5j1Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            c(z, function0, null, z2, whfVar.b == ugf.b, x340Var, ((i2 >> 12) & 14) | ((i2 >> 3) & 112) | ((i2 >> 6) & 7168));
            t1c.a(dug.f(u291.h(u291.f(qim0Var3, 1.0f), 1.0f), cbx.a(x340Var).d.b, u5j1Var), x340Var, 0);
            otw.c(s0fVar, whfVar, new wnb0(1.0f, true), (ipb1) null, x340Var, i2 & 126, 8);
            vu30Var2 = vu30Var;
            us71.j(6, vu30Var2, x340Var, true);
            qim0Var2 = qim0Var3;
        } else {
            vu30Var2 = vu30Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vl(s0fVar, whfVar, function0, qim0Var2, z, z2, vu30Var2, i, (byte) 3);
        }
    }

    public static final void c(boolean z, Function0 function0, qim0 qim0Var, boolean z2, boolean z3, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1021019733);
        if ((i & 6) == 0) {
            i2 = (x340Var2.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= x340Var2.h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var2.h(z3) ? 16384 : 8192;
        }
        if (x340Var2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var2).d;
            qim0 qim0VarB = uyn1.B(u291.b(0.0f, 48.0f, 1, qim0VarF), cbx.b(x340Var2).e.b, 0.0f, cbx.b(x340Var2).e.b, 0.0f, 10);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            wnb0 wnb0VarQ = kk0.q(x340Var2, qim0VarE, y580.Y, 1.0f, true);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = mle.c1;
                x340Var2.s0(objT);
            }
            uwo1.e(cwl1.o0(x340Var2, 2131953721), s161.b(wnb0VarQ, false, (iu30) objT), cbx.d(x340Var2).h, cbx.a(x340Var2).b.a, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
            x340Var = x340Var2;
            if (z) {
                x340Var.i0(1965913825);
                gfx.b(4, apo.r(1114952225, new ure(function0, z2, z3), x340Var), x340Var, 54);
                x340Var.r(false);
            } else {
                x340Var.i0(1967528305);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vre(z, function0, qim0Var2, z2, z3, i);
        }
    }

    public static final void d(c380 c380Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-141273885);
        int i2 = i | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131953596);
            String strO1 = cwl1.o0(x340Var, R.string.cancel);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean z = (i2 & 896) == 256;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new cb(function1, ven0Var, (byte) 11);
                x340Var.s0(objT2);
            }
            Function0 function2 = (Function0) objT2;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(378071180);
                String strO2 = cwl1.o0(x340Var, 2131953597);
                String strN0 = cwl1.n0(2131953595, new Object[]{o7h.y0(c380Var, ", ", (String) null, (String) null, (iu30) null, 62)}, x340Var);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                zgx zgxVar = new zgx(strO0, new gbx(new y50(strO0), function0));
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    mqo1.d(function2, null, null, strO2, strN0, zgxVar, new zgx(strO1, new gbx(new y50(strO1), function2)), x340Var, 2359296, 6);
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(378612223);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ojn(c380Var, function0, function1, i, (byte) 0);
        }
    }

    public static final void e(ta60 ta60Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        ta60 ta60Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(193624132);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(ta60Var) : x340Var.i(ta60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            ta60Var2 = ta60Var;
            ulo1.b(ta60Var2, "HighlightStacked3Card", null, apo.r(-992730303, new nc60(ta60Var, b2), x340Var), x340Var, (i3 & 14) | 24624 | ((i3 << 3) & 896), 8);
            qim0Var = nim0.a;
        } else {
            ta60Var2 = ta60Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oc60(ta60Var2, qim0Var, i, (byte) 4);
        }
    }

    public static final void f(w9p0 w9p0Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1851714907);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(w9p0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean z = w9p0Var.f == 2;
            boolean z2 = (i3 & 14) == 4;
            int i4 = i3 & 896;
            boolean z3 = z2 | (i4 == 256);
            Object objT = x340Var.T();
            if (z3 || objT == m4cVar) {
                objT = new w7p0(w9p0Var, iu30Var, (byte) 0);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean zH = x340Var.h(z) | (i4 == 256);
            Object objT2 = x340Var.T();
            if (zH || objT2 == m4cVar) {
                objT2 = new z20(z, iu30Var, (byte) 19);
                x340Var.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            boolean zH2 = x340Var.h(z) | (i4 == 256);
            Object objT3 = x340Var.T();
            if (zH2 || objT3 == m4cVar) {
                objT3 = new z20(z, iu30Var, (byte) 20);
                x340Var.s0(objT3);
            }
            Function0 function0M = y7y0.M(function0, function1, (Function0) objT3, x340Var);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            nx61 nx61Var = vu40.h;
            w3d1.a(qim0VarD, (hw61) null, poz0.r(x340Var).f, 0L, 0.0f, 0.0f, (qqb) null, apo.r(356907712, new tse0(function0M, (byte) 17), x340Var), x340Var, 12582912, 122);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new v7p0(w9p0Var, qim0Var2, iu30Var, i, (byte) 0);
        }
    }

    public static final void g(ka60 ka60Var, long j, long j2, xd60 xd60Var, b0k b0kVar, int i) {
        long j3;
        long j4;
        xd60 xd60Var2;
        ka60 ka60Var2 = ka60Var;
        zzq0 zzq0Var = xd60Var.d;
        ajc0 ajc0Var = xd60Var.f;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(569674485);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.g(ka60Var2) ? 4 : 2) | (b0kVar2.f(j) ? 32 : 16) | (b0kVar2.f(j2) ? 256 : 128) | (b0kVar2.i(xd60Var) ? 2048 : 1024);
        if (b0kVar2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(u291.d(nim0Var, 1.0f), 0.0f, xd60Var.b, 0.0f, 0.0f, 13);
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(h36.g, eraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
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
            nko1.H(mbhVarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            hb60.a(ka60Var2.a, j, xd60Var.g, uyn1.w(u291.f(nim0Var, 1.0f), xd60Var.c), xd60Var.a, 0, b0kVar2, i2 & 112, 32);
            j3 = j;
            b0kVar2 = b0kVar2;
            qim0 qim0VarThen = u291.f(nim0Var, 1.0f).then(ulo1.p(b0kVar2, 3));
            mbh mbhVarA2 = jbh.a(h36.d, eraVar, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarThen);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            ka60Var2 = ka60Var;
            wd60.a(ka60Var2.b, (qim0) null, (u7h) null, ajc0Var, zzq0Var, b0kVar2, 8, 6);
            wd60.a(ka60Var2.c, (qim0) null, new u7h(j3), ajc0Var, zzq0Var, b0kVar2, 8 | ((i2 << 3) & 896), 2);
            xd60Var2 = xd60Var;
            j4 = j2;
            wd60.a(ka60Var2.d, (qim0) null, new u7h(j4), ajc0Var, xd60Var2.e, b0kVar2, 8 | (i2 & 896), 2);
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            j3 = j;
            j4 = j2;
            xd60Var2 = xd60Var;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new p87(ka60Var2, j3, j4, xd60Var2, i);
        }
    }

    public static final void h(gmc1 gmc1Var, Function0 function0, b0k b0kVar, int i) {
        Function0 function1;
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2096301756);
        int i2 = (x340Var.g(gmc1Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = gmc1Var instanceof fmc1;
            if (z) {
                x340Var.i0(-206320597);
                x340Var.r(false);
                strK = ((fmc1) gmc1Var).a;
            } else {
                strK = x0d.k(x340Var, -206319834, 2131952800, x340Var, false);
            }
            String str = strK;
            String strK2 = (gmc1Var.equals(emc1.a) || z) ? x0d.k(x340Var, -206313532, 2131952801, x340Var, false) : x0d.k(x340Var, -206311001, 2131952802, x340Var, false);
            String strO0 = cwl1.o0(x340Var, 2131952803);
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new pt61(function0, (byte) 28);
                x340Var.s0(objT);
            }
            function1 = function0;
            mqo1.d(function1, null, null, strO0, str, new zgx(strK2, new gbx(z50.c, (Function0) objT)), null, x340Var, ((i2 >> 3) & 14) | 262144, 70);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gzk(gmc1Var, function1, i, (byte) 1);
        }
    }

    public static final qzh i(xfx xfxVar) {
        return new ver(xfxVar.a.a, (byte) 0);
    }

    public static final psw j(maa maaVar, har0 har0Var, gw70 gw70Var, kko kkoVar, Function0 function0, Function0 function1, klv0 klv0Var, tbw0 tbw0Var, aru0 aru0Var, myq0 myq0Var, aru0 aru0Var2, cua cuaVar, ycm ycmVar, e9g1 e9g1Var, tiv0 tiv0Var, iuj iujVar, yqg yqgVar, boolean z) {
        j2i j2iVar = new j2i(1923440044, new xbi0(har0Var, gw70Var, tbw0Var, function0, function1, aru0Var, kkoVar, myq0Var, ycmVar, aru0Var2, cuaVar, e9g1Var, tiv0Var, klv0Var, iujVar, yqgVar, z), true);
        ien0 ien0Var = qsw.a;
        return new psw(j2iVar, (byte) 0);
    }

    public static final vu30 k(vu30 vu30Var, vu30 vu30Var2) {
        return vu30Var2 == null ? vu30Var : new wwx(vu30Var, vu30Var2, (byte) 1);
    }

    public static final qzh l(xfx xfxVar) {
        return new zpr(xfxVar.d.a);
    }

    public static final qzh m(xfx xfxVar) {
        return new cqr(xfxVar.a.a);
    }

    public static final boolean n(int i, int i2) {
        return i == i2;
    }

    public static final qzh o(xfx xfxVar) {
        tfx tfxVar = xfxVar.a;
        return new wyr(tfxVar.a, tfxVar.b);
    }

    public static final boolean p(th61 th61Var) {
        return (!th61Var.b || TextUtils.isEmpty(th61Var.a) || TextUtils.isEmpty(th61Var.g) || TextUtils.isEmpty(th61Var.X)) ? false : true;
    }

    public static final qim0 q(qim0 qim0Var) {
        return y(qim0Var, g);
    }

    public static final qzh r(xfx xfxVar) {
        return new gcs(xfxVar.a.a);
    }

    public static final qzh s(xfx xfxVar) {
        return new whs(xfxVar.a.a);
    }

    public static final qzh t(xfx xfxVar, xzf1 xzf1Var) {
        Context context = xfxVar.h.a;
        return xzf1Var != null ? new qws(context, 2131626304) : new qws(context, 2131626283);
    }

    public static final qzh u(xfx xfxVar) {
        return new eos(xfxVar.a.a, (byte) 0);
    }

    public static final qzh v(xfx xfxVar) {
        return new tps(xfxVar.a.a);
    }

    public static final cwz0 w(SearchResponse searchResponse) {
        h290 h290VarN = searchResponse.n();
        ArrayList arrayList = new ArrayList();
        Iterator it = h290VarN.iterator();
        while (true) {
            dwz0 ewz0Var = null;
            if (!it.hasNext()) {
                boolean zO = searchResponse.o();
                dwz0 nextPageToken = searchResponse.getNextPageToken();
                return new cwz0(nextPageToken.length() > 0 ? nextPageToken : null, arrayList, zO);
            }
            SearchEntity searchEntity = (SearchEntity) it.next();
            int iO = searchEntity.o();
            int i = iO == 0 ? -1 : gwz0.a[l1d.C(iO)];
            if (i == 1) {
                TrackEntity trackEntityP = searchEntity.p();
                String string = UUID.randomUUID().toString();
                String uri = trackEntityP.getUri();
                g4a g4aVarP = e6p1.p(trackEntityP.o());
                if (trackEntityP.hasArtist()) {
                    ArtistEntity artistEntityN = trackEntityP.n();
                    ewz0Var = new dwz0(UUID.randomUUID().toString(), artistEntityN.getUri(), e6p1.p(artistEntityN.n()));
                }
                ewz0Var = new ewz0(string, uri, g4aVarP, ewz0Var);
            } else if (i == 2) {
                ArtistEntity artistEntityN2 = searchEntity.n();
                ewz0Var = new dwz0(UUID.randomUUID().toString(), artistEntityN2.getUri(), e6p1.p(artistEntityN2.n()));
            } else {
                if (i != 3) {
                    eg.o();
                    return null;
                }
                n57.e("Expected entity type for search entity: " + searchEntity);
            }
            if (ewz0Var != null) {
                arrayList.add(ewz0Var);
            }
        }
    }

    public static final cr31 x(b0k b0kVar, int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-482970208);
            x340Var.r(false);
            return er31.a;
        }
        if (iC != 1) {
            throw p3d1.k((x340) b0kVar, -482971406, false);
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(-482968496);
        uwr uwrVar = cbx.a;
        cua cuaVar = cbx.b(x340Var2).f;
        cr31 cr31VarB = er31.b(8.0f);
        x340Var2.r(false);
        return cr31VarB;
    }

    public static final qim0 y(qim0 qim0Var, iu30 iu30Var) {
        return qim0Var.then(new aed1(iu30Var));
    }

    public static fgp1 z(ExecutorService executorService) {
        if (executorService instanceof fgp1) {
            return (fgp1) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new lgp1((ScheduledExecutorService) executorService) : new fgp1(executorService);
    }
}
