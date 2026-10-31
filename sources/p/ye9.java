package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ye9 {
    public final xe9 a;
    public final Map b;

    public ye9(xe9 xe9Var, Map map) {
        this.a = xe9Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye9)) {
            return false;
        }
        ye9 ye9Var = (ye9) obj;
        return u890.j(this.a, ye9Var.a) && this.b.equals(ye9Var.b);
    }

    public final int hashCode() {
        xe9 xe9Var = this.a;
        return this.b.hashCode() + ((xe9Var == null ? 0 : xe9Var.hashCode()) * 31);
    }
}
