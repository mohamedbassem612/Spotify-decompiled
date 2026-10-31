package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jlb1 implements gp80 {
    public final zle1 a;
    public final lxg b;

    public jlb1(zle1 zle1Var, lxg lxgVar) {
        this.a = zle1Var;
        this.b = lxgVar;
    }

    public final void a(String str) {
        i94 i94Var = this.b;
        i94Var.getClass();
        i94Var.e("quasar_".concat(str.toLowerCase(Locale.US)));
    }

    public final void b(String str) {
        i94 i94Var = this.b;
        i94Var.getClass();
        i94Var.a("quasar_".concat(str.toLowerCase(Locale.US)));
    }

    public final long c() {
        return this.a.a.a();
    }

    public final void d(tfh0 tfh0Var) {
    }
}
