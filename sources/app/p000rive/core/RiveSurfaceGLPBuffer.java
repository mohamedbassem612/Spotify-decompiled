package app.p000rive.core;

import android.opengl.EGLSurface;
import app.p000rive.RiveLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.hab0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0015¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0018"}, d2 = {"Lapp/rive/core/RiveSurfaceGLPBuffer;", "Lapp/rive/core/RiveSurface;", "Ljava/lang/AutoCloseable;", "Landroid/opengl/EGLSurface;", "eglSurface", "Lapp/rive/core/RenderContextGL;", "renderContext", "Lapp/rive/core/CommandQueue;", "commandQueue", "", "nativeSurfacePointer", "Lapp/rive/core/DrawKey;", "drawKey", "", "width", "height", "<init>", "(Landroid/opengl/EGLSurface;Lapp/rive/core/RenderContextGL;Lapp/rive/core/CommandQueue;JJIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lp/rih1;", "dispose", "()V", "Landroid/opengl/EGLSurface;", "Lapp/rive/core/RenderContextGL;", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveSurfaceGLPBuffer extends RiveSurface implements AutoCloseable {
    public static final String TAG = "Rive/SurfaceGLPBuffer";
    private final EGLSurface eglSurface;
    private final RenderContextGL renderContext;
    public static final int $stable = 8;

    private RiveSurfaceGLPBuffer(EGLSurface eGLSurface, RenderContextGL renderContextGL, CommandQueue commandQueue, long j, long j2, int i, int i2) {
        super(commandQueue, j, j2, i, i2, false, null);
        this.eglSurface = eGLSurface;
        this.renderContext = renderContextGL;
    }

    @Override // app.p000rive.core.RiveSurface
    public void dispose() {
        RiveLog.INSTANCE.getLogger().d(TAG, AnonymousClass1.INSTANCE);
        this.renderContext.destroySurface(this.eglSurface);
        super.dispose();
    }

    /* JADX INFO: renamed from: app.rive.core.RiveSurfaceGLPBuffer$dispose$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        public final String invoke() {
            return "Destroying EGL PBuffer surface";
        }
    }

    public /* synthetic */ RiveSurfaceGLPBuffer(EGLSurface eGLSurface, RenderContextGL renderContextGL, CommandQueue commandQueue, long j, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(eGLSurface, renderContextGL, commandQueue, j, j2, i, i2);
    }
}
