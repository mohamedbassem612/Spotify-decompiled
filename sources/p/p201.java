package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p201 implements r201 {
    public final s201 a;
    public final int b;

    public p201(s201 s201Var, int i) {
        this.a = s201Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p201)) {
            return false;
        }
        p201 p201Var = (p201) obj;
        return this.a.equals(p201Var.a) && this.b == p201Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }
}
