package p;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface u8s0 {
    static void b(tw4 tw4Var, n511 n511Var) {
        RectF rectF = tw4Var.b;
        if (rectF == null) {
            rectF = new RectF();
            tw4Var.b = rectF;
        }
        rectF.set(n511Var.a, n511Var.b, n511Var.c, n511Var.d);
        Path path = tw4Var.a;
        RectF rectF2 = tw4Var.b;
        rectF2.getClass();
        path.addOval(rectF2, ww4.c(1));
    }

    static void c(u8s0 u8s0Var, n511 n511Var) {
        tw4 tw4Var = (tw4) u8s0Var;
        float f = n511Var.a;
        float f2 = n511Var.d;
        float f3 = n511Var.c;
        float f4 = n511Var.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            ww4.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = tw4Var.b;
        if (rectF == null) {
            rectF = new RectF();
            tw4Var.b = rectF;
        }
        rectF.set(f, f4, f3, f2);
        Path path = tw4Var.a;
        RectF rectF2 = tw4Var.b;
        rectF2.getClass();
        path.addRect(rectF2, ww4.c(1));
    }
}
