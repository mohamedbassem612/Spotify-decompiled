package p;

import android.content.Context;
import android.icu.text.CompactDecimalFormat;
import android.icu.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aht0 {
    public final Context a;

    public aht0(Context context) {
        this.a = context;
    }

    public final String a(long j, Locale locale, boolean z) {
        if (j < 1000) {
            String string = this.a.getString(2131962718, "1000");
            string.getClass();
            return string;
        }
        if (j <= 9999) {
            String str = NumberFormat.getInstance(locale).format(j);
            str.getClass();
            return str;
        }
        CompactDecimalFormat compactDecimalFormat = CompactDecimalFormat.getInstance(locale, z ? CompactDecimalFormat.CompactStyle.LONG : CompactDecimalFormat.CompactStyle.SHORT);
        compactDecimalFormat.setMaximumFractionDigits(1);
        String str2 = compactDecimalFormat.format(j);
        str2.getClass();
        return str2;
    }
}
