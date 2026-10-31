package p;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mr31 extends Drawable.ConstantState {
    public final Bitmap a;
    public final float b;
    public int c;
    public final BitmapShader d;
    public final Paint e;

    public mr31(Bitmap bitmap, float f) {
        this.a = bitmap;
        this.b = f;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.d = bitmapShader;
        Paint paint = new Paint(3);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(bitmapShader);
        this.e = paint;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new bcg(this.a, this.b);
    }
}
