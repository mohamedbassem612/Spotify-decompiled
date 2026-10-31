package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class noq0 extends toq0 {
    public final c560 a;
    public final String b;

    public noq0(c560 c560Var, String str) {
        this.a = c560Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof noq0)) {
            return false;
        }
        noq0 noq0Var = (noq0) obj;
        return this.a.equals(noq0Var.a) && this.b.equals(noq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
