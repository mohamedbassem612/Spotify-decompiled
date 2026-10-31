package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ytu implements auu {
    public final r6h1 a;

    public ytu(r6h1 r6h1Var) {
        this.a = r6h1Var;
    }

    public final r6h1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ytu) && u890.j(this.a, ((ytu) obj).a);
    }

    public final int hashCode() {
        r6h1 r6h1Var = this.a;
        if (r6h1Var == null) {
            return 0;
        }
        return r6h1Var.hashCode();
    }
}
