package p;

import android.os.Build;
import android.view.View;
import j$.time.Instant;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class t6p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(yg1 yg1Var, af10 af10Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        Function0 function0;
        af10 af10Var2 = af10Var;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        era eraVar = een.P0;
        mh1 mh1Var = yg1Var.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-536612119);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(yg1Var) ? 4 : 2) | (x340Var.i(af10Var2) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = uyn1.x(u291.f(dug.f(qim0Var, cbx.a(x340Var).a.a.a(), er31.b(8.0f)), 1.0f), 16.0f);
            g36 g36Var = h36.c;
            mbh mbhVarA = jbh.a(g36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            Function0 function2 = function1;
            float f = 1.0f;
            int i3 = i2;
            g36 g36Var2 = g36Var;
            uwo1.e(mh1Var.a, null, cbx.d(x340Var).h, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            x340Var = x340Var;
            x340Var.i0(2063711880);
            Iterator it = mh1Var.b.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                lh1 lh1Var = (lh1) next;
                fra fraVar = een.N0;
                nim0 nim0Var = nim0.a;
                int i6 = i4;
                qim0 qim0VarZ = uyn1.z(0.0f, 12.0f, 1, u291.f(nim0Var, f));
                boolean z2 = lh1Var.f;
                String str = lh1Var.c;
                qim0 qim0VarK = d9y0.k(qim0VarZ, z2 ? 0.38f : 1.0f);
                jw31 jw31VarA = ew31.a(h36.g, fraVar, x340Var, 0);
                era eraVar2 = eraVar;
                Iterator it2 = it;
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarK);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    function0 = function2;
                    x340Var.l(function0);
                } else {
                    function0 = function2;
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                d36 d36Var = new d36(12.0f, true, new um5(false));
                qim0 qim0VarB = uyn1.B(new wnb0(1.0f, true), 0.0f, 0.0f, 12.0f, 0.0f, 11);
                jw31 jw31VarA2 = ew31.a(d36Var, fraVar, x340Var, 0);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA2, x340Var, lljVar4);
                nko1.H(xos0VarM3, x340Var, lljVar3);
                x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar);
                int i7 = i3;
                p6p1.a(lh1Var, af10Var2, u291.r(nim0Var, 48.0f), x340Var, i7 & 112);
                g36 g36Var3 = g36Var2;
                mbh mbhVarA2 = jbh.a(g36Var3, eraVar2, x340Var, 0);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, nim0Var);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA2, x340Var, lljVar4);
                nko1.H(xos0VarM4, x340Var, lljVar3);
                x0d.q(iHashCode4, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar);
                x340 x340Var2 = x340Var;
                String str2 = lh1Var.b;
                uwr uwrVar2 = cbx.a;
                function2 = function0;
                uwo1.e(str2, null, cbx.d(x340Var2).g, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2042);
                x340Var = x340Var2;
                if (str.equals("")) {
                    x340Var.i0(957072094);
                    x340Var.r(false);
                } else {
                    x340Var.i0(956877011);
                    uwo1.e(str, null, cbx.d(x340Var).j, xxq0.c(lh1Var.d), null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
                x340Var.r(true);
                x340Var.r(true);
                if (lh1Var.e.c.length() > 0) {
                    x340Var.i0(-298362741);
                    boolean zE = ((i7 & 896) == 256) | x340Var.e(i6);
                    Object objT = x340Var.T();
                    if (zE || objT == fkj0.X) {
                        objT = new ck0(iu30Var, i6, (byte) 2);
                        x340Var.s0(objT);
                    }
                    x340 x340Var3 = x340Var;
                    foo1.c(new gbx(z50.c, (Function0) objT), jdx.c, u291.D(nim0Var, (era) null, 3), null, yla.s(x340Var), null, null, null, null, null, apo.r(-851476636, new ab(lh1Var, (byte) 21), x340Var), x340Var3, 0, 48, 2008);
                    x340Var = x340Var3;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-297848296);
                    x340Var.r(false);
                }
                x340Var.r(true);
                af10Var2 = af10Var;
                i3 = i7;
                i4 = i5;
                eraVar = eraVar2;
                it = it2;
                g36Var2 = g36Var3;
                f = 1.0f;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nh1(yg1Var, af10Var, iu30Var, qim0Var, i, (byte) 1);
        }
    }

    public static final void b(zih zihVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        int i4 = zihVar.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1397195394);
        int i5 = (x340Var.g(zihVar) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | 384;
        } else {
            i3 = i5 | (x340Var.i(qim0Var) ? 256 : 128);
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            if (i6 != 0) {
                qim0Var = nim0.a;
            }
            fra fraVar = een.N0;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (i4 > 0) {
                x340Var.i0(1046404218);
                e(i4, iu30Var, x340Var, i3 & 112);
                x340Var.r(false);
            } else {
                x340Var.i0(1046507107);
                if (zihVar.b) {
                    x340Var.i0(1046540556);
                    f(iu30Var, x340Var, (i3 >> 3) & 14);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1046586684);
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
            kk0.s(1.0f, true, x340Var);
            c(iu30Var, x340Var, (i3 >> 3) & 14);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r27(zihVar, iu30Var, qim0Var2, i, i2, (byte) 5);
        }
    }

    public static final void c(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1903429828);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gdx gdxVarS = yla.s(x340Var);
            ldx ldxVar = ldx.c;
            String strO0 = cwl1.o0(x340Var, 2131954106);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new thh(iu30Var, (byte) 5);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), ldxVar, anm1.N("hide_button", nim0.a), null, gdxVarS, null, null, null, null, null, pdi.b, x340Var, 0, 48, 2008);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 4, i, iu30Var, false);
        }
    }

    public static final void d(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-26467024);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).c.c;
            mta mtaVar = cbx.b(x340Var).d;
            rhx0.a(u291.r(nim0.a, 48.0f), j, 0.0f, 0L, 0, 0.0f, x340Var, 0, 60);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var, i, (byte) 29);
        }
    }

    public static final void e(int i, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        byte b2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(747285235);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            String strU = cwl1.U(2131820629, i, new Object[]{Integer.valueOf(i)}, x340Var);
            gdx gdxVarS = yla.s(x340Var);
            ldx ldxVar = ldx.c;
            boolean z = (i3 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new thh(iu30Var, (byte) 6);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strU)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strU), function0);
            boolean zG = x340Var.g(strU);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new irf(strU, (byte) 11);
                x340Var.s0(objT2);
            }
            b2 = 0;
            foo1.c(gbxVar, ldxVar, s161.a(nim0.a, (iu30) objT2), null, gdxVarS, null, null, null, null, null, apo.r(-1603961452, new vx1(i, (byte) 9), x340Var), x340Var, 0, 48, 2008);
        } else {
            b2 = 0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ajh(b2, i, i2, iu30Var);
        }
    }

    public static final void f(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(271488464);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gdx gdxVarS = yla.s(x340Var);
            ldx ldxVar = ldx.c;
            String strO0 = cwl1.o0(x340Var, 2131954108);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new thh(iu30Var, (byte) 7);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), ldxVar, anm1.N("reply_button", nim0.a), null, gdxVarS, null, null, null, null, null, pdi.a, x340Var, 0, 48, 2008);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 5, i, iu30Var, false);
        }
    }

    public static final List g() {
        return Collections.singletonList(new yln0());
    }

    public static d69 h(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new d69(kw7.v(view));
        }
        return null;
    }

    public static lee1 i() {
        return lee1.d;
    }

    public static long j() {
        return xf80.a;
    }

    public static final boolean k(na81 na81Var) {
        dh40 dh40Var;
        dh40 dh40Var2 = na81Var.d.b;
        dh40 dh40Var3 = dh40.b;
        if (dh40Var2 == dh40Var3 || dh40Var2 == (dh40Var = dh40.c)) {
            return true;
        }
        gcz gczVar = na81Var.f;
        if ((gczVar != null ? gczVar.a.b : null) != dh40Var3) {
            return (gczVar != null ? gczVar.a.b : null) == dh40Var;
        }
        return true;
    }

    public static ksk0 l(String str) {
        return new ksk0(str, (byte) 3);
    }

    public static final iu30 m(lzn0 lzn0Var, fli0 fli0Var, int i, boolean z, x340 x340Var, int i2) {
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = new x521(lzn0Var);
            x340Var.s0(objT);
        }
        x521 x521Var = (x521) objT;
        boolean z2 = ((((i2 & 112) ^ 48) > 32 && x340Var.g(fli0Var)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && x340Var.e(l1d.C(i))) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && x340Var.h(z)) || (i2 & 3072) == 2048);
        Object objT2 = x340Var.T();
        if (z2 || objT2 == m4cVar) {
            objT2 = new tb60(x521Var, fli0Var, i, z);
            x340Var.s0(objT2);
        }
        return (iu30) objT2;
    }

    public static final boolean n(int i, boolean z) {
        int iC = l1d.C(i);
        if (iC != 0) {
            z = true;
            if (iC != 1) {
                if (iC == 2) {
                    return false;
                }
                eg.o();
                return false;
            }
        }
        return z;
    }

    public static final boolean o(na81 na81Var, na81 na81Var2) {
        Instant instant = na81Var.d.c;
        Instant instant2 = na81Var2.d.c;
        if (instant.compareTo(instant2) <= 0) {
            return instant.equals(instant2) && na81Var.d.b == dh40.d;
        }
        return true;
    }

    public static final String p(YourLibraryDecorateResponse yourLibraryDecorateResponse) {
        YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity yourLibraryDecoratedEntity = (YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) o7h.s0(yourLibraryDecorateResponse.o());
        if (yourLibraryDecoratedEntity != null && yourLibraryDecoratedEntity.hasPlaylist() && yourLibraryDecoratedEntity.w().C()) {
            return yourLibraryDecoratedEntity.w().q().getUri();
        }
        return null;
    }

    public static final jjf1 q(o2v0 o2v0Var) {
        return new jjf1(o2v0Var.d, false, new ol11("", ""), Collections.singletonList(new ol11("", o2v0Var.b)), o2v0Var.e, false, new p2q0("", ""), false, ypl.a, o2v0Var.i, (String) null, o2v0Var.f, new kw91(z6x.a), o1g1.a, qkf1.a, o2v0Var.c, false);
    }

    public static final int r(dh40 dh40Var) {
        int iOrdinal = dh40Var.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return 1;
        }
        if (iOrdinal == 3) {
            return 2;
        }
        if (iOrdinal == 4) {
            return 3;
        }
        if (iOrdinal == 5) {
            return 4;
        }
        eg.o();
        return 0;
    }
}
