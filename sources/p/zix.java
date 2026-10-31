package p;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class zix {
    public static final HashMap a = new HashMap();

    public static final FontFamily a(int i, FontWeight fontWeight, int i2, b0k b0kVar) {
        Object objD;
        Context context = (Context) ((x340) b0kVar).k(AndroidCompositionLocals_androidKt.b);
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = a;
        Object obj = map.get(numValueOf);
        if (obj == null) {
            Typeface typefaceK = x74.K(context, i, i2);
            if (typefaceK != null) {
                if (Build.VERSION.SDK_INT >= 31 && context.getResources().getConfiguration().fontWeightAdjustment != Integer.MAX_VALUE) {
                    int i3 = fontWeight.a + context.getResources().getConfiguration().fontWeightAdjustment;
                    if (i3 > 1000) {
                        i3 = 1000;
                    }
                    typefaceK = Typeface.create(typefaceK, i3, typefaceK.isItalic());
                    typefaceK.getClass();
                }
                objD = qon1.c(typefaceK);
            } else {
                objD = hm5.d(o0c.b(i, fontWeight));
            }
            obj = objD;
            map.put(numValueOf, obj);
        }
        return (FontFamily) obj;
    }
}
