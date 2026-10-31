package p;

import android.media.ImageReader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wkb0 implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ ohd a;

    public wkb0(ohd ohdVar) {
        this.a = ohdVar;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        this.a.resumeWith(imageReader.acquireLatestImage());
    }
}
