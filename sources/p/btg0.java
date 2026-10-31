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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class btg0 {
    public static final se11 a = new se11("(?:\\*\\*(.+?)\\*\\*)|(?:\\(?\\[((?:\\\\.|[^\\\\\\]])+)\\]\\(([^)]+)\\)\\)?)");
    public static final se11 b = new se11("\\\\(\\\\|\\[|\\]|\\(|\\))");

    public static void a(ye5 ye5Var, String str, lee1 lee1Var, iu30 iu30Var, long j, boolean z, int i) {
        nh40 nh40Var;
        iu30 iu30Var2 = (i & 4) != 0 ? null : iu30Var;
        long j2 = (i & 8) != 0 ? u7h.k : j;
        int i2 = 0;
        ujf0 ujf0Var = (i & 16) != 0 ? false : z ? ujf0.d1 : ujf0.e1;
        nh40 nh40Var2 = new nh40(se11.b(a, str));
        while (nh40Var2.hasNext()) {
            mbh0 mbh0Var = (mbh0) nh40Var2.next();
            ujf0Var.invoke(ye5Var, str.substring(i2, ((rr80) mbh0Var.b()).a));
            String str2 = (String) mbh0Var.a().get(1);
            String strF = b.f((String) mbh0Var.a().get(2), wlg0.d1);
            String str3 = (String) mbh0Var.a().get(3);
            if (str2.length() > 0) {
                zma1 zma1Var = lee1Var.a;
                int iO = ye5Var.o(new zma1(0L, 0L, zma1Var.c, (FontStyle) null, (FontSynthesis) null, zma1Var.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65499));
                try {
                    ye5Var.g(str2);
                    ye5Var.k(iO);
                } catch (Throwable th) {
                    ye5Var.k(iO);
                    throw th;
                }
            } else {
                if (strF.length() > 0) {
                    nh40Var = nh40Var2;
                    pae1 pae1Var = new pae1(new zma1(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61438), null, 14);
                    if (iu30Var2 != null) {
                        int iL = ye5Var.l(new ljc0(str3, pae1Var, new uhg(iu30Var2, str3, (byte) 5)));
                        try {
                            ye5Var.g(strF);
                            ye5Var.k(iL);
                        } catch (Throwable th2) {
                            ye5Var.k(iL);
                            throw th2;
                        }
                    } else {
                        int iL2 = ye5Var.l(new ljc0(str3, pae1Var, null, 4));
                        try {
                            ye5Var.g(strF);
                            ye5Var.k(iL2);
                        } catch (Throwable th3) {
                            ye5Var.k(iL2);
                            throw th3;
                        }
                    }
                }
                i2 = ((rr80) mbh0Var.b()).b + 1;
                nh40Var2 = nh40Var;
            }
            nh40Var = nh40Var2;
            i2 = ((rr80) mbh0Var.b()).b + 1;
            nh40Var2 = nh40Var;
        }
        if (i2 < str.length()) {
            ujf0Var.invoke(ye5Var, str.substring(i2));
        }
    }
}
