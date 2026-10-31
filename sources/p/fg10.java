package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fg10 implements ovc, yuc {
    public final /* synthetic */ byte a;
    public final l2a b;
    public final lvc c;

    public /* synthetic */ fg10(l2a l2aVar, lvc lvcVar, byte b) {
        this.a = b;
        this.b = l2aVar;
        this.c = lvcVar;
    }

    public static Bitmap d(dvc dvcVar, Context context) {
        s4b1 s4b1VarX;
        int i;
        boolean zBooleanValue;
        v5b1 v5b1Var;
        String str = dvcVar.a;
        if (str != null) {
            Set set = s4b1.f;
            s4b1VarX = uic.x(str);
        } else {
            s4b1VarX = null;
        }
        blc0 blc0Var = s4b1VarX != null ? s4b1VarX.c : null;
        if (o7h.i0(s4b1.g, (s4b1VarX == null || (v5b1Var = s4b1VarX.d) == null) ? null : v5b1Var.getType())) {
            i = 2131232419;
        } else {
            int i2 = blc0Var == null ? -1 : i6t0.a[blc0Var.ordinal()];
            if (i2 == 1) {
                i = 2131231460;
            } else if (i2 != 2) {
                i = (i2 == 3 || i2 == 4) ? 2131232444 : 2131232785;
            } else {
                i = 2131231386;
            }
        }
        int iQ = don1.q(244.0f, context);
        int iQ2 = don1.q(122.0f, context);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iQ, iQ, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Boolean bool = dvcVar.b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = (context.getResources().getConfiguration().uiMode & 48) == 32;
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        sfm0 sfm0Var = zuc.j;
        paint.setColor(zBooleanValue ? sfm0Var.a : sfm0Var.b);
        if (blc0Var == blc0.u1) {
            float f = iQ / 2.0f;
            canvas.drawCircle(f, f, f, paint);
        } else {
            canvas.drawColor(paint.getColor());
        }
        int i3 = (iQ - iQ2) / 2;
        Drawable drawableJ = f0o1.j(context, i);
        if (drawableJ != null) {
            sfm0 sfm0Var2 = zuc.m;
            drawableJ.setTint(zBooleanValue ? sfm0Var2.a : sfm0Var2.b);
        }
        if (drawableJ != null) {
            int i4 = iQ - i3;
            drawableJ.setBounds(i3, i3, i4, i4);
        }
        if (drawableJ != null) {
            drawableJ.draw(canvas);
        }
        Bitmap bitmapA = new fr31((Integer) null).a(bitmapCreateBitmap, Integer.valueOf(bitmapCreateBitmap.getWidth()), Integer.valueOf(bitmapCreateBitmap.getHeight()));
        if (!bitmapA.equals(bitmapCreateBitmap)) {
            bitmapCreateBitmap.recycle();
        }
        return bitmapA;
    }

    public final CarIcon a(hvc hvcVar) {
        CarIcon m231Var;
        switch (this.a) {
            case 0:
                bvc bvcVar = (bvc) hvcVar;
                try {
                    m231Var = new CarIcon(new grd(IconCompat.e(this.b.f(bvcVar))));
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    String strM = l1d.m("faceless_avatar:", bvcVar.a);
                    String message = thA.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    this.c.c(strM, message);
                }
                hm5.M(m231Var);
                return m231Var;
            default:
                return c((dvc) hvcVar);
        }
    }

    @Override // p.yuc
    public final Bitmap b(hvc hvcVar, Context context) {
        switch (this.a) {
            case 0:
                int iQ = don1.q(244.0f, context);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iQ, iQ, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                String str = ((bvc) hvcVar).a;
                hg10 hg10Var = new hg10(context, str, str, (Integer) null);
                hg10Var.h.c(hg10.i[0], hg10Var, Boolean.TRUE);
                hg10Var.setBounds(canvas.getClipBounds());
                hg10Var.draw(canvas);
                return bitmapCreateBitmap;
            default:
                return d((dvc) hvcVar, context);
        }
    }

    public CarIcon c(dvc dvcVar) {
        CarIcon m231Var;
        try {
            m231Var = new CarIcon(new grd(IconCompat.e(this.b.f(dvcVar))));
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            String strM = l1d.m("placeholder:", dvcVar.a);
            String message = thA.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            this.c.c(strM, message);
        }
        hm5.M(m231Var);
        return m231Var;
    }
}
