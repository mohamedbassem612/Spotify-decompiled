package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kkc1 implements o1i {
    public static FontWeight d(int i) {
        switch (l1d.C(i)) {
            case 0:
                uwr uwrVar = cbx.a;
                return (FontWeight) ((bjx) ajx.a.c).b;
            case 1:
            case 2:
                uwr uwrVar2 = cbx.a;
                return (FontWeight) ((bjx) ajx.a.c).d;
            case 3:
            case 5:
            case 8:
                uwr uwrVar3 = cbx.a;
                return (FontWeight) ((bjx) ajx.a.c).f;
            case 4:
            case 6:
            case 7:
                uwr uwrVar4 = cbx.a;
                return (FontWeight) ((bjx) ajx.a.c).c;
            default:
                eg.o();
                return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(jkc1 jkc1Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var;
        lee1 lee1Var;
        int i3;
        String str = jkc1Var.a;
        ikc1 ikc1Var = jkc1Var.b;
        int i4 = ikc1Var.c;
        int i5 = ikc1Var.a;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-289058822);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(jkc1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.g(this) ? 2048 : 1024;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 1155) != 1154)) {
            int i6 = ikc1Var.b;
            switch (l1d.C(i6)) {
                case 0:
                    x340Var2.i0(-1662189303);
                    uwr uwrVar = cbx.a;
                    lee1Var = cbx.d(x340Var2).g;
                    x340Var2.r(false);
                    break;
                case 1:
                    x340Var2.i0(-1662187155);
                    uwr uwrVar2 = cbx.a;
                    lee1Var = cbx.d(x340Var2).h;
                    x340Var2.r(false);
                    break;
                case 2:
                case 5:
                case 6:
                    x340Var2.i0(-1662182327);
                    uwr uwrVar3 = cbx.a;
                    lee1Var = cbx.d(x340Var2).c;
                    x340Var2.r(false);
                    break;
                case 3:
                case 4:
                    x340Var2.i0(-1662178355);
                    uwr uwrVar4 = cbx.a;
                    lee1Var = cbx.d(x340Var2).b;
                    x340Var2.r(false);
                    break;
                case 7:
                case 8:
                    x340Var2.i0(-1662174519);
                    uwr uwrVar5 = cbx.a;
                    lee1Var = cbx.d(x340Var2).e;
                    x340Var2.r(false);
                    break;
                default:
                    throw p3d1.k(x340Var2, -1662190848, false);
            }
            lee1 lee1VarA = lee1Var;
            boolean zE = x340Var2.e(l1d.C(i6)) | x340Var2.g(lee1VarA);
            Object objT = x340Var2.T();
            if (zE || objT == fkj0.X) {
                switch (l1d.C(i6)) {
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        lee1VarA = lee1.a(lee1VarA, 0L, 0L, d(i6), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777211);
                    case 0:
                    case 1:
                    case 2:
                        x340Var2.s0(lee1VarA);
                        objT = lee1VarA;
                        break;
                    default:
                        eg.o();
                        return;
                }
            }
            lee1 lee1Var2 = (lee1) objT;
            int iC = l1d.C(ikc1Var.d);
            if (iC == 0) {
                i3 = 5;
            } else if (iC == 1) {
                i3 = 3;
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                i3 = 6;
            }
            switch (l1d.C(i6)) {
                case 0:
                case 1:
                case 2:
                    x340Var2.i0(58966798);
                    uwo1.e(str, qim0Var, lee1Var2, z4p1.e(i5), new a0e1(i3), (iu30) null, 2, false, new cjc0(i4), 0, (qx8) null, x340Var2, ((i2 >> 3) & 112) | 1572864, 0, 1696);
                    x340Var = x340Var2;
                    x340Var.r(false);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    x340Var2.i0(58566309);
                    int i7 = i2;
                    long jE = z4p1.e(i5);
                    cjc0 cjc0Var = new cjc0(i4);
                    Object obj = ajx.a.b;
                    gxo1.c(str, qim0Var, lee1Var2, jE, new a0e1(i3), 2, false, cjc0Var, (qx8) null, 150.0f, d(i6), (iu30) null, x340Var2, ((i7 >> 3) & 112) | 196608, 0, 2368);
                    x340Var = x340Var2;
                    x340Var.r(false);
                    break;
                default:
                    eg.o();
                    return;
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, this, jkc1Var, o0iVar, qim0Var, (byte) 29);
        }
    }
}
