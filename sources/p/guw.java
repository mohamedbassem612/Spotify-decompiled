package p;

import android.content.Context;
import android.graphics.Color;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class guw {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public guw(Context context) {
        boolean zP = xfo1.p(context, 2130969188, false);
        int iO = ago1.o(context, 2130969187, 0);
        int iO2 = ago1.o(context, 2130969186, 0);
        int iO3 = ago1.o(context, 2130969040, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = zP;
        this.b = iO;
        this.c = iO2;
        this.d = iO3;
        this.e = f2;
    }

    public final int a(float f2, int i) {
        int i2;
        if (!this.a || uah.l(i, 255) != this.d) {
            return i;
        }
        float f3 = this.e;
        float fMin = (f3 <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / f3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iS = ago1.s(uah.l(i, 255), this.b, fMin);
        if (fMin > 0.0f && (i2 = this.c) != 0) {
            iS = ago1.r(iS, uah.l(i2, f));
        }
        return uah.l(iS, iAlpha);
    }
}
