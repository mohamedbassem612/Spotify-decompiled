package p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class rac0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tac0 b;
    public final /* synthetic */ iac0 c;

    public /* synthetic */ rac0(tac0 tac0Var, iac0 iac0Var, byte b) {
        this.a = b;
        this.b = tac0Var;
        this.c = iac0Var;
    }

    public final Object invoke(Object obj) {
        k8c0 k8c0Var;
        k8c0 k8c0Var2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iac0 iac0Var = this.c;
        tac0 tac0Var = this.b;
        Map.Entry entry = (Map.Entry) obj;
        switch (b) {
            case 0:
                hac0 hac0Var = (hac0) entry.getKey();
                sac0 sac0Var = (sac0) entry.getValue();
                while (true) {
                    w8c0 w8c0Var = sac0Var.a;
                    w8c0 w8c0Var2 = tac0Var.i;
                    ArrayList arrayList = tac0Var.h;
                    if (w8c0Var.compareTo(w8c0Var2) <= 0 || tac0Var.g || !((nen0) tac0Var.c.b).c(hac0Var)) {
                        return rih1Var;
                    }
                    i8c0 i8c0Var = k8c0.Companion;
                    w8c0 w8c0Var3 = sac0Var.a;
                    i8c0Var.getClass();
                    int iOrdinal = w8c0Var3.ordinal();
                    if (iOrdinal == 2) {
                        k8c0Var = k8c0.ON_DESTROY;
                    } else if (iOrdinal != 3) {
                        k8c0Var = iOrdinal != 4 ? null : k8c0.ON_PAUSE;
                    } else {
                        k8c0Var = k8c0.ON_STOP;
                    }
                    if (k8c0Var == null) {
                        bhn0.g(sac0Var.a, "no event down from ");
                        return null;
                    }
                    arrayList.add(k8c0Var.a());
                    sac0Var.a(iac0Var, k8c0Var);
                    r7h.e0(arrayList);
                }
                break;
            default:
                hac0 hac0Var2 = (hac0) entry.getKey();
                sac0 sac0Var2 = (sac0) entry.getValue();
                while (true) {
                    w8c0 w8c0Var4 = sac0Var2.a;
                    w8c0 w8c0Var5 = tac0Var.i;
                    ArrayList arrayList2 = tac0Var.h;
                    if (w8c0Var4.compareTo(w8c0Var5) >= 0 || tac0Var.g || !((nen0) tac0Var.c.b).c(hac0Var2)) {
                        return rih1Var;
                    }
                    arrayList2.add(sac0Var2.a);
                    i8c0 i8c0Var2 = k8c0.Companion;
                    w8c0 w8c0Var6 = sac0Var2.a;
                    i8c0Var2.getClass();
                    int iOrdinal2 = w8c0Var6.ordinal();
                    if (iOrdinal2 == 1) {
                        k8c0Var2 = k8c0.ON_CREATE;
                    } else if (iOrdinal2 != 2) {
                        k8c0Var2 = iOrdinal2 != 3 ? null : k8c0.ON_RESUME;
                    } else {
                        k8c0Var2 = k8c0.ON_START;
                    }
                    if (k8c0Var2 == null) {
                        bhn0.g(sac0Var2.a, "no event up from ");
                        return null;
                    }
                    sac0Var2.a(iac0Var, k8c0Var2);
                    r7h.e0(arrayList2);
                }
                break;
        }
    }
}
