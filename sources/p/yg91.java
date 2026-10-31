package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class yg91 {
    public static final void a(String str, String str2, String str3, String str4, boolean z, q10 q10Var, cz31 cz31Var, gt40 gt40Var, WidgetState.PlayPauseState playPauseState, b0k b0kVar, int i, int i2) {
        int i3;
        gt40 gt40Var2;
        WidgetState.PlayPauseState playPauseState2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1386583658);
        int i4 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | (x340Var.g(str4) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192) | (x340Var.i(q10Var) ? 131072 : 65536) | (x340Var.i(cz31Var) ? 1048576 : 524288);
        int i5 = 12582912 | i4;
        int i6 = i2 & 256;
        if (i6 != 0) {
            i3 = i4 | 113246208;
        } else {
            i3 = (x340Var.e(playPauseState == null ? -1 : playPauseState.ordinal()) ? 67108864 : 33554432) | i5;
        }
        if (x340Var.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            WidgetState.PlayPauseState playPauseState3 = i6 != 0 ? null : playPauseState;
            float fD = d(s3v.a(((s3v) x340Var.k(p4k.a)).a), x340Var);
            WidgetState.PlayPauseState playPauseState4 = playPauseState3 == null ? WidgetState.PlayPauseState.PLAY : playPauseState3;
            boolean z2 = playPauseState3 == null || playPauseState3 == WidgetState.PlayPauseState.PLAY || playPauseState3 == WidgetState.PlayPauseState.PAUSE;
            long jP = z5p1.p(zah.a, str4);
            gt40Var2 = et40.a;
            gt40 gt40VarE = eqr0.E(dm5.I(gt40Var2), 16.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = sg91.a;
                x340Var.s0(objT);
            }
            j2h1.b(iko1.x(gt40VarE, (iu30) objT), (ql3) null, apo.r(1611384524, new wg91(fD, str, z, q10Var, playPauseState4, jP, cz31Var, z2, str2, str3), x340Var), x340Var, 384, 2);
            playPauseState2 = playPauseState3;
        } else {
            x340Var.b0();
            gt40Var2 = gt40Var;
            playPauseState2 = playPauseState;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xg91(str, str2, str3, str4, z, q10Var, cz31Var, gt40Var2, playPauseState2, i, i2);
        }
    }

    public static final boolean b(float f, float f2) {
        return new p3v(f).compareTo(new p3v(190.0f)) <= 0 && new p3v(f).compareTo(new p3v(135.0f)) >= 0 && new p3v(f2).compareTo(new p3v(190.0f)) <= 0 && new p3v(f2).compareTo(new p3v(135.0f)) >= 0;
    }

    public static final boolean c(float f, float f2, x340 x340Var) {
        x340Var.i0(-1571594042);
        if (!b(f, f2)) {
            x340Var.r(false);
            return false;
        }
        float fD = d(f2, x340Var);
        float fK = w6p1.k(nee1.b, x340Var) + w6p1.k(nee1.a, x340Var);
        float f3 = 32.0f + fD;
        boolean z = p3v.b(f, 40.0f + f3) >= 0 && p3v.b(f2, pap1.y(new p3v((f3 + 6.0f) + fK), new p3v(101.0f + fK)).a) >= 0;
        x340Var.r(false);
        return z;
    }

    public static final float d(float f, b0k b0kVar) {
        float fK = ((f - 32.0f) - 6.0f) - (w6p1.k(nee1.b, b0kVar) + w6p1.k(nee1.a, b0kVar));
        if (fK < 40.0f) {
            fK = 40.0f;
        }
        return Math.min(fK, 72.0f);
    }
}
