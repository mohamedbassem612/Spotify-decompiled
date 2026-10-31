package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w991 {
    public final String a;
    public final d991 b;
    public final iu30 c;
    public final List d;

    public w991(String str, d991 d991Var, iu30 iu30Var, smc0 smc0Var) {
        this.a = str;
        this.b = d991Var;
        this.c = iu30Var;
        this.d = smc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w991)) {
            return false;
        }
        w991 w991Var = (w991) obj;
        return u890.j(this.a, w991Var.a) && this.b == w991Var.b && u890.j(this.c, w991Var.c) && this.d.equals(w991Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ktd.g(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }
}
