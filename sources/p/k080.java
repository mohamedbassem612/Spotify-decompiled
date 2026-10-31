package p;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k080 implements ImageDecoder$OnHeaderDecodedListener {
    public final /* synthetic */ n080 a;

    public k080(n080 n080Var) {
        this.a = n080Var;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        int i;
        imageDecoder.setAllocator(1);
        int width = imageInfo.getSize().getWidth();
        int height = imageInfo.getSize().getHeight();
        this.a.getClass();
        int iMax = Math.max(width, height);
        if (iMax <= 3072) {
            i = 1;
        } else {
            i = 1;
            while (iMax / i > 3072) {
                i *= 2;
            }
        }
        if (i > 1) {
            imageDecoder.setTargetSampleSize(i);
        }
        imageInfo.getSize().getWidth();
        imageInfo.getSize().getHeight();
    }
}
