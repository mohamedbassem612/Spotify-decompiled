package p;

import android.content.Context;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class fa30 {
    public static final Locale[] a = {new Locale("th"), new Locale("vi")};

    public static void a(TextView textView, Context context) {
        Locale localeB = yoi1.A(context.getResources().getConfiguration()).b(0);
        for (Locale locale : a) {
            if (localeB.getLanguage().equals(locale.getLanguage())) {
                return;
            }
        }
        TextPaint paint = textView.getPaint();
        paint.setFlags(paint.getFlags() | 129);
        paint.setHinting(0);
    }
}
