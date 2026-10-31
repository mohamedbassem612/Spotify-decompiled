package app.p000rive.core;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import app.p000rive.RiveInitializationException;
import app.p000rive.RiveLog;
import app.p000rive.RiveRenderException;
import app.p000rive.RiveShutdownException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.hab0;
import p.hhg1;
import p.l1d;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001KB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000bH\u0082 ¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0082 ¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0082 ¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001f\u0010 J*\u0010)\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020!2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0010ø\u0001\u0000¢\u0006\u0004\b'\u0010(J2\u0010,\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0010ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b1\u00102J.\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\b@\u0010.R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u00100R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bD\u00102R\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006L"}, d2 = {"Lapp/rive/core/RenderContextGL;", "Lapp/rive/core/RenderContext;", "Lapp/rive/core/CheckableAutoCloseable;", "Landroid/opengl/EGLDisplay;", "display", "Landroid/opengl/EGLConfig;", "config", "Landroid/opengl/EGLContext;", "context", "<init>", "(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;)V", "", "cppConstructor", "(JJ)J", "pointer", "Lp/rih1;", "cppDelete", "(J)V", "contextPointer", "surface", "", "cppDestroySurface", "(JJ)I", "eglSurface", "width", "height", "cppCreateSurface", "(JII)J", "Landroid/opengl/EGLSurface;", "destroySurface", "(Landroid/opengl/EGLSurface;)V", "dispose", "()V", "Lapp/rive/core/CloseableSurface;", "Lapp/rive/core/DrawKey;", "drawKey", "Lapp/rive/core/CommandQueue;", "commandQueue", "Lapp/rive/core/RiveSurface;", "createSurface-mDlYe8U$kotlin_release", "(Lapp/rive/core/CloseableSurface;JLapp/rive/core/CommandQueue;)Lapp/rive/core/RiveSurface;", "createSurface", "createImageSurface-i4dAsZ4$kotlin_release", "(IIJLapp/rive/core/CommandQueue;)Lapp/rive/core/RiveSurface;", "createImageSurface", "component1", "()Landroid/opengl/EGLDisplay;", "component2", "()Landroid/opengl/EGLConfig;", "component3", "()Landroid/opengl/EGLContext;", "copy", "(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;)Lapp/rive/core/RenderContextGL;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/opengl/EGLDisplay;", "getDisplay", "Landroid/opengl/EGLConfig;", "getConfig", "Landroid/opengl/EGLContext;", "getContext", "Lapp/rive/core/UniquePointer;", "cppPointer", "Lapp/rive/core/UniquePointer;", "getNativeObjectPointer", "()J", "nativeObjectPointer", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RenderContextGL extends RenderContext implements CheckableAutoCloseable {
    public static final String TAG = "Rive/RenderContextGL";
    private final EGLConfig config;
    private final EGLContext context;
    private final UniquePointer cppPointer;
    private final EGLDisplay display;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lapp/rive/core/RenderContextGL$Companion;", "", "()V", "TAG", "", "createConfig", "Landroid/opengl/EGLConfig;", "display", "Landroid/opengl/EGLDisplay;", "createContext", "Landroid/opengl/EGLContext;", "config", "createDisplay", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EGLConfig createConfig(EGLDisplay display) throws RiveInitializationException {
            EGLConfig eGLConfig;
            RenderContextGL$Companion$createConfig$1 renderContextGL$Companion$createConfig$1 = RenderContextGL$Companion$createConfig$1.INSTANCE;
            RiveLog riveLog = RiveLog.INSTANCE;
            riveLog.getLogger().d(RenderContextGL.TAG, renderContextGL$Companion$createConfig$1);
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(display, new int[]{12352, 4, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr, 0)) {
                String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
                riveLog.getLogger().e(RenderContextGL.TAG, null, new RenderContextGL$Companion$createConfig$2(strErrorString));
                throw new RiveInitializationException(l1d.m("EGL config creation failed: ", strErrorString), new Throwable(strErrorString));
            }
            if (iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                riveLog.getLogger().e(RenderContextGL.TAG, null, RenderContextGL$Companion$createConfig$3.INSTANCE);
                throw new RiveInitializationException("Unable to find a suitable EGL config", null, 2, null);
            }
            eGLConfig.getClass();
            riveLog.getLogger().d(RenderContextGL.TAG, new RenderContextGL$Companion$createConfig$4(display, eGLConfig));
            return eGLConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int createConfig$attr(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
            int[] iArr = new int[1];
            EGL14.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr, 0);
            return iArr[0];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EGLContext createContext(EGLDisplay display, EGLConfig config) throws RiveInitializationException {
            RenderContextGL$Companion$createContext$1 renderContextGL$Companion$createContext$1 = RenderContextGL$Companion$createContext$1.INSTANCE;
            RiveLog riveLog = RiveLog.INSTANCE;
            riveLog.getLogger().d(RenderContextGL.TAG, renderContextGL$Companion$createContext$1);
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(display, config, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
            if (!u890.j(eGLContextEglCreateContext, EGL14.EGL_NO_CONTEXT)) {
                eGLContextEglCreateContext.getClass();
                return eGLContextEglCreateContext;
            }
            String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            riveLog.getLogger().e(RenderContextGL.TAG, null, new RenderContextGL$Companion$createContext$2(strErrorString));
            throw new RiveInitializationException("Unable to create EGL context", new Throwable(strErrorString));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EGLDisplay createDisplay() throws RiveInitializationException {
            RenderContextGL$Companion$createDisplay$1 renderContextGL$Companion$createDisplay$1 = RenderContextGL$Companion$createDisplay$1.INSTANCE;
            RiveLog riveLog = RiveLog.INSTANCE;
            riveLog.getLogger().d(RenderContextGL.TAG, renderContextGL$Companion$createDisplay$1);
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            if (u890.j(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
                String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
                riveLog.getLogger().e(RenderContextGL.TAG, null, new RenderContextGL$Companion$createDisplay$2(strErrorString));
                throw new RiveInitializationException("Unable to get EGL display", new Throwable(strErrorString));
            }
            riveLog.getLogger().d(RenderContextGL.TAG, RenderContextGL$Companion$createDisplay$3.INSTANCE);
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr2, 0)) {
                riveLog.getLogger().d(RenderContextGL.TAG, new RenderContextGL$Companion$createDisplay$5(iArr, iArr2));
                eGLDisplayEglGetDisplay.getClass();
                return eGLDisplayEglGetDisplay;
            }
            String strErrorString2 = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            riveLog.getLogger().e(RenderContextGL.TAG, null, new RenderContextGL$Companion$createDisplay$4(strErrorString2));
            throw new RiveInitializationException("Unable to initialize EGL", new Throwable(strErrorString2));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: app.rive.core.RenderContextGL$dispose$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends hab0 implements Function0 {
        final /* synthetic */ String $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(0);
            this.$error = str;
        }

        public final String invoke() {
            return l1d.m("eglDestroyContext failed with error: ", this.$error);
        }
    }

    /* JADX INFO: renamed from: app.rive.core.RenderContextGL$dispose$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass4 extends hab0 implements Function0 {
        final /* synthetic */ String $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str) {
            super(0);
            this.$error = str;
        }

        public final String invoke() {
            return l1d.m("eglTerminate failed with error: ", this.$error);
        }
    }

    public RenderContextGL(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext) {
        this.display = eGLDisplay;
        this.config = eGLConfig;
        this.context = eGLContext;
        this.cppPointer = new UniquePointer(cppConstructor(eGLDisplay.getNativeHandle(), eGLContext.getNativeHandle()), TAG, new RenderContextGL$cppPointer$1(this));
    }

    public static /* synthetic */ RenderContextGL copy$default(RenderContextGL renderContextGL, EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i, Object obj) {
        if ((i & 1) != 0) {
            eGLDisplay = renderContextGL.display;
        }
        if ((i & 2) != 0) {
            eGLConfig = renderContextGL.config;
        }
        if ((i & 4) != 0) {
            eGLContext = renderContextGL.context;
        }
        return renderContextGL.copy(eGLDisplay, eGLConfig, eGLContext);
    }

    private final native long cppConstructor(long display, long context);

    private final native long cppCreateSurface(long eglSurface, int width, int height);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppDelete(long pointer);

    private final native int cppDestroySurface(long contextPointer, long surface);

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EGLDisplay getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EGLConfig getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EGLContext getContext() {
        return this.context;
    }

    public final RenderContextGL copy(EGLDisplay display, EGLConfig config, EGLContext context) {
        return new RenderContextGL(display, config, context);
    }

    @Override // app.p000rive.core.RenderContext
    /* JADX INFO: renamed from: createImageSurface-i4dAsZ4$kotlin_release */
    public RiveSurface mo400createImageSurfacei4dAsZ4$kotlin_release(int width, int height, long drawKey, CommandQueue commandQueue) throws Throwable {
        long jCppCreateSurface;
        if (width <= 0 || height <= 0) {
            hhg1.n("Image surfaces require a positive width and height.");
            return null;
        }
        RenderContextGL$createImageSurface$2 renderContextGL$createImageSurface$2 = new RenderContextGL$createImageSurface$2(width, height);
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().d(TAG, renderContextGL$createImageSurface$2);
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.display, this.config, new int[]{12375, width, 12374, height, 12344}, 0);
        if (u890.j(eGLSurfaceEglCreatePbufferSurface, EGL14.EGL_NO_SURFACE)) {
            String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            riveLog.getLogger().e(TAG, null, new RenderContextGL$createImageSurface$3(strErrorString));
            throw new RiveRenderException("Unable to create EGL PBuffer surface", new Throwable(strErrorString));
        }
        try {
            jCppCreateSurface = cppCreateSurface(eGLSurfaceEglCreatePbufferSurface.getNativeHandle(), width, height);
            try {
                return new RiveSurfaceGLPBuffer(eGLSurfaceEglCreatePbufferSurface, this, commandQueue, jCppCreateSurface, drawKey, width, height, null);
            } catch (Throwable th) {
                th = th;
                EGL14.eglDestroySurface(this.display, eGLSurfaceEglCreatePbufferSurface);
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

    @Override // app.p000rive.core.RenderContext
    /* JADX INFO: renamed from: createSurface-mDlYe8U$kotlin_release */
    public RiveSurface mo401createSurfacemDlYe8U$kotlin_release(CloseableSurface surface, long drawKey, CommandQueue commandQueue) throws Throwable {
        EGLSurface eGLSurface;
        long jCppCreateSurface;
        if (!surface.getSurface().isValid()) {
            throw new RiveRenderException("Unable to create Android Surface", null, 2, null);
        }
        RenderContextGL$createSurface$1 renderContextGL$createSurface$1 = RenderContextGL$createSurface$1.INSTANCE;
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().d(TAG, renderContextGL$createSurface$1);
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.display, this.config, surface.getSurface(), new int[]{12344}, 0);
        if (u890.j(eGLSurfaceEglCreateWindowSurface, EGL14.EGL_NO_SURFACE)) {
            String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            riveLog.getLogger().e(TAG, null, new RenderContextGL$createSurface$2(strErrorString));
            throw new RiveRenderException("Unable to create EGL surface", new Throwable(strErrorString));
        }
        try {
            int width = surface.getWidth();
            int height = surface.getHeight();
            riveLog.getLogger().d(TAG, new RenderContextGL$createSurface$3(width, height));
            jCppCreateSurface = cppCreateSurface(eGLSurfaceEglCreateWindowSurface.getNativeHandle(), width, height);
            try {
                eGLSurface = eGLSurfaceEglCreateWindowSurface;
                try {
                    return new RiveSurfaceGL(eGLSurface, this, surface, commandQueue, jCppCreateSurface, drawKey, width, height, surface.getResizable(), null);
                } catch (Throwable th) {
                    th = th;
                    EGL14.eglDestroySurface(this.display, eGLSurface);
                    if (jCppCreateSurface != 0) {
                        RiveSurface.INSTANCE.cppDeleteSurface$kotlin_release(jCppCreateSurface);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                eGLSurface = eGLSurfaceEglCreateWindowSurface;
            }
        } catch (Throwable th3) {
            th = th3;
            eGLSurface = eGLSurfaceEglCreateWindowSurface;
            jCppCreateSurface = 0;
        }
    }

    public final void destroySurface(EGLSurface surface) {
        int iCppDestroySurface = cppDestroySurface(getNativeObjectPointer(), surface.getNativeHandle());
        if (iCppDestroySurface != 12288) {
            throw new RiveShutdownException(l1d.m("Unable to destroy EGL surface: ", EGLError.INSTANCE.errorString(iCppDestroySurface)), null, 2, null);
        }
    }

    @Override // app.p000rive.core.RenderContext
    public void dispose() throws RiveShutdownException {
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().d(TAG, anonymousClass1);
        if (!EGL14.eglDestroyContext(this.display, this.context)) {
            String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            riveLog.getLogger().e(TAG, null, new AnonymousClass2(strErrorString));
            throw new RiveShutdownException("Unable to destroy EGL context", new Throwable(strErrorString));
        }
        riveLog.getLogger().d(TAG, AnonymousClass3.INSTANCE);
        if (EGL14.eglTerminate(this.display)) {
            this.cppPointer.close();
            return;
        }
        String strErrorString2 = EGLError.INSTANCE.errorString(EGL14.eglGetError());
        riveLog.getLogger().e(TAG, null, new AnonymousClass4(strErrorString2));
        throw new RiveShutdownException("Unable to terminate EGL display", new Throwable(strErrorString2));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderContextGL)) {
            return false;
        }
        RenderContextGL renderContextGL = (RenderContextGL) other;
        return u890.j(this.display, renderContextGL.display) && u890.j(this.config, renderContextGL.config) && u890.j(this.context, renderContextGL.context);
    }

    public final EGLConfig getConfig() {
        return this.config;
    }

    public final EGLContext getContext() {
        return this.context;
    }

    public final EGLDisplay getDisplay() {
        return this.display;
    }

    @Override // app.p000rive.core.RenderContext
    public long getNativeObjectPointer() {
        return this.cppPointer.getPointer();
    }

    public int hashCode() {
        return this.context.hashCode() + ((this.config.hashCode() + (this.display.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "RenderContextGL(display=" + this.display + ", config=" + this.config + ", context=" + this.context + ")";
    }

    /* JADX INFO: renamed from: app.rive.core.RenderContextGL$dispose$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        public final String invoke() {
            return "Destroying EGL context";
        }
    }

    /* JADX INFO: renamed from: app.rive.core.RenderContextGL$dispose$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends hab0 implements Function0 {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        public final String invoke() {
            return "Terminating EGL display";
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RenderContextGL(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        eGLDisplay = (i & 1) != 0 ? INSTANCE.createDisplay() : eGLDisplay;
        eGLConfig = (i & 2) != 0 ? INSTANCE.createConfig(eGLDisplay) : eGLConfig;
        this(eGLDisplay, eGLConfig, (i & 4) != 0 ? INSTANCE.createContext(eGLDisplay, eGLConfig) : eGLContext);
    }

    public RenderContextGL() {
        this(null, null, null, 7, null);
    }
}
