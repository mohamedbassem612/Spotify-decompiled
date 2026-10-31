package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract /* synthetic */ class rjx {
    public static void A(cwh0 cwh0Var, float f, float f2, float f3, float f4) {
        cwh0Var.i(f);
        cwh0Var.v(f2);
        cwh0Var.j(f3, f4);
        cwh0Var.e();
    }

    public static void B(cwh0 cwh0Var, float f, float f2, float f3, float f4) {
        cwh0Var.j(f, f2);
        cwh0Var.i(f3);
        cwh0Var.v(f4);
    }

    public static void C(cwh0 cwh0Var, float f, float f2, float f3, float f4) {
        cwh0Var.k(f, f2);
        cwh0Var.k(f3, f4);
        cwh0Var.e();
    }

    public static /* synthetic */ String D(int i) {
        if (i == 1) {
            return "Artist";
        }
        if (i == 2) {
            return "Podcast";
        }
        if (i == 3) {
            return "Event";
        }
        if (i == 4) {
            return "ImportMusic";
        }
        throw null;
    }

    public static /* synthetic */ String E(int i) {
        switch (i) {
            case 1:
                return "Base";
            case 2:
                return "Tinted";
            case 3:
                return "Elevated";
            case 4:
                return "BrightAccent";
            case 5:
                return "MutedAccent";
            case 6:
                return "Inverted";
            case 7:
                return "InvertedDark";
            case 8:
                return "InvertedLight";
            case 9:
                return "Negative";
            case 10:
                return "NegativeSubdued";
            case 11:
                return "Warning";
            case 12:
                return "WarningSubdued";
            case 13:
                return "Positive";
            case 14:
                return "PositiveSubdued";
            case 15:
                return "Announcement";
            case 16:
                return "AnnouncementSubdued";
            case 17:
                return "AppFrame";
            case 18:
                return "OverMedia";
            case 19:
                return "Inherit";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String F(int i) {
        switch (i) {
            case 1:
                return "ARTIST";
            case 2:
                return "ALBUM";
            case 3:
                return "TRACK";
            case 4:
                return "PLAYLIST";
            case 5:
                return "SHOW";
            case 6:
                return "EPISODE";
            case 7:
                return "AUDIOBOOK";
            case 8:
                return "ENTITY_NOT_SET";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int G(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("SpotifyBrand")) {
            return 1;
        }
        if (str.equals("SpotifyBrandAlternate")) {
            return 2;
        }
        if (str.equals("SpotifyBrand2")) {
            return 3;
        }
        if (str.equals("SpotifyBrand2Alternate")) {
            return 4;
        }
        if (str.equals("SpotifyBrand3")) {
            return 5;
        }
        if (str.equals("SpotifyBrand3Alternate")) {
            return 6;
        }
        if (str.equals("Premium")) {
            return 7;
        }
        if (str.equals("PremiumAlternate")) {
            return 8;
        }
        if (str.equals("PremiumDuo")) {
            return 9;
        }
        if (str.equals("PremiumDuoAlternate")) {
            return 10;
        }
        if (str.equals("PremiumStudent")) {
            return 11;
        }
        if (str.equals("PremiumStudentAlternate")) {
            return 12;
        }
        if (str.equals("PremiumFamily")) {
            return 13;
        }
        if (str.equals("PremiumFamilyAlternate")) {
            return 14;
        }
        if (str.equals("BasicTier")) {
            return 15;
        }
        if (str.equals("BasicTierAlternate")) {
            return 16;
        }
        if (str.equals("AudiobooksAccessOnly")) {
            return 17;
        }
        if (str.equals("PremiumFallback")) {
            return 18;
        }
        if (str.equals("PremiumFallbackAlternate")) {
            return 19;
        }
        if (str.equals("SpotifyFree")) {
            return 20;
        }
        if (str.equals("SpotifyFreeAlternate")) {
            return 21;
        }
        if (str.equals("Astro")) {
            return 22;
        }
        if (str.equals("PremiumLiteGBB")) {
            return 23;
        }
        if (str.equals("PremiumLiteGBBAlternate")) {
            return 24;
        }
        if (str.equals("PremiumStandard")) {
            return 25;
        }
        if (str.equals("PremiumStandardAlternate")) {
            return 26;
        }
        if (str.equals("StandardStudent")) {
            return 27;
        }
        if (str.equals("StandardStudentAlternate")) {
            return 28;
        }
        if (str.equals("PremiumPlatinum")) {
            return 29;
        }
        if (str.equals("PremiumPlatinumAlternate")) {
            return 30;
        }
        if (str.equals("PremiumStandardTest")) {
            return 31;
        }
        if (str.equals("PremiumStandardTestAlternate")) {
            return 32;
        }
        if (str.equals("PremiumLiteGBBTest")) {
            return 33;
        }
        if (str.equals("PremiumLiteGBBTestAlternate")) {
            return 34;
        }
        if (str.equals("PremiumPlatinumTest")) {
            return 35;
        }
        if (str.equals("PremiumPlatinumTestAlternate")) {
            return 36;
        }
        if (str.equals("StandardStudentTest")) {
            return 37;
        }
        if (str.equals("StandardStudentTestAlternate")) {
            return 38;
        }
        if (str.equals("PremiumExperimental")) {
            return 39;
        }
        if (str.equals("PremiumExperimentalAlternate")) {
            return 40;
        }
        if (str.equals("PremiumDuoExperimental")) {
            return 41;
        }
        if (str.equals("PremiumDuoExperimentalAlternate")) {
            return 42;
        }
        if (str.equals("PremiumFamilyExperimental")) {
            return 43;
        }
        if (str.equals("PremiumFamilyExperimentalAlternate")) {
            return 44;
        }
        if (str.equals("PremiumStudentExperimental")) {
            return 45;
        }
        if (str.equals("PremiumStudentExperimentalAlternate")) {
            return 46;
        }
        if (str.equals("AudiobooksAccessOnlyExperimental")) {
            return 47;
        }
        hhg1.n("No enum constant com.spotify.encore.theme.EncoreThemeCampaignColorSet.".concat(str));
        return 0;
    }

    public static int[] _values() {
        return l1d.H(3);
    }

    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final float b(int i, x340 x340Var) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i);
        if (iC == 0) {
            x340Var.i0(484856357);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            x340Var.r(false);
            return 2.0f;
        }
        if (iC != 1 && iC != 2) {
            throw p3d1.k(x340Var, 484854482, false);
        }
        x340Var.i0(484858690);
        uwr uwrVar2 = cbx.a;
        cua cuaVar2 = cbx.b(x340Var).f;
        x340Var.r(false);
        return 4.0f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final float c(b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i);
        if (iC == 0) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(1280269053);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            x340Var.r(false);
            return 12.0f;
        }
        if (iC == 1) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(1280270746);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            x340Var2.r(false);
            return 16.0f;
        }
        if (iC != 2) {
            throw p3d1.k((x340) b0kVar, 1280267364, false);
        }
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.i0(1280272316);
        uwr uwrVar3 = cbx.a;
        float f = cbx.b(x340Var3).b.a;
        x340Var3.r(false);
        return f;
    }

    public static final int d(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final float e(b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i);
        if (iC == 0) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(1305436221);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            x340Var.r(false);
            return 12.0f;
        }
        if (iC == 1) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(1305438428);
            uwr uwrVar2 = cbx.a;
            zov0 zov0Var2 = cbx.b(x340Var2).g;
            x340Var2.r(false);
            return 16.0f;
        }
        if (iC == 2) {
            x340 x340Var3 = (x340) b0kVar;
            x340Var3.i0(1305440633);
            uwr uwrVar3 = cbx.a;
            zov0 zov0Var3 = cbx.b(x340Var3).g;
            x340Var3.r(false);
            return 24.0f;
        }
        if (iC == 3) {
            x340 x340Var4 = (x340) b0kVar;
            x340Var4.i0(1305442715);
            uwr uwrVar4 = cbx.a;
            zov0 zov0Var4 = cbx.b(x340Var4).g;
            x340Var4.r(false);
            return 32.0f;
        }
        if (iC == 4) {
            x340 x340Var5 = (x340) b0kVar;
            x340Var5.i0(1305444892);
            uwr uwrVar5 = cbx.a;
            zov0 zov0Var5 = cbx.b(x340Var5).g;
            x340Var5.r(false);
            return 40.0f;
        }
        if (iC != 5) {
            throw p3d1.k((x340) b0kVar, 1305434585, false);
        }
        x340 x340Var6 = (x340) b0kVar;
        x340Var6.i0(1305447132);
        uwr uwrVar6 = cbx.a;
        zov0 zov0Var6 = cbx.b(x340Var6).g;
        x340Var6.r(false);
        return 48.0f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final float f(b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i);
        if (iC == 0) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(38187030);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            x340Var.r(false);
            return 48.0f;
        }
        if (iC != 1) {
            throw p3d1.k((x340) b0kVar, 38185080, false);
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(38188761);
        uwr uwrVar2 = cbx.a;
        mta mtaVar2 = cbx.b(x340Var2).d;
        x340Var2.r(false);
        return 32.0f;
    }

    public static final float g(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return 0.67f;
        }
        if (iC == 1) {
            return 0.75f;
        }
        if (iC == 2) {
            return 0.8f;
        }
        eg.o();
        return 0.0f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final zzq0 h(int i, x340 x340Var) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i);
        if (iC == 0) {
            x340Var.i0(1312129964);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            zzq0 zzq0VarH = uyn1.h(2, 2.0f, 0.0f);
            x340Var.r(false);
            return zzq0VarH;
        }
        if (iC != 1 && iC != 2) {
            throw p3d1.k(x340Var, 1312129203, false);
        }
        x340Var.i0(1312133473);
        uwr uwrVar2 = cbx.a;
        cvx cvxVar2 = cbx.b(x340Var).b;
        cvx cvxVar3 = cbx.b(x340Var).b;
        zzq0 zzq0Var = new zzq0(4.0f, 2.0f, 4.0f, 2.0f);
        x340Var.r(false);
        return zzq0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final float i(b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i);
        if (iC == 0) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(162846642);
            uwr uwrVar = cbx.a;
            avw0 avw0Var = cbx.b(x340Var).c;
            x340Var.r(false);
            return 1.0f;
        }
        if (iC == 1) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(162848498);
            uwr uwrVar2 = cbx.a;
            avw0 avw0Var2 = cbx.b(x340Var2).c;
            x340Var2.r(false);
            return 1.0f;
        }
        if (iC == 2) {
            x340 x340Var3 = (x340) b0kVar;
            x340Var3.i0(162850382);
            uwr uwrVar3 = cbx.a;
            avw0 avw0Var3 = cbx.b(x340Var3).c;
            x340Var3.r(false);
            return 2.0f;
        }
        if (iC == 3) {
            x340 x340Var4 = (x340) b0kVar;
            x340Var4.i0(162852110);
            uwr uwrVar4 = cbx.a;
            avw0 avw0Var4 = cbx.b(x340Var4).c;
            x340Var4.r(false);
            return 2.0f;
        }
        if (iC == 4) {
            x340 x340Var5 = (x340) b0kVar;
            x340Var5.i0(162853871);
            uwr uwrVar5 = cbx.a;
            avw0 avw0Var5 = cbx.b(x340Var5).c;
            x340Var5.r(false);
            return 4.0f;
        }
        if (iC != 5) {
            throw p3d1.k((x340) b0kVar, 162844946, false);
        }
        x340 x340Var6 = (x340) b0kVar;
        x340Var6.i0(162855695);
        uwr uwrVar6 = cbx.a;
        avw0 avw0Var6 = cbx.b(x340Var6).c;
        x340Var6.r(false);
        return 4.0f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final lee1 j(int i, x340 x340Var) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i);
        if (iC == 0) {
            x340Var.i0(-1759890197);
            uwr uwrVar = cbx.a;
            lee1 lee1VarA = lee1.a(cbx.d(x340Var).n, 0L, fc11.G(9), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213);
            x340Var.r(false);
            return lee1VarA;
        }
        if (iC == 1) {
            x340Var.i0(-1759888350);
            uwr uwrVar2 = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).n;
            x340Var.r(false);
            return lee1Var;
        }
        if (iC != 2) {
            throw p3d1.k(x340Var, -1759892013, false);
        }
        x340Var.i0(-1759886813);
        uwr uwrVar3 = cbx.a;
        lee1 lee1Var2 = cbx.d(x340Var).k;
        x340Var.r(false);
        return lee1Var2;
    }

    public static final afx k(int i) {
        switch (l1d.C(i)) {
            case 0:
                return ndx.a.a;
            case 1:
                return ndx.a.b;
            case 2:
                return ndx.a.c;
            case 3:
                return ndx.a.d;
            case 4:
                return ndx.a.e;
            case 5:
                return ndx.a.f;
            case 6:
                return ndx.a.g;
            case 7:
                return ndx.a.h;
            case 8:
                return ndx.a.i;
            case 9:
                return ndx.a.j;
            case 10:
                return ndx.a.k;
            case 11:
                return ndx.a.l;
            case 12:
                return ndx.a.m;
            case 13:
                return ndx.a.n;
            case 14:
                return ndx.a.w;
            case 15:
                return ndx.a.x;
            case 16:
                return ndx.a.f12p;
            case 17:
                return ndx.a.q;
            case 18:
                return ndx.a.r;
            case 19:
                return ndx.a.s;
            case 20:
                return ndx.a.t;
            case 21:
                return ndx.a.u;
            case 22:
                return ndx.a.A;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return ndx.a.B;
            case 24:
                return ndx.a.C;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return ndx.a.D;
            case 26:
                return ndx.a.E;
            case 27:
                return ndx.a.F;
            case 28:
                return ndx.a.G;
            case 29:
                return ndx.a.H;
            case 30:
                return ndx.a.I;
            case 31:
                return ndx.a.J;
            case 32:
                return ndx.a.K;
            case 33:
                return ndx.a.L;
            case 34:
                return ndx.a.M;
            case 35:
                return ndx.a.N;
            case 36:
                return ndx.a.O;
            case 37:
                return ndx.a.P;
            case 38:
                return ndx.a.Q;
            case 39:
                return ndx.a.R;
            case 40:
                return ndx.a.S;
            case 41:
                return ndx.a.T;
            case 42:
                return ndx.a.U;
            case 43:
                return ndx.a.V;
            case 44:
                return ndx.a.W;
            case 45:
                return ndx.a.X;
            case 46:
                return ndx.a.Y;
            default:
                eg.o();
                return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final afx l(b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        hfx hfxVar = (hfx) x340Var.k(nyx.a);
        kiv kivVar = gfx.a;
        afx afxVar = (afx) x340Var.k(kivVar);
        switch (l1d.C(i)) {
            case 0:
                x340Var.i0(-351896720);
                x340Var.r(false);
                return hfxVar.a;
            case 1:
                x340Var.i0(-351895404);
                x340Var.r(false);
                afx afxVar2 = hfxVar.a;
                icx icxVar = afxVar2.a;
                ixx ixxVar = icxVar.b;
                long jA = ixxVar.a();
                ixx ixxVar2 = icxVar.b;
                return afx.a(afxVar2, new icx(icxVar.a, ixxVar, jA, ixxVar2.c(), ixxVar2.b()), (yxx) null, 14);
            case 2:
                x340Var.i0(-351893898);
                x340Var.r(false);
                afx afxVar3 = hfxVar.a;
                icx icxVar2 = afxVar3.a;
                ixx ixxVar3 = icxVar2.a;
                long jA2 = ixxVar3.a();
                ixx ixxVar4 = icxVar2.a;
                return afx.a(afxVar3, new icx(ixxVar3, icxVar2.b, jA2, ixxVar4.c(), ixxVar4.b()), (yxx) null, 14);
            case 3:
                x340Var.i0(-351892360);
                x340Var.r(false);
                return hfxVar.b;
            case 4:
                x340Var.i0(-351890793);
                x340Var.r(false);
                return hfxVar.i;
            case 5:
                x340Var.i0(-351889330);
                x340Var.r(false);
                return ((double) z4p1.B(afxVar.b.a)) > 0.5d ? hfxVar.h : hfxVar.g;
            case 6:
                x340Var.i0(-351884072);
                x340Var.r(false);
                return hfxVar.g;
            case 7:
                x340Var.i0(-351882439);
                x340Var.r(false);
                return hfxVar.h;
            case 8:
                x340Var.i0(-351880940);
                x340Var.r(false);
                return hfxVar.c;
            case 9:
                x340Var.i0(-351879365);
                x340Var.r(false);
                return hfxVar.m;
            case 10:
                x340Var.i0(-351877837);
                x340Var.r(false);
                return hfxVar.d;
            case 11:
                x340Var.i0(-351876326);
                x340Var.r(false);
                return hfxVar.n;
            case 12:
                x340Var.i0(-351874796);
                x340Var.r(false);
                return hfxVar.e;
            case 13:
                x340Var.i0(-351873221);
                x340Var.r(false);
                return hfxVar.o;
            case 14:
                x340Var.i0(-351871528);
                x340Var.r(false);
                return hfxVar.f;
            case 15:
                x340Var.i0(-351869697);
                x340Var.r(false);
                return hfxVar.l;
            case 16:
                x340Var.i0(-351868012);
                x340Var.r(false);
                return hfxVar.j;
            case 17:
                x340Var.i0(-351866635);
                x340Var.r(false);
                return hfxVar.k;
            case 18:
                x340Var.i0(-351865069);
                afx afxVar4 = (afx) x340Var.k(kivVar);
                x340Var.r(false);
                return afxVar4;
            default:
                throw p3d1.k(x340Var, -351897053, false);
        }
    }

    public static final hfx m(int i) {
        switch (l1d.C(i)) {
            case 0:
                return null;
            case 1:
                return vgx.a;
            case 2:
                return evx.a();
            case 3:
                return jbx.a();
            case 4:
                return kbx.a();
            case 5:
                return tgx.a();
            case 6:
                return ugx.a();
            case 7:
                return awx.a();
            case 8:
                return owx.a();
            case 9:
                return rwx.a();
            case 10:
                return qwx.a();
            case 11:
                return yyx.a();
            case 12:
                return azx.a();
            case 13:
                return zyx.a();
            default:
                eg.o();
                return null;
        }
    }

    public static int n(int i, int i2, Function0 function0) {
        return (function0.hashCode() + i) * i2;
    }

    public static String o(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static cwh0 p(float f, float f2, float f3) {
        cwh0 cwh0Var = new cwh0();
        cwh0Var.l(f, f2);
        cwh0Var.v(f3);
        return cwh0Var;
    }

    public static cwh0 q(float f, float f2, float f3, float f4) {
        cwh0 cwh0Var = new cwh0();
        cwh0Var.m(f, f2);
        cwh0Var.k(f3, f4);
        return cwh0Var;
    }

    public static void r(cwh0 cwh0Var, float f, float f2, float f3) {
        cwh0Var.j(f, f2);
        cwh0Var.i(f3);
        cwh0Var.e();
    }

    public static void s(cwh0 cwh0Var, float f, float f2, float f3, float f4) {
        cwh0Var.i(f);
        cwh0Var.j(f2, f3);
        cwh0Var.i(f4);
    }

    public static void t(cwh0 cwh0Var, float f, float f2, float f3) {
        cwh0Var.i(f);
        cwh0Var.e();
        cwh0Var.l(f2, f3);
    }

    public static void u(cwh0 cwh0Var, float f, float f2, float f3, float f4) {
        cwh0Var.j(f, f2);
        cwh0Var.e();
        cwh0Var.l(f3, f4);
    }

    public static void v(cwh0 cwh0Var, float f, float f2, float f3, float f4) {
        cwh0Var.i(f);
        cwh0Var.e();
        cwh0Var.l(f2, f3);
        cwh0Var.i(f4);
    }

    public static void w(cwh0 cwh0Var, float f, float f2, float f3, float f4) {
        cwh0Var.i(f);
        cwh0Var.v(f2);
        cwh0Var.j(f3, f4);
    }

    public static void x(cwh0 cwh0Var, float f, float f2, float f3, float f4) {
        cwh0Var.j(f, f2);
        cwh0Var.v(f3);
        cwh0Var.i(f4);
        cwh0Var.e();
    }

    public static void y(cwh0 cwh0Var, float f, float f2, float f3, float f4) {
        cwh0Var.k(f, f2);
        cwh0Var.e();
        cwh0Var.l(f3, f4);
    }

    public static void z(cwh0 cwh0Var, float f, float f2, float f3, float f4) {
        cwh0Var.l(f, f2);
        cwh0Var.i(f3);
        cwh0Var.v(f4);
    }
}
