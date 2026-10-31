package app.p000rive.runtime.kotlin.renderers;

import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Surface;
import app.p000rive.RiveLog;
import app.p000rive.core.EGLError;
import app.p000rive.runtime.kotlin.SharedSurface;
import app.p000rive.runtime.kotlin.core.Alignment;
import app.p000rive.runtime.kotlin.core.Fit;
import app.p000rive.runtime.kotlin.core.NativeObject;
import app.p000rive.runtime.kotlin.core.RefCount;
import app.p000rive.runtime.kotlin.core.RendererType;
import app.p000rive.runtime.kotlin.core.Rive;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.hab0;
import p.hhg1;
import p.iu30;
import p.kd21;
import p.u890;
import p.zyh0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\r\b'\u0018\u0000 \u0088\u00012\u00020\u00012\u00020\u0002:\u0002\u0088\u0001B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096 ¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH'¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u000fJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001eH\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020\u000bH\u0001¢\u0006\u0004\b!\u0010\u000fJ\u000f\u0010#\u001a\u00020\u000bH\u0007¢\u0006\u0004\b#\u0010\u000fJ\u000f\u0010%\u001a\u00020\u000bH\u0000¢\u0006\u0004\b$\u0010\u000fJ\u000f\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b&\u0010\u000fJ\r\u0010'\u001a\u00020\u000b¢\u0006\u0004\b'\u0010\u000fJ\r\u0010(\u001a\u00020\u000b¢\u0006\u0004\b(\u0010\u000fJ7\u00101\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020\u0015¢\u0006\u0004\b1\u00102J=\u00109\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u00020\u0015¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u0015¢\u0006\u0004\b;\u0010<J\u001d\u0010?\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u0015¢\u0006\u0004\b?\u0010<J\u0017\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\tH\u0017¢\u0006\u0004\bA\u0010\rJ\u000f\u0010B\u001a\u00020\u000bH\u0017¢\u0006\u0004\bB\u0010\u000fJ\u000f\u0010C\u001a\u00020\u000bH\u0015¢\u0006\u0004\bC\u0010\u000fJ\u0018\u0010E\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\tH\u0082 ¢\u0006\u0004\bE\u0010\rJ\u0018\u0010F\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\tH\u0082 ¢\u0006\u0004\bF\u0010\rJ\u0018\u0010G\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\tH\u0082 ¢\u0006\u0004\bG\u0010\rJ\u0018\u0010H\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\tH\u0082 ¢\u0006\u0004\bH\u0010\rJ\u0018\u0010I\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\tH\u0082 ¢\u0006\u0004\bI\u0010JJ\u0018\u0010K\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\tH\u0082 ¢\u0006\u0004\bK\u0010JJ\u0018\u0010L\u001a\u00020\u00152\u0006\u0010D\u001a\u00020\tH\u0082 ¢\u0006\u0004\bL\u0010MJ\u0018\u0010N\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\tH\u0082 ¢\u0006\u0004\bN\u0010\rJ \u0010O\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020\tH\u0082 ¢\u0006\u0004\bO\u0010PJ\u0018\u0010Q\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\tH\u0082 ¢\u0006\u0004\bQ\u0010\rJ@\u0010T\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020\t2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010S\u001a\u00020-2\u0006\u00100\u001a\u00020\u0015H\u0082 ¢\u0006\u0004\bT\u0010UJH\u0010V\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020\t2\u0006\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u00020\u0015H\u0082 ¢\u0006\u0004\bV\u0010WJ \u0010X\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0010H\u0082 ¢\u0006\u0004\bX\u0010YJ'\u0010]\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010Z\u001a\u00020\u00102\u0006\u0010\\\u001a\u00020[H\u0003¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u000bH\u0002¢\u0006\u0004\b_\u0010\u000fJ\u000f\u0010`\u001a\u00020\u000bH\u0003¢\u0006\u0004\b`\u0010\u000fJ\u000f\u0010a\u001a\u00020\u000bH\u0002¢\u0006\u0004\ba\u0010\u000fR\"\u0010\u0004\u001a\u00020\u00038\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010g\u001a\u0004\bh\u0010iR$\u0010k\u001a\u00020\u00052\u0006\u0010j\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bk\u0010g\u001a\u0004\bk\u0010iR\"\u0010l\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010g\u001a\u0004\bl\u0010i\"\u0004\bm\u0010nR\u0018\u0010o\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u001e0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR0\u0010v\u001a\u0010\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020\u000b\u0018\u00010t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u0018\u0010}\u001a\u00020|8\u0006¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0014\u0010\u0083\u0001\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0014\u0010\u0085\u0001\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0082\u0001R\u0014\u0010\u0087\u0001\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0082\u0001¨\u0006\u0089\u0001"}, d2 = {"Lapp/rive/runtime/kotlin/renderers/Renderer;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "Landroid/view/Choreographer$FrameCallback;", "Lapp/rive/runtime/kotlin/core/RendererType;", "type", "", "trace", "<init>", "(Lapp/rive/runtime/kotlin/core/RendererType;Z)V", "", "pointer", "Lp/rih1;", "cppDelete", "(J)V", "make", "()V", "", "newType", "setRendererType", "(I)V", "draw", "", "elapsed", "advance", "(F)V", "start", "Landroid/view/Surface;", "surface", "setSurface", "(Landroid/view/Surface;)V", "Lapp/rive/runtime/kotlin/SharedSurface;", "setSurface$kotlin_release", "(Lapp/rive/runtime/kotlin/SharedSurface;)V", "stopThread$kotlin_release", "stopThread", "stop", "destroySurfaceAsync$kotlin_release", "destroySurfaceAsync", "scheduleFrame", "save", "restore", "Lapp/rive/runtime/kotlin/core/Fit;", "fit", "Lapp/rive/runtime/kotlin/core/Alignment;", "alignment", "Landroid/graphics/RectF;", "targetBounds", "sourceBounds", "scaleFactor", "align", "(Lapp/rive/runtime/kotlin/core/Fit;Lapp/rive/runtime/kotlin/core/Alignment;Landroid/graphics/RectF;Landroid/graphics/RectF;F)V", "x", "sy", "sx", "y", "tx", "ty", "transform", "(FFFFFF)V", "scale", "(FF)V", "dx", "dy", "translate", "frameTimeNanos", "doFrame", "delete", "disposeDependencies", "rendererPointer", "cppStart", "cppStop", "cppSave", "cppRestore", "cppWidth", "(J)I", "cppHeight", "cppAvgFps", "(J)F", "cppDoFrame", "cppSetSurface", "(Landroid/view/Surface;J)V", "cppDestroySurface", "cppPointer", "srcBounds", "cppAlign", "(JLapp/rive/runtime/kotlin/core/Fit;Lapp/rive/runtime/kotlin/core/Alignment;Landroid/graphics/RectF;Landroid/graphics/RectF;F)V", "cppTransform", "(JFFFFFF)V", "constructor", "(ZI)J", "eglErrorCode", "", "operation", "onNativeRenderContextEvent", "(IILjava/lang/String;)V", "destroySurfaceLocked", "onNativeSurfaceReleased", "removeFrameCallback", "Lapp/rive/runtime/kotlin/core/RendererType;", "getType", "()Lapp/rive/runtime/kotlin/core/RendererType;", "setType", "(Lapp/rive/runtime/kotlin/core/RendererType;)V", "Z", "getTrace", "()Z", "<set-?>", "isPlaying", "isAttached", "setAttached", "(Z)V", "sharedSurface", "Lapp/rive/runtime/kotlin/SharedSurface;", "Ljava/util/ArrayDeque;", "pendingSurfaceReleases", "Ljava/util/ArrayDeque;", "Lkotlin/Function1;", "Lapp/rive/runtime/kotlin/renderers/RenderContextEvent;", "onRenderContextEvent", "Lp/iu30;", "getOnRenderContextEvent", "()Lp/iu30;", "setOnRenderContextEvent", "(Lp/iu30;)V", "", "frameLock", "Ljava/lang/Object;", "getFrameLock", "()Ljava/lang/Object;", "getWidth", "()F", "width", "getHeight", "height", "getAverageFps", "averageFps", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Renderer extends NativeObject implements Choreographer.FrameCallback {
    private static final int CONTEXT_EVENT_LOST = 0;
    private static final int CONTEXT_EVENT_RECOVERED = 1;
    private static final String TAG = "RiveL/Renderer";
    private final Object frameLock;
    private boolean isAttached;
    private boolean isPlaying;
    private volatile iu30 onRenderContextEvent;
    private final ArrayDeque<SharedSurface> pendingSurfaceReleases;
    private SharedSurface sharedSurface;
    private final boolean trace;
    private RendererType type;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.renderers.Renderer$doFrame$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01092 extends hab0 implements Function0 {
        public C01092() {
            super(0);
        }

        public final String invoke() {
            return "doFrame - isPlaying: " + Renderer.this.getIsPlaying() + ", isAttached: " + Renderer.this.getIsAttached() + " - one or both are false; not scheduling any new frames";
        }
    }

    public Renderer(RendererType rendererType, boolean z) {
        super(0L);
        this.type = rendererType;
        this.trace = z;
        this.pendingSurfaceReleases = new ArrayDeque<>();
        this.frameLock = new Object();
    }

    public static /* synthetic */ void align$default(Renderer renderer, Fit fit, Alignment alignment, RectF rectF, RectF rectF2, float f, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: align");
            return;
        }
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        renderer.align(fit, alignment, rectF, rectF2, f);
    }

    private final native long constructor(boolean trace, int type);

    private final native void cppAlign(long cppPointer, Fit fit, Alignment alignment, RectF targetBounds, RectF srcBounds, float scaleFactor);

    private final native float cppAvgFps(long rendererPointer);

    private final native void cppDestroySurface(long rendererPointer);

    private final native void cppDoFrame(long rendererPointer);

    private final native int cppHeight(long rendererPointer);

    private final native void cppRestore(long rendererPointer);

    private final native void cppSave(long rendererPointer);

    private final native void cppSetSurface(Surface surface, long rendererPointer);

    private final native void cppStart(long rendererPointer);

    private final native void cppStop(long rendererPointer);

    private final native void cppTransform(long cppPointer, float x, float sy, float sx, float y, float tx, float ty);

    private final native int cppWidth(long rendererPointer);

    private final void destroySurfaceLocked() {
        this.isAttached = false;
        stopThread$kotlin_release();
        SharedSurface sharedSurface = this.sharedSurface;
        if (sharedSurface != null) {
            this.pendingSurfaceReleases.addLast(sharedSurface);
        }
        this.sharedSurface = null;
        if (getHasCppObject()) {
            RiveLog.INSTANCE.getLogger().d(TAG, AnonymousClass2.INSTANCE);
            cppDestroySurface(getCppPointer());
        }
    }

    private final void onNativeRenderContextEvent(int type, int eglErrorCode, String operation) {
        RenderContextEventType renderContextEventType;
        if (type == 0) {
            renderContextEventType = RenderContextEventType.Lost;
        } else {
            if (type != 1) {
                RiveLog.INSTANCE.getLogger().e(TAG, null, new Renderer$onNativeRenderContextEvent$eventType$1(type));
                return;
            }
            renderContextEventType = RenderContextEventType.Recovered;
        }
        iu30 iu30Var = this.onRenderContextEvent;
        if (iu30Var == null) {
            return;
        }
        RenderContextEvent renderContextEvent = new RenderContextEvent(renderContextEventType, eglErrorCode, EGLError.INSTANCE.errorString(eglErrorCode), operation);
        if (u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            iu30Var.invoke(renderContextEvent);
        } else {
            new Handler(Looper.getMainLooper()).post(new zyh0((Object) iu30Var, (Object) renderContextEvent, (byte) 21));
        }
    }

    private final void onNativeSurfaceReleased() {
        synchronized (this.frameLock) {
            SharedSurface sharedSurfacePollFirst = this.pendingSurfaceReleases.pollFirst();
            if (sharedSurfacePollFirst != null) {
                sharedSurfacePollFirst.release();
            } else {
                RiveLog.INSTANCE.getLogger().e(TAG, null, Renderer$onNativeSurfaceReleased$1$1.INSTANCE);
            }
        }
    }

    private final void removeFrameCallback() {
        new Handler(Looper.getMainLooper()).post(new kd21(this, (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeFrameCallback$lambda$6(Renderer renderer) {
        Choreographer.getInstance().removeFrameCallback(renderer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleFrame$lambda$5(Renderer renderer) {
        Choreographer.getInstance().postFrameCallback(renderer);
    }

    public abstract void advance(float elapsed);

    public final void align(Fit fit, Alignment alignment, RectF targetBounds, RectF sourceBounds, float scaleFactor) {
        cppAlign(getCppPointer(), fit, alignment, targetBounds, sourceBounds, scaleFactor);
    }

    @Override // app.p000rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);

    public void delete() {
        RiveLog.INSTANCE.getLogger().d(TAG, AnonymousClass1.INSTANCE);
        stop();
        synchronized (this.frameLock) {
            destroySurfaceLocked();
            cppDelete(getCppPointer());
            setCppPointer(0L);
        }
    }

    public final void destroySurfaceAsync$kotlin_release() {
        synchronized (this.frameLock) {
            RiveLog.INSTANCE.getLogger().d(TAG, Renderer$destroySurfaceAsync$1$1.INSTANCE);
            destroySurfaceLocked();
        }
        removeFrameCallback();
    }

    public void disposeDependencies() {
        synchronized (this.frameLock) {
            try {
                SharedSurface sharedSurface = this.sharedSurface;
                if (sharedSurface != null) {
                    sharedSurface.release();
                }
                this.sharedSurface = null;
                Iterator<T> it = this.pendingSurfaceReleases.iterator();
                while (it.hasNext()) {
                    ((SharedSurface) it.next()).release();
                }
                this.pendingSurfaceReleases.clear();
                Iterator<T> it2 = getDependencies().iterator();
                while (it2.hasNext()) {
                    ((RefCount) it2.next()).release();
                }
                getDependencies().clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        if (this.isPlaying && this.isAttached) {
            synchronized (this.frameLock) {
                if (getHasCppObject() && this.isPlaying && this.isAttached) {
                    cppDoFrame(getCppPointer());
                }
            }
            if (this.isPlaying && this.isAttached) {
                scheduleFrame();
            } else {
                RiveLog.INSTANCE.getLogger().d(TAG, new C01092());
            }
        }
    }

    public abstract void draw();

    public final float getAverageFps() {
        return cppAvgFps(getCppPointer());
    }

    public final Object getFrameLock() {
        return this.frameLock;
    }

    public final float getHeight() {
        return cppHeight(getCppPointer());
    }

    public final iu30 getOnRenderContextEvent() {
        return this.onRenderContextEvent;
    }

    public final boolean getTrace() {
        return this.trace;
    }

    public final RendererType getType() {
        return this.type;
    }

    public final float getWidth() {
        return cppWidth(getCppPointer());
    }

    /* JADX INFO: renamed from: isAttached, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    /* JADX INFO: renamed from: isPlaying, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    public void make() {
        if (getHasCppObject()) {
            return;
        }
        RiveLog.INSTANCE.getLogger().d(TAG, C01101.INSTANCE);
        setCppPointer(constructor(this.trace, this.type.getValue()));
        getRefs().incrementAndGet();
    }

    public final void restore() {
        cppRestore(getCppPointer());
    }

    public final void save() {
        cppSave(getCppPointer());
    }

    public final void scale(float sx, float sy) {
        transform(sx, 0.0f, 0.0f, sy, 0.0f, 0.0f);
    }

    public void scheduleFrame() {
        new Handler(Looper.getMainLooper()).post(new kd21(this, (byte) 1));
    }

    public final void setAttached(boolean z) {
        this.isAttached = z;
    }

    public final void setOnRenderContextEvent(iu30 iu30Var) {
        this.onRenderContextEvent = iu30Var;
    }

    public final void setRendererType(int newType) {
        if (newType != this.type.getValue()) {
            this.type = RendererType.INSTANCE.fromIndex(newType);
        }
    }

    @adt
    public final void setSurface(Surface surface) {
        setSurface$kotlin_release(new SharedSurface(surface));
    }

    public final void setSurface$kotlin_release(SharedSurface surface) {
        synchronized (this.frameLock) {
            try {
                RiveLog.INSTANCE.getLogger().d(TAG, Renderer$setSurface$1$1.INSTANCE);
                SharedSurface sharedSurface = this.sharedSurface;
                if (sharedSurface != null) {
                    this.pendingSurfaceReleases.addLast(sharedSurface);
                }
                surface.acquire();
                this.sharedSurface = surface;
                cppSetSurface(surface.getSurface(), getCppPointer());
                this.isAttached = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        start();
    }

    public final void setType(RendererType rendererType) {
        this.type = rendererType;
    }

    public final void start() {
        C01111 c01111 = C01111.INSTANCE;
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().d(TAG, c01111);
        if (this.isPlaying) {
            riveLog.getLogger().v(TAG, C01122.INSTANCE);
            return;
        }
        if (!this.isAttached) {
            riveLog.getLogger().v(TAG, AnonymousClass3.INSTANCE);
        } else if (!getHasCppObject()) {
            riveLog.getLogger().e(TAG, null, AnonymousClass4.INSTANCE);
        } else {
            this.isPlaying = true;
            cppStart(getCppPointer());
            scheduleFrame();
        }
    }

    public final void stop() {
        RiveLog.INSTANCE.getLogger().d(TAG, C01131.INSTANCE);
        stopThread$kotlin_release();
        removeFrameCallback();
    }

    public final void stopThread$kotlin_release() {
        Renderer$stopThread$1 renderer$stopThread$1 = Renderer$stopThread$1.INSTANCE;
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().d(TAG, renderer$stopThread$1);
        if (!this.isPlaying) {
            riveLog.getLogger().w(TAG, Renderer$stopThread$2.INSTANCE);
        } else if (getHasCppObject()) {
            this.isPlaying = false;
            cppStop(getCppPointer());
        } else {
            riveLog.getLogger().e(TAG, null, Renderer$stopThread$3.INSTANCE);
        }
    }

    public final void transform(float x, float sy, float sx, float y, float tx, float ty) {
        cppTransform(getCppPointer(), x, sy, sx, y, tx, ty);
    }

    public final void translate(float dx, float dy) {
        transform(1.0f, 0.0f, 0.0f, 1.0f, dx, dy);
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.renderers.Renderer$delete$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        public final String invoke() {
            return "Deleting Renderer.";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.renderers.Renderer$destroySurfaceLocked$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends hab0 implements Function0 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        public final String invoke() {
            return "Destroying surface.";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.renderers.Renderer$make$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01101 extends hab0 implements Function0 {
        public static final C01101 INSTANCE = new C01101();

        public C01101() {
            super(0);
        }

        public final String invoke() {
            return "Making Renderer.";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.renderers.Renderer$start$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01111 extends hab0 implements Function0 {
        public static final C01111 INSTANCE = new C01111();

        public C01111() {
            super(0);
        }

        public final String invoke() {
            return "Starting Renderer.";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.renderers.Renderer$start$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01122 extends hab0 implements Function0 {
        public static final C01122 INSTANCE = new C01122();

        public C01122() {
            super(0);
        }

        public final String invoke() {
            return "Already playing - returning.";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.renderers.Renderer$start$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends hab0 implements Function0 {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        public final String invoke() {
            return "Not attached - returning.";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.renderers.Renderer$start$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass4 extends hab0 implements Function0 {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(0);
        }

        public final String invoke() {
            return "Native object disposed - returning.";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.renderers.Renderer$stop$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01131 extends hab0 implements Function0 {
        public static final C01131 INSTANCE = new C01131();

        public C01131() {
            super(0);
        }

        public final String invoke() {
            return "Stopping Renderer.";
        }
    }

    public /* synthetic */ Renderer(RendererType rendererType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Rive.INSTANCE.getDefaultRendererType() : rendererType, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Renderer() {
        RendererType rendererType = null;
        this(rendererType, false, 3, rendererType);
    }
}
