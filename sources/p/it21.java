package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class it21 extends t9 {
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    public final boolean n(n8d0 n8d0Var) {
        n9 n9Var;
        Object obj = this.a;
        if (obj != null) {
            if (obj instanceof l9) {
                n8d0Var.cancel(((l9) obj).a);
            }
        } else if (n8d0Var.isDone()) {
            if (t9.f.i(this, (Object) null, t9.h(n8d0Var))) {
                t9.e(this);
                return true;
            }
        } else {
            q9 q9Var = new q9(this, n8d0Var);
            if (t9.f.i(this, (Object) null, q9Var)) {
                try {
                    n8d0Var.b(q9Var, j5u.a);
                    return true;
                } catch (Throwable th) {
                    try {
                        n9Var = new n9(th);
                    } catch (Throwable unused) {
                        n9Var = n9.b;
                    }
                    t9.f.i(this, q9Var, n9Var);
                    return true;
                }
            }
            obj = this.a;
            if (obj instanceof l9) {
                n8d0Var.cancel(((l9) obj).a);
            }
        }
        return false;
    }
}
