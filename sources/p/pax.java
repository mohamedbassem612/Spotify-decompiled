package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pax implements ovc, yuc {
    public final /* synthetic */ byte a;
    public final ynb0 b;
    public final lvc c;

    public /* synthetic */ pax(ynb0 ynb0Var, lvc lvcVar, byte b) {
        this.a = b;
        this.b = ynb0Var;
        this.c = lvcVar;
    }

    public static Bitmap c(avc avcVar, Context context) {
        int iQ = don1.q(avcVar.d, context);
        int iQ2 = don1.q(avcVar.c, context);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iQ, iQ, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(avcVar.e);
        float f = iQ / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        int i = (iQ - iQ2) / 2;
        Drawable drawableJ = f0o1.j(context, avcVar.a);
        Integer num = avcVar.b;
        if (num != null) {
            int iIntValue = num.intValue();
            if (drawableJ != null) {
                drawableJ.setTint(iIntValue);
            }
        }
        if (drawableJ != null) {
            int i2 = iQ - i;
            drawableJ.setBounds(i, i, i2, i2);
        }
        if (drawableJ != null) {
            drawableJ.draw(canvas);
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap d(evc evcVar, Context context) {
        String str = evcVar.a;
        int i = (int) (context.getResources().getDisplayMetrics().density * evcVar.b);
        Bitmap bitmapV = wgo1.v(str);
        if (bitmapV == null) {
            return null;
        }
        try {
            return don1.C(i, bitmapV);
        } finally {
            bitmapV.recycle();
        }
    }

    public final CarIcon a(hvc hvcVar) {
        CarIcon m231Var;
        byte b = this.a;
        lvc lvcVar = this.c;
        ynb0 ynb0Var = this.b;
        switch (b) {
            case 0:
                avc avcVar = (avc) hvcVar;
                try {
                    m231Var = new CarIcon(new grd(IconCompat.d(c(avcVar, (Context) ynb0Var.get()))));
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    String strC = f4i1.c(avcVar.a, "encircled_icon:");
                    String message = thA.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    lvcVar.c(strC, message);
                }
                hm5.M(m231Var);
                return m231Var;
            default:
                evc evcVar = (evc) hvcVar;
                Bitmap bitmapD = d(evcVar, (Context) ynb0Var.get());
                if (bitmapD == null) {
                    lvcVar.c("qrcode:" + evcVar.a, "QR code bitmap generation returned null");
                }
                bitmapD.getClass();
                return new CarIcon(new grd(IconCompat.d(bitmapD)));
        }
    }

    @Override // p.yuc
    public final /* bridge */ /* synthetic */ Bitmap b(hvc hvcVar, Context context) {
        switch (this.a) {
            case 0:
                return c((avc) hvcVar, context);
            default:
                return d((evc) hvcVar, context);
        }
    }
}
