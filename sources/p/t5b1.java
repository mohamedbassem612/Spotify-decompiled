package p;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.icu.text.UnicodeSet;
import android.os.Build;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class t5b1 {
    public static final float a;

    static {
        uwr uwrVar = cbx.a;
        Object obj = ajx.a.b;
        a = 1.5625f;
    }

    public static final void a(Paint paint, Context context, String str, Typeface typeface) {
        Typeface typefaceD = d(context, str);
        if (Build.VERSION.SDK_INT >= 26) {
            paint.setFontVariationSettings(null);
        }
        if (typefaceD != null) {
            typeface = typefaceD;
        }
        paint.setTypeface(typeface);
        paint.setTextScaleX(typefaceD != null ? 1.0f : a);
    }

    public static final void b(TextView textView, String str, Typeface typeface) {
        Typeface typefaceD = d(textView.getContext(), str);
        if (Build.VERSION.SDK_INT >= 26) {
            textView.setFontVariationSettings(null);
        }
        if (typefaceD != null) {
            typeface = typefaceD;
        }
        textView.setTypeface(typeface);
        textView.setTextScaleX(typefaceD != null ? 1.0f : a);
    }

    public static final void c(TextView textView) {
        textView.setTextScaleX(1.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            textView.setFontVariationSettings(null);
        }
    }

    public static final Typeface d(Context context, CharSequence charSequence) {
        Typeface typeface;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            UnicodeSet unicodeSet = new UnicodeSet();
            unicodeSet.addAll(9, 10);
            unicodeSet.add(13);
            unicodeSet.addAll(32, 126);
            unicodeSet.addAll(160, 172);
            unicodeSet.addAll(174, 311);
            unicodeSet.addAll(313, 328);
            unicodeSet.addAll(330, 382);
            unicodeSet.add(399);
            unicodeSet.addAll(416, 417);
            unicodeSet.addAll(431, 432);
            unicodeSet.addAll(461, 468);
            unicodeSet.addAll(486, 487);
            unicodeSet.addAll(500, 501);
            unicodeSet.addAll(506, 511);
            unicodeSet.addAll(536, 539);
            unicodeSet.addAll(550, 551);
            unicodeSet.addAll(562, 563);
            unicodeSet.add(567);
            unicodeSet.add(601);
            unicodeSet.add(700);
            unicodeSet.addAll(710, 711);
            unicodeSet.addAll(728, 733);
            unicodeSet.addAll(768, 772);
            unicodeSet.addAll(774, 780);
            unicodeSet.add(786);
            unicodeSet.add(795);
            unicodeSet.add(803);
            unicodeSet.addAll(806, 808);
            unicodeSet.addAll(821, 824);
            unicodeSet.add(3647);
            unicodeSet.addAll(7692, 7693);
            unicodeSet.addAll(7712, 7713);
            unicodeSet.addAll(7716, 7717);
            unicodeSet.addAll(7734, 7735);
            unicodeSet.addAll(7748, 7749);
            unicodeSet.addAll(7766, 7767);
            unicodeSet.addAll(7778, 7779);
            unicodeSet.addAll(7788, 7789);
            unicodeSet.addAll(7808, 7813);
            unicodeSet.addAll(7818, 7821);
            unicodeSet.addAll(7826, 7827);
            unicodeSet.add(7838);
            unicodeSet.addAll(7840, 7929);
            unicodeSet.addAll(8194, 8195);
            unicodeSet.addAll(8201, 8202);
            unicodeSet.addAll(8208, 8209);
            unicodeSet.addAll(8211, 8213);
            unicodeSet.addAll(8216, 8218);
            unicodeSet.addAll(8220, 8222);
            unicodeSet.addAll(8224, 8226);
            jup0.j(unicodeSet, 8230, 8232, 8233, 8239);
            unicodeSet.add(8240);
            unicodeSet.addAll(8242, 8243);
            unicodeSet.addAll(8249, 8250);
            unicodeSet.add(8260);
            unicodeSet.add(8304);
            unicodeSet.addAll(8308, 8313);
            unicodeSet.addAll(8320, 8329);
            jup0.j(unicodeSet, 8358, 8361, 8362, 8364);
            jup0.j(unicodeSet, 8372, 8376, 8378, 8381);
            unicodeSet.add(8383);
            unicodeSet.add(8467);
            unicodeSet.addAll(8470, 8471);
            unicodeSet.add(8482);
            unicodeSet.add(8486);
            unicodeSet.addAll(8544, 8553);
            unicodeSet.addAll(8556, 8559);
            unicodeSet.addAll(8592, 8595);
            unicodeSet.addAll(8598, 8601);
            unicodeSet.add(8706);
            unicodeSet.add(8710);
            jup0.j(unicodeSet, 8719, 8721, 8722, 8725);
            unicodeSet.add(8730);
            unicodeSet.add(8734);
            unicodeSet.add(8747);
            unicodeSet.add(8776);
            jup0.j(unicodeSet, 8800, 8804, 8805, 42889);
            unicodeSet.addAll(64257, 64258);
            if (unicodeSet.containsAll(charSequence.toString())) {
                if (i < 29) {
                    String str = s5b1.a;
                    return null;
                }
                if (s5b1.c) {
                    return s5b1.d;
                }
                synchronized (s5b1.b) {
                    try {
                        if (!s5b1.c) {
                            s5b1.d = s5b1.a(context);
                            s5b1.c = true;
                        }
                        typeface = s5b1.d;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return typeface;
            }
        }
        return null;
    }
}
