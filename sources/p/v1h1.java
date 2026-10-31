package p;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class v1h1 {
    public static final ThreadLocal a = new ThreadLocal();

    public static Typeface a(Typeface typeface, ja30 ja30Var, Context context) {
        String strB;
        boolean z;
        float fA;
        if (typeface == null) {
            return null;
        }
        List list = ja30Var.a;
        List list2 = ja30Var.a;
        if (list.isEmpty()) {
            return typeface;
        }
        ThreadLocal threadLocal = a;
        Paint paint = (Paint) threadLocal.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        yat yatVarB = z1a1.b(context);
        int iQ = mb4.q(context);
        if (iQ == 0) {
            strB = p5d0.b(list2, null, new g6f0(yatVarB), 31);
        } else {
            int size = list2.size();
            int i = 0;
            String str = "";
            boolean z2 = false;
            while (i < size) {
                ga30 ga30Var = (ga30) list2.get(i);
                if (u890.j(ga30Var.b(), "wght")) {
                    fA = yoi1.o(ga30Var.a() + iQ, 1.0f, 1000.0f);
                    z = true;
                } else {
                    z = z2;
                    fA = ga30Var.a();
                }
                if (i != 0) {
                    str = ((Object) str) + ",";
                }
                str = ((Object) str) + "'" + ga30Var.b() + "' " + fA;
                i++;
                z2 = z;
            }
            if (z2) {
                strB = str;
            } else {
                float fO = yoi1.o(iQ + 400.0f, 1.0f, 1000.0f);
                if (!list2.isEmpty()) {
                    str = ((Object) str) + ",";
                }
                strB = ((Object) str) + "'wght' " + fO;
            }
        }
        paint.setFontVariationSettings(strB);
        return paint.getTypeface();
    }
}
