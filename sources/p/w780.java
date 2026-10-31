package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class w780 {
    public static final void a(WidgetState.InactiveSession inactiveSession, float f, boolean z, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2104015092);
        int i2 = (b0kVar3.i(inactiveSession) ? 4 : 2) | i | (b0kVar3.d(f) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            kiv kivVar = p4k.a;
            float fA = s3v.a(((s3v) b0kVar3.k(kivVar)).a);
            float f2 = fA - f;
            boolean z2 = p3v.b(s3v.b(((s3v) b0kVar3.k(kivVar)).a), 240.0f) < 0;
            float fMin = z2 ? 80.0f : Math.min(92.0f, f2 - 28.0f);
            float f3 = ((p3v) b0kVar3.k(r4k.a)).a;
            float fB = s3v.b(((s3v) b0kVar3.k(kivVar)).a) - 32.0f;
            gt40 gt40VarI = dm5.I(et40.a);
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = l780.a;
                b0kVar3.s0(objT);
            }
            gt40 gt40VarX = iko1.x(gt40VarI, (iu30) objT);
            j2i j2iVarR = apo.r(1679931626, new n780(inactiveSession, fB, f2, fMin, z2, z, fA, f, f3), b0kVar3);
            b0kVar2 = b0kVar3;
            eqr0.a(gt40VarX, 0, 1, j2iVarR, b0kVar2, 3072, 2);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new o780(inactiveSession, f, z, i);
        }
    }

    public static final void b(WidgetState.InactiveSession inactiveSession, gt40 gt40Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        gt40 gt40Var2;
        float f;
        float f2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2021408168);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(inactiveSession) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        boolean zBooleanValue = true;
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            kiv kivVar = p4k.a;
            float fA = s3v.a(((s3v) b0kVar3.k(kivVar)).a);
            float fB = s3v.b(((s3v) b0kVar3.k(kivVar)).a);
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
            if (p3v.b(fB, 240.0f) >= 0 || p3v.b(f, 0.0f) <= 0) {
                b0kVar3.i0(-33031423);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-33302921);
                float fMin = Math.min(80.0f, (s3v.b(((s3v) b0kVar3.k(kivVar)).a) - 48.0f) - 32.0f);
                float fK = 28.0f + (fMin >= 0.0f ? fMin : 0.0f) + 16.0f + (w6p1.k(nee1.b, b0kVar3) * 2.0f) + w6p1.k(nee1.a, b0kVar3);
                if (fK > fA) {
                    fK = fA;
                }
                f = fA - fK;
                b0kVar3.r(false);
            }
            float f3 = ((p3v) b0kVar3.k(r4k.a)).a;
            boolean z = p3v.b(fA, 180.0f) < 0;
            if (z) {
                f2 = 3.0f;
            } else {
                f2 = p3v.b(fA, 300.0f) < 0 ? 4.0f : 12.0f;
            }
            int size = inactiveSession.getRecommendations().size();
            float f4 = fB - 32.0f;
            float f5 = (f - (2.0f * f2)) - f3;
            if (z) {
                b0kVar3.i0(-32409047);
            } else {
                b0kVar3.i0(-1247969857);
                zBooleanValue = ((Boolean) b0kVar3.k(r4k.c)).booleanValue();
            }
            b0kVar3.r(false);
            boolean zD0 = y3o1.d0(f4, f5, size, b0kVar3, zBooleanValue);
            String str = (String) b0kVar3.k(wol1.a);
            String str2 = (String) b0kVar3.k(wol1.b);
            String str3 = (String) b0kVar3.k(wol1.c);
            boolean zG = b0kVar3.g(str2) | b0kVar3.g(str3);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = new s780(str2, str3);
                b0kVar3.s0(objT);
            }
            Intent intentB = dro.B((String) null, str, (WidgetInteraction) ((Function0) objT).invoke());
            intentB.setFlags(268435456);
            whb1 whb1Var = new whb1(intentB, w0h1.A((y60[]) Arrays.copyOf(new y60[0], 0)), apl1.a());
            gt40Var2 = et40.a;
            gt40 gt40VarL = d9y0.l(ila0.l(dm5.I(gt40Var2), z5p1.p(zah.a, inactiveSession.getMetadata().f)), whb1Var);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = p780.a;
                b0kVar3.s0(objT2);
            }
            gt40 gt40VarX = iko1.x(gt40VarL, (iu30) objT2);
            j2i j2iVarR = apo.r(80178746, new q780(fA, inactiveSession, fB, zD0, f, z), b0kVar3);
            b0kVar2 = b0kVar3;
            j2h1.b(gt40VarX, (ql3) null, j2iVarR, b0kVar2, 384, 2);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            gt40Var2 = gt40Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new r780(inactiveSession, gt40Var2, i);
        }
    }

    public static final void c(WidgetState.InactiveSession inactiveSession, b0k b0kVar, int i) {
        whb1 cz31Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1499763033);
        int i2 = (x340Var.i(inactiveSession) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String str = (String) x340Var.k(wol1.a);
            String str2 = (String) x340Var.k(wol1.b);
            String str3 = (String) x340Var.k(wol1.c);
            boolean zI = x340Var.i(inactiveSession) | x340Var.g(str2) | x340Var.g(str3);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new u780(inactiveSession, str2, str3);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean shouldOpenEntityPage = inactiveSession.getShouldOpenEntityPage();
            x60 x60Var = apl1.a;
            x60 x60Var2 = apl1.b;
            if (shouldOpenEntityPage) {
                Intent intentB = dro.B((String) null, str, (WidgetInteraction) function0.invoke());
                intentB.setFlags(268435456);
                cz31Var = new whb1(intentB, w0h1.A((y60[]) Arrays.copyOf(new y60[0], 0)), apl1.a());
            } else {
                cz31Var = new cz31(w0h1.A(new y60[]{new y60(x60Var2, (WidgetInteraction) function0.invoke()), new y60(x60Var, str)}));
            }
            boolean zI2 = x340Var.i(inactiveSession) | x340Var.g(str2) | x340Var.g(str3);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new v780(inactiveSession, str2, str3);
                x340Var.s0(objT2);
            }
            yg91.a(inactiveSession.getMetadata().a, inactiveSession.getMetadata().c, inactiveSession.getMetadata().d, inactiveSession.getMetadata().f, inactiveSession.getIsWorkProfile(), cz31Var, new cz31(w0h1.A(new y60[]{new y60(x60Var2, (WidgetInteraction) ((Function0) objT2).invoke()), new y60(x60Var, str)})), null, null, x340Var, 0, 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t780(inactiveSession, i);
        }
    }
}
