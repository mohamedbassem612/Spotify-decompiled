package app.p000rive.core;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import kotlin.Metadata;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lapp/rive/core/SurfaceTextureSurface;", "Lapp/rive/core/CloseableSurface;", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "", "width", "height", "<init>", "(Landroid/graphics/SurfaceTexture;II)V", "Lp/rih1;", "close", "()V", "Landroid/graphics/SurfaceTexture;", "I", "getWidth", "()I", "getHeight", "Landroid/view/Surface;", "surface", "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "", "resizable", "Z", "getResizable", "()Z", "Lapp/rive/core/CloseOnce;", "closer", "Lapp/rive/core/CloseOnce;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SurfaceTextureSurface implements CloseableSurface {
    public static final int $stable = 8;
    private final CloseOnce closer;
    private final int height;
    private final boolean resizable;
    private final Surface surface;
    private final SurfaceTexture surfaceTexture;
    private final int width;

    public SurfaceTextureSurface(SurfaceTexture surfaceTexture, int i, int i2) {
        this.surfaceTexture = surfaceTexture;
        this.width = i;
        this.height = i2;
        if (getWidth() <= 0 || getHeight() <= 0) {
            hhg1.n("SurfaceTextureSurface requires a positive width and height.");
            throw null;
        }
        this.surface = new Surface(surfaceTexture);
        this.resizable = true;
        this.closer = new CloseOnce("SurfaceTextureSurface", new SurfaceTextureSurface$closer$1(this));
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
