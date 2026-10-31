package p;

import android.content.Context;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lsr {
    public final NumberFormat a;

    public lsr(Context context) {
        this.a = NumberFormat.getCurrencyInstance(new Locale(upn1.n(context)));
    }

    public final String a(String str, double d) {
        Currency currency = Currency.getInstance(str);
        NumberFormat numberFormat = this.a;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setCurrency(currency);
        return numberFormat.format(d);
    }
}
