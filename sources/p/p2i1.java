package p;

import android.net.Uri;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p2i1 implements ovc {
    public final aai0 a;
    public final fg10 b;
    public final lvc c;

    public p2i1(aai0 aai0Var, fg10 fg10Var, lvc lvcVar) {
        this.a = aai0Var;
        this.b = fg10Var;
        this.c = lvcVar;
    }

    public final CarIcon a(hvc hvcVar) {
        CarIcon m231Var;
        gvc gvcVar = (gvc) hvcVar;
        String str = gvcVar.b;
        String str2 = gvcVar.a;
        Uri uriF = this.a.f(Uri.parse(str2), gvcVar.c, gvcVar.d);
        boolean zEquals = uriF.equals(Uri.EMPTY);
        fg10 fg10Var = this.b;
        lvc lvcVar = this.c;
        if (zEquals) {
            lvcVar.c("uri:" + str2, "Empty content URI, using placeholder");
            return fg10Var.c(new dvc(str, 2));
        }
        try {
            m231Var = new CarIcon(new grd(IconCompat.e(uriF)));
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.b(gvg.h("Could not create CarIcon for ", str2, ", falling back to placeholder for ", str), new Object[0]);
            n57.g("Could not create CarIcon with contentUri, using placeholder image for " + str, thA);
            String strM = l1d.m("uri:", str2);
            String message = thA.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            lvcVar.c(strM, message);
        }
        if (e331.a(m231Var) != null) {
            m231Var = fg10Var.c(new dvc(str, 2));
        }
        return m231Var;
    }
}
