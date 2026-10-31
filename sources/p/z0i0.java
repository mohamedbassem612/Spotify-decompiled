package p;

import android.graphics.Bitmap;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class z0i0 implements su30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z0i0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((d1i0) obj2).m((Throwable) obj);
                return Boolean.FALSE;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                u280 u280Var = (u280) ((nn61) obj2).c;
                if (!u280Var.a(Math.max(height, width))) {
                    return bitmap;
                }
                if (u280Var.a(height)) {
                    height--;
                }
                if (u280Var.a(width)) {
                    width--;
                }
                return mb4.y(Bitmap.createScaledBitmap(bitmap, width, height, true));
            default:
                Bitmap bitmapCreateScaledBitmap = (Bitmap) obj;
                int width2 = bitmapCreateScaledBitmap.getWidth();
                int i = ((sw9) obj2).b;
                if (width2 > i || bitmapCreateScaledBitmap.getHeight() > i) {
                    float f = i;
                    float width3 = bitmapCreateScaledBitmap.getWidth();
                    float height2 = bitmapCreateScaledBitmap.getHeight();
                    float fMin = Math.min(f / width3, f / height2);
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, (int) (width3 * fMin), (int) (height2 * fMin), true);
                }
                return mb4.y(bitmapCreateScaledBitmap);
        }
    }
}
