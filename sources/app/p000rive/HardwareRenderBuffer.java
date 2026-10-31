package app.p000rive;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Trace;
import app.p000rive.core.CheckableAutoCloseable;
import app.p000rive.core.CloseOnce;
import app.p000rive.core.CommandQueue;
import app.p000rive.core.RenderingDefaults;
import app.p000rive.core.RiveSurface;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.at71;
import p.dt71;
import p.eg;
import p.hab0;
import p.hhg1;
import p.j2h1;
import p.mgo1;
import p.rih1;
import p.sen0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 V2\u00020\u0001:\u0001VB=\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\r\u0010\u000fJ*\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082\b¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010\u0018J1\u0010(\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b/\u0010.R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0013028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u00106\u001a\b\u0012\u0004\u0012\u00020\u0013058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010K\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010JR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0011\u0010R\u001a\u00020O8F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006W"}, d2 = {"Lapp/rive/HardwareRenderBuffer;", "Lapp/rive/core/CheckableAutoCloseable;", "", "width", "height", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "Lapp/rive/HardwareFrameSourceFactory;", "frameSourceFactory", "sdkInt", "", "firstFrameTimeoutMillis", "<init>", "(IILapp/rive/core/CommandQueue;Lapp/rive/HardwareFrameSourceFactory;IJ)V", "(IILapp/rive/core/CommandQueue;)V", "", "firstFailure", "Lkotlin/Function0;", "Lp/rih1;", "cleanup", "runCleanupStep", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)Ljava/lang/Throwable;", "waitForFirstFrame", "()V", "Landroid/graphics/Bitmap;", "bitmap", "publishFrame", "(Landroid/graphics/Bitmap;)V", "failure", "reportFrameFailure", "(Ljava/lang/Throwable;)V", "close", "Lapp/rive/Artboard;", "artboard", "Lapp/rive/StateMachine;", "stateMachine", "Lapp/rive/Fit;", "fit", "clearColor", "render", "(Lapp/rive/Artboard;Lapp/rive/StateMachine;Lapp/rive/Fit;I)V", "consumeLatestBitmap", "()Landroid/graphics/Bitmap;", "I", "getWidth", "()I", "getHeight", "Lapp/rive/core/CommandQueue;", "J", "Lp/sen0;", "_frameAvailable", "Lp/sen0;", "Lp/at71;", "frameAvailable", "Lp/at71;", "getFrameAvailable", "()Lp/at71;", "Lapp/rive/HardwareFrameSource;", "frameSource", "Lapp/rive/HardwareFrameSource;", "", "bitmapLock", "Ljava/lang/Object;", "Ljava/util/concurrent/CountDownLatch;", "firstFrameLatch", "Ljava/util/concurrent/CountDownLatch;", "", "isClosedFlag", "Z", "firstFramePublished", "imageReaderFailure", "Ljava/lang/Throwable;", "currentBitmap", "Landroid/graphics/Bitmap;", "pendingBitmap", "Lapp/rive/core/CloseOnce;", "closer", "Lapp/rive/core/CloseOnce;", "Lapp/rive/core/RiveSurface;", "getSurface", "()Lapp/rive/core/RiveSurface;", "surface", "getClosed", "()Z", "closed", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HardwareRenderBuffer implements CheckableAutoCloseable {
    private static final long FIRST_FRAME_TIMEOUT_MILLIS = 2000;
    private static final String TAG = "Rive/RenderBuffer/Hardware";
    private final sen0 _frameAvailable;
    private final Object bitmapLock;
    private final CloseOnce closer;
    private Bitmap currentBitmap;
    private final CountDownLatch firstFrameLatch;
    private volatile boolean firstFramePublished;
    private final long firstFrameTimeoutMillis;
    private final at71 frameAvailable;
    private final HardwareFrameSource frameSource;
    private final int height;
    private volatile Throwable imageReaderFailure;
    private volatile boolean isClosedFlag;
    private Bitmap pendingBitmap;
    private final CommandQueue riveWorker;
    private final int width;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JE\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lapp/rive/HardwareRenderBuffer$Companion;", "", "()V", "FIRST_FRAME_TIMEOUT_MILLIS", "", "TAG", "", "createForTesting", "Lapp/rive/HardwareRenderBuffer;", "width", "", "height", "riveWorker", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "frameSourceFactory", "Lapp/rive/HardwareFrameSourceFactory;", "sdkInt", "firstFrameTimeoutMillis", "createForTesting$kotlin_release", "isSupported", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ HardwareRenderBuffer createForTesting$kotlin_release$default(Companion companion, int i, int i2, CommandQueue commandQueue, HardwareFrameSourceFactory hardwareFrameSourceFactory, int i3, long j, int i4, Object obj) {
            if ((i4 & 16) != 0) {
                i3 = 29;
            }
            return companion.createForTesting$kotlin_release(i, i2, commandQueue, hardwareFrameSourceFactory, i3, (i4 & 32) != 0 ? 0L : j);
        }

        public final HardwareRenderBuffer createForTesting$kotlin_release(int width, int height, CommandQueue riveWorker, HardwareFrameSourceFactory frameSourceFactory, int sdkInt, long firstFrameTimeoutMillis) {
            return new HardwareRenderBuffer(width, height, riveWorker, frameSourceFactory, sdkInt, firstFrameTimeoutMillis, null);
        }

        public final boolean isSupported() {
            return Build.VERSION.SDK_INT >= 29;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: app.rive.HardwareRenderBuffer$reportFrameFailure$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        final /* synthetic */ Throwable $failure;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Throwable th) {
            super(0);
            this.$failure = th;
        }

        public final String invoke() {
            return this.$failure instanceof Error ? "Fatal error in ImageReader callback while publishing hardware frame" : "ImageReader callback failed while publishing hardware frame";
        }
    }

    private HardwareRenderBuffer(int i, int i2, CommandQueue commandQueue, HardwareFrameSourceFactory hardwareFrameSourceFactory, int i3, long j) {
        this.width = i;
        this.height = i2;
        this.riveWorker = commandQueue;
        this.firstFrameTimeoutMillis = j;
        if (i <= 0 || i2 <= 0) {
            hhg1.n("HardwareRenderBuffer width/height must be > 0");
            throw null;
        }
        if (j < 0) {
            hhg1.n("HardwareRenderBuffer first-frame timeout must be >= 0");
            throw null;
        }
        if (i3 < 29) {
            eg.m("Hardware bitmap rendering requires API 29+");
            throw null;
        }
        dt71 dt71VarD = mgo1.d(0, 1, 2);
        this._frameAvailable = dt71VarD;
        this.frameAvailable = dt71VarD;
        HardwareFrameSource hardwareFrameSourceCreate = hardwareFrameSourceFactory.create(i, i2, commandQueue);
        this.frameSource = hardwareFrameSourceCreate;
        this.bitmapLock = new Object();
        this.firstFrameLatch = new CountDownLatch(1);
        this.closer = new CloseOnce("HardwareRenderBuffer", new HardwareRenderBuffer$closer$1(this));
        try {
            hardwareFrameSourceCreate.setListener(new HardwareFrameSource.Listener() { // from class: app.rive.HardwareRenderBuffer.4
                @Override // app.rive.HardwareFrameSource.Listener
                public void onFailure(Throwable failure) {
                    HardwareRenderBuffer.this.reportFrameFailure(failure);
                }

                @Override // app.rive.HardwareFrameSource.Listener
                public void onFrame(Bitmap bitmap) {
                    HardwareRenderBuffer.this.publishFrame(bitmap);
                }
            });
        } catch (Throwable th) {
            try {
                this.closer.close();
            } catch (Throwable th2) {
                if (th2 != th) {
                    j2h1.h(th, th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishFrame(Bitmap bitmap) {
        if (this.isClosedFlag) {
            if (bitmap.isRecycled()) {
                return;
            }
            bitmap.recycle();
            return;
        }
        Trace.beginSection("Rive/RenderBuffer/Hardware/Callback/PublishBitmap");
        try {
            synchronized (this.bitmapLock) {
                try {
                    if (!this.isClosedFlag) {
                        Bitmap bitmap2 = this.pendingBitmap;
                        this.pendingBitmap = bitmap;
                        if (bitmap2 != null && bitmap2 != bitmap && !bitmap2.isRecycled()) {
                            bitmap2.recycle();
                        }
                        this.firstFramePublished = true;
                        this.firstFrameLatch.countDown();
                    } else if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this._frameAvailable.a(rih1.a);
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static /* synthetic */ void render$default(HardwareRenderBuffer hardwareRenderBuffer, Artboard artboard, StateMachine stateMachine, Fit fit, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            fit = RenderingDefaults.INSTANCE.defaultFit();
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        hardwareRenderBuffer.render(artboard, stateMachine, fit, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportFrameFailure(Throwable failure) {
        if (this.isClosedFlag) {
            return;
        }
        RiveLog.INSTANCE.getLogger().e(TAG, failure, new AnonymousClass1(failure));
        this.imageReaderFailure = failure;
        this.firstFrameLatch.countDown();
    }

    private final Throwable runCleanupStep(Throwable firstFailure, Function0 cleanup) {
        try {
            cleanup.invoke();
            return firstFailure;
        } catch (Throwable th) {
            if (firstFailure == null) {
                return th;
            }
            if (th == firstFailure) {
                return firstFailure;
            }
            j2h1.h(firstFailure, th);
            return firstFailure;
        }
    }

    private final void waitForFirstFrame() throws InterruptedException, RiveRenderException {
        if (this.firstFramePublished) {
            return;
        }
        boolean zAwait = this.firstFrameLatch.await(this.firstFrameTimeoutMillis, TimeUnit.MILLISECONDS);
        Throwable th = this.imageReaderFailure;
        if (th != null) {
            throw new RiveRenderException("Hardware ImageReader failed while acquiring a frame; recreate HardwareRenderBuffer", th);
        }
        if (!zAwait || !this.firstFramePublished) {
            throw new RiveRenderException("No hardware image available after render (timed out waiting for ImageReader frame)", null, 2, null);
        }
    }

    @Override // app.p000rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    public final Bitmap consumeLatestBitmap() throws RiveRenderException {
        Bitmap bitmap;
        this.closer.checkOpen();
        Throwable th = this.imageReaderFailure;
        if (th != null) {
            throw new RiveRenderException("Hardware ImageReader failed while acquiring a frame; recreate HardwareRenderBuffer", th);
        }
        Trace.beginSection("Rive/RenderBuffer/ToBitmap");
        try {
            synchronized (this.bitmapLock) {
                try {
                    Bitmap bitmap2 = this.pendingBitmap;
                    if (bitmap2 != null) {
                        this.pendingBitmap = null;
                        Bitmap bitmap3 = this.currentBitmap;
                        this.currentBitmap = bitmap2;
                        if (bitmap3 != null && bitmap3 != bitmap2 && !bitmap3.isRecycled()) {
                            bitmap3.recycle();
                        }
                    }
                    bitmap = this.currentBitmap;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Trace.endSection();
            return bitmap;
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    @Override // app.p000rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    public final at71 getFrameAvailable() {
        return this.frameAvailable;
    }

    public final int getHeight() {
        return this.height;
    }

    public final RiveSurface getSurface() {
        return this.frameSource.getSurface();
    }

    public final int getWidth() {
        return this.width;
    }

    public final void render(Artboard artboard, StateMachine stateMachine, Fit fit, int clearColor) {
        this.closer.checkOpen();
        getSurface().checkOpen$kotlin_release();
        artboard.checkOpen$kotlin_release();
        stateMachine.checkOpen$kotlin_release();
        artboard.requireOwnedBy$kotlin_release(this.riveWorker);
        stateMachine.requireFromArtboard$kotlin_release(artboard);
        Trace.beginSection("Rive/RenderBuffer/Render");
        try {
            Trace.beginSection("Rive/RenderBuffer/Hardware/Draw");
            try {
                this.riveWorker.m232drawOcc3x_Y(artboard.getArtboardHandle(), stateMachine.getStateMachineHandle(), getSurface(), fit, clearColor);
                Trace.endSection();
                if (!this.firstFramePublished) {
                    Trace.beginSection("Rive/RenderBuffer/Hardware/WaitFirstFrame");
                    try {
                        waitForFirstFrame();
                        Trace.endSection();
                    } finally {
                        Trace.endSection();
                    }
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public /* synthetic */ HardwareRenderBuffer(int i, int i2, CommandQueue commandQueue, HardwareFrameSourceFactory hardwareFrameSourceFactory, int i3, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, commandQueue, hardwareFrameSourceFactory, i3, j);
    }

    public HardwareRenderBuffer(int i, int i2, CommandQueue commandQueue) {
        this(i, i2, commandQueue, AndroidHardwareFrameSource.INSTANCE, Build.VERSION.SDK_INT, FIRST_FRAME_TIMEOUT_MILLIS);
    }
}
