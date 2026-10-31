package p;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kcg implements ufg1 {
    public final /* synthetic */ byte a = 0;

    public /* synthetic */ kcg() {
    }

    public final Bitmap a(Bitmap bitmap, Integer num, Integer num2) {
        switch (this.a) {
            case 0:
                int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
                int width = (bitmap.getWidth() - iMin) / 2;
                int height = (bitmap.getHeight() - iMin) / 2;
                float f = iMin / 2.0f;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                Paint paint = new Paint(1);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = new Matrix();
                matrix.setTranslate(-width, -height);
                bitmapShader.setLocalMatrix(matrix);
                paint.setShader(bitmapShader);
                new Canvas(bitmapCreateBitmap).drawCircle(f, f, f, paint);
                return bitmapCreateBitmap;
            default:
                int iJ = w5p1.j(new tfp0(bitmap).a());
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap2.setPixel(0, 0, iJ);
                return bitmapCreateBitmap2;
        }
    }

    public final String b() {
        switch (this.a) {
            case 0:
                return "circle";
            default:
                return "color_extract";
        }
    }

    public kcg(pob pobVar) {
    }
}
