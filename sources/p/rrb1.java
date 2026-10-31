package p;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rrb1 implements bar {
    public final k261 a;

    public rrb1(k261 k261Var) {
        this.a = k261Var;
    }

    @Override // p.bar
    public final car a(oka1 oka1Var, dqq0 dqq0Var) {
        ImageDecoder.Source sourceJ;
        Bitmap.Config configA = dz70.a(dqq0Var);
        if ((configA == Bitmap.Config.ARGB_8888 || configA == Bitmap.Config.HARDWARE) && (sourceJ = d55.j(oka1Var.a, dqq0Var, false)) != null) {
            return new trb1(sourceJ, oka1Var.a, dqq0Var, this.a);
        }
        return null;
    }
}
