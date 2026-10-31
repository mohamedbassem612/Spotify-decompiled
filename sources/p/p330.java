package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p330 {
    public final String a;
    public final k330 b;

    public p330(String str) {
        k330 k330Var = new k330();
        this.a = str;
        this.b = k330Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p330)) {
            return false;
        }
        p330 p330Var = (p330) obj;
        return u890.j(this.a, p330Var.a) && this.b.equals(p330Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
