package p;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ma30 extends MetricAffectingSpan {
    public final Context a;
    public final int b;

    public ma30(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface = textPaint.getTypeface();
        if (typeface != null) {
            int iP = yoi1.p(this.b, 1, 1000);
            if (Build.VERSION.SDK_INT < 28 || typeface.getWeight() != iP) {
                boolean zIsItalic = typeface.isItalic();
                k9 k9Var = s1h1.a;
                o0c.n(iP, 1, 1000, "weight");
                typeface = s1h1.a.I0(this.a, typeface, iP, zIsItalic);
                typeface.getClass();
            }
            textPaint.setTypeface(typeface);
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
