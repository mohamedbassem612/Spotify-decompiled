package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oed0 {
    public final ned0 a;
    public final String b;

    public oed0(ned0 ned0Var, String str) {
        this.a = ned0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oed0)) {
            return false;
        }
        oed0 oed0Var = (oed0) obj;
        return this.a.equals(oed0Var.a) && this.b.equals(oed0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
