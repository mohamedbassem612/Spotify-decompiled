package p;

import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class npi1 {
    public static DisplayMetrics a = null;
    public static int b = 50;
    public static int c = 8000;
    public static final Rect d;
    public static final Paint.FontMetrics e;
    public static final Rect f;
    public static final yeb0 g;
    public static final Rect h;
    public static final Paint.FontMetrics i;

    static {
        Double.longBitsToDouble(1L);
        Float.intBitsToFloat(1);
        d = new Rect();
        e = new Paint.FontMetrics();
        f = new Rect();
        g = new yeb0(1);
        new Rect();
        h = new Rect();
        i = new Paint.FontMetrics();
    }

    public static int a(Paint paint, String str) {
        Rect rect = d;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static zc10 b(Paint paint, String str) {
        zc10 zc10Var = (zc10) zc10.d.b();
        zc10Var.b = 0.0f;
        zc10Var.c = 0.0f;
        Rect rect = f;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        zc10Var.b = rect.width();
        zc10Var.c = rect.height();
        return zc10Var;
    }

    public static float c(float f2) {
        DisplayMetrics displayMetrics = a;
        return displayMetrics == null ? f2 : f2 * displayMetrics.density;
    }

    public static float d(double d2) {
        if (Double.isInfinite(d2) || Double.isNaN(d2) || d2 == 0.0d) {
            return 0.0f;
        }
        float fPow = (float) Math.pow(10.0d, 1 - ((int) Math.ceil((float) Math.log10(d2 < 0.0d ? -d2 : d2))));
        return Math.round(d2 * ((double) fPow)) / fPow;
    }
}
