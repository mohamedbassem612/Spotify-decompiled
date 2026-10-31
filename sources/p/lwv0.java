package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lwv0 {
    public final jwv0 a;
    public final int b;

    public lwv0(jwv0 jwv0Var, int i) {
        this.a = jwv0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwv0)) {
            return false;
        }
        lwv0 lwv0Var = (lwv0) obj;
        return this.a.equals(lwv0Var.a) && this.b == lwv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
