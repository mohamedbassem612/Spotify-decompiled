package p;

import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bqe1 implements gp80 {
    public final zle1 a;
    public final lxg b;

    public bqe1(zle1 zle1Var, lxg lxgVar) {
        this.a = zle1Var;
        this.b = lxgVar;
    }

    @Override // p.gp80
    public final void a(String str) {
        i94 i94Var = (i94) this.b;
        i94Var.getClass();
        i94Var.e("quasar_".concat(str.toLowerCase(Locale.US)));
    }

    @Override // p.gp80
    public final void b(String str) {
        i94 i94Var = (i94) this.b;
        i94Var.getClass();
        i94Var.a("quasar_".concat(str.toLowerCase(Locale.US)));
    }

    @Override // p.gp80
    public final long c() {
        return ((s45) this.a).a.a();
    }

    @Override // p.gp80
    public final void d(tfh0 tfh0Var) {
        String str = tfh0Var.a;
        s45 s45Var = (s45) this.a;
        t45 t45VarA = s45Var.a(str);
        t45.c(t45VarA, tfh0Var.a, tfh0Var.b, tfh0Var.c, 8);
        for (sfh0 sfh0Var : tfh0Var.d) {
            t45.c(t45VarA, sfh0Var.a, sfh0Var.c, sfh0Var.d, 24);
        }
        for (Map.Entry entry : tfh0Var.e.entrySet()) {
            t45VarA.b((String) entry.getKey(), (String) entry.getValue());
        }
        s45Var.b(t45VarA.e());
    }
}
