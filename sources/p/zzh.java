package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class zzh implements aac0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zzh(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                r1q0 r1q0Var = (r1q0) obj2;
                g0i g0iVar = (g0i) obj;
                if (k8c0Var == k8c0.ON_CREATE) {
                    r1q0Var.e = gg.o(g0iVar);
                    r1q0Var.e(r1q0Var.g);
                }
                break;
            case 1:
                ii30 ii30Var = (ii30) obj2;
                hnn0 hnn0Var = (hnn0) obj;
                if (k8c0Var == k8c0.ON_RESUME && ((List) ii30Var.b().e.a.getValue()).contains(hnn0Var)) {
                    if (ii30.n()) {
                        hnn0Var.toString();
                        iac0Var.toString();
                    }
                    ii30Var.b().c(hnn0Var);
                }
                if (k8c0Var == k8c0.ON_DESTROY) {
                    if (ii30.n()) {
                        hnn0Var.toString();
                        iac0Var.toString();
                    }
                    ii30Var.b().c(hnn0Var);
                }
                break;
            case 2:
                ven0 ven0Var = (ven0) obj;
                if (k8c0Var == ((k8c0) obj2)) {
                    ((Function0) ven0Var.getValue()).invoke();
                }
                break;
            default:
                kqi0 kqi0Var = (kqi0) obj2;
                qti0 qti0Var = (qti0) obj;
                if (k8c0Var != k8c0.ON_DESTROY) {
                    kqi0Var.getClass();
                } else {
                    kqi0Var.D(qti0Var);
                }
                break;
        }
    }
}
