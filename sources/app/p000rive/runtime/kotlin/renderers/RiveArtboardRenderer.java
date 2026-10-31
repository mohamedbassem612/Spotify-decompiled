package app.p000rive.runtime.kotlin.renderers;

import android.os.Trace;
import app.p000rive.RiveLog;
import app.p000rive.runtime.kotlin.controllers.RiveFileController;
import app.p000rive.runtime.kotlin.core.Alignment;
import app.p000rive.runtime.kotlin.core.Artboard;
import app.p000rive.runtime.kotlin.core.File;
import app.p000rive.runtime.kotlin.core.Fit;
import app.p000rive.runtime.kotlin.core.RendererType;
import app.p000rive.runtime.kotlin.core.Rive;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.hab0;
import p.iu30;
import p.mmr0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 '2\u00020\u0001:\u0001'B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u0011J\u000f\u0010\u001a\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001a\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lapp/rive/runtime/kotlin/renderers/RiveArtboardRenderer;", "Lapp/rive/runtime/kotlin/renderers/Renderer;", "", "trace", "Lapp/rive/runtime/kotlin/core/RendererType;", "rendererType", "Lapp/rive/runtime/kotlin/controllers/RiveFileController;", "controller", "<init>", "(ZLapp/rive/runtime/kotlin/core/RendererType;Lapp/rive/runtime/kotlin/controllers/RiveFileController;)V", "Lkotlin/Function1;", "Lapp/rive/runtime/kotlin/core/Artboard;", "Lp/rih1;", "block", "withLockedActiveArtboard", "(Lp/iu30;)Z", "resizeArtboardIfNeeded", "()V", "resizeArtboard", "()Z", "draw", "", "elapsed", "advance", "(F)V", "reset", "disposeDependencies", "Lapp/rive/runtime/kotlin/controllers/RiveFileController;", "Lapp/rive/runtime/kotlin/core/Fit;", "getFit", "()Lapp/rive/runtime/kotlin/core/Fit;", "fit", "Lapp/rive/runtime/kotlin/core/Alignment;", "getAlignment", "()Lapp/rive/runtime/kotlin/core/Alignment;", "alignment", "getScaleFactor", "()F", "scaleFactor", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class RiveArtboardRenderer extends Renderer {
    public static final String TAG = "RiveL/RiveArtboardRenderer";
    private RiveFileController controller;
    public static final int $stable = 8;

    public RiveArtboardRenderer(boolean z, RendererType rendererType, RiveFileController riveFileController) {
        super(rendererType, z);
        this.controller = riveFileController;
        RiveLog.INSTANCE.getLogger().d(TAG, AnonymousClass1.INSTANCE);
        RiveFileController riveFileController2 = this.controller;
        riveFileController2.setOnStart(new RiveArtboardRenderer$2$1(this));
        riveFileController2.acquire();
        getDependencies().add(riveFileController2);
    }

    private final Alignment getAlignment() {
        return this.controller.getAlignment();
    }

    private final Fit getFit() {
        return this.controller.getFit();
    }

    private final float getScaleFactor() {
        return this.controller.getLayoutScaleFactorActive$kotlin_release();
    }

    private final void resizeArtboardIfNeeded() {
        if (this.controller.getRequireArtboardResize().getAndSet(false) && !resizeArtboard()) {
            this.controller.getRequireArtboardResize().set(true);
        }
    }

    private final boolean withLockedActiveArtboard(iu30 block) {
        while (true) {
            File file = this.controller.getFile();
            if (file == null) {
                return false;
            }
            synchronized (file.getFileLock()) {
                if (this.controller.getFile() == file) {
                    Artboard activeArtboard = this.controller.getActiveArtboard();
                    if (activeArtboard == null) {
                        return false;
                    }
                    block.invoke(activeArtboard);
                    return true;
                }
            }
        }
    }

    @Override // app.p000rive.runtime.kotlin.renderers.Renderer
    public void advance(float elapsed) {
        if (getHasCppObject()) {
            if (this.controller.getIsActive()) {
                this.controller.advance(elapsed);
            }
            synchronized (this.controller.getStartStopLock()) {
                if (!this.controller.isAdvancing()) {
                    stopThread$kotlin_release();
                }
            }
        }
    }

    @Override // app.p000rive.runtime.kotlin.renderers.Renderer
    public void disposeDependencies() {
        Object fileLock;
        File file = this.controller.getFile();
        if (file == null || (fileLock = file.getFileLock()) == null) {
            fileLock = this;
        }
        synchronized (fileLock) {
            super.disposeDependencies();
        }
    }

    @Override // app.p000rive.runtime.kotlin.renderers.Renderer
    public void draw() {
        resizeArtboardIfNeeded();
        synchronized (getFrameLock()) {
            if (getHasCppObject() && this.controller.getIsActive()) {
                Artboard activeArtboard = this.controller.getActiveArtboard();
                if (activeArtboard != null) {
                    activeArtboard.draw(getCppPointer(), getFit(), getAlignment(), getScaleFactor());
                }
            }
        }
    }

    public final void reset() {
        RiveLog.INSTANCE.getLogger().d(TAG, C01151.INSTANCE);
        this.controller.stopAnimations();
        this.controller.reset$kotlin_release();
        stop();
        RiveFileController.selectArtboard$default(this.controller, null, 1, null);
        start();
    }

    public boolean resizeArtboard() {
        mmr0 mmr0Var;
        RiveArtboardRenderer$resizeArtboard$applyLayout$1 riveArtboardRenderer$resizeArtboard$applyLayout$1 = new RiveArtboardRenderer$resizeArtboard$applyLayout$1(this);
        if (getFit() != Fit.LAYOUT) {
            Trace.beginSection("Rive/Layout/ResetArtboardSize");
            try {
                return withLockedActiveArtboard(new RiveArtboardRenderer$resizeArtboard$2$1(riveArtboardRenderer$resizeArtboard$applyLayout$1));
            } finally {
                Trace.endSection();
            }
        }
        Trace.beginSection("Rive/Layout/ResizeArtboard");
        try {
            synchronized (getFrameLock()) {
                mmr0Var = (getHasCppObject() && this.controller.getIsActive()) ? new mmr0(Float.valueOf(getWidth() / getScaleFactor()), Float.valueOf(getHeight() / getScaleFactor())) : null;
            }
            boolean zWithLockedActiveArtboard = mmr0Var == null ? false : withLockedActiveArtboard(new RiveArtboardRenderer$resizeArtboard$1$2(((Number) mmr0Var.a).floatValue(), ((Number) mmr0Var.b).floatValue(), riveArtboardRenderer$resizeArtboard$applyLayout$1));
            Trace.endSection();
            return zWithLockedActiveArtboard;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.renderers.RiveArtboardRenderer$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        public final String invoke() {
            return "Initializing.";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.renderers.RiveArtboardRenderer$reset$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01151 extends hab0 implements Function0 {
        public static final C01151 INSTANCE = new C01151();

        public C01151() {
            super(0);
        }

        public final String invoke() {
            return "Reset.";
        }
    }

    public /* synthetic */ RiveArtboardRenderer(boolean z, RendererType rendererType, RiveFileController riveFileController, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Rive.INSTANCE.getDefaultRendererType() : rendererType, riveFileController);
    }
}
