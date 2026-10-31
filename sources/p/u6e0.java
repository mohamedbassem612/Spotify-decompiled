package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u6e0 implements wu30 {
    public final /* synthetic */ v6e0 a;

    public u6e0(v6e0 v6e0Var) {
        this.a = v6e0Var;
    }

    public final Object apply(Object obj) {
        mmr0 mmr0Var = (mmr0) obj;
        Object obj2 = mmr0Var.a;
        Bundle bundle = (Bundle) mmr0Var.b;
        v6e0 v6e0Var = this.a;
        t7e0 t7e0VarV = e4p1.v(v6e0Var.a, bundle);
        v6e0Var.i = t7e0VarV;
        t7e0 t7e0Var = t7e0VarV.e;
        s7e0 s7e0Var = v6e0Var.g;
        if (s7e0Var != null) {
            hm5.J(s7e0Var.a, t7e0Var);
        }
        return v6e0Var.f(obj2, t7e0VarV);
    }
}
