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
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s120 implements elk1 {
    public final List a;
    public final String b;
    public final zma1 c;
    public final zma1 d;

    public s120(long j, long j2, String str, List list) {
        this.a = list;
        this.b = str;
        FontWeight fontWeight = FontWeight.Z;
        this.c = new zma1(j, 0L, fontWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65530);
        this.d = new zma1(j2, 0L, fontWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65530);
    }

    @Override // p.elk1
    public final cgg1 d(af5 af5Var) {
        String str = af5Var.b;
        ye5 ye5Var = new ye5();
        ye5Var.h(af5Var);
        for (i220 i220Var : this.a) {
            int i = ((rr80) i220Var.a).a;
            int length = str.length();
            if (i > length) {
                i = length;
            }
            int i2 = ((rr80) i220Var.a).b + 1;
            int length2 = str.length();
            if (i2 > length2) {
                i2 = length2;
            }
            if (i < i2) {
                String str2 = this.b;
                ye5Var.d((str2 == null || i220Var.b.a.equals(str2)) ? this.c : this.d, i, i2);
            }
        }
        return new cgg1(ye5Var.p(), gyp0.a);
    }
}
