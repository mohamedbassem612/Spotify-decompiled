package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class z2u implements aac0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ List b;
    public final /* synthetic */ hnn0 c;

    public /* synthetic */ z2u(boolean z, List list, hnn0 hnn0Var) {
        this.a = z;
        this.b = list;
        this.c = hnn0Var;
    }

    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        boolean z = this.a;
        List list = this.b;
        hnn0 hnn0Var = this.c;
        if (z && !list.contains(hnn0Var)) {
            list.add(hnn0Var);
        }
        if (k8c0Var == k8c0.ON_START && !list.contains(hnn0Var)) {
            list.add(hnn0Var);
        }
        if (k8c0Var == k8c0.ON_STOP) {
            list.remove(hnn0Var);
        }
    }
}
