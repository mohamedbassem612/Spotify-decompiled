package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l790 {
    public final m790 a;
    public final Set b;

    public l790(m790 m790Var, Set set) {
        this.a = m790Var;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l790)) {
            return false;
        }
        l790 l790Var = (l790) obj;
        return this.a.equals(l790Var.a) && u890.j(this.b, l790Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
