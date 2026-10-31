package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l7a {
    public final bxn0 a;

    public l7a(bxn0 bxn0Var) {
        this.a = bxn0Var;
    }

    public final void a(String str) {
        boolean zJ = u890.j(nik1.l1.a, str);
        bxn0 bxn0Var = this.a;
        if (!zJ) {
            if (u890.j(nik1.F0.a, str)) {
                bxn0Var.d = true;
            }
        } else {
            i1s0 i1s0Var = bxn0Var.c;
            if (i1s0Var == null) {
                i1s0Var = new i1s0(0L, 255, (String) null);
            }
            bxn0Var.a.a(i1s0Var.b(), "npv_open", bxn0Var.a(), i1s0Var.h(), i1s0Var.i(), i1s0Var.f());
            bxn0Var.c = null;
        }
    }
}
