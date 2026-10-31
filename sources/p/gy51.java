package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gy51 implements hy51 {
    public final Set a;
    public final Set b;

    public gy51(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy51)) {
            return false;
        }
        gy51 gy51Var = (gy51) obj;
        return this.a.equals(gy51Var.a) && u890.j(this.b, gy51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
