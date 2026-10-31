package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class vhg {
    public static final zma1 a = new zma1(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61439);

    public static final void a(ye5 ye5Var, String str, String str2, zma1 zma1Var, iu30 iu30Var) {
        int iL = ye5Var.l(new kjc0(str2, new pae1(zma1Var, (zma1) null, 14), new uhg(iu30Var, str2, (byte) 0)));
        try {
            ye5Var.g(str);
        } finally {
            ye5Var.k(iL);
        }
    }

    public static final void c(ye5 ye5Var, String str, String str2, zma1 zma1Var, iu30 iu30Var) {
        int iL = ye5Var.l(new ljc0(str2, new pae1(zma1Var, (zma1) null, 14), new uhg(iu30Var, str2, (byte) 1)));
        try {
            ye5Var.g(str);
        } finally {
            ye5Var.k(iL);
        }
    }
}
