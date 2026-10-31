package p;

import java.util.Arrays;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class q601 {
    public static final vbm[] a;

    static {
        try {
            a = (vbm[]) z561.k0(z561.Q(Arrays.asList(new vbm[0]).iterator())).toArray(new vbm[0]);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static final kge a(moy0 moy0Var) {
        return new kge(moy0Var);
    }

    public static rr20 b(mr20 mr20Var) {
        bhh1 bhh1Var = igu.b;
        bhh1Var.getClass();
        return new rr20(mr20Var, ilo1.B(bhh1Var, o6x.a));
    }
}
