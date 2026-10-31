package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w161 {
    public final o161 a;
    public final gdn0 b;

    public w161(v161 v161Var, or80 or80Var) {
        this.a = v161Var.d;
        List listI = v161Var.i((4 & 1) != 0 ? !v161Var.b : false, (4 & 2) == 0);
        this.b = new gdn0(listI.size());
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            v161 v161Var2 = (v161) listI.get(i);
            if (or80Var.a(v161Var2.f)) {
                this.b.a(v161Var2.f);
            }
        }
    }
}
