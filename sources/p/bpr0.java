package p;

import android.graphics.Color;
import android.icu.text.UnicodeSet;
import android.os.Build;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.wrapped.v1.proto.Outline;
import com.spotify.wrapped.v1.proto.Paragraph;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class bpr0 {
    public static final tnr0 a(Paragraph.Box box) {
        eor0 eor0VarD = d(box.p());
        return (ihc1.y0(box.n()) && box.r() == 0 && box.q() == 0 && p3v.b(eor0VarD.a, 0.0f) <= 0) ? new tnr0() : new tnr0(b(box.n()), box.r(), box.q(), eor0VarD);
    }

    public static final long b(String str) {
        if (ihc1.y0(str)) {
            return u7h.j;
        }
        try {
            return z4p1.e(Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
            return u7h.j;
        }
    }

    public static final bor0 c(Paragraph.GlowBox glowBox) {
        long jB = b(glowBox.p());
        String strR = glowBox.r();
        if (ihc1.y0(strR)) {
            strR = null;
        }
        return new bor0(jB, strR, glowBox.n(), glowBox.q(), glowBox.s());
    }

    public static final eor0 d(Outline outline) {
        long jB;
        String strN;
        float fP = outline != null ? outline.p() * 2 : 0.0f;
        if (outline == null || (strN = outline.n()) == null) {
            int i = u7h.l;
            jB = u7h.j;
        } else {
            jB = b(strN);
        }
        return new eor0(fP, jB);
    }

    public static final a0e1 e(snr0 snr0Var) {
        int iOrdinal = snr0Var.ordinal();
        if (iOrdinal == 1) {
            return new a0e1(5);
        }
        if (iOrdinal == 2) {
            return new a0e1(3);
        }
        if (iOrdinal != 3) {
            return null;
        }
        return new a0e1(6);
    }

    public static final xnr0 f(ynr0 ynr0Var) {
        switch (apr0.b[ynr0Var.ordinal()]) {
            case 1:
            case 2:
                return xnr0.b;
            case 3:
            case 4:
            case 5:
                return xnr0.c;
            case 6:
            case 7:
                return xnr0.d;
            case 8:
            case 9:
                return xnr0.e;
            case 10:
            case 11:
                return xnr0.f;
            case 12:
                return xnr0.g;
            case 13:
            case 14:
            default:
                return xnr0.h;
            case 15:
            case 16:
            case 17:
                return xnr0.i;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
                return xnr0.t;
            case 22:
            case 23:
            case 24:
            case 25:
                return xnr0.X;
            case 26:
            case 27:
                return xnr0.Y;
            case 28:
            case 29:
                return xnr0.Z;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x027a  */
    public static final lee1 g(Paragraph.TextStyle textStyle, b0k b0kVar) {
        lee1 lee1Var;
        Integer numValueOf;
        FontWeight fontWeight;
        if (textStyle.x()) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-1588985232);
            switch (textStyle.t().ordinal()) {
                case 1:
                    x340Var.i0(1427723885);
                    uwr uwrVar = cbx.a;
                    lee1Var = cbx.d(x340Var).a;
                    x340Var.r(false);
                    break;
                case 2:
                    x340Var.i0(1427726958);
                    uwr uwrVar2 = cbx.a;
                    lee1Var = cbx.d(x340Var).b;
                    x340Var.r(false);
                    break;
                case 3:
                    x340Var.i0(1427729930);
                    uwr uwrVar3 = cbx.a;
                    lee1Var = cbx.d(x340Var).c;
                    x340Var.r(false);
                    break;
                case 4:
                    x340Var.i0(1427732811);
                    uwr uwrVar4 = cbx.a;
                    lee1Var = cbx.d(x340Var).d;
                    x340Var.r(false);
                    break;
                case 5:
                    x340Var.i0(1427735690);
                    uwr uwrVar5 = cbx.a;
                    lee1Var = cbx.d(x340Var).e;
                    x340Var.r(false);
                    break;
                case 6:
                    x340Var.i0(1427738575);
                    uwr uwrVar6 = cbx.a;
                    lee1Var = cbx.d(x340Var).f;
                    x340Var.r(false);
                    break;
                case 7:
                    x340Var.i0(1427741578);
                    uwr uwrVar7 = cbx.a;
                    lee1Var = cbx.d(x340Var).g;
                    x340Var.r(false);
                    break;
                case 8:
                    x340Var.i0(1427744590);
                    uwr uwrVar8 = cbx.a;
                    lee1Var = cbx.d(x340Var).h;
                    x340Var.r(false);
                    break;
                case 9:
                    x340Var.i0(1427747529);
                    uwr uwrVar9 = cbx.a;
                    lee1Var = cbx.d(x340Var).j;
                    x340Var.r(false);
                    break;
                case 10:
                    x340Var.i0(1427750477);
                    uwr uwrVar10 = cbx.a;
                    lee1Var = cbx.d(x340Var).k;
                    x340Var.r(false);
                    break;
                case 11:
                    x340Var.i0(1427753320);
                    uwr uwrVar11 = cbx.a;
                    lee1Var = cbx.d(x340Var).m;
                    x340Var.r(false);
                    break;
                case 12:
                    x340Var.i0(1427756172);
                    uwr uwrVar12 = cbx.a;
                    lee1Var = cbx.d(x340Var).n;
                    x340Var.r(false);
                    break;
                case 13:
                    x340Var.i0(1427759182);
                    uwr uwrVar13 = cbx.a;
                    lee1Var = cbx.d(x340Var).i;
                    x340Var.r(false);
                    break;
                case 14:
                    x340Var.i0(1427762445);
                    uwr uwrVar14 = cbx.a;
                    lee1Var = cbx.d(x340Var).l;
                    x340Var.r(false);
                    break;
                default:
                    x340Var.i0(1427763850);
                    uwr uwrVar15 = cbx.a;
                    lee1Var = cbx.d(x340Var).g;
                    x340Var.r(false);
                    break;
            }
            x340Var.r(false);
        } else {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(-1588921031);
            switch (textStyle.p().ordinal()) {
                case 0:
                    x340Var2.i0(654750506);
                    uwr uwrVar16 = cbx.a;
                    lee1Var = cbx.d(x340Var2).a;
                    x340Var2.r(false);
                    break;
                case 1:
                    x340Var2.i0(654753131);
                    uwr uwrVar17 = cbx.a;
                    lee1Var = cbx.d(x340Var2).b;
                    x340Var2.r(false);
                    break;
                case 2:
                    x340Var2.i0(654755655);
                    uwr uwrVar18 = cbx.a;
                    lee1Var = cbx.d(x340Var2).c;
                    x340Var2.r(false);
                    break;
                case 3:
                    x340Var2.i0(654758088);
                    uwr uwrVar19 = cbx.a;
                    lee1Var = cbx.d(x340Var2).d;
                    x340Var2.r(false);
                    break;
                case 4:
                    x340Var2.i0(654760519);
                    uwr uwrVar20 = cbx.a;
                    lee1Var = cbx.d(x340Var2).e;
                    x340Var2.r(false);
                    break;
                case 5:
                    x340Var2.i0(654762956);
                    uwr uwrVar21 = cbx.a;
                    lee1Var = cbx.d(x340Var2).f;
                    x340Var2.r(false);
                    break;
                case 6:
                    x340Var2.i0(654765511);
                    uwr uwrVar22 = cbx.a;
                    lee1Var = cbx.d(x340Var2).g;
                    x340Var2.r(false);
                    break;
                case 7:
                    x340Var2.i0(654768075);
                    uwr uwrVar23 = cbx.a;
                    lee1Var = cbx.d(x340Var2).h;
                    x340Var2.r(false);
                    break;
                case 8:
                    x340Var2.i0(654773190);
                    uwr uwrVar24 = cbx.a;
                    lee1Var = cbx.d(x340Var2).j;
                    x340Var2.r(false);
                    break;
                case 9:
                    x340Var2.i0(654775690);
                    uwr uwrVar25 = cbx.a;
                    lee1Var = cbx.d(x340Var2).k;
                    x340Var2.r(false);
                    break;
                case 10:
                    x340Var2.i0(654780869);
                    uwr uwrVar26 = cbx.a;
                    lee1Var = cbx.d(x340Var2).m;
                    x340Var2.r(false);
                    break;
                case 11:
                    x340Var2.i0(654783273);
                    uwr uwrVar27 = cbx.a;
                    lee1Var = cbx.d(x340Var2).n;
                    x340Var2.r(false);
                    break;
                case 12:
                    x340Var2.i0(654770699);
                    uwr uwrVar28 = cbx.a;
                    lee1Var = cbx.d(x340Var2).i;
                    x340Var2.r(false);
                    break;
                case 13:
                    x340Var2.i0(654778474);
                    uwr uwrVar29 = cbx.a;
                    lee1Var = cbx.d(x340Var2).l;
                    x340Var2.r(false);
                    break;
                default:
                    x340Var2.i0(654784647);
                    uwr uwrVar30 = cbx.a;
                    lee1Var = cbx.d(x340Var2).g;
                    x340Var2.r(false);
                    break;
            }
            x340Var2.r(false);
        }
        lee1 lee1Var2 = lee1Var;
        zma1 zma1Var = lee1Var2.a;
        Paragraph.FontVariation fontVariationR = textStyle.r();
        if (fontVariationR != null) {
            int iP = fontVariationR.p();
            numValueOf = Integer.valueOf(iP);
            if (iP <= 0) {
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        Paragraph.FontVariation fontVariationR2 = textStyle.r();
        Integer numValueOf2 = fontVariationR2 != null ? Integer.valueOf(fontVariationR2.o()) : null;
        if (numValueOf2 != null && numValueOf2.intValue() == 100) {
            fontWeight = FontWeight.g;
        } else if (numValueOf2 != null && numValueOf2.intValue() == 200) {
            fontWeight = FontWeight.h;
        } else if (numValueOf2 != null && numValueOf2.intValue() == 300) {
            fontWeight = FontWeight.i;
        } else if (numValueOf2 != null && numValueOf2.intValue() == 400) {
            fontWeight = FontWeight.t;
        } else if (numValueOf2 != null && numValueOf2.intValue() == 500) {
            fontWeight = FontWeight.X;
        } else if (numValueOf2 != null && numValueOf2.intValue() == 600) {
            fontWeight = FontWeight.Y;
        } else if (numValueOf2 != null && numValueOf2.intValue() == 700) {
            fontWeight = FontWeight.Z;
        } else if (numValueOf2 != null && numValueOf2.intValue() == 800) {
            fontWeight = FontWeight.N0;
        } else {
            fontWeight = (numValueOf2 != null && numValueOf2.intValue() == 900) ? FontWeight.O0 : null;
        }
        long jG = textStyle.o() > 0 ? fc11.G(textStyle.o()) : zma1Var.b;
        if (Build.VERSION.SDK_INT >= 29 && numValueOf != null && ((UnicodeSet) q5b1.a.getValue()).containsAll(textStyle.u())) {
            if (fontWeight == null) {
                fontWeight = zma1Var.c;
            }
            return lee1.a(lee1Var2, b(textStyle.w()), jG, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, hm5.d(new a930[]{o0c.a(14, (FontWeight) null, new ja30(new ga30[]{u890.I(numValueOf.intValue()), u890.H(fontWeight != null ? fontWeight.a : FontWeight.t.a)}))}), (String) null, 0L, (TextGeometricTransform) null, b(textStyle.v()), (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775128);
        }
        long jB = b(textStyle.w());
        long jB2 = b(textStyle.v());
        if (fontWeight == null) {
            fontWeight = zma1Var.c;
        }
        return lee1.a(lee1Var2, jB, jG, fontWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, jB2, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775160);
    }
}
