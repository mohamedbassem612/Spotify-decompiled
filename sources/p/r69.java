package p;

import android.content.res.Resources;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r69 {
    public static final BigDecimal f = BigDecimal.valueOf(1000L);
    public final Resources a;
    public final NumberFormat b;
    public final NumberFormat c;
    public final LinkedHashMap d;
    public final DecimalFormat e;

    public r69(Resources resources, Locale locale) {
        this.a = resources;
        NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
        numberInstance.setMinimumFractionDigits(1);
        numberInstance.setMaximumFractionDigits(1);
        this.b = numberInstance;
        NumberFormat integerInstance = NumberFormat.getIntegerInstance(locale);
        integerInstance.setRoundingMode(RoundingMode.HALF_UP);
        this.c = integerInstance;
        tr80 tr80Var = new tr80(0, 2, 1);
        int iS = zno1.s(q7h.U(tr80Var, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        lr80 it = tr80Var.iterator();
        while (((sr80) it).c) {
            Object next = it.next();
            int iIntValue = ((Number) next).intValue();
            NumberFormat numberInstance2 = NumberFormat.getNumberInstance(locale);
            numberInstance2.setMinimumFractionDigits(0);
            numberInstance2.setMaximumFractionDigits(iIntValue);
            numberInstance2.setRoundingMode(RoundingMode.HALF_UP);
            linkedHashMap.put(next, numberInstance2);
        }
        this.d = linkedHashMap;
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getPercentInstance(locale);
        decimalFormat.setMultiplier(1);
        decimalFormat.setMinimumFractionDigits(0);
        decimalFormat.setMaximumFractionDigits(0);
        this.e = decimalFormat;
    }

    public final String a(double d, int i, int i2) {
        q69 q69Var;
        int i3;
        int iC = l1d.C(i);
        Resources resources = this.a;
        if (iC == 0) {
            return resources.getString(2131958634, this.b.format(BigDecimal.valueOf(d).setScale(1, RoundingMode.HALF_UP)));
        }
        if (iC != 1) {
            if (iC == 2) {
                return this.e.format(d);
            }
            eg.o();
            return null;
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d);
        if (bigDecimalValueOf.setScale(0, RoundingMode.HALF_UP).compareTo(f) < 0) {
            q69Var = new q69(this.c.format(bigDecimalValueOf), 1);
        } else {
            BigDecimal bigDecimalMovePointLeft = bigDecimalValueOf.movePointLeft(3);
            int iP = yoi1.p(3 - Math.max(1, bigDecimalMovePointLeft.precision() - bigDecimalMovePointLeft.scale()), 0, 2);
            q69Var = new q69(((NumberFormat) sqg0.G(Integer.valueOf(iP), this.d)).format(bigDecimalMovePointLeft), 2);
        }
        int iC2 = l1d.C(i2);
        int i4 = q69Var.b;
        if (iC2 == 0) {
            int iC3 = l1d.C(i4);
            if (iC3 == 0) {
                i3 = 2131958635;
            } else {
                if (iC3 != 1) {
                    eg.o();
                    return null;
                }
                i3 = 2131958638;
            }
        } else if (iC2 == 1) {
            int iC4 = l1d.C(i4);
            if (iC4 == 0) {
                i3 = 2131958639;
            } else {
                if (iC4 != 1) {
                    eg.o();
                    return null;
                }
                i3 = 2131958640;
            }
        } else {
            if (iC2 != 2) {
                eg.o();
                return null;
            }
            int iC5 = l1d.C(i4);
            if (iC5 == 0) {
                i3 = 2131958636;
            } else {
                if (iC5 != 1) {
                    eg.o();
                    return null;
                }
                i3 = 2131958637;
            }
        }
        return resources.getString(i3, q69Var.a);
    }
}
