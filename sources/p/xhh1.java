package p;

import android.text.TextPaint;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class xhh1 {
    public static final TextPaint a = new TextPaint();
    public static final List b = p7h.M(new String[]{"⚕️", "♀️", "♂️", "♟️", "♾️"});

    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b5 A[RETURN] */
    public static boolean a(String str) {
        TextPaint textPaint;
        String str2;
        String str3;
        String strW;
        if (b5x.O0) {
            a4x a4xVarA = a4x.a();
            o0c.q("Not initialized yet", a4xVarA.e());
            e5x e5xVar = new e5x((slj0) ((zsc) a4xVarA.d.a.b).d);
            int length = str.length();
            int iCharCount = 0;
            int i = 0;
            int i2 = 0;
            while (iCharCount < length) {
                int iCodePointAt = Character.codePointAt(str, iCharCount);
                int iA = e5xVar.a(iCodePointAt);
                a2h1 a2h1Var = e5xVar.c.b;
                if (iA == 1) {
                    iCharCount += Character.charCount(iCodePointAt);
                    i2 = 0;
                } else if (iA == 2) {
                    iCharCount += Character.charCount(iCodePointAt);
                } else if (iA == 3) {
                    a2h1Var = e5xVar.d.b;
                    if (a2h1Var.b() <= 2147483647) {
                        i++;
                    }
                }
                if (a2h1Var != null && a2h1Var.b() <= 2147483647) {
                    i2++;
                }
            }
            if (i != 0 || e5xVar.a != 2 || e5xVar.c.b == null || ((e5xVar.f <= 1 && !e5xVar.c()) || e5xVar.c.b.b() > 2147483647)) {
                textPaint = a;
                str2 = null;
                if (textPaint.hasGlyph(str)) {
                    str3 = str;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str2 = str3;
                } else if (b.contains(str)) {
                    strW = nhc1.W(str, "️", "");
                    if (textPaint.hasGlyph(strW)) {
                        str2 = strW;
                    }
                }
                if (str2 != null) {
                    return false;
                }
            }
        } else {
            textPaint = a;
            str2 = null;
            if (textPaint.hasGlyph(str)) {
                str3 = str;
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str2 = str3;
            } else if (b.contains(str)) {
                strW = nhc1.W(str, "️", "");
                if (textPaint.hasGlyph(strW)) {
                    str2 = strW;
                }
            }
            if (str2 != null) {
                return false;
            }
        }
        return true;
    }
}
