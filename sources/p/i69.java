package p;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i69 {
    public TextView a;
    public TextPaint b;
    public float c;
    public int d;
    public float e;
    public float f;
    public float g;
    public boolean h;

    public static void b(Button button) {
        i69 i69Var = new i69();
        p96 p96Var = new p96(i69Var, (byte) 2);
        eg7 eg7Var = new eg7(i69Var, (byte) 1);
        float f = button.getContext().getResources().getDisplayMetrics().scaledDensity;
        i69Var.a = button;
        i69Var.b = new TextPaint();
        float textSize = button.getTextSize();
        if (i69Var.c != textSize) {
            i69Var.c = textSize;
        }
        TransformationMethod transformationMethod = button.getTransformationMethod();
        i69Var.d = (transformationMethod == null || !(transformationMethod instanceof SingleLineTransformationMethod)) ? button.getMaxLines() : 1;
        i69Var.e = f * 8.0f;
        i69Var.f = i69Var.c;
        i69Var.g = 0.5f;
        if (!i69Var.h) {
            i69Var.h = true;
            button.addTextChangedListener(p96Var);
            button.addOnLayoutChangeListener(eg7Var);
            i69Var.a();
        }
    }

    public static float c(CharSequence charSequence, TextPaint textPaint, float f, int i, float f2, float f3, float f4, DisplayMetrics displayMetrics) {
        StaticLayout staticLayout;
        int lineCount;
        CharSequence charSequence2;
        float lineWidth;
        float f5 = (f2 + f3) / 2.0f;
        textPaint.setTextSize(TypedValue.applyDimension(0, f5, displayMetrics));
        if (i != 1) {
            staticLayout = new StaticLayout(charSequence, textPaint, (int) f, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            lineCount = staticLayout.getLineCount();
        } else {
            staticLayout = null;
            lineCount = 1;
        }
        StaticLayout staticLayout2 = staticLayout;
        if (lineCount <= i) {
            if (lineCount < i) {
                return c(charSequence, textPaint, f, i, f5, f3, f4, displayMetrics);
            }
            if (i == 1) {
                charSequence2 = charSequence;
                lineWidth = textPaint.measureText(charSequence2, 0, charSequence.length());
            } else {
                charSequence2 = charSequence;
                lineWidth = 0.0f;
                for (int i2 = 0; i2 < lineCount; i2++) {
                    if (staticLayout2.getLineWidth(i2) > lineWidth) {
                        lineWidth = staticLayout2.getLineWidth(i2);
                    }
                }
            }
            float f6 = lineWidth;
            if (f3 - f2 >= f4) {
                if (f6 > f) {
                    return c(charSequence2, textPaint, f, i, f2, f5, f4, displayMetrics);
                }
                return f6 < f ? c(charSequence, textPaint, f, i, f5, f3, f4, displayMetrics) : f5;
            }
        } else if (f3 - f2 >= f4) {
            return c(charSequence, textPaint, f, i, f2, f5, f4, displayMetrics);
        }
        return f2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    public final void a() {
        int width;
        TextPaint textPaint;
        CharSequence charSequence;
        TextView textView = this.a;
        textView.getTextSize();
        TextPaint textPaint2 = this.b;
        float f = this.e;
        float fC = this.f;
        int i = this.d;
        float f2 = this.g;
        if (i > 0 && i != Integer.MAX_VALUE && (width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight()) > 0) {
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null) {
                text = transformationMethod.getTransformation(text, textView);
            }
            Context context = textView.getContext();
            Resources system = Resources.getSystem();
            if (context != null) {
                system = context.getResources();
            }
            DisplayMetrics displayMetrics = system.getDisplayMetrics();
            textPaint2.set(textView.getPaint());
            textPaint2.setTextSize(fC);
            if (i != 1 || textPaint2.measureText(text, 0, text.length()) <= width) {
                textPaint2.setTextSize(TypedValue.applyDimension(0, fC, displayMetrics));
                textPaint = textPaint2;
                charSequence = text;
                if (new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() > i) {
                }
                if (fC >= f) {
                    f = fC;
                }
                textView.setTextSize(0, f);
            } else {
                textPaint = textPaint2;
                charSequence = text;
            }
            fC = c(charSequence, textPaint, width, i, 0.0f, fC, f2, displayMetrics);
            if (fC >= f) {
                f = fC;
            }
            textView.setTextSize(0, f);
        }
        textView.getTextSize();
    }
}
