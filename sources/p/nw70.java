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
public final class nw70 implements ufg1 {
    public final Context a;
    public final int b;

    public nw70(Context context, boolean z) {
        this.a = context;
        this.b = z ? 2 : 1;
    }

    public final Bitmap a(Bitmap bitmap, Integer num, Integer num2) {
        int i;
        u441 s441Var;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        config.getClass();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        Matrix matrix = new Matrix();
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        int i2 = this.b;
        if (i2 == 1) {
            i = 2131233150;
        } else {
            if (i2 != 2) {
                throw null;
            }
            i = 2131233149;
        }
        Drawable drawable = this.a.getDrawable(i);
        if (drawable == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        try {
            s441Var = new u441(new tfp0(bitmap).a());
        } catch (Exception unused) {
            s441Var = new s441();
        }
        int i3 = s441Var.i();
        if (i3 == -65281) {
            i3 = s441Var.l();
        }
        Rect clipBounds = canvas.getClipBounds();
        float fCenterX = clipBounds.centerX();
        float fCenterY = clipBounds.centerY();
        int iU = jch0.U(Math.min(canvas.getWidth(), canvas.getHeight()) / 2.0f);
        matrix.preTranslate(-fCenterX, -fCenterY);
        bitmapShader.setLocalMatrix(matrix);
        canvas.drawColor(i3);
        canvas.save();
        canvas.translate(fCenterX, fCenterY);
        int i4 = -iU;
        drawable.setBounds(i4, i4, iU, iU);
        drawable.draw(canvas);
        canvas.restore();
        canvas.save();
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(bitmapShader);
        canvas.translate(fCenterX, fCenterY);
        canvas.scale(0.5f, 0.5f);
        float f = iU;
        if (i2 != 1) {
            canvas.drawCircle(0.0f, 0.0f, f, paint);
        } else {
            float f2 = -f;
            canvas.drawRect(f2, f2, f, f, paint);
        }
        canvas.restore();
        return bitmapCreateBitmap;
    }

    public final String b() {
        String str;
        StringBuilder sb = new StringBuilder("GlueRadioCardRippleTransformation (");
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "null" : "CIRCLE";
        } else {
            str = "SQUARE";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
