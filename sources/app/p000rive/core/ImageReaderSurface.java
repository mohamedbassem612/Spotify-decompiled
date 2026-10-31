package app.p000rive.core;

import android.media.ImageReader;
import android.view.Surface;
import kotlin.Metadata;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lapp/rive/core/ImageReaderSurface;", "Lapp/rive/core/CloseableSurface;", "Landroid/media/ImageReader;", "imageReader", "<init>", "(Landroid/media/ImageReader;)V", "Lp/rih1;", "close", "()V", "Landroid/media/ImageReader;", "Landroid/view/Surface;", "surface", "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "", "width", "I", "getWidth", "()I", "height", "getHeight", "", "resizable", "Z", "getResizable", "()Z", "Lapp/rive/core/CloseOnce;", "closer", "Lapp/rive/core/CloseOnce;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ImageReaderSurface implements CloseableSurface {
    public static final int $stable = 8;
    private final CloseOnce closer;
    private final int height;
    private final ImageReader imageReader;
    private final boolean resizable;
    private final Surface surface;
    private final int width;

    public ImageReaderSurface(ImageReader imageReader) {
        this.imageReader = imageReader;
        this.surface = imageReader.getSurface();
        this.width = imageReader.getWidth();
        this.height = imageReader.getHeight();
        if (getWidth() <= 0 || getHeight() <= 0) {
            hhg1.n("ImageReaderSurface requires a positive width and height.");
            throw null;
        }
        this.closer = new CloseOnce("ImageReaderSurface", new ImageReaderSurface$closer$1(this));
    }

    @Override // app.p000rive.core.CloseableSurface, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    @Override // app.p000rive.core.CloseableSurface
    public int getHeight() {
        return this.height;
    }

    @Override // app.p000rive.core.CloseableSurface
    public boolean getResizable() {
        return this.resizable;
    }

    @Override // app.p000rive.core.CloseableSurface
    public Surface getSurface() {
        return this.surface;
    }

    @Override // app.p000rive.core.CloseableSurface
    public int getWidth() {
        return this.width;
    }
}
