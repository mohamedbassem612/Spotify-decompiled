package p;

import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jx40 extends View implements jw40, hd {
    @Override // p.jw40
    public int getTotalScrollRange() {
        return 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, 1073741824));
    }

    @Override // p.jw40
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setCoordinatorAccessoryOffset(int i) {
    }

    @Override // p.xt41
    public final void a(float f, int i) {
    }
}
