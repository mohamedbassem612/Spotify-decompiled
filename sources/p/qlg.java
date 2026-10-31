package p;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qlg extends MetricAffectingSpan {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ qlg(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public void a(TextPaint textPaint) {
        Typeface typefaceCreate = (Typeface) this.b;
        if (typefaceCreate == null) {
            return;
        }
        Typeface typeface = textPaint.getTypeface();
        if (typeface != null) {
            int style = typeface.getStyle();
            if (typefaceCreate.getStyle() != style) {
                typefaceCreate = Typeface.create(typefaceCreate, style);
            }
            this.b = typefaceCreate;
        }
        textPaint.setTypeface(typefaceCreate);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setTypeface((Typeface) this.b);
                break;
            case 1:
                a(textPaint);
                break;
            case 2:
                textPaint.setTypeface((Typeface) this.b);
                break;
            default:
                textPaint.setFontFeatureSettings((String) this.b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setTypeface((Typeface) this.b);
                break;
            case 1:
                a(textPaint);
                break;
            case 2:
                textPaint.setTypeface((Typeface) this.b);
                break;
            default:
                textPaint.setFontFeatureSettings((String) this.b);
                break;
        }
    }
}
