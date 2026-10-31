package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oxi0 {
    public final i8h1 a;
    public final n7h1 b;
    public final i7h1 c = suo1.x();
    public final String d;
    public vik1 e;
    public View f;
    public t480 g;
    public String h;

    public oxi0(i8h1 i8h1Var, n7h1 n7h1Var, hvp0 hvp0Var) {
        this.a = i8h1Var;
        this.b = n7h1Var;
        this.d = hvp0Var.g();
    }

    public final tv80 a(String str, boolean z) {
        pxi0 pxi0Var = new pxi0(this.d, str, z);
        Object objB = this.c.b(pxi0Var, pxi0Var, nxi0.a, (op80) null);
        w7h1 w7h1Var = objB instanceof w7h1 ? (w7h1) objB : null;
        if (w7h1Var != null) {
            return this.a.m(w7h1Var, null);
        }
        return null;
    }
}
