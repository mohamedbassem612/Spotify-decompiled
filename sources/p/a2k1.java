package p;

import android.content.Context;
import android.icu.text.CompactDecimalFormat;
import android.icu.util.ULocale;
import java.math.RoundingMode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class a2k1 {
    public static final CompactDecimalFormat a;
    public static final CompactDecimalFormat b;

    static {
        ULocale.Category category = ULocale.Category.FORMAT;
        CompactDecimalFormat compactDecimalFormat = CompactDecimalFormat.getInstance(ULocale.getDefault(category), CompactDecimalFormat.CompactStyle.LONG);
        compactDecimalFormat.setMaximumFractionDigits(0);
        compactDecimalFormat.setMinimumFractionDigits(0);
        RoundingMode roundingMode = RoundingMode.HALF_DOWN;
        compactDecimalFormat.setRoundingMode(roundingMode.ordinal());
        a = compactDecimalFormat;
        CompactDecimalFormat compactDecimalFormat2 = CompactDecimalFormat.getInstance(ULocale.getDefault(category), CompactDecimalFormat.CompactStyle.SHORT);
        compactDecimalFormat2.setMaximumFractionDigits(0);
        compactDecimalFormat2.setMinimumFractionDigits(0);
        compactDecimalFormat2.setRoundingMode(roundingMode.ordinal());
        b = compactDecimalFormat2;
    }

    public static final String a(Context context, d2k1 d2k1Var) {
        if (!(d2k1Var instanceof c2k1)) {
            if (u890.j(d2k1Var, b2k1.a)) {
                return context.getResources().getString(2131962682);
            }
            return null;
        }
        String strC = c(b, (c2k1) d2k1Var);
        if (strC == null) {
            return null;
        }
        return context.getResources().getString(2131962683, strC);
    }

    public static final String b(Context context, d2k1 d2k1Var) {
        if (!(d2k1Var instanceof c2k1)) {
            if (u890.j(d2k1Var, b2k1.a)) {
                return context.getResources().getString(2131962682);
            }
            return null;
        }
        String strC = c(a, (c2k1) d2k1Var);
        if (strC == null) {
            return null;
        }
        return context.getResources().getString(2131962684, strC);
    }

    public static final String c(CompactDecimalFormat compactDecimalFormat, c2k1 c2k1Var) {
        Long lValueOf;
        long j = c2k1Var.a;
        if (j > 0) {
            if (j >= 1000000000) {
                lValueOf = Long.valueOf(((long) Math.floor(j / 1.0E9d)) * 1000000000);
            } else if (j >= 1000000) {
                lValueOf = Long.valueOf(((long) Math.floor(j / 1000000.0d)) * 1000000);
            } else if (j >= 100000) {
                lValueOf = Long.valueOf(((long) Math.floor(j / 100000.0d)) * 100000);
            } else if (j >= 75000) {
                lValueOf = 75000L;
            } else {
                lValueOf = j >= 50000 ? 50000L : null;
            }
            if (lValueOf != null) {
                return compactDecimalFormat.format(lValueOf.longValue());
            }
        }
        return null;
    }
}
