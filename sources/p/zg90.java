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
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class zg90 {
    public static final zma1 a = new zma1(0, 0, (FontWeight) null, new FontStyle(1), new FontSynthesis(1), (FontFamily) null, (String) null, 0, (BaselineShift) null, new TextGeometricTransform(1), (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 64999);

    public static final void a(ye5 ye5Var, String str) {
        yg90 yg90VarC = c(str);
        String str2 = yg90VarC.a;
        int i = 0;
        for (tr80 tr80Var : yg90VarC.b) {
            int i2 = ((rr80) tr80Var).a;
            int i3 = ((rr80) tr80Var).b;
            ye5Var.g(str2.substring(i, i2));
            int iO = ye5Var.o(a);
            try {
                int i4 = i3 + 1;
                ye5Var.g(str2.substring(((rr80) tr80Var).a, i4));
                ye5Var.k(iO);
                i = i4;
            } catch (Throwable th) {
                ye5Var.k(iO);
                throw th;
            }
        }
        ye5Var.g(str2.substring(i));
    }

    public static final boolean b(int i, String str) {
        char cCharAt = str.charAt(i);
        Character chR0 = ihc1.r0(i - 1, str);
        if (chR0 != null && chR0.charValue() == cCharAt) {
            return false;
        }
        Character chR1 = ihc1.r0(i + 1, str);
        return chR1 == null || chR1.charValue() != cCharAt;
    }

    public static final yg90 c(String str) {
        Character chR0;
        int i;
        Character chR1;
        Character chR2;
        Character chR3;
        int i2;
        Character chR4;
        char cCharValue;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < str.length()) {
            char cCharAt = str.charAt(i3);
            if ((cCharAt != '*' && cCharAt != '_') || !b(i3, str) || (chR0 = ihc1.r0(i3 + 1, str)) == null || eth.H(chR0.charValue()) || (str.charAt(i3) != '*' && (chR3 = ihc1.r0(i3 - 1, str)) != null && Character.isLetterOrDigit(chR3.charValue()))) {
                i = -1;
                break;
            }
            char cCharAt2 = str.charAt(i3);
            i = i3 + 2;
            int length = str.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (str.charAt(i) == cCharAt2 && b(i, str)) {
                    int i4 = i - 1;
                    int i5 = 0;
                    for (int i6 = i4; i6 >= 0 && str.charAt(i6) == '\\'; i6--) {
                        i5++;
                    }
                    if (i5 % 2 != 1 && (chR1 = ihc1.r0(i4, str)) != null && !eth.H(chR1.charValue()) && (str.charAt(i) == '*' || (chR2 = ihc1.r0(i + 1, str)) == null || !Character.isLetterOrDigit(chR2.charValue()))) {
                        break;
                    }
                }
                i++;
            }
            if (cCharAt == '\\' && (chR4 = ihc1.r0((i2 = i3 + 1), str)) != null && ((cCharValue = chR4.charValue()) == '*' || cCharValue == '_')) {
                sb.append(str.charAt(i2));
                i3 += 2;
            } else if (i != -1) {
                int length2 = sb.length();
                sb.append(nhc1.W(nhc1.W(str.substring(i3 + 1, i), "\\*", "*"), "\\_", "_"));
                arrayList.add(yoi1.Q(length2, sb.length()));
                i3 = i + 1;
            } else {
                sb.append(cCharAt);
                i3++;
            }
        }
        return new yg90(sb.toString(), arrayList);
    }
}
