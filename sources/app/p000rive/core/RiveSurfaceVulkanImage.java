package app.p000rive.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lapp/rive/core/RiveSurfaceVulkanImage;", "Lapp/rive/core/RiveSurface;", "Ljava/lang/AutoCloseable;", "", "nativeSurfacePointer", "Lapp/rive/core/CommandQueue;", "commandQueue", "Lapp/rive/core/DrawKey;", "drawKey", "", "width", "height", "<init>", "(JLapp/rive/core/CommandQueue;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lp/rih1;", "dispose", "()V", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveSurfaceVulkanImage extends RiveSurface implements AutoCloseable {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "Rive/SurfaceVulkanImage";

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0083 J:\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Lapp/rive/core/RiveSurfaceVulkanImage$Companion;", "", "()V", "TAG", "", "cppCreateImageSurface", "", "renderContextPointer", "width", "", "height", "create", "Lapp/rive/core/RiveSurfaceVulkanImage;", "renderContext", "Lapp/rive/core/RenderContextVulkan;", "commandQueue", "Lapp/rive/core/CommandQueue;", "drawKey", "Lapp/rive/core/DrawKey;", "create-GaSJWX4$kotlin_release", "(Lapp/rive/core/RenderContextVulkan;IILapp/rive/core/CommandQueue;J)Lapp/rive/core/RiveSurfaceVulkanImage;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final long cppCreateImageSurface(long renderContextPointer, int width, int height) {
            return RiveSurfaceVulkanImage.cppCreateImageSurface(renderContextPointer, width, height);
        }

        /* JADX INFO: renamed from: create-GaSJWX4$kotlin_release, reason: not valid java name */
        public final RiveSurfaceVulkanImage m433createGaSJWX4$kotlin_release(RenderContextVulkan renderContext, int width, int height, CommandQueue commandQueue, long drawKey) throws Throwable {
            long jCppCreateImageSurface;
            if (width <= 0 || height <= 0) {
                hhg1.n("Image surfaces require a positive width and height.");
                return null;
            }
            try {
                jCppCreateImageSurface = cppCreateImageSurface(renderContext.getNativeObjectPointer(), width, height);
                try {
                    return new RiveSurfaceVulkanImage(jCppCreateImageSurface, commandQueue, drawKey, width, height, null);
                } catch (Throwable th) {
                    th = th;
                    if (jCppCreateImageSurface != 0) {
                        RiveSurface.INSTANCE.cppDeleteSurface$kotlin_release(jCppCreateImageSurface);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                jCppCreateImageSurface = 0;
            }
        }

        private Companion() {
        }
    }

    private RiveSurfaceVulkanImage(long j, CommandQueue commandQueue, long j2, int i, int i2) {
        super(commandQueue, j, j2, i, i2, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long cppCreateImageSurface(long j, int i, int i2);

    @Override // app.p000rive.core.RiveSurface
    public void dispose() {
        super.dispose();
    }

    public /* synthetic */ RiveSurfaceVulkanImage(long j, CommandQueue commandQueue, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, commandQueue, j2, i, i2);
    }
}
