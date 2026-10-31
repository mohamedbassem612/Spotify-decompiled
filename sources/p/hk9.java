package p;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hk9 extends xjm1 {
    public final zdk1 Q0;

    public hk9(zdk1 zdk1Var, wjm1 wjm1Var, vi11 vi11Var) {
        super(zdk1Var, wjm1Var, vi11Var);
        this.Q0 = zdk1Var;
    }

    @Override // p.xjm1
    public final void y1(Canvas canvas) {
        this.i.getClass();
        zdk1 zdk1Var = this.Q0;
        float f = zdk1Var.d - 39.0f;
        RectF rectF = zdk1Var.b;
        float f2 = rectF.left;
        float f3 = f - 3.0f;
        float f4 = rectF.right;
        LinearGradient linearGradient = new LinearGradient(f2, f3, f4, f, Color.parseColor("#AE93C3"), Color.parseColor("#91EEDA"), Shader.TileMode.CLAMP);
        Paint paint = this.g;
        paint.setShader(linearGradient);
        this.f.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(f2, f3, f4, f, 22.0f, 22.0f, paint);
    }
}
