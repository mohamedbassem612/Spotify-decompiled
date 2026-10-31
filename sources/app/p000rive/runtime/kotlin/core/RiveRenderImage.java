package app.p000rive.runtime.kotlin.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.eg;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0096 ¢\u0006\u0004\b\b\u0010\u0005¨\u0006\n"}, d2 = {"Lapp/rive/runtime/kotlin/core/RiveRenderImage;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "", "address", "<init>", "(J)V", "pointer", "Lp/rih1;", "cppDelete", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveRenderImage extends NativeObject {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0082 J\u0011\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 J\u0019\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0082 J1\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0082 J2\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018J2\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u001a\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u001f"}, d2 = {"Lapp/rive/runtime/kotlin/core/RiveRenderImage$Companion;", "", "()V", "cppFromARGBInts", "", "colors", "", "width", "", "height", "rendererTypeIdx", "premultiplied", "", "cppFromBitmapCanvas", "bitmap", "Landroid/graphics/Bitmap;", "cppFromBitmapRive", "cppFromRGBABytes", "bytes", "", "fromARGBInts", "Lapp/rive/runtime/kotlin/core/RiveRenderImage;", "pixels", "rendererType", "Lapp/rive/runtime/kotlin/core/RendererType;", "fromBitmap", "fromEncoded", "encodedBytes", "fromRGBABytes", "pixelBytes", "make", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long cppFromARGBInts(int[] colors, int width, int height, int rendererTypeIdx, boolean premultiplied);

        private final native long cppFromBitmapCanvas(Bitmap bitmap);

        private final native long cppFromBitmapRive(Bitmap bitmap, boolean premultiplied);

        private final native long cppFromRGBABytes(byte[] bytes, int width, int height, int rendererTypeIdx, boolean premultiplied);

        public static /* synthetic */ RiveRenderImage fromARGBInts$default(Companion companion, int[] iArr, int i, int i2, RendererType rendererType, boolean z, int i3, Object obj) {
            if ((i3 & 8) != 0) {
                rendererType = Rive.INSTANCE.getDefaultRendererType();
            }
            RendererType rendererType2 = rendererType;
            if ((i3 & 16) != 0) {
                z = false;
            }
            return companion.fromARGBInts(iArr, i, i2, rendererType2, z);
        }

        public static /* synthetic */ RiveRenderImage fromBitmap$default(Companion companion, Bitmap bitmap, RendererType rendererType, int i, Object obj) {
            if ((i & 2) != 0) {
                rendererType = Rive.INSTANCE.getDefaultRendererType();
            }
            return companion.fromBitmap(bitmap, rendererType);
        }

        public static /* synthetic */ RiveRenderImage fromEncoded$default(Companion companion, byte[] bArr, RendererType rendererType, int i, Object obj) {
            if ((i & 2) != 0) {
                rendererType = Rive.INSTANCE.getDefaultRendererType();
            }
            return companion.fromEncoded(bArr, rendererType);
        }

        public static /* synthetic */ RiveRenderImage fromRGBABytes$default(Companion companion, byte[] bArr, int i, int i2, RendererType rendererType, boolean z, int i3, Object obj) {
            if ((i3 & 8) != 0) {
                rendererType = Rive.INSTANCE.getDefaultRendererType();
            }
            RendererType rendererType2 = rendererType;
            if ((i3 & 16) != 0) {
                z = true;
            }
            return companion.fromRGBABytes(bArr, i, i2, rendererType2, z);
        }

        public static /* synthetic */ RiveRenderImage make$default(Companion companion, byte[] bArr, RendererType rendererType, int i, Object obj) {
            if ((i & 2) != 0) {
                rendererType = Rive.INSTANCE.getDefaultRendererType();
            }
            return companion.make(bArr, rendererType);
        }

        public final RiveRenderImage fromARGBInts(int[] pixels, int width, int height, RendererType rendererType, boolean premultiplied) {
            if (width <= 0 || height <= 0) {
                hhg1.n("Width and height must be > 0");
                return null;
            }
            if (pixels.length != width * height) {
                hhg1.n("Colors must have size = width * height");
                return null;
            }
            if (rendererType != RendererType.Canvas || premultiplied) {
                return new RiveRenderImage(cppFromARGBInts(pixels, width, height, rendererType.getValue(), premultiplied));
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(pixels, width, height, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPremultiplied(true);
            return new RiveRenderImage(cppFromBitmapCanvas(bitmapCreateBitmap));
        }

        public final RiveRenderImage fromBitmap(Bitmap bitmap, RendererType rendererType) {
            if (bitmap.isRecycled()) {
                hhg1.n("Bitmap must not be recycled");
                return null;
            }
            boolean z = Build.VERSION.SDK_INT >= 26 && bitmap.getConfig() == eg.k();
            Bitmap.Config config = bitmap.getConfig();
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            if ((config == config2 && !z) || (bitmap = bitmap.copy(config2, false)) != null) {
                return rendererType == RendererType.Rive ? new RiveRenderImage(cppFromBitmapRive(bitmap, bitmap.isPremultiplied())) : new RiveRenderImage(cppFromBitmapCanvas(bitmap));
            }
            eg.m("Failed to copy bitmap to ARGB_8888");
            return null;
        }

        public final RiveRenderImage fromEncoded(byte[] encodedBytes, RendererType rendererType) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options.inPremultiplied = true;
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(encodedBytes, 0, encodedBytes.length, options);
            if (bitmapDecodeByteArray == null) {
                hhg1.n("Failed to decode image from encoded bytes");
                return null;
            }
            if (bitmapDecodeByteArray.isPremultiplied() || !bitmapDecodeByteArray.hasAlpha()) {
                return fromBitmap(bitmapDecodeByteArray, rendererType);
            }
            eg.m("Decoded bitmap was not premultiplied");
            return null;
        }

        public final RiveRenderImage fromRGBABytes(byte[] pixelBytes, int width, int height, RendererType rendererType, boolean premultiplied) {
            if (width <= 0 || height <= 0) {
                hhg1.n("Width and height must be > 0");
                return null;
            }
            if (pixelBytes.length == width * height * 4) {
                return new RiveRenderImage(cppFromRGBABytes(pixelBytes, width, height, rendererType.getValue(), premultiplied));
            }
            hhg1.n("Bytes must have size = width * height * 4");
            return null;
        }

        @adt
        public final RiveRenderImage make(byte[] bytes, RendererType rendererType) {
            return fromEncoded(bytes, rendererType);
        }

        private Companion() {
        }
    }

    public RiveRenderImage(long j) {
        super(j);
    }

    @Override // app.p000rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);
}
