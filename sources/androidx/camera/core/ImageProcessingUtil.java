package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Locale;
import p.j2h1;
import p.ry70;
import p.xx70;
import p.zq70;
import p.zx70;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ImageProcessingUtil {
    public static int a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void a(zx70 zx70Var) {
        if (!d(zx70Var)) {
            j2h1.p("ImageProcessingUtil");
            return;
        }
        int width = zx70Var.getWidth();
        int height = zx70Var.getHeight();
        int iF = zx70Var.r0()[0].f();
        int iF2 = zx70Var.r0()[1].f();
        int iF3 = zx70Var.r0()[2].f();
        int iE = zx70Var.r0()[0].e();
        int iE2 = zx70Var.r0()[1].e();
        if (nativeShiftPixel(zx70Var.r0()[0].d(), iF, zx70Var.r0()[1].d(), iF2, zx70Var.r0()[2].d(), iF3, iE, iE2, width, height, iE, iE2, iE2) != 0) {
            j2h1.p("ImageProcessingUtil");
        }
    }

    public static zq70 b(zx70 zx70Var, ry70 ry70Var, ByteBuffer byteBuffer, int i, boolean z) {
        if (!d(zx70Var)) {
            j2h1.p("ImageProcessingUtil");
            return null;
        }
        System.currentTimeMillis();
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            j2h1.p("ImageProcessingUtil");
            return null;
        }
        Surface surface = ry70Var.getSurface();
        int width = zx70Var.getWidth();
        int height = zx70Var.getHeight();
        int iF = zx70Var.r0()[0].f();
        int iF2 = zx70Var.r0()[1].f();
        int iF3 = zx70Var.r0()[2].f();
        int iE = zx70Var.r0()[0].e();
        int iE2 = zx70Var.r0()[1].e();
        if (nativeConvertAndroid420ToABGR(zx70Var.r0()[0].d(), iF, zx70Var.r0()[1].d(), iF2, zx70Var.r0()[2].d(), iF3, iE, iE2, surface, byteBuffer, width, height, z ? iE : 0, z ? iE2 : 0, z ? iE2 : 0, i) != 0) {
            j2h1.p("ImageProcessingUtil");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            System.currentTimeMillis();
            j2h1.o("ImageProcessingUtil");
            a++;
        }
        zx70 zx70VarC = ry70Var.c();
        if (zx70VarC == null) {
            j2h1.p("ImageProcessingUtil");
            return null;
        }
        zq70 zq70Var = new zq70(zx70VarC);
        zq70Var.a(new xx70(zx70VarC, zx70Var, (byte) 0));
        return zq70Var;
    }

    public static void c(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean d(zx70 zx70Var) {
        return zx70Var.getFormat() == 35 && zx70Var.r0().length == 3;
    }

    public static zq70 e(zx70 zx70Var, ry70 ry70Var, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (!d(zx70Var)) {
            j2h1.p("ImageProcessingUtil");
            return null;
        }
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            j2h1.p("ImageProcessingUtil");
            return null;
        }
        if (i > 0) {
            int width = zx70Var.getWidth();
            int height = zx70Var.getHeight();
            int iF = zx70Var.r0()[0].f();
            int iF2 = zx70Var.r0()[1].f();
            int iF3 = zx70Var.r0()[2].f();
            int iE = zx70Var.r0()[1].e();
            Image imageDequeueInputImage = imageWriter.dequeueInputImage();
            if (imageDequeueInputImage != null && nativeRotateYUV(zx70Var.r0()[0].d(), iF, zx70Var.r0()[1].d(), iF2, zx70Var.r0()[2].d(), iF3, iE, imageDequeueInputImage.getPlanes()[0].getBuffer(), imageDequeueInputImage.getPlanes()[0].getRowStride(), imageDequeueInputImage.getPlanes()[0].getPixelStride(), imageDequeueInputImage.getPlanes()[1].getBuffer(), imageDequeueInputImage.getPlanes()[1].getRowStride(), imageDequeueInputImage.getPlanes()[1].getPixelStride(), imageDequeueInputImage.getPlanes()[2].getBuffer(), imageDequeueInputImage.getPlanes()[2].getRowStride(), imageDequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i) == 0) {
                imageWriter.queueInputImage(imageDequeueInputImage);
                zx70 zx70VarC = ry70Var.c();
                if (zx70VarC == null) {
                    j2h1.p("ImageProcessingUtil");
                    return null;
                }
                zq70 zq70Var = new zq70(zx70VarC);
                zq70Var.a(new xx70(zx70VarC, zx70Var, (byte) 1));
                return zq70Var;
            }
        }
        j2h1.p("ImageProcessingUtil");
        return null;
    }

    public static void f(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            j2h1.p("ImageProcessingUtil");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
