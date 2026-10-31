package p;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.TextView;
import com.comscore.streaming.WindowState;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class al5 {
    public final TextView a;
    public final dkl b;
    public Typeface c;
    public Typeface d;
    public String e;

    public al5(TextView textView, dkl dklVar) {
        this.a = textView;
        this.b = dklVar;
    }

    public final String a() {
        return this.e;
    }

    public final Typeface b() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    public final boolean c(String str) {
        int iB;
        String fontVariationSettings;
        boolean z;
        FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings;
        Typeface typeface = this.c;
        TextView textView = this.a;
        TextPaint paint = textView.getPaint();
        if (this.d != paint.getTypeface()) {
            typeface = paint.getTypeface();
        }
        if (Build.VERSION.SDK_INT < 31 || (iB = eg.b(textView.getContext().getResources().getConfiguration())) == Integer.MAX_VALUE) {
            iB = 0;
        }
        if (iB == Integer.MAX_VALUE) {
            iB = 0;
        }
        yk5 yk5Var = new yk5(typeface, str, iB);
        ydf0 ydf0Var = zk5.a;
        Typeface typeface2 = (Typeface) ydf0Var.c(yk5Var);
        if (typeface2 != null) {
            z = true;
        } else {
            Paint paint2 = zk5.b;
            if (paint2 == null) {
                paint2 = new Paint();
                zk5.b = paint2;
            }
            if (iB != 0) {
                if (TextUtils.isEmpty(str)) {
                    fontVariationAxisArrFromFontVariationSettings = new FontVariationAxis[0];
                } else {
                    fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(str);
                    if (fontVariationAxisArrFromFontVariationSettings == null) {
                        fontVariationSettings = str;
                        z = true;
                    }
                }
                int i = 0;
                boolean z2 = false;
                while (true) {
                    if (i >= fontVariationAxisArrFromFontVariationSettings.length) {
                        break;
                    }
                    FontVariationAxis fontVariationAxis = fontVariationAxisArrFromFontVariationSettings[i];
                    if ("wght".equals(fontVariationAxis.getTag())) {
                        float styleValue = fontVariationAxis.getStyleValue() + iB;
                        fontVariationAxisArrFromFontVariationSettings[i] = new FontVariationAxis("wght", styleValue >= 1.0f ? Math.min(styleValue, 1000.0f) : 1.0f);
                        z2 = true;
                    }
                    i++;
                }
                z = true;
                if (!z2) {
                    FontVariationAxis[] fontVariationAxisArr = new FontVariationAxis[fontVariationAxisArrFromFontVariationSettings.length + 1];
                    System.arraycopy(fontVariationAxisArrFromFontVariationSettings, 0, fontVariationAxisArr, 0, fontVariationAxisArrFromFontVariationSettings.length);
                    int length = fontVariationAxisArrFromFontVariationSettings.length;
                    float f = iB + WindowState.NORMAL;
                    fontVariationAxisArr[length] = new FontVariationAxis("wght", f >= 1.0f ? Math.min(f, 1000.0f) : 1.0f);
                    fontVariationAxisArrFromFontVariationSettings = fontVariationAxisArr;
                }
                fontVariationSettings = FontVariationAxis.toFontVariationSettings(fontVariationAxisArrFromFontVariationSettings);
            } else {
                fontVariationSettings = str;
                z = true;
            }
            if (Objects.equals(paint2.getFontVariationSettings(), fontVariationSettings)) {
                paint2.setFontVariationSettings(null);
            }
            paint2.setTypeface(typeface);
            if (paint2.setFontVariationSettings(fontVariationSettings)) {
                typeface2 = paint2.getTypeface();
                ydf0Var.d(yk5Var, typeface2);
            } else {
                typeface2 = null;
            }
        }
        if (typeface2 == null) {
            return false;
        }
        this.d = typeface2;
        this.b.accept(typeface2);
        this.e = str;
        return z;
    }

    public final void d(Typeface typeface) {
        this.c = typeface;
        this.d = typeface;
        this.b.accept(typeface);
    }
}
