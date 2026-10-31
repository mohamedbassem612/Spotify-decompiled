package app.p000rive;

import android.graphics.Bitmap;
import android.os.Trace;
import app.p000rive.core.CheckableAutoCloseable;
import app.p000rive.core.CloseOnce;
import app.p000rive.core.CommandQueue;
import app.p000rive.core.RenderingDefaults;
import app.p000rive.core.RiveSurface;
import kotlin.Metadata;
import p.dm5;
import p.hhg1;
import p.l1d;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lapp/rive/SoftwareRenderBuffer;", "Lapp/rive/core/CheckableAutoCloseable;", "", "width", "height", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "<init>", "(IILapp/rive/core/CommandQueue;)V", "Landroid/graphics/Bitmap;", "bitmap", "Lp/rih1;", "convertRgbaToArgbAndWrite", "(Landroid/graphics/Bitmap;)V", "close", "()V", "Lapp/rive/Artboard;", "artboard", "Lapp/rive/StateMachine;", "stateMachine", "Lapp/rive/Fit;", "fit", "clearColor", "renderInto", "(Landroid/graphics/Bitmap;Lapp/rive/Artboard;Lapp/rive/StateMachine;Lapp/rive/Fit;I)Landroid/graphics/Bitmap;", "I", "getWidth", "()I", "getHeight", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveSurface;", "surface", "Lapp/rive/core/RiveSurface;", "getSurface", "()Lapp/rive/core/RiveSurface;", "Lapp/rive/core/CloseOnce;", "closer", "Lapp/rive/core/CloseOnce;", "", "pixels", "[B", "", "argbScratch$delegate", "Lp/znb0;", "getArgbScratch", "()[I", "argbScratch", "", "getClosed", "()Z", "closed", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SoftwareRenderBuffer implements CheckableAutoCloseable {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: argbScratch$delegate, reason: from kotlin metadata */
    private final znb0 argbScratch;
    private final CloseOnce closer;
    private final int height;
    private final byte[] pixels;
    private final CommandQueue riveWorker;
    private final RiveSurface surface;
    private final int width;

    public SoftwareRenderBuffer(int i, int i2, CommandQueue commandQueue) {
        this.width = i;
        this.height = i2;
        this.riveWorker = commandQueue;
        if (i <= 0 || i2 <= 0) {
            hhg1.n("SoftwareRenderBuffer width/height must be > 0");
            throw null;
        }
        this.surface = commandQueue.createImageSurface(i, i2);
        this.closer = new CloseOnce("SoftwareRenderBuffer", new SoftwareRenderBuffer$closer$1(this));
        this.pixels = new byte[i * i2 * 4];
        this.argbScratch = dm5.S(3, new SoftwareRenderBuffer$argbScratch$2(this));
    }

    private final void convertRgbaToArgbAndWrite(Bitmap bitmap) {
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
                        return;
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
        }
    }

    private final int[] getArgbScratch() {
        return (int[]) this.argbScratch.getValue();
    }

    public static /* synthetic */ Bitmap renderInto$default(SoftwareRenderBuffer softwareRenderBuffer, Bitmap bitmap, Artboard artboard, StateMachine stateMachine, Fit fit, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            fit = RenderingDefaults.INSTANCE.defaultFit();
        }
        Fit fit2 = fit;
        if ((i2 & 16) != 0) {
            i = 0;
        }
        return softwareRenderBuffer.renderInto(bitmap, artboard, stateMachine, fit2, i);
    }

    @Override // app.p000rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
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

    public final Bitmap renderInto(Bitmap bitmap, Artboard artboard, StateMachine stateMachine, Fit fit, int clearColor) {
        this.closer.checkOpen();
        this.surface.checkOpen$kotlin_release();
        artboard.checkOpen$kotlin_release();
        stateMachine.checkOpen$kotlin_release();
        artboard.requireOwnedBy$kotlin_release(this.riveWorker);
        stateMachine.requireFromArtboard$kotlin_release(artboard);
        if (bitmap.getWidth() != this.width || bitmap.getHeight() != this.height || bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            hhg1.f(l1d.j(this.width, this.height, "Bitmap must be ", "x", " ARGB_8888"));
            return null;
        }
        Trace.beginSection("Rive/RenderBuffer/Render");
        try {
            Trace.beginSection("Rive/RenderBuffer/Software/DrawToBuffer");
            try {
                artboard.getRiveWorker().m233drawToBufferfS7xHJs(artboard.getArtboardHandle(), stateMachine.getStateMachineHandle(), this.surface, this.pixels, this.width, this.height, fit, clearColor);
                Trace.endSection();
                convertRgbaToArgbAndWrite(bitmap);
                return bitmap;
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
