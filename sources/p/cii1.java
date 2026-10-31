package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cii1 implements acr0 {
    public final boolean a;
    public final Set b = Collections.singleton(blc0.Y9);

    public cii1(boolean z) {
        this.a = z;
    }

    public final Set a() {
        return this.b;
    }

    public final Class b() {
        return aii1.class;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0013 A[PHI: r4
      0x0013: PHI (r4v6 java.lang.Integer) = (r4v1 java.lang.Integer), (r4v7 java.lang.Integer) binds: [B:10:0x002a, B:5:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        Integer numC0;
        int iIntValue;
        nks0 nks0Var;
        pks0 oks0Var;
        String strO = s4b1Var.o(1);
        if (strO == null || (numC0 = nhc1.c0(strO)) == null) {
            numC0 = strO != null ? (Integer) dii1.a.get(strO.toLowerCase(Locale.ROOT)) : null;
            if (numC0 != null) {
                iIntValue = numC0.intValue();
            } else {
                v8i0.j("Invalid parameter ", strO);
                iIntValue = 2;
            }
        } else {
            iIntValue = numC0.intValue();
        }
        String strO2 = s4b1Var.o(2);
        Long lD0 = strO2 != null ? nhc1.d0(10, strO2) : null;
        if (lD0 == null || lD0.longValue() <= 0) {
            if (lD0 != null || u890.j(strO2, "current")) {
                nks0Var = new nks0(0);
            } else {
                n57.s("Invalid parameter " + strO2);
                nks0Var = new nks0(0);
            }
            oks0Var = nks0Var;
        } else {
            oks0Var = this.a ? new oks0(lD0.longValue()) : new nks0((int) lD0.longValue());
        }
        String stringExtra = intent.getStringExtra("date");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return new bii1(iIntValue, oks0Var, stringExtra);
    }

    public final String getDescription() {
        return "User stats details page";
    }
}
