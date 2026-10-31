package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ow70 implements ufg1 {
    public final Context a;
    public final boolean b;

    public ow70(Context context, boolean z) {
        this.a = context;
        this.b = z;
    }

    public final Bitmap a(Bitmap bitmap, Integer num, Integer num2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        config.getClass();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        Matrix matrix = new Matrix();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Drawable drawable = this.a.getDrawable(2131231220);
        if (drawable == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        Rect clipBounds = canvas.getClipBounds();
        float fCenterX = clipBounds.centerX();
        float fCenterY = clipBounds.centerY();
        int iMin = Math.min(canvas.getWidth(), canvas.getHeight()) / 2;
        matrix.postTranslate(-fCenterX, -fCenterY);
        bitmapShader.setLocalMatrix(matrix);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(bitmapShader);
        canvas.save();
        canvas.translate(fCenterX, fCenterY);
        int i = -iMin;
        drawable.setBounds(i, i, iMin, iMin);
        drawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(fCenterX, fCenterY);
        canvas.scale(0.63f, 0.63f);
        if (this.b) {
            canvas.drawCircle(0.0f, 0.0f, iMin, paint);
        } else {
            float f = iMin;
            float f2 = -f;
            canvas.drawRect(f2, f2, f, f, paint);
        }
        canvas.restore();
        return bitmapCreateBitmap;
    }

    public final String b() {
        return "RippleListItemTransformation" + (this.b ? '1' : '0');
    }
}
