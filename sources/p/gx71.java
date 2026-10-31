package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gx71 {
    public final String a;
    public final ctf b;
    public final jwm c;
    public final List d;
    public final int e;

    public gx71(String str, ctf ctfVar, jwm jwmVar, List list, int i) {
        this.a = str;
        this.b = ctfVar;
        this.c = jwmVar;
        this.d = list;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx71)) {
            return false;
        }
        gx71 gx71Var = (gx71) obj;
        return u890.j(this.a, gx71Var.a) && u890.j(this.b, gx71Var.b) && u890.j(this.c, gx71Var.c) && this.d.equals(gx71Var.d) && this.e == gx71Var.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + f4i1.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
