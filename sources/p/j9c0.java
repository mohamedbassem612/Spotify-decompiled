package p;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j9c0 implements hac0 {
    public final wp20 a;
    public final iac0 b;

    public j9c0(iac0 iac0Var, wp20 wp20Var) {
        this.b = iac0Var;
        this.a = wp20Var;
    }

    @n5q0(k8c0.ON_DESTROY)
    public void onDestroy(iac0 iac0Var) {
        wp20 wp20Var = this.a;
        synchronized (wp20Var.a) {
            try {
                j9c0 j9c0VarB = wp20Var.B(iac0Var);
                if (j9c0VarB == null) {
                    return;
                }
                wp20Var.P(iac0Var);
                Iterator it = ((Set) ((HashMap) wp20Var.c).get(j9c0VarB)).iterator();
                while (it.hasNext()) {
                    ((HashMap) wp20Var.b).remove((i19) it.next());
                }
                ((HashMap) wp20Var.c).remove(j9c0VarB);
                j9c0VarB.b.getLifecycle().d(j9c0VarB);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @n5q0(k8c0.ON_START)
    public void onStart(iac0 iac0Var) {
        this.a.O(iac0Var);
    }

    @n5q0(k8c0.ON_STOP)
    public void onStop(iac0 iac0Var) {
        this.a.P(iac0Var);
    }
}
