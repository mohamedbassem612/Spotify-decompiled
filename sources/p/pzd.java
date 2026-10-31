package p;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pzd extends wic0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f116p;

    public pzd(Context context, int i) {
        super(context);
        this.f116p = i;
    }

    @Override // p.wic0
    public final int a(int i, int i2, int i3, int i4, int i5) {
        return ((((i4 - i3) - (i2 - i)) / 2) + i3) - i;
    }

    @Override // p.wic0
    public final float b(DisplayMetrics displayMetrics) {
        return super.b(displayMetrics) * 2.0f;
    }

    @Override // p.wic0
    public final PointF d(int i) {
        int iC = l1d.C(this.f116p);
        int i2 = 1;
        if (iC == 1) {
            i2 = -1;
        } else if (iC != 2) {
            i2 = 0;
        }
        return new PointF(i2, 0.0f);
    }
}
