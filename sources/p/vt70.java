package p;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vt70 extends hba {
    public final p9b0 C;
    public final Rect D;
    public final Rect E;
    public final hdf0 F;
    public isi1 G;
    public isi1 H;

    public vt70(cdf0 cdf0Var, qkb0 qkb0Var) {
        super(cdf0Var, qkb0Var);
        this.C = new p9b0(3);
        this.D = new Rect();
        this.E = new Rect();
        String str = qkb0Var.g;
        fcf0 fcf0Var = cdf0Var.a;
        this.F = fcf0Var == null ? null : (hdf0) ((HashMap) fcf0Var.c()).get(str);
    }

    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        hdf0 hdf0Var = this.F;
        if (hdf0Var != null) {
            float fC = qpi1.c();
            rectF.set(0.0f, 0.0f, hdf0Var.a * fC, hdf0Var.b * fC);
            ((hba) this).n.mapRect(rectF);
        }
    }

    public final void g(Object obj, j2e0 j2e0Var) {
        super.g(obj, j2e0Var);
        if (obj == ndf0.F) {
            if (j2e0Var == null) {
                this.G = null;
                return;
            } else {
                this.G = new isi1((Object) null, j2e0Var);
                return;
            }
        }
        if (obj == ndf0.I) {
            if (j2e0Var == null) {
                this.H = null;
            } else {
                this.H = new isi1((Object) null, j2e0Var);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    public final void j(Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Rect rect = this.E;
        Rect rect2 = this.D;
        cdf0 cdf0Var = ((hba) this).o;
        p9b0 p9b0Var = this.C;
        hdf0 hdf0Var = this.F;
        isi1 isi1Var = this.H;
        if (isi1Var == null || (bitmap = (Bitmap) isi1Var.e()) == null) {
            String str = ((hba) this).p.g;
            eyh0 eyh0Var = cdf0Var.g;
            if (eyh0Var != null) {
                Drawable.Callback callback = cdf0Var.getCallback();
                Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
                Context context2 = (Context) eyh0Var.b;
                if (context2 instanceof Application) {
                    context = context.getApplicationContext();
                }
                if (context != context2) {
                    cdf0Var.g = null;
                }
            }
            eyh0 eyh0Var2 = cdf0Var.g;
            if (eyh0Var2 == null) {
                eyh0Var2 = new eyh0(cdf0Var.getCallback(), cdf0Var.h, cdf0Var.a.c());
                cdf0Var.g = eyh0Var2;
            }
            String str2 = (String) eyh0Var2.c;
            hdf0 hdf0Var2 = (hdf0) ((Map) eyh0Var2.d).get(str);
            if (hdf0Var2 == null) {
                bitmap = null;
                bitmap2 = null;
            } else {
                int i2 = hdf0Var2.b;
                int i3 = hdf0Var2.a;
                Bitmap bitmap3 = hdf0Var2.f;
                if (bitmap3 != null) {
                    bitmap2 = null;
                    bitmap = bitmap3;
                } else {
                    Context context3 = (Context) eyh0Var2.b;
                    if (context3 == null) {
                        bitmap = null;
                        bitmap2 = null;
                    } else {
                        String str3 = hdf0Var2.d;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                            try {
                                if (TextUtils.isEmpty(str2)) {
                                    bitmap2 = null;
                                    try {
                                        throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                    } catch (IOException unused) {
                                    }
                                } else {
                                    bitmap2 = null;
                                    try {
                                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context3.getAssets().open(str2 + str3), null, options);
                                        if (bitmapDecodeStream == null) {
                                            nue0.c("Decoded image `" + str + "` is null.");
                                            bitmap = bitmap2;
                                        } else {
                                            Bitmap bitmapE = qpi1.e(bitmapDecodeStream, i3, i2);
                                            synchronized (eyh0.t) {
                                                ((hdf0) ((Map) eyh0Var2.d).get(str)).f = bitmapE;
                                            }
                                            bitmap = bitmapE;
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        nue0.d("Unable to decode image `" + str + "`.");
                                    }
                                }
                            } catch (IOException unused3) {
                                bitmap2 = null;
                            }
                            nue0.d("Unable to open asset.");
                            bitmap = bitmap2;
                        } else {
                            try {
                                byte[] bArrDecode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                Bitmap bitmapE2 = qpi1.e(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), i3, i2);
                                synchronized (eyh0.t) {
                                    ((hdf0) ((Map) eyh0Var2.d).get(str)).f = bitmapE2;
                                }
                                bitmap = bitmapE2;
                            } catch (IllegalArgumentException unused4) {
                                nue0.d("data URL did not have correct base64 format.");
                                bitmap = null;
                            }
                            bitmap2 = null;
                        }
                    }
                }
            }
            if (bitmap == null) {
                bitmap = hdf0Var != null ? hdf0Var.f : bitmap2;
            }
        }
        if (bitmap == null || bitmap.isRecycled() || hdf0Var == null) {
            return;
        }
        float fC = qpi1.c();
        p9b0Var.setAlpha(i);
        isi1 isi1Var2 = this.G;
        if (isi1Var2 != null) {
            p9b0Var.setColorFilter((ColorFilter) isi1Var2.e());
        }
        canvas.save();
        canvas.concat(matrix);
        rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        if (cdf0Var.Z) {
            rect.set(0, 0, (int) (hdf0Var.a * fC), (int) (hdf0Var.b * fC));
        } else {
            rect.set(0, 0, (int) (bitmap.getWidth() * fC), (int) (bitmap.getHeight() * fC));
        }
        canvas.drawBitmap(bitmap, rect2, rect, (Paint) p9b0Var);
        canvas.restore();
    }
}
