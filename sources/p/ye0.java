package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ye0 {
    public static final void a(WidgetState.ActiveSession activeSession, gt40 gt40Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        gt40 gt40Var2;
        float f;
        float f2;
        float f3;
        boolean z;
        boolean z2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1940977602);
        if ((i & 6) == 0) {
            i2 = i | (b0kVar3.i(activeSession) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            kiv kivVar = p4k.a;
            float fA = s3v.a(((s3v) b0kVar3.k(kivVar)).a);
            float fB = s3v.b(((s3v) b0kVar3.k(kivVar)).a);
            float f4 = ((p3v) b0kVar3.k(r4k.a)).a;
            e130 e130VarM = u0p1.m(fA, (Context) b0kVar3.k(p4k.b));
            if (e130VarM instanceof jvb) {
                f = ((jvb) e130VarM).e * fA;
            } else {
                if (!(e130VarM instanceof kvb)) {
                    eg.o();
                    return;
                }
                f = 0.0f;
            }
            boolean z3 = p3v.b(fA, 180.0f) < 0;
            if (z3) {
                f2 = 3.0f;
            } else {
                f2 = p3v.b(fA, 300.0f) < 0 ? 4.0f : 12.0f;
            }
            float f5 = z3 ? 8.0f : 16.0f;
            float f6 = z3 ? 8.0f : 12.0f;
            float f7 = f5 + f6;
            kee1 kee1Var = z3 ? nee1.i : nee1.a;
            kee1 kee1Var2 = z3 ? nee1.j : nee1.b;
            boolean z4 = p3v.b(fB, 240.0f) < 0;
            float f8 = f;
            float fMin = Math.min(80.0f, (s3v.b(((s3v) b0kVar3.k(kivVar)).a) - 48.0f) - 32.0f);
            if (fMin < 0.0f) {
                fMin = 0.0f;
            }
            float fK = f7 + fMin + 16.0f + (w6p1.k(nee1.b, b0kVar3) * 2.0f) + w6p1.k(nee1.a, b0kVar3);
            if (z4) {
                f3 = fK > fA ? fA : fK;
            } else {
                f3 = fA - f8;
            }
            float f9 = z4 ? fA - f3 : f8;
            if (z4) {
                b0kVar3.i0(521289704);
                b0kVar3.r(false);
                z = p3v.b(fA, fK) >= 0;
            } else {
                b0kVar3.i0(521481222);
                boolean z5 = p3v.b(f3, (f7 + 48.0f) + (w6p1.k(kee1Var2, b0kVar3) + w6p1.k(kee1Var, b0kVar3))) >= 0;
                b0kVar3.r(false);
                z = z5;
            }
            int size = activeSession.getRecommendations().size();
            boolean z6 = z;
            float f10 = fB - 32.0f;
            float f11 = (f9 - (2.0f * f2)) - f4;
            if (z3) {
                b0kVar3.i0(522042621);
                b0kVar3.r(false);
                z2 = true;
            } else {
                b0kVar3.i0(1263767721);
                boolean zBooleanValue = ((Boolean) b0kVar3.k(r4k.c)).booleanValue();
                b0kVar3.r(false);
                z2 = zBooleanValue;
            }
            boolean z7 = z6 && y3o1.d0(f10, f11, size, b0kVar3, z2);
            String str = (String) b0kVar3.k(wol1.a);
            String str2 = (String) b0kVar3.k(wol1.b);
            String str3 = (String) b0kVar3.k(wol1.c);
            boolean zG = b0kVar3.g(str2) | b0kVar3.g(str3) | b0kVar3.i(activeSession);
            boolean z8 = z7;
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = new ke0(str2, str3, activeSession);
                b0kVar3.s0(objT);
            }
            Intent intentB = dro.B((String) null, str, (WidgetInteraction) ((Function0) objT).invoke());
            intentB.setFlags(268435456);
            whb1 whb1Var = new whb1(intentB, w0h1.A((y60[]) Arrays.copyOf(new y60[0], 0)), apl1.a());
            gt40 gt40Var3 = et40.a;
            gt40 gt40VarL = d9y0.l(ila0.l(dm5.I(gt40Var3), z5p1.p(zah.a, activeSession.getMetadata().getExtractedColor())), whb1Var);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = he0.a;
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            j2h1.b(iko1.x(gt40VarL, (iu30) objT2), (ql3) null, apo.r(380070176, new ie0(fA, activeSession, fB, z8, z4, f3, f7, f9, f5, f6, f4, z3, kee1Var, kee1Var2), b0kVar2), b0kVar2, 384, 2);
            gt40Var2 = gt40Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            gt40Var2 = gt40Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new je0(activeSession, gt40Var2, i);
        }
    }

    public static final void b(WidgetState.ActiveSession activeSession, b0k b0kVar, int i) {
        WidgetState.ActiveSession activeSession2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(614044819);
        int i2 = (x340Var.i(activeSession) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            gt40 gt40VarG = eqr0.G(dm5.I(et40.a), 16.0f, 16.0f, 16.0f, 16.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = le0.a;
                x340Var.s0(objT);
            }
            activeSession2 = activeSession;
            p8p0.a(activeSession2, iko1.x(gt40VarG, (iu30) objT), 80.0f, 3, null, null, x340Var, (i2 & 14) | 3456, 48);
        } else {
            activeSession2 = activeSession;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new me0(activeSession2, i);
        }
    }

    public static final void c(WidgetState.ActiveSession activeSession, float f, float f2, float f3, float f4, float f5, float f6, int i, boolean z, kee1 kee1Var, kee1 kee1Var2, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(188310782);
        int i3 = i2 | (x340Var.i(activeSession) ? 4 : 2) | (x340Var.d(f) ? 32 : 16) | (x340Var.d(f2) ? 256 : 128) | (x340Var.d(f3) ? 2048 : 1024) | (x340Var.d(f4) ? 16384 : 8192) | (x340Var.d(f5) ? 131072 : 65536) | (x340Var.d(f6) ? 1048576 : 524288) | (x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 8388608 : 4194304) | (x340Var.h(z) ? 67108864 : 33554432) | (x340Var.i(kee1Var) ? 536870912 : 268435456);
        if (x340Var.Y(i3 & 1, ((306783379 & i3) == 306783378 && ((x340Var.i(kee1Var2) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            x340Var.d0();
            if ((i2 & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            float fB = s3v.b(((s3v) x340Var.k(p4k.a)).a) - 32.0f;
            gt40 gt40VarJ = dm5.J(et40.a);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ne0.a;
                x340Var.s0(objT);
            }
            eqr0.a(iko1.x(gt40VarJ, (iu30) objT), 0, 1, apo.r(255130696, new pe0(f4, activeSession, fB, f, f5, f2, i, kee1Var, kee1Var2, z, f3, f6), x340Var), x340Var, 3072, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qe0(activeSession, f, f2, f3, f4, f5, f6, i, z, kee1Var, kee1Var2, i2);
        }
    }

    public static final void d(WidgetState.ActiveSession activeSession, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1870766296);
        int i2 = (x340Var.i(activeSession) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gt40 gt40VarI = dm5.I(et40.a);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = re0.a;
                x340Var.s0(objT);
            }
            ivh.a(activeSession, iko1.x(gt40VarI, (iu30) objT), x340Var, i2 & 14);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new se0(activeSession, i);
        }
    }

    public static final void e(WidgetState.ActiveSession activeSession, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(775136);
        int i2 = (x340Var.i(activeSession) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String str = (String) x340Var.k(wol1.a);
            String str2 = (String) x340Var.k(wol1.b);
            String str3 = (String) x340Var.k(wol1.c);
            yg91.a(activeSession.getMetadata().getArtwork(), activeSession.getMetadata().getTitle(), activeSession.getMetadata().getSubtitle(), activeSession.getMetadata().getExtractedColor(), activeSession.getIsWorkProfile(), ivh.c(str2, str3, str, activeSession.getMetadata().getUri()), rau0.i(activeSession.getPlayPauseState(), str2, str3, str, activeSession.getMetadata().getContextUri()), null, activeSession.getPlayPauseState(), x340Var, 0, 128);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new te0(activeSession, i);
        }
    }

    public static final void f(String str, float f, float f2, boolean z, float f3, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1977100868);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.d(f) ? 32 : 16) | (x340Var.d(f2) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.d(f3) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            float f4 = p3v.b(f, 110.0f) < 0 ? 8.0f : 16.0f;
            boolean z2 = p3v.b(f, 110.0f) < 0;
            eqr0.a(dm5.I(et40.a), 0, 0, apo.r(671864378, new we0(f4, f3, z2 || !z, str, (z2 || (p3v.b(f2, 180.0f) < 0)) ? 1 : 2), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xe0(str, f, f2, z, f3, i);
        }
    }
}
