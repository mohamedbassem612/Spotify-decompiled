package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ee91 implements jn60 {
    public final String a;
    public final String b = "";
    public final yz21 c = yz21.d;
    public final ef91 d;

    public ee91(String str, ef91 ef91Var) {
        this.a = str;
        this.d = ef91Var;
    }

    public final List a(String str, op80 op80Var) {
        return Collections.singletonList(new ce91(this.a, op80Var, this.d, str));
    }

    public final List d(op80 op80Var) {
        return a(null, op80Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee91)) {
            return false;
        }
        ee91 ee91Var = (ee91) obj;
        return this.a.equals(ee91Var.a) && this.b.equals(ee91Var.b) && this.c.equals(ee91Var.c) && this.d == ee91Var.d;
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
