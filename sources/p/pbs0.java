package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class pbs0 implements rjp0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qbs0 b;

    public /* synthetic */ pbs0(qbs0 qbs0Var, byte b) {
        this.a = b;
        this.b = qbs0Var;
    }

    public final void b(Object obj) {
        byte b = this.a;
        qbs0 qbs0Var = this.b;
        switch (b) {
            case 0:
                qbs0Var.c1((fiw) obj);
                break;
            default:
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    qbs0Var.c1((fiw) it.next());
                }
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new tv30(1, this.b, qbs0.class, "trigger", "trigger(Lcom/spotify/payment/paymentimpl/data/Effect$ViewEffect;)V", 0);
            default:
                return new tv30(1, this.b, qbs0.class, "triggerAfterPause", "triggerAfterPause(Ljava/lang/Iterable;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
