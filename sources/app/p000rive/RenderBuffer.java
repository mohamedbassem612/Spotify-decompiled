package app.p000rive;

import android.graphics.Bitmap;
import android.os.Trace;
import app.p000rive.core.CheckableAutoCloseable;
import app.p000rive.core.CloseOnce;
import app.p000rive.core.CommandQueue;
import app.p000rive.core.RenderingDefaults;
import app.p000rive.core.RiveSurface;
import kotlin.Metadata;
import p.adt;
import p.dm5;
import p.hhg1;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@adt
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lapp/rive/RenderBuffer;", "Lapp/rive/core/CheckableAutoCloseable;", "", "width", "height", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "<init>", "(IILapp/rive/core/CommandQueue;)V", "Lp/rih1;", "close", "()V", "Lapp/rive/Artboard;", "artboard", "Lapp/rive/StateMachine;", "stateMachine", "Lapp/rive/Fit;", "fit", "clearColor", "render", "(Lapp/rive/Artboard;Lapp/rive/StateMachine;Lapp/rive/Fit;I)Lapp/rive/RenderBuffer;", "snapshot", "Landroid/graphics/Bitmap;", "bitmap", "copyInto", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "toBitmap", "()Landroid/graphics/Bitmap;", "I", "getWidth", "()I", "getHeight", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveSurface;", "surface", "Lapp/rive/core/RiveSurface;", "getSurface", "()Lapp/rive/core/RiveSurface;", "Lapp/rive/core/CloseOnce;", "closer", "Lapp/rive/core/CloseOnce;", "", "pixels", "[B", "", "argbScratch$delegate", "Lp/znb0;", "getArgbScratch", "()[I", "argbScratch", "", "getClosed", "()Z", "closed", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RenderBuffer implements CheckableAutoCloseable {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: argbScratch$delegate, reason: from kotlin metadata */
    private final znb0 argbScratch;
    private final CloseOnce closer;
    private final int height;
    private final byte[] pixels;
    private final CommandQueue riveWorker;
    private final RiveSurface surface;
    private final int width;

    public RenderBuffer(int i, int i2, CommandQueue commandQueue) {
        this.width = i;
        this.height = i2;
        this.riveWorker = commandQueue;
        if (i <= 0 || i2 <= 0) {
            hhg1.n("RenderBuffer width/height must be > 0");
            throw null;
        }
        this.surface = commandQueue.createImageSurface(i, i2);
        this.closer = new CloseOnce("RenderBuffer", new RenderBuffer$closer$1(this));
        this.pixels = new byte[i * i2 * 4];
        this.argbScratch = dm5.S(3, new RenderBuffer$argbScratch$2(this));
    }

    private final int[] getArgbScratch() {
        return (int[]) this.argbScratch.getValue();
    }

    public static /* synthetic */ RenderBuffer render$default(RenderBuffer renderBuffer, Artboard artboard, StateMachine stateMachine, Fit fit, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            fit = RenderingDefaults.INSTANCE.defaultFit();
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return renderBuffer.render(artboard, stateMachine, fit, i);
    }

    public static /* synthetic */ RenderBuffer snapshot$default(RenderBuffer renderBuffer, Artboard artboard, StateMachine stateMachine, Fit fit, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            fit = RenderingDefaults.INSTANCE.defaultFit();
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return renderBuffer.snapshot(artboard, stateMachine, fit, i);
    }

    @Override // app.p000rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    public final Bitmap copyInto(Bitmap bitmap) {
        this.closer.checkOpen();
        Trace.beginSection("Rive/RenderBuffer/CopyInto");
        try {
            if (bitmap.getWidth() != this.width || bitmap.getHeight() != this.height || bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
                throw new IllegalArgumentException(("Bitmap must be " + this.width + "x" + this.height + " ARGB_8888").toString());
            }
            int[] argbScratch = getArgbScratch();
            Trace.beginSection("Rive/RenderBuffer/Software/ConvertRgbaToArgb");
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    byte[] bArr = this.pixels;
                    if (i >= bArr.length) {
                        Trace.endSection();
                        Trace.beginSection("Rive/RenderBuffer/Software/SetPixels");
                        try {
                            int i3 = this.width;
                            bitmap.setPixels(argbScratch, 0, i3, 0, 0, i3, this.height);
                            Trace.endSection();
                            return bitmap;
                        } finally {
                            Trace.endSection();
                        }
                    }
                    int i4 = i2 + 1;
                    argbScratch[i2] = ((bArr[i + 3] & 255) << 24) | ((bArr[i] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i + 2] & 255);
                    i += 4;
                    i2 = i4;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // app.p000rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    public final int getHeight() {
        return this.height;
    }

    public final RiveSurface getSurface() {
        return this.surface;
    }

    public final int getWidth() {
        return this.width;
    }

    public final RenderBuffer render(Artboard artboard, StateMachine stateMachine, Fit fit, int clearColor) {
        this.closer.checkOpen();
        this.surface.checkOpen$kotlin_release();
        artboard.checkOpen$kotlin_release();
        stateMachine.checkOpen$kotlin_release();
        artboard.requireOwnedBy$kotlin_release(this.riveWorker);
        stateMachine.requireFromArtboard$kotlin_release(artboard);
        Trace.beginSection("Rive/RenderBuffer/Render");
        try {
            Trace.beginSection("Rive/RenderBuffer/Software/DrawToBuffer");
            try {
                artboard.getRiveWorker().m233drawToBufferfS7xHJs(artboard.getArtboardHandle(), stateMachine.getStateMachineHandle(), this.surface, this.pixels, this.width, this.height, fit, clearColor);
                Trace.endSection();
                return this;
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @adt
    public final RenderBuffer snapshot(Artboard artboard, StateMachine stateMachine, Fit fit, int clearColor) {
        return render(artboard, stateMachine, fit, clearColor);
    }

    public final Bitmap toBitmap() {
        this.closer.checkOpen();
        Trace.beginSection("Rive/RenderBuffer/ToBitmap");
        try {
            return copyInto(Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888));
        } finally {
            Trace.endSection();
        }
    }
}
