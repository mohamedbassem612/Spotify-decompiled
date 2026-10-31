package app.p000rive.core;

import app.p000rive.RiveIncompatibleResourceException;
import app.p000rive.RiveResourceClosedException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.eg;
import p.gvg;
import p.hhg1;
import p.l1d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000 82\u00020\u0001:\u00018B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u001b\u001a\u00020\u000f2\n\u0010\u0018\u001a\u00060\u0002j\u0002`\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u001c\u0010\u0011J\u001f\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0015¢\u0006\u0004\b \u0010\u001eR\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R$\u0010\t\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R$\u0010\n\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\u0005\u001a\u00020-8FX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010\u0011\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Lapp/rive/core/RiveSurface;", "Lapp/rive/core/CheckableAutoCloseable;", "Lapp/rive/core/CommandQueue;", "owningCommandQueue", "", "surfaceNativePointer", "Lapp/rive/core/DrawKey;", "drawKey", "", "width", "height", "", "resizable", "<init>", "(Lapp/rive/core/CommandQueue;JJIIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lp/rih1;", "close", "()V", "checkOpen$kotlin_release", "checkOpen", "requireNativePointer$kotlin_release", "()J", "requireNativePointer", "Lapp/rive/core/RiveWorker;", "worker", "requireOwnedBy$kotlin_release", "(Lapp/rive/core/CommandQueue;)V", "requireOwnedBy", "dispose", "resize$kotlin_release", "(II)V", "resize", "resizeNativeResources", "J", "getDrawKey-DhFih_o", "Z", "getResizable", "()Z", "<set-?>", "I", "getWidth", "()I", "getHeight", "commandQueue", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/UniquePointer;", "nativePointer", "Lapp/rive/core/UniquePointer;", "Lapp/rive/core/CloseOnce;", "closer", "Lapp/rive/core/CloseOnce;", "getSurfaceNativePointer", "()Lapp/rive/core/UniquePointer;", "getSurfaceNativePointer$annotations", "getClosed", "closed", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class RiveSurface implements CheckableAutoCloseable {
    private final CloseOnce closer;
    private final CommandQueue commandQueue;
    private final long drawKey;
    private int height;
    private final UniquePointer nativePointer;
    private final boolean resizable;
    private int width;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0083 ¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\b¨\u0006\u0011"}, d2 = {"Lapp/rive/core/RiveSurface$Companion;", "", "<init>", "()V", "", "pointer", "Lp/rih1;", "cppDeleteSurfaceNative", "(J)V", "surfacePointer", "", "width", "height", "cppResizeSurface", "(JII)V", "cppDeleteSurface$kotlin_release", "cppDeleteSurface", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void cppDeleteSurfaceNative(long pointer) {
            RiveSurface.cppDeleteSurfaceNative(pointer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void cppResizeSurface(long surfacePointer, int width, int height) {
            RiveSurface.cppResizeSurface(surfacePointer, width, height);
        }

        public final void cppDeleteSurface$kotlin_release(long pointer) {
            cppDeleteSurfaceNative(pointer);
        }

        private Companion() {
        }
    }

    private RiveSurface(CommandQueue commandQueue, long j, long j2, int i, int i2, boolean z) {
        this.drawKey = j2;
        this.resizable = z;
        this.width = i;
        this.height = i2;
        commandQueue.acquire("RiveSurface");
        this.commandQueue = commandQueue;
        this.nativePointer = new UniquePointer(j, l1d.l(j2, "RiveSurface "), RiveSurface$nativePointer$1.INSTANCE);
        this.closer = new CloseOnce(l1d.l(j2, "RiveSurface "), new RiveSurface$closer$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void cppDeleteSurfaceNative(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void cppResizeSurface(long j, int i, int i2);

    @adt
    public static /* synthetic */ void getSurfaceNativePointer$annotations() {
    }

    public final void checkOpen$kotlin_release() {
        this.closer.checkOpen();
        if (this.nativePointer.getClosed()) {
            throw new RiveResourceClosedException(gvg.f(this.drawKey, "RiveSurface ", " is closed"));
        }
    }

    @Override // app.p000rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    public void dispose() {
        this.nativePointer.close();
    }

    @Override // app.p000rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed() || this.nativePointer.getClosed();
    }

    /* JADX INFO: renamed from: getDrawKey-DhFih_o, reason: not valid java name and from getter */
    public final long getDrawKey() {
        return this.drawKey;
    }

    public final int getHeight() {
        return this.height;
    }

    public final boolean getResizable() {
        return this.resizable;
    }

    /* JADX INFO: renamed from: getSurfaceNativePointer, reason: from getter */
    public final UniquePointer getNativePointer() {
        return this.nativePointer;
    }

    public final int getWidth() {
        return this.width;
    }

    public final long requireNativePointer$kotlin_release() {
        checkOpen$kotlin_release();
        return this.nativePointer.getPointer();
    }

    public final void requireOwnedBy$kotlin_release(CommandQueue worker) {
        if (this.commandQueue != worker) {
            throw new RiveIncompatibleResourceException(gvg.f(this.drawKey, "RiveSurface ", " is not owned by the required RiveWorker"));
        }
    }

    public final void resize$kotlin_release(int width, int height) {
        checkOpen$kotlin_release();
        if (width <= 0 || height <= 0) {
            hhg1.n("RiveSurface resize requires a positive width and height.");
            return;
        }
        if (!this.resizable) {
            eg.m("Cannot resize a fixed-size RiveSurface");
            return;
        }
        if (this.width == width && this.height == height) {
            return;
        }
        this.commandQueue.m206cancelDrawRUTHeiE$kotlin_release(this.drawKey);
        this.width = width;
        this.height = height;
        this.commandQueue.runOnCommandServer$kotlin_release(new RiveSurface$resize$3(this, width, height));
    }

    public void resizeNativeResources(int width, int height) {
        INSTANCE.cppResizeSurface(this.nativePointer.getPointer(), width, height);
    }

    public /* synthetic */ RiveSurface(CommandQueue commandQueue, long j, long j2, int i, int i2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(commandQueue, j, j2, i, i2, z);
    }
}
