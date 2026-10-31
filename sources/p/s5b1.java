package p;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import androidx.compose.ui.text.font.FontWeight;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class s5b1 {
    public static final String a;
    public static final Object b;
    public static volatile boolean c;
    public static Typeface d;

    static {
        uwr uwrVar = cbx.a;
        yfu yfuVar = ajx.a;
        Object obj = yfuVar.b;
        a = f4i1.c(((FontWeight) ((bjx) yfuVar.c).e).a, "'wdth' 150.0, 'wght' ");
        b = new Object();
    }

    public static final Typeface a(Context context) {
        try {
            i15.q();
            Font.Builder builder = new Font.Builder(context.getResources(), 2131296258);
            uwr uwrVar = cbx.a;
            yfu yfuVar = ajx.a;
            Font fontBuild = builder.setWeight(((FontWeight) ((bjx) yfuVar.c).e).a).setFontVariationSettings(a).build();
            i15.p();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(new FontStyle(((FontWeight) ((bjx) yfuVar.c).e).a, 0)).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
