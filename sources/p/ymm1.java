package p;

import android.graphics.Paint;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ymm1 extends wc9 {
    public final int x;

    public ymm1(int i) {
        this.x = i;
        this.b = 0.0f;
    }

    @Override // p.wc9
    public final void a(float f, float f2) {
        if (this.s) {
            f = this.v;
        }
        if (this.t) {
            f2 = this.u;
        }
        float fAbs = Math.abs(f2 - f);
        if (fAbs == 0.0f) {
            f2 += 1.0f;
            f -= 1.0f;
        }
        if (!this.s) {
            this.v = f - ((fAbs / 100.0f) * 10.0f);
        }
        if (!this.t) {
            this.u = ((fAbs / 100.0f) * 10.0f) + f2;
        }
        this.w = Math.abs(this.u - this.v);
    }

    public final float c(Paint paint) {
        paint.setTextSize(this.c);
        String strB = b();
        DisplayMetrics displayMetrics = npi1.a;
        return Math.max(0.0f, Math.min((this.a * 2.0f) + ((int) paint.measureText(strB)), Float.POSITIVE_INFINITY));
    }
}
