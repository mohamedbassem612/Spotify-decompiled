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
public final class yk51 extends hab0 implements iu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk51(String str, String str2, ven0 ven0Var, long j, String str3) {
        super(1);
        this.a = str;
        this.b = str2;
        this.c = ven0Var;
        this.d = j;
        this.e = str3;
    }

    public final Object invoke(Object obj) {
        y9e1 y9e1Var = (y9e1) obj;
        ven0 ven0Var = this.c;
        if (((af5) ven0Var.getValue()) == null && y9e1Var.d()) {
            int iC = y9e1Var.b.c(2, true) - this.b.length();
            if (iC < 0) {
                iC = 0;
            }
            String strSubstring = this.a.substring(0, iC);
            String str = this.e;
            ye5 ye5Var = new ye5();
            ye5Var.g(strSubstring);
            ye5Var.g("… ");
            int iO = ye5Var.o(new zma1(this.d, 0L, FontWeight.Z, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65530));
            try {
                str.getClass();
                ye5Var.g(str);
                ye5Var.k(iO);
                ven0Var.setValue(ye5Var.p());
            } catch (Throwable th) {
                ye5Var.k(iO);
                throw th;
            }
        }
        return rih1.a;
    }
}
