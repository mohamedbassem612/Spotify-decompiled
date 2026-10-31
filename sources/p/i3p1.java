package p;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.betamax.player.exception.BetamaxException;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.player.esperanto.proto.EsContextPlayerState;
import com.spotify.player.esperanto.proto.EsProvidedTrack;
import defpackage.e;
import java.util.Arrays;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class i3p1 {
    public static b180 a;
    public static b180 b;

    public static final boolean A(lp9 lp9Var) {
        if (!(lp9Var instanceof jp9)) {
            return false;
        }
        int i = ((jp9) lp9Var).c;
        return i == 2 || i == 1;
    }

    public static final boolean B(EsProvidedTrack.ProvidedTrack providedTrack) {
        return Boolean.parseBoolean((String) providedTrack.o().getMetadataMap().get("is_transition_preview"));
    }

    public static final qx81 C(a8b0 a8b0Var) {
        dq20 dq20VarW0 = a8b0Var.w0();
        if (dq20VarW0 instanceof dq20) {
            return dq20VarW0.b;
        }
        if (dq20VarW0 instanceof qx81) {
            return (qx81) dq20VarW0;
        }
        eg.o();
        return null;
    }

    public static final cr31 D(zs00 zs00Var) {
        int iC = l1d.C(zs00Var.b);
        if (iC != 0) {
            if (iC == 1) {
                return er31.a;
            }
            if (iC != 2) {
                eg.o();
                return null;
            }
        }
        return er31.b(8.0f);
    }

    public static final qim0 E(qim0 qim0Var, boolean z, long j) {
        return z ? cwl1.l0(qim0Var, j, (hw61) null, 14) : dug.f(qim0Var, j, d4o1.a);
    }

    public static final float F(b0k b0kVar) {
        float f = ((p3v) ((x340) b0kVar).k(jw80.c)).a;
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        float f2 = (f - 24.0f) / 2.0f;
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final long G(b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i);
        if (iC == 0) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(2048475644);
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.a.c();
            x340Var.r(false);
            return jC;
        }
        if (iC != 1) {
            throw p3d1.k((x340) b0kVar, 2048473151, false);
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(2048478076);
        uwr uwrVar2 = cbx.a;
        long jC2 = cbx.a(x340Var2).a.b.c();
        x340Var2.r(false);
        return jC2;
    }

    public static final int H(iud0 iud0Var) {
        int iOrdinal = iud0Var.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static final qx81 I(a8b0 a8b0Var) {
        dq20 dq20VarW0 = a8b0Var.w0();
        if (dq20VarW0 instanceof dq20) {
            return dq20VarW0.c;
        }
        if (dq20VarW0 instanceof qx81) {
            return (qx81) dq20VarW0;
        }
        eg.o();
        return null;
    }

    public static final void a(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(92643127);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128) | (x340Var.g((Object) null) ? 2048 : 1024);
        if (!x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.b0();
        } else if (str2 == null || ihc1.y0(str2)) {
            x340Var.i0(-1732395689);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            c(((i2 >> 3) & 896) | ((i2 << 3) & 112), str, x340Var, uyn1.z(6.0f, 0.0f, 2, qim0Var));
            x340Var.r(false);
        } else {
            x340Var.i0(-1732189663);
            String strN0 = cwl1.n0(2131951992, new Object[]{str}, x340Var);
            boolean zG = x340Var.g(strN0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new v1(strN0, (byte) 8);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0Var, false, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            Uri uri = Uri.parse(str2);
            uwr uwrVar2 = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarR = d7e.r(1.0f, u291.h(nim0.a, 24.0f), false);
            zov0 zov0Var2 = cbx.b(x340Var).g;
            ebp1.a(uri, qim0VarR, null, new p3v(24.0f), x340Var, 384, 0);
            wnb0 wnb0Var = new wnb0(1.0f, false);
            cvx cvxVar2 = cbx.b(x340Var).b;
            c(((i2 >> 3) & 896) | ((i2 << 3) & 112), str, x340Var, uyn1.z(6.0f, 0.0f, 2, wnb0Var));
            x340Var.r(true);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var, i, (byte) 2);
        }
    }

    public static final void b(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-499886082);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            gfx.b(18, apo.r(-310233239, new x2(qim0Var, er31.b(4.0f), str, str2), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var, i, (byte) 3);
        }
    }

    public static final void c(int i, String str, b0k b0kVar, qim0 qim0Var) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-697398241);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g((Object) null) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(b0kVar3, 2131951993);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).k;
            lee1 lee1Var2 = cbx.d(b0kVar3).j;
            long j = cbx.a(b0kVar3).b.a;
            ye5 ye5Var = new ye5();
            if (str == null || ihc1.y0(str)) {
                ye5Var.g(strO0);
            } else {
                zma1 zma1Var = lee1Var.a;
                int iO = ye5Var.o(new zma1(j, 0L, zma1Var.c, zma1Var.d, (FontSynthesis) null, zma1Var.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65490));
                try {
                    ye5Var.g(str);
                    ye5Var.k(iO);
                    ye5Var.g(" • ");
                    ye5Var.g(strO0);
                } catch (Throwable th) {
                    ye5Var.k(iO);
                    throw th;
                }
            }
            af5 af5VarP = ye5Var.p();
            qim0 qim0VarN = e9k.n(62, qim0Var);
            b0kVar3.i0(-1432888287);
            b0kVar3.r(false);
            b0kVar2 = b0kVar3;
            uwo1.d(af5VarP, j, qim0VarN.then(nim0.a), lee1Var2, new a0e1(5), null, 0, false, new cjc0(1), 0, null, null, b0kVar2, 0, 0, 3808);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new gy0(qim0Var, str, i, (byte) 0);
        }
    }

    public static final void d(zs00 zs00Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0VarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1804728933);
        int i2 = i | (b0kVar3.g(zs00Var) ? 4 : 2) | (b0kVar3.i(qim0Var) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            b0kVar2 = b0kVar3;
            ni7 ni7VarA = oi7.a(Uri.parse(zs00Var.a), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, b0kVar2, 0, 0, 131070);
            as80 as80Var = mif1.P0;
            int iC = l1d.C(zs00Var.b);
            if (iC == 0 || iC == 1) {
                qim0VarR = d7e.r(1.0f, qim0Var, false);
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                qim0VarR = d7e.r(0.6666667f, qim0Var, false);
            }
            eso1.h(ni7VarA, isl.a, i1p1.q(qim0VarR, D(zs00Var)), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, b0kVar2, 224304, 384);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jj50(zs00Var, qim0Var, i, (byte) 17);
        }
    }

    public static final void e(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1725452990);
        int i2 = i | 48;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            af afVarA = ef.c(b0kVar3).a();
            boolean z2 = afVarA.compareTo(af.e) >= 0 && afVarA.compareTo(af.i) <= 0;
            uwr uwrVar = cbx.a;
            long jC = cbx.a(b0kVar3).a.b.c();
            uvx uvxVar = new uvx((pgx) null, 1, (tvx) null, (p3v) null, 26);
            j2i j2iVarR = apo.r(-397494518, new tyg(jC, !z2, z), b0kVar3);
            j2i j2iVarR2 = apo.r(-153957655, new uyg(z, jC, (byte) 0), b0kVar3);
            j2i j2iVarR3 = apo.r(576652934, new uyg(z, jC, (byte) 1), b0kVar3);
            b0kVar2 = b0kVar3;
            qim0Var2 = nim0.a;
            jto1.b(qim0Var2, uvxVar, null, false, null, null, null, null, null, null, null, j2iVarR, j2iVarR2, null, null, j2iVarR3, b0kVar2, 70, 197040, 26620);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0(z, qim0Var2, i, (byte) 5);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:192:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:194:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:196:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:198:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:200:0x02bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:201:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:204:0x0301  */
    /* JADX WARN: Code duplicated, block: B:206:0x0306  */
    /* JADX WARN: Code duplicated, block: B:210:0x030d  */
    /* JADX WARN: Code duplicated, block: B:212:0x0311 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:215:0x0317  */
    /* JADX WARN: Code duplicated, block: B:218:0x0335  */
    /* JADX WARN: Code duplicated, block: B:220:0x0338  */
    /* JADX WARN: Code duplicated, block: B:224:0x033f  */
    /* JADX WARN: Code duplicated, block: B:226:0x0343 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:228:0x0346  */
    /* JADX WARN: Code duplicated, block: B:231:0x0362  */
    /* JADX WARN: Code duplicated, block: B:233:0x0366  */
    /* JADX WARN: Code duplicated, block: B:240:0x0396  */
    /* JADX WARN: Code duplicated, block: B:242:0x0399  */
    /* JADX WARN: Code duplicated, block: B:244:0x039c  */
    /* JADX WARN: Code duplicated, block: B:246:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:248:0x03a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:249:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:252:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:254:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:258:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:260:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:263:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:266:0x040a  */
    /* JADX WARN: Code duplicated, block: B:268:0x040e  */
    /* JADX WARN: Code duplicated, block: B:271:0x0424  */
    /* JADX WARN: Code duplicated, block: B:274:0x0429  */
    /* JADX WARN: Code duplicated, block: B:275:0x042c  */
    /* JADX WARN: Code duplicated, block: B:279:0x0459  */
    /* JADX WARN: Code duplicated, block: B:281:0x045f  */
    /* JADX WARN: Code duplicated, block: B:284:0x0479  */
    /* JADX WARN: Code duplicated, block: B:285:0x047c  */
    /* JADX WARN: Code duplicated, block: B:288:0x04b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:289:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:292:0x0512  */
    /* JADX WARN: Code duplicated, block: B:295:0x0520  */
    /* JADX WARN: Code duplicated, block: B:296:0x0534  */
    /* JADX WARN: Code duplicated, block: B:298:0x055d  */
    /* JADX WARN: Code duplicated, block: B:299:0x0560 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:300:0x0562  */
    /* JADX WARN: Code duplicated, block: B:301:0x0565 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:302:0x0567  */
    /* JADX WARN: Code duplicated, block: B:303:0x056a  */
    /* JADX WARN: Code duplicated, block: B:306:0x0572  */
    /* JADX WARN: Code duplicated, block: B:309:0x0588  */
    /* JADX WARN: Code duplicated, block: B:314:0x05be  */
    /* JADX WARN: Code duplicated, block: B:316:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:318:0x05d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:319:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:320:0x05dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:321:0x05de  */
    /* JADX WARN: Code duplicated, block: B:322:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:325:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:326:0x0600  */
    /* JADX WARN: Code duplicated, block: B:329:0x0606  */
    /* JADX WARN: Code duplicated, block: B:332:0x0630  */
    /* JADX WARN: Code duplicated, block: B:335:0x0649  */
    /* JADX WARN: Code duplicated, block: B:336:0x064c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:337:0x064e  */
    /* JADX WARN: Code duplicated, block: B:338:0x0651 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:339:0x0653  */
    /* JADX WARN: Code duplicated, block: B:340:0x0656  */
    /* JADX WARN: Code duplicated, block: B:342:0x065a  */
    /* JADX WARN: Code duplicated, block: B:343:0x0666  */
    /* JADX WARN: Code duplicated, block: B:345:0x067f  */
    /* JADX WARN: Code duplicated, block: B:346:0x0682 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:347:0x0684  */
    /* JADX WARN: Code duplicated, block: B:348:0x0687 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:349:0x0689  */
    /* JADX WARN: Code duplicated, block: B:350:0x068c  */
    /* JADX WARN: Code duplicated, block: B:352:0x0690  */
    /* JADX WARN: Code duplicated, block: B:353:0x069d  */
    /* JADX WARN: Code duplicated, block: B:355:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:357:0x06bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:358:0x06be  */
    /* JADX WARN: Code duplicated, block: B:359:0x06c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:360:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:361:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:363:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:364:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:367:0x0704  */
    /* JADX WARN: Code duplicated, block: B:369:0x0707  */
    /* JADX WARN: Code duplicated, block: B:371:0x0713  */
    /* JADX WARN: Code duplicated, block: B:375:0x0759  */
    /* JADX WARN: Code duplicated, block: B:378:0x0767 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:379:0x0769  */
    /* JADX WARN: Code duplicated, block: B:381:0x07af  */
    /* JADX WARN: Code duplicated, block: B:383:0x07b9  */
    public static final void f(final int i, final CharSequence charSequence, final vu30 vu30Var, final w5e1 w5e1Var, final xu30 xu30Var, final vu30 vu30Var2, final vu30 vu30Var3, final vu30 vu30Var4, final vu30 vu30Var5, final vu30 vu30Var6, final boolean z, final boolean z2, final boolean z3, final idn0 idn0Var, final vzq0 vzq0Var, final j4e1 j4e1Var, final vu30 vu30Var7, b0k b0kVar, final int i2, final int i3) throws NoWhenBranchMatchedException {
        int i4;
        int i5;
        int i6;
        x340 x340Var;
        tj80 tj80Var;
        long j;
        mhg1 mhg1Var;
        float f;
        int iOrdinal;
        float f2;
        fhg1 fhg1VarO;
        n8b1 n8b1VarW;
        n8b1 n8b1VarW2;
        int iOrdinal2;
        k9 k9Var;
        float f3;
        int iOrdinal3;
        float f4;
        dhg1 dhg1VarF;
        fhg1 fhg1VarO2;
        int iOrdinal4;
        float f5;
        int iOrdinal5;
        tob1 tob1VarO;
        tj80 tj80Var2;
        int[] iArr;
        long j2;
        boolean zG;
        Object objT;
        m4c m4cVar;
        tj80 tj80Var3;
        long j3;
        tj80 tj80Var4;
        long j4;
        fhg1 fhg1VarO3;
        hah hahVarE;
        boolean zG2;
        Object objT2;
        fhg1 fhg1VarO4;
        Object objT3;
        m5e1 m5e1Var;
        byte b2;
        char c;
        lee1 lee1Var;
        j2i j2iVarR;
        long j5;
        Object objT4;
        j2i j2iVar;
        long j6;
        Object objT5;
        tob1 tob1Var;
        boolean z4;
        j2i j2iVar2;
        long j7;
        vu30 vu30Var8;
        long j8;
        vu30 vu30Var9;
        long j9;
        long j10;
        boolean z5;
        vu30 vu30Var10;
        int iC;
        Object objT6;
        ven0 ven0Var;
        boolean z6;
        boolean zG3;
        Object objT7;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(546805032);
        if ((i2 & 6) == 0) {
            i4 = (x340Var2.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 = i4 | (x340Var2.i(charSequence) ? 32 : 16);
        } else {
            i5 = i4;
        }
        if ((i2 & 384) == 0) {
            i5 |= x340Var2.i(vu30Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= x340Var2.g(w5e1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= x340Var2.i(xu30Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= x340Var2.i(vu30Var2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= x340Var2.i(vu30Var3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= x340Var2.i(vu30Var4) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= x340Var2.i(vu30Var5) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= x340Var2.i((Object) null) ? 536870912 : 268435456;
        }
        int i7 = i5;
        if ((i3 & 6) == 0) {
            i6 = i3 | (x340Var2.i(vu30Var6) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= x340Var2.h(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= x340Var2.h(z2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= x340Var2.h(z3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= x340Var2.g(idn0Var) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i6 |= x340Var2.g(vzq0Var) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= x340Var2.g(j4e1Var) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i6 |= x340Var2.i(vu30Var7) ? 8388608 : 4194304;
        }
        int i8 = i6;
        if (x340Var2.Y(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 4793491) == 4793490) ? false : true)) {
            boolean zBooleanValue = ((Boolean) e6p1.g(idn0Var, x340Var2, (i8 >> 12) & 14).getValue()).booleanValue();
            tj80 tj80Var5 = tj80.c;
            tj80 tj80Var6 = tj80.b;
            tj80 tj80Var7 = tj80.a;
            if (zBooleanValue) {
                tj80Var = tj80Var7;
            } else {
                tj80Var = charSequence.length() == 0 ? tj80Var6 : tj80Var5;
            }
            if (!z2) {
                j = j4e1Var.z;
            } else if (z3) {
                j = j4e1Var.A;
            } else {
                j = zBooleanValue ? j4e1Var.x : j4e1Var.y;
            }
            k2h1 k2h1Var = (k2h1) x340Var2.k(o2h1.a);
            lee1 lee1Var2 = k2h1Var.j;
            lee1 lee1Var3 = k2h1Var.l;
            long jC = lee1Var2.c();
            long j11 = u7h.k;
            boolean z7 = (z4h1.b(jC, j11) && !z4h1.b(lee1Var3.c(), j11)) || (!z4h1.b(lee1Var2.c(), j11) && z4h1.b(lee1Var3.c(), j11));
            long jC2 = lee1Var3.c();
            if (z7 && jC2 == 16) {
                jC2 = j;
            }
            long jC3 = lee1Var2.c();
            long j12 = (z7 && jC3 == 16) ? j : jC3;
            boolean z8 = xu30Var != null;
            long j13 = jC2;
            mhg1 mhg1VarY = bno1.y(tj80Var, "TextFieldInputState", x340Var2, 48, 0);
            k9 k9Var2 = mhg1VarY.a;
            hrr0 hrr0Var = mhg1VarY.d;
            n8b1 n8b1VarW3 = t890.w(x340Var2, 2);
            tj80 tj80Var8 = (tj80) k9Var2.P0();
            x340Var2.i0(-1436405362);
            int iOrdinal6 = tj80Var8.ordinal();
            float f6 = 0.0f;
            if (iOrdinal6 != 0) {
                mhg1Var = mhg1VarY;
                if (iOrdinal6 == 1) {
                    if (z8) {
                        f = 0.0f;
                    }
                    x340Var2.r(false);
                    Float fValueOf = Float.valueOf(f);
                    tj80 tj80Var9 = (tj80) hrr0Var.getValue();
                    x340Var2.i0(-1436405362);
                    iOrdinal = tj80Var9.ordinal();
                    if (iOrdinal == 0) {
                        f2 = 1.0f;
                    } else {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                eg.o();
                                return;
                            }
                        } else if (z8) {
                            f2 = 0.0f;
                        }
                        f2 = 1.0f;
                    }
                    x340Var2.r(false);
                    Float fValueOf2 = Float.valueOf(f2);
                    mhg1Var.f();
                    x340Var2.i0(-709912974);
                    x340Var2.r(false);
                    tzg1 tzg1Var = rno1.a;
                    mhg1 mhg1Var2 = mhg1Var;
                    fhg1VarO = bno1.o(mhg1Var2, fValueOf, fValueOf2, n8b1VarW3, tzg1Var, x340Var2, 196608);
                    n8b1VarW = t890.w(x340Var2, 5);
                    n8b1VarW2 = t890.w(x340Var2, 6);
                    tj80 tj80Var10 = (tj80) k9Var2.P0();
                    x340Var2.i0(-1093194547);
                    iOrdinal2 = tj80Var10.ordinal();
                    if (iOrdinal2 != 0) {
                        k9Var = k9Var2;
                        if (iOrdinal2 != 1) {
                            if (z8) {
                            }
                            x340Var2.r(false);
                            Float fValueOf3 = Float.valueOf(f3);
                            tj80 tj80Var11 = (tj80) hrr0Var.getValue();
                            x340Var2.i0(-1093194547);
                            iOrdinal3 = tj80Var11.ordinal();
                            if (iOrdinal3 == 0) {
                                f4 = 1.0f;
                            } else {
                                if (iOrdinal3 != 1) {
                                    if (iOrdinal3 != 2) {
                                        eg.o();
                                        return;
                                    }
                                } else if (z8) {
                                    f4 = 1.0f;
                                }
                                f4 = 0.0f;
                            }
                            x340Var2.r(false);
                            Float fValueOf4 = Float.valueOf(f4);
                            dhg1VarF = mhg1Var2.f();
                            x340Var2.i0(-984009111);
                            if (dhg1VarF.f(tj80Var7, tj80Var6) || (!dhg1VarF.f(tj80Var6, tj80Var7) && !dhg1VarF.f(tj80Var5, tj80Var6))) {
                                n8b1VarW2 = n8b1VarW;
                            }
                            x340Var2.r(false);
                            fhg1VarO2 = bno1.o(mhg1Var2, fValueOf3, fValueOf4, n8b1VarW2, tzg1Var, x340Var2, 196608);
                            tj80 tj80Var12 = (tj80) k9Var.P0();
                            x340Var2.i0(-1258455321);
                            iOrdinal4 = tj80Var12.ordinal();
                            if (iOrdinal4 == 0) {
                                f5 = 1.0f;
                            } else {
                                if (iOrdinal4 != 1) {
                                    if (iOrdinal4 != 2) {
                                        eg.o();
                                        return;
                                    }
                                } else if (z8) {
                                    f5 = 0.0f;
                                }
                                f5 = 1.0f;
                            }
                            x340Var2.r(false);
                            Float fValueOf5 = Float.valueOf(f5);
                            tj80 tj80Var13 = (tj80) hrr0Var.getValue();
                            x340Var2.i0(-1258455321);
                            iOrdinal5 = tj80Var13.ordinal();
                            if (iOrdinal5 == 0) {
                                if (iOrdinal5 != 1) {
                                    if (!z8) {
                                    }
                                    x340Var2.r(false);
                                    Float fValueOf6 = Float.valueOf(f6);
                                    mhg1Var2.f();
                                    x340Var2.i0(2126293195);
                                    x340Var2.r(false);
                                    tob1VarO = bno1.o(mhg1Var2, fValueOf5, fValueOf6, n8b1VarW, tzg1Var, x340Var2, 196608);
                                    n8b1 n8b1VarW4 = t890.w(x340Var2, 5);
                                    tj80Var2 = (tj80) hrr0Var.getValue();
                                    x340Var2.i0(-12973394);
                                    iArr = n5e1.a;
                                    if (iArr[tj80Var2.ordinal()] == 1) {
                                        j2 = j13;
                                    } else {
                                        j2 = j12;
                                    }
                                    x340Var2.r(false);
                                    hah hahVarE2 = u7h.e(j2);
                                    zG = x340Var2.g(hahVarE2);
                                    objT = x340Var2.T();
                                    if (zG) {
                                        m4cVar = m4cVar2;
                                    } else {
                                        m4cVar = m4cVar2;
                                        if (objT == m4cVar) {
                                        }
                                        tzg1 tzg1Var2 = (tzg1) objT;
                                        tj80Var3 = (tj80) k9Var.P0();
                                        x340Var2.i0(-12973394);
                                        if (iArr[tj80Var3.ordinal()] == 1) {
                                            j3 = j13;
                                        } else {
                                            j3 = j12;
                                        }
                                        u7h u7hVarL = p3d1.l(x340Var2, false, j3);
                                        tj80Var4 = (tj80) hrr0Var.getValue();
                                        x340Var2.i0(-12973394);
                                        if (iArr[tj80Var4.ordinal()] == 1) {
                                            j4 = j13;
                                        } else {
                                            j4 = j12;
                                        }
                                        x340Var2.r(false);
                                        u7h u7hVar = new u7h(j4);
                                        mhg1Var2.f();
                                        x340Var2.i0(1954111929);
                                        x340Var2.r(false);
                                        fhg1VarO3 = bno1.o(mhg1Var2, u7hVarL, u7hVar, n8b1VarW4, tzg1Var2, x340Var2, 196608);
                                        x340Var2.i0(-464752477);
                                        x340Var2.r(false);
                                        hahVarE = u7h.e(j);
                                        zG2 = x340Var2.g(hahVarE);
                                        objT2 = x340Var2.T();
                                        if (zG2 || objT2 == m4cVar) {
                                            tzg1 tzg1Var3 = new tzg1(m4h.X0, new syf(hahVarE, (byte) 20));
                                            x340Var2.s0(tzg1Var3);
                                            objT2 = tzg1Var3;
                                        }
                                        tzg1 tzg1Var4 = (tzg1) objT2;
                                        x340Var2.i0(-464752477);
                                        x340Var2.r(false);
                                        u7h u7hVar2 = new u7h(j);
                                        x340Var2.i0(-464752477);
                                        x340Var2.r(false);
                                        u7h u7hVar3 = new u7h(j);
                                        mhg1Var2.f();
                                        x340Var2.i0(1190923886);
                                        x340Var2.r(false);
                                        fhg1VarO4 = bno1.o(mhg1Var2, u7hVar2, u7hVar3, n8b1VarW4, tzg1Var4, x340Var2, 196608);
                                        objT3 = x340Var2.T();
                                        if (objT3 == m4cVar) {
                                            objT3 = new m5e1();
                                            x340Var2.s0(objT3);
                                        }
                                        m5e1Var = (m5e1) objT3;
                                        if (xu30Var == null) {
                                            x340Var2.i0(-1891724857);
                                            x340Var2.r(false);
                                            lee1Var = lee1Var2;
                                            b2 = 2;
                                            j2iVarR = null;
                                            c = 2048;
                                        } else {
                                            x340Var2.i0(-1891724856);
                                            b2 = 2;
                                            c = 2048;
                                            lee1Var = lee1Var2;
                                            j2iVarR = apo.r(-1076580032, new cem0(lee1Var2, lee1Var3, fhg1VarO, fhg1VarO4, z7, fhg1VarO3, xu30Var, m5e1Var), x340Var2);
                                            x340Var2.r(false);
                                        }
                                        if (!z2) {
                                            j5 = j4e1Var.D;
                                        } else if (z3) {
                                            j5 = j4e1Var.E;
                                        } else if (zBooleanValue) {
                                            j5 = j4e1Var.B;
                                        } else {
                                            j5 = j4e1Var.C;
                                        }
                                        objT4 = x340Var2.T();
                                        if (objT4 == m4cVar) {
                                            kcx0 kcx0Var = kcx0.R0;
                                            uy51 uy51Var = new uy51(fhg1VarO2, b2);
                                            yt91 yt91Var = yv91.a;
                                            mdt mdtVar = new mdt(uy51Var, kcx0Var);
                                            x340Var2.s0(mdtVar);
                                            objT4 = mdtVar;
                                        }
                                        tob1 tob1Var2 = (tob1) objT4;
                                        if (vu30Var2 == null && charSequence.length() == 0 && ((Boolean) tob1Var2.getValue()).booleanValue()) {
                                            x340Var2.i0(-1890614312);
                                            j2i j2iVarR2 = apo.r(1405547205, new k5e1(fhg1VarO2, j5, lee1Var, vu30Var2), x340Var2);
                                            x340Var2.r(false);
                                            j2iVar = j2iVarR2;
                                        } else {
                                            x340Var2.i0(-1890217110);
                                            x340Var2.r(false);
                                            j2iVar = null;
                                        }
                                        if (!z2) {
                                            j6 = j4e1Var.L;
                                        } else if (z3) {
                                            j6 = j4e1Var.M;
                                        } else if (zBooleanValue) {
                                            j6 = j4e1Var.J;
                                        } else {
                                            j6 = j4e1Var.K;
                                        }
                                        long j14 = j6;
                                        objT5 = x340Var2.T();
                                        if (objT5 == m4cVar) {
                                            kcx0 kcx0Var2 = kcx0.R0;
                                            tob1Var = tob1VarO;
                                            uy51 uy51Var2 = new uy51(tob1Var, (byte) 3);
                                            yt91 yt91Var2 = yv91.a;
                                            mdt mdtVar2 = new mdt(uy51Var2, kcx0Var2);
                                            x340Var2.s0(mdtVar2);
                                            objT5 = mdtVar2;
                                        } else {
                                            tob1Var = tob1VarO;
                                        }
                                        tob1 tob1Var3 = (tob1) objT5;
                                        if (vu30Var5 == null && ((Boolean) tob1Var3.getValue()).booleanValue()) {
                                            x340Var2.i0(-1889877907);
                                            j2i j2iVarR3 = apo.r(606594655, new l5e1(tob1Var, j14, lee1Var, vu30Var5), x340Var2);
                                            z4 = false;
                                            x340Var2.r(false);
                                            j2iVar2 = j2iVarR3;
                                        } else {
                                            z4 = false;
                                            x340Var2.i0(-1889500886);
                                            x340Var2.r(false);
                                            j2iVar2 = null;
                                        }
                                        x340Var2.i0(-1888924534);
                                        x340Var2.r(z4);
                                        if (!z2) {
                                            j7 = j4e1Var.r;
                                        } else if (z3) {
                                            j7 = j4e1Var.s;
                                        } else if (zBooleanValue) {
                                            j7 = j4e1Var.f15p;
                                        } else {
                                            j7 = j4e1Var.q;
                                        }
                                        if (vu30Var3 == null) {
                                            x340Var2.i0(-1888749663);
                                            x340Var2.r(false);
                                            vu30Var8 = null;
                                        } else {
                                            x340Var2.i0(-1888749662);
                                            vu30 vu30VarR = apo.r(-1736293487, new j5e1(j7, vu30Var3, (byte) 0), x340Var2);
                                            x340Var2.r(false);
                                            vu30Var8 = vu30VarR;
                                        }
                                        if (!z2) {
                                            j8 = j4e1Var.v;
                                        } else if (z3) {
                                            j8 = j4e1Var.w;
                                        } else if (zBooleanValue) {
                                            j8 = j4e1Var.t;
                                        } else {
                                            j8 = j4e1Var.u;
                                        }
                                        if (vu30Var4 == 0) {
                                            x340Var2.i0(-1888469888);
                                            x340Var2.r(false);
                                            vu30Var9 = null;
                                        } else {
                                            x340Var2.i0(-1888469887);
                                            vu30 vu30VarR2 = apo.r(1334518521, new j5e1(j8, vu30Var4, (byte) 1), x340Var2);
                                            x340Var2.r(false);
                                            vu30Var9 = vu30VarR2;
                                        }
                                        if (!z2) {
                                            j9 = j4e1Var.H;
                                        } else if (z3) {
                                            j9 = j4e1Var.I;
                                        } else if (zBooleanValue) {
                                            j9 = j4e1Var.F;
                                        } else {
                                            j9 = j4e1Var.G;
                                        }
                                        j10 = j9;
                                        if (vu30Var6 == null) {
                                            x340Var2.i0(-1888176380);
                                            x340Var2.r(false);
                                            z5 = false;
                                            vu30Var10 = null;
                                        } else {
                                            x340Var2.i0(-1888176379);
                                            z5 = false;
                                            vu30 vu30VarR3 = apo.r(837168720, new gfc(j10, lee1Var3, vu30Var6, (byte) 1), x340Var2);
                                            x340Var2.r(false);
                                            vu30Var10 = vu30VarR3;
                                        }
                                        iC = l1d.C(i);
                                        if (iC != 0) {
                                            x340Var2.i0(-1887830698);
                                            t3p1.r(vu30Var, j2iVarR, j2iVar, vu30Var8, vu30Var9, j2iVar2, null, z, w5e1Var, new o5e1(new i1w(fhg1VarO, tob1.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 15)), apo.r(-1729858187, new bi3(vu30Var7, (byte) 7), x340Var2), vu30Var10, vzq0Var, x340Var2, ((
                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0814: INVOKE 
                                                  (r49v0 'vu30Var' p.vu30)
                                                  (r9v18 'j2iVarR' p.j2i)
                                                  (r15v6 'j2iVar' p.j2i)
                                                  (r8v46 'vu30Var8' p.vu30)
                                                  (r18v9 'vu30Var9' p.vu30)
                                                  (r17v27 'j2iVar2' p.j2i)
                                                  (null p.vu30)
                                                  (r57v0 'z' boolean)
                                                  (r50v0 'w5e1Var' p.w5e1)
                                                  (wrap p.o5e1:0x07ed: CONSTRUCTOR 
                                                  (wrap p.i1w:0x07e6: CONSTRUCTOR 
                                                  (r39v0 'fhg1VarO' p.fhg1)
                                                  (wrap java.lang.Class:0x07e0: CONST_CLASS  A[WRAPPED] (LINE:2017) p.tob1.class)
                                                  ("value")
                                                  ("getValue()Ljava/lang/Object;")
                                                  (0 int)
                                                  (15 byte)
                                                 A[WRAPPED] (LINE:2023) call: p.i1w.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int, byte):void type: CONSTRUCTOR)
                                                 A[WRAPPED] (LINE:2030) call: p.o5e1.<init>(p.bey0):void type: CONSTRUCTOR)
                                                  (wrap p.j2i:0x07d6: INVOKE 
                                                  (-1729858187 int)
                                                  (wrap p.bi3:0x07d0: CONSTRUCTOR (r63v0 'vu30Var7' p.vu30), (7 byte) A[WRAPPED] (LINE:2001) call: p.bi3.<init>(p.vu30, byte):void type: CONSTRUCTOR)
                                                  (r15v1 'x340Var2' p.x340)
                                                 STATIC call: p.apo.r(int, p.cv30, p.b0k):p.j2i A[WRAPPED] (LINE:2007))
                                                  (r19v8 'vu30Var10' p.vu30)
                                                  (r61v0 'vzq0Var' p.vzq0)
                                                  (r15v1 'x340Var2' p.x340)
                                                  (wrap int:0x07ff: ARITH (wrap int:0x07fa: ARITH (wrap int:0x07f4: ARITH (wrap int:0x07f2: ARITH (wrap int:0x07f0: ARITH (r32v1 int) >> (3 int) A[WRAPPED] (LINE:2033)) & (112 int) A[WRAPPED] (LINE:2035)) | (6 int) A[DONT_WRAP, WRAPPED] (LINE:2037)) | (wrap int:0x07f8: ARITH (wrap int:0x07f6: ARITH (r23v1 'i8' int) << (21 int) A[WRAPPED] (LINE:2039)) & (234881024 int) A[WRAPPED] (LINE:2041)) A[DONT_WRAP, WRAPPED] (LINE:2043)) | (wrap int:0x07fd: ARITH (wrap int:0x07fb: ARITH (r32v1 int) << (18 int) A[WRAPPED] (LINE:2044)) & (1879048192 int) A[WRAPPED] (LINE:2046)) A[WRAPPED] (LINE:2048))
                                                  (wrap int:0x0805: ARITH (wrap int:0x0803: ARITH (wrap int:0x0801: ARITH (r23v1 'i8' int) >> (6 int) A[WRAPPED] (LINE:2050)) & (7168 int) A[WRAPPED] (LINE:2052)) | (48 int) A[WRAPPED] (LINE:2054))
                                                 STATIC call: p.t3p1.r(p.vu30, p.vu30, p.xu30, p.vu30, p.vu30, p.vu30, p.vu30, boolean, p.w5e1, p.o5e1, p.j2i, p.vu30, p.vzq0, p.b0k, int, int):void A[MD:(p.vu30, p.vu30, p.xu30, p.vu30, p.vu30, p.vu30, p.vu30, boolean, p.w5e1, p.o5e1, p.j2i, p.vu30, p.vzq0, p.b0k, int, int):void (m)] (LINE:2069) in method: p.i3p1.f(int, java.lang.CharSequence, p.vu30, p.w5e1, p.xu30, p.vu30, p.vu30, p.vu30, p.vu30, p.vu30, boolean, boolean, boolean, p.idn0, p.vzq0, p.j4e1, p.vu30, p.b0k, int, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
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
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
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
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r32v1 int
                                                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                                */
                                            /*
                                                Method dump skipped, instruction units count: 2138
                                                To view this dump change 'Code comments level' option to 'DEBUG'
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: p.i3p1.f(int, java.lang.CharSequence, p.vu30, p.w5e1, p.xu30, p.vu30, p.vu30, p.vu30, p.vu30, p.vu30, boolean, boolean, boolean, p.idn0, p.vzq0, p.j4e1, p.vu30, p.b0k, int, int):void");
                                        }

                                        public static final void g(long j, lee1 lee1Var, vu30 vu30Var, b0k b0kVar, final int i) {
                                            final vu30 vu30Var2;
                                            final lee1 lee1Var2;
                                            final long j2;
                                            x340 x340Var = (x340) b0kVar;
                                            x340Var.k0(396611577);
                                            int i2 = (x340Var.f(j) ? 4 : 2) | i | (x340Var.g(lee1Var) ? 32 : 16);
                                            if ((i & 384) == 0) {
                                                i2 |= x340Var.i(vu30Var) ? 256 : 128;
                                            }
                                            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                                                y2o1.h(j, lee1Var, vu30Var, x340Var, i2 & 1022);
                                                j2 = j;
                                                lee1Var2 = lee1Var;
                                                vu30Var2 = vu30Var;
                                            } else {
                                                vu30Var2 = vu30Var;
                                                lee1Var2 = lee1Var;
                                                j2 = j;
                                                x340Var.b0();
                                            }
                                            h311 h311VarV = x340Var.v();
                                            if (h311VarV != null) {
                                                h311VarV.d = new vu30() { // from class: p.h5e1
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        ((Integer) obj2).getClass();
                                                        i3p1.g(j2, lee1Var2, vu30Var2, (b0k) obj, czo1.p(i | 1));
                                                        return rih1.a;
                                                    }
                                                };
                                            }
                                        }

                                        public static final void h(long j, vu30 vu30Var, b0k b0kVar, int i) {
                                            x340 x340Var = (x340) b0kVar;
                                            x340Var.k0(590397809);
                                            int i2 = (x340Var.f(j) ? 4 : 2) | i | (x340Var.i(vu30Var) ? 32 : 16);
                                            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                                                mod.b(p3d1.o(j, wrl.a), vu30Var, x340Var, (i2 & 112) | 8);
                                            } else {
                                                x340Var.b0();
                                            }
                                            h311 h311VarV = x340Var.v();
                                            if (h311VarV != null) {
                                                h311VarV.d = new ic4(j, vu30Var, i);
                                            }
                                        }

                                        public static final void i(c380 c380Var, qim0 qim0Var, b0k b0kVar, int i) {
                                            x340 x340Var = (x340) b0kVar;
                                            x340Var.k0(1049380297);
                                            int i2 = (x340Var.g(c380Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
                                            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                                                zs00 zs00Var = (zs00) c380Var.get(0);
                                                zs00 zs00Var2 = (zs00) c380Var.get(1);
                                                float fS = s(-6.0f, zs00Var.b);
                                                float fMin = Math.min(0.9f, Math.min(s(12.0f, zs00Var2.b), fS));
                                                wat watVar = (wat) x340Var.k(t4k.h);
                                                Object objT = x340Var.T();
                                                m4c m4cVar = fkj0.X;
                                                if (objT == m4cVar) {
                                                    objT = us71.i(0.0f, x340Var);
                                                }
                                                drr0 drr0Var = (drr0) objT;
                                                Object objT2 = x340Var.T();
                                                if (objT2 == m4cVar) {
                                                    objT2 = us71.i(0.0f, x340Var);
                                                }
                                                drr0 drr0Var2 = (drr0) objT2;
                                                float fX0 = watVar.X0(24.0f);
                                                boolean zI = x340Var.i(drr0Var) | x340Var.i(drr0Var2);
                                                Object objT3 = x340Var.T();
                                                if (zI || objT3 == m4cVar) {
                                                    objT3 = new crf(drr0Var, drr0Var2, (byte) 3);
                                                    x340Var.s0(objT3);
                                                }
                                                qim0 qim0VarU = lrn1.u(qim0Var, (iu30) objT3);
                                                gfh0 gfh0VarC = t1c.c(een.d, false);
                                                int iHashCode = Long.hashCode(x340Var.T);
                                                xos0 xos0VarM = x340Var.m();
                                                qim0 qim0VarE = zr7.E(x340Var, qim0VarU);
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
                                                if (drr0Var.s() <= 0.0f || drr0Var2.s() <= 0.0f) {
                                                    x340Var.i0(-369305377);
                                                    x340Var.r(false);
                                                } else {
                                                    x340Var.i0(-370709398);
                                                    float fR = r(zs00Var, drr0Var.s(), drr0Var2.s(), fS);
                                                    float fR2 = r(zs00Var2, drr0Var.s(), drr0Var2.s(), fMin);
                                                    float fMax = Math.max((fX0 - (((fR2 / fMin) + (fR / fS)) - drr0Var.s())) / 2.0f, 0.0f);
                                                    float fN0 = watVar.N0(fR);
                                                    nim0 nim0Var = nim0.a;
                                                    qim0 qim0VarV = u291.v(nim0Var, fN0);
                                                    gra graVar = een.g;
                                                    h2c h2cVar = h2c.a;
                                                    d(zs00Var, sto1.o(i541.D(eqr0.D(watVar.N0(fMax), 0.0f, 2, lrn1.x(h2cVar.a(qim0VarV, graVar), 1.0f)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, sgc1.u(0.5f, 0.0f), null, false, 0L, 0L, 0, null, 1047295), 8.0f, D(zs00Var), false, 0L, 0L, 28), x340Var, 0);
                                                    d(zs00Var2, i541.D(eqr0.D(-watVar.N0(fMax), 0.0f, 2, lrn1.x(h2cVar.a(u291.v(nim0Var, watVar.N0(fR2)), een.i), 0.0f)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 12.0f, sgc1.u(0.5f, 0.0f), null, false, 0L, 0L, 0, null, 1047295), x340Var, 0);
                                                    x340Var.r(false);
                                                }
                                                x340Var.r(true);
                                            } else {
                                                x340Var.b0();
                                            }
                                            h311 h311VarV = x340Var.v();
                                            if (h311VarV != null) {
                                                h311VarV.d = new e(c380Var, qim0Var, i, (byte) 7);
                                            }
                                        }

                                        public static final void j(long j, long j2, qim0 qim0Var, b0k b0kVar, int i) {
                                            qim0 qim0Var2;
                                            x340 x340Var = (x340) b0kVar;
                                            x340Var.k0(226387975);
                                            int i2 = i | (x340Var.f(j) ? 4 : 2) | (x340Var.f(j2) ? 32 : 16) | 384;
                                            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                                                qim0 qim0Var3 = nim0.a;
                                                i3o1.a(j, j2, qim0Var3, null, 0.0f, false, hhj.b, x340Var, (i2 & 112) | (i2 & 14) | 1572864 | 384, 56);
                                                qim0Var2 = qim0Var3;
                                            } else {
                                                x340Var.b0();
                                                qim0Var2 = qim0Var;
                                            }
                                            h311 h311VarV = x340Var.v();
                                            if (h311VarV != null) {
                                                h311VarV.d = new ts51(j, j2, qim0Var2, i, (byte) 2);
                                            }
                                        }

                                        public static final void k(String str, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
                                            int i2;
                                            qim0 qim0Var2;
                                            x340 x340Var = (x340) b0kVar;
                                            x340Var.k0(627413434);
                                            if ((i & 6) == 0) {
                                                i2 = (x340Var.g(str) ? 4 : 2) | i;
                                            } else {
                                                i2 = i;
                                            }
                                            if ((i & 48) == 0) {
                                                i2 |= x340Var.i(iu30Var) ? 32 : 16;
                                            }
                                            int i3 = i2 | 384;
                                            if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                                                esx esxVar = esx.c;
                                                boolean z = (i3 & 112) == 32;
                                                Object objT = x340Var.T();
                                                if (z || objT == fkj0.X) {
                                                    objT = new fr01(iu30Var, (byte) 28);
                                                    x340Var.s0(objT);
                                                }
                                                fc11.e(str, (Function0) objT, esxVar, x340Var, (i3 & 910) | (esx.d << 9), 0);
                                                qim0Var2 = nim0.a;
                                            } else {
                                                x340Var.b0();
                                                qim0Var2 = qim0Var;
                                            }
                                            h311 h311VarV = x340Var.v();
                                            if (h311VarV != null) {
                                                h311VarV.d = new rgd(str, iu30Var, qim0Var2, i, (byte) 2);
                                            }
                                        }

                                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                                        /* JADX WARN: Code duplicated, block: B:48:0x0140  */
                                        /* JADX WARN: Code duplicated, block: B:50:0x0145  */
                                        public static final void l(bq71 bq71Var, qim0 qim0Var, gm31 gm31Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                                            int i2;
                                            qim0 qim0Var2;
                                            qim0 qim0Var3;
                                            qim0 qim0Var4;
                                            boolean z;
                                            boolean z2;
                                            boolean z3;
                                            String str;
                                            String string;
                                            float f;
                                            gm31 gm31Var2 = gm31Var;
                                            wb71 wb71Var = bq71Var.d;
                                            String str2 = bq71Var.a;
                                            int i3 = bq71Var.f;
                                            x340 x340Var = (x340) b0kVar;
                                            x340Var.k0(-1438041498);
                                            if ((i & 6) == 0) {
                                                i2 = (x340Var.g(bq71Var) ? 4 : 2) | i;
                                            } else {
                                                i2 = i;
                                            }
                                            int i4 = i2 | 48;
                                            if ((i & 384) == 0) {
                                                i4 |= x340Var.i(gm31Var2) ? 256 : 128;
                                            }
                                            int i5 = i4;
                                            boolean z4 = false;
                                            if (x340Var.Y(i5 & 1, (i5 & 147) != 146)) {
                                                qim0 qim0Var5 = nim0.a;
                                                qim0 qim0VarN = anm1.N("share-card-test-tag", u291.z(qim0Var5, (fra) null, 1));
                                                String str3 = bq71Var.c;
                                                zb71 zb71VarL = wro1.L(wb71Var);
                                                qim0 qim0VarI = zb71VarL == null ? qim0VarN : zr7.i(qim0VarN, new tf((Object) str2, (Object) str3, (Object) zb71VarL, z4, (byte) 0));
                                                gfh0 gfh0VarC = t1c.c(een.d, z4);
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
                                                bc71 bc71Var = jb71.a;
                                                if (wb71Var.equals(bc71Var)) {
                                                    x340Var.i0(622657918);
                                                    Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
                                                    blc0[] blc0VarArr = nzy.a;
                                                    Set set = s4b1.f;
                                                    blc0[] blc0VarArr2 = nzy.g;
                                                    if (uic.h(str2, (blc0[]) Arrays.copyOf(blc0VarArr2, blc0VarArr2.length))) {
                                                        string = context.getString(2131962262);
                                                    } else {
                                                        Set set2 = s4b1.f;
                                                        blc0[] blc0VarArr3 = nzy.h;
                                                        if (uic.h(str2, (blc0[]) Arrays.copyOf(blc0VarArr3, blc0VarArr3.length))) {
                                                            string = context.getString(2131962263);
                                                        } else {
                                                            if (nzy.j(str2)) {
                                                                string = context.getString(2131962264);
                                                            } else {
                                                                str = null;
                                                            }
                                                            z = true;
                                                            long jE = z4p1.e(Color.parseColor(String.format("#%06X", Arrays.copyOf(new Object[]{6185314}, 1))));
                                                            long jG = G(x340Var, i3);
                                                            if (str == null) {
                                                                f = 176.0f;
                                                            } else {
                                                                f = 220.0f;
                                                            }
                                                            qim0Var3 = qim0Var5;
                                                            z8p1.g(1, jE, jG, null, null, bq71Var.e, f, 0.0f, null, str, null, null, null, x340Var, 6, 7576);
                                                            x340Var = x340Var;
                                                            x340Var.r(z4);
                                                        }
                                                    }
                                                    str = string;
                                                    z = true;
                                                    long jE2 = z4p1.e(Color.parseColor(String.format("#%06X", Arrays.copyOf(new Object[]{6185314}, 1))));
                                                    long jG2 = G(x340Var, i3);
                                                    if (str == null) {
                                                        f = 176.0f;
                                                    } else {
                                                        f = 220.0f;
                                                    }
                                                    qim0Var3 = qim0Var5;
                                                    z8p1.g(1, jE2, jG2, null, null, bq71Var.e, f, 0.0f, null, str, null, null, null, x340Var, 6, 7576);
                                                    x340Var = x340Var;
                                                    x340Var.r(z4);
                                                } else {
                                                    qim0Var3 = qim0Var5;
                                                    if (wb71Var.equals(lb71.a) || wb71Var.equals(kb71.a)) {
                                                        qim0Var4 = qim0Var3;
                                                        x340Var.i0(851389645);
                                                        z = true;
                                                        j(z4p1.e(Color.parseColor(String.format("#%06X", Arrays.copyOf(new Object[]{6185314}, 1)))), G(x340Var, i3), null, x340Var, 0);
                                                        x340Var = x340Var;
                                                        x340Var.r(false);
                                                    } else if (wb71Var instanceof wb71) {
                                                        x340Var.i0(851397426);
                                                        wb71 wb71Var2 = wb71Var;
                                                        eyo1.b(wb71Var2.d, wb71Var2.c, wb71Var2.e, G(x340Var, i3), null, wb71Var2.g, bq71Var.e, x340Var, 0);
                                                        x340Var = x340Var;
                                                        x340Var.r(z4);
                                                        z = true;
                                                    } else {
                                                        if (wb71Var instanceof yb71) {
                                                            x340Var.i0(623944666);
                                                            yb71 yb71Var = (yb71) wb71Var;
                                                            mb71 mb71Var = yb71Var.c.b;
                                                            if (mb71Var instanceof mb71) {
                                                                x340Var.i0(624021453);
                                                                int i6 = yb71Var.e;
                                                                mb71 mb71Var2 = mb71Var;
                                                                long jE3 = z4p1.e(Color.parseColor(mb71Var2.a));
                                                                long jG3 = G(x340Var, i3);
                                                                String str4 = mb71Var2.b;
                                                                z8p1.g(i6, jE3, jG3, null, yb71Var.g, bq71Var.e, 0.0f, 0.0f, str4 != null ? new u7h(z4p1.e(Color.parseColor(str4))) : null, yb71Var.a, yb71Var.b, yb71Var.d, yb71Var.f, x340Var, 0, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER);
                                                                x340Var = x340Var;
                                                                x340Var.r(z4);
                                                                z3 = z4;
                                                                qim0Var4 = qim0Var3;
                                                                z2 = true;
                                                            } else {
                                                                if (!(mb71Var instanceof nb71) && !(mb71Var instanceof pb71) && !(mb71Var instanceof ob71)) {
                                                                    throw p3d1.k(x340Var, 851411240, z4);
                                                                }
                                                                x340Var.i0(624726610);
                                                                rb71 rb71Var = yb71Var.c;
                                                                long jG4 = G(x340Var, i3);
                                                                Object objT = x340Var.T();
                                                                if (objT == fkj0.X) {
                                                                    objT = da71.R0;
                                                                    x340Var.s0(objT);
                                                                }
                                                                z3 = z4;
                                                                z2 = true;
                                                                wxo1.e(rb71Var, jG4, (Function0) objT, true, qim0Var3, gm31Var, hhj.a, x340Var, 1600896 | ((i5 << 9) & 458752), 0);
                                                                qim0Var4 = qim0Var3;
                                                                gm31Var2 = gm31Var;
                                                                x340Var = x340Var;
                                                                x340Var.r(z3);
                                                            }
                                                            x340Var.r(z3);
                                                        } else {
                                                            z2 = true;
                                                            qim0Var4 = qim0Var3;
                                                            if (!(wb71Var instanceof sb71)) {
                                                                throw p3d1.k(x340Var, 851369752, false);
                                                            }
                                                            x340Var.i0(851449354);
                                                            bc71 bc71Var2 = ((sb71) wb71Var).b;
                                                            l(new bq71(str2, bq71Var.b, bq71Var.c, bc71Var2 != null ? bc71Var2 : bc71Var, bq71Var.e, i3), null, gm31Var2, x340Var, i5 & 896);
                                                            x340Var.r(false);
                                                        }
                                                        z = z2;
                                                    }
                                                    x340Var.r(z);
                                                    qim0Var2 = qim0Var4;
                                                }
                                                qim0Var4 = qim0Var3;
                                                x340Var.r(z);
                                                qim0Var2 = qim0Var4;
                                            } else {
                                                x340Var.b0();
                                                qim0Var2 = qim0Var;
                                            }
                                            h311 h311VarV = x340Var.v();
                                            if (h311VarV != null) {
                                                h311VarV.d = new kk31(bq71Var, qim0Var2, gm31Var2, false, i, (byte) 22);
                                            }
                                        }

                                        /* JADX WARN: Code duplicated, block: B:37:0x0064  */
                                        /* JADX WARN: Code duplicated, block: B:39:0x0069  */
                                        /* JADX WARN: Code duplicated, block: B:41:0x006d  */
                                        /* JADX WARN: Code duplicated, block: B:43:0x0075  */
                                        /* JADX WARN: Code duplicated, block: B:44:0x0078  */
                                        /* JADX WARN: Code duplicated, block: B:48:0x0084  */
                                        /* JADX WARN: Code duplicated, block: B:49:0x0086  */
                                        /* JADX WARN: Code duplicated, block: B:52:0x008f A[DONT_INVERT] */
                                        /* JADX WARN: Code duplicated, block: B:53:0x0091  */
                                        /* JADX WARN: Code duplicated, block: B:55:0x0094  */
                                        /* JADX WARN: Code duplicated, block: B:56:0x0096  */
                                        /* JADX WARN: Code duplicated, block: B:59:0x00ca  */
                                        /* JADX WARN: Code duplicated, block: B:61:0x00d1  */
                                        /* JADX WARN: Code duplicated, block: B:62:0x00d7  */
                                        /* JADX WARN: Code duplicated, block: B:65:0x014c  */
                                        /* JADX WARN: Code duplicated, block: B:66:0x014e  */
                                        /* JADX WARN: Code duplicated, block: B:69:0x0155 A[ADDED_TO_REGION] */
                                        /* JADX WARN: Code duplicated, block: B:72:0x015a  */
                                        /* JADX WARN: Code duplicated, block: B:75:0x019f A[ADDED_TO_REGION] */
                                        /* JADX WARN: Code duplicated, block: B:85:0x01fc  */
                                        /* JADX WARN: Code duplicated, block: B:87:0x020b  */
                                        /* JADX WARN: Code duplicated, block: B:89:0x020f  */
                                        /* JADX WARN: Code duplicated, block: B:92:0x021c  */
                                        /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
                                        public static final void m(String str, String str2, Function0 function0, String str3, Function0 function1, b0k b0kVar, int i, int i2) {
                                            int i3;
                                            String str4;
                                            int i4;
                                            int i5;
                                            boolean z;
                                            x340 x340Var;
                                            Function0 function2;
                                            String str5;
                                            h311 h311VarV;
                                            Function0 function3;
                                            nim0 nim0Var;
                                            mbh mbhVarA;
                                            int iHashCode;
                                            xos0 xos0VarM;
                                            qim0 qim0VarE;
                                            String str6;
                                            boolean z2;
                                            Object objT;
                                            boolean z3;
                                            m4c m4cVar = fkj0.X;
                                            x340 x340Var2 = (x340) b0kVar;
                                            x340Var2.k0(344566154);
                                            if ((i & 6) == 0) {
                                                i3 = (x340Var2.g(str) ? 4 : 2) | i;
                                            } else {
                                                i3 = i;
                                            }
                                            if ((i & 48) == 0) {
                                                i3 |= x340Var2.g(str2) ? 32 : 16;
                                            }
                                            if ((i & 384) == 0) {
                                                i3 |= x340Var2.i(function0) ? 256 : 128;
                                            }
                                            int i6 = i2 & 8;
                                            if (i6 == 0) {
                                                if ((i & 3072) == 0) {
                                                    str4 = str3;
                                                    i3 |= x340Var2.g(str4) ? 2048 : 1024;
                                                }
                                                i4 = i2 & 16;
                                                if (i4 != 0) {
                                                    if ((i & 24576) == 0) {
                                                        if (x340Var2.i(function1)) {
                                                            i5 = 16384;
                                                        } else {
                                                            i5 = 8192;
                                                        }
                                                        i3 |= i5;
                                                    }
                                                    if ((i3 & 9363) != 9362) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (x340Var2.Y(i3 & 1, z)) {
                                                        if (i6 != 0) {
                                                            str4 = null;
                                                        }
                                                        if (i4 != 0) {
                                                            function3 = null;
                                                        } else {
                                                            function3 = function1;
                                                        }
                                                        era eraVar = een.Q0;
                                                        uwr uwrVar = cbx.a;
                                                        float f = cbx.b(x340Var2).b.f;
                                                        nim0Var = nim0.a;
                                                        qim0 qim0VarZ = uyn1.z(f, 0.0f, 2, nim0Var);
                                                        mbhVarA = jbh.a(h36.c, eraVar, x340Var2, 0);
                                                        iHashCode = Long.hashCode(x340Var2.T);
                                                        xos0VarM = x340Var2.m();
                                                        qim0VarE = zr7.E(x340Var2, qim0VarZ);
                                                        hzj.A.getClass();
                                                        if (x340Var2.a != null) {
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
                                                        str6 = str4;
                                                        function2 = function3;
                                                        uwo1.e(str, null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var2, i3 & 14, 0, 2018);
                                                        cvx cvxVar = cbx.b(x340Var2).b;
                                                        op71.g(x340Var2, u291.h(nim0Var, 16.0f));
                                                        if ((i3 & 896) == 256) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        objT = x340Var2.T();
                                                        if (!z2 || objT == m4cVar) {
                                                            z3 = true;
                                                            objT = new tpj1(function0, (byte) 1);
                                                            x340Var2.s0(objT);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        boolean z4 = z3;
                                                        foo1.c(new gbx(new y50(str2), (Function0) objT), jdx.c, null, null, yla.s(x340Var2), null, null, null, null, null, apo.r(-1994649227, new zsd1(str2, (byte) 23), x340Var2), x340Var2, 0, 48, 2012);
                                                        x340Var = x340Var2;
                                                        if (str6 != null || function2 == null) {
                                                            x340Var.i0(-1403263090);
                                                            x340Var.r(false);
                                                        } else {
                                                            x340Var.i0(-1403526404);
                                                            boolean z5 = (i3 & 57344) == 16384 ? z4 : false;
                                                            Object objT2 = x340Var.T();
                                                            if (z5 || objT2 == m4cVar) {
                                                                objT2 = new tpj1(function2, (byte) 2);
                                                                x340Var.s0(objT2);
                                                            }
                                                            foo1.c(new gbx(new y50(str6), (Function0) objT2), ldx.c, null, null, yla.s(x340Var), null, null, null, null, null, apo.r(167398074, new zsd1(str6, (byte) 24), x340Var), x340Var, 0, 48, 2012);
                                                            x340Var = x340Var;
                                                            x340Var.r(false);
                                                        }
                                                        x340Var.r(z4);
                                                        str5 = str6;
                                                    } else {
                                                        x340Var = x340Var2;
                                                        x340Var.b0();
                                                        function2 = function1;
                                                        str5 = str4;
                                                    }
                                                    h311VarV = x340Var.v();
                                                    if (h311VarV != null) {
                                                        h311VarV.d = new j90(str, str2, function0, str5, function2, i, i2, (byte) 18);
                                                    }
                                                }
                                                i3 |= 24576;
                                                if ((i3 & 9363) != 9362) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                if (x340Var2.Y(i3 & 1, z)) {
                                                    if (i6 != 0) {
                                                        str4 = null;
                                                    }
                                                    if (i4 != 0) {
                                                        function3 = null;
                                                    } else {
                                                        function3 = function1;
                                                    }
                                                    era eraVar2 = een.Q0;
                                                    uwr uwrVar2 = cbx.a;
                                                    float f2 = cbx.b(x340Var2).b.f;
                                                    nim0Var = nim0.a;
                                                    qim0 qim0VarZ2 = uyn1.z(f2, 0.0f, 2, nim0Var);
                                                    mbhVarA = jbh.a(h36.c, eraVar2, x340Var2, 0);
                                                    iHashCode = Long.hashCode(x340Var2.T);
                                                    xos0VarM = x340Var2.m();
                                                    qim0VarE = zr7.E(x340Var2, qim0VarZ2);
                                                    hzj.A.getClass();
                                                    if (x340Var2.a != null) {
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
                                                    str6 = str4;
                                                    function2 = function3;
                                                    uwo1.e(str, null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var2, i3 & 14, 0, 2018);
                                                    cvx cvxVar2 = cbx.b(x340Var2).b;
                                                    op71.g(x340Var2, u291.h(nim0Var, 16.0f));
                                                    if ((i3 & 896) == 256) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    objT = x340Var2.T();
                                                    if (z2) {
                                                        z3 = true;
                                                        objT = new tpj1(function0, (byte) 1);
                                                        x340Var2.s0(objT);
                                                    } else {
                                                        z3 = true;
                                                        objT = new tpj1(function0, (byte) 1);
                                                        x340Var2.s0(objT);
                                                    }
                                                    boolean z6 = z3;
                                                    foo1.c(new gbx(new y50(str2), (Function0) objT), jdx.c, null, null, yla.s(x340Var2), null, null, null, null, null, apo.r(-1994649227, new zsd1(str2, (byte) 23), x340Var2), x340Var2, 0, 48, 2012);
                                                    x340Var = x340Var2;
                                                    if (str6 != null) {
                                                        x340Var.i0(-1403263090);
                                                        x340Var.r(false);
                                                    } else {
                                                        x340Var.i0(-1403263090);
                                                        x340Var.r(false);
                                                    }
                                                    x340Var.r(z6);
                                                    str5 = str6;
                                                } else {
                                                    x340Var = x340Var2;
                                                    x340Var.b0();
                                                    function2 = function1;
                                                    str5 = str4;
                                                }
                                                h311VarV = x340Var.v();
                                                if (h311VarV != null) {
                                                    h311VarV.d = new j90(str, str2, function0, str5, function2, i, i2, (byte) 18);
                                                }
                                            }
                                            i3 |= 3072;
                                            str4 = str3;
                                            i4 = i2 & 16;
                                            if (i4 != 0) {
                                                if ((i & 24576) == 0) {
                                                    if (x340Var2.i(function1)) {
                                                        i5 = 16384;
                                                    } else {
                                                        i5 = 8192;
                                                    }
                                                    i3 |= i5;
                                                }
                                                if ((i3 & 9363) != 9362) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                if (x340Var2.Y(i3 & 1, z)) {
                                                    if (i6 != 0) {
                                                        str4 = null;
                                                    }
                                                    if (i4 != 0) {
                                                        function3 = null;
                                                    } else {
                                                        function3 = function1;
                                                    }
                                                    era eraVar3 = een.Q0;
                                                    uwr uwrVar3 = cbx.a;
                                                    float f3 = cbx.b(x340Var2).b.f;
                                                    nim0Var = nim0.a;
                                                    qim0 qim0VarZ3 = uyn1.z(f3, 0.0f, 2, nim0Var);
                                                    mbhVarA = jbh.a(h36.c, eraVar3, x340Var2, 0);
                                                    iHashCode = Long.hashCode(x340Var2.T);
                                                    xos0VarM = x340Var2.m();
                                                    qim0VarE = zr7.E(x340Var2, qim0VarZ3);
                                                    hzj.A.getClass();
                                                    if (x340Var2.a != null) {
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
                                                    str6 = str4;
                                                    function2 = function3;
                                                    uwo1.e(str, null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var2, i3 & 14, 0, 2018);
                                                    cvx cvxVar3 = cbx.b(x340Var2).b;
                                                    op71.g(x340Var2, u291.h(nim0Var, 16.0f));
                                                    if ((i3 & 896) == 256) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    objT = x340Var2.T();
                                                    if (z2) {
                                                        z3 = true;
                                                        objT = new tpj1(function0, (byte) 1);
                                                        x340Var2.s0(objT);
                                                    } else {
                                                        z3 = true;
                                                        objT = new tpj1(function0, (byte) 1);
                                                        x340Var2.s0(objT);
                                                    }
                                                    boolean z7 = z3;
                                                    foo1.c(new gbx(new y50(str2), (Function0) objT), jdx.c, null, null, yla.s(x340Var2), null, null, null, null, null, apo.r(-1994649227, new zsd1(str2, (byte) 23), x340Var2), x340Var2, 0, 48, 2012);
                                                    x340Var = x340Var2;
                                                    if (str6 != null) {
                                                        x340Var.i0(-1403263090);
                                                        x340Var.r(false);
                                                    } else {
                                                        x340Var.i0(-1403263090);
                                                        x340Var.r(false);
                                                    }
                                                    x340Var.r(z7);
                                                    str5 = str6;
                                                } else {
                                                    x340Var = x340Var2;
                                                    x340Var.b0();
                                                    function2 = function1;
                                                    str5 = str4;
                                                }
                                                h311VarV = x340Var.v();
                                                if (h311VarV != null) {
                                                    h311VarV.d = new j90(str, str2, function0, str5, function2, i, i2, (byte) 18);
                                                }
                                            }
                                            i3 |= 24576;
                                            if ((i3 & 9363) != 9362) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (x340Var2.Y(i3 & 1, z)) {
                                                if (i6 != 0) {
                                                    str4 = null;
                                                }
                                                if (i4 != 0) {
                                                    function3 = null;
                                                } else {
                                                    function3 = function1;
                                                }
                                                era eraVar4 = een.Q0;
                                                uwr uwrVar4 = cbx.a;
                                                float f4 = cbx.b(x340Var2).b.f;
                                                nim0Var = nim0.a;
                                                qim0 qim0VarZ4 = uyn1.z(f4, 0.0f, 2, nim0Var);
                                                mbhVarA = jbh.a(h36.c, eraVar4, x340Var2, 0);
                                                iHashCode = Long.hashCode(x340Var2.T);
                                                xos0VarM = x340Var2.m();
                                                qim0VarE = zr7.E(x340Var2, qim0VarZ4);
                                                hzj.A.getClass();
                                                if (x340Var2.a != null) {
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
                                                str6 = str4;
                                                function2 = function3;
                                                uwo1.e(str, null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var2, i3 & 14, 0, 2018);
                                                cvx cvxVar4 = cbx.b(x340Var2).b;
                                                op71.g(x340Var2, u291.h(nim0Var, 16.0f));
                                                if ((i3 & 896) == 256) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                objT = x340Var2.T();
                                                if (z2) {
                                                    z3 = true;
                                                    objT = new tpj1(function0, (byte) 1);
                                                    x340Var2.s0(objT);
                                                } else {
                                                    z3 = true;
                                                    objT = new tpj1(function0, (byte) 1);
                                                    x340Var2.s0(objT);
                                                }
                                                boolean z8 = z3;
                                                foo1.c(new gbx(new y50(str2), (Function0) objT), jdx.c, null, null, yla.s(x340Var2), null, null, null, null, null, apo.r(-1994649227, new zsd1(str2, (byte) 23), x340Var2), x340Var2, 0, 48, 2012);
                                                x340Var = x340Var2;
                                                if (str6 != null) {
                                                    x340Var.i0(-1403263090);
                                                    x340Var.r(false);
                                                } else {
                                                    x340Var.i0(-1403263090);
                                                    x340Var.r(false);
                                                }
                                                x340Var.r(z8);
                                                str5 = str6;
                                            } else {
                                                x340Var = x340Var2;
                                                x340Var.b0();
                                                function2 = function1;
                                                str5 = str4;
                                            }
                                            h311VarV = x340Var.v();
                                            if (h311VarV != null) {
                                                h311VarV.d = new j90(str, str2, function0, str5, function2, i, i2, (byte) 18);
                                            }
                                        }

                                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                                        public static final void n(l090 l090Var, Function0 function0, Function0 function1, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                                            x340 x340Var = (x340) b0kVar;
                                            x340Var.k0(1627950074);
                                            int i2 = i | (x340Var.g(l090Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
                                            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                                                qim0 qim0VarD = u291.d(nim0.a, 1.0f);
                                                uwr uwrVar = cbx.a;
                                                qim0 qim0VarF = dug.f(qim0VarD, ((vex) zex.a.e).d, d4o1.a);
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
                                                if (l090Var instanceof k090) {
                                                    x340Var.i0(-1586577040);
                                                    m(cwl1.n0(2131963761, new Object[]{((k090) l090Var).b}, x340Var), cwl1.o0(x340Var, 2131963760), function0, null, null, x340Var, (i2 << 3) & 896, 24);
                                                    x340Var.r(false);
                                                } else {
                                                    if (!(l090Var instanceof j090)) {
                                                        throw p3d1.k(x340Var, -1586578939, false);
                                                    }
                                                    x340Var.i0(-1586566855);
                                                    m(cwl1.o0(x340Var, 2131963763), cwl1.o0(x340Var, 2131963762), function0, cwl1.o0(x340Var, 2131963764), function1, x340Var, ((i2 << 3) & 896) | ((i2 << 6) & 57344), 0);
                                                    x340Var.r(false);
                                                }
                                                x340Var.r(true);
                                            } else {
                                                x340Var.b0();
                                            }
                                            h311 h311VarV = x340Var.v();
                                            if (h311VarV != null) {
                                                h311VarV.d = new pej1(l090Var, function0, function1, i, (byte) 4);
                                            }
                                        }

                                        public static final boolean o(EsContextPlayerState.ContextPlayerState contextPlayerState) {
                                            return contextPlayerState.x() && !contextPlayerState.y() && B(contextPlayerState.S());
                                        }

                                        public static final boolean p(EsContextPlayerState.ContextPlayerState contextPlayerState) {
                                            String uid = contextPlayerState.S().o().getUid();
                                            if (z(contextPlayerState) && B(contextPlayerState.S())) {
                                                if (u890.j(uid, "preview_1")) {
                                                    return true;
                                                }
                                                uid.getClass();
                                                if (nhc1.Y(uid, "automix_preview_a_", false)) {
                                                    return true;
                                                }
                                            }
                                            return false;
                                        }

                                        public static final boolean q(EsContextPlayerState.ContextPlayerState contextPlayerState) {
                                            return z(contextPlayerState) && B(contextPlayerState.S());
                                        }

                                        public static final float r(zs00 zs00Var, float f, float f2, float f3) {
                                            float f4 = f2 * 1.0f * f3;
                                            float f5 = f * 0.6f * f3;
                                            int iC = l1d.C(zs00Var.b);
                                            if (iC == 0 || iC == 1) {
                                                return f5;
                                            }
                                            if (iC == 2) {
                                                return (f4 * 2.0f) / 3.0f;
                                            }
                                            eg.o();
                                            return 0.0f;
                                        }

                                        public static final float s(float f, int i) {
                                            if (i == 2) {
                                                return 1.0f;
                                            }
                                            float f2 = i == 1 ? 0.6f : 1.0f;
                                            double radians = Math.toRadians(f);
                                            double d = f2;
                                            return (float) Math.min(0.6000000238418579d / (Math.abs(Math.sin(radians) * d) + Math.abs(Math.cos(radians) * 0.6000000238418579d)), d / (Math.abs(Math.cos(radians) * d) + Math.abs(Math.sin(radians) * 0.6000000238418579d)));
                                        }

                                        public static final String t(jh5 jh5Var) {
                                            String strConcat;
                                            String name = jh5Var.a.a().getName();
                                            Object obj = jh5Var.b;
                                            if (obj instanceof String) {
                                                strConcat = nhc1.Y((String) obj, "spotify:", false) ? o7h.y0(o7h.d1(ihc1.P0((CharSequence) obj, new char[]{':'}, 6), 2), ":", (String) null, (String) null, (iu30) null, 62).concat(":<redacted>") : "<redacted>";
                                            } else {
                                                strConcat = obj.getClass().getName();
                                            }
                                            return gvg.h("table=", name, " key=", strConcat);
                                        }

                                        public static final String u(yyq yyqVar) {
                                            if (yyqVar instanceof uyq) {
                                                return o7h.y0(((uyq) yyqVar).a, (CharSequence) null, "Combined[", "]", ywq.N0, 25);
                                            }
                                            if (yyqVar instanceof vyq) {
                                                return f4i1.f("NoSource(", t(((vyq) yyqVar).a), ")");
                                            }
                                            if (yyqVar instanceof wyq) {
                                                wyq wyqVar = (wyq) yyqVar;
                                                return cy30.p("SourceFailure(", t(wyqVar.a), " error=", wyqVar.b.getClass().getName(), ")");
                                            }
                                            if (!(yyqVar instanceof xyq)) {
                                                eg.o();
                                                return null;
                                            }
                                            xyq xyqVar = (xyq) yyqVar;
                                            String strT = t(xyqVar.a);
                                            Object obj = xyqVar.b;
                                            return cy30.p("UnexpectedValue(", strT, " value=", obj != null ? obj.getClass().getName() : null, ")");
                                        }

                                        public static final String v(k1r k1rVar) {
                                            if (k1rVar instanceof i1r) {
                                                return "Loaded";
                                            }
                                            if (k1rVar instanceof j1r) {
                                                return "NotReady";
                                            }
                                            if (k1rVar instanceof h1r) {
                                                return f4i1.f("Failure(", u(((h1r) k1rVar).a), ")");
                                            }
                                            eg.o();
                                            return null;
                                        }

                                        public static final String w(k3r k3rVar) {
                                            if (k3rVar instanceof j3r) {
                                                return "Success";
                                            }
                                            if (k3rVar instanceof i3r) {
                                                return "NotReady";
                                            }
                                            if (k3rVar instanceof h3r) {
                                                return f4i1.f("Failure(", ((h3r) k3rVar).a.getClass().getName(), ")");
                                            }
                                            eg.o();
                                            return null;
                                        }

                                        public static final xau0 x(BetamaxException betamaxException, m0u0 m0u0Var) {
                                            String str;
                                            String strR = c2p1.r(m0u0Var);
                                            String str2 = (String) m0u0Var.a.d.get("playback_id");
                                            int iOrdinal = betamaxException.a.ordinal();
                                            if (iOrdinal != 16 && iOrdinal != 18) {
                                                switch (iOrdinal) {
                                                    case 1:
                                                        str = "video_georestricted";
                                                        break;
                                                    case 2:
                                                        str = "video_unsupported_platform_version";
                                                        break;
                                                    case 3:
                                                        str = "video_unsupported_client_version";
                                                        break;
                                                    case 4:
                                                        str = "track_unavailable_offline";
                                                        break;
                                                    case 5:
                                                        str = "video_manifest_deleted";
                                                        break;
                                                    case 6:
                                                        str = "video_country_restricted";
                                                        break;
                                                    case 7:
                                                        str = "video_unavailable";
                                                        break;
                                                    case 8:
                                                        str = "video_catalogue_restricted";
                                                        break;
                                                    case 9:
                                                        str = "playback_stuck";
                                                        break;
                                                    default:
                                                        str = "video_playback_error";
                                                        break;
                                                }
                                            } else {
                                                str = "timeout";
                                            }
                                            xkg0 xkg0Var = new xkg0();
                                            if (str2 != null) {
                                            }
                                            xkg0Var.put("track_uri", strR);
                                            return new xau0(str, xkg0Var.b());
                                        }

                                        public static final nl3 y(w5e1 w5e1Var) {
                                            if (w5e1Var instanceof w5e1) {
                                                return een.P0;
                                            }
                                            hhg1.g(w5e1Var, "Unknown position: ");
                                            return null;
                                        }

                                        public static final boolean z(EsContextPlayerState.ContextPlayerState contextPlayerState) {
                                            return contextPlayerState.z() && !contextPlayerState.y();
                                        }
                                    }
