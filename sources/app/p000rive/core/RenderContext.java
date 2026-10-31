package app.p000rive.core;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J*\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lapp/rive/core/RenderContext;", "Lapp/rive/core/CheckableAutoCloseable;", "<init>", "()V", "Lp/rih1;", "dispose", "close", "Lapp/rive/core/CloseableSurface;", "surface", "Lapp/rive/core/DrawKey;", "drawKey", "Lapp/rive/core/CommandQueue;", "commandQueue", "Lapp/rive/core/RiveSurface;", "createSurface-mDlYe8U$kotlin_release", "(Lapp/rive/core/CloseableSurface;JLapp/rive/core/CommandQueue;)Lapp/rive/core/RiveSurface;", "createSurface", "", "width", "height", "createImageSurface-i4dAsZ4$kotlin_release", "(IIJLapp/rive/core/CommandQueue;)Lapp/rive/core/RiveSurface;", "createImageSurface", "Lapp/rive/core/CloseOnce;", "closer", "Lapp/rive/core/CloseOnce;", "", "getNativeObjectPointer", "()J", "nativeObjectPointer", "", "getClosed", "()Z", "closed", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class RenderContext implements CheckableAutoCloseable {
    public static final int $stable = 8;
    private final CloseOnce closer = new CloseOnce("RenderContext", new RenderContext$closer$1(this));

    @Override // app.p000rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    /* JADX INFO: renamed from: createImageSurface-i4dAsZ4$kotlin_release, reason: not valid java name */
    public abstract RiveSurface mo400createImageSurfacei4dAsZ4$kotlin_release(int width, int height, long drawKey, CommandQueue commandQueue);

    /* JADX INFO: renamed from: createSurface-mDlYe8U$kotlin_release, reason: not valid java name */
    public abstract RiveSurface mo401createSurfacemDlYe8U$kotlin_release(CloseableSurface surface, long drawKey, CommandQueue commandQueue);

    public abstract void dispose();

    @Override // app.p000rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    public abstract long getNativeObjectPointer();
}
