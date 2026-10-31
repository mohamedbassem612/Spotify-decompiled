package p;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import com.spotify.allboarding.entrypoint.EntryPoint;
import com.spotify.mobius.Next;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class x2g0 {
    public static volatile js50 a;
    public static final int[] b = {R.attr.drawable, R.attr.title, R.attr.text};
    public static b180 c;
    public static b180 d;

    public static ScheduledExecutorService A() {
        if (a != null) {
            return a;
        }
        synchronized (x2g0.class) {
            try {
                if (a == null) {
                    a = new js50(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    public static final ic90 B(ty31 ty31Var) {
        return new ic90(ty31Var);
    }

    public static final boolean D(xou xouVar) {
        fa61 fa61Var = xouVar.e;
        boolean z = fa61Var.a;
        boolean z2 = fa61Var.b;
        n0u0 n0u0Var = xouVar.c;
        return z && !z2 && n0u0Var.a && n0u0Var.b && !xouVar.b.a;
    }

    public static final qim0 E(b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        tl7 tl7Var = (tl7) x340Var.k(rce0.a);
        boolean zI = x340Var.i(tl7Var);
        Object objT = x340Var.T();
        if (zI || objT == fkj0.X) {
            objT = new ibf1(tl7Var, (byte) 10);
            x340Var.s0(objT);
        }
        return qim0Var.then(new l5q0((iu30) objT));
    }

    public static final Next F(xou xouVar, uou uouVar) {
        fa61 fa61Var = xouVar.e;
        if (uouVar instanceof rou) {
            return Next.h(xou.a(xouVar, (String) null, (r3l) null, (n0u0) null, fa61.a(fa61Var, 2), new fa61(3), 7));
        }
        if (uouVar instanceof qou) {
            return Next.h(xou.a(xouVar, (String) null, (r3l) null, (n0u0) null, (fa61) null, fa61.a(fa61Var, 2), 15));
        }
        boolean z = uouVar instanceof tou;
        nou nouVar = nou.a;
        if (z) {
            PlayerState playerState = ((tou) uouVar).a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            xou xouVarA = xou.a(xouVar, (String) null, (r3l) null, new n0u0(playerState.contextUri().equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq"), !playerState.isPaused() && playerState.isPlaying()), (fa61) null, (fa61) null, 27);
            if (D(xouVarA)) {
                linkedHashSet.add(nouVar);
            }
            return Next.i(xouVarA, linkedHashSet);
        }
        if (!(uouVar instanceof pou)) {
            if (uouVar instanceof sou) {
                return Next.h(xou.a(xouVar, ((sou) uouVar).a, (r3l) null, (n0u0) null, (fa61) null, fa61.a(fa61Var, 1), 14));
            }
            eg.o();
            return null;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        l0l l0lVar = ((pou) uouVar).a;
        xou xouVarA2 = xou.a(xouVar, (String) null, new r3l(l0lVar != null ? l0lVar.I() : false), (n0u0) null, (fa61) null, (fa61) null, 29);
        if (D(xouVarA2)) {
            linkedHashSet2.add(nouVar);
        }
        return Next.i(xouVarA2, linkedHashSet2);
    }

    public static final void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1821600500);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.h(z) ? 4 : 2) | (b0kVar2.i(function0) ? 32 : 16) | 384;
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var3);
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
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var3);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarY = too1.y(qim0VarZ, lhc.g(b0kVar2).e);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarY);
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
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(qim0Var3, 12.0f));
            boolean z3 = (i2 & 112) == 32;
            Object objT = b0kVar2.T();
            if (z3 || objT == fkj0.X) {
                objT = new ugj(function0, (byte) 16);
                b0kVar2.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), new idx(4), u291.f(qim0Var3, 1.0f), z ? new hax("loading") : jax.a, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-386519161, new dr0((byte) 14, z), b0kVar2), b0kVar2, 0, 48, 2024);
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            uwo1.e(ydh.g(12.0f, 2131952780, b0kVar2, b0kVar2, qim0Var3), u291.f(qim0Var3, 1.0f), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
            b0kVar2 = b0kVar2;
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            x0d.s(qim0Var3, 16.0f, b0kVar2, true);
            t1c.a(dug.e(eqr0.D(0.0f, -cbx.b(b0kVar2).b.a, 1, h2c.a.a(u291.h(u291.f(qim0Var3, 1.0f), cbx.b(b0kVar2).b.a), een.e)), v9c.s(p7h.M(new u7h[]{new u7h(u7h.j), new u7h(cbx.a(b0kVar2).a.c)}), 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), b0kVar2, 0);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new le3(z, function0, qim0Var2, i, (byte) 5);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(oxk oxkVar, iu30 iu30Var, boolean z, nu nuVar, e27 e27Var, qim0 qim0Var, int i, boolean z2, boolean z3, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int i3;
        boolean z4;
        qim0 qim0Var2;
        boolean z5;
        byte b2;
        String strK;
        int i4;
        oxk oxkVar2;
        qxk qxkVar;
        String str;
        Uri uri;
        iu30 iu30Var2 = iu30Var;
        qxk qxkVar2 = oxkVar.b;
        boolean z6 = oxkVar.j;
        era eraVar = een.Q0;
        s781 s781Var = oxkVar.f;
        sxk sxkVar = oxkVar.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-490045700);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(oxkVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(iu30Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z4 = z;
            i3 |= x340Var.h(z4) ? 256 : 128;
        } else {
            z4 = z;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(nuVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.i(e27Var) ? 16384 : 8192;
        }
        int i5 = i3 | 196608;
        if ((i2 & 1572864) == 0) {
            i5 |= x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= x340Var.h(z2) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i5 |= x340Var.h(z3) ? 67108864 : 33554432;
        }
        int i6 = i5;
        if (x340Var.Y(i6 & 1, (i6 & 38347923) != 38347922)) {
            boolean z7 = !z6;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = aok.f;
                x340Var.s0(objT);
            }
            q3p1.b(48, 0, (Function0) objT, x340Var, z6);
            gmc1 gmc1Var = oxkVar.h;
            if (gmc1Var == null) {
                x340Var.i0(-356982899);
                x340Var.r(false);
                z5 = false;
            } else {
                x340Var.i0(-356982898);
                boolean z8 = (i6 & 112) == 32;
                Object objT2 = x340Var.T();
                if (z8 || objT2 == m4cVar) {
                    objT2 = new lck(iu30Var2, (byte) 17);
                    x340Var.s0(objT2);
                }
                z5 = false;
                f(gmc1Var, (Function0) objT2, x340Var, 0);
                x340Var.r(false);
            }
            mrn mrnVar = oxkVar.r;
            if (mrnVar == null) {
                x340Var.i0(-356805920);
                x340Var.r(z5);
            } else {
                x340Var.i0(-356805919);
                boolean z9 = (i6 & 112) == 32;
                Object objT3 = x340Var.T();
                if (z9 || objT3 == m4cVar) {
                    objT3 = new lck(iu30Var2, (byte) 18);
                    x340Var.s0(objT3);
                }
                c(mrnVar, (Function0) objT3, x340Var, 0);
                x340Var.r(false);
            }
            int iOrdinal = oxkVar.n.ordinal();
            if (iOrdinal == 0) {
                b2 = 2;
                x340Var.i0(1512518016);
                x340Var.r(false);
            } else if (iOrdinal == 1) {
                b2 = 2;
                x340Var.i0(1512519363);
                u(oxkVar, iu30Var2, x340Var, i6 & 126);
                x340Var.r(false);
            } else if (iOrdinal == 2) {
                x340Var.i0(1512522755);
                dyh1 dyh1Var = oxkVar.o;
                mrn mrnVar2 = oxkVar.r;
                boolean z10 = oxkVar.q;
                boolean z11 = (v8r.o(sxkVar) && z2) ? false : z4;
                String strO0 = cwl1.o0(x340Var, v8r.o(sxkVar) ? 2131952841 : 2131952826);
                String str2 = v8r.o(sxkVar) ? s781Var.b : "";
                if (v8r.o(sxkVar)) {
                    str = str2;
                    uri = Uri.parse(s781Var.c);
                } else {
                    str = str2;
                    String str3 = oxkVar.A;
                    if (str3.length() <= 0) {
                        str3 = null;
                    }
                    uri = str3 != null ? Uri.parse(str3) : null;
                }
                b2 = 2;
                fqo1.c(dyh1Var, mrnVar2, z10, iu30Var, z11, strO0, str, uri, x340Var, (i6 << 6) & 7168);
                iu30Var2 = iu30Var;
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                if (iOrdinal != 3) {
                    throw p3d1.k(x340Var, 1512517301, false);
                }
                x340Var.i0(1512549506);
                uel uelVarN = qxd0.N(oxkVar);
                int i7 = i6 & 112;
                boolean z12 = i7 == 32;
                Object objT4 = x340Var.T();
                if (z12 || objT4 == m4cVar) {
                    objT4 = new usj(iu30Var2, (byte) 17);
                    x340Var.s0(objT4);
                }
                iu30 iu30Var3 = (iu30) objT4;
                boolean z13 = i7 == 32;
                Object objT5 = x340Var.T();
                if (z13 || objT5 == m4cVar) {
                    objT5 = new lck(iu30Var2, (byte) 19);
                    x340Var.s0(objT5);
                }
                j541.a(uelVarN, iu30Var3, (Function0) objT5, x340Var, 0);
                x340Var.r(false);
                b2 = 2;
            }
            e1r0 e1r0Var = new e1r0(b2);
            int i8 = i6 & 112;
            boolean z14 = i8 == 32;
            Object objT6 = x340Var.T();
            if (z14 || objT6 == m4cVar) {
                objT6 = new usj(iu30Var2, (byte) 18);
                x340Var.s0(objT6);
            }
            ihg0 ihg0VarE = p1p1.E(e1r0Var, (iu30) objT6, x340Var);
            boolean z15 = z2 && !oxkVar.b().isEmpty();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z16 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z16) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarD2 = u291.d(qim0Var3, 1.0f);
            era eraVar2 = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar2, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD2);
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
            if (v8r.o(sxkVar)) {
                x340Var.i0(98394789);
                x340Var.r(false);
                strK = s781Var.b;
            } else {
                strK = x0d.k(x340Var, 98395641, 2131952798, x340Var, false);
            }
            String str4 = strK;
            boolean zO = v8r.o(sxkVar);
            boolean z17 = i8 == 32;
            Object objT7 = x340Var.T();
            if (z17 || objT7 == m4cVar) {
                objT7 = new lck(iu30Var2, (byte) 20);
                x340Var.s0(objT7);
            }
            Function0 function0 = (Function0) objT7;
            boolean z18 = i8 == 32;
            Object objT8 = x340Var.T();
            if (z18 || objT8 == m4cVar) {
                objT8 = new lck(iu30Var2, (byte) 21);
                x340Var.s0(objT8);
            }
            x340 x340Var2 = x340Var;
            otw.c(nuVar, new m060(str4, i, zO, z7, function0, (Function0) objT8), (qim0) null, (ipb1) null, x340Var2, (i6 >> 9) & 14, 12);
            x340Var = x340Var2;
            if (!(((double) 1.0f) > 0.0d)) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarH = l6o1.H(new wnb0(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), l6o1.C(0, 0, 1, x340Var), false, 14);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarH);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar2, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 16.0f));
            if (z15) {
                x340Var.i0(1174078144);
                c380 c380VarB = oxkVar.b();
                oxkVar2 = oxkVar;
                int i9 = oxkVar2.t;
                boolean zO2 = v8r.o(sxkVar);
                cvx cvxVar3 = cbx.b(x340Var).b;
                i4 = 32;
                boolean z19 = i8 == 32;
                Object objT9 = x340Var.T();
                if (z19 || objT9 == m4cVar) {
                    objT9 = new v0j(iu30Var2, (byte) 16);
                    x340Var.s0(objT9);
                }
                vu30 vu30Var = (vu30) objT9;
                boolean zI = x340Var.i(oxkVar2) | (i8 == 32);
                Object objT10 = x340Var.T();
                if (zI || objT10 == m4cVar) {
                    objT10 = new kjk(oxkVar2, iu30Var2, (byte) 9);
                    x340Var.s0(objT10);
                }
                iu30 iu30Var4 = (iu30) objT10;
                boolean zI2 = x340Var.i(ihg0VarE);
                Object objT11 = x340Var.T();
                if (zI2 || objT11 == m4cVar) {
                    objT11 = new ezk(ihg0VarE, (byte) 0);
                    x340Var.s0(objT11);
                }
                Function0 function1 = (Function0) objT11;
                boolean z20 = i8 == 32;
                Object objT12 = x340Var.T();
                if (z20 || objT12 == m4cVar) {
                    objT12 = new lck(iu30Var2, (byte) 22);
                    x340Var.s0(objT12);
                }
                otw.c(e27Var, new c27(c380VarB, i9, zO2, vu30Var, iu30Var4, function1, (Function0) objT12), anm1.N("confirmation_artwork", u291.f(qim0Var3, 1.0f).then(new tq60(eraVar))), (ipb1) null, x340Var, (i6 >> 12) & 14, 8);
                x340Var = x340Var;
                x340Var.r(false);
                qxkVar = qxkVar2;
            } else {
                i4 = 32;
                oxkVar2 = oxkVar;
                x340Var.i0(1175564997);
                qxkVar = qxkVar2;
                String str5 = qxkVar.b;
                boolean z21 = oxkVar2.m;
                boolean z22 = i8 == 32;
                Object objT13 = x340Var.T();
                if (z22 || objT13 == m4cVar) {
                    objT13 = new lck(iu30Var2, (byte) 23);
                    x340Var.s0(objT13);
                }
                n(0, str5, (Function0) objT13, x340Var, anm1.N("confirmation_artwork", u291.f(qim0Var3, 0.6f).then(new tq60(eraVar))), z21);
                x340Var.r(false);
            }
            op71.g(x340Var, u291.h(qim0Var3, cbx.b(x340Var).b.a));
            String str6 = qxkVar.a;
            boolean z23 = !ihc1.y0(oxkVar2.i);
            boolean z24 = i8 == i4;
            Object objT14 = x340Var.T();
            if (z24 || objT14 == m4cVar) {
                objT14 = new lck(iu30Var2, (byte) 24);
                x340Var.s0(objT14);
            }
            x(0, str6, (Function0) objT14, x340Var, null, z23);
            op71.g(x340Var, u291.h(qim0Var3, cbx.b(x340Var).b.a));
            oxk oxkVar3 = oxkVar2;
            t(oxkVar3, iu30Var2, z3, null, x340Var, (i6 & 126) | ((i6 >> 18) & 896));
            cvx cvxVar4 = cbx.b(x340Var).b;
            x0d.s(qim0Var3, 16.0f, x340Var, true);
            boolean z25 = i8 == i4;
            Object objT15 = x340Var.T();
            if (z25 || objT15 == m4cVar) {
                objT15 = new lck(iu30Var2, (byte) 25);
                x340Var.s0(objT15);
            }
            a(0, (Function0) objT15, x340Var, null, z6);
            x340Var.r(true);
            if (oxkVar3.k) {
                x340Var.i0(1757989806);
                j(null, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1758018636);
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
            h311VarV.d = new fzk(oxkVar, iu30Var2, z, nuVar, e27Var, qim0Var2, i, z2, z3, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(mrn mrnVar, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        Function0 function1;
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1405321693);
        int i2 = (x340Var.g(mrnVar) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (mrnVar instanceof lrn) {
                x340Var.i0(1402823993);
                strK = ((lrn) mrnVar).a;
                if (strK.length() == 0) {
                    strK = cwl1.o0(x340Var, 2131952823);
                }
                x340Var.r(false);
            } else {
                if (!u890.j(mrnVar, krn.a)) {
                    throw p3d1.k(x340Var, -1894412521, false);
                }
                strK = x0d.k(x340Var, -1894406947, 2131952823, x340Var, false);
            }
            String strO0 = cwl1.o0(x340Var, 2131952824);
            String strO1 = cwl1.o0(x340Var, 2131952822);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ugj(function0, (byte) 17);
                x340Var.s0(objT);
            }
            String str = strK;
            function1 = function0;
            mqo1.d(function1, (i3u) null, (hux) null, strO0, str, new zgx(strO1, new gbx(z50.c, (Function0) objT)), (zgx) null, x340Var, ((i2 >> 3) & 14) | 262144, 70);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jjk(mrnVar, function1, i, (byte) 9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v19 */
    public static final void d(hob1 hob1Var, vu30 vu30Var, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, qim0 qim0Var, boolean z, boolean z2, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        Function0 function0;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1643966511);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(hob1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(vu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(j2iVar3) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            i3 |= x340Var.h(z) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= x340Var.h(z2) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            cr00 cr00Var = hob1Var.h;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = uyn1.B(qim0Var3, 16.0f, 16.0f, 0.0f, 0.0f, 12);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int i4 = i3;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            rih1 rih1Var = null;
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z4) {
                x340Var.l(function1);
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
            qim0 qim0VarR = u291.r(uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, 16.0f, 7), 208.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarR);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            qim0 qim0VarO = sto1.o(u291.d(qim0Var3, 1.0f), 10.0f, er31.b(9.09f), false, 0L, 0L, 28);
            Uri uri = Uri.parse(cr00Var.d);
            fwx fwxVarG = hso1.G(box.c, 0L, u7h.b(bth.n(cr00Var, x340Var), 1.0f, 0.0f, 0.0f, 0.0f, 14), x340Var, box.d, 22);
            eso1.e(uri, isl.a, qim0VarO, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, x340Var, 1073744944, 0, 3568);
            x340Var = x340Var;
            x340Var.r(true);
            qim0 qim0VarH = u291.h(qim0Var3, 224.0f);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarH);
            x340Var.m0();
            if (x340Var.S) {
                function0 = function1;
                x340Var.l(function0);
            } else {
                function0 = function1;
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            qim0 qim0VarB2 = uyn1.B(kk0.q(x340Var, qim0VarE3, lljVar4, 1.0f, true), 16.0f, 0.0f, 16.0f, 0.0f, 10);
            mbh mbhVarA3 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA3, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            if (vu30Var == null) {
                x340Var.i0(-1721775953);
                z3 = 0;
                x340Var.r(false);
            } else {
                z3 = 0;
                x340Var.i0(1884121490);
                us71.j((i4 >> 3) & 14, vu30Var, x340Var, false);
            }
            ch7 ch7Var = hob1Var.x;
            if (ch7Var == null) {
                x340Var.i0(-1721727345);
                x340Var.r(z3);
            } else {
                x340Var.i0(-1721727344);
                q(ch7Var, x340Var, z3);
                x340Var.r(z3);
                rih1Var = rih1.a;
            }
            if (rih1Var == null) {
                x340Var.i0(1884125083);
                bth.g(cr00Var, j2iVar, z, true, false, (qim0) null, false, z2, x340Var, ((i4 >> 3) & 112) | 27648 | ((i4 >> 12) & 896) | (i4 & 29360128), 96);
                x340Var = x340Var;
                x340Var.r(z3);
            } else {
                x340Var.i0(1884122479);
                x340Var.r(z3);
            }
            x340Var.r(true);
            int i5 = i4 >> 6;
            bth.c((qim0) null, j2iVar2, j2iVar3, true, x340Var, (i5 & 112) | 3072 | (i5 & 896), 1);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rf6(hob1Var, vu30Var, j2iVar, j2iVar2, j2iVar3, qim0Var2, z, z2, i);
        }
    }

    public static final void e(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1264322600);
        int i2 = i | 6 | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131961093);
            idx idxVar = new idx(4);
            gdx gdxVarR = yla.r(x340Var);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new kek0(function0, (byte) 21);
                x340Var.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function1);
            j2i j2iVarR = apo.r(355012839, new tej0(strO0, (byte) 26), x340Var);
            qim0Var2 = nim0.a;
            foo1.c(gbxVar, idxVar, qim0Var2, jax.a, gdxVarR, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, j2iVarR, x340Var, 384, 48, 1992);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(qim0Var2, function0, i, (byte) 15);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void f(gmc1 gmc1Var, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        Function0 function1;
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1361934677);
        int i2 = (x340Var.g(gmc1Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            function1 = function0;
            x340Var.b0();
        } else if ((gmc1Var instanceof emc1) || (gmc1Var instanceof fmc1)) {
            function1 = function0;
            x340Var.i0(-1145795142);
            voo1.h(gmc1Var, function1, x340Var, i2 & 126);
            x340Var.r(false);
        } else {
            if (!(gmc1Var instanceof dmc1) && !(gmc1Var instanceof cmc1)) {
                throw p3d1.k(x340Var, -1145797658, false);
            }
            x340Var.i0(-1159753707);
            if (gmc1Var instanceof cmc1) {
                x340Var.i0(-1145787108);
                x340Var.r(false);
                strK = ((cmc1) gmc1Var).a;
            } else {
                strK = x0d.k(x340Var, -1145786213, 2131952782, x340Var, false);
            }
            function1 = function0;
            w2g0.d((i2 << 6) & 7168, cwl1.o0(x340Var, 2131952784), strK, cwl1.o0(x340Var, 2131952783), function1, x340Var);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gzk(gmc1Var, function1, i, (byte) 0);
        }
    }

    public static final void g(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1206708565);
        int i2 = (x340Var.i(function0) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131962340);
            String strO1 = cwl1.o0(x340Var, 2131962339);
            String strO2 = cwl1.o0(x340Var, 2131962343);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new zg20(function0, (byte) 17);
                x340Var.s0(objT);
            }
            y3o1.d(new cbo0(strO0, strO1, new bbo0(strO2, (Function0) objT), 8), qim0Var, x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(qim0Var, function0, i, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void h(int i, hcx hcxVar, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int i3;
        lee1 lee1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2116626688);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(hcxVar.ordinal()) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            float fA = hcxVar.a(x340Var);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = exd0.r(u291.h(u291.x(fA, 0.0f, 2, nim0Var), hcxVar.a(x340Var)), mr90.b);
            cr31 cr31Var = er31.a;
            qim0 qim0VarQ = i1p1.q(qim0VarR, cr31Var);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarQ, cbx.a(x340Var).a.b.a(), cr31Var);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            float fA2 = hcxVar.a(x340Var) * 0.3f;
            String strC = f4i1.c(i, "+");
            switch (hcxVar.ordinal()) {
                case 0:
                    x340Var.i0(-971308856);
                    lee1Var = cbx.d(x340Var).n;
                    x340Var.r(false);
                    break;
                case 1:
                    x340Var.i0(-971311159);
                    lee1Var = cbx.d(x340Var).k;
                    x340Var.r(false);
                    break;
                case 2:
                    x340Var.i0(-971313303);
                    lee1Var = cbx.d(x340Var).k;
                    x340Var.r(false);
                    break;
                case 3:
                    x340Var.i0(-971315194);
                    lee1Var = cbx.d(x340Var).e;
                    x340Var.r(false);
                    break;
                case 4:
                    x340Var.i0(-971317145);
                    lee1Var = cbx.d(x340Var).d;
                    x340Var.r(false);
                    break;
                case 5:
                    x340Var.i0(-971319158);
                    lee1Var = cbx.d(x340Var).b;
                    x340Var.r(false);
                    break;
                case 6:
                    x340Var.i0(-971306680);
                    lee1Var = cbx.d(x340Var).n;
                    x340Var.r(false);
                    break;
                default:
                    throw p3d1.k(x340Var, -971320967, false);
            }
            uwo1.e(strC, uyn1.z(fA2, 0.0f, 2, nim0Var), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1784);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hl9(i, hcxVar, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:100:0x0106  */
    /* JADX WARN: Code duplicated, block: B:101:0x0108  */
    /* JADX WARN: Code duplicated, block: B:103:0x010c  */
    /* JADX WARN: Code duplicated, block: B:104:0x010f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0113  */
    /* JADX WARN: Code duplicated, block: B:107:0x0115  */
    /* JADX WARN: Code duplicated, block: B:111:0x0125  */
    /* JADX WARN: Code duplicated, block: B:113:0x012f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0139  */
    /* JADX WARN: Code duplicated, block: B:117:0x0153  */
    /* JADX WARN: Code duplicated, block: B:119:0x015d  */
    /* JADX WARN: Code duplicated, block: B:126:0x017d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0181  */
    /* JADX WARN: Code duplicated, block: B:130:0x0184 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x0186  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:144:0x022f  */
    /* JADX WARN: Code duplicated, block: B:146:0x0248  */
    /* JADX WARN: Code duplicated, block: B:149:0x0258 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x025d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0261  */
    /* JADX WARN: Code duplicated, block: B:155:0x027a  */
    /* JADX WARN: Code duplicated, block: B:158:0x028f  */
    /* JADX WARN: Code duplicated, block: B:161:0x02a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:168:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:171:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:172:0x0323  */
    /* JADX WARN: Code duplicated, block: B:175:0x0347  */
    /* JADX WARN: Code duplicated, block: B:177:0x034b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0362  */
    /* JADX WARN: Code duplicated, block: B:182:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:83:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:97:0x0100  */
    /* JADX WARN: Code duplicated, block: B:98:0x0102  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(c380 c380Var, qim0 qim0Var, hcx hcxVar, hux huxVar, int i, gbx gbxVar, String str, b0k b0kVar, int i2, int i3) throws NoWhenBranchMatchedException {
        c380<my90> c380Var2;
        int i4;
        qim0 qim0Var2;
        int i5;
        int iOrdinal;
        int i6;
        int i7;
        boolean zI;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z;
        hux huxVar2;
        int i15;
        String str2;
        b0k b0kVar2;
        qim0 qim0Var3;
        hcx hcxVar2;
        gbx gbxVar2;
        h311 h311VarV;
        qim0 qim0Var4;
        hcx hcxVar3;
        hux huxVar3;
        gbx gbxVar3;
        String str3;
        int i16;
        ArrayList arrayList;
        int size;
        boolean z2;
        byte b2;
        byte b3;
        nr90 nr90Var;
        int i17;
        gbx gbxVar4;
        String str4;
        qim0 qim0Var5;
        float fA;
        Object objT;
        m4c m4cVar;
        idn0 idn0Var;
        byte b4;
        qim0 qim0Var6;
        qim0 qim0VarV;
        Object objT2;
        boolean zD;
        Object objT3;
        gfh0 gfh0Var;
        gbx gbxVar5;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        b0k b0kVar3;
        String str5;
        boolean z3;
        boolean z4;
        phx phxVar;
        String str6;
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(160745378);
        if ((i2 & 6) == 0) {
            c380Var2 = c380Var;
            i4 = (b0kVar4.i(c380Var2) ? 4 : 2) | i2;
        } else {
            c380Var2 = c380Var;
            i4 = i2;
        }
        int i18 = i3 & 2;
        if (i18 == 0) {
            if ((i2 & 48) == 0) {
                qim0Var2 = qim0Var;
                i4 |= b0kVar4.i(qim0Var2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                if (hcxVar == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = hcxVar.ordinal();
                }
                if (b0kVar4.e(iOrdinal)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                if ((i2 & 4096) == 0) {
                    zI = b0kVar4.g(huxVar);
                } else {
                    zI = b0kVar4.i(huxVar);
                }
                if (zI) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i4 |= i8;
            }
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    if (b0kVar4.e(i)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    if ((196608 & i2) == 0) {
                        if (b0kVar4.i(gbxVar)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                    i13 = i3 & 64;
                    if (i13 != 0) {
                        if ((1572864 & i2) == 0) {
                            if (b0kVar4.g(str)) {
                                i14 = 1048576;
                            } else {
                                i14 = 524288;
                            }
                            i4 |= i14;
                        }
                        byte b5 = 1;
                        if ((i4 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar4.Y(i4 & 1, z)) {
                            if (i18 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i5 != 0) {
                                hcxVar3 = hcx.b;
                            } else {
                                hcxVar3 = hcxVar;
                            }
                            if (i7 != 0) {
                                huxVar3 = null;
                            } else {
                                huxVar3 = huxVar;
                            }
                            if (i9 != 0) {
                                i15 = 4;
                            } else {
                                i15 = i;
                            }
                            if (i11 != 0) {
                                gbxVar3 = null;
                            } else {
                                gbxVar3 = gbxVar;
                            }
                            if (i13 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (huxVar3 != null) {
                                i16 = 1;
                            } else {
                                i16 = 0;
                            }
                            arrayList = new ArrayList();
                            for (my90 my90Var : c380Var2) {
                                if (my90Var instanceof my90) {
                                    my90 my90Var2 = my90Var;
                                    str6 = my90Var2.a;
                                    if (str6 == null) {
                                        str6 = "";
                                    }
                                    phxVar = new phx(8, 0L, str6, my90Var2.b, my90Var2.c);
                                } else {
                                    if (u890.j(my90Var, ly90.a)) {
                                        eg.o();
                                        return;
                                    }
                                    phxVar = null;
                                }
                                if (phxVar != null) {
                                    arrayList.add(phxVar);
                                }
                            }
                            size = c380Var2.size() - arrayList.size();
                            int i19 = i15 - i16;
                            int size2 = arrayList.size() + size;
                            if (size == 1 || size2 > i19) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (size != 0 || z2) {
                                b2 = 1;
                                b3 = 0;
                                c380 c380VarA = mqo1.A(arrayList);
                                if (!z2) {
                                    size = 0;
                                }
                                nr90Var = new nr90(c380VarA, i15, size);
                            } else {
                                int iMin = Math.min(arrayList.size(), i19 - 1);
                                ArrayList arrayList2 = new ArrayList(size);
                                int i20 = 0;
                                while (i20 < size) {
                                    arrayList2.add(new phx(8, 0L, "", f4i1.c(i20, "hidden-"), ""));
                                    i20++;
                                    b5 = b5;
                                }
                                b2 = b5;
                                b3 = 0;
                                nr90Var = new nr90(mqo1.A(o7h.N0(arrayList2, arrayList)), iMin + 1 + i16, 0);
                            }
                            i17 = nr90Var.c;
                            if (i17 == 0) {
                                b0kVar4.i0(-122507003);
                                int i21 = (i4 & 112) | 8 | (i4 & 896) | 4096 | (i4 & 7168);
                                int i22 = i4 << 3;
                                boolean z5 = b3;
                                qim0 qim0Var7 = qim0Var4;
                                fc11.a(nr90Var.a, qim0Var7, hcxVar3, huxVar3, false, nr90Var.b, gbxVar3, str3, (idn0) null, b0kVar4, i21 | (3670016 & i22) | (i22 & 29360128), 272);
                                b0kVar4.r(z5);
                                b0kVar3 = b0kVar4;
                                gbxVar5 = gbxVar3;
                                str5 = str3;
                                qim0Var6 = qim0Var7;
                            } else {
                                byte b6 = b3;
                                gbxVar4 = gbxVar3;
                                str4 = str3;
                                qim0Var5 = qim0Var4;
                                b0kVar4.i0(-122187145);
                                fA = hcxVar3.a(b0kVar4);
                                objT = b0kVar4.T();
                                m4cVar = fkj0.X;
                                if (objT == m4cVar) {
                                    objT = ktd.n(b0kVar4);
                                }
                                idn0Var = (idn0) objT;
                                if (nr90Var.a.isEmpty() || huxVar3 != null) {
                                    b4 = b2;
                                } else {
                                    b4 = b6;
                                }
                                if (gbxVar4 != null) {
                                    qim0VarV = bin.v(qim0Var5, idn0Var, ny3.a, false, gbxVar4.c, (pm31) null, gbxVar4.b, 20);
                                    qim0Var6 = qim0Var5;
                                } else {
                                    qim0Var6 = qim0Var5;
                                    qim0VarV = qim0Var6;
                                }
                                qim0 qim0VarA = s161.a(qim0VarV, new thx(str4, gbxVar4, b2));
                                objT2 = b0kVar4.T();
                                if (objT2 == m4cVar) {
                                    objT2 = o390.d1;
                                    b0kVar4.s0(objT2);
                                }
                                qim0 qim0VarC = i541.C(qim0VarA, (iu30) objT2);
                                zD = b0kVar4.d(fA);
                                objT3 = b0kVar4.T();
                                if (zD || objT3 == m4cVar) {
                                    objT3 = new j37((byte) 5, fA);
                                    b0kVar4.s0(objT3);
                                }
                                gfh0Var = (gfh0) objT3;
                                gbxVar5 = gbxVar4;
                                iHashCode = Long.hashCode(((x340) b0kVar4).T);
                                xos0VarM = b0kVar4.m();
                                qim0VarE = zr7.E(b0kVar4, qim0VarC);
                                hzj.A.getClass();
                                if (((x340) b0kVar4).a != null) {
                                    tgp1.p();
                                    throw null;
                                }
                                b0kVar4.m0();
                                if (((x340) b0kVar4).S) {
                                    b0kVar4.l(hmb0.t1);
                                } else {
                                    b0kVar4.v0();
                                }
                                nko1.H(gfh0Var, b0kVar4, y580.O0);
                                nko1.H(xos0VarM, b0kVar4, y580.N0);
                                nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
                                nko1.F(b0kVar4);
                                nko1.H(qim0VarE, b0kVar4, y580.Y);
                                if (b4 != 0) {
                                    b0kVar4.i0(-1062221041);
                                    str5 = str4;
                                    z3 = true;
                                    fc11.a(nr90Var.a, (qim0) null, hcxVar3, huxVar3, false, nr90Var.b, (gbx) null, (String) null, (idn0) null, b0kVar4, (i4 & 896) | 4104 | (i4 & 7168), 466);
                                    b0kVar3 = b0kVar4;
                                    z4 = false;
                                    b0kVar3.r(false);
                                } else {
                                    b0kVar3 = b0kVar4;
                                    str5 = str4;
                                    z3 = true;
                                    z4 = false;
                                    b0kVar3.i0(-1062024997);
                                    b0kVar3.r(false);
                                }
                                h(i17, hcxVar3, b0kVar3, (i4 >> 3) & 112);
                                b0kVar3.r(z3);
                                b0kVar3.r(z4);
                            }
                            gbxVar2 = gbxVar5;
                            str2 = str5;
                            b0kVar2 = b0kVar3;
                            hcxVar2 = hcxVar3;
                            huxVar2 = huxVar3;
                            qim0Var3 = qim0Var6;
                        } else {
                            b0kVar4.b0();
                            huxVar2 = huxVar;
                            i15 = i;
                            str2 = str;
                            b0kVar2 = b0kVar4;
                            qim0Var3 = qim0Var2;
                            hcxVar2 = hcxVar;
                            gbxVar2 = gbxVar;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new lr90(c380Var, qim0Var3, hcxVar2, huxVar2, i15, gbxVar2, str2, i2, i3);
                        }
                    }
                    i4 |= 1572864;
                    byte b7 = 1;
                    if ((i4 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar4.Y(i4 & 1, z)) {
                        if (i18 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            hcxVar3 = hcx.b;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i7 != 0) {
                            huxVar3 = null;
                        } else {
                            huxVar3 = huxVar;
                        }
                        if (i9 != 0) {
                            i15 = 4;
                        } else {
                            i15 = i;
                        }
                        if (i11 != 0) {
                            gbxVar3 = null;
                        } else {
                            gbxVar3 = gbxVar;
                        }
                        if (i13 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (huxVar3 != null) {
                            i16 = 1;
                        } else {
                            i16 = 0;
                        }
                        arrayList = new ArrayList();
                        while (r7.hasNext()) {
                            if (my90Var instanceof my90) {
                                my90 my90Var3 = my90Var;
                                str6 = my90Var3.a;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                phxVar = new phx(8, 0L, str6, my90Var3.b, my90Var3.c);
                            } else {
                                if (u890.j(my90Var, ly90.a)) {
                                    eg.o();
                                    return;
                                }
                                phxVar = null;
                            }
                            if (phxVar != null) {
                                arrayList.add(phxVar);
                            }
                        }
                        size = c380Var2.size() - arrayList.size();
                        int i110 = i15 - i16;
                        int size3 = arrayList.size() + size;
                        if (size == 1) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (size != 0) {
                            b2 = 1;
                            b3 = 0;
                            c380 c380VarA2 = mqo1.A(arrayList);
                            if (!z2) {
                                size = 0;
                            }
                            nr90Var = new nr90(c380VarA2, i15, size);
                        } else {
                            b2 = 1;
                            b3 = 0;
                            c380 c380VarA3 = mqo1.A(arrayList);
                            if (!z2) {
                                size = 0;
                            }
                            nr90Var = new nr90(c380VarA3, i15, size);
                        }
                        i17 = nr90Var.c;
                        if (i17 == 0) {
                            b0kVar4.i0(-122507003);
                            int i23 = (i4 & 112) | 8 | (i4 & 896) | 4096 | (i4 & 7168);
                            int i24 = i4 << 3;
                            boolean z6 = b3;
                            qim0 qim0Var8 = qim0Var4;
                            fc11.a(nr90Var.a, qim0Var8, hcxVar3, huxVar3, false, nr90Var.b, gbxVar3, str3, (idn0) null, b0kVar4, i23 | (3670016 & i24) | (i24 & 29360128), 272);
                            b0kVar4.r(z6);
                            b0kVar3 = b0kVar4;
                            gbxVar5 = gbxVar3;
                            str5 = str3;
                            qim0Var6 = qim0Var8;
                        } else {
                            byte b8 = b3;
                            gbxVar4 = gbxVar3;
                            str4 = str3;
                            qim0Var5 = qim0Var4;
                            b0kVar4.i0(-122187145);
                            fA = hcxVar3.a(b0kVar4);
                            objT = b0kVar4.T();
                            m4cVar = fkj0.X;
                            if (objT == m4cVar) {
                                objT = ktd.n(b0kVar4);
                            }
                            idn0Var = (idn0) objT;
                            if (nr90Var.a.isEmpty()) {
                                b4 = b2;
                            } else {
                                b4 = b2;
                            }
                            if (gbxVar4 != null) {
                                qim0VarV = bin.v(qim0Var5, idn0Var, ny3.a, false, gbxVar4.c, (pm31) null, gbxVar4.b, 20);
                                qim0Var6 = qim0Var5;
                            } else {
                                qim0Var6 = qim0Var5;
                                qim0VarV = qim0Var6;
                            }
                            qim0 qim0VarA2 = s161.a(qim0VarV, new thx(str4, gbxVar4, b2));
                            objT2 = b0kVar4.T();
                            if (objT2 == m4cVar) {
                                objT2 = o390.d1;
                                b0kVar4.s0(objT2);
                            }
                            qim0 qim0VarC2 = i541.C(qim0VarA2, (iu30) objT2);
                            zD = b0kVar4.d(fA);
                            objT3 = b0kVar4.T();
                            if (zD) {
                                objT3 = new j37((byte) 5, fA);
                                b0kVar4.s0(objT3);
                            } else {
                                objT3 = new j37((byte) 5, fA);
                                b0kVar4.s0(objT3);
                            }
                            gfh0Var = (gfh0) objT3;
                            gbxVar5 = gbxVar4;
                            iHashCode = Long.hashCode(((x340) b0kVar4).T);
                            xos0VarM = b0kVar4.m();
                            qim0VarE = zr7.E(b0kVar4, qim0VarC2);
                            hzj.A.getClass();
                            if (((x340) b0kVar4).a != null) {
                                tgp1.p();
                                throw null;
                            }
                            b0kVar4.m0();
                            if (((x340) b0kVar4).S) {
                                b0kVar4.l(hmb0.t1);
                            } else {
                                b0kVar4.v0();
                            }
                            nko1.H(gfh0Var, b0kVar4, y580.O0);
                            nko1.H(xos0VarM, b0kVar4, y580.N0);
                            nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
                            nko1.F(b0kVar4);
                            nko1.H(qim0VarE, b0kVar4, y580.Y);
                            if (b4 != 0) {
                                b0kVar4.i0(-1062221041);
                                str5 = str4;
                                z3 = true;
                                fc11.a(nr90Var.a, (qim0) null, hcxVar3, huxVar3, false, nr90Var.b, (gbx) null, (String) null, (idn0) null, b0kVar4, (i4 & 896) | 4104 | (i4 & 7168), 466);
                                b0kVar3 = b0kVar4;
                                z4 = false;
                                b0kVar3.r(false);
                            } else {
                                b0kVar3 = b0kVar4;
                                str5 = str4;
                                z3 = true;
                                z4 = false;
                                b0kVar3.i0(-1062024997);
                                b0kVar3.r(false);
                            }
                            h(i17, hcxVar3, b0kVar3, (i4 >> 3) & 112);
                            b0kVar3.r(z3);
                            b0kVar3.r(z4);
                        }
                        gbxVar2 = gbxVar5;
                        str2 = str5;
                        b0kVar2 = b0kVar3;
                        hcxVar2 = hcxVar3;
                        huxVar2 = huxVar3;
                        qim0Var3 = qim0Var6;
                    } else {
                        b0kVar4.b0();
                        huxVar2 = huxVar;
                        i15 = i;
                        str2 = str;
                        b0kVar2 = b0kVar4;
                        qim0Var3 = qim0Var2;
                        hcxVar2 = hcxVar;
                        gbxVar2 = gbxVar;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new lr90(c380Var, qim0Var3, hcxVar2, huxVar2, i15, gbxVar2, str2, i2, i3);
                    }
                }
                i4 |= 196608;
                i13 = i3 & 64;
                if (i13 != 0) {
                    if ((1572864 & i2) == 0) {
                        if (b0kVar4.g(str)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i4 |= i14;
                    }
                    byte b9 = 1;
                    if ((i4 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar4.Y(i4 & 1, z)) {
                        if (i18 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            hcxVar3 = hcx.b;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i7 != 0) {
                            huxVar3 = null;
                        } else {
                            huxVar3 = huxVar;
                        }
                        if (i9 != 0) {
                            i15 = 4;
                        } else {
                            i15 = i;
                        }
                        if (i11 != 0) {
                            gbxVar3 = null;
                        } else {
                            gbxVar3 = gbxVar;
                        }
                        if (i13 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (huxVar3 != null) {
                            i16 = 1;
                        } else {
                            i16 = 0;
                        }
                        arrayList = new ArrayList();
                        while (r7.hasNext()) {
                            if (my90Var instanceof my90) {
                                my90 my90Var4 = my90Var;
                                str6 = my90Var4.a;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                phxVar = new phx(8, 0L, str6, my90Var4.b, my90Var4.c);
                            } else {
                                if (u890.j(my90Var, ly90.a)) {
                                    eg.o();
                                    return;
                                }
                                phxVar = null;
                            }
                            if (phxVar != null) {
                                arrayList.add(phxVar);
                            }
                        }
                        size = c380Var2.size() - arrayList.size();
                        int i111 = i15 - i16;
                        int size4 = arrayList.size() + size;
                        if (size == 1) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (size != 0) {
                            b2 = 1;
                            b3 = 0;
                            c380 c380VarA4 = mqo1.A(arrayList);
                            if (!z2) {
                                size = 0;
                            }
                            nr90Var = new nr90(c380VarA4, i15, size);
                        } else {
                            b2 = 1;
                            b3 = 0;
                            c380 c380VarA5 = mqo1.A(arrayList);
                            if (!z2) {
                                size = 0;
                            }
                            nr90Var = new nr90(c380VarA5, i15, size);
                        }
                        i17 = nr90Var.c;
                        if (i17 == 0) {
                            b0kVar4.i0(-122507003);
                            int i25 = (i4 & 112) | 8 | (i4 & 896) | 4096 | (i4 & 7168);
                            int i26 = i4 << 3;
                            boolean z7 = b3;
                            qim0 qim0Var9 = qim0Var4;
                            fc11.a(nr90Var.a, qim0Var9, hcxVar3, huxVar3, false, nr90Var.b, gbxVar3, str3, (idn0) null, b0kVar4, i25 | (3670016 & i26) | (i26 & 29360128), 272);
                            b0kVar4.r(z7);
                            b0kVar3 = b0kVar4;
                            gbxVar5 = gbxVar3;
                            str5 = str3;
                            qim0Var6 = qim0Var9;
                        } else {
                            byte b10 = b3;
                            gbxVar4 = gbxVar3;
                            str4 = str3;
                            qim0Var5 = qim0Var4;
                            b0kVar4.i0(-122187145);
                            fA = hcxVar3.a(b0kVar4);
                            objT = b0kVar4.T();
                            m4cVar = fkj0.X;
                            if (objT == m4cVar) {
                                objT = ktd.n(b0kVar4);
                            }
                            idn0Var = (idn0) objT;
                            if (nr90Var.a.isEmpty()) {
                                b4 = b2;
                            } else {
                                b4 = b2;
                            }
                            if (gbxVar4 != null) {
                                qim0VarV = bin.v(qim0Var5, idn0Var, ny3.a, false, gbxVar4.c, (pm31) null, gbxVar4.b, 20);
                                qim0Var6 = qim0Var5;
                            } else {
                                qim0Var6 = qim0Var5;
                                qim0VarV = qim0Var6;
                            }
                            qim0 qim0VarA3 = s161.a(qim0VarV, new thx(str4, gbxVar4, b2));
                            objT2 = b0kVar4.T();
                            if (objT2 == m4cVar) {
                                objT2 = o390.d1;
                                b0kVar4.s0(objT2);
                            }
                            qim0 qim0VarC3 = i541.C(qim0VarA3, (iu30) objT2);
                            zD = b0kVar4.d(fA);
                            objT3 = b0kVar4.T();
                            if (zD) {
                                objT3 = new j37((byte) 5, fA);
                                b0kVar4.s0(objT3);
                            } else {
                                objT3 = new j37((byte) 5, fA);
                                b0kVar4.s0(objT3);
                            }
                            gfh0Var = (gfh0) objT3;
                            gbxVar5 = gbxVar4;
                            iHashCode = Long.hashCode(((x340) b0kVar4).T);
                            xos0VarM = b0kVar4.m();
                            qim0VarE = zr7.E(b0kVar4, qim0VarC3);
                            hzj.A.getClass();
                            if (((x340) b0kVar4).a != null) {
                                tgp1.p();
                                throw null;
                            }
                            b0kVar4.m0();
                            if (((x340) b0kVar4).S) {
                                b0kVar4.l(hmb0.t1);
                            } else {
                                b0kVar4.v0();
                            }
                            nko1.H(gfh0Var, b0kVar4, y580.O0);
                            nko1.H(xos0VarM, b0kVar4, y580.N0);
                            nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
                            nko1.F(b0kVar4);
                            nko1.H(qim0VarE, b0kVar4, y580.Y);
                            if (b4 != 0) {
                                b0kVar4.i0(-1062221041);
                                str5 = str4;
                                z3 = true;
                                fc11.a(nr90Var.a, (qim0) null, hcxVar3, huxVar3, false, nr90Var.b, (gbx) null, (String) null, (idn0) null, b0kVar4, (i4 & 896) | 4104 | (i4 & 7168), 466);
                                b0kVar3 = b0kVar4;
                                z4 = false;
                                b0kVar3.r(false);
                            } else {
                                b0kVar3 = b0kVar4;
                                str5 = str4;
                                z3 = true;
                                z4 = false;
                                b0kVar3.i0(-1062024997);
                                b0kVar3.r(false);
                            }
                            h(i17, hcxVar3, b0kVar3, (i4 >> 3) & 112);
                            b0kVar3.r(z3);
                            b0kVar3.r(z4);
                        }
                        gbxVar2 = gbxVar5;
                        str2 = str5;
                        b0kVar2 = b0kVar3;
                        hcxVar2 = hcxVar3;
                        huxVar2 = huxVar3;
                        qim0Var3 = qim0Var6;
                    } else {
                        b0kVar4.b0();
                        huxVar2 = huxVar;
                        i15 = i;
                        str2 = str;
                        b0kVar2 = b0kVar4;
                        qim0Var3 = qim0Var2;
                        hcxVar2 = hcxVar;
                        gbxVar2 = gbxVar;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new lr90(c380Var, qim0Var3, hcxVar2, huxVar2, i15, gbxVar2, str2, i2, i3);
                    }
                }
                i4 |= 1572864;
                byte b11 = 1;
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar4.Y(i4 & 1, z)) {
                    if (i18 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        hcxVar3 = hcx.b;
                    } else {
                        hcxVar3 = hcxVar;
                    }
                    if (i7 != 0) {
                        huxVar3 = null;
                    } else {
                        huxVar3 = huxVar;
                    }
                    if (i9 != 0) {
                        i15 = 4;
                    } else {
                        i15 = i;
                    }
                    if (i11 != 0) {
                        gbxVar3 = null;
                    } else {
                        gbxVar3 = gbxVar;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (huxVar3 != null) {
                        i16 = 1;
                    } else {
                        i16 = 0;
                    }
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        if (my90Var instanceof my90) {
                            my90 my90Var5 = my90Var;
                            str6 = my90Var5.a;
                            if (str6 == null) {
                                str6 = "";
                            }
                            phxVar = new phx(8, 0L, str6, my90Var5.b, my90Var5.c);
                        } else {
                            if (u890.j(my90Var, ly90.a)) {
                                eg.o();
                                return;
                            }
                            phxVar = null;
                        }
                        if (phxVar != null) {
                            arrayList.add(phxVar);
                        }
                    }
                    size = c380Var2.size() - arrayList.size();
                    int i112 = i15 - i16;
                    int size5 = arrayList.size() + size;
                    if (size == 1) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (size != 0) {
                        b2 = 1;
                        b3 = 0;
                        c380 c380VarA6 = mqo1.A(arrayList);
                        if (!z2) {
                            size = 0;
                        }
                        nr90Var = new nr90(c380VarA6, i15, size);
                    } else {
                        b2 = 1;
                        b3 = 0;
                        c380 c380VarA7 = mqo1.A(arrayList);
                        if (!z2) {
                            size = 0;
                        }
                        nr90Var = new nr90(c380VarA7, i15, size);
                    }
                    i17 = nr90Var.c;
                    if (i17 == 0) {
                        b0kVar4.i0(-122507003);
                        int i27 = (i4 & 112) | 8 | (i4 & 896) | 4096 | (i4 & 7168);
                        int i28 = i4 << 3;
                        boolean z8 = b3;
                        qim0 qim0Var10 = qim0Var4;
                        fc11.a(nr90Var.a, qim0Var10, hcxVar3, huxVar3, false, nr90Var.b, gbxVar3, str3, (idn0) null, b0kVar4, i27 | (3670016 & i28) | (i28 & 29360128), 272);
                        b0kVar4.r(z8);
                        b0kVar3 = b0kVar4;
                        gbxVar5 = gbxVar3;
                        str5 = str3;
                        qim0Var6 = qim0Var10;
                    } else {
                        byte b12 = b3;
                        gbxVar4 = gbxVar3;
                        str4 = str3;
                        qim0Var5 = qim0Var4;
                        b0kVar4.i0(-122187145);
                        fA = hcxVar3.a(b0kVar4);
                        objT = b0kVar4.T();
                        m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = ktd.n(b0kVar4);
                        }
                        idn0Var = (idn0) objT;
                        if (nr90Var.a.isEmpty()) {
                            b4 = b2;
                        } else {
                            b4 = b2;
                        }
                        if (gbxVar4 != null) {
                            qim0VarV = bin.v(qim0Var5, idn0Var, ny3.a, false, gbxVar4.c, (pm31) null, gbxVar4.b, 20);
                            qim0Var6 = qim0Var5;
                        } else {
                            qim0Var6 = qim0Var5;
                            qim0VarV = qim0Var6;
                        }
                        qim0 qim0VarA4 = s161.a(qim0VarV, new thx(str4, gbxVar4, b2));
                        objT2 = b0kVar4.T();
                        if (objT2 == m4cVar) {
                            objT2 = o390.d1;
                            b0kVar4.s0(objT2);
                        }
                        qim0 qim0VarC4 = i541.C(qim0VarA4, (iu30) objT2);
                        zD = b0kVar4.d(fA);
                        objT3 = b0kVar4.T();
                        if (zD) {
                            objT3 = new j37((byte) 5, fA);
                            b0kVar4.s0(objT3);
                        } else {
                            objT3 = new j37((byte) 5, fA);
                            b0kVar4.s0(objT3);
                        }
                        gfh0Var = (gfh0) objT3;
                        gbxVar5 = gbxVar4;
                        iHashCode = Long.hashCode(((x340) b0kVar4).T);
                        xos0VarM = b0kVar4.m();
                        qim0VarE = zr7.E(b0kVar4, qim0VarC4);
                        hzj.A.getClass();
                        if (((x340) b0kVar4).a != null) {
                            tgp1.p();
                            throw null;
                        }
                        b0kVar4.m0();
                        if (((x340) b0kVar4).S) {
                            b0kVar4.l(hmb0.t1);
                        } else {
                            b0kVar4.v0();
                        }
                        nko1.H(gfh0Var, b0kVar4, y580.O0);
                        nko1.H(xos0VarM, b0kVar4, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
                        nko1.F(b0kVar4);
                        nko1.H(qim0VarE, b0kVar4, y580.Y);
                        if (b4 != 0) {
                            b0kVar4.i0(-1062221041);
                            str5 = str4;
                            z3 = true;
                            fc11.a(nr90Var.a, (qim0) null, hcxVar3, huxVar3, false, nr90Var.b, (gbx) null, (String) null, (idn0) null, b0kVar4, (i4 & 896) | 4104 | (i4 & 7168), 466);
                            b0kVar3 = b0kVar4;
                            z4 = false;
                            b0kVar3.r(false);
                        } else {
                            b0kVar3 = b0kVar4;
                            str5 = str4;
                            z3 = true;
                            z4 = false;
                            b0kVar3.i0(-1062024997);
                            b0kVar3.r(false);
                        }
                        h(i17, hcxVar3, b0kVar3, (i4 >> 3) & 112);
                        b0kVar3.r(z3);
                        b0kVar3.r(z4);
                    }
                    gbxVar2 = gbxVar5;
                    str2 = str5;
                    b0kVar2 = b0kVar3;
                    hcxVar2 = hcxVar3;
                    huxVar2 = huxVar3;
                    qim0Var3 = qim0Var6;
                } else {
                    b0kVar4.b0();
                    huxVar2 = huxVar;
                    i15 = i;
                    str2 = str;
                    b0kVar2 = b0kVar4;
                    qim0Var3 = qim0Var2;
                    hcxVar2 = hcxVar;
                    gbxVar2 = gbxVar;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new lr90(c380Var, qim0Var3, hcxVar2, huxVar2, i15, gbxVar2, str2, i2, i3);
                }
            }
            i4 |= 24576;
            i11 = i3 & 32;
            if (i11 != 0) {
                if ((196608 & i2) == 0) {
                    if (b0kVar4.i(gbxVar)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                i13 = i3 & 64;
                if (i13 != 0) {
                    if ((1572864 & i2) == 0) {
                        if (b0kVar4.g(str)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i4 |= i14;
                    }
                    byte b13 = 1;
                    if ((i4 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar4.Y(i4 & 1, z)) {
                        if (i18 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            hcxVar3 = hcx.b;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i7 != 0) {
                            huxVar3 = null;
                        } else {
                            huxVar3 = huxVar;
                        }
                        if (i9 != 0) {
                            i15 = 4;
                        } else {
                            i15 = i;
                        }
                        if (i11 != 0) {
                            gbxVar3 = null;
                        } else {
                            gbxVar3 = gbxVar;
                        }
                        if (i13 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (huxVar3 != null) {
                            i16 = 1;
                        } else {
                            i16 = 0;
                        }
                        arrayList = new ArrayList();
                        while (r7.hasNext()) {
                            if (my90Var instanceof my90) {
                                my90 my90Var6 = my90Var;
                                str6 = my90Var6.a;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                phxVar = new phx(8, 0L, str6, my90Var6.b, my90Var6.c);
                            } else {
                                if (u890.j(my90Var, ly90.a)) {
                                    eg.o();
                                    return;
                                }
                                phxVar = null;
                            }
                            if (phxVar != null) {
                                arrayList.add(phxVar);
                            }
                        }
                        size = c380Var2.size() - arrayList.size();
                        int i113 = i15 - i16;
                        int size6 = arrayList.size() + size;
                        if (size == 1) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (size != 0) {
                            b2 = 1;
                            b3 = 0;
                            c380 c380VarA8 = mqo1.A(arrayList);
                            if (!z2) {
                                size = 0;
                            }
                            nr90Var = new nr90(c380VarA8, i15, size);
                        } else {
                            b2 = 1;
                            b3 = 0;
                            c380 c380VarA9 = mqo1.A(arrayList);
                            if (!z2) {
                                size = 0;
                            }
                            nr90Var = new nr90(c380VarA9, i15, size);
                        }
                        i17 = nr90Var.c;
                        if (i17 == 0) {
                            b0kVar4.i0(-122507003);
                            int i29 = (i4 & 112) | 8 | (i4 & 896) | 4096 | (i4 & 7168);
                            int i210 = i4 << 3;
                            boolean z9 = b3;
                            qim0 qim0Var11 = qim0Var4;
                            fc11.a(nr90Var.a, qim0Var11, hcxVar3, huxVar3, false, nr90Var.b, gbxVar3, str3, (idn0) null, b0kVar4, i29 | (3670016 & i210) | (i210 & 29360128), 272);
                            b0kVar4.r(z9);
                            b0kVar3 = b0kVar4;
                            gbxVar5 = gbxVar3;
                            str5 = str3;
                            qim0Var6 = qim0Var11;
                        } else {
                            byte b14 = b3;
                            gbxVar4 = gbxVar3;
                            str4 = str3;
                            qim0Var5 = qim0Var4;
                            b0kVar4.i0(-122187145);
                            fA = hcxVar3.a(b0kVar4);
                            objT = b0kVar4.T();
                            m4cVar = fkj0.X;
                            if (objT == m4cVar) {
                                objT = ktd.n(b0kVar4);
                            }
                            idn0Var = (idn0) objT;
                            if (nr90Var.a.isEmpty()) {
                                b4 = b2;
                            } else {
                                b4 = b2;
                            }
                            if (gbxVar4 != null) {
                                qim0VarV = bin.v(qim0Var5, idn0Var, ny3.a, false, gbxVar4.c, (pm31) null, gbxVar4.b, 20);
                                qim0Var6 = qim0Var5;
                            } else {
                                qim0Var6 = qim0Var5;
                                qim0VarV = qim0Var6;
                            }
                            qim0 qim0VarA5 = s161.a(qim0VarV, new thx(str4, gbxVar4, b2));
                            objT2 = b0kVar4.T();
                            if (objT2 == m4cVar) {
                                objT2 = o390.d1;
                                b0kVar4.s0(objT2);
                            }
                            qim0 qim0VarC5 = i541.C(qim0VarA5, (iu30) objT2);
                            zD = b0kVar4.d(fA);
                            objT3 = b0kVar4.T();
                            if (zD) {
                                objT3 = new j37((byte) 5, fA);
                                b0kVar4.s0(objT3);
                            } else {
                                objT3 = new j37((byte) 5, fA);
                                b0kVar4.s0(objT3);
                            }
                            gfh0Var = (gfh0) objT3;
                            gbxVar5 = gbxVar4;
                            iHashCode = Long.hashCode(((x340) b0kVar4).T);
                            xos0VarM = b0kVar4.m();
                            qim0VarE = zr7.E(b0kVar4, qim0VarC5);
                            hzj.A.getClass();
                            if (((x340) b0kVar4).a != null) {
                                tgp1.p();
                                throw null;
                            }
                            b0kVar4.m0();
                            if (((x340) b0kVar4).S) {
                                b0kVar4.l(hmb0.t1);
                            } else {
                                b0kVar4.v0();
                            }
                            nko1.H(gfh0Var, b0kVar4, y580.O0);
                            nko1.H(xos0VarM, b0kVar4, y580.N0);
                            nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
                            nko1.F(b0kVar4);
                            nko1.H(qim0VarE, b0kVar4, y580.Y);
                            if (b4 != 0) {
                                b0kVar4.i0(-1062221041);
                                str5 = str4;
                                z3 = true;
                                fc11.a(nr90Var.a, (qim0) null, hcxVar3, huxVar3, false, nr90Var.b, (gbx) null, (String) null, (idn0) null, b0kVar4, (i4 & 896) | 4104 | (i4 & 7168), 466);
                                b0kVar3 = b0kVar4;
                                z4 = false;
                                b0kVar3.r(false);
                            } else {
                                b0kVar3 = b0kVar4;
                                str5 = str4;
                                z3 = true;
                                z4 = false;
                                b0kVar3.i0(-1062024997);
                                b0kVar3.r(false);
                            }
                            h(i17, hcxVar3, b0kVar3, (i4 >> 3) & 112);
                            b0kVar3.r(z3);
                            b0kVar3.r(z4);
                        }
                        gbxVar2 = gbxVar5;
                        str2 = str5;
                        b0kVar2 = b0kVar3;
                        hcxVar2 = hcxVar3;
                        huxVar2 = huxVar3;
                        qim0Var3 = qim0Var6;
                    } else {
                        b0kVar4.b0();
                        huxVar2 = huxVar;
                        i15 = i;
                        str2 = str;
                        b0kVar2 = b0kVar4;
                        qim0Var3 = qim0Var2;
                        hcxVar2 = hcxVar;
                        gbxVar2 = gbxVar;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new lr90(c380Var, qim0Var3, hcxVar2, huxVar2, i15, gbxVar2, str2, i2, i3);
                    }
                }
                i4 |= 1572864;
                byte b15 = 1;
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar4.Y(i4 & 1, z)) {
                    if (i18 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        hcxVar3 = hcx.b;
                    } else {
                        hcxVar3 = hcxVar;
                    }
                    if (i7 != 0) {
                        huxVar3 = null;
                    } else {
                        huxVar3 = huxVar;
                    }
                    if (i9 != 0) {
                        i15 = 4;
                    } else {
                        i15 = i;
                    }
                    if (i11 != 0) {
                        gbxVar3 = null;
                    } else {
                        gbxVar3 = gbxVar;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (huxVar3 != null) {
                        i16 = 1;
                    } else {
                        i16 = 0;
                    }
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        if (my90Var instanceof my90) {
                            my90 my90Var7 = my90Var;
                            str6 = my90Var7.a;
                            if (str6 == null) {
                                str6 = "";
                            }
                            phxVar = new phx(8, 0L, str6, my90Var7.b, my90Var7.c);
                        } else {
                            if (u890.j(my90Var, ly90.a)) {
                                eg.o();
                                return;
                            }
                            phxVar = null;
                        }
                        if (phxVar != null) {
                            arrayList.add(phxVar);
                        }
                    }
                    size = c380Var2.size() - arrayList.size();
                    int i114 = i15 - i16;
                    int size7 = arrayList.size() + size;
                    if (size == 1) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (size != 0) {
                        b2 = 1;
                        b3 = 0;
                        c380 c380VarA10 = mqo1.A(arrayList);
                        if (!z2) {
                            size = 0;
                        }
                        nr90Var = new nr90(c380VarA10, i15, size);
                    } else {
                        b2 = 1;
                        b3 = 0;
                        c380 c380VarA11 = mqo1.A(arrayList);
                        if (!z2) {
                            size = 0;
                        }
                        nr90Var = new nr90(c380VarA11, i15, size);
                    }
                    i17 = nr90Var.c;
                    if (i17 == 0) {
                        b0kVar4.i0(-122507003);
                        int i211 = (i4 & 112) | 8 | (i4 & 896) | 4096 | (i4 & 7168);
                        int i212 = i4 << 3;
                        boolean z10 = b3;
                        qim0 qim0Var12 = qim0Var4;
                        fc11.a(nr90Var.a, qim0Var12, hcxVar3, huxVar3, false, nr90Var.b, gbxVar3, str3, (idn0) null, b0kVar4, i211 | (3670016 & i212) | (i212 & 29360128), 272);
                        b0kVar4.r(z10);
                        b0kVar3 = b0kVar4;
                        gbxVar5 = gbxVar3;
                        str5 = str3;
                        qim0Var6 = qim0Var12;
                    } else {
                        byte b16 = b3;
                        gbxVar4 = gbxVar3;
                        str4 = str3;
                        qim0Var5 = qim0Var4;
                        b0kVar4.i0(-122187145);
                        fA = hcxVar3.a(b0kVar4);
                        objT = b0kVar4.T();
                        m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = ktd.n(b0kVar4);
                        }
                        idn0Var = (idn0) objT;
                        if (nr90Var.a.isEmpty()) {
                            b4 = b2;
                        } else {
                            b4 = b2;
                        }
                        if (gbxVar4 != null) {
                            qim0VarV = bin.v(qim0Var5, idn0Var, ny3.a, false, gbxVar4.c, (pm31) null, gbxVar4.b, 20);
                            qim0Var6 = qim0Var5;
                        } else {
                            qim0Var6 = qim0Var5;
                            qim0VarV = qim0Var6;
                        }
                        qim0 qim0VarA6 = s161.a(qim0VarV, new thx(str4, gbxVar4, b2));
                        objT2 = b0kVar4.T();
                        if (objT2 == m4cVar) {
                            objT2 = o390.d1;
                            b0kVar4.s0(objT2);
                        }
                        qim0 qim0VarC6 = i541.C(qim0VarA6, (iu30) objT2);
                        zD = b0kVar4.d(fA);
                        objT3 = b0kVar4.T();
                        if (zD) {
                            objT3 = new j37((byte) 5, fA);
                            b0kVar4.s0(objT3);
                        } else {
                            objT3 = new j37((byte) 5, fA);
                            b0kVar4.s0(objT3);
                        }
                        gfh0Var = (gfh0) objT3;
                        gbxVar5 = gbxVar4;
                        iHashCode = Long.hashCode(((x340) b0kVar4).T);
                        xos0VarM = b0kVar4.m();
                        qim0VarE = zr7.E(b0kVar4, qim0VarC6);
                        hzj.A.getClass();
                        if (((x340) b0kVar4).a != null) {
                            tgp1.p();
                            throw null;
                        }
                        b0kVar4.m0();
                        if (((x340) b0kVar4).S) {
                            b0kVar4.l(hmb0.t1);
                        } else {
                            b0kVar4.v0();
                        }
                        nko1.H(gfh0Var, b0kVar4, y580.O0);
                        nko1.H(xos0VarM, b0kVar4, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
                        nko1.F(b0kVar4);
                        nko1.H(qim0VarE, b0kVar4, y580.Y);
                        if (b4 != 0) {
                            b0kVar4.i0(-1062221041);
                            str5 = str4;
                            z3 = true;
                            fc11.a(nr90Var.a, (qim0) null, hcxVar3, huxVar3, false, nr90Var.b, (gbx) null, (String) null, (idn0) null, b0kVar4, (i4 & 896) | 4104 | (i4 & 7168), 466);
                            b0kVar3 = b0kVar4;
                            z4 = false;
                            b0kVar3.r(false);
                        } else {
                            b0kVar3 = b0kVar4;
                            str5 = str4;
                            z3 = true;
                            z4 = false;
                            b0kVar3.i0(-1062024997);
                            b0kVar3.r(false);
                        }
                        h(i17, hcxVar3, b0kVar3, (i4 >> 3) & 112);
                        b0kVar3.r(z3);
                        b0kVar3.r(z4);
                    }
                    gbxVar2 = gbxVar5;
                    str2 = str5;
                    b0kVar2 = b0kVar3;
                    hcxVar2 = hcxVar3;
                    huxVar2 = huxVar3;
                    qim0Var3 = qim0Var6;
                } else {
                    b0kVar4.b0();
                    huxVar2 = huxVar;
                    i15 = i;
                    str2 = str;
                    b0kVar2 = b0kVar4;
                    qim0Var3 = qim0Var2;
                    hcxVar2 = hcxVar;
                    gbxVar2 = gbxVar;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new lr90(c380Var, qim0Var3, hcxVar2, huxVar2, i15, gbxVar2, str2, i2, i3);
                }
            }
            i4 |= 196608;
            i13 = i3 & 64;
            if (i13 != 0) {
                if ((1572864 & i2) == 0) {
                    if (b0kVar4.g(str)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i4 |= i14;
                }
                byte b17 = 1;
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar4.Y(i4 & 1, z)) {
                    if (i18 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        hcxVar3 = hcx.b;
                    } else {
                        hcxVar3 = hcxVar;
                    }
                    if (i7 != 0) {
                        huxVar3 = null;
                    } else {
                        huxVar3 = huxVar;
                    }
                    if (i9 != 0) {
                        i15 = 4;
                    } else {
                        i15 = i;
                    }
                    if (i11 != 0) {
                        gbxVar3 = null;
                    } else {
                        gbxVar3 = gbxVar;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (huxVar3 != null) {
                        i16 = 1;
                    } else {
                        i16 = 0;
                    }
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        if (my90Var instanceof my90) {
                            my90 my90Var8 = my90Var;
                            str6 = my90Var8.a;
                            if (str6 == null) {
                                str6 = "";
                            }
                            phxVar = new phx(8, 0L, str6, my90Var8.b, my90Var8.c);
                        } else {
                            if (u890.j(my90Var, ly90.a)) {
                                eg.o();
                                return;
                            }
                            phxVar = null;
                        }
                        if (phxVar != null) {
                            arrayList.add(phxVar);
                        }
                    }
                    size = c380Var2.size() - arrayList.size();
                    int i115 = i15 - i16;
                    int size8 = arrayList.size() + size;
                    if (size == 1) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (size != 0) {
                        b2 = 1;
                        b3 = 0;
                        c380 c380VarA12 = mqo1.A(arrayList);
                        if (!z2) {
                            size = 0;
                        }
                        nr90Var = new nr90(c380VarA12, i15, size);
                    } else {
                        b2 = 1;
                        b3 = 0;
                        c380 c380VarA13 = mqo1.A(arrayList);
                        if (!z2) {
                            size = 0;
                        }
                        nr90Var = new nr90(c380VarA13, i15, size);
                    }
                    i17 = nr90Var.c;
                    if (i17 == 0) {
                        b0kVar4.i0(-122507003);
                        int i213 = (i4 & 112) | 8 | (i4 & 896) | 4096 | (i4 & 7168);
                        int i214 = i4 << 3;
                        boolean z11 = b3;
                        qim0 qim0Var13 = qim0Var4;
                        fc11.a(nr90Var.a, qim0Var13, hcxVar3, huxVar3, false, nr90Var.b, gbxVar3, str3, (idn0) null, b0kVar4, i213 | (3670016 & i214) | (i214 & 29360128), 272);
                        b0kVar4.r(z11);
                        b0kVar3 = b0kVar4;
                        gbxVar5 = gbxVar3;
                        str5 = str3;
                        qim0Var6 = qim0Var13;
                    } else {
                        byte b18 = b3;
                        gbxVar4 = gbxVar3;
                        str4 = str3;
                        qim0Var5 = qim0Var4;
                        b0kVar4.i0(-122187145);
                        fA = hcxVar3.a(b0kVar4);
                        objT = b0kVar4.T();
                        m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = ktd.n(b0kVar4);
                        }
                        idn0Var = (idn0) objT;
                        if (nr90Var.a.isEmpty()) {
                            b4 = b2;
                        } else {
                            b4 = b2;
                        }
                        if (gbxVar4 != null) {
                            qim0VarV = bin.v(qim0Var5, idn0Var, ny3.a, false, gbxVar4.c, (pm31) null, gbxVar4.b, 20);
                            qim0Var6 = qim0Var5;
                        } else {
                            qim0Var6 = qim0Var5;
                            qim0VarV = qim0Var6;
                        }
                        qim0 qim0VarA7 = s161.a(qim0VarV, new thx(str4, gbxVar4, b2));
                        objT2 = b0kVar4.T();
                        if (objT2 == m4cVar) {
                            objT2 = o390.d1;
                            b0kVar4.s0(objT2);
                        }
                        qim0 qim0VarC7 = i541.C(qim0VarA7, (iu30) objT2);
                        zD = b0kVar4.d(fA);
                        objT3 = b0kVar4.T();
                        if (zD) {
                            objT3 = new j37((byte) 5, fA);
                            b0kVar4.s0(objT3);
                        } else {
                            objT3 = new j37((byte) 5, fA);
                            b0kVar4.s0(objT3);
                        }
                        gfh0Var = (gfh0) objT3;
                        gbxVar5 = gbxVar4;
                        iHashCode = Long.hashCode(((x340) b0kVar4).T);
                        xos0VarM = b0kVar4.m();
                        qim0VarE = zr7.E(b0kVar4, qim0VarC7);
                        hzj.A.getClass();
                        if (((x340) b0kVar4).a != null) {
                            tgp1.p();
                            throw null;
                        }
                        b0kVar4.m0();
                        if (((x340) b0kVar4).S) {
                            b0kVar4.l(hmb0.t1);
                        } else {
                            b0kVar4.v0();
                        }
                        nko1.H(gfh0Var, b0kVar4, y580.O0);
                        nko1.H(xos0VarM, b0kVar4, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
                        nko1.F(b0kVar4);
                        nko1.H(qim0VarE, b0kVar4, y580.Y);
                        if (b4 != 0) {
                            b0kVar4.i0(-1062221041);
                            str5 = str4;
                            z3 = true;
                            fc11.a(nr90Var.a, (qim0) null, hcxVar3, huxVar3, false, nr90Var.b, (gbx) null, (String) null, (idn0) null, b0kVar4, (i4 & 896) | 4104 | (i4 & 7168), 466);
                            b0kVar3 = b0kVar4;
                            z4 = false;
                            b0kVar3.r(false);
                        } else {
                            b0kVar3 = b0kVar4;
                            str5 = str4;
                            z3 = true;
                            z4 = false;
                            b0kVar3.i0(-1062024997);
                            b0kVar3.r(false);
                        }
                        h(i17, hcxVar3, b0kVar3, (i4 >> 3) & 112);
                        b0kVar3.r(z3);
                        b0kVar3.r(z4);
                    }
                    gbxVar2 = gbxVar5;
                    str2 = str5;
                    b0kVar2 = b0kVar3;
                    hcxVar2 = hcxVar3;
                    huxVar2 = huxVar3;
                    qim0Var3 = qim0Var6;
                } else {
                    b0kVar4.b0();
                    huxVar2 = huxVar;
                    i15 = i;
                    str2 = str;
                    b0kVar2 = b0kVar4;
                    qim0Var3 = qim0Var2;
                    hcxVar2 = hcxVar;
                    gbxVar2 = gbxVar;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new lr90(c380Var, qim0Var3, hcxVar2, huxVar2, i15, gbxVar2, str2, i2, i3);
                }
            }
            i4 |= 1572864;
            byte b19 = 1;
            if ((i4 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar4.Y(i4 & 1, z)) {
                if (i18 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i5 != 0) {
                    hcxVar3 = hcx.b;
                } else {
                    hcxVar3 = hcxVar;
                }
                if (i7 != 0) {
                    huxVar3 = null;
                } else {
                    huxVar3 = huxVar;
                }
                if (i9 != 0) {
                    i15 = 4;
                } else {
                    i15 = i;
                }
                if (i11 != 0) {
                    gbxVar3 = null;
                } else {
                    gbxVar3 = gbxVar;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (huxVar3 != null) {
                    i16 = 1;
                } else {
                    i16 = 0;
                }
                arrayList = new ArrayList();
                while (r7.hasNext()) {
                    if (my90Var instanceof my90) {
                        my90 my90Var9 = my90Var;
                        str6 = my90Var9.a;
                        if (str6 == null) {
                            str6 = "";
                        }
                        phxVar = new phx(8, 0L, str6, my90Var9.b, my90Var9.c);
                    } else {
                        if (u890.j(my90Var, ly90.a)) {
                            eg.o();
                            return;
                        }
                        phxVar = null;
                    }
                    if (phxVar != null) {
                        arrayList.add(phxVar);
                    }
                }
                size = c380Var2.size() - arrayList.size();
                int i116 = i15 - i16;
                int size9 = arrayList.size() + size;
                if (size == 1) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (size != 0) {
                    b2 = 1;
                    b3 = 0;
                    c380 c380VarA14 = mqo1.A(arrayList);
                    if (!z2) {
                        size = 0;
                    }
                    nr90Var = new nr90(c380VarA14, i15, size);
                } else {
                    b2 = 1;
                    b3 = 0;
                    c380 c380VarA15 = mqo1.A(arrayList);
                    if (!z2) {
                        size = 0;
                    }
                    nr90Var = new nr90(c380VarA15, i15, size);
                }
                i17 = nr90Var.c;
                if (i17 == 0) {
                    b0kVar4.i0(-122507003);
                    int i215 = (i4 & 112) | 8 | (i4 & 896) | 4096 | (i4 & 7168);
                    int i216 = i4 << 3;
                    boolean z12 = b3;
                    qim0 qim0Var14 = qim0Var4;
                    fc11.a(nr90Var.a, qim0Var14, hcxVar3, huxVar3, false, nr90Var.b, gbxVar3, str3, (idn0) null, b0kVar4, i215 | (3670016 & i216) | (i216 & 29360128), 272);
                    b0kVar4.r(z12);
                    b0kVar3 = b0kVar4;
                    gbxVar5 = gbxVar3;
                    str5 = str3;
                    qim0Var6 = qim0Var14;
                } else {
                    byte b110 = b3;
                    gbxVar4 = gbxVar3;
                    str4 = str3;
                    qim0Var5 = qim0Var4;
                    b0kVar4.i0(-122187145);
                    fA = hcxVar3.a(b0kVar4);
                    objT = b0kVar4.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = ktd.n(b0kVar4);
                    }
                    idn0Var = (idn0) objT;
                    if (nr90Var.a.isEmpty()) {
                        b4 = b2;
                    } else {
                        b4 = b2;
                    }
                    if (gbxVar4 != null) {
                        qim0VarV = bin.v(qim0Var5, idn0Var, ny3.a, false, gbxVar4.c, (pm31) null, gbxVar4.b, 20);
                        qim0Var6 = qim0Var5;
                    } else {
                        qim0Var6 = qim0Var5;
                        qim0VarV = qim0Var6;
                    }
                    qim0 qim0VarA8 = s161.a(qim0VarV, new thx(str4, gbxVar4, b2));
                    objT2 = b0kVar4.T();
                    if (objT2 == m4cVar) {
                        objT2 = o390.d1;
                        b0kVar4.s0(objT2);
                    }
                    qim0 qim0VarC8 = i541.C(qim0VarA8, (iu30) objT2);
                    zD = b0kVar4.d(fA);
                    objT3 = b0kVar4.T();
                    if (zD) {
                        objT3 = new j37((byte) 5, fA);
                        b0kVar4.s0(objT3);
                    } else {
                        objT3 = new j37((byte) 5, fA);
                        b0kVar4.s0(objT3);
                    }
                    gfh0Var = (gfh0) objT3;
                    gbxVar5 = gbxVar4;
                    iHashCode = Long.hashCode(((x340) b0kVar4).T);
                    xos0VarM = b0kVar4.m();
                    qim0VarE = zr7.E(b0kVar4, qim0VarC8);
                    hzj.A.getClass();
                    if (((x340) b0kVar4).a != null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar4.m0();
                    if (((x340) b0kVar4).S) {
                        b0kVar4.l(hmb0.t1);
                    } else {
                        b0kVar4.v0();
                    }
                    nko1.H(gfh0Var, b0kVar4, y580.O0);
                    nko1.H(xos0VarM, b0kVar4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
                    nko1.F(b0kVar4);
                    nko1.H(qim0VarE, b0kVar4, y580.Y);
                    if (b4 != 0) {
                        b0kVar4.i0(-1062221041);
                        str5 = str4;
                        z3 = true;
                        fc11.a(nr90Var.a, (qim0) null, hcxVar3, huxVar3, false, nr90Var.b, (gbx) null, (String) null, (idn0) null, b0kVar4, (i4 & 896) | 4104 | (i4 & 7168), 466);
                        b0kVar3 = b0kVar4;
                        z4 = false;
                        b0kVar3.r(false);
                    } else {
                        b0kVar3 = b0kVar4;
                        str5 = str4;
                        z3 = true;
                        z4 = false;
                        b0kVar3.i0(-1062024997);
                        b0kVar3.r(false);
                    }
                    h(i17, hcxVar3, b0kVar3, (i4 >> 3) & 112);
                    b0kVar3.r(z3);
                    b0kVar3.r(z4);
                }
                gbxVar2 = gbxVar5;
                str2 = str5;
                b0kVar2 = b0kVar3;
                hcxVar2 = hcxVar3;
                huxVar2 = huxVar3;
                qim0Var3 = qim0Var6;
            } else {
                b0kVar4.b0();
                huxVar2 = huxVar;
                i15 = i;
                str2 = str;
                b0kVar2 = b0kVar4;
                qim0Var3 = qim0Var2;
                hcxVar2 = hcxVar;
                gbxVar2 = gbxVar;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new lr90(c380Var, qim0Var3, hcxVar2, huxVar2, i15, gbxVar2, str2, i2, i3);
            }
        }
        i4 |= 48;
        qim0Var2 = qim0Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            if (hcxVar == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = hcxVar.ordinal();
            }
            if (b0kVar4.e(iOrdinal)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i4 |= i6;
        }
        i7 = i3 & 8;
        if (i7 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if ((i2 & 4096) == 0) {
                zI = b0kVar4.g(huxVar);
            } else {
                zI = b0kVar4.i(huxVar);
            }
            if (zI) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        i9 = i3 & 16;
        if (i9 != 0) {
            if ((i2 & 24576) == 0) {
                if (b0kVar4.e(i)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i4 |= i10;
            }
            i11 = i3 & 32;
            if (i11 != 0) {
                if ((196608 & i2) == 0) {
                    if (b0kVar4.i(gbxVar)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                i13 = i3 & 64;
                if (i13 != 0) {
                    if ((1572864 & i2) == 0) {
                        if (b0kVar4.g(str)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i4 |= i14;
                    }
                    byte b111 = 1;
                    if ((i4 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar4.Y(i4 & 1, z)) {
                        if (i18 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            hcxVar3 = hcx.b;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i7 != 0) {
                            huxVar3 = null;
                        } else {
                            huxVar3 = huxVar;
                        }
                        if (i9 != 0) {
                            i15 = 4;
                        } else {
                            i15 = i;
                        }
                        if (i11 != 0) {
                            gbxVar3 = null;
                        } else {
                            gbxVar3 = gbxVar;
                        }
                        if (i13 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (huxVar3 != null) {
                            i16 = 1;
                        } else {
                            i16 = 0;
                        }
                        arrayList = new ArrayList();
                        while (r7.hasNext()) {
                            if (my90Var instanceof my90) {
                                my90 my90Var10 = my90Var;
                                str6 = my90Var10.a;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                phxVar = new phx(8, 0L, str6, my90Var10.b, my90Var10.c);
                            } else {
                                if (u890.j(my90Var, ly90.a)) {
                                    eg.o();
                                    return;
                                }
                                phxVar = null;
                            }
                            if (phxVar != null) {
                                arrayList.add(phxVar);
                            }
                        }
                        size = c380Var2.size() - arrayList.size();
                        int i117 = i15 - i16;
                        int size10 = arrayList.size() + size;
                        if (size == 1) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (size != 0) {
                            b2 = 1;
                            b3 = 0;
                            c380 c380VarA16 = mqo1.A(arrayList);
                            if (!z2) {
                                size = 0;
                            }
                            nr90Var = new nr90(c380VarA16, i15, size);
                        } else {
                            b2 = 1;
                            b3 = 0;
                            c380 c380VarA17 = mqo1.A(arrayList);
                            if (!z2) {
                                size = 0;
                            }
                            nr90Var = new nr90(c380VarA17, i15, size);
                        }
                        i17 = nr90Var.c;
                        if (i17 == 0) {
                            b0kVar4.i0(-122507003);
                            int i217 = (i4 & 112) | 8 | (i4 & 896) | 4096 | (i4 & 7168);
                            int i218 = i4 << 3;
                            boolean z13 = b3;
                            qim0 qim0Var15 = qim0Var4;
                            fc11.a(nr90Var.a, qim0Var15, hcxVar3, huxVar3, false, nr90Var.b, gbxVar3, str3, (idn0) null, b0kVar4, i217 | (3670016 & i218) | (i218 & 29360128), 272);
                            b0kVar4.r(z13);
                            b0kVar3 = b0kVar4;
                            gbxVar5 = gbxVar3;
                            str5 = str3;
                            qim0Var6 = qim0Var15;
                        } else {
                            byte b112 = b3;
                            gbxVar4 = gbxVar3;
                            str4 = str3;
                            qim0Var5 = qim0Var4;
                            b0kVar4.i0(-122187145);
                            fA = hcxVar3.a(b0kVar4);
                            objT = b0kVar4.T();
                            m4cVar = fkj0.X;
                            if (objT == m4cVar) {
                                objT = ktd.n(b0kVar4);
                            }
                            idn0Var = (idn0) objT;
                            if (nr90Var.a.isEmpty()) {
                                b4 = b2;
                            } else {
                                b4 = b2;
                            }
                            if (gbxVar4 != null) {
                                qim0VarV = bin.v(qim0Var5, idn0Var, ny3.a, false, gbxVar4.c, (pm31) null, gbxVar4.b, 20);
                                qim0Var6 = qim0Var5;
                            } else {
                                qim0Var6 = qim0Var5;
                                qim0VarV = qim0Var6;
                            }
                            qim0 qim0VarA9 = s161.a(qim0VarV, new thx(str4, gbxVar4, b2));
                            objT2 = b0kVar4.T();
                            if (objT2 == m4cVar) {
                                objT2 = o390.d1;
                                b0kVar4.s0(objT2);
                            }
                            qim0 qim0VarC9 = i541.C(qim0VarA9, (iu30) objT2);
                            zD = b0kVar4.d(fA);
                            objT3 = b0kVar4.T();
                            if (zD) {
                                objT3 = new j37((byte) 5, fA);
                                b0kVar4.s0(objT3);
                            } else {
                                objT3 = new j37((byte) 5, fA);
                                b0kVar4.s0(objT3);
                            }
                            gfh0Var = (gfh0) objT3;
                            gbxVar5 = gbxVar4;
                            iHashCode = Long.hashCode(((x340) b0kVar4).T);
                            xos0VarM = b0kVar4.m();
                            qim0VarE = zr7.E(b0kVar4, qim0VarC9);
                            hzj.A.getClass();
                            if (((x340) b0kVar4).a != null) {
                                tgp1.p();
                                throw null;
                            }
                            b0kVar4.m0();
                            if (((x340) b0kVar4).S) {
                                b0kVar4.l(hmb0.t1);
                            } else {
                                b0kVar4.v0();
                            }
                            nko1.H(gfh0Var, b0kVar4, y580.O0);
                            nko1.H(xos0VarM, b0kVar4, y580.N0);
                            nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
                            nko1.F(b0kVar4);
                            nko1.H(qim0VarE, b0kVar4, y580.Y);
                            if (b4 != 0) {
                                b0kVar4.i0(-1062221041);
                                str5 = str4;
                                z3 = true;
                                fc11.a(nr90Var.a, (qim0) null, hcxVar3, huxVar3, false, nr90Var.b, (gbx) null, (String) null, (idn0) null, b0kVar4, (i4 & 896) | 4104 | (i4 & 7168), 466);
                                b0kVar3 = b0kVar4;
                                z4 = false;
                                b0kVar3.r(false);
                            } else {
                                b0kVar3 = b0kVar4;
                                str5 = str4;
                                z3 = true;
                                z4 = false;
                                b0kVar3.i0(-1062024997);
                                b0kVar3.r(false);
                            }
                            h(i17, hcxVar3, b0kVar3, (i4 >> 3) & 112);
                            b0kVar3.r(z3);
                            b0kVar3.r(z4);
                        }
                        gbxVar2 = gbxVar5;
                        str2 = str5;
                        b0kVar2 = b0kVar3;
                        hcxVar2 = hcxVar3;
                        huxVar2 = huxVar3;
                        qim0Var3 = qim0Var6;
                    } else {
                        b0kVar4.b0();
                        huxVar2 = huxVar;
                        i15 = i;
                        str2 = str;
                        b0kVar2 = b0kVar4;
                        qim0Var3 = qim0Var2;
                        hcxVar2 = hcxVar;
                        gbxVar2 = gbxVar;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new lr90(c380Var, qim0Var3, hcxVar2, huxVar2, i15, gbxVar2, str2, i2, i3);
                    }
                }
                i4 |= 1572864;
                byte b113 = 1;
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar4.Y(i4 & 1, z)) {
                    if (i18 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        hcxVar3 = hcx.b;
                    } else {
                        hcxVar3 = hcxVar;
                    }
                    if (i7 != 0) {
                        huxVar3 = null;
                    } else {
                        huxVar3 = huxVar;
                    }
                    if (i9 != 0) {
                        i15 = 4;
                    } else {
                        i15 = i;
                    }
                    if (i11 != 0) {
                        gbxVar3 = null;
                    } else {
                        gbxVar3 = gbxVar;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (huxVar3 != null) {
                        i16 = 1;
                    } else {
                        i16 = 0;
                    }
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        if (my90Var instanceof my90) {
                            my90 my90Var11 = my90Var;
                            str6 = my90Var11.a;
                            if (str6 == null) {
                                str6 = "";
                            }
                            phxVar = new phx(8, 0L, str6, my90Var11.b, my90Var11.c);
                        } else {
                            if (u890.j(my90Var, ly90.a)) {
                                eg.o();
                                return;
                            }
                            phxVar = null;
                        }
                        if (phxVar != null) {
                            arrayList.add(phxVar);
                        }
                    }
                    size = c380Var2.size() - arrayList.size();
                    int i118 = i15 - i16;
                    int size11 = arrayList.size() + size;
                    if (size == 1) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (size != 0) {
                        b2 = 1;
                        b3 = 0;
                        c380 c380VarA18 = mqo1.A(arrayList);
                        if (!z2) {
                            size = 0;
                        }
                        nr90Var = new nr90(c380VarA18, i15, size);
                    } else {
                        b2 = 1;
                        b3 = 0;
                        c380 c380VarA19 = mqo1.A(arrayList);
                        if (!z2) {
                            size = 0;
                        }
                        nr90Var = new nr90(c380VarA19, i15, size);
                    }
                    i17 = nr90Var.c;
                    if (i17 == 0) {
                        b0kVar4.i0(-122507003);
                        int i219 = (i4 & 112) | 8 | (i4 & 896) | 4096 | (i4 & 7168);
                        int i2110 = i4 << 3;
                        boolean z14 = b3;
                        qim0 qim0Var16 = qim0Var4;
                        fc11.a(nr90Var.a, qim0Var16, hcxVar3, huxVar3, false, nr90Var.b, gbxVar3, str3, (idn0) null, b0kVar4, i219 | (3670016 & i2110) | (i2110 & 29360128), 272);
                        b0kVar4.r(z14);
                        b0kVar3 = b0kVar4;
                        gbxVar5 = gbxVar3;
                        str5 = str3;
                        qim0Var6 = qim0Var16;
                    } else {
                        byte b114 = b3;
                        gbxVar4 = gbxVar3;
                        str4 = str3;
                        qim0Var5 = qim0Var4;
                        b0kVar4.i0(-122187145);
                        fA = hcxVar3.a(b0kVar4);
                        objT = b0kVar4.T();
                        m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = ktd.n(b0kVar4);
                        }
                        idn0Var = (idn0) objT;
                        if (nr90Var.a.isEmpty()) {
                            b4 = b2;
                        } else {
                            b4 = b2;
                        }
                        if (gbxVar4 != null) {
                            qim0VarV = bin.v(qim0Var5, idn0Var, ny3.a, false, gbxVar4.c, (pm31) null, gbxVar4.b, 20);
                            qim0Var6 = qim0Var5;
                        } else {
                            qim0Var6 = qim0Var5;
                            qim0VarV = qim0Var6;
                        }
                        qim0 qim0VarA10 = s161.a(qim0VarV, new thx(str4, gbxVar4, b2));
                        objT2 = b0kVar4.T();
                        if (objT2 == m4cVar) {
                            objT2 = o390.d1;
                            b0kVar4.s0(objT2);
                        }
                        qim0 qim0VarC10 = i541.C(qim0VarA10, (iu30) objT2);
                        zD = b0kVar4.d(fA);
                        objT3 = b0kVar4.T();
                        if (zD) {
                            objT3 = new j37((byte) 5, fA);
                            b0kVar4.s0(objT3);
                        } else {
                            objT3 = new j37((byte) 5, fA);
                            b0kVar4.s0(objT3);
                        }
                        gfh0Var = (gfh0) objT3;
                        gbxVar5 = gbxVar4;
                        iHashCode = Long.hashCode(((x340) b0kVar4).T);
                        xos0VarM = b0kVar4.m();
                        qim0VarE = zr7.E(b0kVar4, qim0VarC10);
                        hzj.A.getClass();
                        if (((x340) b0kVar4).a != null) {
                            tgp1.p();
                            throw null;
                        }
                        b0kVar4.m0();
                        if (((x340) b0kVar4).S) {
                            b0kVar4.l(hmb0.t1);
                        } else {
                            b0kVar4.v0();
                        }
                        nko1.H(gfh0Var, b0kVar4, y580.O0);
                        nko1.H(xos0VarM, b0kVar4, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
                        nko1.F(b0kVar4);
                        nko1.H(qim0VarE, b0kVar4, y580.Y);
                        if (b4 != 0) {
                            b0kVar4.i0(-1062221041);
                            str5 = str4;
                            z3 = true;
                            fc11.a(nr90Var.a, (qim0) null, hcxVar3, huxVar3, false, nr90Var.b, (gbx) null, (String) null, (idn0) null, b0kVar4, (i4 & 896) | 4104 | (i4 & 7168), 466);
                            b0kVar3 = b0kVar4;
                            z4 = false;
                            b0kVar3.r(false);
                        } else {
                            b0kVar3 = b0kVar4;
                            str5 = str4;
                            z3 = true;
                            z4 = false;
                            b0kVar3.i0(-1062024997);
                            b0kVar3.r(false);
                        }
                        h(i17, hcxVar3, b0kVar3, (i4 >> 3) & 112);
                        b0kVar3.r(z3);
                        b0kVar3.r(z4);
                    }
                    gbxVar2 = gbxVar5;
                    str2 = str5;
                    b0kVar2 = b0kVar3;
                    hcxVar2 = hcxVar3;
                    huxVar2 = huxVar3;
                    qim0Var3 = qim0Var6;
                } else {
                    b0kVar4.b0();
                    huxVar2 = huxVar;
                    i15 = i;
                    str2 = str;
                    b0kVar2 = b0kVar4;
                    qim0Var3 = qim0Var2;
                    hcxVar2 = hcxVar;
                    gbxVar2 = gbxVar;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new lr90(c380Var, qim0Var3, hcxVar2, huxVar2, i15, gbxVar2, str2, i2, i3);
                }
            }
            i4 |= 196608;
            i13 = i3 & 64;
            if (i13 != 0) {
                if ((1572864 & i2) == 0) {
                    if (b0kVar4.g(str)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i4 |= i14;
                }
                byte b115 = 1;
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar4.Y(i4 & 1, z)) {
                    if (i18 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        hcxVar3 = hcx.b;
                    } else {
                        hcxVar3 = hcxVar;
                    }
                    if (i7 != 0) {
                        huxVar3 = null;
                    } else {
                        huxVar3 = huxVar;
                    }
                    if (i9 != 0) {
                        i15 = 4;
                    } else {
                        i15 = i;
                    }
                    if (i11 != 0) {
                        gbxVar3 = null;
                    } else {
                        gbxVar3 = gbxVar;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (huxVar3 != null) {
                        i16 = 1;
                    } else {
                        i16 = 0;
                    }
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        if (my90Var instanceof my90) {
                            my90 my90Var12 = my90Var;
                            str6 = my90Var12.a;
                            if (str6 == null) {
                                str6 = "";
                            }
                            phxVar = new phx(8, 0L, str6, my90Var12.b, my90Var12.c);
                        } else {
                            if (u890.j(my90Var, ly90.a)) {
                                eg.o();
                                return;
                            }
                            phxVar = null;
                        }
                        if (phxVar != null) {
                            arrayList.add(phxVar);
                        }
                    }
                    size = c380Var2.size() - arrayList.size();
                    int i119 = i15 - i16;
                    int size12 = arrayList.size() + size;
                    if (size == 1) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (size != 0) {
                        b2 = 1;
                        b3 = 0;
                        c380 c380VarA110 = mqo1.A(arrayList);
                        if (!z2) {
                            size = 0;
                        }
                        nr90Var = new nr90(c380VarA110, i15, size);
                    } else {
                        b2 = 1;
                        b3 = 0;
                        c380 c380VarA111 = mqo1.A(arrayList);
                        if (!z2) {
                            size = 0;
                        }
                        nr90Var = new nr90(c380VarA111, i15, size);
                    }
                    i17 = nr90Var.c;
                    if (i17 == 0) {
                        b0kVar4.i0(-122507003);
                        int i2111 = (i4 & 112) | 8 | (i4 & 896) | 4096 | (i4 & 7168);
                        int i2112 = i4 << 3;
                        boolean z15 = b3;
                        qim0 qim0Var17 = qim0Var4;
                        fc11.a(nr90Var.a, qim0Var17, hcxVar3, huxVar3, false, nr90Var.b, gbxVar3, str3, (idn0) null, b0kVar4, i2111 | (3670016 & i2112) | (i2112 & 29360128), 272);
                        b0kVar4.r(z15);
                        b0kVar3 = b0kVar4;
                        gbxVar5 = gbxVar3;
                        str5 = str3;
                        qim0Var6 = qim0Var17;
                    } else {
                        byte b116 = b3;
                        gbxVar4 = gbxVar3;
                        str4 = str3;
                        qim0Var5 = qim0Var4;
                        b0kVar4.i0(-122187145);
                        fA = hcxVar3.a(b0kVar4);
                        objT = b0kVar4.T();
                        m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = ktd.n(b0kVar4);
                        }
                        idn0Var = (idn0) objT;
                        if (nr90Var.a.isEmpty()) {
                            b4 = b2;
                        } else {
                            b4 = b2;
                        }
                        if (gbxVar4 != null) {
                            qim0VarV = bin.v(qim0Var5, idn0Var, ny3.a, false, gbxVar4.c, (pm31) null, gbxVar4.b, 20);
                            qim0Var6 = qim0Var5;
                        } else {
                            qim0Var6 = qim0Var5;
                            qim0VarV = qim0Var6;
                        }
                        qim0 qim0VarA11 = s161.a(qim0VarV, new thx(str4, gbxVar4, b2));
                        objT2 = b0kVar4.T();
                        if (objT2 == m4cVar) {
                            objT2 = o390.d1;
                            b0kVar4.s0(objT2);
                        }
                        qim0 qim0VarC11 = i541.C(qim0VarA11, (iu30) objT2);
                        zD = b0kVar4.d(fA);
                        objT3 = b0kVar4.T();
                        if (zD) {
                            objT3 = new j37((byte) 5, fA);
                            b0kVar4.s0(objT3);
                        } else {
                            objT3 = new j37((byte) 5, fA);
                            b0kVar4.s0(objT3);
                        }
                        gfh0Var = (gfh0) objT3;
                        gbxVar5 = gbxVar4;
                        iHashCode = Long.hashCode(((x340) b0kVar4).T);
                        xos0VarM = b0kVar4.m();
                        qim0VarE = zr7.E(b0kVar4, qim0VarC11);
                        hzj.A.getClass();
                        if (((x340) b0kVar4).a != null) {
                            tgp1.p();
                            throw null;
                        }
                        b0kVar4.m0();
                        if (((x340) b0kVar4).S) {
                            b0kVar4.l(hmb0.t1);
                        } else {
                            b0kVar4.v0();
                        }
                        nko1.H(gfh0Var, b0kVar4, y580.O0);
                        nko1.H(xos0VarM, b0kVar4, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
                        nko1.F(b0kVar4);
                        nko1.H(qim0VarE, b0kVar4, y580.Y);
                        if (b4 != 0) {
                            b0kVar4.i0(-1062221041);
                            str5 = str4;
                            z3 = true;
                            fc11.a(nr90Var.a, (qim0) null, hcxVar3, huxVar3, false, nr90Var.b, (gbx) null, (String) null, (idn0) null, b0kVar4, (i4 & 896) | 4104 | (i4 & 7168), 466);
                            b0kVar3 = b0kVar4;
                            z4 = false;
                            b0kVar3.r(false);
                        } else {
                            b0kVar3 = b0kVar4;
                            str5 = str4;
                            z3 = true;
                            z4 = false;
                            b0kVar3.i0(-1062024997);
                            b0kVar3.r(false);
                        }
                        h(i17, hcxVar3, b0kVar3, (i4 >> 3) & 112);
                        b0kVar3.r(z3);
                        b0kVar3.r(z4);
                    }
                    gbxVar2 = gbxVar5;
                    str2 = str5;
                    b0kVar2 = b0kVar3;
                    hcxVar2 = hcxVar3;
                    huxVar2 = huxVar3;
                    qim0Var3 = qim0Var6;
                } else {
                    b0kVar4.b0();
                    huxVar2 = huxVar;
                    i15 = i;
                    str2 = str;
                    b0kVar2 = b0kVar4;
                    qim0Var3 = qim0Var2;
                    hcxVar2 = hcxVar;
                    gbxVar2 = gbxVar;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new lr90(c380Var, qim0Var3, hcxVar2, huxVar2, i15, gbxVar2, str2, i2, i3);
                }
            }
            i4 |= 1572864;
            byte b117 = 1;
            if ((i4 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar4.Y(i4 & 1, z)) {
                if (i18 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i5 != 0) {
                    hcxVar3 = hcx.b;
                } else {
                    hcxVar3 = hcxVar;
                }
                if (i7 != 0) {
                    huxVar3 = null;
                } else {
                    huxVar3 = huxVar;
                }
                if (i9 != 0) {
                    i15 = 4;
                } else {
                    i15 = i;
                }
                if (i11 != 0) {
                    gbxVar3 = null;
                } else {
                    gbxVar3 = gbxVar;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (huxVar3 != null) {
                    i16 = 1;
                } else {
                    i16 = 0;
                }
                arrayList = new ArrayList();
                while (r7.hasNext()) {
                    if (my90Var instanceof my90) {
                        my90 my90Var13 = my90Var;
                        str6 = my90Var13.a;
                        if (str6 == null) {
                            str6 = "";
                        }
                        phxVar = new phx(8, 0L, str6, my90Var13.b, my90Var13.c);
                    } else {
                        if (u890.j(my90Var, ly90.a)) {
                            eg.o();
                            return;
                        }
                        phxVar = null;
                    }
                    if (phxVar != null) {
                        arrayList.add(phxVar);
                    }
                }
                size = c380Var2.size() - arrayList.size();
                int i1110 = i15 - i16;
                int size13 = arrayList.size() + size;
                if (size == 1) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (size != 0) {
                    b2 = 1;
                    b3 = 0;
                    c380 c380VarA112 = mqo1.A(arrayList);
                    if (!z2) {
                        size = 0;
                    }
                    nr90Var = new nr90(c380VarA112, i15, size);
                } else {
                    b2 = 1;
                    b3 = 0;
                    c380 c380VarA113 = mqo1.A(arrayList);
                    if (!z2) {
                        size = 0;
                    }
                    nr90Var = new nr90(c380VarA113, i15, size);
                }
                i17 = nr90Var.c;
                if (i17 == 0) {
                    b0kVar4.i0(-122507003);
                    int i2113 = (i4 & 112) | 8 | (i4 & 896) | 4096 | (i4 & 7168);
                    int i2114 = i4 << 3;
                    boolean z16 = b3;
                    qim0 qim0Var18 = qim0Var4;
                    fc11.a(nr90Var.a, qim0Var18, hcxVar3, huxVar3, false, nr90Var.b, gbxVar3, str3, (idn0) null, b0kVar4, i2113 | (3670016 & i2114) | (i2114 & 29360128), 272);
                    b0kVar4.r(z16);
                    b0kVar3 = b0kVar4;
                    gbxVar5 = gbxVar3;
                    str5 = str3;
                    qim0Var6 = qim0Var18;
                } else {
                    byte b118 = b3;
                    gbxVar4 = gbxVar3;
                    str4 = str3;
                    qim0Var5 = qim0Var4;
                    b0kVar4.i0(-122187145);
                    fA = hcxVar3.a(b0kVar4);
                    objT = b0kVar4.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = ktd.n(b0kVar4);
                    }
                    idn0Var = (idn0) objT;
                    if (nr90Var.a.isEmpty()) {
                        b4 = b2;
                    } else {
                        b4 = b2;
                    }
                    if (gbxVar4 != null) {
                        qim0VarV = bin.v(qim0Var5, idn0Var, ny3.a, false, gbxVar4.c, (pm31) null, gbxVar4.b, 20);
                        qim0Var6 = qim0Var5;
                    } else {
                        qim0Var6 = qim0Var5;
                        qim0VarV = qim0Var6;
                    }
                    qim0 qim0VarA12 = s161.a(qim0VarV, new thx(str4, gbxVar4, b2));
                    objT2 = b0kVar4.T();
                    if (objT2 == m4cVar) {
                        objT2 = o390.d1;
                        b0kVar4.s0(objT2);
                    }
                    qim0 qim0VarC12 = i541.C(qim0VarA12, (iu30) objT2);
                    zD = b0kVar4.d(fA);
                    objT3 = b0kVar4.T();
                    if (zD) {
                        objT3 = new j37((byte) 5, fA);
                        b0kVar4.s0(objT3);
                    } else {
                        objT3 = new j37((byte) 5, fA);
                        b0kVar4.s0(objT3);
                    }
                    gfh0Var = (gfh0) objT3;
                    gbxVar5 = gbxVar4;
                    iHashCode = Long.hashCode(((x340) b0kVar4).T);
                    xos0VarM = b0kVar4.m();
                    qim0VarE = zr7.E(b0kVar4, qim0VarC12);
                    hzj.A.getClass();
                    if (((x340) b0kVar4).a != null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar4.m0();
                    if (((x340) b0kVar4).S) {
                        b0kVar4.l(hmb0.t1);
                    } else {
                        b0kVar4.v0();
                    }
                    nko1.H(gfh0Var, b0kVar4, y580.O0);
                    nko1.H(xos0VarM, b0kVar4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
                    nko1.F(b0kVar4);
                    nko1.H(qim0VarE, b0kVar4, y580.Y);
                    if (b4 != 0) {
                        b0kVar4.i0(-1062221041);
                        str5 = str4;
                        z3 = true;
                        fc11.a(nr90Var.a, (qim0) null, hcxVar3, huxVar3, false, nr90Var.b, (gbx) null, (String) null, (idn0) null, b0kVar4, (i4 & 896) | 4104 | (i4 & 7168), 466);
                        b0kVar3 = b0kVar4;
                        z4 = false;
                        b0kVar3.r(false);
                    } else {
                        b0kVar3 = b0kVar4;
                        str5 = str4;
                        z3 = true;
                        z4 = false;
                        b0kVar3.i0(-1062024997);
                        b0kVar3.r(false);
                    }
                    h(i17, hcxVar3, b0kVar3, (i4 >> 3) & 112);
                    b0kVar3.r(z3);
                    b0kVar3.r(z4);
                }
                gbxVar2 = gbxVar5;
                str2 = str5;
                b0kVar2 = b0kVar3;
                hcxVar2 = hcxVar3;
                huxVar2 = huxVar3;
                qim0Var3 = qim0Var6;
            } else {
                b0kVar4.b0();
                huxVar2 = huxVar;
                i15 = i;
                str2 = str;
                b0kVar2 = b0kVar4;
                qim0Var3 = qim0Var2;
                hcxVar2 = hcxVar;
                gbxVar2 = gbxVar;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new lr90(c380Var, qim0Var3, hcxVar2, huxVar2, i15, gbxVar2, str2, i2, i3);
            }
        }
        i4 |= 24576;
        i11 = i3 & 32;
        if (i11 != 0) {
            if ((196608 & i2) == 0) {
                if (b0kVar4.i(gbxVar)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i4 |= i12;
            }
            i13 = i3 & 64;
            if (i13 != 0) {
                if ((1572864 & i2) == 0) {
                    if (b0kVar4.g(str)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i4 |= i14;
                }
                byte b119 = 1;
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar4.Y(i4 & 1, z)) {
                    if (i18 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        hcxVar3 = hcx.b;
                    } else {
                        hcxVar3 = hcxVar;
                    }
                    if (i7 != 0) {
                        huxVar3 = null;
                    } else {
                        huxVar3 = huxVar;
                    }
                    if (i9 != 0) {
                        i15 = 4;
                    } else {
                        i15 = i;
                    }
                    if (i11 != 0) {
                        gbxVar3 = null;
                    } else {
                        gbxVar3 = gbxVar;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (huxVar3 != null) {
                        i16 = 1;
                    } else {
                        i16 = 0;
                    }
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        if (my90Var instanceof my90) {
                            my90 my90Var14 = my90Var;
                            str6 = my90Var14.a;
                            if (str6 == null) {
                                str6 = "";
                            }
                            phxVar = new phx(8, 0L, str6, my90Var14.b, my90Var14.c);
                        } else {
                            if (u890.j(my90Var, ly90.a)) {
                                eg.o();
                                return;
                            }
                            phxVar = null;
                        }
                        if (phxVar != null) {
                            arrayList.add(phxVar);
                        }
                    }
                    size = c380Var2.size() - arrayList.size();
                    int i1111 = i15 - i16;
                    int size14 = arrayList.size() + size;
                    if (size == 1) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (size != 0) {
                        b2 = 1;
                        b3 = 0;
                        c380 c380VarA114 = mqo1.A(arrayList);
                        if (!z2) {
                            size = 0;
                        }
                        nr90Var = new nr90(c380VarA114, i15, size);
                    } else {
                        b2 = 1;
                        b3 = 0;
                        c380 c380VarA115 = mqo1.A(arrayList);
                        if (!z2) {
                            size = 0;
                        }
                        nr90Var = new nr90(c380VarA115, i15, size);
                    }
                    i17 = nr90Var.c;
                    if (i17 == 0) {
                        b0kVar4.i0(-122507003);
                        int i2115 = (i4 & 112) | 8 | (i4 & 896) | 4096 | (i4 & 7168);
                        int i2116 = i4 << 3;
                        boolean z17 = b3;
                        qim0 qim0Var19 = qim0Var4;
                        fc11.a(nr90Var.a, qim0Var19, hcxVar3, huxVar3, false, nr90Var.b, gbxVar3, str3, (idn0) null, b0kVar4, i2115 | (3670016 & i2116) | (i2116 & 29360128), 272);
                        b0kVar4.r(z17);
                        b0kVar3 = b0kVar4;
                        gbxVar5 = gbxVar3;
                        str5 = str3;
                        qim0Var6 = qim0Var19;
                    } else {
                        byte b1110 = b3;
                        gbxVar4 = gbxVar3;
                        str4 = str3;
                        qim0Var5 = qim0Var4;
                        b0kVar4.i0(-122187145);
                        fA = hcxVar3.a(b0kVar4);
                        objT = b0kVar4.T();
                        m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = ktd.n(b0kVar4);
                        }
                        idn0Var = (idn0) objT;
                        if (nr90Var.a.isEmpty()) {
                            b4 = b2;
                        } else {
                            b4 = b2;
                        }
                        if (gbxVar4 != null) {
                            qim0VarV = bin.v(qim0Var5, idn0Var, ny3.a, false, gbxVar4.c, (pm31) null, gbxVar4.b, 20);
                            qim0Var6 = qim0Var5;
                        } else {
                            qim0Var6 = qim0Var5;
                            qim0VarV = qim0Var6;
                        }
                        qim0 qim0VarA13 = s161.a(qim0VarV, new thx(str4, gbxVar4, b2));
                        objT2 = b0kVar4.T();
                        if (objT2 == m4cVar) {
                            objT2 = o390.d1;
                            b0kVar4.s0(objT2);
                        }
                        qim0 qim0VarC13 = i541.C(qim0VarA13, (iu30) objT2);
                        zD = b0kVar4.d(fA);
                        objT3 = b0kVar4.T();
                        if (zD) {
                            objT3 = new j37((byte) 5, fA);
                            b0kVar4.s0(objT3);
                        } else {
                            objT3 = new j37((byte) 5, fA);
                            b0kVar4.s0(objT3);
                        }
                        gfh0Var = (gfh0) objT3;
                        gbxVar5 = gbxVar4;
                        iHashCode = Long.hashCode(((x340) b0kVar4).T);
                        xos0VarM = b0kVar4.m();
                        qim0VarE = zr7.E(b0kVar4, qim0VarC13);
                        hzj.A.getClass();
                        if (((x340) b0kVar4).a != null) {
                            tgp1.p();
                            throw null;
                        }
                        b0kVar4.m0();
                        if (((x340) b0kVar4).S) {
                            b0kVar4.l(hmb0.t1);
                        } else {
                            b0kVar4.v0();
                        }
                        nko1.H(gfh0Var, b0kVar4, y580.O0);
                        nko1.H(xos0VarM, b0kVar4, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
                        nko1.F(b0kVar4);
                        nko1.H(qim0VarE, b0kVar4, y580.Y);
                        if (b4 != 0) {
                            b0kVar4.i0(-1062221041);
                            str5 = str4;
                            z3 = true;
                            fc11.a(nr90Var.a, (qim0) null, hcxVar3, huxVar3, false, nr90Var.b, (gbx) null, (String) null, (idn0) null, b0kVar4, (i4 & 896) | 4104 | (i4 & 7168), 466);
                            b0kVar3 = b0kVar4;
                            z4 = false;
                            b0kVar3.r(false);
                        } else {
                            b0kVar3 = b0kVar4;
                            str5 = str4;
                            z3 = true;
                            z4 = false;
                            b0kVar3.i0(-1062024997);
                            b0kVar3.r(false);
                        }
                        h(i17, hcxVar3, b0kVar3, (i4 >> 3) & 112);
                        b0kVar3.r(z3);
                        b0kVar3.r(z4);
                    }
                    gbxVar2 = gbxVar5;
                    str2 = str5;
                    b0kVar2 = b0kVar3;
                    hcxVar2 = hcxVar3;
                    huxVar2 = huxVar3;
                    qim0Var3 = qim0Var6;
                } else {
                    b0kVar4.b0();
                    huxVar2 = huxVar;
                    i15 = i;
                    str2 = str;
                    b0kVar2 = b0kVar4;
                    qim0Var3 = qim0Var2;
                    hcxVar2 = hcxVar;
                    gbxVar2 = gbxVar;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new lr90(c380Var, qim0Var3, hcxVar2, huxVar2, i15, gbxVar2, str2, i2, i3);
                }
            }
            i4 |= 1572864;
            byte b1111 = 1;
            if ((i4 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar4.Y(i4 & 1, z)) {
                if (i18 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i5 != 0) {
                    hcxVar3 = hcx.b;
                } else {
                    hcxVar3 = hcxVar;
                }
                if (i7 != 0) {
                    huxVar3 = null;
                } else {
                    huxVar3 = huxVar;
                }
                if (i9 != 0) {
                    i15 = 4;
                } else {
                    i15 = i;
                }
                if (i11 != 0) {
                    gbxVar3 = null;
                } else {
                    gbxVar3 = gbxVar;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (huxVar3 != null) {
                    i16 = 1;
                } else {
                    i16 = 0;
                }
                arrayList = new ArrayList();
                while (r7.hasNext()) {
                    if (my90Var instanceof my90) {
                        my90 my90Var15 = my90Var;
                        str6 = my90Var15.a;
                        if (str6 == null) {
                            str6 = "";
                        }
                        phxVar = new phx(8, 0L, str6, my90Var15.b, my90Var15.c);
                    } else {
                        if (u890.j(my90Var, ly90.a)) {
                            eg.o();
                            return;
                        }
                        phxVar = null;
                    }
                    if (phxVar != null) {
                        arrayList.add(phxVar);
                    }
                }
                size = c380Var2.size() - arrayList.size();
                int i1112 = i15 - i16;
                int size15 = arrayList.size() + size;
                if (size == 1) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (size != 0) {
                    b2 = 1;
                    b3 = 0;
                    c380 c380VarA116 = mqo1.A(arrayList);
                    if (!z2) {
                        size = 0;
                    }
                    nr90Var = new nr90(c380VarA116, i15, size);
                } else {
                    b2 = 1;
                    b3 = 0;
                    c380 c380VarA117 = mqo1.A(arrayList);
                    if (!z2) {
                        size = 0;
                    }
                    nr90Var = new nr90(c380VarA117, i15, size);
                }
                i17 = nr90Var.c;
                if (i17 == 0) {
                    b0kVar4.i0(-122507003);
                    int i2117 = (i4 & 112) | 8 | (i4 & 896) | 4096 | (i4 & 7168);
                    int i2118 = i4 << 3;
                    boolean z18 = b3;
                    qim0 qim0Var110 = qim0Var4;
                    fc11.a(nr90Var.a, qim0Var110, hcxVar3, huxVar3, false, nr90Var.b, gbxVar3, str3, (idn0) null, b0kVar4, i2117 | (3670016 & i2118) | (i2118 & 29360128), 272);
                    b0kVar4.r(z18);
                    b0kVar3 = b0kVar4;
                    gbxVar5 = gbxVar3;
                    str5 = str3;
                    qim0Var6 = qim0Var110;
                } else {
                    byte b1112 = b3;
                    gbxVar4 = gbxVar3;
                    str4 = str3;
                    qim0Var5 = qim0Var4;
                    b0kVar4.i0(-122187145);
                    fA = hcxVar3.a(b0kVar4);
                    objT = b0kVar4.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = ktd.n(b0kVar4);
                    }
                    idn0Var = (idn0) objT;
                    if (nr90Var.a.isEmpty()) {
                        b4 = b2;
                    } else {
                        b4 = b2;
                    }
                    if (gbxVar4 != null) {
                        qim0VarV = bin.v(qim0Var5, idn0Var, ny3.a, false, gbxVar4.c, (pm31) null, gbxVar4.b, 20);
                        qim0Var6 = qim0Var5;
                    } else {
                        qim0Var6 = qim0Var5;
                        qim0VarV = qim0Var6;
                    }
                    qim0 qim0VarA14 = s161.a(qim0VarV, new thx(str4, gbxVar4, b2));
                    objT2 = b0kVar4.T();
                    if (objT2 == m4cVar) {
                        objT2 = o390.d1;
                        b0kVar4.s0(objT2);
                    }
                    qim0 qim0VarC14 = i541.C(qim0VarA14, (iu30) objT2);
                    zD = b0kVar4.d(fA);
                    objT3 = b0kVar4.T();
                    if (zD) {
                        objT3 = new j37((byte) 5, fA);
                        b0kVar4.s0(objT3);
                    } else {
                        objT3 = new j37((byte) 5, fA);
                        b0kVar4.s0(objT3);
                    }
                    gfh0Var = (gfh0) objT3;
                    gbxVar5 = gbxVar4;
                    iHashCode = Long.hashCode(((x340) b0kVar4).T);
                    xos0VarM = b0kVar4.m();
                    qim0VarE = zr7.E(b0kVar4, qim0VarC14);
                    hzj.A.getClass();
                    if (((x340) b0kVar4).a != null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar4.m0();
                    if (((x340) b0kVar4).S) {
                        b0kVar4.l(hmb0.t1);
                    } else {
                        b0kVar4.v0();
                    }
                    nko1.H(gfh0Var, b0kVar4, y580.O0);
                    nko1.H(xos0VarM, b0kVar4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
                    nko1.F(b0kVar4);
                    nko1.H(qim0VarE, b0kVar4, y580.Y);
                    if (b4 != 0) {
                        b0kVar4.i0(-1062221041);
                        str5 = str4;
                        z3 = true;
                        fc11.a(nr90Var.a, (qim0) null, hcxVar3, huxVar3, false, nr90Var.b, (gbx) null, (String) null, (idn0) null, b0kVar4, (i4 & 896) | 4104 | (i4 & 7168), 466);
                        b0kVar3 = b0kVar4;
                        z4 = false;
                        b0kVar3.r(false);
                    } else {
                        b0kVar3 = b0kVar4;
                        str5 = str4;
                        z3 = true;
                        z4 = false;
                        b0kVar3.i0(-1062024997);
                        b0kVar3.r(false);
                    }
                    h(i17, hcxVar3, b0kVar3, (i4 >> 3) & 112);
                    b0kVar3.r(z3);
                    b0kVar3.r(z4);
                }
                gbxVar2 = gbxVar5;
                str2 = str5;
                b0kVar2 = b0kVar3;
                hcxVar2 = hcxVar3;
                huxVar2 = huxVar3;
                qim0Var3 = qim0Var6;
            } else {
                b0kVar4.b0();
                huxVar2 = huxVar;
                i15 = i;
                str2 = str;
                b0kVar2 = b0kVar4;
                qim0Var3 = qim0Var2;
                hcxVar2 = hcxVar;
                gbxVar2 = gbxVar;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new lr90(c380Var, qim0Var3, hcxVar2, huxVar2, i15, gbxVar2, str2, i2, i3);
            }
        }
        i4 |= 196608;
        i13 = i3 & 64;
        if (i13 != 0) {
            if ((1572864 & i2) == 0) {
                if (b0kVar4.g(str)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i4 |= i14;
            }
            byte b1113 = 1;
            if ((i4 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar4.Y(i4 & 1, z)) {
                if (i18 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i5 != 0) {
                    hcxVar3 = hcx.b;
                } else {
                    hcxVar3 = hcxVar;
                }
                if (i7 != 0) {
                    huxVar3 = null;
                } else {
                    huxVar3 = huxVar;
                }
                if (i9 != 0) {
                    i15 = 4;
                } else {
                    i15 = i;
                }
                if (i11 != 0) {
                    gbxVar3 = null;
                } else {
                    gbxVar3 = gbxVar;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (huxVar3 != null) {
                    i16 = 1;
                } else {
                    i16 = 0;
                }
                arrayList = new ArrayList();
                while (r7.hasNext()) {
                    if (my90Var instanceof my90) {
                        my90 my90Var16 = my90Var;
                        str6 = my90Var16.a;
                        if (str6 == null) {
                            str6 = "";
                        }
                        phxVar = new phx(8, 0L, str6, my90Var16.b, my90Var16.c);
                    } else {
                        if (u890.j(my90Var, ly90.a)) {
                            eg.o();
                            return;
                        }
                        phxVar = null;
                    }
                    if (phxVar != null) {
                        arrayList.add(phxVar);
                    }
                }
                size = c380Var2.size() - arrayList.size();
                int i1113 = i15 - i16;
                int size16 = arrayList.size() + size;
                if (size == 1) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (size != 0) {
                    b2 = 1;
                    b3 = 0;
                    c380 c380VarA118 = mqo1.A(arrayList);
                    if (!z2) {
                        size = 0;
                    }
                    nr90Var = new nr90(c380VarA118, i15, size);
                } else {
                    b2 = 1;
                    b3 = 0;
                    c380 c380VarA119 = mqo1.A(arrayList);
                    if (!z2) {
                        size = 0;
                    }
                    nr90Var = new nr90(c380VarA119, i15, size);
                }
                i17 = nr90Var.c;
                if (i17 == 0) {
                    b0kVar4.i0(-122507003);
                    int i2119 = (i4 & 112) | 8 | (i4 & 896) | 4096 | (i4 & 7168);
                    int i21110 = i4 << 3;
                    boolean z19 = b3;
                    qim0 qim0Var111 = qim0Var4;
                    fc11.a(nr90Var.a, qim0Var111, hcxVar3, huxVar3, false, nr90Var.b, gbxVar3, str3, (idn0) null, b0kVar4, i2119 | (3670016 & i21110) | (i21110 & 29360128), 272);
                    b0kVar4.r(z19);
                    b0kVar3 = b0kVar4;
                    gbxVar5 = gbxVar3;
                    str5 = str3;
                    qim0Var6 = qim0Var111;
                } else {
                    byte b1114 = b3;
                    gbxVar4 = gbxVar3;
                    str4 = str3;
                    qim0Var5 = qim0Var4;
                    b0kVar4.i0(-122187145);
                    fA = hcxVar3.a(b0kVar4);
                    objT = b0kVar4.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = ktd.n(b0kVar4);
                    }
                    idn0Var = (idn0) objT;
                    if (nr90Var.a.isEmpty()) {
                        b4 = b2;
                    } else {
                        b4 = b2;
                    }
                    if (gbxVar4 != null) {
                        qim0VarV = bin.v(qim0Var5, idn0Var, ny3.a, false, gbxVar4.c, (pm31) null, gbxVar4.b, 20);
                        qim0Var6 = qim0Var5;
                    } else {
                        qim0Var6 = qim0Var5;
                        qim0VarV = qim0Var6;
                    }
                    qim0 qim0VarA15 = s161.a(qim0VarV, new thx(str4, gbxVar4, b2));
                    objT2 = b0kVar4.T();
                    if (objT2 == m4cVar) {
                        objT2 = o390.d1;
                        b0kVar4.s0(objT2);
                    }
                    qim0 qim0VarC15 = i541.C(qim0VarA15, (iu30) objT2);
                    zD = b0kVar4.d(fA);
                    objT3 = b0kVar4.T();
                    if (zD) {
                        objT3 = new j37((byte) 5, fA);
                        b0kVar4.s0(objT3);
                    } else {
                        objT3 = new j37((byte) 5, fA);
                        b0kVar4.s0(objT3);
                    }
                    gfh0Var = (gfh0) objT3;
                    gbxVar5 = gbxVar4;
                    iHashCode = Long.hashCode(((x340) b0kVar4).T);
                    xos0VarM = b0kVar4.m();
                    qim0VarE = zr7.E(b0kVar4, qim0VarC15);
                    hzj.A.getClass();
                    if (((x340) b0kVar4).a != null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar4.m0();
                    if (((x340) b0kVar4).S) {
                        b0kVar4.l(hmb0.t1);
                    } else {
                        b0kVar4.v0();
                    }
                    nko1.H(gfh0Var, b0kVar4, y580.O0);
                    nko1.H(xos0VarM, b0kVar4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
                    nko1.F(b0kVar4);
                    nko1.H(qim0VarE, b0kVar4, y580.Y);
                    if (b4 != 0) {
                        b0kVar4.i0(-1062221041);
                        str5 = str4;
                        z3 = true;
                        fc11.a(nr90Var.a, (qim0) null, hcxVar3, huxVar3, false, nr90Var.b, (gbx) null, (String) null, (idn0) null, b0kVar4, (i4 & 896) | 4104 | (i4 & 7168), 466);
                        b0kVar3 = b0kVar4;
                        z4 = false;
                        b0kVar3.r(false);
                    } else {
                        b0kVar3 = b0kVar4;
                        str5 = str4;
                        z3 = true;
                        z4 = false;
                        b0kVar3.i0(-1062024997);
                        b0kVar3.r(false);
                    }
                    h(i17, hcxVar3, b0kVar3, (i4 >> 3) & 112);
                    b0kVar3.r(z3);
                    b0kVar3.r(z4);
                }
                gbxVar2 = gbxVar5;
                str2 = str5;
                b0kVar2 = b0kVar3;
                hcxVar2 = hcxVar3;
                huxVar2 = huxVar3;
                qim0Var3 = qim0Var6;
            } else {
                b0kVar4.b0();
                huxVar2 = huxVar;
                i15 = i;
                str2 = str;
                b0kVar2 = b0kVar4;
                qim0Var3 = qim0Var2;
                hcxVar2 = hcxVar;
                gbxVar2 = gbxVar;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new lr90(c380Var, qim0Var3, hcxVar2, huxVar2, i15, gbxVar2, str2, i2, i3);
            }
        }
        i4 |= 1572864;
        byte b1115 = 1;
        if ((i4 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar4.Y(i4 & 1, z)) {
            if (i18 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            if (i5 != 0) {
                hcxVar3 = hcx.b;
            } else {
                hcxVar3 = hcxVar;
            }
            if (i7 != 0) {
                huxVar3 = null;
            } else {
                huxVar3 = huxVar;
            }
            if (i9 != 0) {
                i15 = 4;
            } else {
                i15 = i;
            }
            if (i11 != 0) {
                gbxVar3 = null;
            } else {
                gbxVar3 = gbxVar;
            }
            if (i13 != 0) {
                str3 = null;
            } else {
                str3 = str;
            }
            if (huxVar3 != null) {
                i16 = 1;
            } else {
                i16 = 0;
            }
            arrayList = new ArrayList();
            while (r7.hasNext()) {
                if (my90Var instanceof my90) {
                    my90 my90Var17 = my90Var;
                    str6 = my90Var17.a;
                    if (str6 == null) {
                        str6 = "";
                    }
                    phxVar = new phx(8, 0L, str6, my90Var17.b, my90Var17.c);
                } else {
                    if (u890.j(my90Var, ly90.a)) {
                        eg.o();
                        return;
                    }
                    phxVar = null;
                }
                if (phxVar != null) {
                    arrayList.add(phxVar);
                }
            }
            size = c380Var2.size() - arrayList.size();
            int i1114 = i15 - i16;
            int size17 = arrayList.size() + size;
            if (size == 1) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (size != 0) {
                b2 = 1;
                b3 = 0;
                c380 c380VarA1110 = mqo1.A(arrayList);
                if (!z2) {
                    size = 0;
                }
                nr90Var = new nr90(c380VarA1110, i15, size);
            } else {
                b2 = 1;
                b3 = 0;
                c380 c380VarA1111 = mqo1.A(arrayList);
                if (!z2) {
                    size = 0;
                }
                nr90Var = new nr90(c380VarA1111, i15, size);
            }
            i17 = nr90Var.c;
            if (i17 == 0) {
                b0kVar4.i0(-122507003);
                int i21111 = (i4 & 112) | 8 | (i4 & 896) | 4096 | (i4 & 7168);
                int i21112 = i4 << 3;
                boolean z110 = b3;
                qim0 qim0Var112 = qim0Var4;
                fc11.a(nr90Var.a, qim0Var112, hcxVar3, huxVar3, false, nr90Var.b, gbxVar3, str3, (idn0) null, b0kVar4, i21111 | (3670016 & i21112) | (i21112 & 29360128), 272);
                b0kVar4.r(z110);
                b0kVar3 = b0kVar4;
                gbxVar5 = gbxVar3;
                str5 = str3;
                qim0Var6 = qim0Var112;
            } else {
                byte b1116 = b3;
                gbxVar4 = gbxVar3;
                str4 = str3;
                qim0Var5 = qim0Var4;
                b0kVar4.i0(-122187145);
                fA = hcxVar3.a(b0kVar4);
                objT = b0kVar4.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = ktd.n(b0kVar4);
                }
                idn0Var = (idn0) objT;
                if (nr90Var.a.isEmpty()) {
                    b4 = b2;
                } else {
                    b4 = b2;
                }
                if (gbxVar4 != null) {
                    qim0VarV = bin.v(qim0Var5, idn0Var, ny3.a, false, gbxVar4.c, (pm31) null, gbxVar4.b, 20);
                    qim0Var6 = qim0Var5;
                } else {
                    qim0Var6 = qim0Var5;
                    qim0VarV = qim0Var6;
                }
                qim0 qim0VarA16 = s161.a(qim0VarV, new thx(str4, gbxVar4, b2));
                objT2 = b0kVar4.T();
                if (objT2 == m4cVar) {
                    objT2 = o390.d1;
                    b0kVar4.s0(objT2);
                }
                qim0 qim0VarC16 = i541.C(qim0VarA16, (iu30) objT2);
                zD = b0kVar4.d(fA);
                objT3 = b0kVar4.T();
                if (zD) {
                    objT3 = new j37((byte) 5, fA);
                    b0kVar4.s0(objT3);
                } else {
                    objT3 = new j37((byte) 5, fA);
                    b0kVar4.s0(objT3);
                }
                gfh0Var = (gfh0) objT3;
                gbxVar5 = gbxVar4;
                iHashCode = Long.hashCode(((x340) b0kVar4).T);
                xos0VarM = b0kVar4.m();
                qim0VarE = zr7.E(b0kVar4, qim0VarC16);
                hzj.A.getClass();
                if (((x340) b0kVar4).a != null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar4.m0();
                if (((x340) b0kVar4).S) {
                    b0kVar4.l(hmb0.t1);
                } else {
                    b0kVar4.v0();
                }
                nko1.H(gfh0Var, b0kVar4, y580.O0);
                nko1.H(xos0VarM, b0kVar4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
                nko1.F(b0kVar4);
                nko1.H(qim0VarE, b0kVar4, y580.Y);
                if (b4 != 0) {
                    b0kVar4.i0(-1062221041);
                    str5 = str4;
                    z3 = true;
                    fc11.a(nr90Var.a, (qim0) null, hcxVar3, huxVar3, false, nr90Var.b, (gbx) null, (String) null, (idn0) null, b0kVar4, (i4 & 896) | 4104 | (i4 & 7168), 466);
                    b0kVar3 = b0kVar4;
                    z4 = false;
                    b0kVar3.r(false);
                } else {
                    b0kVar3 = b0kVar4;
                    str5 = str4;
                    z3 = true;
                    z4 = false;
                    b0kVar3.i0(-1062024997);
                    b0kVar3.r(false);
                }
                h(i17, hcxVar3, b0kVar3, (i4 >> 3) & 112);
                b0kVar3.r(z3);
                b0kVar3.r(z4);
            }
            gbxVar2 = gbxVar5;
            str2 = str5;
            b0kVar2 = b0kVar3;
            hcxVar2 = hcxVar3;
            huxVar2 = huxVar3;
            qim0Var3 = qim0Var6;
        } else {
            b0kVar4.b0();
            huxVar2 = huxVar;
            i15 = i;
            str2 = str;
            b0kVar2 = b0kVar4;
            qim0Var3 = qim0Var2;
            hcxVar2 = hcxVar;
            gbxVar2 = gbxVar;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lr90(c380Var, qim0Var3, hcxVar2, huxVar2, i15, gbxVar2, str2, i2, i3);
        }
    }

    public static final void j(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-57869790);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gra graVar = een.h;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = dug.f(u291.d(qim0Var2, 1.0f), u7h.b(u7h.b, 0.5f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = mia.g;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = f8d1.b(qim0VarF, rih1.a, (PointerInputEventHandler) objT);
            gfh0 gfh0VarC = t1c.c(graVar, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            yto1.e(3, 48, 1, x340Var, (qim0) null);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void k(String str, String str2, boolean z, boolean z2, iu30 iu30Var, qim0 qim0Var, String str3, String str4, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        char c2;
        ?? r6;
        Function0 function0;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(25010458);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var2.g(qim0Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= x340Var2.g(str3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var2.g(str4) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (x340Var2.Y(i3 & 1, (i3 & 4793491) != 4793490)) {
            x340Var2.d0();
            if ((i & 1) != 0 && !x340Var2.E()) {
                x340Var2.b0();
            }
            x340Var2.s();
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z3 = x340Var2.S;
            Function0 function1 = hmb0.t1;
            if (z3) {
                x340Var2.l(function1);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(12.0f, 0.0f, 2, qim0VarF2);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarZ);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(function1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            String strO0 = cwl1.o0(x340Var2, 2131957823);
            qim0 qim0VarN = anm1.N("#LyricsFullscreenCloseButtonTag", nim0Var);
            gra graVar2 = een.g;
            h2c h2cVar = h2c.a;
            qim0 qim0VarA = h2cVar.a(qim0VarN, graVar2);
            boolean zG = x340Var2.g(strO0);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new z9b0(strO0, (byte) 15);
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarA, false, (iu30) objT);
            int i4 = i3 & 57344;
            boolean z4 = i4 == 16384;
            Object objT2 = x340Var2.T();
            if (z4 || objT2 == m4cVar) {
                c2 = 2;
                objT2 = new uef0(iu30Var, (byte) 2);
                x340Var2.s0(objT2);
            } else {
                c2 = 2;
            }
            gbx gbxVar = new gbx(new y50(str3), (Function0) objT2);
            ldx ldxVar = ldx.c;
            wro1.h(gbxVar, ldxVar, qim0VarB, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, byi.a, x340Var2, 48, 6, 1016);
            x340 x340Var3 = x340Var2;
            if (z2) {
                x340Var3.i0(724863787);
                String strO1 = cwl1.o0(x340Var3, 2131957825);
                String strO2 = cwl1.o0(x340Var3, 2131957826);
                qim0 qim0VarA2 = h2cVar.a(anm1.N("#LyricsFullscreenHeaderContextMenuButtonTag", nim0Var), een.i);
                boolean zG2 = x340Var3.g(strO1);
                Object objT3 = x340Var3.T();
                if (zG2 || objT3 == m4cVar) {
                    objT3 = new z9b0(strO1, (byte) 16);
                    x340Var3.s0(objT3);
                }
                qim0 qim0VarB2 = s161.b(qim0VarA2, false, (iu30) objT3);
                boolean z5 = i4 == 16384;
                Object objT4 = x340Var3.T();
                if (z5 || objT4 == m4cVar) {
                    objT4 = new uef0(iu30Var, (byte) 3);
                    x340Var3.s0(objT4);
                }
                r6 = 0;
                wro1.h(new gbx(new y50(strO2), (Function0) objT4), ldxVar, qim0VarB2, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, byi.b, x340Var3, 48, 6, 1016);
                x340Var3 = x340Var3;
                x340Var3.r(false);
            } else {
                r6 = 0;
                x340Var3.i0(725695052);
                x340Var3.r(false);
            }
            if (str4 == null) {
                x340Var3.i0(725735506);
                x340Var3.r((boolean) r6);
            } else {
                x340Var3.i0(725735507);
                boolean zG3 = x340Var3.g(str4);
                Object objT5 = x340Var3.T();
                if (zG3 || objT5 == m4cVar) {
                    objT5 = new z9b0(str4, (byte) 17);
                    x340Var3.s0(objT5);
                }
                t1c.a(s161.b(nim0Var, (boolean) r6, (iu30) objT5), x340Var3, (int) r6);
                x340Var3.r((boolean) r6);
            }
            String strN0 = cwl1.n0(2131957837, new Object[]{str, str2}, x340Var3);
            qim0 qim0VarZ2 = uyn1.z(48.0f, 0.0f, 2, u291.f(nim0Var, 1.0f));
            gra graVar3 = een.h;
            qim0 qim0VarA3 = h2cVar.a(qim0VarZ2, graVar3);
            gfh0 gfh0VarC2 = t1c.c(graVar, (boolean) r6);
            int iHashCode3 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM3 = x340Var3.m();
            qim0 qim0VarE3 = zr7.E(x340Var3, qim0VarA3);
            x340Var3.m0();
            if (x340Var3.S) {
                function0 = function1;
                x340Var3.l(function0);
            } else {
                function0 = function1;
                x340Var3.v0();
            }
            nko1.H(gfh0VarC2, x340Var3, lljVar);
            nko1.H(xos0VarM3, x340Var3, lljVar2);
            x0d.q(iHashCode3, x340Var3, lljVar3, x340Var3);
            nko1.H(qim0VarE3, x340Var3, lljVar4);
            era eraVar = een.Q0;
            qim0 qim0VarA4 = h2cVar.a(anm1.N("#LyricsFullscreenHeaderTag", nim0Var), graVar3);
            boolean zG4 = x340Var3.g(strN0);
            Object objT6 = x340Var3.T();
            if (zG4 || objT6 == m4cVar) {
                objT6 = new z9b0(strN0, (byte) 18);
                x340Var3.s0(objT6);
            }
            qim0 qim0VarB3 = s161.b(qim0VarA4, true, (iu30) objT6);
            mbh mbhVarA2 = jbh.a(h36.e, eraVar, x340Var3, 54);
            int iHashCode4 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM4 = x340Var3.m();
            qim0 qim0VarE4 = zr7.E(x340Var3, qim0VarB3);
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(function0);
            } else {
                x340Var3.v0();
            }
            nko1.H(mbhVarA2, x340Var3, lljVar);
            nko1.H(xos0VarM4, x340Var3, lljVar2);
            x0d.q(iHashCode4, x340Var3, lljVar3, x340Var3);
            nko1.H(qim0VarE4, x340Var3, lljVar4);
            Object objT7 = x340Var3.T();
            if (objT7 == m4cVar) {
                objT7 = z1f0.V0;
                x340Var3.s0(objT7);
            }
            x340 x340Var4 = x340Var3;
            uwo1.e(str, s161.b(nim0Var, false, (iu30) objT7), cbx.d(x340Var3).k, 0L, new a0e1(3), (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var4, (i3 & 14) | 1572864, 0, 1704);
            Object objT8 = x340Var4.T();
            if (objT8 == m4cVar) {
                objT8 = z1f0.W0;
                x340Var4.s0(objT8);
            }
            uwo1.e(str2, s161.b(nim0Var, false, (iu30) objT8), cbx.d(x340Var4).j, 0L, new a0e1(3), (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var4, ((i3 >> 3) & 14) | 1572864, 0, 1704);
            x340Var = x340Var4;
            us71.m(x340Var, true, true, true);
            if (z) {
                x340Var.i0(-1233296165);
                uwo1.e(cwl1.o0(x340Var, 2131957851), dug.f(u291.f(nim0Var, 1.0f), ((vex) zex.a.e).b, d4o1.a), cbx.d(x340Var).j, 0L, new a0e1(3), (iu30) null, 2, false, (djc0) null, 0, (qx8) null, x340Var, 1572864, 0, 1960);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(-1232991342);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rf6(str, str2, z, z2, iu30Var, qim0Var, str3, str4, i);
        }
    }

    public static final void l(nkf0 nkf0Var, String str, String str2, boolean z, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        int i3;
        String strK;
        String strU;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1755626141);
        int i9 = i | (x340Var.g(nkf0Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192);
        if (x340Var.Y(i9 & 1, (74899 & i9) != 74898)) {
            boolean z2 = nkf0Var instanceof kkf0;
            if (z2) {
                x340Var.i0(765435501);
                x340Var.r(false);
                strK = str;
            } else {
                if (nkf0Var instanceof mkf0) {
                    i2 = 765437099;
                    i3 = 2131961606;
                } else {
                    if (!(nkf0Var instanceof lkf0)) {
                        throw p3d1.k(x340Var, 765433760, false);
                    }
                    i2 = 765439644;
                    i3 = 2131957890;
                }
                strK = x0d.k(x340Var, i2, i3, x340Var, false);
            }
            if (z2) {
                strU = str2;
            } else if (nkf0Var instanceof mkf0) {
                mkf0 mkf0Var = (mkf0) nkf0Var;
                int i10 = mkf0Var.a;
                boolean z3 = mkf0Var.c;
                if (z3 && i10 == 0) {
                    i5 = -2040875443;
                    i6 = 2131961607;
                    strU = x0d.k(x340Var, i5, i6, x340Var, false);
                } else if (!mkf0Var.b || z3) {
                    x340Var.i0(-2040632558);
                    strU = cwl1.U(2131820888, i10, new Object[]{Integer.valueOf(i10)}, x340Var);
                    x340Var.r(false);
                } else {
                    i4 = -2040721745;
                    strU = x0d.k(x340Var, i4, 2131961605, x340Var, false);
                }
            } else {
                if (!(nkf0Var instanceof lkf0)) {
                    eg.o();
                    return;
                }
                lkf0 lkf0Var = (lkf0) nkf0Var;
                int i11 = lkf0Var.a;
                if (i11 == 0) {
                    i5 = -2040342553;
                    i6 = 2131957889;
                    strU = x0d.k(x340Var, i5, i6, x340Var, false);
                } else if (lkf0Var.b) {
                    i4 = -2040218801;
                    strU = x0d.k(x340Var, i4, 2131961605, x340Var, false);
                } else {
                    x340Var.i0(-2040129614);
                    strU = cwl1.U(2131820888, i11, new Object[]{Integer.valueOf(i11)}, x340Var);
                    x340Var.r(false);
                }
            }
            String strK2 = null;
            kkf0 kkf0Var = z2 ? (kkf0) nkf0Var : null;
            boolean z4 = kkf0Var != null && kkf0Var.a;
            lkf0 lkf0Var2 = nkf0Var instanceof lkf0 ? (lkf0) nkf0Var : null;
            if (lkf0Var2 != null) {
                i7 = -2039514977;
                i8 = 2131957886;
            } else {
                i7 = -2039414072;
                i8 = 2131957824;
            }
            String strK3 = x0d.k(x340Var, i7, i8, x340Var, false);
            if (lkf0Var2 == null || !lkf0Var2.b) {
                x340Var.i0(-2039166103);
                x340Var.r(false);
            } else {
                strK2 = x0d.k(x340Var, -2039245773, 2131961605, x340Var, false);
            }
            k(strK, strU, z, z4, iu30Var, qim0Var, strK3, strK2, x340Var, (i9 & 57344) | ((i9 >> 3) & 896) | 196608);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1(nkf0Var, str, str2, z, iu30Var, qim0Var, i);
        }
    }

    public static final void m(hqm0 hqm0Var, iu30 iu30Var, j2i j2iVar, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(990645984);
        int i2 = (i & 6) == 0 ? (x340Var.g(hqm0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            int i3 = i2 & 112;
            boolean zI = (i3 == 32) | ((i2 & 14) == 4) | x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new dt90(iu30Var, hqm0Var, ven0Var, (byte) 25);
                x340Var.s0(objT2);
            }
            j2iVar.invoke(objT2, x340Var, Integer.valueOf((i2 >> 3) & 112));
            boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
            String strO0 = cwl1.o0(x340Var, 2131958978);
            ArrayList<cqm0> arrayList = hqm0Var.b;
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            for (cqm0 cqm0Var : arrayList) {
                arrayList2.add(new au6(cqm0Var.a, cqm0Var.b, cqm0Var.c));
            }
            boolean zI2 = x340Var.i(ven0Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new q2j0(ven0Var, (byte) 4);
                x340Var.s0(objT3);
            }
            Function0 function0 = (Function0) objT3;
            boolean zI3 = x340Var.i(ven0Var) | (i3 == 32);
            Object objT4 = x340Var.T();
            if (zI3 || objT4 == m4cVar) {
                objT4 = new t0f(iu30Var, ven0Var, (byte) 2);
                x340Var.s0(objT4);
            }
            mmo1.g(zBooleanValue, strO0, arrayList2, function0, (vu30) objT4, (qim0) null, x340Var, 0, 32);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(hqm0Var, iu30Var, j2iVar, i, (byte) 1);
        }
    }

    public static final void n(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(612469043);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarR = d7e.r(1.0f, qim0Var, false);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarQ = i1p1.q(qim0VarR, er31.b(6.0f));
            qim0 qim0Var2 = nim0.a;
            if (z) {
                x340Var.i0(172240788);
                boolean z3 = (i2 & 896) == 256;
                Object objT = x340Var.T();
                if (z3 || objT == fkj0.X) {
                    objT = new ugj(function0, (byte) 18);
                    x340Var.s0(objT);
                }
                qim0 qim0VarX = bin.x(qim0Var2, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15);
                x340Var.r(false);
                qim0Var2 = qim0VarX;
            } else {
                x340Var.i0(172242011);
                x340Var.r(false);
            }
            qim0 qim0VarThen = qim0VarQ.then(qim0Var2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarThen);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            Uri uri = Uri.parse(str);
            h2c h2cVar = h2c.a;
            qim0 qim0VarB = h2cVar.b(qim0Var2);
            isl islVar = isl.a;
            eso1.e(uri, islVar, qim0VarB, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 224304, 0, 4032);
            x340Var = x340Var;
            if (z) {
                x340Var.i0(62517423);
                qim0 qim0VarA = h2cVar.a(qim0Var2, een.Y);
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarF = dug.f(u291.r(i1p1.q(uyn1.x(qim0VarA, 8.0f), er31.a), 32.0f), u7h.b(u7h.b, 0.5f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
                gfh0 gfh0VarC2 = t1c.c(een.h, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                w0h1.a(xmx.c, islVar, u291.r(qim0Var2, 16.0f), u7h.f, 0L, false, x340Var, xmx.d | 48, 48);
                z2 = true;
                x340Var.r(true);
                x340Var.r(false);
            } else {
                z2 = true;
                x340Var.i0(63015221);
                x340Var.r(false);
            }
            x340Var.r(z2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pfg(str, z, function0, qim0Var, i, (byte) 1);
        }
    }

    public static final void o(Uri uri, String str, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(293208998);
        int i2 = i | (x340Var.g(uri) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            tob1 tob1VarB = z95.b(z ? 0.3f : 1.0f, irn1.o0(200, 0, (dlv) null, 6), "privateAvatarAlpha", (iu30) null, x340Var, 3072, 20);
            Uri uri2 = (!z || Build.VERSION.SDK_INT >= 31) ? uri : null;
            if (uri2 == null) {
                uri2 = Uri.EMPTY;
            }
            uri2.getClass();
            String str2 = (!z || Build.VERSION.SDK_INT >= 31) ? str : null;
            if (str2 == null) {
                str2 = "";
            }
            bmq0.a(uri2, d9y0.k(x9p1.e(qim0Var, z), ((Number) tob1VarB.getValue()).floatValue()), (hcx) null, (String) null, str2, 0L, 0L, false, x340Var, 0, 236);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90(uri, str, z, qim0Var, i, (byte) 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0066  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:59:0x0102  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    public static final void p(Uri uri, boolean z, nux nuxVar, qim0 qim0Var, j6m j6mVar, b0k b0kVar, int i, int i2) {
        j6m j6mVar2;
        int i3;
        boolean z2;
        j6m j6mVar3;
        h311 h311VarV;
        float f;
        Uri uri2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1843348552);
        int i4 = i | (x340Var.g(uri) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= x340Var.h(z) ? 32 : 16;
        }
        int i5 = i4 | (x340Var.i(nuxVar) ? 256 : 128) | (x340Var.i(qim0Var) ? 16384 : 8192);
        if ((i2 & 32) == 0) {
            j6mVar2 = j6mVar;
            int i6 = x340Var.i(j6mVar2) ? 131072 : 65536;
            i3 = i5 | i6 | 1572864;
            if ((599187 & i3) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i3 & 1, z2)) {
                x340Var.d0();
                if ((i & 1) == 0 && !x340Var.E()) {
                    x340Var.b0();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                } else if ((i2 & 32) != 0) {
                    j6mVar2 = mif1.Q0;
                    i3 &= -458753;
                }
                x340Var.s();
                if (z) {
                    f = 0.3f;
                } else {
                    f = 1.0f;
                }
                tob1 tob1VarB = z95.b(f, irn1.o0(200, 0, (dlv) null, 6), "privateImageAlpha", (iu30) null, x340Var, 3072, 20);
                if (z || Build.VERSION.SDK_INT >= 31) {
                    uri2 = uri;
                } else {
                    uri2 = Uri.EMPTY;
                }
                uri2.getClass();
                j6m j6mVar4 = j6mVar2;
                eso1.e(uri2, isl.a, d9y0.k(x9p1.e(qim0Var, z), ((Number) tob1VarB.getValue()).floatValue()), (p3v) null, (zvx) null, (ecx) null, j6mVar4, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var, ((i3 << 3) & 3670016) | 24624 | ((i3 << 21) & 1879048192), 0, 3496);
                x340Var = x340Var;
                j6mVar3 = j6mVar4;
            } else {
                x340Var.b0();
                j6mVar3 = j6mVar2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new aat(uri, z, nuxVar, qim0Var, j6mVar3, i, i2);
            }
        }
        j6mVar2 = j6mVar;
        i3 = i5 | i6 | 1572864;
        if ((599187 & i3) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i3 & 1, z2)) {
            x340Var.d0();
            if ((i & 1) == 0) {
                if ((i2 & 32) != 0) {
                    j6mVar2 = mif1.Q0;
                    i3 &= -458753;
                }
            } else if ((i2 & 32) != 0) {
                j6mVar2 = mif1.Q0;
                i3 &= -458753;
            }
            x340Var.s();
            if (z) {
                f = 0.3f;
            } else {
                f = 1.0f;
            }
            tob1 tob1VarB2 = z95.b(f, irn1.o0(200, 0, (dlv) null, 6), "privateImageAlpha", (iu30) null, x340Var, 3072, 20);
            if (z) {
                uri2 = uri;
            } else {
                uri2 = uri;
            }
            uri2.getClass();
            j6m j6mVar5 = j6mVar2;
            eso1.e(uri2, isl.a, d9y0.k(x9p1.e(qim0Var, z), ((Number) tob1VarB2.getValue()).floatValue()), (p3v) null, (zvx) null, (ecx) null, j6mVar5, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var, ((i3 << 3) & 3670016) | 24624 | ((i3 << 21) & 1879048192), 0, 3496);
            x340Var = x340Var;
            j6mVar3 = j6mVar5;
        } else {
            x340Var.b0();
            j6mVar3 = j6mVar2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new aat(uri, z, nuxVar, qim0Var, j6mVar3, i, i2);
        }
    }

    public static final void q(ch7 ch7Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(849696412);
        int i2 = i | (x340Var.i(ch7Var) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.i0(514469661);
            ye5 ye5Var = new ye5();
            x340Var.i0(514470485);
            uwr uwrVar = cbx.a;
            zsc zscVar = zex.a;
            vex vexVar = (vex) zscVar.e;
            vex vexVar2 = (vex) zscVar.e;
            int iO = ye5Var.o(new zma1(vexVar.m, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            try {
                ye5Var.g(cwl1.o0(x340Var, 2131963494));
                ye5Var.k(iO);
                x340Var.r(false);
                int iO2 = ye5Var.o(new zma1(cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                try {
                    ye5Var.g(" " + ch7Var.a);
                    ye5Var.k(iO2);
                    af5 af5VarP = ye5Var.p();
                    x340Var.r(false);
                    uwo1.d(af5VarP, vexVar2.m, (qim0) null, cbx.d(x340Var).g, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 4084);
                    x340Var = x340Var;
                    String str = ch7Var.b;
                    if (str == null) {
                        x340Var.i0(-1230842553);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-1230842552);
                        x340Var.i0(514486628);
                        ye5 ye5Var2 = new ye5();
                        x340Var.i0(514487542);
                        int iO3 = ye5Var2.o(new zma1(vexVar2.m, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                        try {
                            ye5Var2.g(cwl1.o0(x340Var, 2131961065));
                            ye5Var2.k(iO3);
                            x340Var.r(false);
                            int iO4 = ye5Var2.o(new zma1(cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                            try {
                                ye5Var2.g(" ".concat(str));
                                ye5Var2.k(iO4);
                                af5 af5VarP2 = ye5Var2.p();
                                x340Var.r(false);
                                uwo1.f(af5VarP2, (qim0) null, cbx.d(x340Var).g, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 4090);
                                x340Var.r(false);
                            } catch (Throwable th) {
                                ye5Var2.k(iO4);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            ye5Var2.k(iO3);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    ye5Var.k(iO2);
                    throw th3;
                }
            } catch (Throwable th4) {
                ye5Var.k(iO);
                throw th4;
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fak1(ch7Var, i, (byte) 14);
        }
    }

    public static final void r(j2i j2iVar, String str, String str2, Function0 function0, qim0 qim0Var, u7h u7hVar, boolean z, b0k b0kVar, int i, int i2) {
        u7h u7hVar2;
        int i3;
        boolean z2;
        int i4;
        b0k b0kVar2;
        qim0 qim0Var2;
        boolean z3;
        u7h u7hVar3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1418202877);
        int i5 = i | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.g(str2) ? 256 : 128) | (b0kVar3.i(function0) ? 16384 : 8192);
        int i6 = 196608 | i5;
        int i7 = i2 & 64;
        if (i7 != 0) {
            i3 = i5 | 1769472;
            u7hVar2 = u7hVar;
        } else {
            u7hVar2 = u7hVar;
            i3 = i6 | (b0kVar3.g(u7hVar2) ? 1048576 : 524288);
        }
        int i8 = i2 & 128;
        if (i8 != 0) {
            i4 = i3 | 12582912;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (b0kVar3.h(z2) ? 8388608 : 4194304);
        }
        if (b0kVar3.Y(i4 & 1, (4793491 & i4) != 4793490)) {
            if (i7 != 0) {
                u7hVar2 = null;
            }
            u7h u7hVar4 = u7hVar2;
            boolean z4 = i8 != 0 ? true : z2;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            s(j2iVar, str, new af5(str2), function0, qim0Var3, u7hVar4, z4, b0kVar2, i4 & 33553534, 0);
            qim0Var2 = qim0Var3;
            u7hVar3 = u7hVar4;
            z3 = z4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
            z3 = z2;
            u7hVar3 = u7hVar2;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hzk(j2iVar, str, str2, function0, qim0Var2, u7hVar3, z3, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018d  */
    /* JADX WARN: Code duplicated, block: B:101:0x0191  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:108:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:110:0x0210  */
    /* JADX WARN: Code duplicated, block: B:113:0x0260  */
    /* JADX WARN: Code duplicated, block: B:115:0x0288  */
    /* JADX WARN: Code duplicated, block: B:117:0x029c  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:122:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00de  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:94:0x0129  */
    /* JADX WARN: Code duplicated, block: B:95:0x0140  */
    /* JADX WARN: Code duplicated, block: B:98:0x0184  */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [boolean, int] */
    public static final void s(j2i j2iVar, String str, af5 af5Var, Function0 function0, qim0 qim0Var, u7h u7hVar, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        Function0 function1;
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        boolean z3;
        qim0 qim0Var2;
        u7h u7hVar2;
        boolean z4;
        h311 h311VarV;
        qim0 qim0Var3;
        qim0 qim0Var4;
        u7h u7hVar3;
        boolean z5;
        Object objT;
        idn0 idn0Var;
        ?? r5;
        qim0 qim0VarK;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z6;
        n4k n4kVar;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-471743009);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i3 = (x340Var.i(j2iVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(af5Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.h(true) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function1 = function0;
            i3 |= x340Var.i(function1) ? 16384 : 8192;
        } else {
            function1 = function0;
        }
        int i8 = i2 & 32;
        if (i8 == 0) {
            if ((196608 & i) == 0) {
                i3 |= x340Var.i(qim0Var) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    if (x340Var.g(u7hVar)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    if ((12582912 & i) == 0) {
                        z2 = z;
                        if (x340Var.h(z2)) {
                            i7 = 8388608;
                        } else {
                            i7 = 4194304;
                        }
                        i3 |= i7;
                    }
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var.Y(i3 & 1, z3)) {
                        qim0Var3 = nim0.a;
                        if (i8 != 0) {
                            qim0Var4 = qim0Var3;
                        } else {
                            qim0Var4 = qim0Var;
                        }
                        if (i4 != 0) {
                            u7hVar3 = null;
                        } else {
                            u7hVar3 = u7hVar;
                        }
                        if (i6 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = ktd.n(x340Var);
                        }
                        idn0Var = (idn0) objT;
                        qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
                        uwr uwrVar = cbx.a;
                        cua cuaVar = cbx.b(x340Var).f;
                        qim0 qim0VarF2 = dug.f(i1p1.q(qim0VarF, er31.b(8.0f)), cbx.a(x340Var).a.b.a(), d4o1.a);
                        if (z5) {
                            Function0 function2 = function1;
                            r5 = 0;
                            qim0VarK = bin.v(qim0Var3, idn0Var, (ga80) null, false, (String) null, (pm31) null, function2, 28);
                        } else {
                            r5 = 0;
                            qim0VarK = d9y0.k(qim0Var3, 0.35f);
                        }
                        qim0 qim0VarThen = qim0VarF2.then(qim0VarK);
                        cvx cvxVar = cbx.b(x340Var).b;
                        qim0 qim0VarX = uyn1.x(qim0VarThen, 12.0f);
                        fra fraVar = een.N0;
                        cvx cvxVar2 = cbx.b(x340Var).b;
                        jw31VarA = ew31.a(new d36(12.0f, true, new um5((boolean) r5)), fraVar, x340Var, (int) r5);
                        iHashCode = Long.hashCode(x340Var.T);
                        xos0VarM = x340Var.m();
                        qim0VarE = zr7.E(x340Var, qim0VarX);
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
                        nko1.H(qim0VarE, x340Var, lljVar4);
                        j2iVar.invoke(x340Var, Integer.valueOf(i3 & 14));
                        wnb0 wnb0Var = new wnb0(1.0f, true);
                        qim0 qim0Var5 = qim0Var4;
                        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                        int i9 = i3;
                        int iHashCode2 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM2 = x340Var.m();
                        qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
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
                        lee1 lee1Var = cbx.d(x340Var).j;
                        if (u7hVar3 == null) {
                            x340Var.i0(591890124);
                            j = cbx.a(x340Var).b.b;
                            x340Var.r(false);
                        } else {
                            x340Var.i0(591889039);
                            x340Var.r(false);
                            j = u7hVar3.a;
                        }
                        uwo1.e(str, (qim0) null, lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i9 >> 3) & 14, 0, 2034);
                        uwo1.d(af5Var, cbx.a(x340Var).b.a, (qim0) null, cbx.d(x340Var).h, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, (i9 >> 6) & 14, 0, 4084);
                        x340Var = x340Var;
                        x340Var.r(true);
                        if (z5) {
                            x340Var.i0(1239774388);
                            w0h1.a(mlx.c, isl.a, (qim0) null, cbx.a(x340Var).b.b, 0L, false, x340Var, mlx.d | 48, 52);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(1239946407);
                            x340Var.r(false);
                        }
                        x340Var.r(true);
                        u7hVar2 = u7hVar3;
                        z4 = z5;
                        qim0Var2 = qim0Var5;
                    } else {
                        x340Var.b0();
                        qim0Var2 = qim0Var;
                        u7hVar2 = u7hVar;
                        z4 = z2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new izk(j2iVar, str, af5Var, function0, qim0Var2, u7hVar2, z4, i, i2);
                    }
                }
                i3 |= 12582912;
                z2 = z;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i3 & 1, z3)) {
                    qim0Var3 = nim0.a;
                    if (i8 != 0) {
                        qim0Var4 = qim0Var3;
                    } else {
                        qim0Var4 = qim0Var;
                    }
                    if (i4 != 0) {
                        u7hVar3 = null;
                    } else {
                        u7hVar3 = u7hVar;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = ktd.n(x340Var);
                    }
                    idn0Var = (idn0) objT;
                    qim0 qim0VarF3 = u291.f(qim0Var4, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    cua cuaVar2 = cbx.b(x340Var).f;
                    qim0 qim0VarF4 = dug.f(i1p1.q(qim0VarF3, er31.b(8.0f)), cbx.a(x340Var).a.b.a(), d4o1.a);
                    if (z5) {
                        Function0 function3 = function1;
                        r5 = 0;
                        qim0VarK = bin.v(qim0Var3, idn0Var, (ga80) null, false, (String) null, (pm31) null, function3, 28);
                    } else {
                        r5 = 0;
                        qim0VarK = d9y0.k(qim0Var3, 0.35f);
                    }
                    qim0 qim0VarThen2 = qim0VarF4.then(qim0VarK);
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    qim0 qim0VarX2 = uyn1.x(qim0VarThen2, 12.0f);
                    fra fraVar2 = een.N0;
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    jw31VarA = ew31.a(new d36(12.0f, true, new um5((boolean) r5)), fraVar2, x340Var, (int) r5);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarX2);
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
                    nko1.H(qim0VarE, x340Var, lljVar8);
                    j2iVar.invoke(x340Var, Integer.valueOf(i3 & 14));
                    wnb0 wnb0Var2 = new wnb0(1.0f, true);
                    qim0 qim0Var6 = qim0Var4;
                    mbh mbhVarA2 = jbh.a(h36.c, een.P0, x340Var, 0);
                    int i10 = i3;
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, wnb0Var2);
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
                    lee1 lee1Var2 = cbx.d(x340Var).j;
                    if (u7hVar3 == null) {
                        x340Var.i0(591890124);
                        j = cbx.a(x340Var).b.b;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(591889039);
                        x340Var.r(false);
                        j = u7hVar3.a;
                    }
                    uwo1.e(str, (qim0) null, lee1Var2, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i10 >> 3) & 14, 0, 2034);
                    uwo1.d(af5Var, cbx.a(x340Var).b.a, (qim0) null, cbx.d(x340Var).h, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, (i10 >> 6) & 14, 0, 4084);
                    x340Var = x340Var;
                    x340Var.r(true);
                    if (z5) {
                        x340Var.i0(1239774388);
                        w0h1.a(mlx.c, isl.a, (qim0) null, cbx.a(x340Var).b.b, 0L, false, x340Var, mlx.d | 48, 52);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1239946407);
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                    u7hVar2 = u7hVar3;
                    z4 = z5;
                    qim0Var2 = qim0Var6;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    u7hVar2 = u7hVar;
                    z4 = z2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new izk(j2iVar, str, af5Var, function0, qim0Var2, u7hVar2, z4, i, i2);
                }
            }
            i3 |= 1572864;
            i6 = i2 & 128;
            if (i6 != 0) {
                if ((12582912 & i) == 0) {
                    z2 = z;
                    if (x340Var.h(z2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i3 |= i7;
                }
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i3 & 1, z3)) {
                    qim0Var3 = nim0.a;
                    if (i8 != 0) {
                        qim0Var4 = qim0Var3;
                    } else {
                        qim0Var4 = qim0Var;
                    }
                    if (i4 != 0) {
                        u7hVar3 = null;
                    } else {
                        u7hVar3 = u7hVar;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = ktd.n(x340Var);
                    }
                    idn0Var = (idn0) objT;
                    qim0 qim0VarF5 = u291.f(qim0Var4, 1.0f);
                    uwr uwrVar3 = cbx.a;
                    cua cuaVar3 = cbx.b(x340Var).f;
                    qim0 qim0VarF6 = dug.f(i1p1.q(qim0VarF5, er31.b(8.0f)), cbx.a(x340Var).a.b.a(), d4o1.a);
                    if (z5) {
                        Function0 function4 = function1;
                        r5 = 0;
                        qim0VarK = bin.v(qim0Var3, idn0Var, (ga80) null, false, (String) null, (pm31) null, function4, 28);
                    } else {
                        r5 = 0;
                        qim0VarK = d9y0.k(qim0Var3, 0.35f);
                    }
                    qim0 qim0VarThen3 = qim0VarF6.then(qim0VarK);
                    cvx cvxVar5 = cbx.b(x340Var).b;
                    qim0 qim0VarX3 = uyn1.x(qim0VarThen3, 12.0f);
                    fra fraVar3 = een.N0;
                    cvx cvxVar6 = cbx.b(x340Var).b;
                    jw31VarA = ew31.a(new d36(12.0f, true, new um5((boolean) r5)), fraVar3, x340Var, (int) r5);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarX3);
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
                    llj lljVar9 = y580.O0;
                    nko1.H(jw31VarA, x340Var, lljVar9);
                    llj lljVar10 = y580.N0;
                    nko1.H(xos0VarM, x340Var, lljVar10);
                    Integer numValueOf3 = Integer.valueOf(iHashCode);
                    llj lljVar11 = y580.R0;
                    nko1.H(numValueOf3, x340Var, lljVar11);
                    nko1.F(x340Var);
                    llj lljVar12 = y580.Y;
                    nko1.H(qim0VarE, x340Var, lljVar12);
                    j2iVar.invoke(x340Var, Integer.valueOf(i3 & 14));
                    wnb0 wnb0Var3 = new wnb0(1.0f, true);
                    qim0 qim0Var7 = qim0Var4;
                    mbh mbhVarA3 = jbh.a(h36.c, een.P0, x340Var, 0);
                    int i11 = i3;
                    int iHashCode4 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM4 = x340Var.m();
                    qim0 qim0VarE4 = zr7.E(x340Var, wnb0Var3);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA3, x340Var, lljVar9);
                    nko1.H(xos0VarM4, x340Var, lljVar10);
                    x0d.q(iHashCode4, x340Var, lljVar11, x340Var);
                    nko1.H(qim0VarE4, x340Var, lljVar12);
                    lee1 lee1Var3 = cbx.d(x340Var).j;
                    if (u7hVar3 == null) {
                        x340Var.i0(591890124);
                        j = cbx.a(x340Var).b.b;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(591889039);
                        x340Var.r(false);
                        j = u7hVar3.a;
                    }
                    uwo1.e(str, (qim0) null, lee1Var3, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i11 >> 3) & 14, 0, 2034);
                    uwo1.d(af5Var, cbx.a(x340Var).b.a, (qim0) null, cbx.d(x340Var).h, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, (i11 >> 6) & 14, 0, 4084);
                    x340Var = x340Var;
                    x340Var.r(true);
                    if (z5) {
                        x340Var.i0(1239774388);
                        w0h1.a(mlx.c, isl.a, (qim0) null, cbx.a(x340Var).b.b, 0L, false, x340Var, mlx.d | 48, 52);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1239946407);
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                    u7hVar2 = u7hVar3;
                    z4 = z5;
                    qim0Var2 = qim0Var7;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    u7hVar2 = u7hVar;
                    z4 = z2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new izk(j2iVar, str, af5Var, function0, qim0Var2, u7hVar2, z4, i, i2);
                }
            }
            i3 |= 12582912;
            z2 = z;
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                qim0Var3 = nim0.a;
                if (i8 != 0) {
                    qim0Var4 = qim0Var3;
                } else {
                    qim0Var4 = qim0Var;
                }
                if (i4 != 0) {
                    u7hVar3 = null;
                } else {
                    u7hVar3 = u7hVar;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = ktd.n(x340Var);
                }
                idn0Var = (idn0) objT;
                qim0 qim0VarF7 = u291.f(qim0Var4, 1.0f);
                uwr uwrVar4 = cbx.a;
                cua cuaVar4 = cbx.b(x340Var).f;
                qim0 qim0VarF8 = dug.f(i1p1.q(qim0VarF7, er31.b(8.0f)), cbx.a(x340Var).a.b.a(), d4o1.a);
                if (z5) {
                    Function0 function5 = function1;
                    r5 = 0;
                    qim0VarK = bin.v(qim0Var3, idn0Var, (ga80) null, false, (String) null, (pm31) null, function5, 28);
                } else {
                    r5 = 0;
                    qim0VarK = d9y0.k(qim0Var3, 0.35f);
                }
                qim0 qim0VarThen4 = qim0VarF8.then(qim0VarK);
                cvx cvxVar7 = cbx.b(x340Var).b;
                qim0 qim0VarX4 = uyn1.x(qim0VarThen4, 12.0f);
                fra fraVar4 = een.N0;
                cvx cvxVar8 = cbx.b(x340Var).b;
                jw31VarA = ew31.a(new d36(12.0f, true, new um5((boolean) r5)), fraVar4, x340Var, (int) r5);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarX4);
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
                llj lljVar13 = y580.O0;
                nko1.H(jw31VarA, x340Var, lljVar13);
                llj lljVar14 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar14);
                Integer numValueOf4 = Integer.valueOf(iHashCode);
                llj lljVar15 = y580.R0;
                nko1.H(numValueOf4, x340Var, lljVar15);
                nko1.F(x340Var);
                llj lljVar16 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar16);
                j2iVar.invoke(x340Var, Integer.valueOf(i3 & 14));
                wnb0 wnb0Var4 = new wnb0(1.0f, true);
                qim0 qim0Var8 = qim0Var4;
                mbh mbhVarA4 = jbh.a(h36.c, een.P0, x340Var, 0);
                int i12 = i3;
                int iHashCode5 = Long.hashCode(x340Var.T);
                xos0 xos0VarM5 = x340Var.m();
                qim0 qim0VarE5 = zr7.E(x340Var, wnb0Var4);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA4, x340Var, lljVar13);
                nko1.H(xos0VarM5, x340Var, lljVar14);
                x0d.q(iHashCode5, x340Var, lljVar15, x340Var);
                nko1.H(qim0VarE5, x340Var, lljVar16);
                lee1 lee1Var4 = cbx.d(x340Var).j;
                if (u7hVar3 == null) {
                    x340Var.i0(591890124);
                    j = cbx.a(x340Var).b.b;
                    x340Var.r(false);
                } else {
                    x340Var.i0(591889039);
                    x340Var.r(false);
                    j = u7hVar3.a;
                }
                uwo1.e(str, (qim0) null, lee1Var4, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i12 >> 3) & 14, 0, 2034);
                uwo1.d(af5Var, cbx.a(x340Var).b.a, (qim0) null, cbx.d(x340Var).h, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, (i12 >> 6) & 14, 0, 4084);
                x340Var = x340Var;
                x340Var.r(true);
                if (z5) {
                    x340Var.i0(1239774388);
                    w0h1.a(mlx.c, isl.a, (qim0) null, cbx.a(x340Var).b.b, 0L, false, x340Var, mlx.d | 48, 52);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1239946407);
                    x340Var.r(false);
                }
                x340Var.r(true);
                u7hVar2 = u7hVar3;
                z4 = z5;
                qim0Var2 = qim0Var8;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                u7hVar2 = u7hVar;
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new izk(j2iVar, str, af5Var, function0, qim0Var2, u7hVar2, z4, i, i2);
            }
        }
        i3 |= 196608;
        i4 = i2 & 64;
        if (i4 != 0) {
            if ((1572864 & i) == 0) {
                if (x340Var.g(u7hVar)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            i6 = i2 & 128;
            if (i6 != 0) {
                if ((12582912 & i) == 0) {
                    z2 = z;
                    if (x340Var.h(z2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i3 |= i7;
                }
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i3 & 1, z3)) {
                    qim0Var3 = nim0.a;
                    if (i8 != 0) {
                        qim0Var4 = qim0Var3;
                    } else {
                        qim0Var4 = qim0Var;
                    }
                    if (i4 != 0) {
                        u7hVar3 = null;
                    } else {
                        u7hVar3 = u7hVar;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = ktd.n(x340Var);
                    }
                    idn0Var = (idn0) objT;
                    qim0 qim0VarF9 = u291.f(qim0Var4, 1.0f);
                    uwr uwrVar5 = cbx.a;
                    cua cuaVar5 = cbx.b(x340Var).f;
                    qim0 qim0VarF10 = dug.f(i1p1.q(qim0VarF9, er31.b(8.0f)), cbx.a(x340Var).a.b.a(), d4o1.a);
                    if (z5) {
                        Function0 function6 = function1;
                        r5 = 0;
                        qim0VarK = bin.v(qim0Var3, idn0Var, (ga80) null, false, (String) null, (pm31) null, function6, 28);
                    } else {
                        r5 = 0;
                        qim0VarK = d9y0.k(qim0Var3, 0.35f);
                    }
                    qim0 qim0VarThen5 = qim0VarF10.then(qim0VarK);
                    cvx cvxVar9 = cbx.b(x340Var).b;
                    qim0 qim0VarX5 = uyn1.x(qim0VarThen5, 12.0f);
                    fra fraVar5 = een.N0;
                    cvx cvxVar10 = cbx.b(x340Var).b;
                    jw31VarA = ew31.a(new d36(12.0f, true, new um5((boolean) r5)), fraVar5, x340Var, (int) r5);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarX5);
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
                    llj lljVar17 = y580.O0;
                    nko1.H(jw31VarA, x340Var, lljVar17);
                    llj lljVar18 = y580.N0;
                    nko1.H(xos0VarM, x340Var, lljVar18);
                    Integer numValueOf5 = Integer.valueOf(iHashCode);
                    llj lljVar19 = y580.R0;
                    nko1.H(numValueOf5, x340Var, lljVar19);
                    nko1.F(x340Var);
                    llj lljVar110 = y580.Y;
                    nko1.H(qim0VarE, x340Var, lljVar110);
                    j2iVar.invoke(x340Var, Integer.valueOf(i3 & 14));
                    wnb0 wnb0Var5 = new wnb0(1.0f, true);
                    qim0 qim0Var9 = qim0Var4;
                    mbh mbhVarA5 = jbh.a(h36.c, een.P0, x340Var, 0);
                    int i13 = i3;
                    int iHashCode6 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM6 = x340Var.m();
                    qim0 qim0VarE6 = zr7.E(x340Var, wnb0Var5);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA5, x340Var, lljVar17);
                    nko1.H(xos0VarM6, x340Var, lljVar18);
                    x0d.q(iHashCode6, x340Var, lljVar19, x340Var);
                    nko1.H(qim0VarE6, x340Var, lljVar110);
                    lee1 lee1Var5 = cbx.d(x340Var).j;
                    if (u7hVar3 == null) {
                        x340Var.i0(591890124);
                        j = cbx.a(x340Var).b.b;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(591889039);
                        x340Var.r(false);
                        j = u7hVar3.a;
                    }
                    uwo1.e(str, (qim0) null, lee1Var5, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i13 >> 3) & 14, 0, 2034);
                    uwo1.d(af5Var, cbx.a(x340Var).b.a, (qim0) null, cbx.d(x340Var).h, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, (i13 >> 6) & 14, 0, 4084);
                    x340Var = x340Var;
                    x340Var.r(true);
                    if (z5) {
                        x340Var.i0(1239774388);
                        w0h1.a(mlx.c, isl.a, (qim0) null, cbx.a(x340Var).b.b, 0L, false, x340Var, mlx.d | 48, 52);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1239946407);
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                    u7hVar2 = u7hVar3;
                    z4 = z5;
                    qim0Var2 = qim0Var9;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    u7hVar2 = u7hVar;
                    z4 = z2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new izk(j2iVar, str, af5Var, function0, qim0Var2, u7hVar2, z4, i, i2);
                }
            }
            i3 |= 12582912;
            z2 = z;
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                qim0Var3 = nim0.a;
                if (i8 != 0) {
                    qim0Var4 = qim0Var3;
                } else {
                    qim0Var4 = qim0Var;
                }
                if (i4 != 0) {
                    u7hVar3 = null;
                } else {
                    u7hVar3 = u7hVar;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = ktd.n(x340Var);
                }
                idn0Var = (idn0) objT;
                qim0 qim0VarF11 = u291.f(qim0Var4, 1.0f);
                uwr uwrVar6 = cbx.a;
                cua cuaVar6 = cbx.b(x340Var).f;
                qim0 qim0VarF12 = dug.f(i1p1.q(qim0VarF11, er31.b(8.0f)), cbx.a(x340Var).a.b.a(), d4o1.a);
                if (z5) {
                    Function0 function7 = function1;
                    r5 = 0;
                    qim0VarK = bin.v(qim0Var3, idn0Var, (ga80) null, false, (String) null, (pm31) null, function7, 28);
                } else {
                    r5 = 0;
                    qim0VarK = d9y0.k(qim0Var3, 0.35f);
                }
                qim0 qim0VarThen6 = qim0VarF12.then(qim0VarK);
                cvx cvxVar11 = cbx.b(x340Var).b;
                qim0 qim0VarX6 = uyn1.x(qim0VarThen6, 12.0f);
                fra fraVar6 = een.N0;
                cvx cvxVar12 = cbx.b(x340Var).b;
                jw31VarA = ew31.a(new d36(12.0f, true, new um5((boolean) r5)), fraVar6, x340Var, (int) r5);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarX6);
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
                llj lljVar111 = y580.O0;
                nko1.H(jw31VarA, x340Var, lljVar111);
                llj lljVar112 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar112);
                Integer numValueOf6 = Integer.valueOf(iHashCode);
                llj lljVar113 = y580.R0;
                nko1.H(numValueOf6, x340Var, lljVar113);
                nko1.F(x340Var);
                llj lljVar114 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar114);
                j2iVar.invoke(x340Var, Integer.valueOf(i3 & 14));
                wnb0 wnb0Var6 = new wnb0(1.0f, true);
                qim0 qim0Var10 = qim0Var4;
                mbh mbhVarA6 = jbh.a(h36.c, een.P0, x340Var, 0);
                int i14 = i3;
                int iHashCode7 = Long.hashCode(x340Var.T);
                xos0 xos0VarM7 = x340Var.m();
                qim0 qim0VarE7 = zr7.E(x340Var, wnb0Var6);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA6, x340Var, lljVar111);
                nko1.H(xos0VarM7, x340Var, lljVar112);
                x0d.q(iHashCode7, x340Var, lljVar113, x340Var);
                nko1.H(qim0VarE7, x340Var, lljVar114);
                lee1 lee1Var6 = cbx.d(x340Var).j;
                if (u7hVar3 == null) {
                    x340Var.i0(591890124);
                    j = cbx.a(x340Var).b.b;
                    x340Var.r(false);
                } else {
                    x340Var.i0(591889039);
                    x340Var.r(false);
                    j = u7hVar3.a;
                }
                uwo1.e(str, (qim0) null, lee1Var6, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i14 >> 3) & 14, 0, 2034);
                uwo1.d(af5Var, cbx.a(x340Var).b.a, (qim0) null, cbx.d(x340Var).h, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, (i14 >> 6) & 14, 0, 4084);
                x340Var = x340Var;
                x340Var.r(true);
                if (z5) {
                    x340Var.i0(1239774388);
                    w0h1.a(mlx.c, isl.a, (qim0) null, cbx.a(x340Var).b.b, 0L, false, x340Var, mlx.d | 48, 52);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1239946407);
                    x340Var.r(false);
                }
                x340Var.r(true);
                u7hVar2 = u7hVar3;
                z4 = z5;
                qim0Var2 = qim0Var10;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                u7hVar2 = u7hVar;
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new izk(j2iVar, str, af5Var, function0, qim0Var2, u7hVar2, z4, i, i2);
            }
        }
        i3 |= 1572864;
        i6 = i2 & 128;
        if (i6 != 0) {
            if ((12582912 & i) == 0) {
                z2 = z;
                if (x340Var.h(z2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i3 |= i7;
            }
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                qim0Var3 = nim0.a;
                if (i8 != 0) {
                    qim0Var4 = qim0Var3;
                } else {
                    qim0Var4 = qim0Var;
                }
                if (i4 != 0) {
                    u7hVar3 = null;
                } else {
                    u7hVar3 = u7hVar;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = ktd.n(x340Var);
                }
                idn0Var = (idn0) objT;
                qim0 qim0VarF13 = u291.f(qim0Var4, 1.0f);
                uwr uwrVar7 = cbx.a;
                cua cuaVar7 = cbx.b(x340Var).f;
                qim0 qim0VarF14 = dug.f(i1p1.q(qim0VarF13, er31.b(8.0f)), cbx.a(x340Var).a.b.a(), d4o1.a);
                if (z5) {
                    Function0 function8 = function1;
                    r5 = 0;
                    qim0VarK = bin.v(qim0Var3, idn0Var, (ga80) null, false, (String) null, (pm31) null, function8, 28);
                } else {
                    r5 = 0;
                    qim0VarK = d9y0.k(qim0Var3, 0.35f);
                }
                qim0 qim0VarThen7 = qim0VarF14.then(qim0VarK);
                cvx cvxVar13 = cbx.b(x340Var).b;
                qim0 qim0VarX7 = uyn1.x(qim0VarThen7, 12.0f);
                fra fraVar7 = een.N0;
                cvx cvxVar14 = cbx.b(x340Var).b;
                jw31VarA = ew31.a(new d36(12.0f, true, new um5((boolean) r5)), fraVar7, x340Var, (int) r5);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarX7);
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
                llj lljVar115 = y580.O0;
                nko1.H(jw31VarA, x340Var, lljVar115);
                llj lljVar116 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar116);
                Integer numValueOf7 = Integer.valueOf(iHashCode);
                llj lljVar117 = y580.R0;
                nko1.H(numValueOf7, x340Var, lljVar117);
                nko1.F(x340Var);
                llj lljVar118 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar118);
                j2iVar.invoke(x340Var, Integer.valueOf(i3 & 14));
                wnb0 wnb0Var7 = new wnb0(1.0f, true);
                qim0 qim0Var11 = qim0Var4;
                mbh mbhVarA7 = jbh.a(h36.c, een.P0, x340Var, 0);
                int i15 = i3;
                int iHashCode8 = Long.hashCode(x340Var.T);
                xos0 xos0VarM8 = x340Var.m();
                qim0 qim0VarE8 = zr7.E(x340Var, wnb0Var7);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA7, x340Var, lljVar115);
                nko1.H(xos0VarM8, x340Var, lljVar116);
                x0d.q(iHashCode8, x340Var, lljVar117, x340Var);
                nko1.H(qim0VarE8, x340Var, lljVar118);
                lee1 lee1Var7 = cbx.d(x340Var).j;
                if (u7hVar3 == null) {
                    x340Var.i0(591890124);
                    j = cbx.a(x340Var).b.b;
                    x340Var.r(false);
                } else {
                    x340Var.i0(591889039);
                    x340Var.r(false);
                    j = u7hVar3.a;
                }
                uwo1.e(str, (qim0) null, lee1Var7, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i15 >> 3) & 14, 0, 2034);
                uwo1.d(af5Var, cbx.a(x340Var).b.a, (qim0) null, cbx.d(x340Var).h, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, (i15 >> 6) & 14, 0, 4084);
                x340Var = x340Var;
                x340Var.r(true);
                if (z5) {
                    x340Var.i0(1239774388);
                    w0h1.a(mlx.c, isl.a, (qim0) null, cbx.a(x340Var).b.b, 0L, false, x340Var, mlx.d | 48, 52);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1239946407);
                    x340Var.r(false);
                }
                x340Var.r(true);
                u7hVar2 = u7hVar3;
                z4 = z5;
                qim0Var2 = qim0Var11;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                u7hVar2 = u7hVar;
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new izk(j2iVar, str, af5Var, function0, qim0Var2, u7hVar2, z4, i, i2);
            }
        }
        i3 |= 12582912;
        z2 = z;
        if ((i3 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i3 & 1, z3)) {
            qim0Var3 = nim0.a;
            if (i8 != 0) {
                qim0Var4 = qim0Var3;
            } else {
                qim0Var4 = qim0Var;
            }
            if (i4 != 0) {
                u7hVar3 = null;
            } else {
                u7hVar3 = u7hVar;
            }
            if (i6 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ktd.n(x340Var);
            }
            idn0Var = (idn0) objT;
            qim0 qim0VarF15 = u291.f(qim0Var4, 1.0f);
            uwr uwrVar8 = cbx.a;
            cua cuaVar8 = cbx.b(x340Var).f;
            qim0 qim0VarF16 = dug.f(i1p1.q(qim0VarF15, er31.b(8.0f)), cbx.a(x340Var).a.b.a(), d4o1.a);
            if (z5) {
                Function0 function9 = function1;
                r5 = 0;
                qim0VarK = bin.v(qim0Var3, idn0Var, (ga80) null, false, (String) null, (pm31) null, function9, 28);
            } else {
                r5 = 0;
                qim0VarK = d9y0.k(qim0Var3, 0.35f);
            }
            qim0 qim0VarThen8 = qim0VarF16.then(qim0VarK);
            cvx cvxVar15 = cbx.b(x340Var).b;
            qim0 qim0VarX8 = uyn1.x(qim0VarThen8, 12.0f);
            fra fraVar8 = een.N0;
            cvx cvxVar16 = cbx.b(x340Var).b;
            jw31VarA = ew31.a(new d36(12.0f, true, new um5((boolean) r5)), fraVar8, x340Var, (int) r5);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarX8);
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
            llj lljVar119 = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar119);
            llj lljVar1110 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar1110);
            Integer numValueOf8 = Integer.valueOf(iHashCode);
            llj lljVar1111 = y580.R0;
            nko1.H(numValueOf8, x340Var, lljVar1111);
            nko1.F(x340Var);
            llj lljVar1112 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar1112);
            j2iVar.invoke(x340Var, Integer.valueOf(i3 & 14));
            wnb0 wnb0Var8 = new wnb0(1.0f, true);
            qim0 qim0Var12 = qim0Var4;
            mbh mbhVarA8 = jbh.a(h36.c, een.P0, x340Var, 0);
            int i16 = i3;
            int iHashCode9 = Long.hashCode(x340Var.T);
            xos0 xos0VarM9 = x340Var.m();
            qim0 qim0VarE9 = zr7.E(x340Var, wnb0Var8);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA8, x340Var, lljVar119);
            nko1.H(xos0VarM9, x340Var, lljVar1110);
            x0d.q(iHashCode9, x340Var, lljVar1111, x340Var);
            nko1.H(qim0VarE9, x340Var, lljVar1112);
            lee1 lee1Var8 = cbx.d(x340Var).j;
            if (u7hVar3 == null) {
                x340Var.i0(591890124);
                j = cbx.a(x340Var).b.b;
                x340Var.r(false);
            } else {
                x340Var.i0(591889039);
                x340Var.r(false);
                j = u7hVar3.a;
            }
            uwo1.e(str, (qim0) null, lee1Var8, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i16 >> 3) & 14, 0, 2034);
            uwo1.d(af5Var, cbx.a(x340Var).b.a, (qim0) null, cbx.d(x340Var).h, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, (i16 >> 6) & 14, 0, 4084);
            x340Var = x340Var;
            x340Var.r(true);
            if (z5) {
                x340Var.i0(1239774388);
                w0h1.a(mlx.c, isl.a, (qim0) null, cbx.a(x340Var).b.b, 0L, false, x340Var, mlx.d | 48, 52);
                x340Var.r(false);
            } else {
                x340Var.i0(1239946407);
                x340Var.r(false);
            }
            x340Var.r(true);
            u7hVar2 = u7hVar3;
            z4 = z5;
            qim0Var2 = qim0Var12;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            u7hVar2 = u7hVar;
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new izk(j2iVar, str, af5Var, function0, qim0Var2, u7hVar2, z4, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x029f  */
    /* JADX WARN: Code duplicated, block: B:104:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:107:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:109:0x02db  */
    /* JADX WARN: Code duplicated, block: B:110:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:113:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:118:0x032a  */
    /* JADX WARN: Code duplicated, block: B:119:0x032e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0348  */
    /* JADX WARN: Code duplicated, block: B:124:0x035e  */
    /* JADX WARN: Code duplicated, block: B:128:0x037e  */
    /* JADX WARN: Code duplicated, block: B:134:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:136:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:140:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:143:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:144:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:150:0x0404  */
    /* JADX WARN: Code duplicated, block: B:153:0x0429  */
    /* JADX WARN: Code duplicated, block: B:155:0x0469  */
    /* JADX WARN: Code duplicated, block: B:158:0x047d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0508  */
    /* JADX WARN: Code duplicated, block: B:184:0x0514  */
    /* JADX WARN: Code duplicated, block: B:186:0x0537  */
    /* JADX WARN: Code duplicated, block: B:187:0x0539  */
    /* JADX WARN: Code duplicated, block: B:191:0x0542  */
    /* JADX WARN: Code duplicated, block: B:194:0x0565  */
    /* JADX WARN: Code duplicated, block: B:203:0x038d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0378 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x03b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[LOOP:2: B:111:0x02e1->B:213:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:79:0x0203  */
    /* JADX WARN: Code duplicated, block: B:83:0x020d  */
    /* JADX WARN: Code duplicated, block: B:86:0x023f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0243  */
    /* JADX WARN: Code duplicated, block: B:92:0x024d  */
    /* JADX WARN: Code duplicated, block: B:95:0x027e  */
    /* JADX WARN: Code duplicated, block: B:97:0x028e  */
    /* JADX WARN: Code duplicated, block: B:99:0x029d  */
    public static final void t(oxk oxkVar, iu30 iu30Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        boolean z2;
        int i2;
        int i3;
        String strK;
        int i4;
        boolean z3;
        Object objT;
        boolean z4;
        Object objT2;
        String strK2;
        boolean z5;
        Object objT3;
        iu30 iu30Var2;
        boolean z6;
        Object objT4;
        boolean z7;
        int i5;
        int i6;
        boolean z8;
        Iterator it;
        boolean z9;
        ArrayList<rxk> arrayList;
        ArrayList arrayList2;
        boolean zIsEmpty;
        List listSingletonList;
        boolean z10;
        Object objT5;
        boolean z11;
        boolean z12;
        String str;
        int i7;
        int i8;
        String strK3;
        oxk oxkVar2 = oxkVar;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        sxk sxkVar = oxkVar2.e;
        era eraVar = een.P0;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(417119146);
        j06 j06Var = x340Var.a;
        int i9 = (i & 6) == 0 ? (x340Var.i(oxkVar2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i9 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i9 |= x340Var.h(z) ? 256 : 128;
        }
        int i10 = i9 | 3072;
        if (x340Var.Y(i10 & 1, (i10 & 1171) != 1170)) {
            u380 u380Var = oxkVar2.w;
            c380 c380Var = oxkVar2.v;
            boolean zO = v8r.o(sxkVar);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(12.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            u7h u7hVarL = null;
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z13 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z13) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            String strO0 = cwl1.o0(x340Var, 2131952779);
            lee1 lee1Var = cbx.d(x340Var).h;
            long j = cbx.a(x340Var).b.a;
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                objT6 = tqk.T0;
                x340Var.s0(objT6);
            }
            uwo1.e(strO0, s161.b(qim0Var3, false, (iu30) objT6), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            String strO1 = cwl1.o0(x340Var, 2131952794);
            sxk sxkVar2 = oxkVar2.u;
            if (sxkVar2 == null) {
                sxkVar2 = sxkVar;
            }
            int iC = l1d.C(sxkVar2.a);
            if (iC == 0) {
                z2 = false;
                i2 = 440443947;
                i3 = 2131952792;
            } else if (iC != 1) {
                if (iC == 2) {
                    x340Var.i0(440433382);
                    int i11 = sxkVar2.b;
                    if (i11 == 0) {
                        x340Var.i0(768624746);
                        x340Var.r(false);
                        strK3 = null;
                    } else {
                        x340Var.i0(440436343);
                        switch (l1d.C(i11)) {
                            case 0:
                                i7 = -561898382;
                                i8 = 2131952831;
                                break;
                            case 1:
                                i7 = -561894862;
                                i8 = 2131952829;
                                break;
                            case 2:
                                i7 = -561891309;
                                i8 = 2131952833;
                                break;
                            case 3:
                                i7 = -561887659;
                                i8 = 2131952834;
                                break;
                            case 4:
                                i7 = -561883980;
                                i8 = 2131952832;
                                break;
                            case 5:
                                i7 = -561880398;
                                i8 = 2131952828;
                                break;
                            case 6:
                                i7 = -561876812;
                                i8 = 2131952830;
                                break;
                            default:
                                throw p3d1.k(x340Var, -561900182, false);
                        }
                        strK3 = x0d.k(x340Var, i7, i8, x340Var, false);
                        x340Var.r(false);
                    }
                    if (strK3 == null) {
                        strK3 = "";
                    }
                    strK = cwl1.n0(2131952793, new Object[]{strK3}, x340Var);
                    x340Var.r(false);
                } else {
                    if (iC != 3) {
                        throw p3d1.k(x340Var, 440426901, false);
                    }
                    i2 = 440439566;
                    i3 = 2131952791;
                    z2 = false;
                }
                String str2 = strK;
                boolean z14 = !oxkVar2.l;
                j2i j2iVar = uei.b;
                i4 = i10 & 112;
                if (i4 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objT = x340Var.T();
                if (z3 || objT == m4cVar) {
                    objT = new lck(iu30Var, (byte) 26);
                    x340Var.s0(objT);
                }
                r(j2iVar, strO1, str2, (Function0) objT, null, null, z14, x340Var, 3078, 96);
                j2i j2iVar2 = uei.c;
                String strO2 = cwl1.o0(x340Var, 2131952799);
                String str3 = oxkVar2.d.b;
                if (i4 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objT2 = x340Var.T();
                if (z4 || objT2 == m4cVar) {
                    objT2 = new lck(iu30Var, (byte) 27);
                    x340Var.s0(objT2);
                }
                r(j2iVar2, strO2, str3, (Function0) objT2, null, null, false, x340Var, 3078, 224);
                j2i j2iVar3 = uei.d;
                String strO3 = cwl1.o0(x340Var, 2131952786);
                strK2 = oxkVar2.C;
                if (strK2 == null) {
                    strK2 = x0d.k(x340Var, 364160984, 2131952787, x340Var, false);
                } else {
                    x340Var.i0(364160426);
                    x340Var.r(false);
                }
                if (i4 == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objT3 = x340Var.T();
                if (z5 || objT3 == m4cVar) {
                    objT3 = new lck(iu30Var, (byte) 28);
                    x340Var.s0(objT3);
                }
                r(j2iVar3, strO3, strK2, (Function0) objT3, null, null, false, x340Var, 3078, 224);
                x340Var = x340Var;
                if (c380Var.isEmpty()) {
                    iu30Var2 = iu30Var;
                    x340Var.i0(-1594446322);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1595648533);
                    if (c380Var.isEmpty()) {
                        z9 = false;
                    } else {
                        it = c380Var.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z9 = false;
                            } else if (!u380Var.contains(((rxk) it.next()).a)) {
                                z9 = true;
                            }
                        }
                    }
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 0);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0Var3);
                    hzj.A.getClass();
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA2, x340Var, lljVar4);
                    nko1.H(xos0VarM2, x340Var, lljVar3);
                    x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar);
                    String strO4 = cwl1.o0(x340Var, 2131952773);
                    if (z9) {
                        x340Var.i0(1312159818);
                        u7hVarL = p3d1.l(x340Var, false, cbx.a(x340Var).b.e);
                    } else {
                        x340Var.i0(2022261498);
                        x340Var.r(false);
                    }
                    u7h u7hVar = u7hVarL;
                    x340Var.i0(1312162708);
                    arrayList = new ArrayList();
                    for (Object obj : c380Var) {
                        if (u380Var.contains(((rxk) obj).a)) {
                            arrayList.add(obj);
                        }
                    }
                    arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    for (rxk rxkVar : arrayList) {
                        str = rxkVar.d;
                        if (ihc1.y0(str)) {
                            str = rxkVar.a;
                        }
                        arrayList2.add(str);
                    }
                    zIsEmpty = arrayList2.isEmpty();
                    listSingletonList = arrayList2;
                    if (zIsEmpty) {
                        listSingletonList = Collections.singletonList(cwl1.o0(x340Var, 2131952774));
                    }
                    x340Var.r(false);
                    String strY0 = o7h.y0(listSingletonList, (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
                    j2i j2iVarR = apo.r(-334819081, new dr0((byte) 15, z9), x340Var);
                    if (i4 == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objT5 = x340Var.T();
                    if (!z10 || objT5 == m4cVar) {
                        iu30Var2 = iu30Var;
                        objT5 = new lck(iu30Var2, (byte) 29);
                        x340Var.s0(objT5);
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    z11 = z9;
                    r(j2iVarR, strO4, strY0, (Function0) objT5, null, u7hVar, false, x340Var, 3078, 160);
                    x340Var = x340Var;
                    if (z11) {
                        x340Var.i0(2022603770);
                        String strO5 = cwl1.o0(x340Var, 2131952775);
                        uwr uwrVar3 = cbx.a;
                        uwo1.e(strO5, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.e, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                        x340Var = x340Var;
                        z12 = false;
                        x340Var.r(false);
                    } else {
                        z12 = false;
                        x340Var.i0(2022823839);
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                    x340Var.r(z12);
                }
                oxkVar2 = oxkVar;
                r591 r591Var = oxkVar2.B;
                if (z || r591Var == null) {
                    x340Var.i0(-1593623954);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1594312991);
                    j2i j2iVarR2 = apo.r(-2039008938, new boj(r591Var, (byte) 23), x340Var);
                    String strO6 = cwl1.o0(x340Var, 2131952788);
                    int iOrdinal = r591Var.ordinal();
                    if (iOrdinal == 0) {
                        z7 = false;
                        i5 = 727754036;
                        i6 = 2131952795;
                    } else {
                        if (iOrdinal != 1) {
                            throw p3d1.k(x340Var, 727752083, false);
                        }
                        i5 = 727757905;
                        i6 = 2131952796;
                        z7 = false;
                    }
                    af5 af5Var = new af5(x0d.k(x340Var, i5, i6, x340Var, z7));
                    boolean z15 = i4 == 32;
                    Object objT7 = x340Var.T();
                    if (z15 || objT7 == m4cVar) {
                        z8 = false;
                        objT7 = new jzk(iu30Var2, (byte) 0);
                        x340Var.s0(objT7);
                    } else {
                        z8 = false;
                    }
                    x340 x340Var2 = x340Var;
                    s(j2iVarR2, strO6, af5Var, (Function0) objT7, null, null, false, x340Var2, 3078, 224);
                    x340Var = x340Var2;
                    x340Var.r(z8);
                }
                if (zO) {
                    x340Var.i0(-1592971218);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1593581453);
                    j2i j2iVarR3 = apo.r(1771013109, new boj(oxkVar2, (byte) 24), x340Var);
                    String strO7 = cwl1.o0(x340Var, 2131952789);
                    String str4 = oxkVar2.f.b;
                    if (i4 == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objT4 = x340Var.T();
                    if (z6 || objT4 == m4cVar) {
                        objT4 = new jzk(iu30Var2, (byte) 1);
                        x340Var.s0(objT4);
                    }
                    x340 x340Var3 = x340Var;
                    r(j2iVarR3, strO7, str4, (Function0) objT4, null, null, false, x340Var3, 3078, 224);
                    x340Var = x340Var3;
                    x340Var.r(false);
                }
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                z2 = false;
                i2 = 440428972;
                i3 = 2131952790;
            }
            strK = x0d.k(x340Var, i2, i3, x340Var, z2);
            String str5 = strK;
            boolean z16 = !oxkVar2.l;
            j2i j2iVar4 = uei.b;
            i4 = i10 & 112;
            if (i4 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            objT = x340Var.T();
            if (z3) {
                objT = new lck(iu30Var, (byte) 26);
                x340Var.s0(objT);
            } else {
                objT = new lck(iu30Var, (byte) 26);
                x340Var.s0(objT);
            }
            r(j2iVar4, strO1, str5, (Function0) objT, null, null, z16, x340Var, 3078, 96);
            j2i j2iVar5 = uei.c;
            String strO8 = cwl1.o0(x340Var, 2131952799);
            String str6 = oxkVar2.d.b;
            if (i4 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            objT2 = x340Var.T();
            if (z4) {
                objT2 = new lck(iu30Var, (byte) 27);
                x340Var.s0(objT2);
            } else {
                objT2 = new lck(iu30Var, (byte) 27);
                x340Var.s0(objT2);
            }
            r(j2iVar5, strO8, str6, (Function0) objT2, null, null, false, x340Var, 3078, 224);
            j2i j2iVar6 = uei.d;
            String strO9 = cwl1.o0(x340Var, 2131952786);
            strK2 = oxkVar2.C;
            if (strK2 == null) {
                strK2 = x0d.k(x340Var, 364160984, 2131952787, x340Var, false);
            } else {
                x340Var.i0(364160426);
                x340Var.r(false);
            }
            if (i4 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            objT3 = x340Var.T();
            if (z5) {
                objT3 = new lck(iu30Var, (byte) 28);
                x340Var.s0(objT3);
            } else {
                objT3 = new lck(iu30Var, (byte) 28);
                x340Var.s0(objT3);
            }
            r(j2iVar6, strO9, strK2, (Function0) objT3, null, null, false, x340Var, 3078, 224);
            x340Var = x340Var;
            if (c380Var.isEmpty()) {
                x340Var.i0(-1595648533);
                if (c380Var.isEmpty()) {
                    z9 = false;
                } else {
                    it = c380Var.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z9 = false;
                        } else if (!u380Var.contains(((rxk) it.next()).a)) {
                            z9 = true;
                        }
                    }
                }
                uwr uwrVar4 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var).b;
                mbh mbhVarA3 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 0);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0Var3);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA3, x340Var, lljVar4);
                nko1.H(xos0VarM3, x340Var, lljVar3);
                x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar);
                String strO10 = cwl1.o0(x340Var, 2131952773);
                if (z9) {
                    x340Var.i0(1312159818);
                    u7hVarL = p3d1.l(x340Var, false, cbx.a(x340Var).b.e);
                } else {
                    x340Var.i0(2022261498);
                    x340Var.r(false);
                }
                u7h u7hVar2 = u7hVarL;
                x340Var.i0(1312162708);
                arrayList = new ArrayList();
                while (r4.hasNext()) {
                    if (u380Var.contains(((rxk) obj).a)) {
                        arrayList.add(obj);
                    }
                }
                arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                while (r2.hasNext()) {
                    str = rxkVar.d;
                    if (ihc1.y0(str)) {
                        str = rxkVar.a;
                    }
                    arrayList2.add(str);
                }
                zIsEmpty = arrayList2.isEmpty();
                listSingletonList = arrayList2;
                if (zIsEmpty) {
                    listSingletonList = Collections.singletonList(cwl1.o0(x340Var, 2131952774));
                }
                x340Var.r(false);
                String strY1 = o7h.y0(listSingletonList, (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
                j2i j2iVarR4 = apo.r(-334819081, new dr0((byte) 15, z9), x340Var);
                if (i4 == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objT5 = x340Var.T();
                if (z10) {
                    iu30Var2 = iu30Var;
                    objT5 = new lck(iu30Var2, (byte) 29);
                    x340Var.s0(objT5);
                } else {
                    iu30Var2 = iu30Var;
                    objT5 = new lck(iu30Var2, (byte) 29);
                    x340Var.s0(objT5);
                }
                z11 = z9;
                r(j2iVarR4, strO10, strY1, (Function0) objT5, null, u7hVar2, false, x340Var, 3078, 160);
                x340Var = x340Var;
                if (z11) {
                    x340Var.i0(2022603770);
                    String strO11 = cwl1.o0(x340Var, 2131952775);
                    uwr uwrVar5 = cbx.a;
                    uwo1.e(strO11, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.e, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                    x340Var = x340Var;
                    z12 = false;
                    x340Var.r(false);
                } else {
                    z12 = false;
                    x340Var.i0(2022823839);
                    x340Var.r(false);
                }
                x340Var.r(true);
                x340Var.r(z12);
            } else {
                iu30Var2 = iu30Var;
                x340Var.i0(-1594446322);
                x340Var.r(false);
            }
            oxkVar2 = oxkVar;
            r591 r591Var2 = oxkVar2.B;
            if (z) {
                x340Var.i0(-1593623954);
                x340Var.r(false);
            } else {
                x340Var.i0(-1593623954);
                x340Var.r(false);
            }
            if (zO) {
                x340Var.i0(-1593581453);
                j2i j2iVarR5 = apo.r(1771013109, new boj(oxkVar2, (byte) 24), x340Var);
                String strO12 = cwl1.o0(x340Var, 2131952789);
                String str7 = oxkVar2.f.b;
                if (i4 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objT4 = x340Var.T();
                if (z6) {
                    objT4 = new jzk(iu30Var2, (byte) 1);
                    x340Var.s0(objT4);
                } else {
                    objT4 = new jzk(iu30Var2, (byte) 1);
                    x340Var.s0(objT4);
                }
                x340 x340Var4 = x340Var;
                r(j2iVarR5, strO12, str7, (Function0) objT4, null, null, false, x340Var4, 3078, 224);
                x340Var = x340Var4;
                x340Var.r(false);
            } else {
                x340Var.i0(-1592971218);
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
            h311VarV.d = new d30((Object) oxkVar2, iu30Var, z, qim0Var2, i, (byte) 12);
        }
    }

    public static final void u(oxk oxkVar, iu30 iu30Var, b0k b0kVar, int i) {
        c380<s781> c380Var = oxkVar.c;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1689425648);
        int i2 = (i & 6) == 0 ? (x340Var.i(oxkVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            s781 s781Var = oxkVar.f;
            boolean zG = x340Var.g(s781Var.a) | x340Var.g(c380Var);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                for (s781 s781Var2 : c380Var) {
                    arrayList.add(new m881(s781Var2.a, s781Var2.b, Uri.parse(s781Var2.c), s781Var2.e, u890.j(s781Var2.a, s781Var.a)));
                }
                objT = mqo1.A(arrayList);
                x340Var.s0(objT);
            }
            c380 c380Var2 = (c380) objT;
            int i3 = i2 & 112;
            boolean zI = x340Var.i(oxkVar) | (i3 == 32);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new jjk(oxkVar, iu30Var, (byte) 10);
                x340Var.s0(objT2);
            }
            vu30 vu30Var = (vu30) objT2;
            boolean z = i3 == 32;
            Object objT3 = x340Var.T();
            if (z || objT3 == m4cVar) {
                objT3 = new jzk(iu30Var, (byte) 2);
                x340Var.s0(objT3);
            }
            Function0 function0 = (Function0) objT3;
            boolean z2 = i3 == 32;
            Object objT4 = x340Var.T();
            if (z2 || objT4 == m4cVar) {
                objT4 = new jzk(iu30Var, (byte) 3);
                x340Var.s0(objT4);
            }
            z6p1.l(c380Var2, vu30Var, function0, (Function0) objT4, x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bkh(oxkVar, iu30Var, i, (byte) 6);
        }
    }

    public static final void v(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-903913152);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.e(l1d.C(1)) ? 32 : 16) | (b0kVar3.g(str2) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024) | (b0kVar3.i(function0) ? 16384 : 8192) | 196608;
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            float fX = gto1.x(1, b0kVar3, 3);
            max maxVarR = y7y0.R(z, b0kVar3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            uvx uvxVar = new uvx(1, (pgx) null, 3, new zzq0(16.0f, 8.0f, 16.0f, 8.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 498);
            String strO0 = cwl1.o0(b0kVar3, 2131962733);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("song_dna_search_artist_row", u291.f(qim0Var3, 1.0f)), uvxVar, maxVarR, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, (xu30) null, apo.r(-1681049431, new caa1(str2, str, fX, (byte) 1), b0kVar3), (xu30) null, apo.r(-1112493304, new kk11(3, (byte) 6), b0kVar3), rjj.a, (xu30) null, (xu30) null, apo.r(1935031940, new dba1(str, (byte) 0), b0kVar3), b0kVar2, 805306432, 197040, 26040);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new br30(str, str2, z, function0, qim0Var2, i, (byte) 3);
        }
    }

    public static final void w(hob1 hob1Var, vu30 vu30Var, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, qim0 qim0Var, boolean z, boolean z2, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        hob1 hob1Var2 = hob1Var;
        vu30 vu30Var2 = vu30Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(818377228);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(hob1Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(vu30Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(j2iVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(j2iVar4) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i3 |= x340Var.h(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= x340Var.h(z2) ? 67108864 : 33554432;
        }
        if (x340Var.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            cr00 cr00Var = hob1Var2.h;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, 16.0f, 16.0f, 0.0f, 9);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            int i4 = i3;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            rih1 rih1Var = null;
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarB2 = uyn1.B(qim0Var3, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0Var3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            qim0 qim0VarR = u291.r(uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, 16.0f, 7), 112.0f);
            mbh mbhVarA3 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarR);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA3, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            qim0 qim0VarO = sto1.o(u291.d(qim0Var3, 1.0f), 10.0f, er31.b(9.09f), false, 0L, 0L, 28);
            Uri uri = Uri.parse(cr00Var.d);
            fwx fwxVarG = hso1.G(box.c, 0L, u7h.b(bth.n(cr00Var, x340Var), 1.0f, 0.0f, 0.0f, 0.0f, 14), x340Var, box.d, 22);
            eso1.e(uri, isl.a, qim0VarO, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, x340Var, 1073744944, 0, 3568);
            x340Var = x340Var;
            x340Var.r(true);
            op71.g(x340Var, new wnb0(1.0f, true));
            int i5 = i4 >> 15;
            dv20.l(i5 & 14, j2iVar4, x340Var, true);
            if (vu30Var == null) {
                x340Var.i0(413061945);
                x340Var.r(false);
                vu30Var2 = vu30Var;
            } else {
                x340Var.i0(1260250568);
                vu30Var2 = vu30Var;
                us71.j((i4 >> 3) & 14, vu30Var2, x340Var, false);
            }
            hob1Var2 = hob1Var;
            ch7 ch7Var = hob1Var2.x;
            if (ch7Var == null) {
                x340Var.i0(413108569);
                x340Var.r(false);
            } else {
                x340Var.i0(413108570);
                q(ch7Var, x340Var, 0);
                x340Var.r(false);
                rih1Var = rih1.a;
            }
            if (rih1Var == null) {
                x340Var.i0(1260254018);
                int i6 = i4 >> 3;
                bth.g(cr00Var, j2iVar, z, true, true, (qim0) null, false, z2, x340Var, (i5 & 896) | (i6 & 112) | 27648 | (i6 & 29360128), 96);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(1260251476);
                x340Var.r(false);
            }
            x340Var.r(true);
            int i7 = i4 >> 6;
            bth.c((qim0) null, j2iVar2, j2iVar3, true, x340Var, (i7 & 112) | 3072 | (i7 & 896), 1);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yo7(hob1Var2, vu30Var2, j2iVar, j2iVar2, j2iVar3, j2iVar4, qim0Var2, z, z2, i);
        }
    }

    public static final void x(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(807893264);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128) | 3072;
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            String strO0 = cwl1.o0(x340Var2, 2131952797);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).h;
            long j = cbx.a(x340Var2).b.a;
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = tqk.U0;
                x340Var2.s0(objT);
            }
            uwo1.e(strO0, s161.b(qim0Var3, false, (iu30) objT), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
            if (z) {
                x340Var2.i0(-41397122);
                mod.b(jw80.c.a(new p3v(0.0f)), apo.r(-127871995, new bvk(function0, (byte) 1), x340Var2), x340Var2, 56);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-40757096);
                x340Var2.r(false);
            }
            x340Var2.r(true);
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0Var2 = qim0Var3;
            uwo1.e(str, (qim0) null, kk0.p(qim0Var3, 8.0f, x340Var2, x340Var2).j, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, i2 & 14, 0, 2034);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pfg(str, z, function0, qim0Var2, i, (byte) 2);
        }
    }

    public static final void y(hob1 hob1Var, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, Function0 function0, Function0 function1, qim0 qim0Var, vu30 vu30Var, boolean z, float f, boolean z2, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-252687661);
        int i2 = i | (x340Var.i(hob1Var) ? 4 : 2) | (x340Var.i(function0) ? 131072 : 65536) | (x340Var.i(function1) ? 1048576 : 524288) | 12582912 | (x340Var.h(z) ? 536870912 : 268435456);
        int i3 = (x340Var.d(f) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                qim0Var2 = nim0.a;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            x340Var.s();
            cr00 cr00Var = hob1Var.h;
            qim0 qim0VarO = bth.o(qim0Var2, f, cr00Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            jtr jtrVar = jtr.c;
            pm31 pm31Var = new pm31(0);
            boolean z3 = (i2 & 3670016) == 1048576;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new tpj1(function1, (byte) 20);
                x340Var.s0(objT2);
            }
            Function0 function2 = (Function0) objT2;
            boolean z4 = (458752 & i2) == 131072;
            Object objT3 = x340Var.T();
            if (z4 || objT3 == m4cVar) {
                objT3 = new tpj1(function0, (byte) 21);
                x340Var.s0(objT3);
            }
            qim0 qim0VarI = zr7.i(bin.y(qim0VarO, idn0Var, jtrVar, false, (String) null, pm31Var, (String) null, function2, (Function0) objT3, 428), new uyg(bth.n(cr00Var, x340Var), hob1Var.A));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarI);
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
            if (upo1.A(x340Var)) {
                x340Var.i0(875343517);
                w(hob1Var, vu30Var, j2iVar, j2iVar2, j2iVar3, j2iVar4, null, z, z2, x340Var, ((i2 >> 6) & 29360128) | (i2 & 14) | 224688 | ((i3 << 21) & 234881024));
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(875740782);
                d(hob1Var, vu30Var, j2iVar, j2iVar2, j2iVar3, null, z, z2, x340Var, (i2 & 14) | 28080 | ((i2 >> 9) & 3670016) | ((i3 << 18) & 29360128));
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new iei0(hob1Var, j2iVar, j2iVar2, j2iVar3, j2iVar4, function0, function1, qim0Var2, vu30Var, z, f, z2, i);
        }
    }

    public static Intent z(Context context, EntryPoint entryPoint) {
        Intent intent = new Intent(context, (Class<?>) AllboardingActivity.class);
        EntryPoint.Companion.getClass();
        return intent.putExtra("entry-point", entryPoint.ordinal());
    }

    public abstract String C();
}
