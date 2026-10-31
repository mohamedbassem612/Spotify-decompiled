package p;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fr31 implements ufg1 {
    public final Integer a;

    public fr31(Integer num) {
        this.a = num;
    }

    public final Bitmap a(Bitmap bitmap, Integer num, Integer num2) {
        int iIntValue = num != null ? num.intValue() : bitmap.getWidth();
        Integer num3 = this.a;
        float fIntValue = num3 != null ? num3.intValue() : iIntValue * 0.1f;
        Paint paint = new Paint(3);
        int iIntValue2 = num != null ? num.intValue() : bitmap.getWidth();
        int iIntValue3 = num2 != null ? num2.intValue() : bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue2, iIntValue3, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        float fMax = (float) Math.max(((double) iIntValue2) / ((double) bitmap.getWidth()), ((double) iIntValue3) / ((double) bitmap.getHeight()));
        matrix.setTranslate(ktd.e(fMax, bitmap.getWidth(), iIntValue2, 2.0f), ktd.e(fMax, bitmap.getHeight(), iIntValue3, 2.0f));
        matrix.preScale(fMax, fMax);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float[] fArr = {fIntValue, fIntValue, fIntValue, fIntValue, fIntValue, fIntValue, fIntValue, fIntValue};
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return bitmapCreateBitmap;
    }

    public final String b() {
        return "rounded_corner(radius=" + this.a + ")";
    }
}
