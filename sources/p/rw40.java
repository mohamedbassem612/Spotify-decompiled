package p;

import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rw40 extends LayerDrawable implements xt41 {
    @Override // p.xt41
    public final void a(float f, int i) {
        if (getDrawable(0) instanceof xt41) {
            ((xt41) getDrawable(0)).a(f, i);
        }
        if (getDrawable(1) instanceof xt41) {
            ((xt41) getDrawable(1)).a(f, i);
        }
    }
}
