package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z76 implements m86 {
    public final String a;
    public final m46 b;

    public z76(String str, m46 m46Var) {
        this.a = str;
        this.b = m46Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z76)) {
            return false;
        }
        z76 z76Var = (z76) obj;
        return this.a.equals(z76Var.a) && this.b.equals(z76Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, true);
    }
}
