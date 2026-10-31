package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b750 implements ovc, yuc {
    public final l2a a;
    public final aai0 b;
    public final lvc c;

    public b750(l2a l2aVar, aai0 aai0Var, fg10 fg10Var, lvc lvcVar) {
        this.a = l2aVar;
        this.b = aai0Var;
        this.c = lvcVar;
    }

    public final CarIcon a(hvc hvcVar) {
        CarIcon m231Var;
        cvc cvcVar = (cvc) hvcVar;
        try {
            m231Var = new CarIcon(new grd(IconCompat.e(this.a.f(cvcVar))));
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            String strConcat = "gradient:".concat(cvcVar.a);
            String message = thA.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            this.c.c(strConcat, message);
        }
        hm5.M(m231Var);
        return m231Var;
    }

    @Override // p.yuc
    public final Bitmap b(hvc hvcVar, Context context) {
        Bitmap bitmapD;
        Integer numValueOf;
        Bitmap bitmapCreateBitmap;
        cvc cvcVar = (cvc) hvcVar;
        lvc lvcVar = this.c;
        String str = cvcVar.a;
        Bitmap bitmapA = null;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(this.b.g(str));
            if (inputStreamOpenInputStream != null) {
                try {
                    bitmapD = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                    inputStreamOpenInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u890.p(inputStreamOpenInputStream, th);
                        throw th2;
                    }
                }
            } else {
                bitmapD = null;
            }
        } catch (IOException e) {
            String strConcat = "gradient:".concat(str);
            String message = e.getMessage();
            if (message == null) {
                message = "Could not read gradient source";
            }
            lvcVar.c(strConcat, message);
            bitmapD = null;
        } catch (SecurityException e2) {
            String strConcat2 = "gradient:".concat(str);
            String message2 = e2.getMessage();
            if (message2 == null) {
                message2 = "Could not access gradient source";
            }
            lvcVar.c(strConcat2, message2);
            bitmapD = null;
        }
        if (bitmapD == null) {
            bitmapD = fg10.d(new dvc((String) null, 3), context);
        }
        try {
            numValueOf = Integer.valueOf(Color.parseColor("#".concat(ihc1.H0(cvcVar.b, "#"))));
        } catch (IllegalArgumentException unused) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if (bitmapD.getWidth() != bitmapD.getHeight()) {
                Logger.k("GradientImageGenerator", new Object[]{cy30.i(bitmapD.getWidth(), "Expected square bitmap but got ", bitmapD.getHeight(), "x")});
            }
            int width = bitmapD.getWidth();
            float f = width;
            float f2 = 0.05f * f;
            float f3 = 0.067f * f;
            float f4 = 0.033f * f;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width, width, config);
            new Canvas(bitmapCreateBitmap2).drawColor(iIntValue);
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmapD.getWidth(), bitmapD.getHeight(), config);
            Canvas canvas = new Canvas(bitmapCreateBitmap3);
            RectF rectF = new RectF(0.0f, 0.0f, bitmapD.getWidth(), bitmapD.getHeight());
            Paint paint = new Paint(1);
            canvas.drawRoundRect(rectF, f2, f2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmapD, 0.0f, 0.0f, paint);
            int i = ((int) (f3 + f4)) + 1;
            int i2 = i * 2;
            Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(bitmapCreateBitmap3.getWidth() + i2, bitmapCreateBitmap3.getHeight() + i2, config);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap4);
            Paint paint2 = new Paint(1);
            paint2.setColor(Color.argb(85, 0, 0, 0));
            paint2.setMaskFilter(new BlurMaskFilter(f3, BlurMaskFilter.Blur.NORMAL));
            float f5 = i;
            canvas2.drawBitmap(bitmapCreateBitmap3.extractAlpha(), f5, f4 + f5, paint2);
            canvas2.drawBitmap(bitmapCreateBitmap3, f5, f5, (Paint) null);
            bitmapCreateBitmap = Bitmap.createBitmap(width, width, config);
            Canvas canvas3 = new Canvas(bitmapCreateBitmap);
            canvas3.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, (Paint) null);
            float f6 = (10.0f * f) / 60.0f;
            float f7 = (15.0f * f) / 60.0f;
            float f8 = f / 2.0f;
            float f9 = f6 + f8;
            float f10 = f7 + f8;
            Matrix matrix = new Matrix();
            matrix.postTranslate((-bitmapCreateBitmap4.getWidth()) / 2.0f, (-bitmapCreateBitmap4.getHeight()) / 2.0f);
            matrix.postRotate(25.0f);
            matrix.postTranslate(f9, f10);
            Paint paint3 = new Paint(1);
            paint3.setFilterBitmap(true);
            canvas3.drawBitmap(bitmapCreateBitmap4, matrix, paint3);
        } else {
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap != null) {
            bitmapA = new fr31((Integer) null).a(bitmapCreateBitmap, Integer.valueOf(bitmapCreateBitmap.getWidth()), Integer.valueOf(bitmapCreateBitmap.getHeight()));
            if (!bitmapA.equals(bitmapCreateBitmap)) {
                bitmapCreateBitmap.recycle();
            }
        }
        return bitmapA;
    }
}
