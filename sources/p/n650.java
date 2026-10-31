package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n650 {
    public final int a;
    public LinearGradient b;
    public final Paint c = new Paint(1);
    public final Paint d;
    public int e;
    public int f;
    public int g;

    public n650(Context context) {
        Paint paint = new Paint();
        this.d = paint;
        int iT = foo1.t(context, 2130969949);
        paint.setColor(iT);
        this.a = iT;
    }

    public final void a(Canvas canvas) {
        if (this.b != null) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.g);
            canvas.drawRect(0.0f, 0.0f, this.f, this.e, this.c);
            canvas.restoreToCount(iSave);
        }
    }

    public final void b(int i, int i2) {
        this.f = i;
        if (this.e != i2) {
            this.e = i2;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.e, 0, this.a, Shader.TileMode.CLAMP);
            this.b = linearGradient;
            this.c.setShader(linearGradient);
        }
    }
}
