package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.text.format.DateFormat;
import android.widget.EdgeEffect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.music.SpotifyMainActivity;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class qon1 {
    public static final Object a = new Object();
    public static b180 b;

    public static final ddm1 A(SceneTemplate.WrappedPlacesContent.GradientStyle gradientStyle, String str) {
        if (gradientStyle == null) {
            return new ddm1(ror0.e(u7h.b, str), 0.55f);
        }
        return new ddm1(ror0.e(u7h.b, gradientStyle.o()), gradientStyle.n());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object B(String str, uu00 uu00Var, String str2, onm onmVar) throws AbortFlowException {
        ttl ttlVar;
        kdz kdzVar;
        String str3;
        if (onmVar instanceof ttl) {
            ttlVar = (ttl) onmVar;
            int i = ttlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttlVar.c = i - Integer.MIN_VALUE;
            } else {
                ttlVar = new ttl(onmVar);
            }
        } else {
            ttlVar = new ttl(onmVar);
        }
        Object objI = ttlVar.b;
        int i2 = ttlVar.c;
        if (i2 == 0) {
            hm5.M(objI);
            ezc ezcVarG = yoi1.g(((zu00) uu00Var).b(new oi(str2, false, new kak(str, (byte) 13))).filter(q9w.T0));
            ttlVar.a = str;
            ttlVar.c = 1;
            objI = b5p1.i(ezcVarG, ttlVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = ttlVar.a;
            hm5.M(objI);
        }
        mdz mdzVar = ((uv00) objI).a(mdz.class, str).b;
        if (mdzVar == null || (kdzVar = mdzVar.d) == null || (str3 = kdzVar.b.e) == null) {
            return null;
        }
        return "feat:readalong:show:".concat(str3);
    }

    public static final xag0 C(q9g0 q9g0Var) {
        ndg0 ndg0Var;
        Date date;
        String str = q9g0Var.a;
        cww0 cww0Var = q9g0Var.b;
        String str2 = cww0Var.a;
        String str3 = cww0Var.b;
        Integer num = cww0Var.c;
        int i = q9g0Var.c;
        boolean z = q9g0Var.d;
        int i2 = q9g0Var.e;
        exr0 exr0Var = q9g0Var.f;
        heg0 odg0Var = null;
        if (exr0Var != null) {
            String str4 = exr0Var.c;
            boolean z2 = exr0Var.a;
            boolean z3 = exr0Var.b;
            try {
                date = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(str4);
            } catch (ParseException e) {
                n57.g("Failed to parse dateOfBirth: ".concat(str4), e);
                date = null;
            }
            ndg0Var = new ndg0(z2, z3, date);
        } else {
            ndg0Var = null;
        }
        e850 e850Var = q9g0Var.g;
        kdg0 kdg0Var = e850Var != null ? new kdg0(e850Var.a) : null;
        i9t0 i9t0Var = q9g0Var.h;
        if (i9t0Var != null) {
            String str5 = i9t0Var.a;
            nn1 nn1Var = i9t0Var.c;
            v7g0 v7g0Var = nn1Var != null ? new v7g0(nn1Var.a) : null;
            z721 z721Var = i9t0Var.b;
            odg0Var = new odg0(str5, v7g0Var, z721Var != null ? new heg0(z721Var.a, z721Var.b) : null);
        }
        return new xag0(str, str2, str3, num, i, z, i2, ndg0Var, kdg0Var, odg0Var, new p9g0(q9g0Var.i.a));
    }

    public static final int D(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return 2;
        }
        if (iC == 1) {
            return 6;
        }
        if (iC == 2) {
            return 1;
        }
        eg.o();
        return 0;
    }

    public static final void a(gbx gbxVar, j2i j2iVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(99700912);
        int i2 = i | (x340Var.i(gbxVar) ? 4 : 2) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            wro1.h(gbxVar, new idx(19), qim0Var, null, yla.s(x340Var), null, false, null, null, j2iVar, x340Var, i2 & 910, 6, 984);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wpg1((Object) gbxVar, (Object) j2iVar, (Object) qim0Var, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096 A[PHI: r6 r8
      0x0096: PHI (r6v17 int) = (r6v5 int), (r6v5 int), (r6v19 int) binds: [B:57:0x00a0, B:51:0x0092, B:52:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x0096: PHI (r8v21 p.qim0) = (r8v4 p.qim0), (r8v2 p.qim0), (r8v2 p.qim0) binds: [B:57:0x00a0, B:51:0x0092, B:52:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:68:0x016e  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0251  */
    /* JADX WARN: Code duplicated, block: B:76:0x0255  */
    /* JADX WARN: Code duplicated, block: B:78:0x029c  */
    /* JADX WARN: Code duplicated, block: B:80:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:83:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void b(String str, String str2, qim0 qim0Var, Locale locale, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        Locale locale2;
        boolean z;
        x340 x340Var;
        qim0 qim0Var3;
        Locale locale3;
        h311 h311VarV;
        int i4;
        qim0 qim0Var4;
        int i5;
        Locale locale4;
        qim0 qim0Var5;
        qim0 qim0Var6;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z2;
        n4k n4kVar;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1889031200);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i3 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.g(str2) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var2.i(qim0Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    locale2 = locale;
                    int i7 = x340Var2.g(locale2) ? 2048 : 1024;
                    i3 |= i7;
                } else {
                    locale2 = locale;
                }
                i3 |= i7;
            } else {
                locale2 = locale;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var2.Y(i3 & 1, z)) {
                x340Var2.d0();
                i4 = i & 1;
                qim0Var4 = nim0.a;
                if (i4 != 0 || x340Var2.E()) {
                    if (i6 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if ((i2 & 8) != 0) {
                        i5 = i3 & (-7169);
                        locale4 = Locale.getDefault();
                        qim0Var5 = qim0Var2;
                    }
                    x340Var2.s();
                    uwr uwrVar = cbx.a;
                    cua cuaVar = cbx.b(x340Var2).f;
                    qim0Var6 = qim0Var5;
                    qim0 qim0VarX = uyn1.x(sto1.o(qim0Var5, 2.0f, er31.b(2.0f), false, 0L, u7h.e, 12), 1.0f);
                    gfh0VarC = t1c.c(een.d, false);
                    iHashCode = Long.hashCode(x340Var2.T);
                    xos0VarM = x340Var2.m();
                    qim0VarE = zr7.E(x340Var2, qim0VarX);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    z2 = x340Var2.S;
                    n4kVar = hmb0.t1;
                    if (z2) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC, x340Var2, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var2, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var2, lljVar3);
                    nko1.F(x340Var2);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var2, lljVar4);
                    qim0 qim0VarN = anm1.N("CalendarTile", sgc1.H(2, u291.x(40.0f, 0.0f, 2, qim0Var4)));
                    cua cuaVar2 = cbx.b(x340Var2).f;
                    qim0 qim0VarQ = i1p1.q(qim0VarN, er31.b(2.0f));
                    long j = u7h.f;
                    cua cuaVar3 = cbx.b(x340Var2).f;
                    qim0 qim0VarF = dug.f(qim0VarQ, j, er31.b(2.0f));
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    qim0 qim0VarZ = uyn1.z(2.0f, 0.0f, 2, dug.f(u291.j(15.0f, 0.0f, 2, u291.f(qim0Var4, 1.0f)), ((vex) zex.a.b).e, d4o1.a));
                    gfh0 gfh0VarC2 = t1c.c(een.h, false);
                    Locale locale5 = locale4;
                    int iHashCode3 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM3 = x340Var2.m();
                    qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarZ);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var2, lljVar);
                    nko1.H(xos0VarM3, x340Var2, lljVar2);
                    x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE3, x340Var2, lljVar4);
                    uwo1.e(str2.toUpperCase(locale5), anm1.N("CalendarMonth", qim0Var4), cbx.d(x340Var2).m, j, null, null, 0, false, new cjc0(1), 0, null, x340Var2, 12582912, 0, 1648);
                    x340Var2.r(true);
                    qim0 qim0VarX2 = uyn1.x(u291.j(25.0f, 0.0f, 2, u291.f(qim0Var4, 1.0f)), 2.0f);
                    gfh0 gfh0VarC3 = t1c.c(een.X, false);
                    int iHashCode4 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM4 = x340Var2.m();
                    qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarX2);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var2, lljVar);
                    nko1.H(xos0VarM4, x340Var2, lljVar2);
                    x0d.q(iHashCode4, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE4, x340Var2, lljVar4);
                    uwo1.e(str, anm1.N("CalendarDate", qim0Var4), cbx.d(x340Var2).h, u7h.b, null, null, 0, false, new cjc0(1), 0, null, x340Var2, (i5 & 14) | 12582912, 0, 1648);
                    x340Var = x340Var2;
                    us71.m(x340Var, true, true, true);
                    locale3 = locale5;
                    qim0Var3 = qim0Var6;
                } else {
                    x340Var2.b0();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                }
                i5 = i3;
                qim0Var5 = qim0Var2;
                locale4 = locale2;
                x340Var2.s();
                uwr uwrVar2 = cbx.a;
                cua cuaVar4 = cbx.b(x340Var2).f;
                qim0Var6 = qim0Var5;
                qim0 qim0VarX3 = uyn1.x(sto1.o(qim0Var5, 2.0f, er31.b(2.0f), false, 0L, u7h.e, 12), 1.0f);
                gfh0VarC = t1c.c(een.d, false);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarX3);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                z2 = x340Var2.S;
                n4kVar = hmb0.t1;
                if (z2) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(gfh0VarC, x340Var2, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var2, lljVar7);
                nko1.F(x340Var2);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar8);
                qim0 qim0VarN2 = anm1.N("CalendarTile", sgc1.H(2, u291.x(40.0f, 0.0f, 2, qim0Var4)));
                cua cuaVar5 = cbx.b(x340Var2).f;
                qim0 qim0VarQ2 = i1p1.q(qim0VarN2, er31.b(2.0f));
                long j2 = u7h.f;
                cua cuaVar6 = cbx.b(x340Var2).f;
                qim0 qim0VarF2 = dug.f(qim0VarQ2, j2, er31.b(2.0f));
                mbh mbhVarA2 = jbh.a(h36.c, een.P0, x340Var2, 0);
                int iHashCode5 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM5 = x340Var2.m();
                qim0 qim0VarE5 = zr7.E(x340Var2, qim0VarF2);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, x340Var2, lljVar5);
                nko1.H(xos0VarM5, x340Var2, lljVar6);
                x0d.q(iHashCode5, x340Var2, lljVar7, x340Var2);
                nko1.H(qim0VarE5, x340Var2, lljVar8);
                qim0 qim0VarZ2 = uyn1.z(2.0f, 0.0f, 2, dug.f(u291.j(15.0f, 0.0f, 2, u291.f(qim0Var4, 1.0f)), ((vex) zex.a.b).e, d4o1.a));
                gfh0 gfh0VarC4 = t1c.c(een.h, false);
                Locale locale6 = locale4;
                int iHashCode6 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM6 = x340Var2.m();
                qim0 qim0VarE6 = zr7.E(x340Var2, qim0VarZ2);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC4, x340Var2, lljVar5);
                nko1.H(xos0VarM6, x340Var2, lljVar6);
                x0d.q(iHashCode6, x340Var2, lljVar7, x340Var2);
                nko1.H(qim0VarE6, x340Var2, lljVar8);
                uwo1.e(str2.toUpperCase(locale6), anm1.N("CalendarMonth", qim0Var4), cbx.d(x340Var2).m, j2, null, null, 0, false, new cjc0(1), 0, null, x340Var2, 12582912, 0, 1648);
                x340Var2.r(true);
                qim0 qim0VarX4 = uyn1.x(u291.j(25.0f, 0.0f, 2, u291.f(qim0Var4, 1.0f)), 2.0f);
                gfh0 gfh0VarC5 = t1c.c(een.X, false);
                int iHashCode7 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM7 = x340Var2.m();
                qim0 qim0VarE7 = zr7.E(x340Var2, qim0VarX4);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC5, x340Var2, lljVar5);
                nko1.H(xos0VarM7, x340Var2, lljVar6);
                x0d.q(iHashCode7, x340Var2, lljVar7, x340Var2);
                nko1.H(qim0VarE7, x340Var2, lljVar8);
                uwo1.e(str, anm1.N("CalendarDate", qim0Var4), cbx.d(x340Var2).h, u7h.b, null, null, 0, false, new cjc0(1), 0, null, x340Var2, (i5 & 14) | 12582912, 0, 1648);
                x340Var = x340Var2;
                us71.m(x340Var, true, true, true);
                locale3 = locale6;
                qim0Var3 = qim0Var6;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var3 = qim0Var2;
                locale3 = locale2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new nj2((Object) str, (Object) str2, qim0Var3, (Object) locale3, i, i2, (byte) 4);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                locale2 = locale;
                if (x340Var2.g(locale2)) {
                }
                i3 |= i7;
            } else {
                locale2 = locale;
            }
            i3 |= i7;
        } else {
            locale2 = locale;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var2.Y(i3 & 1, z)) {
            x340Var2.d0();
            i4 = i & 1;
            qim0Var4 = nim0.a;
            if (i4 != 0) {
                if (i6 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i2 & 8) != 0) {
                    i5 = i3 & (-7169);
                    locale4 = Locale.getDefault();
                    qim0Var5 = qim0Var2;
                } else {
                    i5 = i3;
                    qim0Var5 = qim0Var2;
                    locale4 = locale2;
                }
            } else {
                if (i6 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i2 & 8) != 0) {
                    i5 = i3 & (-7169);
                    locale4 = Locale.getDefault();
                    qim0Var5 = qim0Var2;
                } else {
                    i5 = i3;
                    qim0Var5 = qim0Var2;
                    locale4 = locale2;
                }
            }
            x340Var2.s();
            uwr uwrVar3 = cbx.a;
            cua cuaVar7 = cbx.b(x340Var2).f;
            qim0Var6 = qim0Var5;
            qim0 qim0VarX5 = uyn1.x(sto1.o(qim0Var5, 2.0f, er31.b(2.0f), false, 0L, u7h.e, 12), 1.0f);
            gfh0VarC = t1c.c(een.d, false);
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0VarX5);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            z2 = x340Var2.S;
            n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar9 = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar9);
            llj lljVar10 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar10);
            Integer numValueOf3 = Integer.valueOf(iHashCode);
            llj lljVar11 = y580.R0;
            nko1.H(numValueOf3, x340Var2, lljVar11);
            nko1.F(x340Var2);
            llj lljVar12 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar12);
            qim0 qim0VarN3 = anm1.N("CalendarTile", sgc1.H(2, u291.x(40.0f, 0.0f, 2, qim0Var4)));
            cua cuaVar8 = cbx.b(x340Var2).f;
            qim0 qim0VarQ3 = i1p1.q(qim0VarN3, er31.b(2.0f));
            long j3 = u7h.f;
            cua cuaVar9 = cbx.b(x340Var2).f;
            qim0 qim0VarF3 = dug.f(qim0VarQ3, j3, er31.b(2.0f));
            mbh mbhVarA3 = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode8 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM8 = x340Var2.m();
            qim0 qim0VarE8 = zr7.E(x340Var2, qim0VarF3);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA3, x340Var2, lljVar9);
            nko1.H(xos0VarM8, x340Var2, lljVar10);
            x0d.q(iHashCode8, x340Var2, lljVar11, x340Var2);
            nko1.H(qim0VarE8, x340Var2, lljVar12);
            qim0 qim0VarZ3 = uyn1.z(2.0f, 0.0f, 2, dug.f(u291.j(15.0f, 0.0f, 2, u291.f(qim0Var4, 1.0f)), ((vex) zex.a.b).e, d4o1.a));
            gfh0 gfh0VarC6 = t1c.c(een.h, false);
            Locale locale7 = locale4;
            int iHashCode9 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM9 = x340Var2.m();
            qim0 qim0VarE9 = zr7.E(x340Var2, qim0VarZ3);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC6, x340Var2, lljVar9);
            nko1.H(xos0VarM9, x340Var2, lljVar10);
            x0d.q(iHashCode9, x340Var2, lljVar11, x340Var2);
            nko1.H(qim0VarE9, x340Var2, lljVar12);
            uwo1.e(str2.toUpperCase(locale7), anm1.N("CalendarMonth", qim0Var4), cbx.d(x340Var2).m, j3, null, null, 0, false, new cjc0(1), 0, null, x340Var2, 12582912, 0, 1648);
            x340Var2.r(true);
            qim0 qim0VarX6 = uyn1.x(u291.j(25.0f, 0.0f, 2, u291.f(qim0Var4, 1.0f)), 2.0f);
            gfh0 gfh0VarC7 = t1c.c(een.X, false);
            int iHashCode10 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM10 = x340Var2.m();
            qim0 qim0VarE10 = zr7.E(x340Var2, qim0VarX6);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC7, x340Var2, lljVar9);
            nko1.H(xos0VarM10, x340Var2, lljVar10);
            x0d.q(iHashCode10, x340Var2, lljVar11, x340Var2);
            nko1.H(qim0VarE10, x340Var2, lljVar12);
            uwo1.e(str, anm1.N("CalendarDate", qim0Var4), cbx.d(x340Var2).h, u7h.b, null, null, 0, false, new cjc0(1), 0, null, x340Var2, (i5 & 14) | 12582912, 0, 1648);
            x340Var = x340Var2;
            us71.m(x340Var, true, true, true);
            locale3 = locale7;
            qim0Var3 = qim0Var6;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var3 = qim0Var2;
            locale3 = locale2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nj2((Object) str, (Object) str2, qim0Var3, (Object) locale3, i, i2, (byte) 4);
        }
    }

    public static final h8e0 c(Typeface typeface) {
        return new h8e0(new w4b1(typeface, (byte) 23));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(String str, String str2, String str3, String str4, String str5, int i, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int i3;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3;
        vu30 vu30Var;
        qim0 qim0Var3;
        vu30 vu30Var2;
        int i4;
        Function0 function2;
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(459832280);
        j06 j06Var = ((x340) b0kVar4).a;
        if ((i2 & 6) == 0) {
            i3 = (b0kVar4.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar4.g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar4.g(str3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar4.g(str4) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar4.g(str5) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= b0kVar4.e(i == 0 ? -1 : l1d.C(i)) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= b0kVar4.i(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= b0kVar4.i(function1) ? 8388608 : 4194304;
        }
        int i5 = i3 | 100663296;
        if (b0kVar4.Y(i5 & 1, (38347923 & i5) != 38347922)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarV = u291.v(qim0Var4, 244.0f);
            fra fraVar = een.N0;
            jw31 jw31VarA = ew31.a(h36.g, fraVar, b0kVar4, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar4).T);
            xos0 xos0VarM = b0kVar4.m();
            qim0 qim0VarE = zr7.E(b0kVar4, qim0VarV);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar4.m0();
            boolean z = ((x340) b0kVar4).S;
            Function0 function3 = hmb0.t1;
            if (z) {
                b0kVar4.l(function3);
            } else {
                b0kVar4.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar4, lljVar);
            vu30 vu30Var3 = y580.N0;
            nko1.H(xos0VarM, b0kVar4, vu30Var3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, b0kVar4, lljVar2);
            nko1.F(b0kVar4);
            vu30 vu30Var4 = y580.Y;
            nko1.H(qim0VarE, b0kVar4, vu30Var4);
            if (ihc1.y0(str)) {
                b0kVar3 = b0kVar4;
                vu30Var = vu30Var4;
                qim0Var3 = qim0Var4;
                vu30Var2 = vu30Var3;
                i4 = 0;
                b0kVar3.i0(193373318);
                b0kVar3.r(false);
            } else {
                b0kVar4.i0(192736175);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar4).g;
                qim0 qim0VarR = u291.r(qim0Var4, 40.0f);
                cua cuaVar = cbx.b(b0kVar4).f;
                cr31 cr31VarB = er31.b(2.0f);
                zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                j2i j2iVarR = apo.r(962856398, new dp30(str2, str, function0, (byte) 2), b0kVar4);
                qim0Var3 = qim0Var4;
                i4 = 0;
                vu30Var = vu30Var4;
                vu30Var2 = vu30Var3;
                cwl1.b(qim0VarR, (tl3) null, cr31VarB, (pgx) null, zzq0Var, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, j2iVarR, b0kVar4, 0, 48, 2026);
                b0kVar3 = b0kVar4;
                cvx cvxVar = cbx.b(b0kVar3).b;
                ab80.p(qim0Var3, 8.0f, b0kVar3, false);
            }
            wnb0 wnb0Var = new wnb0(1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, i4);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, wnb0Var);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                function2 = function3;
                b0kVar3.l(function2);
            } else {
                function2 = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01e3: MOVE (r1v5 'function2' kotlin.jvm.functions.Function0) = (r40v3 kotlin.jvm.functions.Function0) (LINE:484) in method: p.qon1.d(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r40v3 kotlin.jvm.functions.Function0
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 918
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.qon1.d(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.qim0, p.b0k, int):void");
            }

            public static final void e(double d, long j, c380 c380Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
                c380 c380Var2;
                qim0 qim0Var2;
                m4c m4cVar = fkj0.X;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(608458388);
                j06 j06Var = x340Var.a;
                int i2 = i | (x340Var.c(d) ? 4 : 2) | (x340Var.f(j) ? 32 : 16) | (x340Var.g(c380Var) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | 24576;
                if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
                    Resources resources = (Resources) x340Var.k(AndroidCompositionLocals_androidKt.c);
                    Locale locale = resources.getConfiguration().getLocales().get(0);
                    String str = String.format(locale, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                    String str2 = NumberFormat.getIntegerInstance(locale).format(j);
                    str2.getClass();
                    int i3 = (int) j;
                    String strF = f4i1.f(resources.getQuantityString(2131820692, i3, str, str2), ". ", o7h.y0(c380Var, ", ", (String) null, (String) null, new ogv(resources, (byte) 2), 30));
                    ven0 ven0VarS = v8r.s(function0, x340Var);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    qim0 qim0Var3 = nim0.a;
                    qim0 qim0VarY = uyn1.y(qim0Var3, 16.0f, 16.0f);
                    boolean zI = x340Var.i(ven0VarS);
                    Object objT = x340Var.T();
                    if (zI || objT == m4cVar) {
                        objT = new p6b(ven0VarS, (byte) 4);
                        x340Var.s0(objT);
                    }
                    qim0 qim0VarB = f8d1.b(qim0VarY, rih1.a, (PointerInputEventHandler) objT);
                    boolean zG = x340Var.g(strF);
                    Object objT2 = x340Var.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new ry40(strF, (byte) 5);
                        x340Var.s0(objT2);
                    }
                    qim0 qim0VarA = s161.a(qim0VarB, (iu30) objT2);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
                    nko1.H(gfh0VarC, x340Var, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var, lljVar3);
                    nko1.F(x340Var);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var, lljVar4);
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    d36 d36Var = new d36(8.0f, true, new um5(false));
                    fra fraVar = een.Z;
                    jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0Var3);
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
                    era eraVar = een.P0;
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    f36 f36Var = h36.c;
                    mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, wnb0Var);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA, x340Var, lljVar);
                    nko1.H(xos0VarM3, x340Var, lljVar2);
                    x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar4);
                    jw31 jw31VarA2 = ew31.a(h36.a, fraVar, x340Var, 0);
                    int iHashCode4 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM4 = x340Var.m();
                    qim0 qim0VarE4 = zr7.E(x340Var, qim0Var3);
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
                    ysx ysxVar = ysx.c;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    w0h1.a(ysxVar, isl.a, u291.r(qim0Var3, 32.0f), 0L, 0L, false, x340Var, ysx.d | 48, 56);
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    uwo1.e(str, null, ktd.l(qim0Var3, 8.0f, x340Var, x340Var).c, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                    x340Var.r(true);
                    cvx cvxVar5 = cbx.b(x340Var).b;
                    uwo1.e(ydh.g(8.0f, 2131956463, x340Var, x340Var, qim0Var3), null, cbx.d(x340Var).k, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
                    cvx cvxVar6 = cbx.b(x340Var).b;
                    op71.g(x340Var, u291.h(qim0Var3, 4.0f));
                    uwo1.e(cwl1.U(2131820691, i3, new Object[]{str2}, x340Var), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                    x340Var = x340Var;
                    x340Var.r(true);
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    wnb0 wnb0Var2 = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
                    int iHashCode5 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM5 = x340Var.m();
                    qim0 qim0VarE5 = zr7.E(x340Var, wnb0Var2);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA2, x340Var, lljVar);
                    nko1.H(xos0VarM5, x340Var, lljVar2);
                    x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
                    c380Var2 = c380Var;
                    Iterator itN = kk0.n(x340Var, qim0VarE5, lljVar4, 1175932234, c380Var2);
                    while (itN.hasNext()) {
                        ad50 ad50Var = (ad50) itN.next();
                        j(ad50Var.c, ad50Var.a, 0, x340Var, null);
                    }
                    x340Var.r(false);
                    x340Var.r(true);
                    x340Var.r(true);
                    x340Var.r(true);
                    qim0Var2 = qim0Var3;
                } else {
                    c380Var2 = c380Var;
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ed50(d, j, c380Var2, function0, qim0Var2, i);
                }
            }

            public static final void f(String str, boolean z, boolean z2, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
                x340 x340Var;
                boolean z3;
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.k0(-2127581184);
                int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.d(0.0f) ? 32 : 16) | (x340Var2.h(z) ? 256 : 128) | (x340Var2.h(z2) ? 2048 : 1024) | (x340Var2.i(function0) ? 16384 : 8192) | (x340Var2.i(function1) ? 131072 : 65536) | (x340Var2.i(qim0Var) ? 1048576 : 524288);
                if (x340Var2.Y(i2 & 1, (599187 & i2) != 599186)) {
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
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
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarN = anm1.N("image", u291.f(nim0Var, 1.0f));
                    gra graVar = een.e;
                    Uri uri = Uri.parse(str);
                    jsl jslVar = new jsl(cwl1.o0(x340Var2, 2131955577));
                    cbx.a.getClass();
                    eso1.e(uri, jslVar, qim0VarN, (p3v) null, (zvx) null, uwr.d(), (j6m) null, graVar, (ColorFilter) null, (qux) null, false, false, x340Var2, 27648, 0, 3904);
                    x340Var = x340Var2;
                    h2c h2cVar = h2c.a;
                    if (z) {
                        x340Var.i0(-1428932985);
                        qim0 qim0VarB = h2cVar.b(nim0Var);
                        Object objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = ppg1.e;
                            x340Var.s0(objT);
                        }
                        qim0 qim0VarQ = exd0.q(qim0VarB, (iu30) objT);
                        z3 = false;
                        t1c.a(qim0VarQ, x340Var, 0);
                        x340Var.r(false);
                    } else {
                        z3 = false;
                        x340Var.i0(-1428759044);
                        x340Var.r(false);
                    }
                    x340Var.i0(-1428566596);
                    x340Var.r(z3);
                    i(z, z2, function0, function1, h2cVar.a(nim0Var, een.Y), x340Var, (i2 >> 6) & 8190);
                    x340Var.r(true);
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new erc(str, z, z2, function0, function1, qim0Var, i);
                }
            }

            public static final void g(qim0 qim0Var, b0k b0kVar, int i) {
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1899904747);
                int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
                if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarN = anm1.N("imagePlaceholder", dug.f(qim0Var, cbx.a(x340Var).a.a.a(), d4o1.a));
                    gfh0 gfh0VarC = t1c.c(een.d, false);
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
                    qim0 qim0VarA = h2c.a.a(nim0.a, een.h);
                    zov0 zov0Var = cbx.b(x340Var).g;
                    w0h1.a(xtx.c, isl.a, u291.r(qim0VarA, 64.0f), 0L, 0L, false, x340Var, xtx.d | 48, 56);
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new wfe1(qim0Var, i, (byte) 9);
                }
            }

            public static final void h(String str, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function1, qim0 qim0Var, idn0 idn0Var, b0k b0kVar, int i) {
                int i2;
                qim0 qim0Var2;
                qim0 qim0Var3;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1518738145);
                if ((i & 6) == 0) {
                    i2 = (x340Var.g(str) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var.d(0.0f) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= x340Var.h(z) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i2 |= x340Var.h(z2) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    i2 |= x340Var.h(z3) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    i2 |= x340Var.i(function0) ? 131072 : 65536;
                }
                if ((1572864 & i) == 0) {
                    i2 |= x340Var.i(function1) ? 1048576 : 524288;
                }
                int i3 = i2 | 12582912;
                if ((100663296 & i) == 0) {
                    i3 |= x340Var.i(idn0Var) ? 67108864 : 33554432;
                }
                int i4 = i3;
                if (x340Var.Y(i4 & 1, (i4 & 38347923) != 38347922)) {
                    x340Var.d0();
                    if ((i & 1) == 0 || x340Var.E()) {
                        qim0Var3 = nim0.a;
                    } else {
                        x340Var.b0();
                        qim0Var3 = qim0Var;
                    }
                    x340Var.s();
                    ven0 ven0VarM = k1u.m(idn0Var, x340Var, (i4 >> 24) & 14);
                    tob1 tob1VarB = z95.b(((Boolean) ven0VarM.getValue()).booleanValue() ? 0.97f : 1.0f, (fe5) null, "scale", (iu30) null, x340Var, 3072, 22);
                    tob1 tob1VarB2 = z95.b(((Boolean) ven0VarM.getValue()).booleanValue() ? 0.8f : 1.0f, (fe5) null, "alpha", (iu30) null, x340Var, 3072, 22);
                    mgx mgxVar = mgx.e;
                    zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    qim0 qim0Var4 = qim0Var3;
                    cwl1.b(qim0Var4, (tl3) null, er31.b(8.0f), mgxVar, zzq0Var, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-1896410154, new xpg1(z3, str, z, z2, function0, function1, tob1VarB, tob1VarB2), x340Var), x340Var, (i4 >> 21) & 14, 48, 2018);
                    qim0Var2 = qim0Var4;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new u96(str, z, z2, z3, function0, function1, qim0Var2, idn0Var, i);
                }
            }

            public static final void i(boolean z, boolean z2, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
                int i2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(794407078);
                if ((i & 6) == 0) {
                    i2 = (x340Var.h(z) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var.h(z2) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= x340Var.i(function0) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i2 |= x340Var.i(function1) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    i2 |= x340Var.i(qim0Var) ? 16384 : 8192;
                }
                if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
                    gfx.b(6, apo.r(-1177900389, new knk0(z, qim0Var, function1, z2, function0), x340Var), x340Var, 54);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new bmg(z, z2, function0, function1, qim0Var, i);
                }
            }

            public static final void j(float f, int i, int i2, b0k b0kVar, qim0 qim0Var) {
                qim0 qim0Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1406542616);
                int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.d(f) ? 32 : 16) | 384;
                if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                    fra fraVar = een.N0;
                    qim0 qim0Var3 = nim0.a;
                    qim0 qim0VarH = u291.h(u291.f(qim0Var3, 1.0f), 18.0f);
                    jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
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
                    nko1.H(jw31VarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    ysx ysxVar = ysx.c;
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    w0h1.a(ysxVar, isl.a, u291.r(qim0Var3, 12.0f), 0L, 0L, false, x340Var, ysx.d | 48, 56);
                    cvx cvxVar = cbx.b(x340Var).b;
                    op71.g(x340Var, u291.v(qim0Var3, 4.0f));
                    uwo1.e(String.valueOf(i), u291.v(qim0Var3, 8.0f), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    qim0Var2 = qim0Var3;
                    tto1.d(f, (i3 >> 3) & 14, 0, cbx.a(x340Var).c.a, ((yex) zex.a.d).e, x340Var, c13.k(qim0Var3, 8.0f, x340Var, 1.0f, true));
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new fd50(i, f, qim0Var2, i2);
                }
            }

            /* JADX WARN: Code duplicated, block: B:39:0x007d  */
            public static final void k(xl41 xl41Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
                int i2;
                qim0 qim0Var2;
                int i3;
                int i4;
                int i5;
                oex oexVar;
                m4c m4cVar = fkj0.X;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(1370577950);
                if ((i & 6) == 0) {
                    i2 = i | (x340Var.i(xl41Var) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var.i(function0) ? 32 : 16;
                }
                int i6 = i2 | 384;
                byte b2 = 1;
                if (x340Var.Y(i6 & 1, (i6 & 147) != 146)) {
                    hm41 hm41Var = xl41Var.b;
                    qim0 qim0Var3 = nim0.a;
                    if (hm41Var == null) {
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new ml41(xl41Var, function0, qim0Var3, i, (byte) 0);
                            return;
                        }
                        return;
                    }
                    xk41 xk41Var = hm41Var.b;
                    boolean z = hm41Var.e;
                    int iC = l1d.C(xk41Var.a);
                    if (iC == 0) {
                        i3 = 1;
                    } else if (iC != 1) {
                        if (iC != 2) {
                            if (iC != 3) {
                                eg.o();
                                return;
                            }
                            i3 = 1;
                        } else if (z) {
                            i3 = 3;
                        } else {
                            i3 = 4;
                        }
                    } else if (z) {
                        i3 = 2;
                    } else {
                        i3 = 4;
                    }
                    int iC2 = l1d.C(i3);
                    if (iC2 == 0) {
                        x340Var.i0(-1365845698);
                        x340Var.r(false);
                        h311 h311VarV2 = x340Var.v();
                        if (h311VarV2 != null) {
                            h311VarV2.d = new ml41(xl41Var, function0, qim0Var3, i, (byte) 2);
                            return;
                        }
                        return;
                    }
                    if (iC2 == 1) {
                        i4 = -1429540750;
                        i5 = 2131961459;
                    } else if (iC2 == 2) {
                        i4 = -1429538125;
                        i5 = 2131961461;
                    } else {
                        if (iC2 != 3) {
                            throw p3d1.k(x340Var, -1429542092, false);
                        }
                        i4 = -1429535469;
                        i5 = 2131961460;
                    }
                    String strK = x0d.k(x340Var, i4, i5, x340Var, false);
                    String strO0 = cwl1.o0(x340Var, 2131961455);
                    uwr uwrVar = cbx.a;
                    long j = cbx.a(x340Var).b.e;
                    if (i3 == 4) {
                        x340Var.i0(-1365643361);
                        boolean zF = x340Var.f(j);
                        Object objT = x340Var.T();
                        if (zF || objT == m4cVar) {
                            objT = new q9j0((byte) 20, j);
                            x340Var.s0(objT);
                        }
                        vu30 vu30Var = (vu30) objT;
                        vu30 vu30Var2 = ((pgx) ogx.e).b;
                        boolean zF2 = x340Var.f(j);
                        Object objT2 = x340Var.T();
                        if (zF2 || objT2 == m4cVar) {
                            objT2 = new q9j0((byte) 21, j);
                            x340Var.s0(objT2);
                        }
                        oexVar = new oex(0, vu30Var, vu30Var2, (vu30) objT2, 1);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-1365446976);
                        x340Var.r(false);
                        oexVar = pex.b;
                    }
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                        return;
                    } else {
                        poo1.e(new gbx(new y50(strO0), function0), oexVar, yoo1.z(x340Var), anm1.N("schedule_chip", qim0Var3), 0, null, xl41Var.c ? new hax(strO0) : jax.a, mej.b, null, null, null, false, null, apo.r(493311481, new nl41(strK, b2), x340Var), x340Var, 12582912, 3072, 7984);
                        qim0Var2 = qim0Var3;
                    }
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV3 = x340Var.v();
                if (h311VarV3 != null) {
                    h311VarV3.d = new ml41(xl41Var, function0, qim0Var2, i, (byte) 1);
                }
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v1 */
            /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r15v7 */
            /* JADX WARN: Type inference failed for: r9v11 */
            /* JADX WARN: Type inference failed for: r9v8 */
            /* JADX WARN: Type inference failed for: r9v9 */
            public static final void l(vpg1 vpg1Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, qim0 qim0Var, idn0 idn0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                int i2;
                Function0 function5;
                Function0 function6;
                x340 x340Var;
                qim0 qim0Var2;
                idn0 idn0Var2;
                idn0 idn0Var3;
                qim0 qim0Var3;
                int i3;
                int i4;
                String strN0;
                int i5;
                String strO0;
                ?? r15;
                x340 x340Var2;
                boolean z;
                qim0 qim0VarThen;
                qim0 qim0VarA;
                Object qi1Var;
                boolean z2;
                qim0 qim0Var4;
                vpg1 vpg1Var2 = vpg1Var;
                String str = vpg1Var2.d;
                String str2 = vpg1Var2.c;
                m4c m4cVar = fkj0.X;
                boolean z3 = vpg1Var2.g;
                boolean z4 = vpg1Var2.i;
                x340 x340Var3 = (x340) b0kVar;
                x340Var3.k0(-1970306399);
                j06 j06Var = x340Var3.a;
                if ((i & 6) == 0) {
                    i2 = (x340Var3.g(vpg1Var2) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var3.i(function0) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    function5 = function1;
                    i2 |= x340Var3.i(function5) ? 256 : 128;
                } else {
                    function5 = function1;
                }
                if ((i & 3072) == 0) {
                    i2 |= x340Var3.i(function2) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    function6 = function3;
                    i2 |= x340Var3.i(function6) ? 16384 : 8192;
                } else {
                    function6 = function3;
                }
                if ((i & 196608) == 0) {
                    i2 |= x340Var3.i(function4) ? 131072 : 65536;
                }
                int i6 = i2 | 1572864;
                if ((i & 12582912) == 0) {
                    i6 = i2 | 5767168;
                }
                if (x340Var3.Y(i6 & 1, (i6 & 4793491) != 4793490)) {
                    x340Var3.d0();
                    int i7 = i & 1;
                    qim0 qim0Var5 = nim0.a;
                    if (i7 == 0 || x340Var3.E()) {
                        Object objT = x340Var3.T();
                        if (objT == m4cVar) {
                            objT = ktd.n(x340Var3);
                        }
                        idn0Var3 = (idn0) objT;
                        qim0Var3 = qim0Var5;
                        i3 = i6 & (-29360129);
                    } else {
                        x340Var3.b0();
                        idn0Var3 = idn0Var;
                        i3 = i6 & (-29360129);
                        qim0Var3 = qim0Var;
                    }
                    x340Var3.s();
                    if (z3) {
                        i4 = 2131959473;
                    } else {
                        i4 = vpg1Var2.a ? 2131959685 : 2131959808;
                    }
                    String strO1 = cwl1.o0(x340Var3, i4);
                    String strO2 = cwl1.o0(x340Var3, 2131962425);
                    if (ihc1.y0(str2)) {
                        x340Var3.i0(1920993199);
                        x340Var3.r(false);
                        strN0 = null;
                    } else {
                        x340Var3.i0(1920896355);
                        strN0 = cwl1.n0(2131952457, new Object[]{str}, x340Var3);
                        x340Var3.r(false);
                    }
                    Function0 function7 = z3 ? function2 : function5;
                    int i8 = vpg1Var2.j;
                    if (i8 == 0) {
                        x340Var3.i0(1921171820);
                        x340Var3.r(false);
                        strO0 = null;
                    } else {
                        x340Var3.i0(1921171821);
                        int iC = l1d.C(i8);
                        if (iC == 0) {
                            i5 = 2131959472;
                        } else {
                            if (iC != 1 && iC != 2) {
                                eg.o();
                                return;
                            }
                            i5 = 2131955840;
                        }
                        strO0 = cwl1.o0(x340Var3, i5);
                        x340Var3.r(false);
                    }
                    x340Var3.i0(616179634);
                    qim0 qim0VarV = u291.v(qim0Var3, 244.0f);
                    qim0 qim0Var6 = qim0Var3;
                    if (!z4) {
                        qim0VarV = qim0VarV.then(d9y0.k(qim0Var5, 0.4f));
                    }
                    if (z4) {
                        Function0 function8 = function7;
                        String str3 = strO0;
                        boolean zG = ((i3 & 458752) == 131072) | ((i3 & 14) == 4) | x340Var3.g(strO0) | x340Var3.g(strO1) | x340Var3.g(function8) | x340Var3.g(strO2) | x340Var3.g(strN0) | ((i3 & 57344) == 16384);
                        Object objT2 = x340Var3.T();
                        if (zG || objT2 == m4cVar) {
                            z2 = false;
                            qim0Var4 = qim0VarV;
                            x340Var2 = x340Var3;
                            vpg1Var2 = vpg1Var;
                            qi1Var = new qi1(vpg1Var2, str3, strO1, strO2, strN0, function8, function4, function6, (byte) 14);
                            x340Var2.s0(qi1Var);
                        } else {
                            qi1Var = objT2;
                            z2 = false;
                            vpg1Var2 = vpg1Var;
                            x340Var2 = x340Var3;
                            qim0Var4 = qim0VarV;
                        }
                        z = true;
                        qim0VarThen = qim0Var4.then(s161.b((qim0) 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0223: INVOKE (r22v7 'qim0VarThen' p.qim0) = 
                              (r12v5 'qim0Var4' p.qim0)
                              (wrap p.qim0:0x021b: INVOKE 
                              (wrap p.qim0:?: CAST (p.qim0) (r22v6 ?? I:??[OBJECT, ARRAY]))
                              true
                              (wrap p.iu30:0x0218: CHECK_CAST (p.iu30) (r0v31 'qi1Var' java.lang.Object))
                             STATIC call: p.s161.b(p.qim0, boolean, p.iu30):p.qim0 A[WRAPPED] (LINE:540))
                             INTERFACE call: p.qim0.then(p.qim0):p.qim0 (LINE:544) in method: p.qon1.l(p.vpg1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.qim0, p.idn0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v6 ??
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 910
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p.qon1.l(p.vpg1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.qim0, p.idn0, p.b0k, int):void");
                    }

                    public static float m(EdgeEffect edgeEffect, float f, float f2, wat watVar) {
                        float f3 = vlv.a;
                        double dH = watVar.h() * 386.0878f * 160.0f * 0.84f;
                        double dAbs = Math.abs(f) * 0.35f;
                        double d = ((double) vlv.a) * dH;
                        if (((float) (Math.exp((vlv.b / vlv.c) * Math.log(dAbs / d)) * d)) > p(edgeEffect) * f2) {
                            return 0.0f;
                        }
                        u(edgeEffect, jch0.U(f));
                        return f;
                    }

                    public static EdgeEffect n(Context context) {
                        return Build.VERSION.SDK_INT >= 31 ? mb4.f(context) : new ew40(context);
                    }

                    public static final c7r0 o(o7r0 o7r0Var, qe41 qe41Var, iac0 iac0Var, bbr0 bbr0Var, Function0 function0, fkk1 fkk1Var, bwn0 bwn0Var, xnn0 xnn0Var) {
                        return o7r0Var instanceof ynn0 ? ((ynn0) o7r0Var).a(qe41Var, iac0Var, bbr0Var, function0, null, fkk1Var, bwn0Var, xnn0Var) : o7r0Var.b(qe41Var, iac0Var, bbr0Var, function0, (String) null, fkk1Var, bwn0Var);
                    }

                    public static float p(EdgeEffect edgeEffect) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            return mb4.p(edgeEffect);
                        }
                        return 0.0f;
                    }

                    public static final b180 q() {
                        b180 b180Var = b;
                        if (b180Var != null) {
                            return b180Var;
                        }
                        a180 a180Var = new a180("Encore.Vector.HomeActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
                        int i = bui1.a;
                        n6a1 n6a1Var = new n6a1(u7h.b);
                        cwh0 cwh0VarG = lf51.g(9.375f, 0.988f);
                        cwh0VarG.c(2.75f, 2.75f, false, false, -2.75f, 0.0f);
                        cwh0VarG.k(-5.25f, 3.03f);
                        cwh0VarG.b(1.75f, 1.75f, false, false, 0.5f, 5.535f);
                        cwh0VarG.v(9.724f);
                        cwh0VarG.g(0.0f, 0.415f, 0.336f, 0.75f, 0.75f, 0.75f);
                        cwh0VarG.i(4.0f);
                        cwh0VarG.c(0.75f, 0.75f, false, false, 0.75f, -0.75f);
                        cwh0VarG.u(10.0f);
                        cwh0VarG.i(4.0f);
                        cwh0VarG.v(5.258f);
                        cwh0VarG.g(0.0f, 0.415f, 0.336f, 0.75f, 0.75f, 0.75f);
                        cwh0VarG.i(4.0f);
                        cwh0VarG.c(0.75f, 0.75f, false, false, 0.75f, -0.75f);
                        cwh0VarG.u(5.534f);
                        cwh0VarG.c(1.75f, 1.75f, false, false, -0.875f, -1.515f);
                        cwh0VarG.e();
                        a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
                        b180 b180VarB = a180Var.b();
                        b = b180VarB;
                        return b180VarB;
                    }

                    public static final int r(n4z n4zVar) {
                        if (n4zVar instanceof i4z) {
                            return 1;
                        }
                        if (n4zVar.equals(k4z.a)) {
                            return 2;
                        }
                        if (n4zVar.equals(l4z.a)) {
                            return 3;
                        }
                        if (!n4zVar.equals(j4z.a) && !n4zVar.equals(m4z.a)) {
                            eg.o();
                        }
                        return 0;
                    }

                    public static void s(SpotifyMainActivity spotifyMainActivity, jgu jguVar) {
                        ((t3b1) spotifyMainActivity).b1 = jguVar;
                    }

                    public static void t(SpotifyMainActivity spotifyMainActivity, tuk tukVar) {
                        ((t3b1) spotifyMainActivity).c1 = tukVar;
                    }

                    public static void u(EdgeEffect edgeEffect, int i) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            edgeEffect.onAbsorb(i);
                        } else if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb(i);
                        }
                    }

                    public static float v(EdgeEffect edgeEffect, float f, float f2) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            return mb4.A(edgeEffect, f, f2);
                        }
                        edgeEffect.onPull(f, f2);
                        return f;
                    }

                    public static void w(EdgeEffect edgeEffect, float f) {
                        if (!(edgeEffect instanceof ew40)) {
                            edgeEffect.onRelease();
                            return;
                        }
                        ew40 ew40Var = (ew40) edgeEffect;
                        float f2 = ew40Var.b + f;
                        ew40Var.b = f2;
                        if (Math.abs(f2) > ew40Var.a) {
                            ew40Var.onRelease();
                        }
                    }

                    public static final moy0 x(op80 op80Var) {
                        g6r0 g6r0VarA = op80Var.a(bj20.V0);
                        if (g6r0VarA != null) {
                            return g6r0VarA.b;
                        }
                        return null;
                    }

                    public static final i6r0 y(op80 op80Var) {
                        g6r0 g6r0VarA = op80Var.a(bj20.V0);
                        if (g6r0VarA != null) {
                            return g6r0VarA.c;
                        }
                        return null;
                    }

                    public static final bxc z(long j, Locale locale, TimeZone timeZone, b0k b0kVar, int i, int i2) {
                        if ((i2 & 2) != 0) {
                            locale = null;
                        }
                        if ((i2 & 4) != 0) {
                            timeZone = null;
                        }
                        x340 x340Var = (x340) b0kVar;
                        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
                        boolean zG = ((((i & 14) ^ 6) > 4 && x340Var.f(j)) || (i & 6) == 4) | x340Var.g(context) | ((((i & 112) ^ 48) > 32 && x340Var.g(locale)) || (i & 48) == 32) | x340Var.g(timeZone);
                        Object objT = x340Var.T();
                        if (zG || objT == fkj0.X) {
                            Date date = new Date(j * 1000);
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM", locale);
                            if (timeZone != null) {
                                simpleDateFormat.setTimeZone(timeZone);
                            }
                            simpleDateFormat.applyPattern("MMM");
                            String str = simpleDateFormat.format(date);
                            simpleDateFormat.applyPattern("dd");
                            String str2 = simpleDateFormat.format(date);
                            simpleDateFormat.applyPattern("E");
                            String str3 = simpleDateFormat.format(date);
                            String bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, "EEE, MMM d");
                            bestDateTimePattern.getClass();
                            simpleDateFormat.applyPattern(bestDateTimePattern);
                            String str4 = simpleDateFormat.format(date);
                            simpleDateFormat.applyPattern("EEE • ".concat(DateFormat.is24HourFormat(context) ? "HH:mm" : "hh:mma"));
                            objT = new bxc(str, str2, str3, str4, nhc1.W(nhc1.W(simpleDateFormat.format(date), "AM", "am"), "PM", "pm"));
                            x340Var.s0(objT);
                        }
                        return (bxc) objT;
                    }
                }
