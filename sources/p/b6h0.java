package p;

import android.R;
import android.os.Bundle;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b6h0 {
    public static Function0 a = null;
    public static int b = 17170445;

    public final void a(int i, Integer num, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-471510787);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(num) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            pi30 pi30VarO = bbp1.o(x340Var);
            a = function0;
            b = num != null ? num.intValue() : R.color.transparent;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            kiv kivVar = xce0.a;
            qim0 qim0VarI = zr7.i(qim0VarF, gce0.c);
            Bundle bundle = Bundle.EMPTY;
            w8c0 w8c0Var = (w8c0) hso1.v(((iac0) x340Var.k(jfe0.a)).getLifecycle(), x340Var).getValue();
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = zqb0.e;
                x340Var.s0(objT);
            }
            m5n1.a(t0p0.class, qim0VarI, pi30VarO, bundle, w8c0Var, (iu30) objT, x340Var, 0, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(i, this, qim0Var, function0, num, (byte) 1);
        }
    }
}
