package p;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p9b0 extends Paint {
    public p9b0(PorterDuff.Mode mode) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            PointF pointF = itj0.a;
            super.setAlpha(Math.max(0, Math.min(255, i)));
        } else {
            int color = getColor();
            PointF pointF2 = itj0.a;
            setColor((Math.max(0, Math.min(255, i)) << 24) | (color & 16777215));
        }
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }
}
