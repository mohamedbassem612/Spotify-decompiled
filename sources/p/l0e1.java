package p;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.TextAppearanceSpan;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l0e1 extends MetricAffectingSpan {
    public final TextAppearanceSpan a;
    public final qlg b;
    public final int c;

    public l0e1(Context context, int i, int i2) {
        int[] iArr = {R.attr.fontFamily};
        this.a = new TextAppearanceSpan(context, i);
        this.c = i2;
        if (Build.VERSION.SDK_INT > 26) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        Typeface typefaceB = null;
        try {
            if (resourceId > 0) {
                try {
                    typefaceB = qx21.b(context, resourceId);
                } catch (Resources.NotFoundException unused) {
                    n57.e("TextAppearanceSpanCompat:: Font cannot be loaded.");
                }
                typedArrayObtainStyledAttributes.recycle();
            }
            if (typefaceB != null) {
                qlg qlgVar = new qlg();
                qlgVar.b = typefaceB;
                this.b = qlgVar;
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.a.updateDrawState(textPaint);
        qlg qlgVar = this.b;
        if (qlgVar != null) {
            qlgVar.a(textPaint);
        }
        int i = this.c;
        if (i != -1) {
            textPaint.setColor(i);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.a.updateMeasureState(textPaint);
        qlg qlgVar = this.b;
        if (qlgVar != null) {
            qlgVar.a(textPaint);
        }
        int i = this.c;
        if (i != -1) {
            textPaint.setColor(i);
        }
    }

    public /* synthetic */ l0e1(Context context, int i) {
        this(context, i, -1);
    }
}
