package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lxa implements yx70 {
    public final Bitmap a;

    public lxa(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapImageProvider(bitmap=Bitmap(");
        Bitmap bitmap = this.a;
        sb.append(bitmap.getWidth());
        sb.append("px x ");
        sb.append(bitmap.getHeight());
        sb.append("px))");
        return sb.toString();
    }
}
