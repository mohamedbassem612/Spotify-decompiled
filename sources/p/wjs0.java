package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wjs0 {
    public final zle1 a;
    public t45 b;

    public wjs0(zle1 zle1Var) {
        this.a = zle1Var;
    }

    public final void a(int i) {
        t45 t45Var = this.b;
        if (t45Var != null) {
            t45Var.g("connecting_to_eip");
        }
        String strConcat = "success";
        if (5 == i || 4 == i || 3 == i) {
            if (i == 1) {
                strConcat = "start";
            } else if (i != 2) {
                if (i == 3) {
                    strConcat = "error_upstream";
                } else if (i == 4) {
                    strConcat = "complete_upstream";
                } else {
                    if (i != 5) {
                        throw null;
                    }
                    strConcat = "cancel_downstream";
                }
            }
            strConcat = "eip_".concat(strConcat);
        }
        t45 t45Var2 = this.b;
        if (t45Var2 != null) {
            t45Var2.a("reason", strConcat);
        }
        t45 t45Var3 = this.b;
        if (t45Var3 != null) {
            t45Var3.g("eip_connection");
        }
        t45 t45Var4 = this.b;
        if (t45Var4 != null) {
            this.a.b(t45Var4.e());
        }
        this.b = null;
    }
}
