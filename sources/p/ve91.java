package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ve91 implements jn60 {
    public final String a;
    public final String b = "";
    public final yz21 c = yz21.d;
    public final ef91 d;

    public ve91(String str, ef91 ef91Var) {
        this.a = str;
        this.d = ef91Var;
    }

    public final List d(op80 op80Var) {
        return Collections.singletonList(new te91(this.a, op80Var, this.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve91)) {
            return false;
        }
        ve91 ve91Var = (ve91) obj;
        return this.a.equals(ve91Var.a) && this.b.equals(ve91Var.b) && this.c.equals(ve91Var.c) && this.d == ve91Var.d;
    }

    public final yz21 f() {
        return this.c;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + bb00.g(this.c, cy30.d(this.a.hashCode() * 31, 961, this.b), 31);
    }
}
