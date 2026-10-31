package app.p000rive.runtime.kotlin.core;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.os.Process;
import app.p000rive.RiveLog;
import app.p000rive.runtime.kotlin.fonts.FontHelper;
import app.p000rive.runtime.kotlin.fonts.Fonts;
import app.p000rive.runtime.kotlin.fonts.NativeFontHelper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.adt;
import p.f46;
import p.hab0;
import p.iu30;
import p.vyq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001-B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0003J@\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0003J\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b\u001e\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010%R$\u0010)\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lapp/rive/runtime/kotlin/core/Rive;", "", "<init>", "()V", "Lp/rih1;", "cppInitialize", "Lapp/rive/runtime/kotlin/core/Fit;", "fit", "Lapp/rive/runtime/kotlin/core/Alignment;", "alignment", "Landroid/graphics/RectF;", "availableBounds", "artboardBounds", "requiredBounds", "", "scaleFactor", "cppCalculateRequiredBounds", "(Lapp/rive/runtime/kotlin/core/Fit;Lapp/rive/runtime/kotlin/core/Alignment;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;F)V", "initializeCppEnvironment", "Landroid/content/Context;", "context", "Lapp/rive/runtime/kotlin/core/RendererType;", "defaultRenderer", "init", "(Landroid/content/Context;Lapp/rive/runtime/kotlin/core/RendererType;)V", "calculateRequiredBounds", "(Lapp/rive/runtime/kotlin/core/Fit;Lapp/rive/runtime/kotlin/core/Alignment;Landroid/graphics/RectF;Landroid/graphics/RectF;F)Landroid/graphics/RectF;", "", "byteArray", "", "setFallbackFont", "([B)Z", "Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;", "opts", "(Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;)Z", "", "TAG", "Ljava/lang/String;", "CXX_SHARED", "RIVE_ANDROID", "<set-?>", "defaultRendererType", "Lapp/rive/runtime/kotlin/core/RendererType;", "getDefaultRendererType", "()Lapp/rive/runtime/kotlin/core/RendererType;", "NativeLoader", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Rive {
    private static final String CXX_SHARED = "c++_shared";
    private static final String RIVE_ANDROID = "rive-android";
    private static final String TAG = "Rive";
    public static final Rive INSTANCE = new Rive();
    private static RendererType defaultRendererType = RendererType.Rive;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lapp/rive/runtime/kotlin/core/Rive$NativeLoader;", "", "<init>", "()V", "", "libraryName", "Lp/rih1;", "loadWithSystemLoader", "(Ljava/lang/String;)V", "Landroid/content/Context;", "context", "loadWithReLinker", "(Landroid/content/Context;Ljava/lang/String;)V", "loader", "Ljava/lang/UnsatisfiedLinkError;", "error", "logLoadFailure", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/UnsatisfiedLinkError;)V", "", "allowLegacyReLinkerFallback", "loadLibrary", "(Landroid/content/Context;Ljava/lang/String;Z)V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NativeLoader {
        public static final NativeLoader INSTANCE = new NativeLoader();

        private NativeLoader() {
        }

        private final void loadWithReLinker(Context context, String libraryName) {
            try {
                new vyq0((byte) 26).h(context, Rive.CXX_SHARED);
                try {
                    new vyq0((byte) 26).h(context, libraryName);
                } catch (UnsatisfiedLinkError e) {
                    logLoadFailure(libraryName, "ReLinker", e);
                    throw e;
                }
            } catch (UnsatisfiedLinkError e2) {
                logLoadFailure(Rive.CXX_SHARED, "ReLinker", e2);
                throw e2;
            }
        }

        private final void loadWithSystemLoader(String libraryName) {
            try {
                System.loadLibrary(libraryName);
            } catch (UnsatisfiedLinkError e) {
                logLoadFailure(libraryName, "System.loadLibrary", e);
                throw e;
            }
        }

        private final void logLoadFailure(String libraryName, String loader, UnsatisfiedLinkError error) {
            RiveLog.INSTANCE.getLogger().e(Rive.TAG, error, new Rive$NativeLoader$logLoadFailure$1(libraryName, loader, f46.s0(Build.SUPPORTED_ABIS, (String) null, "[", "]", (iu30) null, 57), Process.is64Bit()));
        }

        public final void loadLibrary(Context context, String libraryName, boolean allowLegacyReLinkerFallback) {
            loadWithSystemLoader(libraryName);
        }
    }

    private Rive() {
    }

    public static /* synthetic */ RectF calculateRequiredBounds$default(Rive rive, Fit fit, Alignment alignment, RectF rectF, RectF rectF2, float f, int i, Object obj) {
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return rive.calculateRequiredBounds(fit, alignment, rectF, rectF2, f);
    }

    private final native void cppCalculateRequiredBounds(Fit fit, Alignment alignment, RectF availableBounds, RectF artboardBounds, RectF requiredBounds, float scaleFactor);

    private final native void cppInitialize();

    public static /* synthetic */ void init$default(Rive rive, Context context, RendererType rendererType, int i, Object obj) {
        if ((i & 2) != 0) {
            rendererType = RendererType.Rive;
        }
        rive.init(context, rendererType);
    }

    public static final void initializeCppEnvironment() {
        INSTANCE.cppInitialize();
    }

    public static /* synthetic */ boolean setFallbackFont$default(Rive rive, Fonts.FontOpts fontOpts, int i, Object obj) {
        if ((i & 1) != 0) {
            fontOpts = null;
        }
        return rive.setFallbackFont(fontOpts);
    }

    public final RectF calculateRequiredBounds(Fit fit, Alignment alignment, RectF availableBounds, RectF artboardBounds, float scaleFactor) {
        RectF rectF = new RectF();
        cppCalculateRequiredBounds(fit, alignment, availableBounds, artboardBounds, rectF, scaleFactor);
        return rectF;
    }

    public final RendererType getDefaultRendererType() {
        return defaultRendererType;
    }

    public final void init(Context context, RendererType defaultRenderer) {
        RiveLog.INSTANCE.getLogger().i(TAG, AnonymousClass1.INSTANCE);
        defaultRendererType = defaultRenderer;
        try {
            NativeLoader.INSTANCE.loadLibrary(context, RIVE_ANDROID, true);
            initializeCppEnvironment();
        } catch (UnsatisfiedLinkError e) {
            RiveLog.INSTANCE.getLogger().e(TAG, null, AnonymousClass2.INSTANCE);
            throw e;
        }
    }

    @adt
    public final boolean setFallbackFont(Fonts.FontOpts opts) {
        byte[] fallbackFontBytes = FontHelper.INSTANCE.getFallbackFontBytes(opts);
        return fallbackFontBytes != null && NativeFontHelper.INSTANCE.cppRegisterFallbackFont(fallbackFontBytes);
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.core.Rive$init$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        public final String invoke() {
            return "Initializing Rive runtime";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.core.Rive$init$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends hab0 implements Function0 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        public final String invoke() {
            return "Native loading failed for librive-android.so. If your app loads native libraries manually, load libc++_shared.so before librive-android.so, then call Rive.initializeCppEnvironment(). For split APK/dynamic feature delivery, load both libraries from the split context with SplitInstallHelper.loadLibrary(...) before calling initializeCppEnvironment(). See https://developer.android.com/guide/playcore/feature-delivery/on-demand#native-code";
        }
    }

    @adt
    public final boolean setFallbackFont(byte[] byteArray) {
        return NativeFontHelper.INSTANCE.cppRegisterFallbackFont(byteArray);
    }
}
