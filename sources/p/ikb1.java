package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ikb1 implements ufg1 {
    public final int a;
    public final int b;

    public ikb1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final Bitmap a(Bitmap bitmap, Integer num, Integer num2) {
        double height = ((double) bitmap.getHeight()) / ((double) bitmap.getWidth());
        int i = this.a;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, (int) (((double) i) * height), true);
        int height2 = bitmapCreateScaledBitmap.getHeight();
        int i2 = this.b;
        if (height2 <= i2) {
            return bitmapCreateScaledBitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap, 0, 0, bitmapCreateScaledBitmap.getWidth(), i2);
        if (bitmapCreateScaledBitmap != bitmap && bitmapCreateBitmap != bitmapCreateScaledBitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public final String b() {
        return cy30.i(this.a, "scale-crop-transformation-", this.b, "x");
    }
}
