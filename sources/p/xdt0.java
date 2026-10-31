package p;

import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xdt0 implements wae1 {
    public final TextPaint a;

    public xdt0(lee1 lee1Var, wat watVar, Typeface typeface) {
        TextPaint textPaint = new TextPaint(129);
        textPaint.setTypeface(typeface);
        zma1 zma1Var = lee1Var.a;
        textPaint.setTextSize(watVar.q0(zma1Var.b));
        textPaint.setFontFeatureSettings(zma1Var.g);
        this.a = textPaint;
    }

    public final float a(StringBuilder sb) {
        return this.a.measureText(sb, 0, sb.length());
    }
}
