package p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.TypedValue;
import android.view.animation.PathInterpolator;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.metadata.classic.proto.Metadata;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Level;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class boo1 {
    public static final gn10 a = new gn10("video-preview-carousel-artist");
    public static b180 b;

    public static final vaw A(dhm0 dhm0Var) {
        boolean z = dhm0Var.c;
        String str = dhm0Var.S0;
        Set set = dhm0Var.i;
        return new vaw(z, str, dhm0Var.b, dhm0Var.e, set, dhm0Var.g, dhm0Var.t, dhm0Var.U0 * 2);
    }

    public static final dhm0 B(dhm0 dhm0Var) {
        List<p111> list = dhm0Var.R0;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (p111 p111Var : list) {
            boolean z = false;
            boolean z2 = ((dhm0Var.Y || !p111Var.i) && (dhm0Var.N0 || !p111Var.X)) ? p111Var.h : false;
            if ((dhm0Var.P0 && p111Var.f) || (dhm0Var.Q0 && p111Var.i)) {
                z = true;
            }
            arrayList.add(p111.a(p111Var, false, false, (urt0) null, z2, z, 111));
        }
        return dhm0.a(dhm0Var, (String) null, false, false, (String) null, false, false, false, (Set) null, (Set) null, false, (Set) null, false, (xbe0) null, false, false, arrayList, (wuz) null, 1966079);
    }

    public static c380 C(int i, uao0 uao0Var) {
        t0z t0zVar = fkc1.Y;
        ArrayList arrayList = new ArrayList();
        d7 d7Var = new d7(t0zVar, (byte) 0);
        while (d7Var.hasNext()) {
            Object next = d7Var.next();
            int iOrdinal = ((fkc1) next).ordinal();
            if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            eg.o();
                            return null;
                        }
                        if (i == 5) {
                        }
                    } else if (i == 5 || i >= 8) {
                    }
                } else if (i >= 5) {
                }
            }
            arrayList.add(next);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((fkc1) obj).a() || uao0Var == uao0.c || uao0Var == uao0.a) {
                arrayList2.add(obj);
            }
        }
        return mqo1.A(arrayList2);
    }

    public static boolean D(int i) {
        Boolean bool;
        if (i - 1 == 0) {
            return !nbp1.a();
        }
        if (!nbp1.a()) {
            return true;
        }
        try {
            bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            nbp1.a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x010a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0172  */
    /* JADX WARN: Code duplicated, block: B:97:0x0180  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void a(gbx gbxVar, yf yfVar, max maxVar, gdx gdxVar, vzq0 vzq0Var, idn0 idn0Var, ga80 ga80Var, qim0 qim0Var, boolean z, eix eixVar, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        max maxVar2;
        vzq0 vzq0Var2;
        idn0 idn0Var2;
        ga80 ga80Var2;
        boolean z2;
        boolean z3;
        b0k b0kVar2;
        eix eixVar2;
        boolean z4;
        h311 h311VarV;
        boolean z5;
        qim0 qim0VarU;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(167511077);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(gbxVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.g((Object) null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.g(yfVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            maxVar2 = maxVar;
            i3 |= b0kVar3.g(maxVar2) ? 2048 : 1024;
        } else {
            maxVar2 = maxVar;
        }
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.g(gdxVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            vzq0Var2 = vzq0Var;
            i3 |= b0kVar3.g(vzq0Var2) ? 131072 : 65536;
        } else {
            vzq0Var2 = vzq0Var;
        }
        if ((1572864 & i) == 0) {
            idn0Var2 = idn0Var;
            i3 |= b0kVar3.g(idn0Var2) ? 1048576 : 524288;
        } else {
            idn0Var2 = idn0Var;
        }
        if ((12582912 & i) == 0) {
            ga80Var2 = ga80Var;
            i3 |= b0kVar3.g(ga80Var2) ? 8388608 : 4194304;
        } else {
            ga80Var2 = ga80Var;
        }
        if ((100663296 & i) == 0) {
            i3 |= b0kVar3.g(qim0Var) ? 67108864 : 33554432;
        }
        int i4 = i2 & 512;
        if (i4 == 0) {
            if ((805306368 & i) == 0) {
                z2 = z;
                i3 |= b0kVar3.h(z2) ? 536870912 : 268435456;
            }
            if ((306783379 & i3) == 306783378) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (b0kVar3.Y(i3 & 1, z3)) {
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                eix eixVar3 = ycn0.a;
                float f = gdxVar.c;
                qim0VarU = u291.u(qim0Var, f, f, 0.0f, 0.0f, 12);
                if (z5) {
                    vq60 vq60Var = jw80.a;
                    qim0VarU = qim0VarU.then(tsj0.a);
                }
                int i5 = i3 >> 3;
                int i6 = i3 << 3;
                b0kVar2 = b0kVar3;
                cwl1.b(qim0VarU, (tl3) null, (hw61) yfVar.b, (pgx) y(yfVar, b0kVar3).a, vzq0Var2, maxVar2, false, idn0Var2, ga80Var2, gbxVar, (gbx) null, apo.r(-2031617316, new adx(gdxVar, j2iVar, (byte) 0), b0kVar3), b0kVar2, (i5 & 57344) | ((i3 << 6) & 458752) | (i6 & 29360128) | (i6 & 234881024) | ((i3 << 27) & 1879048192), (i5 & 14) | 48, 66);
                z4 = z5;
                eixVar2 = eixVar3;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                eixVar2 = eixVar;
                z4 = z2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new bdx(gbxVar, yfVar, maxVar, gdxVar, vzq0Var, idn0Var, ga80Var, qim0Var, z4, eixVar2, j2iVar, i, i2);
            }
        }
        i3 |= 805306368;
        z2 = z;
        if ((306783379 & i3) == 306783378) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (b0kVar3.Y(i3 & 1, z3)) {
            if (i4 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            eix eixVar4 = ycn0.a;
            float f2 = gdxVar.c;
            qim0VarU = u291.u(qim0Var, f2, f2, 0.0f, 0.0f, 12);
            if (z5) {
                vq60 vq60Var2 = jw80.a;
                qim0VarU = qim0VarU.then(tsj0.a);
            }
            int i7 = i3 >> 3;
            int i8 = i3 << 3;
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarU, (tl3) null, (hw61) yfVar.b, (pgx) y(yfVar, b0kVar3).a, vzq0Var2, maxVar2, false, idn0Var2, ga80Var2, gbxVar, (gbx) null, apo.r(-2031617316, new adx(gdxVar, j2iVar, (byte) 0), b0kVar3), b0kVar2, (i7 & 57344) | ((i3 << 6) & 458752) | (i8 & 29360128) | (i8 & 234881024) | ((i3 << 27) & 1879048192), (i7 & 14) | 48, 66);
            z4 = z5;
            eixVar2 = eixVar4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            eixVar2 = eixVar;
            z4 = z2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bdx(gbxVar, yfVar, maxVar, gdxVar, vzq0Var, idn0Var, ga80Var, qim0Var, z4, eixVar2, j2iVar, i, i2);
        }
    }

    public static final void b(boolean z, iu30 iu30Var, yf yfVar, yf yfVar2, max maxVar, gdx gdxVar, vzq0 vzq0Var, idn0 idn0Var, ga80 ga80Var, qim0 qim0Var, boolean z2, eix eixVar, j2i j2iVar, b0k b0kVar, int i, int i2, int i3) {
        int i4;
        yf yfVar3;
        yf yfVar4;
        max maxVar2;
        int i5;
        boolean z3;
        eix eixVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(651224889);
        if ((i & 6) == 0) {
            i4 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            yfVar3 = yfVar;
            i4 |= x340Var.g(yfVar3) ? 256 : 128;
        } else {
            yfVar3 = yfVar;
        }
        if ((i & 3072) == 0) {
            yfVar4 = yfVar2;
            i4 |= x340Var.g(yfVar4) ? 2048 : 1024;
        } else {
            yfVar4 = yfVar2;
        }
        if ((i & 24576) == 0) {
            maxVar2 = maxVar;
            i4 |= x340Var.g(maxVar2) ? 16384 : 8192;
        } else {
            maxVar2 = maxVar;
        }
        if ((196608 & i) == 0) {
            i4 |= x340Var.g(gdxVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= x340Var.g(vzq0Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= x340Var.g(idn0Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= x340Var.g(ga80Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= x340Var.g(qim0Var) ? 536870912 : 268435456;
        }
        int i6 = i3 & 1024;
        if (i6 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (x340Var.h(z2) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i7 = i5 | 48;
        if ((i2 & 384) == 0) {
            i7 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (i7 & 147) == 146) ? false : true)) {
            boolean z4 = i6 == 0 ? z2 : true;
            eix eixVar3 = ycn0.a;
            yf yfVar5 = z ? yfVar4 : yfVar3;
            float f = gdxVar.c;
            qim0 qim0VarU = u291.u(qim0Var, f, f, 0.0f, 0.0f, 12);
            if (z4) {
                vq60 vq60Var = jw80.a;
                qim0VarU = qim0VarU.then(tsj0.a);
            }
            cwl1.c(z, iu30Var, qim0VarU, (tl3) null, (hw61) yfVar5.b, (pgx) y(yfVar5, x340Var).a, vzq0Var, maxVar2, false, idn0Var, ga80Var, apo.r(-314759888, new e6j(gdxVar, j2iVar, (byte) 29), x340Var), x340Var, (3670142 & i4) | ((i4 << 9) & 29360128) | ((i4 << 6) & 1879048192), ((i4 >> 24) & 14) | 48, 264);
            z3 = z4;
            eixVar2 = eixVar3;
        } else {
            x340Var.b0();
            z3 = z2;
            eixVar2 = eixVar;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cdx(z, iu30Var, yfVar, yfVar2, maxVar, gdxVar, vzq0Var, idn0Var, ga80Var, qim0Var, z3, eixVar2, j2iVar, i, i2, i3);
        }
    }

    public static final void c(hd60 hd60Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1749861720);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(hd60Var) : x340Var.i(hd60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(8.0f);
            qim0Var2 = qim0Var;
            lc60.c(((i2 << 3) & 896) | 3120, apo.r(-641796439, new jj50((Object) cr31VarB, (Object) hd60Var, (byte) 10), x340Var), x340Var, qim0Var2, hd60Var.k, false);
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new say(hd60Var, qim0Var2, i, (byte) 29);
        }
    }

    public static final void d(int i, int i2, String str, String str2, b0k b0kVar) {
        String str3;
        String str4;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1479639698);
        j06 j06Var = ((x340) b0kVar2).a;
        int i3 = i2 | (b0kVar2.e(i) ? 4 : 2) | (b0kVar2.g(str) ? 32 : 16) | (b0kVar2.g(str2) ? 256 : 128);
        if (b0kVar2.Y(i3 & 1, (i3 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar2).f;
            qim0 qim0VarQ = i1p1.q(qim0VarF, er31.b(6.0f));
            long jA = cbx.a(b0kVar2).a.a.a();
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0VarF2 = dug.f(qim0VarQ, jA, u5j1Var);
            fra fraVar = een.Z;
            cvx cvxVar = cbx.b(b0kVar2).b;
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), fraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF2);
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
            mta mtaVar = cbx.b(b0kVar2).d;
            qim0 qim0VarR = u291.r(nim0Var, 48.0f);
            cua cuaVar2 = cbx.b(b0kVar2).f;
            qim0 qim0VarF3 = dug.f(i1p1.q(qim0VarR, er31.b(4.0f)), cbx.a(b0kVar2).a.a.c(), u5j1Var);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarF3);
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
            jmr0 jmr0VarN = i3o1.n(i, b0kVar2, i3 & 14);
            zov0 zov0Var = cbx.b(b0kVar2).g;
            cwl1.f(jmr0VarN, (String) null, u291.r(nim0Var, 24.0f), (tl3) null, (j6m) null, 0.0f, (ColorFilter) null, b0kVar2, 56, 120);
            b0kVar2.r(true);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, wnb0Var);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM3, b0kVar2, lljVar2);
            x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar4);
            b0kVar2 = b0kVar2;
            uwo1.e(str, null, cbx.d(b0kVar2).k, cbx.a(b0kVar2).b.a, null, null, 0, false, null, 0, null, b0kVar2, (i3 >> 3) & 14, 0, 2034);
            str3 = str;
            str4 = str2;
            uwo1.e(str4, null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, null, null, 0, false, null, 0, null, b0kVar2, (i3 >> 6) & 14, 0, 2034);
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            str3 = str;
            str4 = str2;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new dhs0(i, str3, str4, i2);
        }
    }

    public static final void e(hab1 hab1Var, qim0 qim0Var, fvb0 fvb0Var, zzq0 zzq0Var, g36 g36Var, float f, iq20 iq20Var, boolean z, hxq0 hxq0Var, iu30 iu30Var, b0k b0kVar, int i) {
        fvb0 fvb0Var2;
        iq20 iq20Var2;
        boolean z2;
        hxq0 hxq0Var2;
        fvb0 fvb0VarZ;
        hxq0 hxq0VarB;
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-670735644);
        int i3 = i | (x340Var.g(hab1Var) ? 4 : 2) | (x340Var.g(qim0Var) ? 32 : 16) | 128 | (x340Var.g(zzq0Var) ? 2048 : 1024) | 24576 | (x340Var.g(g36Var) ? 131072 : 65536) | (x340Var.d(f) ? 1048576 : 524288) | 373293056;
        int i4 = x340Var.i(iu30Var) ? 4 : 2;
        if (x340Var.Y(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                fvb0VarZ = loo1.z(x340Var);
                e9r e9rVarA = wxa1.a(x340Var);
                boolean zG = x340Var.g(e9rVarA);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    objT = new ozr(e9rVarA);
                    x340Var.s0(objT);
                }
                hxq0VarB = jxq0.b(x340Var);
                i2 = i3 & (-1908409217);
                iq20Var2 = (ozr) objT;
                z2 = true;
            } else {
                x340Var.b0();
                i2 = i3 & (-1908409217);
                fvb0VarZ = fvb0Var;
                iq20Var2 = iq20Var;
                hxq0VarB = hxq0Var;
                z2 = z;
            }
            x340Var.s();
            int i5 = i4;
            float fA = g36Var.a();
            int i6 = (i2 & 14) | ((i2 >> 12) & 112) | ((i2 >> 3) & 896);
            int i7 = i2;
            boolean z3 = ((((i6 & 112) ^ 48) > 32 && x340Var.g(g36Var)) || (i6 & 48) == 32) | ((((i6 & 14) ^ 6) > 4 && x340Var.g(hab1Var)) || (i6 & 6) == 4) | ((((i6 & 896) ^ 384) > 256 && x340Var.g(zzq0Var)) || (i6 & 384) == 256);
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new cvb0(new qg(zzq0Var, hab1Var, g36Var, (byte) 7));
                x340Var.s0(objT2);
            }
            hxq0Var2 = hxq0VarB;
            fvb0 fvb0Var3 = fvb0VarZ;
            foo1.i(fvb0Var3, qqq0.b, (cvb0) objT2, qim0Var, zzq0Var, iq20Var2, z2, hxq0Var2, f, fA, iu30Var, x340Var, 48 | ((i7 << 6) & 7168) | ((i7 << 3) & 57344) | 12779520 | ((i7 << 9) & 1879048192), (i5 << 3) & 112);
            fvb0Var2 = fvb0Var3;
        } else {
            x340Var.b0();
            fvb0Var2 = fvb0Var;
            iq20Var2 = iq20Var;
            z2 = z;
            hxq0Var2 = hxq0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mub0(hab1Var, qim0Var, fvb0Var2, zzq0Var, g36Var, f, iq20Var2, z2, hxq0Var2, iu30Var, i);
        }
    }

    public static final void f(hab1 hab1Var, qim0 qim0Var, fvb0 fvb0Var, zzq0 zzq0Var, float f, c36 c36Var, iq20 iq20Var, boolean z, hxq0 hxq0Var, iu30 iu30Var, b0k b0kVar, int i) {
        iq20 iq20Var2;
        boolean z2;
        hxq0 hxq0Var2;
        iq20 iq20Var3;
        hxq0 hxq0VarB;
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-578931208);
        int i3 = i | (x340Var.g(hab1Var) ? 4 : 2) | (x340Var.g(qim0Var) ? 32 : 16) | (x340Var.g(fvb0Var) ? 256 : 128) | (x340Var.g(zzq0Var) ? 2048 : 1024) | 24576 | (x340Var.d(f) ? 131072 : 65536) | (x340Var.g(c36Var) ? 1048576 : 524288) | 373293056;
        int i4 = x340Var.i(iu30Var) ? 4 : 2;
        boolean z3 = true;
        if (x340Var.Y(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                e9r e9rVarA = wxa1.a(x340Var);
                boolean zG = x340Var.g(e9rVarA);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    objT = new ozr(e9rVarA);
                    x340Var.s0(objT);
                }
                iq20Var3 = (ozr) objT;
                hxq0VarB = jxq0.b(x340Var);
                i2 = i3 & (-1908408321);
                z2 = true;
            } else {
                x340Var.b0();
                i2 = i3 & (-1908408321);
                iq20Var3 = iq20Var;
                z2 = z;
                hxq0VarB = hxq0Var;
            }
            x340Var.s();
            hxq0 hxq0Var3 = hxq0VarB;
            float fA = c36Var.a();
            int i5 = (i2 & 14) | ((i2 >> 15) & 112) | ((i2 >> 3) & 896);
            int i6 = i2;
            boolean z4 = ((((i5 & 14) ^ 6) > 4 && x340Var.g(hab1Var)) || (i5 & 6) == 4) | ((((i5 & 112) ^ 48) > 32 && x340Var.g(c36Var)) || (i5 & 48) == 32);
            if ((((i5 & 896) ^ 384) <= 256 || !x340Var.g(zzq0Var)) && (i5 & 384) != 256) {
                z3 = false;
            }
            boolean z5 = z4 | z3;
            Object objT2 = x340Var.T();
            if (z5 || objT2 == m4cVar) {
                objT2 = new cvb0(new qg(zzq0Var, hab1Var, c36Var, (byte) 6));
                x340Var.s0(objT2);
            }
            hxq0Var2 = hxq0Var3;
            iq20Var2 = iq20Var3;
            foo1.i(fvb0Var, qqq0.a, (cvb0) objT2, qim0Var, zzq0Var, iq20Var2, z2, hxq0Var2, f, fA, iu30Var, x340Var, ((i6 >> 6) & 14) | 48 | ((i6 << 6) & 7168) | ((i6 << 3) & 57344) | 12779520 | ((i6 << 12) & 1879048192), (i4 << 3) & 112);
        } else {
            x340Var.b0();
            iq20Var2 = iq20Var;
            z2 = z;
            hxq0Var2 = hxq0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mub0(hab1Var, qim0Var, fvb0Var, zzq0Var, f, c36Var, iq20Var2, z2, hxq0Var2, iu30Var, i);
        }
    }

    public static final void g(String str, ecx ecxVar, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-825202576);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(ecxVar) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = Uri.parse(str);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarF = hno1.f(qim0Var, ecxVar);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            qim0 qim0VarF2 = dug.f(i1p1.q(qim0VarF, er31.b(8.0f)), u7h.b, d4o1.a);
            xtx xtxVar = xtx.c;
            b0kVar2 = b0kVar3;
            eso1.e((Uri) objT, isl.a, qim0VarF2, (p3v) null, (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, new nux(xtxVar, xtxVar), false, false, b0kVar2, 1073741872, 0, 3512);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rvg0(str, ecxVar, qim0Var, i, (byte) 11);
        }
    }

    public static final void h(z9i0 z9i0Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-839812491);
        int i2 = (x340Var.g(z9i0Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarU = qxy0.u(qim0Var2, (idn0) null, 3);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new z6h0(z9i0Var, (byte) 12);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarU, false, (iu30) objT);
            if (((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).orientation == 2) {
                x340Var.i0(-669126733);
                j(z9i0Var, qim0VarB, x340Var, i3);
                x340Var.r(false);
            } else {
                x340Var.i0(-669031532);
                k(z9i0Var, qim0VarB, x340Var, i3);
                x340Var.r(false);
            }
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q0g0(z9i0Var, qim0Var, i, (byte) 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void i(String str, String str2, Function0 function0, yf yfVar, qim0 qim0Var, qim0 qim0Var2, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var3;
        boolean z;
        b0k b0kVar2;
        h311 h311VarV;
        qim0 qim0Var4;
        gdx gdxVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1164459608);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.i(yfVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.i(qim0Var) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                qim0Var3 = qim0Var2;
                i3 |= b0kVar3.i(qim0Var3) ? 131072 : 65536;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var3;
                }
                gdxVarR = yla.r(b0kVar3);
                if (!ihc1.y0(str2)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    b0kVar2 = b0kVar3;
                    foo1.c(new gbx(new y50(str2), function0), yfVar, qim0Var, null, gdxVarR, null, null, null, null, null, apo.r(-1288787255, new uo50(str, qim0Var4), b0kVar3), b0kVar2, (i3 >> 6) & 1008, 48, 2008);
                    qim0Var3 = qim0Var4;
                }
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new bd5(str, str2, function0, yfVar, qim0Var, qim0Var3, i, i2, (byte) 9);
            }
        }
        i3 |= 196608;
        qim0Var3 = qim0Var2;
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            if (i4 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var3;
            }
            gdxVarR = yla.r(b0kVar3);
            if (!ihc1.y0(str2)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                foo1.c(new gbx(new y50(str2), function0), yfVar, qim0Var, null, gdxVarR, null, null, null, null, null, apo.r(-1288787255, new uo50(str, qim0Var4), b0kVar3), b0kVar2, (i3 >> 6) & 1008, 48, 2008);
                qim0Var3 = qim0Var4;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bd5(str, str2, function0, yfVar, qim0Var, qim0Var3, i, i2, (byte) 9);
        }
    }

    public static final void j(z9i0 z9i0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        boolean z;
        z9i0 z9i0Var2 = z9i0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-259108779);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(z9i0Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        byte b2 = 0;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarH = l6o1.H(qim0Var, l6o1.C(0, 0, 1, x340Var), false, 14);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarH);
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.d;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarD = u291.d(uyn1.y(qim0VarP, f, 16.0f), 1.0f);
            era eraVar = een.Q0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            d7e.g(0, 1, x340Var, (qim0) null);
            cvx cvxVar2 = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarO = ab80.o(nim0Var, 16.0f, x340Var, nim0Var, 1.0f);
            fra fraVar = een.Z;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            int i3 = i2;
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarO);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            String str = z9i0Var2.a;
            qim0 qim0VarV = u291.v(nim0Var, 120.0f);
            cbx.a.getClass();
            g(str, uwr.d(), qim0VarV, x340Var, 0);
            op71.g(x340Var, u291.v(nim0Var, cbx.b(x340Var).b.c));
            mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, nim0Var);
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
            int i4 = i3 & 14;
            n(z9i0Var2, 5, x340Var, i4);
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
            if (z9i0Var2.h == null) {
                x340Var.i0(2122215581);
                l(z9i0Var2, u291.f(nim0Var, 1.0f), u291.f(nim0Var, 1.0f), x340Var, i4, 0);
                b2 = 0;
                x340Var.r(false);
                z = true;
                z9i0Var2 = z9i0Var;
            } else {
                x340Var.i0(2122419840);
                jw31 jw31VarA2 = ew31.a(gex0Var, een.N0, x340Var, 0);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, nim0Var);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA2, x340Var, lljVar);
                nko1.H(xos0VarM4, x340Var, lljVar2);
                x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar4);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                z9i0Var2 = z9i0Var;
                l(z9i0Var2, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), u291.f(nim0Var, 1.0f), x340Var, i4, 0);
                cvx cvxVar3 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.v(nim0Var, 16.0f));
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                z = true;
                b2 = 0;
                m(z9i0Var2, new wnb0(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), x340Var, i4, 0);
                x340Var.r(true);
                x340Var.r(false);
            }
            us71.m(x340Var, z, z, z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w9i0(z9i0Var2, qim0Var, i, b2);
        }
    }

    public static final void k(z9i0 z9i0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        z9i0 z9i0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1553103589);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(z9i0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarH = l6o1.H(qim0Var, l6o1.C(0, 0, 1, x340Var), false, 14);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarH);
            uwr uwrVar = cbx.a;
            qim0 qim0VarD = u291.d(uyn1.x(qim0VarP, cbx.b(x340Var).e.b), 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            d7e.g(0, 1, x340Var, (qim0) null);
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            String str = z9i0Var.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).b.e, 0.0f, 2, nim0Var);
            cbx.a.getClass();
            g(str, uwr.d(), qim0VarZ, x340Var, 0);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            int i3 = i2 & 14;
            n(z9i0Var, 3, x340Var, i3);
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
            z9i0Var2 = z9i0Var;
            l(z9i0Var2, null, null, x340Var, i3, 6);
            if (z9i0Var2.h == null) {
                x340Var.i0(118826629);
                x340Var.r(false);
            } else {
                x340Var.i0(118826630);
                cvx cvxVar3 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 16.0f));
                m(z9i0Var2, null, x340Var, i3, 2);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            z9i0Var2 = z9i0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w9i0(z9i0Var2, qim0Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x006b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public static final void l(z9i0 z9i0Var, qim0 qim0Var, qim0 qim0Var2, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var3;
        boolean z;
        qim0 qim0Var4;
        qim0 qim0Var5;
        h311 h311VarV;
        qim0 qim0Var6;
        qim0 qim0Var7;
        qim0 qim0Var8;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1940999569);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(z9i0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                qim0Var3 = qim0Var2;
                i3 |= x340Var.i(qim0Var3) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                qim0Var6 = nim0.a;
                if (i4 != 0) {
                    qim0Var7 = qim0Var6;
                } else {
                    qim0Var7 = qim0Var;
                }
                if (i5 != 0) {
                    qim0Var8 = qim0Var6;
                } else {
                    qim0Var8 = qim0Var3;
                }
                i(z9i0Var.e, z9i0Var.f, z9i0Var.g, new idx(4), qim0Var7, qim0Var8, x340Var, (i3 << 9) & 516096, 0);
                qim0Var4 = qim0Var7;
                qim0Var5 = qim0Var8;
            } else {
                x340Var.b0();
                qim0Var4 = qim0Var;
                qim0Var5 = qim0Var3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new qx1((Object) z9i0Var, (Object) qim0Var4, (Object) qim0Var5, i, i2, (byte) 14);
            }
        }
        i3 |= 384;
        qim0Var3 = qim0Var2;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            qim0Var6 = nim0.a;
            if (i4 != 0) {
                qim0Var7 = qim0Var6;
            } else {
                qim0Var7 = qim0Var;
            }
            if (i5 != 0) {
                qim0Var8 = qim0Var6;
            } else {
                qim0Var8 = qim0Var3;
            }
            i(z9i0Var.e, z9i0Var.f, z9i0Var.g, new idx(4), qim0Var7, qim0Var8, x340Var, (i3 << 9) & 516096, 0);
            qim0Var4 = qim0Var7;
            qim0Var5 = qim0Var8;
        } else {
            x340Var.b0();
            qim0Var4 = qim0Var;
            qim0Var5 = qim0Var3;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1((Object) z9i0Var, (Object) qim0Var4, (Object) qim0Var5, i, i2, (byte) 14);
        }
    }

    public static final void m(z9i0 z9i0Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        z9i0 z9i0Var2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1343664);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(z9i0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            if (i6 != 0) {
                qim0Var = nim0.a;
            }
            qim0 qim0Var3 = qim0Var;
            String str = z9i0Var.h;
            if (str == null) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new x9i0(z9i0Var, qim0Var3, i, i2, (byte) 1);
                    return;
                }
                return;
            }
            String str2 = z9i0Var.i;
            if (str2 == null) {
                str2 = str;
            }
            Function0 function0 = z9i0Var.j;
            if (function0 == null) {
                h311 h311VarV2 = x340Var.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new x9i0(z9i0Var, qim0Var3, i, i2, (byte) 2);
                    return;
                }
                return;
            }
            z9i0Var2 = z9i0Var;
            i5 = i;
            i4 = i2;
            i(str, str2, function0, ldx.c, qim0Var3, null, x340Var, (i3 << 9) & 57344, 32);
            qim0Var2 = qim0Var3;
        } else {
            i4 = i2;
            i5 = i;
            z9i0Var2 = z9i0Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV3 = x340Var.v();
        if (h311VarV3 != null) {
            h311VarV3.d = new x9i0(z9i0Var2, qim0Var2, i5, i4, (byte) 0);
        }
    }

    public static final void n(z9i0 z9i0Var, int i, b0k b0kVar, int i2) {
        int i3;
        qim0 qim0VarZ;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(579211191);
        if ((i2 & 6) == 0) {
            i3 = i2 | (x340Var.g(z9i0Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var = nim0.a;
            if (i == 3) {
                x340Var.i0(-1897863009);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-1897783339);
                x340Var.r(false);
                qim0VarZ = qim0Var;
            }
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = y7i0.e;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, true, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, i == 3 ? een.Q0 : een.P0, x340Var, 0);
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
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = y7i0.f;
                x340Var.s0(objT2);
            }
            qim0 qim0VarThen = s161.b(qim0Var, false, (iu30) objT2).then(qim0VarZ);
            uwr uwrVar2 = cbx.a;
            int i4 = (i3 << 9) & 57344;
            uwo1.e(z9i0Var.c, qim0VarThen, cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(i), null, 0, false, null, 0, null, x340Var, i4, 0, 2016);
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(z9i0Var.d, qim0VarZ, kk0.p(qim0Var, 8.0f, x340Var, x340Var).j, cbx.a(x340Var).b.b, new a0e1(i), null, 0, false, null, 0, null, x340Var, i4, 0, 2016);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y9i0(z9i0Var, i, i2);
        }
    }

    public static final void o(y3p0 y3p0Var, alt0 alt0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        h311 h311VarV;
        m2p0 m2p0Var;
        String strF;
        String str;
        String strN0 = y3p0Var.b;
        String str2 = y3p0Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-859975971);
        int i2 = i | (x340Var.g(y3p0Var) ? 4 : 2) | (x340Var.g(alt0Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (str2.length() == 0 && strN0.length() == 0) {
                str = str2;
                strF = null;
            } else {
                if (str2.length() == 0) {
                    strF = strN0;
                } else if (strN0.length() == 0) {
                    str = str2;
                    strF = str;
                } else {
                    strF = f4i1.f(str2, " – ", strN0);
                }
                str = str2;
            }
            qim0Var2 = nim0.a;
            if (strF == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    m2p0Var = new m2p0(y3p0Var, alt0Var, qim0Var2, i, (byte) 1);
                }
            } else {
                if (str.length() > 0 && strN0.length() > 0) {
                    x340Var.i0(-481546119);
                    strN0 = cwl1.n0(2131951718, new Object[]{str, strN0}, x340Var);
                    x340Var.r(false);
                } else if (str.length() > 0) {
                    x340Var.i0(-481542099);
                    x340Var.r(false);
                    strN0 = str;
                } else {
                    x340Var.i0(-481541169);
                    x340Var.r(false);
                }
                boolean z = alt0Var instanceof ykt0;
                if (z) {
                    x340Var.i0(-2042790928);
                    strN0 = cwl1.n0(2131951705, new Object[]{strN0}, x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-2042709212);
                    x340Var.r(false);
                }
                fra fraVar = een.N0;
                boolean zG = x340Var.g(strN0);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new fki0(strN0, (byte) 25);
                    x340Var.s0(objT);
                }
                qim0 qim0VarA = s161.a(qim0Var2, (iu30) objT);
                jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 48);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
                if (z) {
                    x340Var.i0(1579402658);
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    wkt0.a(zkt0.a, u291.r(qim0Var2, 16.0f), (ksl) null, 0L, false, x340Var, 6, 28);
                    cvx cvxVar = cbx.b(x340Var).b;
                    ab80.p(qim0Var2, 4.0f, x340Var, false);
                } else {
                    x340Var.i0(1579616961);
                    x340Var.r(false);
                }
                qim0 qim0VarN = e9k.n(63, qim0Var2);
                uwr uwrVar2 = cbx.a;
                uwo1.e(strF, qim0VarN, cbx.d(x340Var).j, cbx.a(x340Var).b.c, null, null, 0, false, new cjc0(1), 0, null, x340Var, 48, 0, 1776);
                x340Var = x340Var;
                x340Var.r(true);
            }
            h311VarV.d = m2p0Var;
        }
        x340Var.b0();
        qim0Var2 = qim0Var;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            m2p0Var = new m2p0(y3p0Var, alt0Var, qim0Var2, i, (byte) 0);
            h311VarV.d = m2p0Var;
        }
    }

    public static final void p(int i, String str, Function0 function0, b0k b0kVar) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2001331092);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new us21(function0, (byte) 29);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = qr51.R0;
                x340Var.s0(objT2);
            }
            oex oexVar = new oex(0, (vu30) null, (vu30) objT2, (vu30) null, 11);
            lex lexVarZ = yoo1.z(x340Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            poo1.e(gbxVar, oexVar, lexVarZ, null, 0, str, null, ggj.a, null, null, null, false, new zzq0(8.0f, 4.0f, 8.0f, 4.0f), apo.r(1526822279, new nl41(str, (byte) 8), x340Var), x340Var, ((i2 << 15) & 458752) | 12582912, 3072, 3928);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s721(str, function0, i, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void q(gd60 gd60Var, float f, float f2, qim0 qim0Var, b0k b0kVar, int i, int i2) throws NoWhenBranchMatchedException {
        float f3;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1400930853);
        int i3 = (i & 6) == 0 ? ((i & 8) == 0 ? x340Var.g(gd60Var) : x340Var.i(gd60Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= x340Var.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.d(f2) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                qim0Var = nim0.a;
            }
            qim0 qim0Var3 = qim0Var;
            if (gd60Var instanceof ad60) {
                x340Var.i0(-1969778152);
                ArrayList<yc60> arrayList = ((ad60) gd60Var).a;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (yc60 yc60Var : arrayList) {
                    arrayList2.add(new jf50(yc60Var.a, yc60Var.b));
                }
                if50.b(arrayList2, u291.r(qim0Var3, Math.min(0.8333333f * f, f2)), x340Var, 0);
                x340Var.r(false);
                f3 = f;
            } else if (gd60Var instanceof cd60) {
                x340Var.i0(-1969767109);
                fy81.a(((cd60) gd60Var).a, f, qim0Var3, 0.0f, x340Var, (i3 & 112) | ((i3 >> 3) & 896), 8);
                qim0Var3 = qim0Var3;
                f3 = f;
                x340Var.r(false);
            } else {
                f3 = f;
                if (gd60Var instanceof bd60) {
                    x340Var.i0(-1969762834);
                    bd60 bd60Var = (bd60) gd60Var;
                    quq0.a(bd60Var.a, bd60Var.b, f3, qim0Var3, x340Var, ((i3 << 3) & 896) | (i3 & 7168));
                    x340Var.r(false);
                } else if (gd60Var instanceof ed60) {
                    x340Var.i0(-1969757772);
                    ed60 ed60Var = (ed60) gd60Var;
                    gke1.a(ed60Var.a, ed60Var.b, f3, qim0Var3, x340Var, ((i3 << 3) & 896) | (i3 & 7168));
                    x340Var.r(false);
                } else if (gd60Var instanceof fd60) {
                    x340Var.i0(-1969752459);
                    fd60 fd60Var = (fd60) gd60Var;
                    hke1.a(fd60Var.a, fd60Var.b, fd60Var.c, f3, qim0Var3, x340Var, ((i3 << 6) & 7168) | (57344 & (i3 << 3)));
                    f3 = f3;
                    qim0Var3 = qim0Var3;
                    x340Var = x340Var;
                    x340Var.r(false);
                } else if (gd60Var instanceof dd60) {
                    x340Var.i0(-1969745362);
                    dd60 dd60Var = (dd60) gd60Var;
                    b8b1.a(dd60Var.a, dd60Var.b, dd60Var.c, f3, qim0Var3, x340Var, ((i3 << 6) & 7168) | (57344 & (i3 << 3)));
                    f3 = f3;
                    qim0Var3 = qim0Var3;
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    if (!(gd60Var instanceof zc60)) {
                        throw p3d1.k(x340Var, -1969779538, false);
                    }
                    x340Var.i0(-1969738374);
                    zc60 zc60Var = (zc60) gd60Var;
                    i2u.a(zc60Var.a, zc60Var.b, zc60Var.c, zc60Var.d, f3, qim0Var3, x340Var, (57344 & (i3 << 9)) | ((i3 << 6) & 458752));
                    f3 = f3;
                    qim0Var3 = qim0Var3;
                    x340Var = x340Var;
                    x340Var.r(false);
                }
            }
            qim0Var2 = qim0Var3;
        } else {
            f3 = f;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vc60(gd60Var, f3, f2, qim0Var2, i, i2);
        }
    }

    public static final void r(hd60 hd60Var, float f, float f2, b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(401594057);
        int i2 = (x340Var2.g(hd60Var) ? 32 : 16) | i | (x340Var2.d(f) ? 256 : 128) | (x340Var2.d(f2) ? 2048 : 1024);
        byte b2 = 1;
        if (!x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            x340Var = x340Var2;
            x340Var.b0();
        } else {
            if (hd60Var.l.isEmpty()) {
                x340Var2.i0(-1890186263);
                q(hd60Var.c, f, f2, null, x340Var2, (i2 >> 3) & 1008, 8);
                x340Var2.r(false);
                h311 h311VarV = x340Var2.v();
                if (h311VarV != null) {
                    h311VarV.d = new wc60(hd60Var, f, f2, i, (byte) 0);
                    return;
                }
                return;
            }
            x340Var = x340Var2;
            x340Var.i0(-1890109383);
            x340Var.r(false);
            w2g0.c(d7e.r(1.0f, u291.h(nim0.a, f2), false), een.h, apo.r(-308401101, new uc60(hd60Var, b2), x340Var), x340Var, 3072, 4);
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new wc60(hd60Var, f, f2, i, (byte) 1);
        }
    }

    public static final void s(Function0 function0, b0k b0kVar, int i) {
        Function0 function1 = function0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1560509524);
        int i2 = i | (x340Var.i(function1) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131952168);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            long j = cbx.a(x340Var).b.a;
            nim0 nim0Var = nim0.a;
            uwo1.e(strO0, u291.f(nim0Var, 1.0f), lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(ydh.g(16.0f, 2131952161, x340Var, x340Var, nim0Var), u291.f(nim0Var, 1.0f), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(ydh.g(16.0f, 2131952162, x340Var, x340Var, nim0Var), u291.f(nim0Var, 1.0f), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            d(2131233232, 0, ydh.g(cbx.b(x340Var).b.a, 2131952167, x340Var, x340Var, nim0Var), cwl1.o0(x340Var, 2131952166), x340Var);
            cvx cvxVar3 = cbx.b(x340Var).b;
            d(2131233221, 0, ydh.g(12.0f, 2131952164, x340Var, x340Var, nim0Var), cwl1.o0(x340Var, 2131952163), x340Var);
            String strG = ydh.g(cbx.b(x340Var).b.a, 2131952165, x340Var, x340Var, nim0Var);
            if (ihc1.y0(strG)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strG), function0);
            ldx ldxVar = ldx.c;
            gdx gdxVarR = yla.r(x340Var);
            j2i j2iVarR = apo.r(1528832491, new zsd1(strG, (byte) 16), x340Var);
            function1 = function0;
            foo1.c(gbxVar, ldxVar, null, null, gdxVarR, null, null, null, null, null, j2iVarR, x340Var, 0, 48, 2012);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h621(function1, i, (byte) 23);
        }
    }

    public static den t(Metadata.ImageGroup imageGroup) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        if (imageGroup == null) {
            return new den();
        }
        Iterator it = imageGroup.getImageList().iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Metadata.Image) next).o() != vij0.b);
        String strW = w((Metadata.Image) next);
        Iterator it2 = imageGroup.getImageList().iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((Metadata.Image) next2).o() != vij0.c);
        String strW2 = w((Metadata.Image) next2);
        Iterator it3 = imageGroup.getImageList().iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (((Metadata.Image) next3).o() != vij0.d);
        String strW3 = w((Metadata.Image) next3);
        for (Object obj2 : imageGroup.getImageList()) {
            if (((Metadata.Image) obj2).o() == vij0.e) {
                obj = obj2;
                break;
            }
        }
        return new den(strW, strW2, strW3, w((Metadata.Image) obj));
    }

    public static final ArrayList u(List list, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!set.contains(((p111) obj).b)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final String v(long j, Context context) {
        Integer[] numArr = {0, 2131963697, 2131963696, 2131963695};
        double d = j;
        int iFloor = (int) Math.floor(Math.log10(d));
        int i = iFloor / 3;
        if (i > 4) {
            hhg1.n("Number is not supported");
            return null;
        }
        if (iFloor < 3 || i >= 4) {
            return String.valueOf(j);
        }
        String string = context.getString(numArr[i].intValue(), new DecimalFormat("#.#").format(d / Math.pow(10.0d, i * 3)));
        string.getClass();
        return string;
    }

    public static String w(Metadata.Image image) {
        return image != null ? y6b1.i(zno1.z(image.n().t())).toString() : "";
    }

    public static PathInterpolator x(Context context) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(2130969992, typedValue, true)) {
            eg.m("Failed to resolve the attribute: 2130969992");
            return null;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(typedValue.resourceId, znz0.c);
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(0, -1.0f);
            float f2 = typedArrayObtainStyledAttributes.getFloat(2, -1.0f);
            float f3 = typedArrayObtainStyledAttributes.getFloat(1, -1.0f);
            float f4 = typedArrayObtainStyledAttributes.getFloat(3, -1.0f);
            if (f == -1.0f || f2 == -1.0f || f3 == -1.0f || f4 == -1.0f) {
                throw new IllegalStateException(String.format(Locale.US, "Incorrectly defined easing curve style. All control points must be set: (%.1f, %.1f, %.1f, %.1f)", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)));
            }
            PathInterpolator pathInterpolator = new PathInterpolator(f, f2, f3, f4);
            typedArrayObtainStyledAttributes.recycle();
            return pathInterpolator;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static final yf y(yf yfVar, b0k b0kVar) {
        ycn0 ycn0Var = ycn0.a;
        boolean z = false;
        x340 x340Var = (x340) b0kVar;
        if (u890.j(yfVar, jdx.c)) {
            x340Var.i0(1840690414);
            boolean zBooleanValue = ((Boolean) rwq.h(ycn0.b, x340Var, 0).getValue()).booleanValue();
            x340Var.r(false);
            z = zBooleanValue;
        } else {
            x340Var.i0(1226829223);
            x340Var.r(false);
        }
        return z ? kdx.c : yfVar;
    }

    public static final byte[] z(List list) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write((byte[]) it.next());
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(byteArrayOutputStream, th);
                throw th2;
            }
        }
    }
}
