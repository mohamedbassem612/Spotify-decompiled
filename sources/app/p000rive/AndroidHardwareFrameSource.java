package app.p000rive;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import app.p000rive.core.CommandQueue;
import app.p000rive.core.ImageReaderSurface;
import app.p000rive.core.RiveSurface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.j2h1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001f¨\u0006!"}, d2 = {"Lapp/rive/AndroidHardwareFrameSource;", "Lapp/rive/HardwareFrameSource;", "Landroid/os/HandlerThread;", "imageReaderThread", "Landroid/media/ImageReader;", "imageReader", "Lapp/rive/core/RiveSurface;", "surface", "<init>", "(Landroid/os/HandlerThread;Landroid/media/ImageReader;Lapp/rive/core/RiveSurface;)V", "reader", "Lp/rih1;", "onImageAvailable", "(Landroid/media/ImageReader;)V", "Lapp/rive/HardwareFrameSource$Listener;", "listener", "setListener", "(Lapp/rive/HardwareFrameSource$Listener;)V", "stop", "()V", "Landroid/os/HandlerThread;", "Landroid/media/ImageReader;", "Lapp/rive/core/RiveSurface;", "getSurface", "()Lapp/rive/core/RiveSurface;", "Landroid/os/Handler;", "imageReaderHandler", "Landroid/os/Handler;", "Landroid/graphics/ColorSpace;", "srgbColorSpace", "Landroid/graphics/ColorSpace;", "Lapp/rive/HardwareFrameSource$Listener;", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidHardwareFrameSource implements HardwareFrameSource {
    private final ImageReader imageReader;
    private final Handler imageReaderHandler;
    private final HandlerThread imageReaderThread;
    private volatile HardwareFrameSource.Listener listener;
    private final ColorSpace srgbColorSpace;
    private final RiveSurface surface;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/rive/AndroidHardwareFrameSource$Companion;", "Lapp/rive/HardwareFrameSourceFactory;", "<init>", "()V", "Landroid/os/HandlerThread;", "thread", "Lp/rih1;", "stopThread", "(Landroid/os/HandlerThread;)V", "", "width", "height", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "Lapp/rive/HardwareFrameSource;", "create", "(IILapp/rive/core/CommandQueue;)Lapp/rive/HardwareFrameSource;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements HardwareFrameSourceFactory {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void stopThread(HandlerThread thread) {
            thread.quitSafely();
            if (Thread.currentThread() == thread) {
                return;
            }
            try {
                thread.join(1000L);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }

        @Override // app.p000rive.HardwareFrameSourceFactory
        public HardwareFrameSource create(int width, int height, CommandQueue riveWorker) throws Throwable {
            Throwable th;
            ImageReaderSurface imageReaderSurface;
            ImageReader imageReader;
            HandlerThread handlerThread = new HandlerThread("Rive/ImageReader");
            handlerThread.start();
            RiveSurface riveSurface = null;
            try {
                ImageReader imageReaderNewInstance = ImageReader.newInstance(width, height, 1, 2, 768L);
                try {
                    imageReaderSurface = new ImageReaderSurface(imageReaderNewInstance);
                    try {
                        RiveSurface riveSurfaceCreateRiveSurface = riveWorker.createRiveSurface(imageReaderSurface);
                        try {
                            return new AndroidHardwareFrameSource(handlerThread, imageReaderNewInstance, riveSurfaceCreateRiveSurface, riveSurface);
                        } catch (Throwable th2) {
                            th = th2;
                            riveSurface = riveSurfaceCreateRiveSurface;
                            imageReader = imageReaderNewInstance;
                            th = th;
                            try {
                                if (riveSurface != null) {
                                    riveSurface.close();
                                } else {
                                    if (imageReaderSurface == null) {
                                        if (imageReader != null) {
                                            imageReader.close();
                                        }
                                        stopThread(handlerThread);
                                        throw th;
                                    }
                                    imageReaderSurface.close();
                                }
                            } catch (Throwable th3) {
                                j2h1.h(th, th3);
                            }
                            stopThread(handlerThread);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    imageReader = imageReaderNewInstance;
                    th = th5;
                    imageReaderSurface = null;
                }
            } catch (Throwable th6) {
                th = th6;
                imageReaderSurface = null;
                imageReader = null;
            }
        }

        private Companion() {
        }
    }

    private AndroidHardwareFrameSource(HandlerThread handlerThread, ImageReader imageReader, RiveSurface riveSurface) {
        this.imageReaderThread = handlerThread;
        this.imageReader = imageReader;
        this.surface = riveSurface;
        this.imageReaderHandler = new Handler(handlerThread.getLooper());
        this.srgbColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onImageAvailable(ImageReader reader) throws Throwable {
        HardwareFrameSource.Listener listener = this.listener;
        if (listener == null) {
            return;
        }
        try {
            Trace.beginSection("Rive/RenderBuffer/Hardware/Callback/AcquireLatestImage");
            try {
                Image imageAcquireLatestImage = reader.acquireLatestImage();
                Trace.endSection();
                if (imageAcquireLatestImage == null) {
                    return;
                }
                HardwareBuffer hardwareBuffer = null;
                try {
                    Trace.beginSection("Rive/RenderBuffer/Hardware/Callback/WrapHardwareBuffer");
                    try {
                        HardwareBuffer hardwareBuffer2 = imageAcquireLatestImage.getHardwareBuffer();
                        if (hardwareBuffer2 == null) {
                            throw new RiveRenderException("Image did not provide a HardwareBuffer", null, 2, null);
                        }
                        try {
                            Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer2, this.srgbColorSpace);
                            if (bitmapWrapHardwareBuffer == null) {
                                throw new RiveRenderException("Failed to wrap HardwareBuffer as Bitmap", null, 2, null);
                            }
                            try {
                                Trace.endSection();
                                hardwareBuffer2.close();
                                imageAcquireLatestImage.close();
                                listener.onFrame(bitmapWrapHardwareBuffer);
                                return;
                            } catch (Throwable th) {
                                th = th;
                                hardwareBuffer = hardwareBuffer2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            hardwareBuffer = hardwareBuffer2;
                            Trace.endSection();
                            throw th;
                        }
                        if (hardwareBuffer != null) {
                            hardwareBuffer.close();
                        }
                        imageAcquireLatestImage.close();
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    Trace.endSection();
                    throw th;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                Trace.endSection();
                throw th5;
            }
        } catch (Error e) {
            HardwareFrameSource.Listener listener2 = this.listener;
            if (listener2 != null) {
                listener2.onFailure(e);
            }
            throw e;
        } catch (Exception e2) {
            HardwareFrameSource.Listener listener3 = this.listener;
            if (listener3 != null) {
                listener3.onFailure(e2);
            }
        }
    }

    @Override // app.p000rive.HardwareFrameSource
    public RiveSurface getSurface() {
        return this.surface;
    }

    @Override // app.p000rive.HardwareFrameSource
    public void setListener(HardwareFrameSource.Listener listener) {
        this.listener = listener;
        this.imageReader.setOnImageAvailableListener(listener == null ? null : new ImageReader.OnImageAvailableListener() { // from class: p.pk4
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) throws Throwable {
                this.a.onImageAvailable(imageReader);
            }
        }, listener != null ? this.imageReaderHandler : null);
    }

    @Override // app.p000rive.HardwareFrameSource
    public void stop() {
        try {
            setListener(null);
        } finally {
            INSTANCE.stopThread(this.imageReaderThread);
        }
    }

    public /* synthetic */ AndroidHardwareFrameSource(HandlerThread handlerThread, ImageReader imageReader, RiveSurface riveSurface, DefaultConstructorMarker defaultConstructorMarker) {
        this(handlerThread, imageReader, riveSurface);
    }
}
