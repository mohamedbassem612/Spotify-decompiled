package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tnq0 extends hoq0 {
    public final c560 a;
    public final String b;

    public tnq0(c560 c560Var, String str) {
        this.a = c560Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnq0)) {
            return false;
        }
        tnq0 tnq0Var = (tnq0) obj;
        return this.a.equals(tnq0Var.a) && this.b.equals(tnq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
