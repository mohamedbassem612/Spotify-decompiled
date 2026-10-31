package p;

import android.os.Bundle;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ctw extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dtw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ctw(dtw dtwVar, byte b) {
        super(0);
        this.a = b;
        this.b = dtwVar;
    }

    public final Object invoke() {
        nml nmlVarH;
        byte b = this.a;
        dtw dtwVar = this.b;
        switch (b) {
            case 0:
                return dtwVar.f;
            case 1:
                t8r0 t8r0Var = dtwVar.x;
                if (t8r0Var != null) {
                    return ((rl1) t8r0Var.b).x();
                }
                return null;
            case 2:
                t8r0 t8r0Var2 = dtwVar.x;
                boolean z = false;
                if (t8r0Var2 != null && !((rl1) t8r0Var2.b).b) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return Integer.valueOf(dtwVar.i.f);
            case 4:
                return dtwVar.b;
            case 5:
                op80 op80VarB = dtwVar.l.b();
                if (op80VarB == null || (nmlVarH = hap1.h(op80VarB)) == null) {
                    nmlVarH = dtwVar.y;
                } else {
                    dtwVar.y = nmlVarH;
                }
                if (nmlVarH == null) {
                    return null;
                }
                dtwVar.d(nmlVarH);
                return nmlVarH.a();
            default:
                dts dtsVarF = dtwVar.b.f();
                return new dts(dtsVarF.a, dtsVarF.b, dtsVarF.c(dtwVar.b.h()), (Bundle) null);
        }
    }
}
