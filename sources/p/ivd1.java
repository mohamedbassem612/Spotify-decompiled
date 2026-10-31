package p;

import j$.time.LocalDate;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ivd1 {
    public final ov20 a;

    public ivd1(ov20 ov20Var) {
        this.a = ov20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(lnm lnmVar) {
        hvd1 hvd1Var;
        if (lnmVar instanceof hvd1) {
            hvd1Var = (hvd1) lnmVar;
            int i = hvd1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hvd1Var.c = i - Integer.MIN_VALUE;
            } else {
                hvd1Var = new hvd1(this, lnmVar);
            }
        } else {
            hvd1Var = new hvd1(this, lnmVar);
        }
        Object objI = hvd1Var.a;
        int i2 = hvd1Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            mr20 mr20VarC = this.a.c("country_code", "");
            hvd1Var.c = 1;
            objI = b5p1.i(mr20VarC, hvd1Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        String upperCase = ((String) objI).toUpperCase(Locale.ROOT);
        if (upperCase.equals("NZ")) {
            return null;
        }
        return upperCase.equals("US") ? LocalDate.of(2026, 10, 23) : LocalDate.of(2026, 12, 1);
    }
}
