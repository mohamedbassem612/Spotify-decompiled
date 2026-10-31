package p;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.RuntimeShader;
import android.graphics.Shader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ol10 {
    public static final idd1 a = new idd1(ny00.Z);

    public static final void a(Paint paint, n511 n511Var, float f, float f2, float f3, long j, Bitmap bitmap) {
        RuntimeShader runtimeShader = (RuntimeShader) paint.getShader();
        float f4 = n511Var.a;
        float f5 = n511Var.b;
        runtimeShader.setFloatUniform("rectOrigin", f4 - 0.0f, f5);
        runtimeShader.setFloatUniform("rectSize", (n511Var.c - f4) + 0.0f, n511Var.d - f5);
        runtimeShader.setFloatUniform("cornerRadius", f);
        runtimeShader.setFloatUniform("innerFullOpacityRadius", f2);
        runtimeShader.setFloatUniform("outerFeatherRadius", f3);
        runtimeShader.setFloatUniform("fillColor", u7h.g(j), u7h.f(j), u7h.d(j), u7h.c(j));
        runtimeShader.setFloatUniform("noiseStrength", bitmap != null ? 1.0f : 0.0f);
        if (bitmap == null) {
            bitmap = (Bitmap) a.getValue();
        }
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        runtimeShader.setInputShader("noiseTexture", new BitmapShader(bitmap, tileMode, tileMode));
    }
}
