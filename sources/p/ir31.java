package p;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ir31 extends ViewOutlineProvider {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ir31(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = Build.VERSION.SDK_INT;
        float f = this.d;
        float f2 = this.c;
        float f3 = this.b;
        float fMax = this.a;
        if (i >= 33) {
            Path path = new Path();
            path.addRoundRect(new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight()), new float[]{fMax, fMax, f3, f3, f2, f2, f, f}, Path.Direction.CW);
            outline.setPath(path);
        } else {
            Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
            float[] fArr = {f3, f2, f};
            for (int i2 = 0; i2 < 3; i2++) {
                fMax = Math.max(fMax, fArr[i2]);
            }
            outline.setRoundRect(rect, fMax);
        }
    }
}
