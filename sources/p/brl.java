package p;

import android.icu.text.DateTimePatternGenerator;
import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkShadow;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.mobius.Next;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class brl {
    public static final yky0 a = new yky0(new xh3((byte) 12));
    public static b180 b;
    public static b180 c;

    public static void A(arl arlVar, int i, int i2) {
        float fP;
        ArtworkShadow artworkShadow = arlVar.c;
        ArtworkView artworkView = arlVar.b;
        if (artworkView.getHeight() == 0) {
            return;
        }
        int i3 = -0;
        if (i > i3) {
            i = i3;
        }
        int height = artworkView.getHeight();
        int i4 = height + i;
        float f = i2;
        float f2 = height;
        float f3 = f / f2;
        if (height != i2) {
            float fP2 = yoi1.p(i4, i2, Math.max(i2, height)) / f2;
            artworkView.setScaleX(fP2);
            artworkView.setScaleY(fP2);
            artworkShadow.setScaleX(fP2);
            artworkShadow.setScaleY(fP2);
        }
        if (artworkView.getScaleX() > f3) {
            fP = 1.0f;
        } else {
            int i5 = i2 / 2;
            fP = (yoi1.p(i4, i5, i2) - i5) / (f / 2.0f);
        }
        artworkView.setAlpha(fP);
        artworkShadow.setAlpha(fP);
        if (artworkView.getY() != 0.0f && i <= 0) {
            float f4 = (-i) / 2.0f;
            artworkView.setTranslationY(f4);
            artworkShadow.setTranslationY(f4);
        }
    }

    public static final void a(nkb nkbVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1042212472);
        int i2 = (x340Var.i(qim0Var) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            t1c.a(dug.e(qim0Var, nkbVar.a, (hw61) null, 0.0f, 6), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hj8(nkbVar, qim0Var, i, (byte) 15);
        }
    }

    public static final void b(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1708240221);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarB = uyn1.B(u291.h(u291.f(qim0Var2, 1.0f), 16.0f), 0.0f, 10.0f, 0.0f, 0.0f, 13);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            t1c.a(u291.s(dug.f(qim0Var2, ((vex) zex.a.e).j, er31.a(100)), 32.0f, 4.0f), x340Var, 0);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var, i, (byte) 6);
        }
    }

    public static final void c(int i, b0k b0kVar, qim0 qim0Var, tob1 tob1Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1834323198);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(tob1Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            dui1 dui1VarS = byo1.s(((hux) wsx.c).a.b, x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = c97.b(0.0f);
                x340Var.s0(objT);
            }
            o95 o95Var = (o95) objT;
            boolean z = tob1Var != null;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zH = x340Var.h(z) | x340Var.i(o95Var);
            Object objT2 = x340Var.T();
            if (zH || objT2 == m4cVar) {
                objT2 = new yfy((byte) 1, o95Var, null, z);
                x340Var.s0(objT2);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT2);
            qim0 qim0VarN = anm1.N("full_bleed_logo_hologram", qim0Var);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = gce0.e;
                x340Var.s0(objT3);
            }
            qim0 qim0VarD = i541.D(j9k1.x(qim0VarN, (xu30) objT3), 0.0f, 0.0f, 0.64f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 1, (f2b) null, 983035);
            boolean zI = x340Var.i(tob1Var) | x340Var.i(o95Var) | x340Var.i(dui1VarS);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new lb50((Object) tob1Var, (Object) o95Var, (Object) dui1VarS, (byte) 27);
                x340Var.s0(objT4);
            }
            op71.g(x340Var, exd0.r(qim0VarD, (iu30) objT4));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(qim0Var, tob1Var, i, (byte) 29);
        }
    }

    public static final void d(jkr0 jkr0Var, idn0 idn0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1162841472);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(jkr0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(idn0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function1 = function0;
            i2 |= x340Var.i(function1) ? 256 : 128;
        } else {
            function1 = function0;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            ven0 ven0VarO = nb51.o(idn0Var, x340Var, (i2 >> 3) & 14);
            Boolean bool = (Boolean) ven0VarO.getValue();
            bool.booleanValue();
            Integer numValueOf = Integer.valueOf(jkr0Var.o());
            boolean zI = x340Var.i(ven0Var) | x340Var.i(ven0VarO) | x340Var.i(jkr0Var) | ((i2 & 896) == 256);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                wba1 wba1Var = new wba1(jkr0Var, function1, ven0Var, ven0VarO, (lnm) null, (byte) 20);
                x340Var.s0(wba1Var);
                objT2 = wba1Var;
            }
            qxd0.s(bool, numValueOf, (vu30) objT2, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1(jkr0Var, idn0Var, function0, i, (byte) 14);
        }
    }

    public static final void e(final j2i j2iVar, vu30 vu30Var, vu30 vu30Var2, lee1 lee1Var, final long j, long j2, b0k b0kVar, final int i) {
        vu30 vu30Var3;
        vu30 vu30Var4;
        lee1 lee1Var2;
        long j3;
        boolean z;
        int i2;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-931325388);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.i(j2iVar) ? 4 : 2) | (x340Var.i(vu30Var) ? 32 : 16) | (x340Var.i(vu30Var2) ? 256 : 128) | (x340Var.g(lee1Var) ? 2048 : 1024) | (x340Var.f(j) ? 16384 : 8192) | (x340Var.f(j2) ? 131072 : 65536);
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            float f = vu30Var2 == null ? 8.0f : 0.0f;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(nim0Var, 16.0f, 0.0f, f, 0.0f, 10);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new td4((byte) 17);
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iK = tgp1.k(x340Var);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(gfh0Var, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            llj lljVar3 = y580.R0;
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var, iK, lljVar3);
            }
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarZ = uyn1.z(0.0f, 6.0f, 1, t3k1.x(nim0Var, "text"));
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iK2 = tgp1.k(x340Var);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK2))) {
                z5c.f(iK2, x340Var, iK2, lljVar3);
            }
            nko1.H(qim0VarE2, x340Var, lljVar4);
            dv20.l(i3 & 14, j2iVar, x340Var, true);
            if (vu30Var != null) {
                x340Var.i0(-1014168049);
                qim0 qim0VarX = t3k1.x(nim0Var, "action");
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iK3 = tgp1.k(x340Var);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX);
                x340Var.m0();
                i2 = 8;
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK3))) {
                    z5c.f(iK3, x340Var, iK3, lljVar3);
                }
                nko1.H(qim0VarE3, x340Var, lljVar4);
                lee1Var2 = lee1Var;
                vu30Var3 = vu30Var;
                mod.c(new ely0[]{p3d1.o(j, wrl.a), q9e1.a.a(lee1Var2)}, vu30Var3, x340Var, 8 | (i3 & 112));
                x340Var.r(true);
                z = false;
                x340Var.r(false);
            } else {
                vu30Var3 = vu30Var;
                lee1Var2 = lee1Var;
                z = false;
                i2 = 8;
                x340Var.i0(-1013852841);
                x340Var.r(false);
            }
            if (vu30Var2 != null) {
                x340Var.i0(-1013804481);
                qim0 qim0VarX2 = t3k1.x(nim0Var, "dismissAction");
                gfh0 gfh0VarC3 = t1c.c(graVar, z);
                int iK4 = tgp1.k(x340Var);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarX2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var, lljVar);
                nko1.H(xos0VarM4, x340Var, lljVar2);
                if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK4))) {
                    z5c.f(iK4, x340Var, iK4, lljVar3);
                }
                nko1.H(qim0VarE4, x340Var, lljVar4);
                j3 = j2;
                vu30Var4 = vu30Var2;
                mod.b(p3d1.o(j3, wrl.a), vu30Var4, x340Var, i2 | ((i3 >> 3) & 112));
                z2 = true;
                x340Var.r(true);
                x340Var.r(false);
            } else {
                vu30Var4 = vu30Var2;
                j3 = j2;
                z2 = true;
                x340Var.i0(-1013535401);
                x340Var.r(z);
            }
            x340Var.r(z2);
        } else {
            vu30Var3 = vu30Var;
            vu30Var4 = vu30Var2;
            lee1Var2 = lee1Var;
            j3 = j2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            final long j4 = j3;
            final lee1 lee1Var3 = lee1Var2;
            final vu30 vu30Var5 = vu30Var4;
            final vu30 vu30Var6 = vu30Var3;
            h311VarV.d = new vu30(j2iVar, vu30Var6, vu30Var5, lee1Var3, j, j4, i) { // from class: p.vs91
                public final /* synthetic */ j2i a;
                public final /* synthetic */ vu30 b;
                public final /* synthetic */ vu30 c;
                public final /* synthetic */ lee1 d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = czo1.p(1);
                    brl.e(this.a, this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP);
                    return rih1.a;
                }
            };
        }
    }

    public static final void f(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        byte b2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(540596031);
        int i2 = i | (x340Var2.i(function0) ? 4 : 2) | (x340Var2.i(qim0Var) ? 32 : 16);
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 16.0f, 0.0f, cbx.b(x340Var2).b.b, 5);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            String strO0 = cwl1.o0(x340Var2, 2131957637);
            lee1 lee1Var = cbx.d(x340Var2).j;
            long j = cbx.a(x340Var2).b.a;
            cjc0 cjc0Var = new cjc0(1);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            b2 = 14;
            uwo1.e(strO0, uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 8.0f, 7), lee1Var, j, new a0e1(3), (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var2, 0, 0, 1696);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new tpj1(function0, (byte) 16);
                x340Var2.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), jdx.c, (qim0) null, (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, bsj.b, x340Var2, 0, 48, 2012);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            b2 = 14;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t531(function0, qim0Var, i, b2);
        }
    }

    public static final void g(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1762653562);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            xto1.e(h2c.a.a(nim0.a, een.h), 0, 0L, 0L, x340Var, 0, 14);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 26);
        }
    }

    public static final void h(gg31 gg31Var, ig31 ig31Var, b0k b0kVar, int i) {
        gg31 gg31Var2;
        ig31 ig31Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(784112049);
        int i2 = (x340Var.g(gg31Var) ? 4 : 2) | i | (x340Var.i(ig31Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gg31Var2 = gg31Var;
            ig31Var2 = ig31Var;
            otw.c(ig31Var2, gg31Var2, (qim0) null, (ipb1) null, x340Var, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 12);
        } else {
            gg31Var2 = gg31Var;
            ig31Var2 = ig31Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tc11(gg31Var2, ig31Var2, i, (byte) 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0113  */
    /* JADX WARN: Code duplicated, block: B:105:0x011f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0121  */
    /* JADX WARN: Code duplicated, block: B:109:0x012a  */
    /* JADX WARN: Code duplicated, block: B:111:0x013d  */
    /* JADX WARN: Code duplicated, block: B:127:0x016b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x016d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0170  */
    /* JADX WARN: Code duplicated, block: B:132:0x0175  */
    /* JADX WARN: Code duplicated, block: B:134:0x0178  */
    /* JADX WARN: Code duplicated, block: B:137:0x017e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0185  */
    /* JADX WARN: Code duplicated, block: B:141:0x018a  */
    /* JADX WARN: Code duplicated, block: B:142:0x0192  */
    /* JADX WARN: Code duplicated, block: B:145:0x0198  */
    /* JADX WARN: Code duplicated, block: B:146:0x019e  */
    /* JADX WARN: Code duplicated, block: B:149:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:156:0x020d  */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00da  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:97:0x0103  */
    /* JADX WARN: Code duplicated, block: B:99:0x010b  */
    public static final void i(qim0 qim0Var, vu30 vu30Var, vu30 vu30Var2, hw61 hw61Var, long j, long j2, long j3, long j4, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        vu30 vu30Var3;
        int i4;
        vu30 vu30Var4;
        int i5;
        int i6;
        hw61 hw61Var2;
        int i7;
        j2i j2iVar2;
        boolean z;
        qim0 qim0Var2;
        long j5;
        vu30 vu30Var5;
        vu30 vu30Var6;
        hw61 hw61Var3;
        long j6;
        long j7;
        h311 h311VarV;
        qim0 qim0Var3;
        hw61 hw61VarB;
        long jE;
        long jE2;
        long jE3;
        long j8;
        vu30 vu30Var7;
        vu30 vu30Var8;
        long j9;
        int i8;
        int i9;
        int i10;
        int i11;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1218779924);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                vu30Var3 = vu30Var;
                i3 |= x340Var.i(vu30Var3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    vu30Var4 = vu30Var2;
                    if (x340Var.i(vu30Var4)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    if (x340Var.h(false)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        hw61Var2 = hw61Var;
                        int i14 = x340Var.g(hw61Var2) ? 16384 : 8192;
                        i3 |= i14;
                    } else {
                        hw61Var2 = hw61Var;
                    }
                    i3 |= i14;
                } else {
                    hw61Var2 = hw61Var;
                }
                if ((196608 & i) != 0) {
                    if (x340Var.f(j)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) != 0) {
                    if ((i2 & 64) == 0 || !x340Var.f(j2)) {
                        i10 = 524288;
                    } else {
                        i10 = 1048576;
                    }
                    i3 |= i10;
                }
                if ((12582912 & i) == 0) {
                    if ((i2 & 128) == 0) {
                        i7 = i12;
                        int i15 = x340Var.f(j3) ? 8388608 : 4194304;
                        i3 |= i15;
                    } else {
                        i7 = i12;
                    }
                    i3 |= i15;
                } else {
                    i7 = i12;
                }
                if ((100663296 & i) != 0) {
                    if ((i2 & 256) == 0 || !x340Var.f(j4)) {
                        i9 = 33554432;
                    } else {
                        i9 = 67108864;
                    }
                    i3 |= i9;
                }
                if ((805306368 & i) == 0) {
                    j2iVar2 = j2iVar;
                    if (x340Var.i(j2iVar2)) {
                        i8 = 536870912;
                    } else {
                        i8 = 268435456;
                    }
                    i3 |= i8;
                } else {
                    j2iVar2 = j2iVar;
                }
                if ((i3 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0 || x340Var.E()) {
                        if (i7 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if (i13 != 0) {
                            vu30Var3 = null;
                        }
                        if (i4 != 0) {
                            vu30Var4 = null;
                        }
                        if ((i2 & 16) != 0) {
                            hw61VarB = px61.b(x340Var, 5);
                            i3 &= -57345;
                        } else {
                            hw61VarB = hw61Var2;
                        }
                        if ((i2 & 64) != 0) {
                            jE = eah.e(x340Var, 4);
                            i3 &= -3670017;
                        } else {
                            jE = j2;
                        }
                        if ((i2 & 128) != 0) {
                            jE2 = eah.e(x340Var, 5);
                            i3 &= -29360129;
                        } else {
                            jE2 = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            jE3 = eah.e(x340Var, 4);
                        } else {
                            jE3 = j4;
                        }
                        j8 = jE2;
                        vu30Var7 = vu30Var4;
                        long j10 = jE;
                        vu30Var8 = vu30Var3;
                        j9 = j10;
                    } else {
                        x340Var.b0();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i3 &= -29360129;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                        }
                        qim0Var3 = qim0Var;
                        j8 = j3;
                        jE3 = j4;
                        vu30Var8 = vu30Var3;
                        vu30Var7 = vu30Var4;
                        hw61VarB = hw61Var2;
                        j9 = j2;
                    }
                    x340Var.s();
                    j2i j2iVarR = apo.r(-1343524879, new bt91(vu30Var8, j2iVar2, vu30Var7, j8, jE3), x340Var);
                    int i16 = (i3 & 14) | 12779520;
                    int i17 = i3 >> 9;
                    w3d1.a(qim0Var3, hw61VarB, j, j9, 0.0f, 6.0f, (qqb) null, j2iVarR, x340Var, i16 | (i17 & 112) | (i17 & 896) | (i17 & 7168), 80);
                    j6 = j9;
                    vu30Var5 = vu30Var8;
                    vu30Var6 = vu30Var7;
                    j5 = jE3;
                    hw61Var3 = hw61VarB;
                    qim0Var2 = qim0Var3;
                    j7 = j8;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    j5 = j4;
                    vu30Var5 = vu30Var3;
                    vu30Var6 = vu30Var4;
                    hw61Var3 = hw61Var2;
                    j6 = j2;
                    j7 = j3;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new us91(qim0Var2, vu30Var5, vu30Var6, hw61Var3, j, j6, j7, j5, j2iVar, i, i2);
                }
            }
            i3 |= 384;
            vu30Var4 = vu30Var2;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (x340Var.h(false)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    hw61Var2 = hw61Var;
                    if (x340Var.g(hw61Var2)) {
                    }
                    i3 |= i14;
                } else {
                    hw61Var2 = hw61Var;
                }
                i3 |= i14;
            } else {
                hw61Var2 = hw61Var;
            }
            if ((196608 & i) != 0) {
                if (x340Var.f(j)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    i10 = 524288;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((12582912 & i) == 0) {
                if ((i2 & 128) == 0) {
                    i7 = i12;
                    if (x340Var.f(j3)) {
                    }
                    i3 |= i15;
                } else {
                    i7 = i12;
                }
                i3 |= i15;
            } else {
                i7 = i12;
            }
            if ((100663296 & i) != 0) {
                if ((i2 & 256) == 0) {
                    i9 = 33554432;
                } else {
                    i9 = 33554432;
                }
                i3 |= i9;
            }
            if ((805306368 & i) == 0) {
                j2iVar2 = j2iVar;
                if (x340Var.i(j2iVar2)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i3 |= i8;
            } else {
                j2iVar2 = j2iVar;
            }
            if ((i3 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i13 != 0) {
                        vu30Var3 = null;
                    }
                    if (i4 != 0) {
                        vu30Var4 = null;
                    }
                    if ((i2 & 16) != 0) {
                        hw61VarB = px61.b(x340Var, 5);
                        i3 &= -57345;
                    } else {
                        hw61VarB = hw61Var2;
                    }
                    if ((i2 & 64) != 0) {
                        jE = eah.e(x340Var, 4);
                        i3 &= -3670017;
                    } else {
                        jE = j2;
                    }
                    if ((i2 & 128) != 0) {
                        jE2 = eah.e(x340Var, 5);
                        i3 &= -29360129;
                    } else {
                        jE2 = j3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        jE3 = eah.e(x340Var, 4);
                    } else {
                        jE3 = j4;
                    }
                    j8 = jE2;
                    vu30Var7 = vu30Var4;
                    long j11 = jE;
                    vu30Var8 = vu30Var3;
                    j9 = j11;
                } else {
                    if (i7 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i13 != 0) {
                        vu30Var3 = null;
                    }
                    if (i4 != 0) {
                        vu30Var4 = null;
                    }
                    if ((i2 & 16) != 0) {
                        hw61VarB = px61.b(x340Var, 5);
                        i3 &= -57345;
                    } else {
                        hw61VarB = hw61Var2;
                    }
                    if ((i2 & 64) != 0) {
                        jE = eah.e(x340Var, 4);
                        i3 &= -3670017;
                    } else {
                        jE = j2;
                    }
                    if ((i2 & 128) != 0) {
                        jE2 = eah.e(x340Var, 5);
                        i3 &= -29360129;
                    } else {
                        jE2 = j3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        jE3 = eah.e(x340Var, 4);
                    } else {
                        jE3 = j4;
                    }
                    j8 = jE2;
                    vu30Var7 = vu30Var4;
                    long j12 = jE;
                    vu30Var8 = vu30Var3;
                    j9 = j12;
                }
                x340Var.s();
                j2i j2iVarR2 = apo.r(-1343524879, new bt91(vu30Var8, j2iVar2, vu30Var7, j8, jE3), x340Var);
                int i18 = (i3 & 14) | 12779520;
                int i19 = i3 >> 9;
                w3d1.a(qim0Var3, hw61VarB, j, j9, 0.0f, 6.0f, (qqb) null, j2iVarR2, x340Var, i18 | (i19 & 112) | (i19 & 896) | (i19 & 7168), 80);
                j6 = j9;
                vu30Var5 = vu30Var8;
                vu30Var6 = vu30Var7;
                j5 = jE3;
                hw61Var3 = hw61VarB;
                qim0Var2 = qim0Var3;
                j7 = j8;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                j5 = j4;
                vu30Var5 = vu30Var3;
                vu30Var6 = vu30Var4;
                hw61Var3 = hw61Var2;
                j6 = j2;
                j7 = j3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new us91(qim0Var2, vu30Var5, vu30Var6, hw61Var3, j, j6, j7, j5, j2iVar, i, i2);
            }
        }
        i3 |= 48;
        vu30Var3 = vu30Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                vu30Var4 = vu30Var2;
                if (x340Var.i(vu30Var4)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (x340Var.h(false)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    hw61Var2 = hw61Var;
                    if (x340Var.g(hw61Var2)) {
                    }
                    i3 |= i14;
                } else {
                    hw61Var2 = hw61Var;
                }
                i3 |= i14;
            } else {
                hw61Var2 = hw61Var;
            }
            if ((196608 & i) != 0) {
                if (x340Var.f(j)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    i10 = 524288;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((12582912 & i) == 0) {
                if ((i2 & 128) == 0) {
                    i7 = i12;
                    if (x340Var.f(j3)) {
                    }
                    i3 |= i15;
                } else {
                    i7 = i12;
                }
                i3 |= i15;
            } else {
                i7 = i12;
            }
            if ((100663296 & i) != 0) {
                if ((i2 & 256) == 0) {
                    i9 = 33554432;
                } else {
                    i9 = 33554432;
                }
                i3 |= i9;
            }
            if ((805306368 & i) == 0) {
                j2iVar2 = j2iVar;
                if (x340Var.i(j2iVar2)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i3 |= i8;
            } else {
                j2iVar2 = j2iVar;
            }
            if ((i3 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i13 != 0) {
                        vu30Var3 = null;
                    }
                    if (i4 != 0) {
                        vu30Var4 = null;
                    }
                    if ((i2 & 16) != 0) {
                        hw61VarB = px61.b(x340Var, 5);
                        i3 &= -57345;
                    } else {
                        hw61VarB = hw61Var2;
                    }
                    if ((i2 & 64) != 0) {
                        jE = eah.e(x340Var, 4);
                        i3 &= -3670017;
                    } else {
                        jE = j2;
                    }
                    if ((i2 & 128) != 0) {
                        jE2 = eah.e(x340Var, 5);
                        i3 &= -29360129;
                    } else {
                        jE2 = j3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        jE3 = eah.e(x340Var, 4);
                    } else {
                        jE3 = j4;
                    }
                    j8 = jE2;
                    vu30Var7 = vu30Var4;
                    long j13 = jE;
                    vu30Var8 = vu30Var3;
                    j9 = j13;
                } else {
                    if (i7 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i13 != 0) {
                        vu30Var3 = null;
                    }
                    if (i4 != 0) {
                        vu30Var4 = null;
                    }
                    if ((i2 & 16) != 0) {
                        hw61VarB = px61.b(x340Var, 5);
                        i3 &= -57345;
                    } else {
                        hw61VarB = hw61Var2;
                    }
                    if ((i2 & 64) != 0) {
                        jE = eah.e(x340Var, 4);
                        i3 &= -3670017;
                    } else {
                        jE = j2;
                    }
                    if ((i2 & 128) != 0) {
                        jE2 = eah.e(x340Var, 5);
                        i3 &= -29360129;
                    } else {
                        jE2 = j3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        jE3 = eah.e(x340Var, 4);
                    } else {
                        jE3 = j4;
                    }
                    j8 = jE2;
                    vu30Var7 = vu30Var4;
                    long j14 = jE;
                    vu30Var8 = vu30Var3;
                    j9 = j14;
                }
                x340Var.s();
                j2i j2iVarR3 = apo.r(-1343524879, new bt91(vu30Var8, j2iVar2, vu30Var7, j8, jE3), x340Var);
                int i110 = (i3 & 14) | 12779520;
                int i111 = i3 >> 9;
                w3d1.a(qim0Var3, hw61VarB, j, j9, 0.0f, 6.0f, (qqb) null, j2iVarR3, x340Var, i110 | (i111 & 112) | (i111 & 896) | (i111 & 7168), 80);
                j6 = j9;
                vu30Var5 = vu30Var8;
                vu30Var6 = vu30Var7;
                j5 = jE3;
                hw61Var3 = hw61VarB;
                qim0Var2 = qim0Var3;
                j7 = j8;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                j5 = j4;
                vu30Var5 = vu30Var3;
                vu30Var6 = vu30Var4;
                hw61Var3 = hw61Var2;
                j6 = j2;
                j7 = j3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new us91(qim0Var2, vu30Var5, vu30Var6, hw61Var3, j, j6, j7, j5, j2iVar, i, i2);
            }
        }
        i3 |= 384;
        vu30Var4 = vu30Var2;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (x340Var.h(false)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                hw61Var2 = hw61Var;
                if (x340Var.g(hw61Var2)) {
                }
                i3 |= i14;
            } else {
                hw61Var2 = hw61Var;
            }
            i3 |= i14;
        } else {
            hw61Var2 = hw61Var;
        }
        if ((196608 & i) != 0) {
            if (x340Var.f(j)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i3 |= i11;
        }
        if ((1572864 & i) != 0) {
            if ((i2 & 64) == 0) {
                i10 = 524288;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((12582912 & i) == 0) {
            if ((i2 & 128) == 0) {
                i7 = i12;
                if (x340Var.f(j3)) {
                }
                i3 |= i15;
            } else {
                i7 = i12;
            }
            i3 |= i15;
        } else {
            i7 = i12;
        }
        if ((100663296 & i) != 0) {
            if ((i2 & 256) == 0) {
                i9 = 33554432;
            } else {
                i9 = 33554432;
            }
            i3 |= i9;
        }
        if ((805306368 & i) == 0) {
            j2iVar2 = j2iVar;
            if (x340Var.i(j2iVar2)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i3 |= i8;
        } else {
            j2iVar2 = j2iVar;
        }
        if ((i3 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var;
                }
                if (i13 != 0) {
                    vu30Var3 = null;
                }
                if (i4 != 0) {
                    vu30Var4 = null;
                }
                if ((i2 & 16) != 0) {
                    hw61VarB = px61.b(x340Var, 5);
                    i3 &= -57345;
                } else {
                    hw61VarB = hw61Var2;
                }
                if ((i2 & 64) != 0) {
                    jE = eah.e(x340Var, 4);
                    i3 &= -3670017;
                } else {
                    jE = j2;
                }
                if ((i2 & 128) != 0) {
                    jE2 = eah.e(x340Var, 5);
                    i3 &= -29360129;
                } else {
                    jE2 = j3;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    jE3 = eah.e(x340Var, 4);
                } else {
                    jE3 = j4;
                }
                j8 = jE2;
                vu30Var7 = vu30Var4;
                long j15 = jE;
                vu30Var8 = vu30Var3;
                j9 = j15;
            } else {
                if (i7 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var;
                }
                if (i13 != 0) {
                    vu30Var3 = null;
                }
                if (i4 != 0) {
                    vu30Var4 = null;
                }
                if ((i2 & 16) != 0) {
                    hw61VarB = px61.b(x340Var, 5);
                    i3 &= -57345;
                } else {
                    hw61VarB = hw61Var2;
                }
                if ((i2 & 64) != 0) {
                    jE = eah.e(x340Var, 4);
                    i3 &= -3670017;
                } else {
                    jE = j2;
                }
                if ((i2 & 128) != 0) {
                    jE2 = eah.e(x340Var, 5);
                    i3 &= -29360129;
                } else {
                    jE2 = j3;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    jE3 = eah.e(x340Var, 4);
                } else {
                    jE3 = j4;
                }
                j8 = jE2;
                vu30Var7 = vu30Var4;
                long j16 = jE;
                vu30Var8 = vu30Var3;
                j9 = j16;
            }
            x340Var.s();
            j2i j2iVarR4 = apo.r(-1343524879, new bt91(vu30Var8, j2iVar2, vu30Var7, j8, jE3), x340Var);
            int i112 = (i3 & 14) | 12779520;
            int i113 = i3 >> 9;
            w3d1.a(qim0Var3, hw61VarB, j, j9, 0.0f, 6.0f, (qqb) null, j2iVarR4, x340Var, i112 | (i113 & 112) | (i113 & 896) | (i113 & 7168), 80);
            j6 = j9;
            vu30Var5 = vu30Var8;
            vu30Var6 = vu30Var7;
            j5 = jE3;
            hw61Var3 = hw61VarB;
            qim0Var2 = qim0Var3;
            j7 = j8;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            j5 = j4;
            vu30Var5 = vu30Var3;
            vu30Var6 = vu30Var4;
            hw61Var3 = hw61Var2;
            j6 = j2;
            j7 = j3;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new us91(qim0Var2, vu30Var5, vu30Var6, hw61Var3, j, j6, j7, j5, j2iVar, i, i2);
        }
    }

    public static final void j(final wr91 wr91Var, qim0 qim0Var, hw61 hw61Var, long j, long j2, long j3, long j4, long j5, b0k b0kVar, final int i) {
        int i2;
        b0k b0kVar2;
        final qim0 qim0Var2;
        final hw61 hw61Var2;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final long j10;
        long jE;
        qim0 qim0Var3;
        long j11;
        int i3;
        hw61 hw61Var3;
        long j12;
        long j13;
        long j14;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(274621471);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(wr91Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i & 3072) == 0) {
            i4 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        if (b0kVar3.Y(i4 & 1, (38347923 & i4) != 38347922)) {
            b0kVar3.d0();
            if ((i & 1) == 0 || b0kVar3.E()) {
                hw61 hw61VarB = px61.b(b0kVar3, 5);
                long jE2 = eah.e(b0kVar3, 6);
                long jE3 = eah.e(b0kVar3, 4);
                jE = eah.e(b0kVar3, 5);
                long jE4 = eah.e(b0kVar3, 5);
                long jE5 = eah.e(b0kVar3, 4);
                qim0Var3 = nim0.a;
                j11 = jE5;
                i3 = i4 & (-268434433);
                hw61Var3 = hw61VarB;
                j12 = jE2;
                j13 = jE3;
                j14 = jE4;
            } else {
                b0kVar3.b0();
                i3 = i4 & (-268434433);
                qim0Var3 = qim0Var;
                hw61Var3 = hw61Var;
                j12 = j;
                j13 = j2;
                jE = j3;
                j14 = j4;
                j11 = j5;
            }
            b0kVar3.s();
            wr91Var.a.getClass();
            b0kVar3.i0(-663517017);
            b0kVar3.r(false);
            wr91Var.a.getClass();
            b0kVar3.i0(-662974393);
            b0kVar3.r(false);
            b0kVar2 = b0kVar3;
            i(uyn1.x(qim0Var3, 12.0f), null, null, hw61Var3, j12, j13, j14, j11, apo.r(-1266389126, new ct91(wr91Var, (byte) 0), b0kVar3), b0kVar2, ((i3 << 3) & 7168) | 805306368, 0);
            qim0Var2 = qim0Var3;
            j8 = jE;
            hw61Var2 = hw61Var3;
            j6 = j12;
            j7 = j13;
            j9 = j14;
            j10 = j11;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
            hw61Var2 = hw61Var;
            j6 = j;
            j7 = j2;
            j8 = j3;
            j9 = j4;
            j10 = j5;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.ss91
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = czo1.p(i | 1);
                    brl.j(wr91Var, qim0Var2, hw61Var2, j6, j7, j8, j9, j10, (b0k) obj, iP);
                    return rih1.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public static final void k(fbp fbpVar, cce cceVar, q9l1 q9l1Var, q9l1 q9l1Var2, jkr0 jkr0Var, jjr0 jjr0Var, akr0 akr0Var, boolean z, Consumer consumer, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        Consumer consumer2;
        jjr0 jjr0Var2;
        b0k b0kVar2;
        qim0 qim0Var2;
        Object obj;
        Object mxj1Var;
        Object obj2;
        ven0 ven0Var;
        ?? r13;
        Consumer consumer3;
        Consumer consumer4;
        ven0 ven0Var2;
        ven0 ven0Var3;
        jjr0 jjr0Var3;
        Object bj81Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2010309169);
        int i2 = i | (b0kVar3.g(fbpVar) ? 4 : 2) | (b0kVar3.i(cceVar) ? 32 : 16) | (b0kVar3.i(q9l1Var) ? 256 : 128) | (b0kVar3.g(q9l1Var2) ? 2048 : 1024) | (b0kVar3.i(jkr0Var) ? 16384 : 8192) | (b0kVar3.i(jjr0Var) ? 131072 : 65536) | (b0kVar3.i(akr0Var) ? 1048576 : 524288) | (b0kVar3.h(z) ? 8388608 : 4194304) | (b0kVar3.i(consumer) ? 67108864 : 33554432) | (b0kVar3.i(function0) ? 536870912 : 268435456);
        ?? r17 = 1;
        r17 = 1;
        if (b0kVar3.Y(i2 & 1, (i2 & 306783379) != 306783378)) {
            ven0 ven0VarS = v8r.s(function0, b0kVar3);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                obj = objT;
                hrr0 hrr0VarQ = v8r.q(Boolean.FALSE);
                b0kVar3.s0(hrr0VarQ);
                obj = hrr0VarQ;
            }
            obj = objT;
            ven0 ven0Var4 = (ven0) obj;
            Integer numValueOf = Integer.valueOf(jkr0Var.l());
            boolean zI = b0kVar3.i(jkr0Var) | b0kVar3.i(ven0Var4);
            Object objT2 = b0kVar3.T();
            Object obj3 = objT2;
            if (zI || objT2 == m4cVar) {
                w621 w621Var = new w621(jkr0Var, ven0Var4, (lnm) null, (byte) 28);
                b0kVar3.s0(w621Var);
                obj3 = w621Var;
            }
            qxd0.t(numValueOf, b0kVar3, (vu30) obj3);
            Boolean bool = (Boolean) ven0Var4.getValue();
            bool.getClass();
            boolean zI2 = b0kVar3.i(ven0Var4) | b0kVar3.i(jjr0Var) | b0kVar3.i(consumer);
            Object objT3 = b0kVar3.T();
            if (zI2 || objT3 == m4cVar) {
                obj2 = null;
                ven0Var = ven0Var4;
                r13 = 0;
                consumer3 = consumer;
                mxj1Var = new mxj1(jjr0Var, consumer3, ven0Var, (lnm) null, (byte) 5);
                b0kVar3.s0(mxj1Var);
            } else {
                obj2 = null;
                ven0Var = ven0Var4;
                r13 = 0;
                consumer3 = consumer;
                mxj1Var = objT3;
            }
            qxd0.t(bool, b0kVar3, (vu30) mxj1Var);
            Object objT4 = b0kVar3.T();
            Object objH = objT4;
            if (objT4 == m4cVar) {
                objH = bb00.h(r13, b0kVar3);
            }
            hdn0 hdn0Var = (hdn0) objH;
            if (
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 p.jjr0
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 701
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.brl.k(p.fbp, p.cce, p.q9l1, p.q9l1, p.jkr0, p.jjr0, p.akr0, boolean, com.spotify.mobius.functions.Consumer, kotlin.jvm.functions.Function0, p.qim0, p.b0k, int):void");
        }

        public static final void l(ven0 ven0Var, boolean z) {
            ven0Var.setValue(Boolean.valueOf(z));
        }

        public static final int m(int i, bfn0 bfn0Var) {
            int i2 = bfn0Var.c - 1;
            int i3 = 0;
            while (i3 < i2) {
                int iF = l1d.f(i2, i3, 2, i3);
                Object[] objArr = bfn0Var.a;
                int i4 = ((g890) objArr[iF]).a;
                if (i4 != i) {
                    if (i4 < i) {
                        i3 = iF + 1;
                        if (i < ((g890) objArr[i3]).a) {
                        }
                    } else {
                        i2 = iF - 1;
                    }
                }
                return iF;
            }
            return i3;
        }

        public static final String n(long j) {
            long j2 = j / 3600;
            long j3 = (j % 3600) / 60;
            long j4 = j % 60;
            MeasureFormat measureFormat = MeasureFormat.getInstance(Locale.forLanguageTag(upn1.p()), MeasureFormat.FormatWidth.NARROW);
            smc0 smc0VarN = k4p1.n();
            if (j2 >= 1) {
                smc0VarN.add(new Measure(Long.valueOf(j2), MeasureUnit.HOUR));
                smc0VarN.add(new Measure(Long.valueOf(j3), MeasureUnit.MINUTE));
                smc0VarN.add(new Measure(Long.valueOf(j4), MeasureUnit.SECOND));
            } else if (j3 >= 1) {
                smc0VarN.add(new Measure(Long.valueOf(j3), MeasureUnit.MINUTE));
                smc0VarN.add(new Measure(Long.valueOf(j4), MeasureUnit.SECOND));
            } else {
                smc0VarN.add(new Measure(Long.valueOf(j4), MeasureUnit.SECOND));
            }
            Measure[] measureArr = (Measure[]) k4p1.k(smc0VarN).toArray(new Measure[0]);
            return measureFormat.formatMeasures((Measure[]) Arrays.copyOf(measureArr, measureArr.length));
        }

        public static final String o(long j) {
            try {
                Locale localeForLanguageTag = Locale.forLanguageTag(upn1.p());
                String str = Instant.ofEpochSecond(j).atZone(ZoneId.systemDefault()).toLocalDate().format(DateTimeFormatter.ofPattern(DateTimePatternGenerator.getInstance(localeForLanguageTag).getBestPattern("MMMd"), localeForLanguageTag));
                str.getClass();
                return str;
            } catch (Exception unused) {
                return "";
            }
        }

        public static final Long p(d7d d7dVar) {
            if (d7dVar instanceof z6d) {
                return Long.valueOf(((z6d) d7dVar).c);
            }
            if (d7dVar instanceof w6d) {
                return Long.valueOf(((w6d) d7dVar).c);
            }
            return null;
        }

        public static final String q(eek eekVar, boolean z) {
            Iterator it = (z ? p7h.M(new String[]{"time_component_fcfs_before_sale_collapsed", "time_component_fcfs_before_sale"}) : Collections.singletonList("time_component_fcfs_before_sale")).iterator();
            while (it.hasNext()) {
                String strR = r(eekVar, (String) it.next());
                if (strR != null) {
                    return strR;
                }
            }
            return null;
        }

        public static final String r(eek eekVar, String str) {
            String strT = t(eekVar, str);
            if (strT == null || strT.length() <= 0) {
                return null;
            }
            return strT;
        }

        public static final Long s(d7d d7dVar) {
            if (d7dVar instanceof z6d) {
                return Long.valueOf(((z6d) d7dVar).b);
            }
            if (d7dVar instanceof w6d) {
                return Long.valueOf(((w6d) d7dVar).b);
            }
            return null;
        }

        public static final String t(eek eekVar, String str) {
            Object next;
            if (eekVar != null) {
                Iterator it = eekVar.a.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((h7d) next).a.equals(str));
                h7d h7dVar = (h7d) next;
                if (h7dVar != null) {
                    return h7dVar.b;
                }
            }
            return null;
        }

        public static final e7m0 u(f8j1 f8j1Var, rve0 rve0Var, a aVar, fc3 fc3Var, h8j1 h8j1Var) {
            return sbl.z(f8j1Var, rve0Var, aVar, fc3Var, h8j1Var);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:188:0x02d1  */
        /* JADX WARN: Code duplicated, block: B:189:0x02d3  */
        /* JADX WARN: Failed to find 'out' block for switch in B:169:0x029a. Please report as an issue. */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r27v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v17, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v2 */
        public static final t2w0 v(z2w0 z2w0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            String str;
            long epochMilli;
            String str2;
            String str3;
            ?? SingletonList;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ljd0 ljd0Var;
            int i;
            String str4;
            int i2;
            boolean z7;
            String str5;
            String str6;
            String str7;
            Iterator it;
            List list;
            String str8;
            Boolean bool;
            String str9;
            String str10;
            String str11;
            String str12 = z2w0Var.b;
            boolean z8 = z2w0Var.Z;
            r8l1 r8l1Var = z2w0Var.c;
            long j = 0;
            if (r8l1Var != null) {
                try {
                    str = r8l1Var.g;
                } catch (Exception unused) {
                    epochMilli = 0;
                }
            } else {
                str = null;
            }
            epochMilli = Instant.parse(str).toEpochMilli();
            if (epochMilli > 0 && z6 && z3 && z4 && z8) {
                j = 259200000;
            }
            String str13 = z2w0Var.a;
            boolean z9 = z2w0Var.t;
            String str14 = (r8l1Var == null || (str11 = r8l1Var.b) == null) ? "" : str11;
            String str15 = (r8l1Var == null || (str10 = r8l1Var.c) == null) ? "" : str10;
            String str16 = (r8l1Var == null || (str9 = r8l1Var.g) == null) ? "" : str9;
            boolean zBooleanValue = (r8l1Var == null || (bool = r8l1Var.h) == null) ? false : bool.booleanValue();
            String str17 = (r8l1Var == null || (str8 = r8l1Var.i) == null) ? "" : str8;
            List list2 = r8l1Var != null ? r8l1Var.a : null;
            long j2 = epochMilli + j;
            String str18 = str12 == null ? "" : str12;
            String str19 = z2w0Var.X;
            if (r8l1Var == null || (list = r8l1Var.t) == null) {
                String str20 = r8l1Var != null ? r8l1Var.d : null;
                if (r8l1Var == null || (str2 = r8l1Var.e) == null) {
                    str2 = "";
                }
                if (r8l1Var == null || (str3 = r8l1Var.f) == null) {
                    str3 = "";
                }
                SingletonList = Collections.singletonList(new nyv0(str3, str2, str20));
            } else {
                List<ib6> list3 = list;
                SingletonList = new ArrayList(q7h.U(list3, 10));
                for (ib6 ib6Var : list3) {
                    SingletonList.add(new nyv0(ib6Var.a, ib6Var.b, ib6Var.c));
                }
            }
            j2w0 j2w0Var = new j2w0(str15, str14, zBooleanValue, str16, str17, z, list2, j2, str18, true, true, str19, (List) SingletonList, z8 && z3 && z4);
            List list4 = z2w0Var.d;
            ArrayList arrayList4 = z6x.a;
            if (list4 != null) {
                List list5 = list4;
                ArrayList arrayList5 = new ArrayList(q7h.U(list5, 10));
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    n3w0 n3w0Var = (n3w0) it2.next();
                    String str21 = n3w0Var.b;
                    List list6 = n3w0Var.c;
                    String str22 = n3w0Var.a;
                    String str23 = n3w0Var.e;
                    String str24 = str12;
                    if (str22 != null) {
                        it = it2;
                        boolean z10 = u890.j(n3w0Var.d, Boolean.TRUE);
                        arrayList5.add(new o3w0(str21, list6, str22, str23, false, false, false, false, true, z10, n3w0Var.f, (PlayabilityRestriction) null));
                        it2 = it;
                        str12 = str24;
                    } else {
                        it = it2;
                    }
                    arrayList5.add(new o3w0(str21, list6, str22, str23, false, false, false, false, true, z10, n3w0Var.f, (PlayabilityRestriction) null));
                    it2 = it;
                    str12 = str24;
                }
                arrayList = arrayList5;
            } else {
                arrayList = arrayList4;
            }
            String str25 = str12;
            List list7 = z2w0Var.f;
            if (list7 != null) {
                List<do10> list8 = list7;
                ArrayList arrayList6 = new ArrayList(q7h.U(list8, 10));
                for (do10 do10Var : list8) {
                    arrayList6.add(new a3w0(do10Var.a, new vgu0(do10Var.c, do10Var.b)));
                }
                arrayList2 = arrayList6;
            } else {
                arrayList2 = arrayList4;
            }
            String str26 = z2w0Var.g;
            String str27 = str26 == null ? "" : str26;
            String str28 = z2w0Var.h;
            String str29 = str25 == null ? "" : str25;
            List list9 = z2w0Var.i;
            if (list9 != null) {
                ArrayList<zti0> arrayList7 = new ArrayList();
                for (Object obj : list9) {
                    zti0 zti0Var = (zti0) obj;
                    String str30 = zti0Var.d;
                    if (str30 != null && !ihc1.y0(str30) && (str7 = zti0Var.b) != null && !ihc1.y0(str7)) {
                        arrayList7.add(obj);
                    }
                }
                ArrayList arrayList8 = new ArrayList(q7h.U(arrayList7, 10));
                for (zti0 zti0Var2 : arrayList7) {
                    String str31 = zti0Var2.a;
                    String str32 = str31 == null ? "" : str31;
                    String str33 = zti0Var2.d;
                    String str34 = str33 == null ? "" : str33;
                    String str35 = zti0Var2.b;
                    arrayList8.add(new gui0(str32, str34, str35 == null ? "" : str35, zti0Var2.c, zti0Var2.e));
                }
                arrayList3 = arrayList8;
            } else {
                arrayList3 = arrayList4;
            }
            List list10 = z2w0Var.e;
            if (list10 != null) {
                List<qcl1> list11 = list10;
                arrayList4 = new ArrayList(q7h.U(list11, 10));
                for (qcl1 qcl1Var : list11) {
                    String str36 = qcl1Var.a;
                    kjj1 kjj1Var = new kjj1(qcl1Var.b);
                    String str37 = str28;
                    arrayList4.add(new s3w0(str36, (r8l1Var == null || (str6 = r8l1Var.e) == null) ? "" : str6, qcl1Var.c, kjj1Var, qcl1Var.f, qcl1Var.e ? k4m.a : qcl1Var.d ? k4m.b : k4m.d));
                    str28 = str37;
                }
            }
            String str38 = str28;
            ajd0 ajd0Var = z2w0Var.Y;
            if (ajd0Var != null) {
                wid0 wid0Var = ajd0Var.a;
                String str39 = wid0Var.a;
                String str40 = ajd0Var.b.a;
                switch (str40.hashCode()) {
                    case -1669082995:
                        if (str40.equals("SCHEDULED")) {
                            i2 = 1;
                        } else {
                            i = 3;
                            i2 = i;
                        }
                        break;
                    case -933681182:
                        str4 = "ARCHIVED";
                        str40.equals(str4);
                        i = 3;
                        i2 = i;
                        break;
                    case 2337004:
                        if (str40.equals("LIVE")) {
                            i = 2;
                        } else {
                            i = 3;
                        }
                        i2 = i;
                        break;
                    case 77848963:
                        if (str40.equals("READY")) {
                            i2 = 1;
                        } else {
                            i = 3;
                            i2 = i;
                        }
                        break;
                    case 367655838:
                        str4 = "SCRAPPED";
                        str40.equals(str4);
                        i = 3;
                        i2 = i;
                        break;
                    case 1990776172:
                        str4 = "CLOSED";
                        str40.equals(str4);
                        i = 3;
                        i2 = i;
                        break;
                    case 2089318684:
                        if (str40.equals("UPCOMING")) {
                            i2 = 1;
                        } else {
                            i = 3;
                            i2 = i;
                        }
                        break;
                    default:
                        i = 3;
                        i2 = i;
                        break;
                }
                String str41 = wid0Var.c;
                String str42 = wid0Var.e;
                String str43 = ajd0Var.c.b;
                String str44 = ajd0Var.d.a;
                switch (str44.hashCode()) {
                    case -1852689755:
                        str5 = "NON_PREMIUM";
                        str44.equals(str5);
                        z7 = true;
                        break;
                    case -1704237378:
                        str5 = "GEO_BLOCKED";
                        str44.equals(str5);
                        z7 = true;
                        break;
                    case 1560629625:
                        str5 = "AGE_GATED";
                        str44.equals(str5);
                        z7 = true;
                        break;
                    case 1781954094:
                        if (str44.equals("NO_RESTRICTION")) {
                            z7 = false;
                            break;
                        }
                    default:
                        z7 = true;
                        break;
                }
                ljd0Var = new ljd0(str39, i2, str41, str42, str43, z7, wid0Var.d, false);
            } else {
                ljd0Var = null;
            }
            boolean z11 = z2w0Var.Z;
            return new t2w0(str13, j2w0Var, arrayList, arrayList4, arrayList2, str27, str38, str29, arrayList3, (Boolean) null, (Boolean) null, z9, ljd0Var, z2, false, z11, z3 && !z4 && z11, z3 && z11, z5);
        }

        public static final ven0 w(int i, int i2, int i3, String str, b0k b0kVar, dlv dlvVar, boolean z, boolean z2) {
            return zod.S(new hsi1(l1d.k(i, str, "-"), Float.valueOf(0.0f), Float.valueOf(1.0f), new pxg1(i3, i2, dlvVar), rno1.a), z, z2, (Function0) null, b0kVar, 8, 8);
        }

        public static final int x(d7d d7dVar, yqg yqgVar) {
            Long lS;
            if (d7dVar == null || (lS = s(d7dVar)) == null) {
                return 1;
            }
            long jLongValue = lS.longValue();
            long jB = yqgVar.b() / 1000;
            if (jB < jLongValue) {
                return 1;
            }
            Long lP = p(d7dVar);
            return (lP == null || jB >= lP.longValue()) ? 3 : 2;
        }

        public static ko41 y(e340 e340Var) {
            r3z0 r3z0Var = (r3z0) o7h.C0(e340Var.i);
            if (r3z0Var != null) {
                int i = r3z0Var.d;
                if (r3z0Var.b != null) {
                    if (i == 0) {
                        return ko41.b;
                    }
                    for (mo41 mo41Var : e340Var.c) {
                        if (mo41Var.b == i) {
                            return mo41Var.a;
                        }
                    }
                    bhn0.t("Collection contains no element matching the predicate.");
                    return null;
                }
            }
            return ko41.a;
        }

        public static Next z(kak0 kak0Var, v2k0 v2k0Var) {
            mmr0 mmr0Var;
            s69 s69Var = v2k0Var.b;
            s69 s69Var2 = v2k0Var.c;
            bpo bpoVar = v2k0Var.e;
            q6w0 q6w0Var = kak0Var.S0.a;
            r920 r920Var = q6w0Var.Y;
            if (r920Var == null) {
                r920Var = new r920((s69) null, (s69) null, (s69) null);
            }
            r920 r920Var2 = q6w0Var.Z;
            if (r920Var2 == null) {
                r920Var2 = new r920((s69) null, (s69) null, (s69) null);
            }
            int iOrdinal = v2k0Var.a.ordinal();
            if (iOrdinal == 0) {
                mmr0Var = new mmr0(cxm.C(r920Var, bpoVar, s69Var), cxm.y(r920Var2, bpoVar, s69Var2));
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                mmr0Var = new mmr0(cxm.y(r920Var, bpoVar, s69Var2), cxm.C(r920Var2, bpoVar, s69Var));
            }
            return x1p1.t(x1p1.B(x1p1.x(x1p1.F(Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(kak0Var.S0, q6w0.a(q6w0Var, (buk1) null, (hez) null, (fa20) null, (px30) null, (taa0) null, (k7f0) null, (s69) null, (s69) null, (gez) null, (gez) null, (r920) mmr0Var.a, (r920) mmr0Var.b, (ox30) null, (ox30) null, (x6b) null, 59391), (ruq0) null, false, false, 14), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -262145, 1048575)), kak0Var))), 1);
        }
    }
