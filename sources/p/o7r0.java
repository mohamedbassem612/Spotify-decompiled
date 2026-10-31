package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface o7r0 {
    static /* synthetic */ c7r0 c(o7r0 o7r0Var, qe41 qe41Var, iac0 iac0Var, bbr0 bbr0Var, Function0 function0, String str, fkk1 fkk1Var, int i) {
        if ((i & 16) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            fkk1Var = new w5r0((byte) 1);
        }
        return o7r0Var.b(qe41Var, iac0Var, bbr0Var, function0, str2, fkk1Var, null);
    }

    c7r0 b(qe41 qe41Var, iac0 iac0Var, bbr0 bbr0Var, Function0 function0, String str, fkk1 fkk1Var, cwn0 cwn0Var);
}
