package p;

import androidx.lifecycle.LifecycleDestroyedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s760 implements aac0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s760(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        Object m231Var;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                uoa uoaVar = (uoa) obj2;
                ven0 ven0Var = (ven0) obj3;
                int i = r760.a[k8c0Var.ordinal()];
                if (i == 1 || i == 2) {
                    ven0Var.setValue(Boolean.TRUE);
                    uoaVar.f();
                } else if (i == 3 || i == 4) {
                    ven0Var.setValue(Boolean.FALSE);
                    if (!((Boolean) ((ven0) obj).getValue()).booleanValue()) {
                        uoaVar.l();
                    }
                }
                break;
            case 1:
                if (k8c0Var == ((k8c0) obj2)) {
                    ((ohd) obj3).resumeWith(Boolean.TRUE);
                    lj30 lj30Var = (lj30) obj;
                    lj30Var.b();
                    lj30Var.e.d(this);
                }
                break;
            default:
                ohd ohdVar = (ohd) obj3;
                x8c0 x8c0Var = (x8c0) obj2;
                k8c0.Companion.getClass();
                if (k8c0Var == k8c0.ON_CREATE) {
                    x8c0Var.d(this);
                    try {
                        m231Var = ((Function0) obj).invoke();
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    ohdVar.resumeWith(m231Var);
                } else if (k8c0Var == k8c0.ON_DESTROY) {
                    x8c0Var.d(this);
                    ohdVar.resumeWith(new m231(new LifecycleDestroyedException()));
                }
                break;
        }
    }
}
