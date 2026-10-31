package p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g7h1 {
    public final ynb0 a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public g7h1(ynb0 ynb0Var) {
        this.a = ynb0Var;
    }

    public static /* synthetic */ void b(g7h1 g7h1Var, n6r0 n6r0Var, tv80 tv80Var, int i) {
        if ((i & 4) != 0) {
            tv80Var = null;
        }
        g7h1Var.a(n6r0Var, null, tv80Var);
    }

    public final void a(n6r0 n6r0Var, String str, tv80 tv80Var) {
        String strPath = n6r0Var.path();
        this.b.set(true);
        nsn0 nsn0VarM = tv80Var != null ? mqn1.M(str, tv80Var) : jsn0.a;
        ynb0 ynb0Var = this.a;
        ((mwn0) ynb0Var.get()).e(nsn0VarM);
        mwn0 mwn0Var = (mwn0) ynb0Var.get();
        strPath.getClass();
        mwn0Var.g(new gwn0(strPath, str, null, null, 12));
    }
}
