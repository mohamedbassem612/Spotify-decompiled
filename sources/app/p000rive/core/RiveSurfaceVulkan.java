package app.p000rive.core;

import android.view.Surface;
import app.p000rive.RiveRenderException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0015¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0017"}, d2 = {"Lapp/rive/core/RiveSurfaceVulkan;", "Lapp/rive/core/RiveSurface;", "Ljava/lang/AutoCloseable;", "", "nativeSurfacePointer", "Lapp/rive/core/CloseableSurface;", "closeableSurface", "Lapp/rive/core/CommandQueue;", "commandQueue", "Lapp/rive/core/DrawKey;", "drawKey", "", "width", "height", "", "resizable", "<init>", "(JLapp/rive/core/CloseableSurface;Lapp/rive/core/CommandQueue;JIIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lp/rih1;", "dispose", "()V", "Lapp/rive/core/CloseableSurface;", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveSurfaceVulkan extends RiveSurface implements AutoCloseable {
    public static final String TAG = "Rive/SurfaceVulkan";
    private final CloseableSurface closeableSurface;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0083 J2\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lapp/rive/core/RiveSurfaceVulkan$Companion;", "", "()V", "TAG", "", "cppCreateSurface", "", "renderContextPointer", "surface", "Landroid/view/Surface;", "width", "", "height", "create", "Lapp/rive/core/RiveSurfaceVulkan;", "renderContext", "Lapp/rive/core/RenderContextVulkan;", "Lapp/rive/core/CloseableSurface;", "commandQueue", "Lapp/rive/core/CommandQueue;", "drawKey", "Lapp/rive/core/DrawKey;", "create-SnmYj8w$kotlin_release", "(Lapp/rive/core/RenderContextVulkan;Lapp/rive/core/CloseableSurface;Lapp/rive/core/CommandQueue;J)Lapp/rive/core/RiveSurfaceVulkan;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final long cppCreateSurface(long renderContextPointer, Surface surface, int width, int height) {
            return RiveSurfaceVulkan.cppCreateSurface(renderContextPointer, surface, width, height);
        }

        /* JADX INFO: renamed from: create-SnmYj8w$kotlin_release, reason: not valid java name */
        public final RiveSurfaceVulkan m432createSnmYj8w$kotlin_release(RenderContextVulkan renderContext, CloseableSurface surface, CommandQueue commandQueue, long drawKey) throws Throwable {
            long jCppCreateSurface;
            if (!surface.getSurface().isValid()) {
                throw new RiveRenderException("Unable to create Android Surface", null, 2, null);
            }
            try {
                jCppCreateSurface = cppCreateSurface(renderContext.getNativeObjectPointer(), surface.getSurface(), surface.getWidth(), surface.getHeight());
                try {
                    return new RiveSurfaceVulkan(jCppCreateSurface, surface, commandQueue, drawKey, surface.getWidth(), surface.getHeight(), surface.getResizable(), null);
                } catch (Throwable th) {
                    th = th;
                    if (jCppCreateSurface != 0) {
                        RiveSurface.INSTANCE.cppDeleteSurface$kotlin_release(jCppCreateSurface);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                jCppCreateSurface = 0;
            }
        }

        private Companion() {
        }
    }

    private RiveSurfaceVulkan(long j, CloseableSurface closeableSurface, CommandQueue commandQueue, long j2, int i, int i2, boolean z) {
        super(commandQueue, j, j2, i, i2, z, null);
        this.closeableSurface = closeableSurface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long cppCreateSurface(long j, Surface surface, int i, int i2);

    @Override // app.p000rive.core.RiveSurface
    public void dispose() {
        super.dispose();
        this.closeableSurface.close();
    }

    public /* synthetic */ RiveSurfaceVulkan(long j, CloseableSurface closeableSurface, CommandQueue commandQueue, long j2, int i, int i2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, closeableSurface, commandQueue, j2, i, i2, z);
    }
}
