package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ce71 implements de71 {
    public final hy71 a;
    public final String b;

    public ce71(hy71 hy71Var, String str) {
        this.a = hy71Var;
        this.b = str;
    }

    @Override // p.de71
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce71)) {
            return false;
        }
        ce71 ce71Var = (ce71) obj;
        return this.a.equals(ce71Var.a) && this.b.equals(ce71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
