package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class o4p1 {
    public static b180 a;
    public static b180 b;

    public static final xx71 A(xx71 xx71Var, boolean z) {
        return xx71.a(xx71Var, null, null, null, z6x.a, z, null, false, false, null, null, null, xx71Var.l + 1, 0L, false, false, null, null, 128519);
    }

    public static final long B(yqg yqgVar) {
        return yqgVar.a() / 1000;
    }

    public static final boolean C(PlayerState playerState) {
        ContextTrack contextTrack;
        spq0 spq0VarTrack = playerState.track();
        if (spq0VarTrack == null || (contextTrack = (ContextTrack) spq0VarTrack.h()) == null) {
            return false;
        }
        return l4o1.O(contextTrack);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(w8d1 w8d1Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1028635975);
        int i2 = (x340Var.g(w8d1Var) ? 4 : 2) | i | 48 | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (w8d1Var instanceof o8d1) {
                x340Var.i0(-497189519);
                k5p1.b((o8d1) w8d1Var, function0, x340Var, i2 & 1022);
                x340Var.r(false);
            } else if (w8d1Var instanceof r8d1) {
                x340Var.i0(-497091311);
                l2p1.c((r8d1) w8d1Var, function0, x340Var, i2 & 1022);
                x340Var.r(false);
            } else if (w8d1Var instanceof u8d1) {
                x340Var.i0(-496993103);
                g6p1.e((u8d1) w8d1Var, function0, x340Var, i2 & 1022);
                x340Var.r(false);
            } else {
                if (!(w8d1Var instanceof q8d1)) {
                    throw p3d1.k(x340Var, 676697379, false);
                }
                x340Var.i0(676707760);
                d0p1.f((q8d1) w8d1Var, function0, x340Var, i2 & 1022);
                x340Var.r(false);
            }
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zt6(w8d1Var, qim0Var2, function0, i, (byte) 18);
        }
    }

    public static final void b(boolean z, long j, qim0 qim0Var, float f, b0k b0kVar, int i, int i2) {
        int i3;
        float f2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2049358589);
        if ((i & 6) == 0) {
            i3 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                f2 = f;
                int i4 = x340Var.d(f2) ? 2048 : 1024;
                i3 |= i4;
            } else {
                f2 = f;
            }
            i3 |= i4;
        } else {
            f2 = f;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            } else if ((i2 & 8) != 0) {
                uwr uwrVar = cbx.a;
                avw0 avw0Var = cbx.b(x340Var).c;
                i3 &= -7169;
                f2 = 1.0f;
            }
            x340Var.s();
            long jB = z ? u7h.f : u7h.b(u7h.f, 0.4f, 0.0f, 0.0f, 0.0f, 14);
            float fX0 = ((wat) x340Var.k(t4k.h)).X0(f2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarB = h2c.a.b(nim0.a);
            boolean zF = ((i3 & 112) == 32) | x340Var.f(jB) | x340Var.d(fX0);
            Object objT = x340Var.T();
            if (zF || objT == fkj0.X) {
                objT = new dub(j, jB, fX0, (byte) 1);
                x340Var.s0(objT);
            }
            j0o1.b(0, x340Var, (iu30) objT, qim0VarB);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        float f3 = f2;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h8h(z, j, qim0Var, f3, i, i2);
        }
    }

    public static final void c(String str, String str2, String str3, boolean z, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-44667504);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function0) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0VarF);
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(qim0VarJ, jA, er31.b(4.0f));
            boolean z2 = (i3 & 112) == 32;
            int i4 = i3 & 14;
            boolean z3 = (i4 == 4) | z2;
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                objT = new os(str2, str, (byte) 9);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(s161.b(qim0VarF2, false, (iu30) objT), z, str3, new pm31(0), null, function0, 8);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarX);
            gfh0 gfh0VarC = t1c.c(een.g, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            if (str.length() > 0) {
                x340Var.i0(-266268504);
                qim0Var3 = qim0Var4;
                uwo1.e(str, null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, i4, 0, 2034);
                x340Var.r(false);
            } else {
                qim0Var3 = qim0Var4;
                x340Var.i0(-266130120);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(str, str2, str3, z, function0, qim0Var2, i, (byte) 10);
        }
    }

    public static final void d(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2121095185);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarV = u291.v(nim0.a, 4.0f);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarN = anm1.N("reaction-share-card-indent", u291.h(qim0VarV, 64.0f));
            long jC = cbx.a(x340Var).a.a.c();
            cua cuaVar = cbx.b(x340Var).f;
            op71.g(x340Var, dug.f(qim0VarN, jC, er31.b(4.0f)));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 21);
        }
    }

    public static final void e(zzz0 zzz0Var, qim0 qim0Var, float f, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        long jA;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-785860725);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(zzz0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= b0kVar3.d(f) ? 256 : 128;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            xb10 xb10VarO = x4p1.o(b0kVar3);
            smr0 smr0VarA = xb10VarO.a();
            u7h u7hVar = null;
            if (smr0VarA != null) {
                rmr0 rmr0VarB = smr0VarA.b(grd1.h);
                if (rmr0VarB == null) {
                    rmr0VarB = smr0VarA.b(grd1.e);
                }
                if (rmr0VarB != null) {
                    u7hVar = new u7h(u7h.b(z4p1.e(rmr0VarB.d), 0.6f, 0.0f, 0.0f, 0.0f, 14));
                }
            }
            if (u7hVar == null) {
                b0kVar3.i0(702100111);
                uwr uwrVar = cbx.a;
                jA = cbx.a(b0kVar3).a.a.a();
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(702093942);
                b0kVar3.r(false);
                jA = u7hVar.a;
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar2 = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            b0kVar2 = b0kVar3;
            jto1.b(dug.f(qim0VarF, jA, er31.b(16.0f)), null, null, false, null, null, null, null, null, apo.r(-289515340, new h6a0(zzz0Var, xb10VarO, (byte) 14), b0kVar3), null, apo.r(632076115, new ye6(f, (Object) zzz0Var, (byte) 3), b0kVar3), null, null, null, apo.r(136139727, new k2d0(zzz0Var, (byte) 13), b0kVar3), b0kVar2, 805306368, 196656, 30206);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jh6(zzz0Var, qim0Var2, f, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void f(zvj1 zvj1Var, boolean z, iu30 iu30Var, int i, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int i3;
        int i4;
        String strO0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1631414803);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(zvj1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.e(i) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new mah1(iu30Var, zvj1Var, (byte) 27);
                x340Var.s0(objT);
            }
            qim0 qim0VarV = bin.v(qim0VarF, null, ny3.a, false, null, null, (Function0) objT, 28);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("video_quality_option_row_" + i, uyn1.z(0.0f, 8.0f, 1, qim0VarV));
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
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
            uwo1.e(cwl1.n0(2131963783, new Object[]{cwl1.o0(x340Var, zvj1Var.b()), cwl1.o0(x340Var, zvj1Var.a())}, x340Var), anm1.N("video_quality_option_title_" + i, nim0Var), cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            if (zvj1Var instanceof wvj1) {
                strO0 = x0d.k(x340Var, -1919792460, 2131952688, x340Var, false);
            } else {
                if (!(zvj1Var instanceof yvj1)) {
                    throw p3d1.k(x340Var, -1919793306, false);
                }
                x340Var.i0(-1919789714);
                int iOrdinal = ((yvj1) zvj1Var).a.ordinal();
                if (iOrdinal == 0) {
                    i4 = 2131963742;
                } else if (iOrdinal == 1) {
                    i4 = 2131956562;
                } else if (iOrdinal == 2) {
                    i4 = 2131959136;
                } else {
                    if (iOrdinal != 3) {
                        eg.o();
                        return;
                    }
                    i4 = 2131957782;
                }
                strO0 = cwl1.o0(x340Var, i4);
                x340Var.r(false);
            }
            String str = strO0;
            uwo1.e(str, anm1.N("video_quality_option_subtitle_" + i, nim0Var), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var = x340Var;
            x340Var.r(true);
            if (z) {
                x340Var.i0(356103301);
                ilx ilxVar = ilx.c;
                jsl jslVar = new jsl(cwl1.o0(x340Var, 2131963776));
                long j = cbx.a(x340Var).b.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                w0h1.a(ilxVar, jslVar, anm1.N("video_quality_selected_icon_" + i, u291.r(nim0Var, 16.0f)), j, 0L, false, x340Var, ilx.d, 48);
                x340Var.r(false);
            } else {
                x340Var.i0(356522483);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cc40(zvj1Var, z, iu30Var, i, i2);
        }
    }

    public static final void g(String str, gt40 gt40Var, kee1 kee1Var, int i, b0k b0kVar, int i2, int i3) {
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-192911377);
        int i5 = (x340Var.g(str) ? 4 : 2) | i2;
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 48;
        } else {
            i4 = i5 | (x340Var.g(gt40Var) ? 32 : 16);
        }
        int i7 = i4 | (x340Var.g(kee1Var) ? 256 : 128);
        int i8 = i3 & 8;
        if (i8 != 0) {
            i7 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i7 |= x340Var.e(i) ? 2048 : 1024;
        }
        if ((i7 & 1171) == 1170 && x340Var.H()) {
            x340Var.b0();
        } else {
            x340Var.d0();
            if ((i2 & 1) == 0 || x340Var.E()) {
                if (i6 != 0) {
                    gt40Var = et40.a;
                }
                if (i8 != 0) {
                    i = Integer.MAX_VALUE;
                }
            } else {
                x340Var.b0();
            }
            x340Var.s();
            p9e1 p9e1Var = p9e1.a;
            x340Var.j0(-1115894518);
            x340Var.j0(1886828752);
            if (!(x340Var.a instanceof i06)) {
                tgp1.p();
                throw null;
            }
            x340Var.g0();
            if (x340Var.S) {
                x340Var.l(new zg20(p9e1Var, (byte) 18));
            } else {
                x340Var.v0();
            }
            nko1.H(str, x340Var, ppd1.Z);
            nko1.H(gt40Var, x340Var, ppd1.N0);
            nko1.H(kee1Var, x340Var, ppd1.O0);
            ppd1 ppd1Var = ppd1.P0;
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(i))) {
                x340Var.s0(Integer.valueOf(i));
                x340Var.b(Integer.valueOf(i), ppd1Var);
            }
            us71.m(x340Var, true, false, false);
        }
        gt40 gt40Var2 = gt40Var;
        int i9 = i;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mxy(str, gt40Var2, kee1Var, i9, i2, i3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void h(cwj1 cwj1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1318182763);
        int i2 = (i & 6) == 0 ? i | (x340Var.g(cwj1Var) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("video_quality_selector", l6o1.H(uyn1.z(16.0f, 0.0f, 2, qim0VarF), es41VarC, false, 14));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            yvj1 yvj1Var = cwj1Var.c;
            yvj1 yvj1Var2 = yvj1Var instanceof yvj1 ? yvj1Var : null;
            uvj1 uvj1Var = yvj1Var2 != null ? yvj1Var2.a : null;
            x340Var.i0(-424408711);
            int i4 = 0;
            for (Object obj : cwj1Var.b) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                yvj1 yvj1Var3 = (zvj1) obj;
                yvj1 yvj1Var4 = yvj1Var3 instanceof yvj1 ? yvj1Var3 : null;
                f(yvj1Var3, (yvj1Var4 != null ? yvj1Var4.a : null) == uvj1Var, iu30Var, i4, x340Var, (i3 << 3) & 896);
                i4 = i5;
            }
            x340Var.r(false);
            i(cwj1Var.a, null, x340Var, 0);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1(cwj1Var, iu30Var, qim0Var2, i, (byte) 8);
        }
    }

    public static final void i(bwj1 bwj1Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1532391790);
        int i2 = (x340Var.e(bwj1Var.ordinal()) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            zzq0 zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.a.c();
            cua cuaVar = cbx.b(x340Var).f;
            cwl1.b(anm1.N("video_quality_info_box", dug.f(qim0VarF, jC, er31.b(16.0f))), (tl3) null, (hw61) null, (pgx) null, zzq0Var, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(1797389719, new g2j1(bwj1Var, (byte) 11), x340Var), x340Var, 0, 48, 2030);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eii1(bwj1Var, qim0Var2, i, (byte) 15);
        }
    }

    public static final mr20 j(mr20 mr20Var, int i, int i2) {
        if (i < 0 && i != -2 && i != -1) {
            hhg1.f(f4i1.c(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1 && i2 != 1) {
            hhg1.n("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == -1) {
            i = 0;
            i2 = 2;
        }
        int i3 = i;
        int i4 = i2;
        return mr20Var instanceof fx30 ? fx30.e((fx30) mr20Var, (o8n) null, i3, i4, 1) : new hge(mr20Var, (o8n) null, i3, i4, 2);
    }

    public static mr20 k(mr20 mr20Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        return j(mr20Var, i, 1);
    }

    public static final phd l(mr20 mr20Var) {
        return mr20Var instanceof phd ? (phd) mr20Var : new rhd(mr20Var);
    }

    public static final mr20 m(mr20 mr20Var) {
        return k(mr20Var, -1, 2);
    }

    public static final elm n(long j, PlayerState playerState) {
        Long lD0;
        j380 j380VarMetadata;
        String str;
        Long lD1;
        String str2 = (String) playerState.contextMetadata().get("duration");
        if (str2 != null && (lD0 = nhc1.d0(10, str2)) != null) {
            if (lD0.longValue() <= 0) {
                lD0 = null;
            }
            if (lD0 != null) {
                long jLongValue = lD0.longValue();
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                long jLongValue2 = (contextTrack == null || (j380VarMetadata = contextTrack.metadata()) == null || (str = (String) j380VarMetadata.get("previous_accumulative_ms")) == null || (lD1 = nhc1.d0(10, str)) == null) ? 0L : lD1.longValue();
                Long l = (Long) playerState.position(j).h();
                if (l != null) {
                    long jMax = Math.max(0L, l.longValue()) + jLongValue2;
                    return new elm(yoi1.p((int) ((100 * jMax) / jLongValue), 0, 100), Math.max(0L, jLongValue - jMax));
                }
            }
        }
        return null;
    }

    public static final String o(PlayerState playerState) {
        String strUri;
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        return (contextTrack == null || (strUri = contextTrack.uri()) == null) ? "" : strUri;
    }

    public static kqk0 p(r6h1 r6h1Var) {
        return new kqk0(r6h1Var);
    }

    public static final dw71 q(gx71 gx71Var) {
        boolean z = gx71Var.b instanceof btf;
        jwm jwmVar = (jwm) o7h.s0(gx71Var.d);
        String str = jwmVar != null ? jwmVar.a.b : null;
        if (str == null) {
            str = "";
        }
        return new dw71(str, gx71Var.e, z);
    }

    public static final mr20 r(mr20 mr20Var, o8n o8nVar) {
        if (o8nVar.A(fkj0.W0) != null) {
            bhn0.s(o8nVar, "Flow context cannot contain job in it. Had ");
            return null;
        }
        if (o8nVar.equals(o6x.a)) {
            return mr20Var;
        }
        return mr20Var instanceof fx30 ? fx30.e((fx30) mr20Var, o8nVar, 0, 0, 6) : new hge(mr20Var, o8nVar, 0, 0, 12);
    }

    public static final boolean s(PlayerState playerState) {
        return v(playerState) && playerState.signals().contains("switch-to-audio");
    }

    public static final boolean t(PlayerState playerState) {
        return u890.j(playerState.contextMetadata().get("lexicon_set_type"), "your_dj");
    }

    public static final boolean u(PlayerState playerState) {
        CharSequence charSequence = (CharSequence) playerState.contextMetadata().get("lexicon_set_type");
        return !(charSequence == null || ihc1.y0(charSequence));
    }

    public static final boolean v(PlayerState playerState) {
        return u890.j(playerState.options().modes().get("media"), "video");
    }

    public static final boolean w(PlayerState playerState) {
        String str = (String) playerState.contextMetadata().get("enhanced_context");
        return str != null && Boolean.parseBoolean(str);
    }

    public static final boolean x(PlayerState playerState) {
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        return contextTrack != null && u890.j(contextTrack.provider(), "narration/welcome") && playerState.contextMetadata().containsKey("narration.welcome.commentary_type") && !playerState.contextMetadata().containsKey("narration.error.commentary_type");
    }

    public static final String y(gx71 gx71Var, quc0 quc0Var) {
        String str;
        List list = gx71Var.d;
        btf btfVar = gx71Var.b;
        if (u890.j(btfVar, atf.a)) {
            jwm jwmVar = (jwm) o7h.s0(list);
            str = jwmVar != null ? jwmVar.a.b : null;
            return str == null ? "" : str;
        }
        if (!(btfVar instanceof btf)) {
            eg.o();
            return null;
        }
        String str2 = btfVar.a;
        if (str2 != null) {
            str = ihc1.y0(str2) ? null : str2;
            if (str != null) {
                return str;
            }
        }
        ArrayList arrayListN0 = o7h.N0(list, Collections.singletonList(gx71Var.c));
        ArrayList arrayList = new ArrayList(q7h.U(arrayListN0, 10));
        Iterator it = arrayListN0.iterator();
        while (it.hasNext()) {
            arrayList.add(((jwm) it.next()).a.b);
        }
        return quc0Var.a(arrayList);
    }

    public static boolean z(w34 w34Var) {
        return w34Var.a();
    }
}
