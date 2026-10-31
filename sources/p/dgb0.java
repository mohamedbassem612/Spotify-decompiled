package p;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dgb0 implements ufg1 {
    public final int a;
    public final float b;
    public final int c;

    public dgb0(Resources resources) {
        int iU = jch0.U(resources.getDimension(2131166996));
        this.a = iU;
        float dimension = resources.getDimension(2131166994);
        this.b = dimension;
        this.c = jch0.U(iU - (dimension * 2.0f));
    }

    public final Bitmap a(Bitmap bitmap, Integer num, Integer num2) {
        float fMin = this.c / Math.min(bitmap.getWidth(), bitmap.getHeight());
        float width = ((bitmap.getWidth() - bitmap.getHeight()) * fMin) / 2.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        float f = width < 0.0f ? 0.0f : width;
        float f2 = this.b;
        float f3 = -width;
        matrix.postTranslate(f2 - f, f2 - (f3 >= 0.0f ? f3 : 0.0f));
        int i = this.a;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-16777216);
        canvas.drawBitmap(bitmap, matrix, null);
        return bitmapCreateBitmap;
    }

    public final String b() {
        return "AdaptiveIconTransformation:" + this.a + ":" + this.b;
    }
}
