package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cx21 implements ovc {
    public final ynb0 a;
    public final lvc b;

    public cx21(ynb0 ynb0Var, lvc lvcVar) {
        this.a = ynb0Var;
        this.b = lvcVar;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final CarIcon a(fvc fvcVar) {
        CarIcon m231Var;
        int identifier;
        IconCompat iconCompatF;
        CarColor carColorA;
        String str = fvcVar.b;
        Integer num = fvcVar.a;
        try {
            androidx.car.app.k kVar = (androidx.car.app.k) this.a.get();
            Integer num2 = num == null ? null : num;
            if (num2 != null) {
                identifier = num2.intValue();
            } else {
                str.getClass();
                List listQ0 = ihc1.Q0(str, new String[]{"/"}, 0, 6);
                identifier = kVar.getResources().getIdentifier((String) o7h.A0(listQ0), (String) listQ0.get(listQ0.size() - 2), kVar.getPackageName());
            }
            Integer num3 = fvcVar.d;
            if (num3 != null) {
                int iIntValue = num3.intValue();
                Drawable drawable = kVar.getDrawable(identifier);
                drawable.getClass();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int iApplyDimension = (int) TypedValue.applyDimension(1, iIntValue, kVar.getResources().getDisplayMetrics());
                int i = iApplyDimension * 2;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth + i, i + intrinsicHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(iApplyDimension, iApplyDimension, intrinsicWidth + iApplyDimension, intrinsicHeight + iApplyDimension);
                drawable.draw(canvas);
                iconCompatF = IconCompat.d(bitmapCreateBitmap);
            } else {
                iconCompatF = IconCompat.f(kVar, identifier);
            }
            grd grdVar = new grd(iconCompatF);
            mmr0 mmr0Var = fvcVar.c;
            if (mmr0Var == null || (carColorA = CarColor.createCustom(((Number) mmr0Var.a).intValue(), ((Number) mmr0Var.b).intValue())) == null) {
                carColorA = zuc.n.a();
            }
            grdVar.a(carColorA);
            m231Var = new CarIcon(grdVar);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        Object obj = str;
        if (thA != null) {
            if (str == null) {
                obj = num;
            }
            String strG = gvg.g(obj, "resource:");
            String message = thA.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            this.b.c(strG, message);
        }
        hm5.M(m231Var);
        return m231Var;
    }
}
