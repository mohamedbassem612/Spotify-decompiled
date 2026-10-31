package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dxa implements car {
    public final a080 a;
    public final dqq0 b;
    public final k261 c;
    public final um00 d;

    public dxa(a080 a080Var, dqq0 dqq0Var, k261 k261Var, um00 um00Var) {
        this.a = a080Var;
        this.b = dqq0Var;
        this.c = k261Var;
        this.d = um00Var;
    }

    public static final y9r b(dxa dxaVar) throws Exception {
        lm00 lm00Var;
        Context context;
        boolean z;
        Bitmap bitmapCreateBitmap;
        int iMin;
        double dMax;
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        dqq0 dqq0Var = dxaVar.b;
        axa axaVar = new axa(dxaVar.a.d1());
        ff01 ff01Var = new ff01(axaVar);
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(new ef01(ff01Var.peek()), null, options);
        Exception exc = axaVar.b;
        if (exc != null) {
            throw exc;
        }
        options.inJustDecodeBounds = false;
        Paint paint = vm00.a;
        String str = options.outMimeType;
        dxaVar.d.getClass();
        if (str != null && (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif"))) {
            sm00 sm00Var = new sm00(new tm00(new ef01(ff01Var.peek())));
            int i2 = sm00Var.i(1, "Orientation");
            boolean z2 = i2 == 2 || i2 == 7 || i2 == 4 || i2 == 5;
            switch (sm00Var.i(1, "Orientation")) {
                case 3:
                case 4:
                    i = 180;
                    break;
                case 5:
                case 8:
                    i = 270;
                    break;
                case 6:
                case 7:
                    i = 90;
                    break;
                default:
                    i = 0;
                    break;
            }
            lm00Var = new lm00(i, z2);
        } else {
            lm00Var = lm00.c;
        }
        int i3 = lm00Var.b;
        boolean z3 = lm00Var.a;
        Exception exc2 = axaVar.b;
        if (exc2 != null) {
            throw exc2;
        }
        options.inMutable = false;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26 && dz70.b(dqq0Var) != null) {
            options.inPreferredColorSpace = q58.d(kto1.v(dqq0Var, dz70.c));
        }
        boolean zBooleanValue = ((Boolean) kto1.v(dqq0Var, dz70.d)).booleanValue();
        Context context2 = dqq0Var.a;
        options.inPremultiplied = zBooleanValue;
        Bitmap.Config config = (Bitmap.Config) kto1.v(dqq0Var, dz70.b);
        if ((z3 || i3 > 0) && (config == null || fpi1.x(config))) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (((Boolean) kto1.v(dqq0Var, dz70.g)).booleanValue() && config == Bitmap.Config.ARGB_8888 && u890.j(options.outMimeType, "image/jpeg")) {
            config = Bitmap.Config.RGB_565;
        }
        if (i4 >= 26) {
            Bitmap.Config config2 = options.outConfig;
            Bitmap.Config configC = eg.c();
            if (config2 == configC && config != eg.k()) {
                config = configC;
            }
        }
        options.inPreferredConfig = config;
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            context = context2;
            options.inSampleSize = 1;
            z = false;
            options.inScaled = false;
        } else {
            int i5 = vgo1.v(lm00Var) ? options.outHeight : options.outWidth;
            int i6 = vgo1.v(lm00Var) ? options.outWidth : options.outHeight;
            k291 k291Var = dqq0Var.b;
            dg41 dg41Var = dqq0Var.c;
            long jT = fc11.t(i5, i6, k291Var, dg41Var, (k291) kto1.v(dqq0Var, cz70.b));
            int i7 = (int) (jT >> 32);
            int i8 = (int) (jT & 4294967295L);
            int iHighestOneBit = Integer.highestOneBit(i5 / i7);
            int iHighestOneBit2 = Integer.highestOneBit(i6 / i8);
            int iOrdinal = dg41Var.ordinal();
            if (iOrdinal == 0) {
                iMin = Math.min(iHighestOneBit, iHighestOneBit2);
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                iMin = Math.max(iHighestOneBit, iHighestOneBit2);
            }
            if (iMin < 1) {
                iMin = 1;
            }
            options.inSampleSize = iMin;
            double d = iMin;
            double d2 = ((double) i5) / d;
            double d3 = ((double) i6) / d;
            double d4 = ((double) i7) / d2;
            context = context2;
            double d5 = ((double) i8) / d3;
            int iOrdinal2 = dg41Var.ordinal();
            if (iOrdinal2 == 0) {
                dMax = Math.max(d4, d5);
            } else {
                if (iOrdinal2 != 1) {
                    eg.o();
                    return null;
                }
                dMax = Math.min(d4, d5);
            }
            if (dqq0Var.d == 2 && dMax > 1.0d) {
                dMax = 1.0d;
            }
            boolean z4 = dMax == 1.0d;
            options.inScaled = !z4;
            if (!z4) {
                if (dMax > 1.0d) {
                    options.inDensity = jch0.S(2.147483647E9d / dMax);
                    options.inTargetDensity = Alert.DURATION_SHOW_INDEFINITELY;
                } else {
                    options.inDensity = Alert.DURATION_SHOW_INDEFINITELY;
                    options.inTargetDensity = jch0.S(2.147483647E9d * dMax);
                }
            }
            z = false;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new ef01(ff01Var), null, options);
            ff01Var.close();
            Exception exc3 = axaVar.b;
            if (exc3 != null) {
                throw exc3;
            }
            if (bitmapDecodeStream == null) {
                eg.m("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                return null;
            }
            bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
            if (z3 || i3 > 0) {
                Matrix matrix = new Matrix();
                float width = bitmapDecodeStream.getWidth() / 2.0f;
                float height = bitmapDecodeStream.getHeight() / 2.0f;
                if (z3) {
                    matrix.postScale(-1.0f, 1.0f, width, height);
                }
                if (i3 > 0) {
                    matrix.postRotate(i3, width, height);
                }
                RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                matrix.mapRect(rectF);
                float f = rectF.left;
                if (f != 0.0f || rectF.top != 0.0f) {
                    matrix.postTranslate(-f, -rectF.top);
                }
                if (vgo1.v(lm00Var)) {
                    int height2 = bitmapDecodeStream.getHeight();
                    int width2 = bitmapDecodeStream.getWidth();
                    Bitmap.Config config3 = bitmapDecodeStream.getConfig();
                    if (config3 == null) {
                        config3 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config3);
                } else {
                    int width3 = bitmapDecodeStream.getWidth();
                    int height3 = bitmapDecodeStream.getHeight();
                    Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                    if (config4 == null) {
                        config4 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config4);
                }
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, vm00.a);
                bitmapDecodeStream.recycle();
                bitmapDecodeStream = bitmapCreateBitmap;
            }
            return new y9r(x2p1.h(new BitmapDrawable(context.getResources(), bitmapDecodeStream)), (options.inSampleSize > 1 || options.inScaled) ? true : z);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(ff01Var, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(lnm lnmVar) throws Throwable {
        cxa cxaVar;
        k261 k261Var;
        int i;
        Throwable th;
        k261 k261Var2;
        if (lnmVar instanceof cxa) {
            cxaVar = (cxa) lnmVar;
            int i2 = cxaVar.e;
            if ((i2 & os00.INVALID_ID) != 0) {
                cxaVar.e = i2 - os00.INVALID_ID;
            } else {
                cxaVar = new cxa(this, (onm) lnmVar);
            }
        } else {
            cxaVar = new cxa(this, (onm) lnmVar);
        }
        Object obj = cxaVar.c;
        int i3 = cxaVar.e;
        d9n d9nVar = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                k261Var = this.c;
                cxaVar.a = k261Var;
                i = 0;
                cxaVar.b = 0;
                cxaVar.e = 1;
                if (k261Var.b(cxaVar) != d9nVar) {
                }
                return d9nVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k261Var2 = cxaVar.a;
                try {
                    hm5.M(obj);
                    y9r y9rVar = (y9r) obj;
                    k261Var2.e();
                    return y9rVar;
                } catch (Throwable th2) {
                    th = th2;
                    k261Var2.e();
                    throw th;
                }
            }
            i = cxaVar.b;
            k261 k261Var3 = cxaVar.a;
            hm5.M(obj);
            k261Var = k261Var3;
            hx4 hx4Var = new hx4(this, (byte) 7);
            cxaVar.a = k261Var;
            cxaVar.b = i;
            cxaVar.e = 2;
            Object objU = k4k.u(hx4Var, cxaVar);
            if (objU != d9nVar) {
                k261 k261Var4 = k261Var;
                obj = objU;
                k261Var2 = k261Var4;
                y9r y9rVar2 = (y9r) obj;
                k261Var2.e();
                return y9rVar2;
            }
            return d9nVar;
        } catch (Throwable th3) {
            k261 k261Var5 = k261Var;
            th = th3;
            k261Var2 = k261Var5;
            k261Var2.e();
            throw th;
        }
    }
}
