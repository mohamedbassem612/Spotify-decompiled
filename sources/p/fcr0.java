package p;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fcr0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hcr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fcr0(hcr0 hcr0Var, byte b) {
        super(0);
        this.a = b;
        this.b = hcr0Var;
    }

    public final Object invoke() {
        ebr0 ebr0Var;
        byte b = this.a;
        byte b2 = 0;
        hcr0 hcr0Var = this.b;
        switch (b) {
            case 0:
                return hcr0Var.Y0();
            case 1:
                return new ecr0(new n1r0(hcr0Var, (byte) 2), new fcr0(hcr0Var, b2), n6x.a, hcr0Var.d1());
            case 2:
                return rqt0.u(new php0((mr20) hcr0Var.U1.getValue(), (byte) 13));
            case 3:
                Bundle bundle = ((zf30) hcr0Var).f;
                if (bundle != null) {
                    return bundle.getParcelable("parameters");
                }
                return null;
            case 4:
                idd1 idd1Var = hcr0Var.L1;
                Map map = hcr0Var.Q1;
                if (map != null && (ebr0Var = (ebr0) map.get(Class.forName((String) idd1Var.getValue()))) != null) {
                    return ebr0Var;
                }
                n9v.k("could not find ", (String) idd1Var.getValue(), " in registry");
                return null;
            case 5:
                return hcr0Var.b1();
            case 6:
                return hcr0Var.e1().a();
            default:
                return new ki10(new cbr0(new dbr0[]{new s8r(hcr0Var.e1().getClass().getSimpleName())}, false), (cbr0) hcr0Var.S1.getValue());
        }
    }
}
