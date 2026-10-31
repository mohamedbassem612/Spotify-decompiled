package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class du9 extends m1q0 {
    public final b5b1 d;
    public final ivn0 e;

    public du9(u6j0 u6j0Var, b5b1 b5b1Var, ivn0 ivn0Var) {
        super(((Boolean) u6j0Var.invoke()).booleanValue());
        this.d = b5b1Var;
        this.e = ivn0Var;
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 30 || ((Boolean) this.d.invoke()).booleanValue()) {
            this.e.invoke();
        }
    }
}
