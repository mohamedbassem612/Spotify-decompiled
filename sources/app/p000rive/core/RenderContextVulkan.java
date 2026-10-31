package app.p000rive.core;

import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u0004J*\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0010ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J2\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0010ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Lapp/rive/core/RenderContextVulkan;", "Lapp/rive/core/RenderContext;", "Lapp/rive/core/CheckableAutoCloseable;", "<init>", "()V", "", "enableDebugNames", "", "cppConstructor", "(Z)J", "pointer", "Lp/rih1;", "cppDelete", "(J)V", "dispose", "Lapp/rive/core/CloseableSurface;", "surface", "Lapp/rive/core/DrawKey;", "drawKey", "Lapp/rive/core/CommandQueue;", "commandQueue", "Lapp/rive/core/RiveSurface;", "createSurface-mDlYe8U$kotlin_release", "(Lapp/rive/core/CloseableSurface;JLapp/rive/core/CommandQueue;)Lapp/rive/core/RiveSurface;", "createSurface", "", "width", "height", "createImageSurface-i4dAsZ4$kotlin_release", "(IIJLapp/rive/core/CommandQueue;)Lapp/rive/core/RiveSurface;", "createImageSurface", "Lapp/rive/core/UniquePointer;", "cppPointer", "Lapp/rive/core/UniquePointer;", "getNativeObjectPointer", "()J", "nativeObjectPointer", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RenderContextVulkan extends RenderContext implements CheckableAutoCloseable {
    public static final String TAG = "Rive/RenderContextVulkan";
    private final UniquePointer cppPointer = new UniquePointer(cppConstructor(RenderContextKt.supportsVulkanDebugNames(Build.HARDWARE)), TAG, new RenderContextVulkan$cppPointer$1(this));
    public static final int $stable = 8;

    private final native long cppConstructor(boolean enableDebugNames);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppDelete(long pointer);

    @Override // app.p000rive.core.RenderContext
    /* JADX INFO: renamed from: createImageSurface-i4dAsZ4$kotlin_release */
    public RiveSurface mo400createImageSurfacei4dAsZ4$kotlin_release(int width, int height, long drawKey, CommandQueue commandQueue) {
        return RiveSurfaceVulkanImage.INSTANCE.m433createGaSJWX4$kotlin_release(this, width, height, commandQueue, drawKey);
    }

    @Override // app.p000rive.core.RenderContext
    /* JADX INFO: renamed from: createSurface-mDlYe8U$kotlin_release */
    public RiveSurface mo401createSurfacemDlYe8U$kotlin_release(CloseableSurface surface, long drawKey, CommandQueue commandQueue) {
        return RiveSurfaceVulkan.INSTANCE.m432createSnmYj8w$kotlin_release(this, surface, commandQueue, drawKey);
    }

    @Override // app.p000rive.core.RenderContext
    public void dispose() {
        this.cppPointer.close();
    }

    @Override // app.p000rive.core.RenderContext
    public long getNativeObjectPointer() {
        return this.cppPointer.getPointer();
    }
}
