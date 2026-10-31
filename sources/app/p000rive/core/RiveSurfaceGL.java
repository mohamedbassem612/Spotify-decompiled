package app.p000rive.core;

import android.opengl.EGLSurface;
import app.p000rive.RiveLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.hab0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cBO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001b¨\u0006\u001d"}, d2 = {"Lapp/rive/core/RiveSurfaceGL;", "Lapp/rive/core/RiveSurface;", "Ljava/lang/AutoCloseable;", "Landroid/opengl/EGLSurface;", "eglSurface", "Lapp/rive/core/RenderContextGL;", "renderContext", "Lapp/rive/core/CloseableSurface;", "closeableSurface", "Lapp/rive/core/CommandQueue;", "commandQueue", "", "nativeSurfacePointer", "Lapp/rive/core/DrawKey;", "drawKey", "", "width", "height", "", "resizable", "<init>", "(Landroid/opengl/EGLSurface;Lapp/rive/core/RenderContextGL;Lapp/rive/core/CloseableSurface;Lapp/rive/core/CommandQueue;JJIIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lp/rih1;", "dispose", "()V", "Landroid/opengl/EGLSurface;", "Lapp/rive/core/RenderContextGL;", "Lapp/rive/core/CloseableSurface;", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveSurfaceGL extends RiveSurface implements AutoCloseable {
    public static final String TAG = "Rive/SurfaceGL";
    private final CloseableSurface closeableSurface;
    private final EGLSurface eglSurface;
    private final RenderContextGL renderContext;
    public static final int $stable = 8;

    private RiveSurfaceGL(EGLSurface eGLSurface, RenderContextGL renderContextGL, CloseableSurface closeableSurface, CommandQueue commandQueue, long j, long j2, int i, int i2, boolean z) {
        super(commandQueue, j, j2, i, i2, z, null);
        this.eglSurface = eGLSurface;
        this.renderContext = renderContextGL;
        this.closeableSurface = closeableSurface;
    }

    @Override // app.p000rive.core.RiveSurface
    public void dispose() {
        RiveLog.INSTANCE.getLogger().d(TAG, AnonymousClass1.INSTANCE);
        this.renderContext.destroySurface(this.eglSurface);
        this.closeableSurface.close();
        super.dispose();
    }

    /* JADX INFO: renamed from: app.rive.core.RiveSurfaceGL$dispose$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        public final String invoke() {
            return "Destroying EGL surface";
        }
    }

    public /* synthetic */ RiveSurfaceGL(EGLSurface eGLSurface, RenderContextGL renderContextGL, CloseableSurface closeableSurface, CommandQueue commandQueue, long j, long j2, int i, int i2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(eGLSurface, renderContextGL, closeableSurface, commandQueue, j, j2, i, i2, z);
    }
}
